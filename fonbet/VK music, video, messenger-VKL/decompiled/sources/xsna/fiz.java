package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.text.VkText;
import com.vk.imageloader.ImageScreenSize;
import com.vk.libvideo.live.impl.views.addbutton.AddImgButtonView;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: LiveAuthorDelegate.kt */
/* loaded from: classes3.dex */
public final class fiz extends p1u0<giz> {
    public static final int d = iah0.a(40);
    public final cy0 a;
    public AddImgButtonView b;
    public lk0 c;

    public fiz(cy0 cy0Var) {
        this.a = cy0Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends giz> b(ViewGroup viewGroup) {
        ConstraintLayout constraintLayout = new ConstraintLayout(viewGroup.getContext());
        constraintLayout.setLayoutParams(new RecyclerView.p(-1, -2));
        Context context = viewGroup.getContext();
        VkText vkText = new VkText(context, null, 6, 0);
        vkText.setLayoutParams(new ConstraintLayout.b(-2, -2));
        vkText.setId(R.id.author);
        vkText.setTextAppearance(R.style.VkUiTypography_Headline1);
        e3m.a aVar = e3m.a;
        vkText.setTextColor(context.getColor(R.color.vk_gray_100));
        vkText.setText(context.getString(R.string.live_author));
        constraintLayout.addView(vkText);
        View vkAvatar = new VkAvatar(viewGroup.getContext(), null, 6, 0);
        int i = d;
        vkAvatar.setLayoutParams(new ConstraintLayout.b(i, i));
        vkAvatar.setId(R.id.avatar_image_view);
        vkAvatar.setClickable(true);
        bwt0.i0(vkAvatar, new eiz(this, 0));
        constraintLayout.addView(vkAvatar);
        Context context2 = viewGroup.getContext();
        VkText vkText2 = new VkText(context2, null, 6, 0);
        ImageScreenSize imageScreenSize = ImageScreenSize.SIZE_48DP;
        vkText2.setLayoutParams(new ConstraintLayout.b(0, imageScreenSize.h()));
        vkText2.setId(R.id.user_name);
        vkText2.setTextAppearance(R.style.VkUiTypography_Headline1Normal);
        vkText2.setTextColor(context2.getColor(R.color.vk_gray_100));
        vkText2.setEllipsize(TextUtils.TruncateAt.END);
        vkText2.setMaxLines(1);
        vkText2.setGravity(16);
        vkText2.setClickable(true);
        bwt0.i0(vkText2, new omf(this, 27));
        constraintLayout.addView(vkText2);
        AddImgButtonView addImgButtonView = new AddImgButtonView(viewGroup.getContext(), null);
        addImgButtonView.setLayoutParams(new ConstraintLayout.b(imageScreenSize.h(), imageScreenSize.h()));
        addImgButtonView.setId(R.id.subscribe_button);
        this.b = addImgButtonView;
        addImgButtonView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        addImgButtonView.setIconsTintColor(R.color.vk_sky_300);
        lk0 lk0Var = this.c;
        if (lk0Var != null) {
            addImgButtonView.setPresenter(lk0Var);
            lk0Var.R1(addImgButtonView);
            lk0Var.start();
        } else {
            f4m.j(addImgButtonView);
        }
        constraintLayout.addView(addImgButtonView);
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.i(constraintLayout);
        bVar.k(R.id.author, 6, 0, 6);
        bVar.k(R.id.author, 3, 0, 3);
        bVar.k(R.id.avatar_image_view, 6, 0, 6);
        float f = 13;
        bVar.l(R.id.avatar_image_view, 3, R.id.author, 4, iah0.a(f));
        bVar.k(R.id.avatar_image_view, 4, 0, 4);
        bVar.l(R.id.avatar_image_view, 7, R.id.user_name, 6, iah0.a(12));
        bVar.k(R.id.user_name, 6, R.id.avatar_image_view, 7);
        bVar.l(R.id.user_name, 3, R.id.author, 4, iah0.a(f));
        bVar.k(R.id.user_name, 4, 0, 4);
        bVar.k(R.id.user_name, 7, R.id.subscribe_button, 6);
        bVar.k(R.id.subscribe_button, 6, R.id.user_name, 7);
        bVar.l(R.id.subscribe_button, 3, R.id.author, 4, iah0.a(f));
        bVar.k(R.id.subscribe_button, 4, 0, 4);
        bVar.k(R.id.subscribe_button, 7, 0, 7);
        bVar.b(constraintLayout);
        return new hiz(constraintLayout);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof giz;
    }
}
