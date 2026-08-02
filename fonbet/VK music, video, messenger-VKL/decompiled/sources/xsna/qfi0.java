package xsna;

import android.view.View;
import android.widget.ImageView;
import com.vk.dto.attachments.SnippetAttachment;

/* compiled from: SellerProductSnippetHolder.kt */
/* loaded from: classes4.dex */
public final class qfi0 extends rm6 implements View.OnClickListener {
    public e6o P;

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        e6o a = s6oVar.a(this, s6oVar.e);
        this.P = a;
        this.itemView.setOnClickListener(a);
        ImageView imageView = this.K;
        if (imageView != null) {
            imageView.setOnClickListener(a);
        }
    }

    @Override // xsna.rm6
    public final View X6() {
        return this.itemView;
    }

    @Override // xsna.rm6, xsna.m56
    /* renamed from: Y6 */
    public final void T6(SnippetAttachment snippetAttachment) {
        View.OnClickListener onClickListener = this.P;
        if (onClickListener == null) {
            onClickListener = this;
        }
        this.itemView.setOnClickListener(onClickListener);
        ImageView imageView = this.K;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
        super.T6(snippetAttachment);
    }

    @Override // xsna.m56, android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == null || jjc.b()) {
            return;
        }
        if (view.equals(this.K)) {
            b7();
        } else {
            W6(view);
        }
    }
}
