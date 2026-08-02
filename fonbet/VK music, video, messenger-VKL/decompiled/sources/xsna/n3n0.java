package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.Image;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: SuggestStartInterestsDialog.kt */
/* loaded from: classes16.dex */
public final class n3n0 {
    public final qhe a;
    public final no3 b;
    public final lpj c;
    public final ViewGroup d;
    public final VkButton e;
    public final VKImageView f;
    public dw20 g;
    public ez20 h;

    public n3n0(Context context, Image image, qhe qheVar, no3 no3Var) {
        this.a = qheVar;
        this.b = no3Var;
        dhr0.a.getClass();
        lpj lpjVar = new lpj(context, dhr0.u().c);
        this.c = lpjVar;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(lpjVar).inflate(R.layout.suggest_clips_interests, (ViewGroup) null);
        this.d = viewGroup;
        this.e = (VkButton) viewGroup.findViewById(R.id.clips_clips_app_grid_create_clip_button);
        this.f = (VKImageView) viewGroup.findViewById(R.id.clips_onboarding_suggest_interests_picture);
    }
}
