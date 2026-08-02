package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.common.Attachment;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DocumentAttachment;

/* compiled from: DocThumbHolder.kt */
/* loaded from: classes4.dex */
public final class ntn extends de6<hun> implements blc0 {
    public final iun k;
    public final nwf0 l;
    public x64 m;

    public ntn(iun iunVar, int i) {
        super(iunVar.itemView, i);
        ViewGroup.LayoutParams layoutParams;
        this.k = iunVar;
        this.l = new nwf0((ViewGroup) iunVar.itemView.findViewById(R.id.attach_doc_thumb_frame_layout), new oa6(this, 4));
        iunVar.E.setCornerRadius(0);
        View findViewById = iunVar.itemView.findViewById(R.id.att_doc_thumb);
        if (findViewById == null || (layoutParams = findViewById.getLayoutParams()) == null) {
            return;
        }
        layoutParams.width = -1;
        layoutParams.height = -1;
    }

    @Override // xsna.blc0
    public final void D1(boolean z) {
        this.l.a(z);
    }

    @Override // xsna.blc0
    public final void Z1(x64 x64Var) {
        this.m = x64Var;
    }

    @Override // xsna.de6
    public final void b(Attachment attachment) {
        boolean z = attachment instanceof DocumentAttachment;
        iun iunVar = this.k;
        if (z) {
            iunVar.R6(attachment);
        }
        iunVar.itemView.setOnClickListener(this);
    }

    @Override // xsna.de6
    public final void c(hun hunVar) {
        mun munVar = hunVar.f;
        iun iunVar = this.k;
        iunVar.H = munVar;
        iunVar.R6(munVar.a);
        iunVar.itemView.setOnClickListener(this);
    }

    @Override // xsna.de6, android.view.View.OnClickListener
    public final void onClick(View view) {
        x64 x64Var = this.m;
        if (x64Var != null) {
            x64Var.a(this.d);
        } else {
            super.onClick(view);
        }
    }

    @Override // xsna.blc0
    public final void p5() {
    }

    @Override // xsna.blc0
    public final void j1(View.OnClickListener onClickListener) {
    }
}
