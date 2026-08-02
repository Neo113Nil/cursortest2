package xsna;

import android.graphics.PorterDuff;
import com.vk.clips.tool.view.component.ads.ParentDependentHeightAppCompatImageView;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.r0n;
import xsna.tlo0;

/* compiled from: DisclaimerBannerRenderDelegate.kt */
/* loaded from: classes17.dex */
public final class q0n {
    public final ParentDependentHeightAppCompatImageView a;
    public r0n b;

    public q0n(ParentDependentHeightAppCompatImageView parentDependentHeightAppCompatImageView) {
        this.a = parentDependentHeightAppCompatImageView;
    }

    public final void a(r0n r0nVar) {
        boolean z = r0nVar instanceof r0n.a;
        ParentDependentHeightAppCompatImageView parentDependentHeightAppCompatImageView = this.a;
        if (z) {
            f4m.j(parentDependentHeightAppCompatImageView);
        } else {
            if (!(r0nVar instanceof r0n.b)) {
                throw new NoWhenBranchMatchedException();
            }
            r0n.b bVar = (r0n.b) r0nVar;
            parentDependentHeightAppCompatImageView.setVisibility(0);
            if (!epx.f(this.b, bVar)) {
                float f = bVar.c;
                int i = bVar.d;
                parentDependentHeightAppCompatImageView.b = f;
                parentDependentHeightAppCompatImageView.c = iah0.a(i);
                parentDependentHeightAppCompatImageView.setContentDescription(tlo0.b.a(bVar.b, parentDependentHeightAppCompatImageView.getContext()));
                parentDependentHeightAppCompatImageView.setImageResource(bVar.a);
                parentDependentHeightAppCompatImageView.setColorFilter(krv0.m(R.attr.vk_ui_icon_medium_alpha, parentDependentHeightAppCompatImageView.getContext()), PorterDuff.Mode.SRC_IN);
            }
        }
        this.b = r0nVar;
    }
}
