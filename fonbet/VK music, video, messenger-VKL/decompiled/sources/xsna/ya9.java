package xsna;

import com.vk.dto.common.id.UserId;
import xsna.rew0;

/* compiled from: CallVmojiDelegate.kt */
/* loaded from: classes7.dex */
public final class ya9 implements rew0.b {
    public final /* synthetic */ io.reactivex.rxjava3.core.r<UserId> a;

    public ya9(io.reactivex.rxjava3.core.r<UserId> rVar) {
        this.a = rVar;
    }

    @Override // xsna.rew0.b
    public final void a(UserId userId) {
        this.a.onNext(userId);
    }

    @Override // xsna.rew0.b
    public final void b() {
    }
}
