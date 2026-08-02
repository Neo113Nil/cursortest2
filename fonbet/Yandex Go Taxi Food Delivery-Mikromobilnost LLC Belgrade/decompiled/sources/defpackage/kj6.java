package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import kotlin.collections.b;

/* loaded from: classes12.dex */
public final /* synthetic */ class kj6 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ kj6(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        au2 a;
        aa10 w;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        boolean z = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    btsVar.Y();
                    break;
                } else if (!z) {
                    btsVar.e0(-43628065);
                    btsVar.t(false);
                    break;
                } else {
                    btsVar.e0(-43790722);
                    sya1.a(llb1.b(), an91.o(c530.a, 0.0f, 0.0f, 8.0f, 0.0f, 11), null, AppColor$Palette.Text, btsVar, 3120, 4);
                    btsVar.t(false);
                    break;
                }
            case 1:
                ibp0 ibp0Var = (ibp0) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                }
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                    btsVar2.Y();
                    break;
                } else {
                    if (z) {
                        a = ulb1.a;
                        if (a == null) {
                            lgv lgvVar = new lgv("ChevronUpM", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                            a6t0 a6t0Var = new a6t0(zp2.d);
                            a6t0 a6t0Var2 = new a6t0(iq2.g);
                            uq90 g = tse0.g(7.5f, 14.5f, 12.0f, 10.0f);
                            g.i(4.5f, 4.5f);
                            lgvVar.b(1.0f, 1.0f, 1.75f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 2, 0, a6t0Var, a6t0Var2, "", g.a);
                            a = rya1.a(lgvVar.d(), true);
                            ulb1.a = a;
                        }
                    } else {
                        a = ilb1.a();
                    }
                    zrb1.a(ibp0Var, a, null, null, btsVar2, intValue2 & 14, 14);
                    break;
                }
            case 2:
                k kVar = (k) obj;
                n8e n8eVar = (n8e) obj3;
                o l0 = ((x910) obj2).l0(n8e.b(0, n8eVar.a, 0, 0, Integer.MAX_VALUE, 7));
                int i2 = l0.b;
                long j = n8eVar.a;
                int d = y6i0.d(i2, n8e.j(j), n8e.h(j));
                w = kVar.w(l0.a, d, b.f(), new l4p(l0, z ? 0 : d - l0.b, 0));
                break;
            case 3:
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                    btsVar3.Y();
                    break;
                } else if (!z) {
                    btsVar3.e0(1023276135);
                    sya1.a(hgb1.b(), null, null, null, btsVar3, 384, 10);
                    btsVar3.t(false);
                    break;
                } else {
                    btsVar3.e0(1023184809);
                    sya1.a(mta1.f(), null, null, null, btsVar3, 384, 10);
                    btsVar3.t(false);
                    break;
                }
            case 4:
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (!btsVar4.V(intValue4 & 1, (intValue4 & 17) != 16)) {
                    btsVar4.Y();
                    break;
                } else {
                    zob1.b(null, z, btsVar4, 48);
                    break;
                }
            case 5:
                ebp0 ebp0Var = (ebp0) obj;
                fid fidVar5 = (fid) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((bts) fidVar5).k(ebp0Var) ? 4 : 2;
                }
                bts btsVar5 = (bts) fidVar5;
                if (!btsVar5.V(intValue5 & 1, (intValue5 & 19) != 18)) {
                    btsVar5.Y();
                    break;
                } else {
                    v9b1.a(ebp0Var, wwg.S(2130858596, true, new w240(ebp0Var, r9 ? 1 : 0), btsVar5), wwg.S(-909326683, true, new uge(ebp0Var, z, 7), btsVar5), null, 0.0f, null, null, btsVar5, (intValue5 & 14) | 432);
                    break;
                }
            case 6:
                ibp0 ibp0Var2 = (ibp0) obj;
                fid fidVar6 = (fid) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((bts) fidVar6).k(ibp0Var2) ? 4 : 2;
                }
                bts btsVar6 = (bts) fidVar6;
                if (!btsVar6.V(intValue6 & 1, (intValue6 & 19) != 18)) {
                    btsVar6.Y();
                    break;
                } else {
                    wfa1.a(this.b, an91.o(c530.a, 8.0f, 0.0f, ibp0Var2.c() == SlotSize.XS ? 4.0f : 16.0f, 0.0f, 10), null, null, true, btsVar6, 0, 4);
                    break;
                }
            default:
                fid fidVar7 = (fid) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                bts btsVar7 = (bts) fidVar7;
                if (!btsVar7.V(intValue7 & 1, (intValue7 & 17) != 16)) {
                    btsVar7.Y();
                    break;
                } else if (!z) {
                    btsVar7.e0(-806003256);
                    btsVar7.t(false);
                    break;
                } else {
                    btsVar7.e0(-806163743);
                    sya1.a(w2b1.d(), null, null, AppColor$Palette.TextMinor, btsVar7, 3456, 2);
                    btsVar7.t(false);
                    break;
                }
        }
        return zy11Var;
    }
}
