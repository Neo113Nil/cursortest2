package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingOptionsDto;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.f;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.me70;
import xsna.phw;
import xsna.q630;

/* compiled from: LazyDsl.kt */
/* loaded from: classes5.dex */
public final class bf70 implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ List b;
    public final /* synthetic */ List c;
    public final /* synthetic */ izs d;

    public bf70(List list, List list2, izs izsVar) {
        this.b = list;
        this.c = list2;
        this.d = izsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x03db  */
    @Override // xsna.zzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s3q0 invoke(ksy ksyVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
        int i;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a aVar3;
        String str;
        ImageSize Cb;
        ksy ksyVar2 = ksyVar;
        int intValue = num.intValue();
        androidx.compose.runtime.a aVar4 = aVar;
        int intValue2 = num2.intValue();
        if ((intValue2 & 6) == 0) {
            i = (aVar4.J(ksyVar2) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= aVar4.o(intValue) ? 32 : 16;
        }
        if (aVar4.t(i & 1, (i & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(802480018, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            me70 me70Var = (me70) this.b.get(intValue);
            aVar4.K(-1778438437);
            if (me70Var instanceof me70.a) {
                aVar4.K(2020839402);
                aVar2 = aVar4;
                wju.a(0, 1, aVar2, ((me70.a) me70Var).b, null, true);
                aVar2.j();
            } else {
                aVar2 = aVar4;
                if (me70Var instanceof me70.f) {
                    aVar2.K(2020850875);
                    ue70.c((me70.f) me70Var, aVar2, 0);
                    aVar2.j();
                } else {
                    boolean z = me70Var instanceof me70.g;
                    izs izsVar = this.d;
                    if (z) {
                        aVar2.K(2020854200);
                        ue70.d((me70.g) me70Var, izsVar, aVar2, 0);
                        aVar2.j();
                    } else {
                        boolean z2 = me70Var instanceof me70.h;
                        q630.a aVar5 = q630.a.a;
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        if (z2) {
                            aVar2.K(-1777853096);
                            me70.h hVar = (me70.h) me70Var;
                            boolean z3 = hVar.a;
                            boolean z4 = hVar.b;
                            plg0 plg0Var = new plg0(2);
                            boolean J = aVar2.J(izsVar);
                            Object x = aVar2.x();
                            if (J || x == c0012a) {
                                x = new ve70(izsVar);
                                aVar2.R(x);
                            }
                            q630 a = d1p0.a(aVar5, z3, z4, plg0Var, (izs) x, 8);
                            Object x2 = aVar2.x();
                            if (x2 == c0012a) {
                                x2 = koh.d;
                                aVar2.R(x2);
                            }
                            wiu0.b(egi0.b(a, true, (izs) x2), hVar.b, null, Cell$Middle.a.a(Cell$Middle.d.b.a(d370.N(R.string.notification_status_toggle_sound_push, 0, aVar2), null, null, 0, null, null, aVar2, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, aVar2, 196608, 30), com.vk.core.compose.component.cell.content.n.a(hVar.a, null, hVar.b, null, aVar2, 24576, 10), null, null, aVar2, 0, 100);
                            aVar3 = aVar2;
                            aVar3.j();
                        } else {
                            aVar3 = aVar2;
                            if (me70Var instanceof me70.i) {
                                aVar3.K(-1777176459);
                                String N = d370.N(((me70.i) me70Var).a, 0, aVar3);
                                b.d dVar = b.d.a;
                                boolean J2 = aVar3.J(N);
                                Object x3 = aVar3.x();
                                if (J2 || x3 == c0012a) {
                                    x3 = new pzi(N, 3);
                                    aVar3.R(x3);
                                }
                                com.vk.core.compose.component.group.header.g.b(f.a.a(N, null, null, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), null, false, aVar3, 805306368, 446), null, dVar, null, null, null, false, aVar3, 384, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
                                aVar3 = aVar3;
                                aVar3.j();
                            } else if (me70Var instanceof me70.k) {
                                aVar3.K(2020903197);
                                NotificationsNotificationSettingOptionsDto notificationsNotificationSettingOptionsDto = ((me70.k) me70Var).a;
                                boolean J3 = aVar3.J(izsVar);
                                Object x4 = aVar3.x();
                                if (J3 || x4 == c0012a) {
                                    x4 = new we70(izsVar);
                                    aVar3.R(x4);
                                }
                                du80.a(notificationsNotificationSettingOptionsDto, (izs) x4, null, aVar3, 0);
                                aVar3.j();
                            } else if (me70Var instanceof me70.l) {
                                aVar3.K(2020910301);
                                NotificationsNotificationSettingOptionsDto notificationsNotificationSettingOptionsDto2 = ((me70.l) me70Var).a;
                                boolean J4 = aVar3.J(izsVar);
                                Object x5 = aVar3.x();
                                if (J4 || x5 == c0012a) {
                                    x5 = new xe70(izsVar);
                                    aVar3.R(x5);
                                }
                                du80.a(notificationsNotificationSettingOptionsDto2, (izs) x5, null, aVar3, 0);
                                aVar3.j();
                            } else if (me70Var instanceof me70.c) {
                                aVar3.K(2020916553);
                                ue70.a((me70.c) me70Var, izsVar, aVar3, 0);
                                aVar3.j();
                            } else if (me70Var instanceof me70.d) {
                                aVar3.K(2020919937);
                                ue70.b((me70.d) me70Var, izsVar, aVar3, 0);
                                aVar3.j();
                            } else if (me70Var instanceof me70.e) {
                                aVar3.K(2020924732);
                                me70.e eVar = (me70.e) me70Var;
                                Image image = eVar.c;
                                if (image == null || (Cb = image.Cb(iah0.a(48), true, false)) == null || (str = Cb.d.d) == null) {
                                    str = "";
                                }
                                com.vk.core.compose.component.cell.content.t a2 = com.vk.core.compose.component.cell.content.e.a(phw.a.a(fwu0.l(str, null, null, null, aVar3, 0, 62), null, null, null, null, aVar3, 196616, 30), Cell$Left.Main.Size.Small, null, null, null, null, null, aVar3, 100663344, 252);
                                com.vk.core.compose.component.cell.content.k0 a3 = Cell$Middle.a.a(Cell$Middle.d.b.a(eVar.b, null, null, 0, null, null, aVar3, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, aVar3, 196608, 30);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1243383292, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel24> (VkSdkIcons.kt:226)");
                                }
                                lg90 b = or.b(aVar3, 1833859693, R.drawable.vk_icon_cancel_24, aVar3, 0);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                long j = ylu0Var.getIcon().l;
                                String N2 = d370.N(R.string.accessibility_delete, 0, aVar3);
                                boolean J5 = aVar3.J(izsVar) | aVar3.J(me70Var);
                                Object x6 = aVar3.x();
                                if (J5 || x6 == c0012a) {
                                    x6 = new ye70(izsVar, (me70.e) me70Var);
                                    aVar3.R(x6);
                                }
                                wiu0.b(null, false, a2, a3, com.vk.core.compose.component.cell.content.p.a(b, j, 0L, N2, (gzs) x6, null, aVar3, 1572872, 36), null, null, aVar3, 0, 99);
                                aVar3 = aVar3;
                                aVar3.j();
                            } else {
                                if (!epx.f(me70Var, me70.j.a)) {
                                    if (!(me70Var instanceof me70.b)) {
                                        throw alb0.c(2020841000, aVar3);
                                    }
                                    aVar3.K(-1774141404);
                                    throw null;
                                }
                                aVar3.K(2020956967);
                                q630 f = txj0.f(aVar5, 1.0f);
                                dt1.a.getClass();
                                cp10 d = ja8.d(dt1.a.f, false);
                                int hashCode = Long.hashCode(n34.n(aVar3));
                                sy90 D = aVar3.D();
                                q630 c = qri.c(aVar3, f);
                                cri.h7.getClass();
                                LayoutNode.a aVar6 = cri.a.b;
                                if (aVar3.N() == null) {
                                    n34.r();
                                    throw null;
                                }
                                aVar3.H();
                                if (aVar3.L()) {
                                    aVar3.I(aVar6);
                                } else {
                                    aVar3.f();
                                }
                                k9q0.w(aVar3, d, cri.a.f);
                                k9q0.w(aVar3, D, cri.a.e);
                                k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                                k9q0.t(aVar3, cri.a.h);
                                k9q0.w(aVar3, c, cri.a.d);
                                aVar3.K(1735105361);
                                q630 q = txj0.q(aVar5, 48);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var2 = (ylu0) aVar3.r(rrv0.a);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                mku0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 28, ylu0Var2.getIcon().f, aVar3, q);
                                aVar3 = aVar3;
                                aVar3.j();
                                aVar3.G();
                                aVar3.j();
                            }
                        }
                        aVar3.j();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    }
                }
            }
            aVar3 = aVar2;
            aVar3.j();
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            aVar4.h();
        }
        return s3q0.a;
    }
}
