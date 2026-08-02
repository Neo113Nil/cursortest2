package defpackage;

import androidx.compose.ui.tooling.PreviewActivity;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.favorites.address.impl.ui.a;

/* loaded from: classes11.dex */
public final /* synthetic */ class kq5 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ kq5(String str, String str2, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        zy11 composableContent$lambda$1;
        int i = this.a;
        String str = this.c;
        String str2 = this.b;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                sq5.j(str2, str, (fid) obj, vng.O(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                oy91.d(str2, str, (fid) obj, vng.O(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                a.a(str2, str, (fid) obj, vng.O(1));
                break;
            case 3:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    web1.e(null, null, null, this.b, null, 0L, null, null, null, 0, false, 1, null, this.c, null, null, null, null, false, 0L, 0, false, 1, false, null, false, btsVar, 0, 384, HProv.ALG_CLASS_DATA_ENCRYPT, 251621367);
                    break;
                }
            case 4:
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    if (str2.length() > 0) {
                        btsVar2.e0(892294167);
                        wqy0.b(this.c, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((zm51) btsVar2.m(an51.a)).g, btsVar2, 0, 0, 65534);
                    } else {
                        btsVar2.e0(1891372102);
                    }
                    btsVar2.t(false);
                    break;
                }
            case 5:
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    btsVar3.Y();
                    break;
                } else {
                    if (str2.length() == 0) {
                        btsVar3.e0(1155991096);
                        wqy0.b(this.c, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((zm51) btsVar3.m(an51.a)).g, btsVar3, 0, 0, 65534);
                    } else {
                        btsVar3.e0(1476042309);
                    }
                    btsVar3.t(false);
                    break;
                }
            case 6:
                fid fidVar4 = (fid) obj;
                int intValue4 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (!btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                    btsVar4.Y();
                    break;
                } else {
                    web1.e(null, null, null, this.b, null, 0L, lzr.G, null, new sty0(uh6.E(16)), 0, false, Integer.MAX_VALUE, null, this.c, null, null, null, null, false, 0L, 0, false, Integer.MAX_VALUE, false, null, false, btsVar4, 817889280, 384, HProv.ALG_CLASS_DATA_ENCRYPT, 251620727);
                    break;
                }
            case 7:
                ((Integer) obj2).getClass();
                rmb1.a(str2, str, (fid) obj, vng.O(1));
                break;
            case 8:
                fid fidVar5 = (fid) obj;
                int intValue5 = ((Integer) obj2).intValue();
                bts btsVar5 = (bts) fidVar5;
                if (!btsVar5.V(intValue5 & 1, (intValue5 & 3) != 2)) {
                    btsVar5.Y();
                    break;
                } else {
                    yqb1.e(this.b, null, null, xya1.e(btsVar5).g.b, 0, 0, this.c, AppColor$Palette.TextMinor, null, 0, 0, btsVar5, 12582912, 1846);
                    break;
                }
            case 9:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.logistics.sdk.tracking.impl.order_cancel_clarification.a.d(str2, str, (fid) obj, vng.O(7));
                break;
            case 10:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.logistics.sdk.payment_method_selector.ui.a.e(str2, str, (fid) obj, vng.O(1));
                break;
            case 11:
                composableContent$lambda$1 = PreviewActivity.setComposableContent$lambda$1(str2, str, (fid) obj, ((Integer) obj2).intValue());
                break;
            case 12:
                ((Integer) obj2).getClass();
                qza1.a(str2, str, (fid) obj, vng.O(1));
                break;
            default:
                ((Integer) obj2).getClass();
                hqb1.c(str2, str, (fid) obj, vng.O(1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ kq5(String str, String str2, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = str2;
    }
}
