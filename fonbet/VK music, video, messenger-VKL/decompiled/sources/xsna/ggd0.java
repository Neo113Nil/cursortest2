package xsna;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.user.SocialButtonType;
import com.vk.dto.user.UserProfile;
import com.vk.profile.user.impl.ui.adapter.MergeMode;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.R;

/* compiled from: PrivateUserProfileContentViewHolder.kt */
/* loaded from: classes5.dex */
public final class ggd0 extends dri<UserProfileAdapterItem.o> {
    public static final a r = new a();
    public final boolean n;
    public final wh50 o;
    public final wh50 p;
    public final wh50 q;

    /* compiled from: PrivateUserProfileContentViewHolder.kt */
    public static final class a extends eri<ggd0> {
        @Override // xsna.eri
        public final dri a(ComposeView composeView, slq0 slq0Var, zuq0 zuq0Var) {
            return new ggd0(composeView);
        }
    }

    public ggd0(ComposeView composeView) {
        super(composeView);
        ComFeatures comFeatures = ComFeatures.COM_PROFILE_SUBSCRIBE;
        comFeatures.getClass();
        this.n = com.vk.toggle.b.A.a(comFeatures);
        this.o = androidx.compose.runtime.k.b("");
        this.p = androidx.compose.runtime.k.b("");
        this.q = androidx.compose.runtime.k.b(MergeMode.Default);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.vif0
    public final void i6(Object obj) {
        UserProfileAdapterItem.o oVar = (UserProfileAdapterItem.o) obj;
        Context context = this.itemView.getContext();
        UserProfile userProfile = oVar.c;
        String n = userProfile.n();
        Bundle bundle = userProfile.s;
        ((zak0) this.o).setValue(context.getString(R.string.item_private_user_content_title, n));
        ((zak0) this.p).setValue((userProfile.e0 == SocialButtonType.FOLLOW || this.n) ? userProfile.v == 1 ? ((UserProfileAdapterItem.o) this.m).c.K().booleanValue() ? this.itemView.getContext().getString(R.string.item_followed_private_user_content_subtitle_female, userProfile.n()) : this.itemView.getContext().getString(R.string.item_followed_private_user_content_subtitle, userProfile.n()) : ((UserProfileAdapterItem.o) this.m).c.K().booleanValue() ? this.itemView.getContext().getString(R.string.item_private_user_with_follow_button_content_subtitle_female, bundle.getString("first_name_acc")) : this.itemView.getContext().getString(R.string.item_private_user_with_follow_button_content_subtitle, bundle.getString("first_name_acc")) : ((UserProfileAdapterItem.o) this.m).c.K().booleanValue() ? this.itemView.getContext().getString(R.string.item_private_user_content_subtitle_female) : this.itemView.getContext().getString(R.string.item_private_user_content_subtitle));
        ((zak0) this.q).setValue(oVar.b);
    }

    @Override // xsna.dri
    public final void q6(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1623443704);
        int i2 = (M.y(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 17) != 16)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1623443704, i2, -1, "com.vk.profile.user.impl.ui.adapter.holders.PrivateUserProfileContentViewHolder.Content (PrivateUserProfileContentViewHolder.kt:37)");
            }
            uog0 O = znk0.O((MergeMode) ((zak0) this.q).getValue());
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            phu0.a(null, O, ylu0Var.getBackground().g, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(859917312, new te1(this, 8), M), M, 1572864, 57);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new v95(this, i, 11);
        }
    }
}
