package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.vk.core.view.components.picture.VkImage;
import com.vkontakte.android.R;
import xsna.dek0;
import xsna.lym;

/* compiled from: DigestSpotlightView.kt */
/* loaded from: classes18.dex */
public final class tym extends lym {
    public final VkImage o;

    public tym(Context context) {
        super(context);
        VkImage vkImage = new VkImage(context, null, 6, 0);
        vkImage.setId(R.id.digest_cover_photo);
        vkImage.setAspectRatio(2.19375f);
        vkImage.setPlaceholderImage(R.drawable.placeholder_radius_8);
        vkImage.setCornerRadius(cn70.a() * 8.0f);
        this.o = vkImage;
        int i = dek0.a;
        dek0.b(vkImage, null, new dek0.a(cn70.a() * 8.0f, false), 2);
        lym.a aVar = new lym.a(-1, -2);
        ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = cn70.b(12);
        s3q0 s3q0Var = s3q0.a;
        addView(vkImage, 0, aVar);
        getOverlayView().setVisibility(8);
        getAttachThumb().setVisibility(8);
        f4m.y(0, this);
    }

    public final VkImage getCoverView() {
        return this.o;
    }

    @Override // xsna.lym, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        VkImage vkImage = this.o;
        if (vkImage.getVisibility() != 8) {
            i3 = i;
            i4 = i2;
            measureChildWithMargins(vkImage, i3, 0, i4, 0);
            ViewParent parent = vkImage.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            int i5 = dek0.a;
            if (dek0.a(vkImage) && viewGroup != null) {
                measureChildWithMargins(viewGroup, i3, 0, i4, 0);
            }
            int measuredHeight = vkImage.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams = vkImage.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int i6 = measuredHeight + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
            ViewGroup.LayoutParams layoutParams2 = vkImage.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            r6 = (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0) + i6;
        } else {
            i3 = i;
            i4 = i2;
        }
        super.onMeasure(i3, i4);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight() + r6);
    }
}
