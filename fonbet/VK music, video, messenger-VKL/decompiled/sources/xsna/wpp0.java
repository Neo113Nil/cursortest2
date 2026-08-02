package xsna;

import android.view.View;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.dto.hints.Hint;
import xsna.m8v0;
import xsna.mih0;

/* compiled from: View.kt */
/* loaded from: classes17.dex */
public final class wpp0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ mih0.q b;
    public final /* synthetic */ com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.l c;
    public final /* synthetic */ View d;

    public wpp0(mih0.q qVar, com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.l lVar, View view) {
        this.b = qVar;
        this.c = lVar;
        this.d = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        if (this.b.l) {
            int i9 = m8v0.M;
            com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.l lVar = this.c;
            Hint hint = lVar.s;
            String str = hint != null ? hint.c : null;
            if (str == null) {
                str = "";
            }
            m8v0.a.a(this.d, str, null, VkTooltip$MarkerStyle.Style4, VkTooltip$MarkerSize.Size48, VkOnboarding$TintColor.Lime, VkTooltip$BalloonPosition.TopLeft, null, upp0.b, null, null, null, null, new vpp0(lVar), null, 0, true, null, null, false, null, false, 16686724);
        }
    }
}
