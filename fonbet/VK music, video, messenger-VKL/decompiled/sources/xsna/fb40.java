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
public final class fb40 implements View.OnLayoutChangeListener {
    public final /* synthetic */ mih0.i b;
    public final /* synthetic */ com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.f c;
    public final /* synthetic */ View d;

    public fb40(mih0.i iVar, com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.f fVar, View view) {
        this.b = iVar;
        this.c = fVar;
        this.d = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        if (this.b.t) {
            int i9 = m8v0.M;
            com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.f fVar = this.c;
            Hint hint = fVar.s;
            String str = hint != null ? hint.c : null;
            if (str == null) {
                str = "";
            }
            m8v0.a.a(this.d, str, null, VkTooltip$MarkerStyle.Style4, VkTooltip$MarkerSize.Size48, VkOnboarding$TintColor.Lime, VkTooltip$BalloonPosition.TopLeft, null, db40.b, null, null, null, null, new eb40(fVar), null, 0, true, null, null, false, null, false, 16686724);
        }
    }
}
