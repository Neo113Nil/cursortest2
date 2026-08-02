package xsna;

import kotlin.jvm.internal.Ref$FloatRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class zo5 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Ref$FloatRef c;
    public final /* synthetic */ ggh0 d;

    public /* synthetic */ zo5(Ref$FloatRef ref$FloatRef, ggh0 ggh0Var, int i) {
        this.b = i;
        this.c = ref$FloatRef;
        this.d = ggh0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        float floatValue = ((Float) obj).floatValue();
        ((Float) obj2).floatValue();
        switch (i) {
            case 0:
                Ref$FloatRef ref$FloatRef = this.c;
                float f = ref$FloatRef.element;
                ref$FloatRef.element = this.d.f(floatValue - f) + f;
                break;
            default:
                Ref$FloatRef ref$FloatRef2 = this.c;
                float f2 = ref$FloatRef2.element;
                ref$FloatRef2.element = this.d.f(floatValue - f2) + f2;
                break;
        }
        return s3q0.a;
    }
}
