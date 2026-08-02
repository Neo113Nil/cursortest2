package xsna;

import android.view.View;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import java.util.WeakHashMap;
import xsna.m8v0;

/* compiled from: ProfileTooltipManagerImpl.kt */
/* loaded from: classes5.dex */
public final class o0e0 implements k0e0 {
    public final h7v a;
    public boolean b;

    public o0e0(h7v h7vVar, ezs0 ezs0Var) {
        this.a = h7vVar;
    }

    @Override // xsna.k0e0
    public final void a(androidx.lifecycle.m mVar, View view) {
        String id = HintId.STORIES_CREATE_ENTRY_POINT_PROFILE.getId();
        h7v h7vVar = this.a;
        Hint p = h7vVar.p(id);
        if (p != null) {
            String str = p.b;
            if (h7vVar.a(str)) {
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                if (!view.isLaidOut()) {
                    view.addOnLayoutChangeListener(new m0e0(this, view, p, mVar));
                    return;
                }
                if (h7vVar.n()) {
                    return;
                }
                h7vVar.k(view);
                String str2 = p.c;
                if (str2 == null) {
                    str2 = "";
                }
                int i = m8v0.M;
                m8v0.a.a(view, str2, null, VkTooltip$MarkerStyle.Style3, VkTooltip$MarkerSize.Size146, null, VkTooltip$BalloonPosition.Bottom, VkTooltip$BalloonTilt.Left, new u5l(view, 1), new n0e0(view), null, null, null, new ziw(this, 1), null, 0, false, mVar, null, false, null, false, 12966948);
                h7vVar.b(str);
            }
        }
    }

    @Override // xsna.k0e0
    public final boolean b(final androidx.lifecycle.m mVar, final View view, final gzs gzsVar) {
        String id = HintId.USER_PROFILE_NEW_STATISTICS.getId();
        h7v h7vVar = this.a;
        final Hint p = h7vVar.p(id);
        if (p == null || this.b || !h7vVar.a(p.b)) {
            return false;
        }
        bwt0.j(view, new izs() { // from class: xsna.l0e0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                o0e0 o0e0Var = o0e0.this;
                h7v h7vVar2 = o0e0Var.a;
                if (h7vVar2.n()) {
                    return s3q0.a;
                }
                View view2 = view;
                h7vVar2.k(view2);
                Hint hint = p;
                String str = hint.c;
                if (str == null) {
                    str = "";
                }
                int i = m8v0.M;
                VkTooltip$BalloonPosition vkTooltip$BalloonPosition = VkTooltip$BalloonPosition.BottomLeft;
                VkTooltip$BalloonTilt vkTooltip$BalloonTilt = VkTooltip$BalloonTilt.Left;
                VkTooltip$MarkerStyle vkTooltip$MarkerStyle = VkTooltip$MarkerStyle.Style1;
                VkTooltip$MarkerSize vkTooltip$MarkerSize = VkTooltip$MarkerSize.Size56;
                boolean z = dhr0.C().b;
                m8v0.a.a(view2, str, gzsVar, vkTooltip$MarkerStyle, vkTooltip$MarkerSize, null, vkTooltip$BalloonPosition, vkTooltip$BalloonTilt, new y8m(27), new vsq(25), null, null, null, new k8(29, o0e0Var, hint), null, 0, false, mVar, null, false, null, z, 7724064);
                o0e0Var.b = true;
                return s3q0.a;
            }
        });
        return true;
    }
}
