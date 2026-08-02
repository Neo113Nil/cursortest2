package xsna;

import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: ExceptionExt.kt */
/* loaded from: classes3.dex */
public final class o1q {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.Throwable] */
    public static final Throwable a() {
        try {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
                Thread key = entry.getKey();
                StackTraceElement[] value = entry.getValue();
                ?? th = new Throwable(key.getName() + " (state=" + key.getState() + ", pid=" + key.getId() + ')', (Throwable) ref$ObjectRef.element);
                th.setStackTrace(value);
                ref$ObjectRef.element = th;
            }
            return (Throwable) ref$ObjectRef.element;
        } catch (Throwable unused) {
            return null;
        }
    }
}
