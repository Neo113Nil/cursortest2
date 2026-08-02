package xsna;

import android.os.Bundle;
import com.vk.dto.common.id.UserId;
import com.vk.dto.live.LiveEventModel;
import com.vk.libvideo.live.impl.base.LiveStatNew;
import com.vk.lists.ListDataSet;
import com.vk.log.L;
import com.vkontakte.android.R;
import java.util.function.Predicate;

/* compiled from: ChatPresenter.java */
/* loaded from: classes3.dex */
public final class jub extends io.reactivex.rxjava3.observers.a<Boolean> {
    public final /* synthetic */ int c;
    public final /* synthetic */ UserId d;
    public final /* synthetic */ com.vk.libvideo.live.impl.views.chat.a e;

    public jub(int i, UserId userId, com.vk.libvideo.live.impl.views.chat.a aVar) {
        this.e = aVar;
        this.c = i;
        this.d = userId;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
        com.vk.libvideo.live.impl.views.chat.a aVar = this.e;
        aVar.i = null;
        cvk.u(R.string.live_comment_deleted, false);
        LiveStatNew liveStatNew = aVar.m;
        if (liveStatNew != null) {
            Bundle a = q9k.a("action_type", "delete_comment");
            a.putLong("recipient_user_id", this.d.b);
            liveStatNew.b(a);
            qyk0.a().e("live_action", a);
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        L.i(th);
        this.e.i = null;
        cvk.u(R.string.error, false);
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(Object obj) {
        com.vk.libvideo.live.impl.views.chat.a aVar = this.e;
        oyb oybVar = aVar.e;
        final int i = this.c;
        LiveEventModel liveEventModel = (LiveEventModel) ((ListDataSet) oybVar.c).t(new Predicate() { // from class: xsna.iub
            @Override // java.util.function.Predicate
            public final boolean test(Object obj2) {
                return ((LiveEventModel) obj2).m == i;
            }
        });
        if (liveEventModel != null) {
            aVar.r0(liveEventModel);
        }
    }
}
