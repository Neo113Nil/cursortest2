package xsna;

import com.vk.dto.common.Attachment;
import com.vk.feed.core.models.news.NewsEntry;
import xsna.ol60;

/* compiled from: BaseVideoAttachmentHolder.kt */
/* loaded from: classes4.dex */
public abstract class eq6<T extends ol60, N extends Attachment> extends rp6<T, NewsEntry> implements i7o {
    public N E;

    @Override // xsna.rp6
    public final void U6(NewsEntry newsEntry) {
        super.U6(newsEntry);
        N n = this.E;
        if (n != null) {
            c7(n);
        }
    }

    @Override // xsna.rp6, xsna.qi6
    public void a6(u1c0 u1c0Var) {
        if (u1c0Var instanceof r74) {
            N n = (N) ((r74) u1c0Var).q;
            if (n == null) {
                n = null;
            }
            this.E = n;
        }
        super.a6(u1c0Var);
        mnh0.v(this.itemView, t6());
    }

    public void b7(N n) {
        this.E = n;
        T t = this.C;
        if (t != null) {
            R6(t);
        }
        if (this.C == null) {
            c7(n);
        }
    }

    public abstract void c7(N n);

    @Override // xsna.rp6
    public void R6(T t) {
    }
}
