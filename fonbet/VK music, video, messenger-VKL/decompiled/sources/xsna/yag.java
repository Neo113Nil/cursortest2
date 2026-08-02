package xsna;

import android.view.ViewGroup;
import com.vk.channels.impl.comments.e;
import com.vkontakte.android.R;

/* compiled from: CommentDeletedAdapterDelegate.kt */
/* loaded from: classes16.dex */
public final class yag extends p1u0<abg> {
    public final e.a a;

    public yag(e.a aVar) {
        this.a = aVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends abg> b(ViewGroup viewGroup) {
        return new zag(bwt0.I(R.layout.im_comment_deleted_item, viewGroup, false), this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof abg;
    }
}
