package xsna;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.libvideo.live.impl.views.chat.elements.Comment;
import com.vk.log.L;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.h7u0;

/* compiled from: Comment.java */
/* loaded from: classes3.dex */
public final class fag extends io.reactivex.rxjava3.observers.a<jmz> {
    public final /* synthetic */ Comment c;

    public fag(Comment comment) {
        this.c = comment;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        L.i(th);
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(Object obj) {
        jmz jmzVar = (jmz) obj;
        int i = Comment.l;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Comment comment = this.c;
        qpb qpbVar = comment.i.get();
        if (jmzVar.k) {
            arrayList.add(comment.getContext().getString(R.string.live_pin_comment));
            arrayList2.add("pin");
        }
        if (jmzVar.l) {
            arrayList.add(comment.getContext().getString(R.string.live_unpin_comment));
            arrayList2.add("unpin");
        }
        if (jmzVar.j && comment.k) {
            arrayList.add(comment.getContext().getString(R.string.live_reply_comment));
            arrayList2.add("reply");
        }
        if (jmzVar.f) {
            arrayList.add(comment.getContext().getString(R.string.report_content));
            arrayList2.add("report");
        }
        if (jmzVar.i) {
            arrayList.add(comment.getContext().getString(R.string.live_comment_delete));
            arrayList2.add("delete");
        }
        if (jmzVar.h) {
            arrayList.add(comment.getContext().getString(R.string.live_profile));
            arrayList2.add(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
        }
        if (jmzVar.g) {
            arrayList.add(comment.getContext().getString(R.string.live_copy));
            arrayList2.add("copy");
        }
        if (jmzVar.b) {
            if (jmzVar.c) {
                arrayList.add(comment.getContext().getString(R.string.live_like));
                arrayList2.add("like");
            } else {
                arrayList.add(comment.getContext().getString(R.string.live_unlike));
                arrayList2.add("unlike");
            }
        }
        if (jmzVar.d) {
            if (jmzVar.e) {
                arrayList.add(comment.getContext().getString(R.string.live_comment_block_user));
                arrayList2.add("block");
            } else {
                arrayList.add(comment.getContext().getString(R.string.live_comment_unblock_user));
                arrayList2.add("unblock");
            }
        }
        androidx.appcompat.app.d dVar = comment.g;
        if (dVar != null) {
            dVar.dismiss();
            comment.g = null;
        }
        h7u0.a aVar = new h7u0.a(comment.getContext());
        aVar.g0(R.string.live_comment);
        aVar.T((CharSequence[]) arrayList.toArray(new String[0]), new gag(comment, qpbVar, arrayList2));
        comment.g = aVar.m();
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
    }
}
