package defpackage;

import com.yandex.smartcamera.arscene.ArFragment;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes11.dex */
public final /* synthetic */ class dx2 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx40 b;

    public /* synthetic */ dx2(yx40 yx40Var, int i) {
        this.a = i;
        this.b = yx40Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 onCreateView$lambda$12$lambda$11$lambda$10$lambda$4$lambda$3;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        yx40 yx40Var = this.b;
        switch (i) {
            case 0:
                yx40Var.setIntValue((int) (((k6w) obj).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                break;
            case 1:
                onCreateView$lambda$12$lambda$11$lambda$10$lambda$4$lambda$3 = ArFragment.onCreateView$lambda$12$lambda$11$lambda$10$lambda$4$lambda$3(yx40Var, ((Integer) obj).intValue());
                break;
            case 2:
                if (((dry0) obj).o(0)) {
                    yx40Var.setIntValue(1);
                    break;
                }
                break;
            case 3:
                rzx rzxVar = (rzx) obj;
                if (yx40Var.getIntValue() != ((int) (rzxVar.e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) {
                    yx40Var.setIntValue((int) (rzxVar.e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                    break;
                }
                break;
            case 4:
                yx40Var.setIntValue((int) (((k6w) obj).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                break;
            case 5:
                yx40Var.setIntValue((int) (((rzx) obj).e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                break;
            case 6:
                yx40Var.setIntValue((int) (((rzx) obj).e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                break;
            case 7:
                yx40Var.setIntValue((int) (((k6w) obj).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                break;
            case 8:
                yx40Var.setIntValue((int) (((k6w) obj).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                break;
            case 9:
                yx40Var.setIntValue((int) (((k6w) obj).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                break;
            case 10:
                yx40Var.setIntValue((int) (((rzx) obj).e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                break;
            case 11:
                yx40Var.setIntValue((int) (((rzx) obj).e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                break;
            case 12:
                yx40Var.setIntValue((int) (((rzx) obj).e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                break;
            case 13:
                yx40Var.setIntValue((int) (((rzx) obj).e() >> 32));
                break;
            case 14:
                yx40Var.setIntValue((int) (((k6w) obj).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                break;
            default:
                yx40Var.setIntValue((int) (((rzx) obj).e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                break;
        }
        return zy11Var;
    }
}
