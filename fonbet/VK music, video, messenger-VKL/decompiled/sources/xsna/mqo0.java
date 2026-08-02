package xsna;

/* compiled from: ThreadContext.kt */
/* loaded from: classes11.dex */
public final class mqo0 {
    public static final con0 a = new con0("NO_THREAD_ELEMENTS");
    public static final lqo0 b = new lqo0();
    public static final uq1 c = new uq1(1);
    public static final w240 d = new w240(1);

    public static final void a(kotlin.coroutines.d dVar, Object obj) {
        if (obj == a) {
            return;
        }
        if (obj instanceof lro0) {
            ((lro0) obj).b(dVar);
        } else {
            ((kqo0) dVar.fold(null, c)).j(obj);
        }
    }

    public static final Object b(kotlin.coroutines.d dVar, Object obj) {
        if (obj == null) {
            obj = dVar.fold(0, b);
        }
        return obj == 0 ? a : obj instanceof Integer ? dVar.fold(new lro0(((Number) obj).intValue(), dVar), d) : ((kqo0) obj).O(dVar);
    }
}
