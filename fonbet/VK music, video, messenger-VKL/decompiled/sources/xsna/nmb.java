package xsna;

import android.content.Context;
import android.graphics.PorterDuffColorFilter;
import android.view.LayoutInflater;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.actionlinks.ActionLinkSnippet;
import com.vk.dto.common.Good;
import com.vk.ecomm.moderation.api.restrictions.ModerationCheckAdultResult;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.e3m;

/* compiled from: ChatActionLinkSnippetView.kt */
/* loaded from: classes16.dex */
public final class nmb extends ConstraintLayout implements omb {
    public final Object A;
    public final VkText t;
    public final VkText u;
    public final VKImageView v;
    public final VkText w;
    public final ImageView x;
    public final VkText y;
    public final Object z;

    public nmb(Context context) {
        super(context, null);
        e20 e20Var = new e20(5);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.z = msy.a(lazyThreadSafetyMode, e20Var);
        this.A = msy.a(lazyThreadSafetyMode, new jmb(context, 0));
        LayoutInflater.from(context).inflate(R.layout.chat_action_link_user_snippet_view, this);
        this.t = (VkText) findViewById(R.id.live_chat_snippet_title);
        this.u = (VkText) findViewById(R.id.live_chat_snippet_subtitle);
        this.v = (VKImageView) findViewById(R.id.live_chat_snippet_image);
        this.x = (ImageView) findViewById(R.id.live_chat_snippet_moderation_image);
        this.w = (VkText) findViewById(R.id.live_chat_snippet_badge);
        this.y = (VkText) findViewById(R.id.live_chat_snippet_button);
        e3m.a aVar = e3m.a;
        setBackground(m33.a(R.drawable.live_chat_snippet_background, context));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final PorterDuffColorFilter getBlurRestrictionColorFilter() {
        return (PorterDuffColorFilter) this.A.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final jwx getBlurRestrictionPostprocessor() {
        return (jwx) this.z.getValue();
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void P4(pmb pmbVar, gmb gmbVar, sbg sbgVar, tbg tbgVar) {
        Good good;
        ActionLink actionLink = (ActionLink) pmbVar.b;
        ActionLinkSnippet actionLinkSnippet = actionLink.f;
        VkText vkText = this.y;
        ImageView imageView = this.x;
        if (actionLinkSnippet != null && (good = actionLinkSnippet.j) != null) {
            if (((y330) gmbVar.b.getValue()).a(false, good.h0) != ModerationCheckAdultResult.ADULT_NOT_REQUIRED) {
                bwt0.p0(imageView, true);
                bwt0.p0(getBadgeTextView(), false);
                getSnippetImageView().setActualColorFilter(getBlurRestrictionColorFilter());
                getSnippetImageView().setPostprocessor(getBlurRestrictionPostprocessor());
                VKImageView snippetImageView = getSnippetImageView();
                ActionLinkSnippet actionLinkSnippet2 = actionLink.f;
                snippetImageView.load(actionLinkSnippet2 != null ? actionLinkSnippet2.zb() : null);
                getTitleTextView().setTextAppearance(R.style.VkUiTypography_ParagraphMedium);
                getTitleTextView().setText(getContext().getString(R.string.chat_live_snippet_title_for_adults));
                getSubtitleTextView().setText(getContext().getString(R.string.chat_live_snippet_subtitle_for_adults));
                int i = 0;
                setOnClickListener(new kmb(this, gmbVar, pmbVar, i));
                vkText.setOnClickListener(new lmb(this, gmbVar, pmbVar, i));
                Q4(pmbVar);
                return;
            }
        }
        bwt0.p0(imageView, false);
        getSnippetImageView().setPostprocessor(null);
        getSnippetImageView().getBackend().t();
        setOnClickListener(new mmb(0, this, sbgVar));
        vkText.setOnClickListener(new te5(2, this, tbgVar));
        super.w1(getContext(), pmbVar);
        Q4(pmbVar);
    }

    public final void Q4(pmb pmbVar) {
        ActionLinkSnippet actionLinkSnippet = ((ActionLink) pmbVar.b).f;
        Good good = actionLinkSnippet != null ? actionLinkSnippet.j : null;
        VkText vkText = this.y;
        if (good == null) {
            vkText.setText(getContext().getString(R.string.chat_live_snippet_general_button));
            return;
        }
        String str = good.K;
        if (str == null || str.length() == 0) {
            his0.v(vkText, 0, 0);
        } else {
            his0.v(vkText, R.drawable.vk_icon_link_outline_16, 0);
        }
        vkText.setText(getContext().getString(R.string.chat_live_snippet_market_button));
    }

    @Override // xsna.omb
    public VkText getBadgeTextView() {
        return this.w;
    }

    @Override // xsna.omb
    public VKImageView getSnippetImageView() {
        return this.v;
    }

    @Override // xsna.omb
    public VkText getSubtitleTextView() {
        return this.u;
    }

    @Override // xsna.omb
    public VkText getTitleTextView() {
        return this.t;
    }
}
