package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.common.ThemedColor;
import com.vk.dto.reactions.ReactionAsset;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.feed.design.view.newsfeed.reaction.FeedAnimatedView;
import com.vk.imageloader.view.VKImageView;
import com.vk.rlottie.RLottieDrawable;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: HorizontalReactionView.kt */
/* loaded from: classes4.dex */
public final class hfv extends FrameLayout implements too0, View.OnClickListener {
    public Integer b;
    public final ReactionMeta c;
    public final izs<ReactionMeta, s3q0> d;
    public final FeedAnimatedView e;
    public final View f;
    public final TextView g;

    public hfv() {
        throw null;
    }

    public hfv(FragmentActivity fragmentActivity, Integer num, ReactionMeta reactionMeta, r3h r3hVar) {
        super(fragmentActivity, null, 0);
        this.b = num;
        this.c = reactionMeta;
        this.d = r3hVar;
        float a = cn70.a() * 32.0f;
        int b = an10.b(cn70.a() * 30.0f);
        float a2 = cn70.a() * 5.0f;
        int b2 = an10.b((2 * a2) + (cn70.a() * 30.0f));
        LayoutInflater.from(fragmentActivity).inflate(R.layout.horizontal_reaction_item, this);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setBackgroundResource(R.drawable.highlight_radius_4);
        setMinimumHeight(cn70.b(Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE));
        FeedAnimatedView feedAnimatedView = (FeedAnimatedView) findViewById(R.id.reaction_animated);
        this.e = feedAnimatedView;
        VKImageView vKImageView = (VKImageView) findViewById(R.id.reaction_static);
        this.f = findViewById(R.id.reaction_background);
        TextView textView = (TextView) findViewById(R.id.reaction_name);
        this.g = textView;
        bwt0.p0(vKImageView, true);
        vKImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        vKImageView.setPlaceholderImage(R.drawable.user_placeholder);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b2, b2);
        layoutParams.gravity = 49;
        feedAnimatedView.setLayoutParams(layoutParams);
        feedAnimatedView.setAnimationSize(b2);
        feedAnimatedView.setPlaceholderImage(R.drawable.user_placeholder);
        feedAnimatedView.setSafeZoneSize(an10.b(a2));
        f4m.t(an10.b(a - a2), feedAnimatedView);
        com.vk.typography.b.k(textView, FontFamily.REGULAR, Float.valueOf(12.0f), 4);
        textView.setIncludeFontPadding(false);
        setOnClickListener(this);
        a();
        ReactionAsset d = reactionMeta.d();
        String str = d != null ? d.b : null;
        if (str == null || str.length() == 0 || !RLottieDrawable.s) {
            bwt0.p0(feedAnimatedView, false);
            bwt0.p0(vKImageView, true);
            vKImageView.load(reactionMeta.e(b));
        } else {
            bwt0.p0(vKImageView, false);
            bwt0.p0(feedAnimatedView, true);
            feedAnimatedView.e(str, true);
            feedAnimatedView.setAnimating(true);
        }
    }

    @Override // xsna.too0
    public final void Ng() {
        a();
    }

    public final void a() {
        int intValue;
        ThemedColor themedColor;
        int l;
        ThemedColor themedColor2;
        Integer num = this.b;
        ReactionMeta reactionMeta = this.c;
        boolean z = num != null && num.intValue() == reactionMeta.getId();
        if (z) {
            ReactionAsset d = reactionMeta.d();
            Integer a = (d == null || (themedColor = d.d) == null) ? null : themedColor.a(dhr0.M());
            intValue = a != null ? a.intValue() : (reactionMeta.f() <= 0 || reactionMeta.getId() != 0) ? reactionMeta.f() > 0 ? dhr0.t.c(R.attr.vk_ui_accent_orange) : reactionMeta.f() < 0 ? dhr0.t.c(R.attr.vk_ui_text_primary) : dhr0.t.c(R.attr.vk_ui_text_negative) : dhr0.t.c(R.attr.vk_ui_text_negative);
        } else {
            intValue = dhr0.t.c(R.attr.vk_ui_text_secondary);
        }
        Context context = getContext();
        if (z) {
            ReactionAsset d2 = reactionMeta.d();
            Integer a2 = (d2 == null || (themedColor2 = d2.e) == null) ? null : themedColor2.a(dhr0.M());
            int i = dhr0.M() ? 41 : 26;
            l = (a2 == null || a2.intValue() == 0) ? (reactionMeta.f() <= 0 || reactionMeta.getId() != 0) ? reactionMeta.f() > 0 ? n8g.l(dhr0.t.c(R.attr.vk_ui_accent_orange), i) : reactionMeta.f() < 0 ? n8g.l(dhr0.t.c(R.attr.vk_ui_text_primary), i) : dhr0.t.c(R.attr.vk_ui_background_secondary) : n8g.l(dhr0.t.c(R.attr.vk_ui_text_negative), i) : a2.intValue();
        } else {
            l = dhr0.t.c(R.attr.vk_ui_background_secondary);
        }
        this.f.setBackground(new d1x(context, cn70.a() * 23.0f, l, cn70.b(2), z ? intValue : 0));
        String title = reactionMeta.getTitle();
        TextView textView = this.g;
        textView.setText(title);
        textView.setTextColor(intValue);
        com.vk.typography.b.k(textView, z ? FontFamily.MEDIUM : FontFamily.REGULAR, null, 6);
        setImportantForAccessibility(1);
        setContentDescription(z ? getContext().getString(R.string.accessibility_reaction_delete_definite, reactionMeta.getTitle()) : getContext().getString(R.string.accessibility_reaction_add, reactionMeta.getTitle()));
    }

    public final izs<ReactionMeta, s3q0> getClickListener() {
        return this.d;
    }

    public final ReactionMeta getItem() {
        return this.c;
    }

    public final Integer getSelectedReactionId() {
        return this.b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (jjc.b()) {
            return;
        }
        this.d.invoke(this.c);
    }

    public final void setSelectedReactionId(Integer num) {
        this.b = num;
    }
}
