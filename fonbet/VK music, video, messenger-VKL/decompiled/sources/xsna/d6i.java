package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.common.Attachment;
import com.vk.feed.core.models.attachment.EntryPhotoStyle;
import com.vk.newsfeed.common.views.header.HeaderPhotoView;
import com.vkontakte.android.R;

/* compiled from: CompactPredefinedAttachmentHolder.kt */
/* loaded from: classes4.dex */
public final class d6i extends jw2 implements View.OnClickListener {
    public final HeaderPhotoView D;
    public final TextView E;
    public final TextView F;

    public d6i(ViewGroup viewGroup) {
        super(R.layout.attach_compact_any, viewGroup);
        HeaderPhotoView headerPhotoView = (HeaderPhotoView) this.itemView.findViewById(R.id.attach_compact_image);
        this.D = headerPhotoView;
        this.E = (TextView) this.itemView.findViewById(R.id.attach_compact_title);
        this.F = (TextView) this.itemView.findViewById(R.id.attach_compact_subtitle);
        this.itemView.setOnClickListener(this);
        bwt0.p0(headerPhotoView, true);
        headerPhotoView.setDrawBorder(false);
        headerPhotoView.setMainPhotoStyle(EntryPhotoStyle.Square);
        headerPhotoView.setCount(1);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        s980 s980Var;
        Attachment attachment = this.C;
        if (attachment == null || (s980Var = this.y) == null) {
            return;
        }
        s980Var.Mg(view, J0(), q6(), attachment);
    }
}
