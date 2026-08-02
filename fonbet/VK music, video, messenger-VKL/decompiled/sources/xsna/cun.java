package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.common.Attachment;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DocumentAttachment;

/* compiled from: DocumentFileHolder.kt */
/* loaded from: classes4.dex */
public class cun extends ikg<DocumentAttachment> {
    public final StringBuilder L;

    public cun(ViewGroup viewGroup) {
        super(viewGroup);
        this.L = new StringBuilder();
        VKImageView vKImageView = this.D;
        qcy<Object>[] qcyVarArr = bwt0.a;
        dhr0.f0(R.drawable.white_oval, R.attr.vk_ui_background_secondary, vKImageView);
    }

    @Override // xsna.m56
    public final void T6(Attachment attachment) {
        DocumentAttachment documentAttachment = (DocumentAttachment) attachment;
        omw.d(this.D, R.drawable.vk_icon_document_24, R.attr.vk_ui_icon_medium);
        this.E.setText(documentAttachment.f);
        StringBuilder sb = this.L;
        sb.setLength(0);
        sb.append(v6(R.string.doc));
        sb.append(' ');
        sb.append(dun.s6(documentAttachment.n, this.itemView.getResources()));
        this.F.setText(sb);
    }

    @Override // xsna.m56, android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == null) {
            return;
        }
        W6(view);
    }
}
