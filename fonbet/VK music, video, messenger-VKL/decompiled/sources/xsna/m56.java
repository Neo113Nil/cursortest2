package xsna;

import android.view.View;
import com.vk.dto.common.Attachment;
import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: BaseAttachmentHolder.kt */
/* loaded from: classes4.dex */
public abstract class m56<T extends Attachment> extends qi6<NewsEntry> implements i7o {
    public T C;

    @Override // xsna.qi6
    public final void E6(NewsEntry newsEntry) {
        T t = this.C;
        if (t != null) {
            T6(t);
        }
    }

    public final void R6(T t) {
        this.C = t;
        if (t != null) {
            T6(t);
        }
    }

    public abstract void T6(T t);

    public final void U6(View view) {
        s980 l6;
        T t = this.C;
        if (t == null || (l6 = l6()) == null) {
            return;
        }
        l6.Hh(view, J0(), q6(), t);
    }

    public final void W6(View view) {
        s980 l6;
        T t = this.C;
        if (t == null || (l6 = l6()) == null) {
            return;
        }
        l6.Mg(view, J0(), q6(), t);
    }

    @Override // xsna.qi6
    public void a6(u1c0 u1c0Var) {
        if (u1c0Var instanceof r74) {
            T t = (T) ((r74) u1c0Var).q;
            if (t == null) {
                t = null;
            }
            this.C = t;
        }
        super.a6(u1c0Var);
        mnh0.v(this.itemView, t6());
    }

    public void onClick(View view) {
        W6(view);
    }
}
