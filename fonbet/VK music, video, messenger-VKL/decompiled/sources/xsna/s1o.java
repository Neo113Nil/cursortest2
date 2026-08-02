package xsna;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.vk.core.tool.view.AspectRatioFrameLayout;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.imageloader.view.VKImageView;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedPostDonutPaymentClick;
import com.vkontakte.android.R;
import com.vkontakte.android.data.DonutAnalytics;
import java.util.HashSet;
import kotlin.LazyThreadSafetyMode;

/* compiled from: DonutPostTeaserHolder.kt */
/* loaded from: classes4.dex */
public final class s1o extends qi6<Post> implements View.OnClickListener {
    public final AspectRatioFrameLayout C;
    public final TextView D;
    public final VkButton E;
    public final VKImageView F;
    public final Object G;
    public final Object H;
    public final Object I;

    public s1o(ViewGroup viewGroup) {
        super(R.layout.donut_post_teaser, viewGroup);
        this.C = (AspectRatioFrameLayout) this.itemView.findViewById(R.id.aspect_ratio_layout);
        this.D = (TextView) this.itemView.findViewById(R.id.teaser_title);
        VkButton vkButton = (VkButton) this.itemView.findViewById(R.id.teaser_donate_button);
        this.E = vkButton;
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.teaser_blurred_image);
        this.F = vKImageView;
        f4 f4Var = new f4(13);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.G = msy.a(lazyThreadSafetyMode, f4Var);
        this.H = msy.a(lazyThreadSafetyMode, new g4g(this, 10));
        this.I = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.model.props.d(19));
        vkButton.setOnClickListener(this);
        vKImageView.setOnClickListener(this);
        vKImageView.setPlaceholderColor(dhr0.t.c(R.attr.vk_ui_background_secondary));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00eb, code lost:
    
        if (r11 == null) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0121  */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.qi6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E6(Post post) {
        int b;
        LinkButton linkButton;
        String str;
        int length;
        PostDonut.Paywall paywall;
        PostDonut postDonut = post.R;
        PostDonut.Snippet snippet = (postDonut == null || (paywall = postDonut.g) == null) ? null : paywall.d;
        if (snippet != null) {
            String str2 = snippet.c;
            if (str2 == null) {
                str2 = v6(R.string.default_paywall_title);
            }
            TextView textView = this.D;
            textView.setText(str2);
            VKImageView vKImageView = this.F;
            vKImageView.setContentDescription(str2);
            abg0 abg0Var = dhr0.t;
            textView.setTextColor(abg0Var.c(R.attr.vk_ui_text_contrast));
            vKImageView.clear();
            Context context = this.itemView.getContext();
            ViewParent parent = this.itemView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.getWidth();
            }
            boolean z = false;
            if (viewGroup == null || viewGroup.getWidth() == 0) {
                int b2 = cn70.b(context.getResources().getConfiguration().screenWidthDp);
                HashSet hashSet = iah0.a;
                b = b2 - (fnj.d(context) ? cn70.b(84) : 0);
            } else {
                b = (viewGroup.getWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight();
            }
            int min = Math.min(b, iah0.a(640.0f));
            Image image = snippet.f;
            ImageSize Cb = image != null ? image.Cb(min, true, false) : null;
            AspectRatioFrameLayout aspectRatioFrameLayout = this.C;
            if (Cb != null) {
                com.vk.dto.common.im.Image image2 = Cb.d;
                if (!TextUtils.isEmpty(image2.d)) {
                    aspectRatioFrameLayout.setAspectRation(swe0.f(Cb.E0(), 1.0f, 1.3333334f));
                    vKImageView.setPostprocessor(null);
                    vKImageView.load(image2.d);
                    vKImageView.setOverlayImage(new ColorDrawable(abg0Var.c(R.attr.vk_ui_overlay_secondary)));
                    linkButton = snippet.e;
                    if (linkButton != null) {
                        String str3 = linkButton.b;
                        str = str3;
                    }
                    str = v6(R.string.donut_teaser_button_default);
                    CharSequence charSequence = str;
                    if (((Boolean) this.I.getValue()).booleanValue()) {
                        charSequence = y1o.b(((a2o) this.H.getValue()).parse(str), this.itemView.getContext());
                    }
                    length = charSequence.length();
                    VkButton vkButton = this.E;
                    if (length != 0) {
                        vkButton.setText(charSequence);
                        z = true;
                    }
                    bwt0.p0(vkButton, z);
                }
            }
            textView.setTextColor(abg0Var.c(R.attr.vk_ui_text_primary));
            vKImageView.setOverlayImage(null);
            aspectRatioFrameLayout.setAspectRation(1.8f);
            linkButton = snippet.e;
            if (linkButton != null) {
            }
            str = v6(R.string.donut_teaser_button_default);
            CharSequence charSequence2 = str;
            if (((Boolean) this.I.getValue()).booleanValue()) {
            }
            length = charSequence2.length();
            VkButton vkButton2 = this.E;
            if (length != 0) {
            }
            bwt0.p0(vkButton2, z);
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Post q6;
        PostDonut.Paywall paywall;
        PostDonut.Snippet snippet;
        LinkButton linkButton;
        Action action;
        PostDonut.Placeholder placeholder;
        LinkButton linkButton2;
        if (jjc.b() || (q6 = q6()) == null) {
            return;
        }
        int i = q6.n;
        UserId userId = q6.m;
        PostDonut postDonut = q6.R;
        if (postDonut == null || (placeholder = postDonut.c) == null || (linkButton2 = placeholder.c) == null || (action = linkButton2.c) == null) {
            if (postDonut == null || (paywall = postDonut.g) == null || (snippet = paywall.d) == null || (linkButton = snippet.e) == null) {
                return;
            } else {
                action = linkButton.c;
            }
        }
        s1c0 s1c0Var = this.x;
        DonutAnalytics.DonutCustomTeaserScreen donutCustomTeaserScreen = s1c0Var != null ? s1c0Var.B : null;
        if (donutCustomTeaserScreen != null) {
            DonutAnalytics.e(userId, donutCustomTeaserScreen, i);
            if (action instanceof ActionOpenUrl) {
                action = DonutAnalytics.a((ActionOpenUrl) action, cqm0.m(DonutAnalytics.c(donutCustomTeaserScreen).name()));
            }
        }
        hd60.a().v(action, this.itemView.getContext(), (r20 & 4) != 0 ? null : null, (r20 & 8) != 0 ? null : this.u, (r20 & 16) != 0 ? null : null, (r20 & 32) != 0 ? null : null, null, (r20 & 128) != 0 ? null : 423);
        boolean f = epx.f(view, this.F);
        ?? r3 = this.G;
        if (f) {
            p4r p4rVar = (p4r) r3.getValue();
            String str = this.v;
            Integer valueOf = Integer.valueOf(i);
            p4rVar.getClass();
            p4r.a(MobileOfficialAppsFeedStat$TypeFeedPostDonutPaymentClick.Subtype.ATTACHMENT_BACKGROUND, str, userId, valueOf);
            return;
        }
        if (epx.f(view, this.E)) {
            p4r p4rVar2 = (p4r) r3.getValue();
            String str2 = this.v;
            Integer valueOf2 = Integer.valueOf(i);
            p4rVar2.getClass();
            p4r.a(MobileOfficialAppsFeedStat$TypeFeedPostDonutPaymentClick.Subtype.ATTACHMENT_BUTTON, str2, userId, valueOf2);
        }
    }
}
