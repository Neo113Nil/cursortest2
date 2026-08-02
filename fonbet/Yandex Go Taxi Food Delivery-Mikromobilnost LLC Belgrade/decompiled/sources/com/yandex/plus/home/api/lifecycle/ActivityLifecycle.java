package com.yandex.plus.home.api.lifecycle;

import defpackage.d40;
import defpackage.k4o;
import defpackage.w511;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

/* loaded from: classes8.dex */
public class ActivityLifecycle {
    public final ReentrantLock a = new ReentrantLock();
    public final Set b = Collections.synchronizedSet(new LinkedHashSet());
    public LifecycleState c = LifecycleState.UNDEFINED;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0084\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/plus/home/api/lifecycle/ActivityLifecycle$LifecycleState;", "", "CREATED", "STARTED", "PAUSED", "RESUMED", "STOPPED", "DESTROYED", "UNDEFINED", "plus-core-common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LifecycleState {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ LifecycleState[] $VALUES;
        public static final LifecycleState CREATED;
        public static final LifecycleState DESTROYED;
        public static final LifecycleState PAUSED;
        public static final LifecycleState RESUMED;
        public static final LifecycleState STARTED;
        public static final LifecycleState STOPPED;
        public static final LifecycleState UNDEFINED;

        static {
            LifecycleState lifecycleState = new LifecycleState("CREATED", 0);
            CREATED = lifecycleState;
            LifecycleState lifecycleState2 = new LifecycleState("STARTED", 1);
            STARTED = lifecycleState2;
            LifecycleState lifecycleState3 = new LifecycleState("PAUSED", 2);
            PAUSED = lifecycleState3;
            LifecycleState lifecycleState4 = new LifecycleState("RESUMED", 3);
            RESUMED = lifecycleState4;
            LifecycleState lifecycleState5 = new LifecycleState("STOPPED", 4);
            STOPPED = lifecycleState5;
            LifecycleState lifecycleState6 = new LifecycleState("DESTROYED", 5);
            DESTROYED = lifecycleState6;
            LifecycleState lifecycleState7 = new LifecycleState("UNDEFINED", 6);
            UNDEFINED = lifecycleState7;
            LifecycleState[] lifecycleStateArr = {lifecycleState, lifecycleState2, lifecycleState3, lifecycleState4, lifecycleState5, lifecycleState6, lifecycleState7};
            $VALUES = lifecycleStateArr;
            $ENTRIES = kotlin.enums.a.a(lifecycleStateArr);
        }

        public static LifecycleState valueOf(String str) {
            return (LifecycleState) Enum.valueOf(LifecycleState.class, str);
        }

        public static LifecycleState[] values() {
            return (LifecycleState[]) $VALUES.clone();
        }
    }

    public static void c(d40 d40Var, LifecycleState lifecycleState) {
        switch (a.a[lifecycleState.ordinal()]) {
            case 1:
                d40Var.onStart();
                d40Var.a();
                break;
            case 2:
                d40Var.onStop();
                break;
            case 3:
                d40Var.onResume();
                break;
            case 4:
                d40Var.onPause();
                break;
            case 5:
                d40Var.getClass();
                d40Var.b();
                break;
            case 6:
                d40Var.onDestroy();
                break;
            case 7:
                break;
            default:
                w511.b();
                break;
        }
    }

    public void a(d40 d40Var) {
        this.b.add(d40Var);
        int i = a.a[this.c.ordinal()];
        if (i == 1 || i == 2) {
            d40Var.b();
        } else if (i == 3 || i == 4) {
            d40Var.b();
            d40Var.a();
        }
        c(d40Var, this.c);
    }

    public final void b(LifecycleState lifecycleState) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            this.c = lifecycleState;
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                c((d40) it.next(), this.c);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public void d(d40 d40Var) {
        this.b.remove(d40Var);
    }
}
