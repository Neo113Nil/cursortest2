package defpackage;

import androidx.compose.animation.core.e;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes5.dex */
public final /* synthetic */ class fvb implements tls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ m3u0 x;
    public final /* synthetic */ Object y;

    public /* synthetic */ fvb(float f, yx40 yx40Var, yx40 yx40Var2, oz40 oz40Var, tx40 tx40Var) {
        this.b = f;
        this.c = yx40Var;
        this.w = yx40Var2;
        this.x = oz40Var;
        this.y = tx40Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.y;
        m3u0 m3u0Var = this.x;
        Object obj3 = this.w;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                rzx rzxVar = (rzx) obj;
                ((yx40) obj4).setIntValue((int) (rzxVar.e() >> 32));
                ((yx40) obj3).setIntValue((int) (rzxVar.e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                float intValue = r4.getIntValue() / 2.0f;
                ((oz40) m3u0Var).setValue(new wu60((Float.floatToRawIntBits(intValue) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(r5.getIntValue() / 2.0f) << 32)));
                ((tx40) obj2).setFloatValue((Math.min(r5.getIntValue(), r4.getIntValue()) / 2.0f) - (this.b / 2.0f));
                break;
            default:
                e.g((xi2) ((Ref$ObjectRef) obj4).element, ((Long) obj).longValue(), this.b, (vg2) obj3, (kj2) m3u0Var, (tls) obj2);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ fvb(Ref$ObjectRef ref$ObjectRef, float f, vg2 vg2Var, kj2 kj2Var, tls tlsVar) {
        this.c = ref$ObjectRef;
        this.b = f;
        this.w = vg2Var;
        this.x = kj2Var;
        this.y = tlsVar;
    }
}
