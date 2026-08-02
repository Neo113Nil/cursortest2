package xsna;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.vk.imageloader.view.VKImageView;
import com.vk.voip.ui.avatars.VoipAvatarViewContainer;
import com.vkontakte.android.R;

/* compiled from: PrimaryAvatarHelper.kt */
/* loaded from: classes7.dex */
public final class h7d0 {
    public final View a;
    public final View b;
    public final VKImageView c;
    public final VoipAvatarViewContainer d;
    public final AppCompatImageView e;
    public sew0 f;
    public final Drawable g;

    public h7d0(u2x0 u2x0Var, View view) {
        this.a = view;
        this.b = view.findViewById(R.id.primary_not_video_views_container);
        VKImageView vKImageView = (VKImageView) view.findViewById(R.id.blurred_avatar_background);
        this.c = vKImageView;
        this.d = (VoipAvatarViewContainer) view.findViewById(R.id.avatar);
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.connection_status);
        this.e = appCompatImageView;
        this.g = dhr0.t.a(R.drawable.black_alpha_35_round_overlay);
        u2x0Var.f.getClass();
        mqw0 mqw0Var = mqw0.a;
        if (Boolean.TRUE.booleanValue()) {
            vKImageView.setPostprocessor(new hh7(iah0.a(20), -1895825408));
        }
        appCompatImageView.setImageDrawable(new vup0(view.getContext()));
    }

    public final void a(sew0 sew0Var, boolean z) {
        boolean f = epx.f(this.f, sew0Var);
        VoipAvatarViewContainer voipAvatarViewContainer = this.d;
        if (!f) {
            voipAvatarViewContainer.O(sew0Var);
            x59.c(this.c, sew0Var);
            this.f = sew0Var;
        }
        bwt0.p0(this.e, z);
        voipAvatarViewContainer.setupOverlay(z ? this.g : null);
    }
}
