package defpackage;

import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.tracking.impl.details.ui.model.TitleStyle;

/* loaded from: classes5.dex */
public final /* synthetic */ class e9j implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ TitleStyle c;

    public /* synthetic */ e9j(String str, TitleStyle titleStyle) {
        this.c = titleStyle;
        this.b = str;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        long E;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        TitleStyle titleStyle = this.c;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    int i2 = f9j.a[titleStyle.ordinal()];
                    if (i2 == 1) {
                        E = uh6.E(24);
                    } else if (i2 != 2) {
                        w511.b();
                        break;
                    } else {
                        E = uh6.E(20);
                    }
                    ymb1.i(this.b, null, 0L, lzr.E, null, E, 0L, 0L, 0, false, 0, null, null, btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 0, 65454);
                    break;
                }
            default:
                ((Integer) obj2).getClass();
                te91.a(this.b, titleStyle, (fid) obj, vng.O(1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ e9j(String str, TitleStyle titleStyle, int i) {
        this.b = str;
        this.c = titleStyle;
    }
}
