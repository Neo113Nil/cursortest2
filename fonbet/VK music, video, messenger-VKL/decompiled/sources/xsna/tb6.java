package xsna;

import android.view.View;
import com.vk.dto.common.Attachment;
import com.vk.feed.core.models.attachment.CompactAttachmentStyle;
import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: BaseCompactAttachmentHolder.kt */
/* loaded from: classes4.dex */
public abstract class tb6 extends qi6<NewsEntry> {
    public CompactAttachmentStyle C;
    public Attachment D;

    @Override // xsna.qi6
    public final void E6(NewsEntry newsEntry) {
        Attachment attachment = this.D;
        CompactAttachmentStyle compactAttachmentStyle = this.C;
        if (attachment == null || compactAttachmentStyle == null) {
            return;
        }
        T6(attachment, compactAttachmentStyle);
    }

    public boolean R6() {
        s980 s980Var;
        Attachment attachment = this.D;
        if (attachment == null || (s980Var = this.y) == null) {
            return false;
        }
        return s980Var.E8(attachment, q6());
    }

    public abstract void T6(Attachment attachment, CompactAttachmentStyle compactAttachmentStyle);

    public void U6(View view) {
        s980 s980Var;
        Attachment attachment = this.D;
        if (attachment == null || (s980Var = this.y) == null) {
            return;
        }
        s980Var.Hh(view, J0(), q6(), attachment);
    }

    public void W6(View view) {
        s980 s980Var;
        Attachment attachment = this.D;
        if (attachment == null || (s980Var = this.y) == null) {
            return;
        }
        s980Var.Mg(view, J0(), q6(), attachment);
    }

    @Override // xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        if (u1c0Var instanceof k5i) {
            k5i k5iVar = (k5i) u1c0Var;
            this.C = k5iVar.r;
            this.D = k5iVar.q;
        }
        super.a6(u1c0Var);
        mnh0.v(this.itemView, t6());
    }
}
