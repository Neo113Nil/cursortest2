package xsna;

/* compiled from: CachedStateMapper.kt */
/* loaded from: classes17.dex */
public abstract class oy8<S, VS> {
    public oy8<S, VS>.a a;

    /* compiled from: CachedStateMapper.kt */
    public final class a {
        public final S a;
        public final VS b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, Object obj2) {
            this.a = obj;
            this.b = obj2;
        }
    }

    public final VS a(S s) {
        oy8<S, VS>.a aVar = this.a;
        if (aVar != null && aVar.a.equals(s)) {
            return aVar.b;
        }
        VS b = b(s);
        this.a = new a(s, b);
        return b;
    }

    public abstract VS b(S s);
}
