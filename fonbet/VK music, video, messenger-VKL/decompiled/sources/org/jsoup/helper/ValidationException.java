package org.jsoup.helper;

import java.util.ArrayList;
import xsna.kir0;

/* loaded from: classes8.dex */
public class ValidationException extends IllegalArgumentException {
    public static final String b = kir0.class.getName();

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        try {
            super.fillInStackTrace();
            StackTraceElement[] stackTrace = getStackTrace();
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (!stackTraceElement.getClassName().equals(b)) {
                    arrayList.add(stackTraceElement);
                }
            }
            setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }
}
