package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.channels.impl.comments.e;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: CommentDeletedHolder.kt */
/* loaded from: classes16.dex */
public final class zag extends l5v<abg> {
    public final VKImageView m;
    public final TextView n;
    public abg o;

    /* compiled from: CommentDeletedHolder.kt */
    public interface a {
        void f(int i);
    }

    public zag(View view, e.a aVar) {
        super(view);
        this.m = (VKImageView) view.findViewById(R.id.im_deleted_comment_avatar);
        TextView textView = (TextView) view.findViewById(R.id.im_deleted_comment_restore);
        this.n = textView;
        awt0.j(iah0.a(4), textView);
        bwt0.i0(textView, new l22(9, aVar, this));
    }

    @Override // xsna.vfz
    public final void W5(hfz hfzVar) {
        abg abgVar = (abg) hfzVar;
        this.o = abgVar;
        this.n.setVisibility(abgVar.c ? 0 : 8);
        int i = abgVar.e;
        VKImageView vKImageView = this.m;
        if (i == 0) {
            f4m.x(iah0.a(12), this.itemView);
            int a2 = iah0.a(36);
            bwt0.m0(a2, a2, vKImageView);
        } else {
            f4m.x(iah0.a(58), this.itemView);
            int a3 = iah0.a(20);
            bwt0.m0(a3, a3, vKImageView);
        }
        h6(abgVar.d);
    }
}
