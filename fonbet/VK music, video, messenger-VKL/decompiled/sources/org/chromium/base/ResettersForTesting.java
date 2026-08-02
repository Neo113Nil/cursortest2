package org.chromium.base;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes8.dex */
public class ResettersForTesting {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static LinkedHashSet<Runnable> sClassResetters;
    private static boolean sIsFlushing;
    private static final Object sLock = new Object();
    private static LinkedHashSet<Runnable> sMethodResetters;
    private static int sState;

    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
        public static final int BETWEEN_CLASSES = 1;
        public static final int BETWEEN_METHODS = 3;
        public static final int CLASS_SCOPED = 2;
        public static final int METHOD_SCOPED = 4;
        public static final int NOT_ENABLED = 0;
    }

    public static void afterClassHooksDidExecute() {
        synchronized (sLock) {
            sState = 1;
            flushResetters(sMethodResetters);
            flushResetters(sClassResetters);
        }
    }

    public static void afterHooksDidExecute() {
        synchronized (sLock) {
            sState = 3;
            flushResetters(sMethodResetters);
        }
    }

    public static void beforeClassHooksWillExecute() {
        synchronized (sLock) {
            sState = 2;
            flushResetters(sClassResetters);
        }
    }

    public static void beforeHooksWillExecute() {
        synchronized (sLock) {
            sState = 4;
            flushResetters(sMethodResetters);
        }
    }

    public static void enable() {
        synchronized (sLock) {
            sState = 1;
            sMethodResetters = new LinkedHashSet<>();
            sClassResetters = new LinkedHashSet<>();
        }
    }

    private static void flushResetters(LinkedHashSet<Runnable> linkedHashSet) {
        ArrayList arrayList = new ArrayList(linkedHashSet);
        linkedHashSet.clear();
        Collections.reverse(arrayList);
        sIsFlushing = true;
        Iterator it = arrayList.iterator();
        Throwable th = null;
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
        }
        sIsFlushing = false;
        if (th != null) {
            throw new RuntimeException(th);
        }
    }

    public static int getState() {
        int i;
        synchronized (sLock) {
            i = sState;
        }
        return i;
    }

    public static void register(Runnable runnable) {
    }
}
