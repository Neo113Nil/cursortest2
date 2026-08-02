package xsna;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.feed.core.models.news.NewsEntryWithAttachments;
import com.vkontakte.android.R;
import com.vkontakte.android.data.PostInteract;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;

/* compiled from: AttachCutHolder.kt */
/* loaded from: classes4.dex */
public final class g14 extends qi6<NewsEntryWithAttachments> implements View.OnClickListener {
    public final p870 C;
    public final TextView D;

    public g14(ViewGroup viewGroup, p870 p870Var) {
        super(R.layout.post_attach_cut_item, viewGroup);
        this.C = p870Var;
        this.D = (TextView) this.itemView.findViewById(R.id.attach_cut_text);
        this.itemView.setOnClickListener(this);
        getContext();
    }

    @Override // xsna.qi6
    public final void E6(NewsEntryWithAttachments newsEntryWithAttachments) {
        String string;
        List d = y64.d(newsEntryWithAttachments);
        int size = d.size();
        if (size <= 0) {
            string = "";
        } else {
            Resources resources = this.itemView.getContext().getResources();
            string = resources.getString(R.string.post_attach_cut_show_more, Integer.valueOf(d.size()), resources.getQuantityString(R.plurals.num_attach_short, size));
        }
        TextView textView = this.D;
        textView.setText(string);
        textView.setContentDescription(string);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!bwt0.b() && epx.f(view, this.itemView)) {
            this.C.e(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, q6());
            PostInteract postInteract = this.w;
            if (postInteract != null) {
                postInteract.zb(PostInteract.Type.expand_attach);
            }
        }
    }
}
