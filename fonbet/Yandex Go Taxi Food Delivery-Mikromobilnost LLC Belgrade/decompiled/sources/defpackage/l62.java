package defpackage;

import kotlin.jvm.internal.Ref$FloatRef;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final /* synthetic */ class l62 implements tls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ l62(float f, oz40 oz40Var, tx40 tx40Var, oz40 oz40Var2) {
        this.b = f;
        this.c = oz40Var;
        this.w = tx40Var;
        this.x = oz40Var2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.x;
        Object obj3 = this.w;
        Object obj4 = this.c;
        float f = this.b;
        switch (i) {
            case 0:
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj4;
                o62 o62Var = (o62) obj2;
                Ref$FloatRef ref$FloatRef2 = (Ref$FloatRef) obj3;
                xi2 xi2Var = (xi2) obj;
                oz40 oz40Var = xi2Var.e;
                if ((((Number) oz40Var.getValue()).floatValue() < f && ref$FloatRef.element > f) || (((Number) oz40Var.getValue()).floatValue() > f && ref$FloatRef.element < f)) {
                    float floatValue = ((Number) oz40Var.getValue()).floatValue();
                    if (f == 0.0f) {
                        f = 0.0f;
                    } else if (f <= 0.0f ? floatValue >= f : floatValue <= f) {
                        f = floatValue;
                    }
                    o62Var.a(f, ((Number) xi2Var.f()).floatValue());
                    ref$FloatRef2.element = Float.isNaN(((Number) xi2Var.f()).floatValue()) ? 0.0f : ((Number) xi2Var.f()).floatValue();
                    ref$FloatRef.element = f;
                    xi2Var.a();
                    break;
                } else {
                    o62Var.a(((Number) oz40Var.getValue()).floatValue(), ((Number) xi2Var.f()).floatValue());
                    ref$FloatRef2.element = ((Number) xi2Var.f()).floatValue();
                    ref$FloatRef.element = ((Number) oz40Var.getValue()).floatValue();
                    break;
                }
            default:
                oz40 oz40Var2 = (oz40) obj4;
                tx40 tx40Var = (tx40) obj3;
                oz40 oz40Var3 = (oz40) obj2;
                float intBitsToFloat = Float.intBitsToFloat((int) (((rzx) obj).m(0L) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                if (intBitsToFloat > f) {
                    if (((Boolean) oz40Var2.getValue()).booleanValue()) {
                        oz40Var3.setValue(Boolean.FALSE);
                        break;
                    }
                } else {
                    oz40Var2.setValue(Boolean.TRUE);
                    tx40Var.setFloatValue(intBitsToFloat);
                    break;
                }
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ l62(float f, Ref$FloatRef ref$FloatRef, o62 o62Var, Ref$FloatRef ref$FloatRef2) {
        this.b = f;
        this.c = ref$FloatRef;
        this.x = o62Var;
        this.w = ref$FloatRef2;
    }
}
