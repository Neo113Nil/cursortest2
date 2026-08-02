package xsna;

import kotlin.Pair;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.wy2;

/* compiled from: AnonymousTokenSignChainCall.kt */
/* loaded from: classes.dex */
public final class cv2<T> extends ara<T> {
    public final wy2 b;
    public final ara<T> c;

    /* JADX WARN: Multi-variable type inference failed */
    public cv2(wy2 wy2Var, ara<? extends T> araVar) {
        super(wy2Var);
        this.b = wy2Var;
        this.c = araVar;
    }

    @Override // xsna.ara
    public final T a(zqa zqaVar) {
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        wy2.a aVar = this.b.n;
        synchronized (aVar) {
            if (aVar.a) {
                try {
                    String str = aVar.b;
                    if (str == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    String str2 = (String) new ulj0(str).f(this.b);
                    if (str2 != null && str2.length() != 0) {
                        l6r0 value = this.b.a.C.getValue();
                        if (value != null) {
                            value.a(str2);
                        }
                        ref$BooleanRef.element = true;
                    }
                    s3q0 s3q0Var = s3q0.a;
                } finally {
                    aVar.a = false;
                }
            }
        }
        m63.j(m63.c(), new Pair("anon.token.signed", Boolean.valueOf(ref$BooleanRef.element)));
        return this.c.a(zqaVar);
    }
}
