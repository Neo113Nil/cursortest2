package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingOptionsDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingOptionsItemDto;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: OptionsRadioGroup.kt */
/* loaded from: classes5.dex */
public final class du80 {
    public static final void a(NotificationsNotificationSettingOptionsDto notificationsNotificationSettingOptionsDto, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(516508717);
        int i2 = i | (M.y(notificationsNotificationSettingOptionsDto) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(516508717, i2, -1, "com.vk.settings.impl.presentation.base.view.OptionsRadioGroup (OptionsRadioGroup.kt:19)");
            }
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(aVar2, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            M.K(1787869530);
            for (NotificationsNotificationSettingOptionsItemDto notificationsNotificationSettingOptionsItemDto : notificationsNotificationSettingOptionsDto.d()) {
                M.K(-410247819);
                String d = notificationsNotificationSettingOptionsItemDto.d();
                boolean f2 = epx.f(notificationsNotificationSettingOptionsItemDto.getId(), notificationsNotificationSettingOptionsDto.e());
                boolean y = ((i2 & 112) == 32) | M.y(notificationsNotificationSettingOptionsItemDto);
                Object x = M.x();
                if (y || x == a.C0011a.a) {
                    x = new pw(20, izsVar, notificationsNotificationSettingOptionsItemDto);
                    M.R(x);
                }
                afv0.b(f2, d, (gzs) x, null, null, false, M, 0, 120);
                M.j();
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new lye(i, 2, notificationsNotificationSettingOptionsDto, izsVar, q630Var2);
        }
    }
}
