package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.tool.view.FluidHorizontalLayout;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;

/* compiled from: VkFeedRepostHeaderView.kt */
/* loaded from: classes18.dex */
public final class hvu0 extends FrameLayout {
    public final VkAvatar b;
    public final FluidHorizontalLayout c;
    public final VkText d;
    public final VkText e;
    public final VkImageSimple f;
    public final VkImageSimple g;
    public a h;

    /* compiled from: VkFeedRepostHeaderView.kt */
    public interface a {
        void a();

        void b();

        void c();
    }

    public hvu0(Context context) {
        super(context, null, 0);
        setImportantForAccessibility(2);
        setPadding(cn70.b(16), 0, cn70.b(16), 0);
        LayoutInflater.from(context).inflate(R.layout.pds_repost_header, (ViewGroup) this, true);
        this.b = (VkAvatar) findViewById(R.id.post_repost_photo);
        this.c = (FluidHorizontalLayout) findViewById(R.id.post_repost_open_btn);
        this.d = (VkText) findViewById(R.id.post_repost_name);
        this.e = (VkText) findViewById(R.id.post_repost_date);
        this.f = (VkImageSimple) findViewById(R.id.post_repost_icon);
        this.g = (VkImageSimple) findViewById(R.id.post_repost_verify_icon);
    }

    public final int getPhotoWidth() {
        return this.b.getWidth();
    }

    public final void setButtonContentDescription(CharSequence charSequence) {
        this.c.setContentDescription(charSequence);
    }

    public final void setDate(CharSequence charSequence) {
        this.e.setText(charSequence);
    }

    public final void setDateViewIsVisible(boolean z) {
        bwt0.p0(this.e, z);
    }

    public final void setListener(a aVar) {
        this.h = aVar;
    }

    public final void setName(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public final void setOnButtonClickListener(View.OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }

    public final void setOnPhotoClickListener(View.OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
    }

    public final void setOnVerifyIconClickListener(View.OnClickListener onClickListener) {
        this.g.setOnClickListener(onClickListener);
    }

    public final void setPhotoBackgroundImage(Drawable drawable) {
        this.b.setBackgroundImage(drawable);
    }

    public final void setPhotoEmptyImagePlaceholder(Drawable drawable) {
        this.b.setEmptyImagePlaceholder(drawable);
    }

    public final void setPhotoPlaceholderImage(int i) {
        this.b.setPlaceholderImage(i);
    }
}
