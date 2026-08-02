package xsna;

import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class jad0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Ref$ObjectRef c;

    public /* synthetic */ jad0(Ref$ObjectRef ref$ObjectRef, int i) {
        this.b = i;
        this.c = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, xsna.s940] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Ref$ObjectRef ref$ObjectRef = this.c;
                s940 s940Var = (s940) ref$ObjectRef.element;
                i7z i7zVar = s940Var.a;
                ref$ObjectRef.element = new s940(new i7z(i7zVar.a, i7zVar.b - ((List) obj).size(), i7zVar.c), s940Var.b);
                return Boolean.valueOf(!r8.isEmpty());
            default:
                dw20 dw20Var = (dw20) this.c.element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
        }
    }
}
