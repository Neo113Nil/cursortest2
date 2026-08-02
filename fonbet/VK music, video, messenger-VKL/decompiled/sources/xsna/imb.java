package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.text.VkText;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: ChatActionLinkSnippetView.kt */
/* loaded from: classes16.dex */
public final class imb extends ConstraintLayout implements omb {
    public final VkText t;
    public final VkText u;
    public final VKImageView v;
    public final VkText w;
    public final VkText x;

    public imb(Context context) {
        super(context, null);
        LayoutInflater.from(context).inflate(R.layout.chat_action_link_streamer_snippet_view, this);
        this.t = (VkText) findViewById(R.id.live_chat_snippet_title);
        this.u = (VkText) findViewById(R.id.live_chat_snippet_subtitle);
        this.v = (VKImageView) findViewById(R.id.live_chat_snippet_image);
        this.w = (VkText) findViewById(R.id.live_chat_snippet_badge);
        this.x = (VkText) findViewById(R.id.live_chat_snippet_click_count);
        e3m.a aVar = e3m.a;
        setBackground(m33.a(R.drawable.live_chat_snippet_background, context));
    }

    public final void P4(pmb pmbVar, m3g m3gVar) {
        super.w1(getContext(), pmbVar);
        setOnClickListener(new hmb(0, this, m3gVar));
        this.x.setText(enj.f(R.plurals.chat_live_snippet_clicks_count, pmbVar.a, getContext()));
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
