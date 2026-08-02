package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.text.VkText;
import com.vk.feed.tool.view.newsfeed.coauthors.CoauthorsTextLayout;
import com.vkontakte.android.R;

/* compiled from: PostCoownersCompactRepostHeaderView.kt */
/* loaded from: classes18.dex */
public final class e1c0 extends ConstraintLayout {
    public CharSequence A;
    public CharSequence B;
    public String C;
    public final View t;
    public final VkAvatar u;
    public final VkAvatar v;
    public final View w;
    public final CoauthorsTextLayout x;
    public final VkText y;
    public CharSequence z;

    public e1c0(Context context) {
        super(context, null, 0);
        View inflate = LayoutInflater.from(context).inflate(R.layout.post_coowners_compact_repost_header_view, this);
        int b = cn70.b(4);
        f4m.B(b, b, inflate);
        this.t = findViewById(R.id.post_repost_icon);
        this.u = (VkAvatar) findViewById(R.id.feed_coauthors_coauthor_photo);
        this.v = (VkAvatar) findViewById(R.id.feed_coauthors_author_photo);
        this.w = findViewById(R.id.feed_coauthors_avatars_click_area);
        CoauthorsTextLayout coauthorsTextLayout = (CoauthorsTextLayout) findViewById(R.id.text_layout);
        this.x = coauthorsTextLayout;
        this.y = (VkText) findViewById(R.id.feed_coauthors_date);
        coauthorsTextLayout.setOnTextViewsVisibilityCalculatedListener(new lva0(this, 4));
    }

    public final CharSequence getAuthorName() {
        return this.z;
    }

    public final CharSequence getCoauthorName() {
        return this.A;
    }

    public final CharSequence getCoauthorsCount() {
        return this.B;
    }

    public final String getDate() {
        return this.C;
    }

    public final void setAuthorName(CharSequence charSequence) {
        this.z = charSequence;
        this.x.setAuthorName(charSequence);
    }

    public final void setAvatarClickListener(View.OnClickListener onClickListener) {
        this.w.setOnClickListener(onClickListener);
    }

    public final void setCoauthorName(CharSequence charSequence) {
        this.A = charSequence;
        this.x.setCoauthorName(charSequence);
    }

    public final void setCoauthorsCount(CharSequence charSequence) {
        this.B = charSequence;
        this.x.setCoauthorsCount(charSequence);
    }

    public final void setCoauthorsTextClickListener(View.OnClickListener onClickListener) {
        this.x.setOnClickListener(onClickListener);
    }

    public final void setDate(String str) {
        this.C = str;
        this.y.setText(str);
    }

    public final void setDateTextColor(ColorStateList colorStateList) {
        this.y.setTextColor(colorStateList);
    }

    public final void setIconBackgroundTintList(ColorStateList colorStateList) {
        this.t.setBackgroundTintList(colorStateList);
    }
}
