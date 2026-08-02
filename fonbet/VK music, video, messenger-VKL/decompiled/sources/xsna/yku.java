package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.miniinfo.MiniInfoCell$Mode;
import com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment;
import com.vk.ecomm.market.album.compose.EditStorefrontAlbumError;
import com.vk.video.profile.presentation.views.VideoNewProfileHeaderViewV2;
import com.vk.video.profile.presentation.views.a;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.f8t0;
import xsna.h5x;
import xsna.hbs0;
import xsna.q630;
import xsna.whg;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class yku implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yku(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        frv0 frv0Var;
        long j;
        Integer valueOf;
        String str;
        int i = this.b;
        int i2 = 7;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((zku) obj4).a((com.vk.core.compose.component.group.header.b) obj3, (androidx.compose.runtime.a) obj, ne7.I(7));
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                ((h5x.a) obj4).g((znj) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                acz.a(ne7.I(7), (androidx.compose.runtime.a) obj, (izs) obj3, (q630) obj4);
                return s3q0.a;
            case 3:
                EditStorefrontAlbumError editStorefrontAlbumError = (EditStorefrontAlbumError) obj4;
                MarketEditAlbumGoodsFragment marketEditAlbumGoodsFragment = (MarketEditAlbumGoodsFragment) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                int i3 = MarketEditAlbumGoodsFragment.c1;
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1992274093, intValue, -1, "com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment.bindErrorView.<anonymous> (MarketEditAlbumGoodsFragment.kt:424)");
                    }
                    rrv0.d(null, null, null, null, kai.c(64384952, new nz1(i2, editStorefrontAlbumError, marketEditAlbumGoodsFragment), aVar), aVar, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 4:
                ar20 ar20Var = (ar20) obj4;
                wh50 wh50Var = ar20Var.b;
                MiniInfoCell$Mode miniInfoCell$Mode = (MiniInfoCell$Mode) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-680810116, intValue2, -1, "com.vk.core.compose.component.cell.miniinfo.MiniInfoCell.Middle.Content.<anonymous>.<anonymous> (MiniInfoCell.kt:63)");
                    }
                    q630 H = cdi.H(q630.a.a, ar20Var.f);
                    if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        szw.a("invalid weight; must be greater than zero");
                    }
                    q630 g = H.g(new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false));
                    us2 us2Var = (us2) ((zak0) ar20Var.a).getValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1606542772, 48, -1, "com.vk.core.compose.component.defaults.VkMiniInfoCellDefaults.textStyle (VkMiniInfoCellDefaults.kt:26)");
                    }
                    int[] iArr = z3v0.$EnumSwitchMapping$0;
                    int i4 = iArr[miniInfoCell$Mode.ordinal()];
                    if (i4 == 1) {
                        aVar2.K(-1994340427);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                        }
                        wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        frv0Var = wuv0Var.Y;
                        aVar2.j();
                    } else if (i4 == 2) {
                        aVar2.K(-1994338667);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                        }
                        wuv0 wuv0Var2 = (wuv0) aVar2.r(rrv0.c);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        frv0Var = wuv0Var2.Y;
                        aVar2.j();
                    } else if (i4 == 3) {
                        aVar2.K(-1994337099);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                        }
                        wuv0 wuv0Var3 = (wuv0) aVar2.r(rrv0.c);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        frv0Var = wuv0Var3.Y;
                        aVar2.j();
                    } else if (i4 == 4) {
                        aVar2.K(-1994335435);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                        }
                        wuv0 wuv0Var4 = (wuv0) aVar2.r(rrv0.c);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        frv0Var = wuv0Var4.Y;
                        aVar2.j();
                    } else {
                        if (i4 != 5) {
                            throw alb0.c(-1994341851, aVar2);
                        }
                        aVar2.K(-1994333739);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                        }
                        wuv0 wuv0Var5 = (wuv0) aVar2.r(rrv0.c);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        frv0Var = wuv0Var5.O;
                        aVar2.j();
                    }
                    frv0 frv0Var2 = frv0Var;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2127461866, 48, -1, "com.vk.core.compose.component.defaults.VkMiniInfoCellDefaults.textColor (VkMiniInfoCellDefaults.kt:36)");
                    }
                    int i5 = iArr[miniInfoCell$Mode.ordinal()];
                    if (i5 == 1) {
                        aVar2.K(86424373);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var.getText().r;
                        aVar2.j();
                    } else if (i5 == 2) {
                        aVar2.K(86426229);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var2.getText().m;
                        aVar2.j();
                    } else if (i5 == 3) {
                        aVar2.K(86427890);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var3 = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var3.getText().f;
                        aVar2.j();
                    } else if (i5 == 4) {
                        aVar2.K(86429554);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var4 = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var4.getText().f;
                        aVar2.j();
                    } else {
                        if (i5 != 5) {
                            throw alb0.c(86422921, aVar2);
                        }
                        aVar2.K(86431250);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var5 = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var5.getText().f;
                        aVar2.j();
                    }
                    long j2 = j;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.d(us2Var, g, j2, 0, null, ((Boolean) ((zak0) wh50Var).getValue()).booleanValue() ? 1 : 2, false, ((Boolean) ((zak0) wh50Var).getValue()).booleanValue() ? Integer.MAX_VALUE : 1, null, null, frv0Var2, aVar2, 0, 0, 6904);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                vma0.c((String) obj4, (us2) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 6:
                ((Integer) obj2).getClass();
                ((f4k0) obj4).a(ne7.I(7), (androidx.compose.runtime.a) obj, (jai) obj3);
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                kml0.a((uvw) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 8:
                ((Integer) obj2).getClass();
                n2s0.a((xvy) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 9:
                ((Integer) obj2).getClass();
                ((hbs0) obj4).b((hbs0.a) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 10:
                f8t0.c cVar = (f8t0.c) obj4;
                VideoNewProfileHeaderViewV2 videoNewProfileHeaderViewV2 = (VideoNewProfileHeaderViewV2) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                int i6 = VideoNewProfileHeaderViewV2.y;
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(864030976, intValue3, -1, "com.vk.video.profile.presentation.views.VideoNewProfileHeaderViewV2.bindTitleBadges.<anonymous>.<anonymous> (VideoNewProfileHeaderViewV2.kt:443)");
                    }
                    boolean J = aVar3.J(cVar);
                    Object x = aVar3.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (J || x == c0012a) {
                        f8t0.c.a aVar4 = cVar.i;
                        if (aVar4 instanceof f8t0.c.a.C2854c) {
                            valueOf = null;
                        } else if (epx.f(aVar4, f8t0.c.a.C2853a.a)) {
                            valueOf = Integer.valueOf(R.string.vk_video_profile_age_mark_16);
                        } else {
                            if (!epx.f(aVar4, f8t0.c.a.b.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            valueOf = Integer.valueOf(R.string.vk_video_profile_age_mark_18);
                        }
                        x = rl3.I(new com.vk.video.profile.presentation.views.a[]{valueOf != null ? new a.b(valueOf.intValue()) : null, cVar.o ? new a.C1964a() : null});
                        aVar3.R(x);
                    }
                    List list = (List) x;
                    boolean J2 = aVar3.J(cVar);
                    Object x2 = aVar3.x();
                    if (J2 || x2 == c0012a) {
                        f8t0.c.k kVar = cVar.b;
                        f8t0.c.k.b bVar = kVar instanceof f8t0.c.k.b ? (f8t0.c.k.b) kVar : null;
                        if (bVar == null || (str = bVar.a) == null) {
                            str = "";
                        }
                        x2 = str;
                        aVar3.R(x2);
                    }
                    String str2 = (String) x2;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var6 = (wuv0) aVar3.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    vno0 vno0Var = new vno0(str2, wuv0Var6.z, list);
                    boolean y = aVar3.y(videoNewProfileHeaderViewV2);
                    Object x3 = aVar3.x();
                    if (y || x3 == c0012a) {
                        x3 = new wug0(videoNewProfileHeaderViewV2, 29);
                        aVar3.R(x3);
                    }
                    wno0.a(vno0Var, (izs) x3, null, aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            default:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj3;
                String str3 = (String) obj;
                String str4 = (String) obj2;
                yhg yhgVar = ((VoipCallServiceFragment) obj4).W;
                (yhgVar != null ? yhgVar : null).a(new whg.o(str3, true, str4));
                dw20 dw20Var = (dw20) ref$ObjectRef.element;
                if (dw20Var != null) {
                    dw20Var.tn();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ yku(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
