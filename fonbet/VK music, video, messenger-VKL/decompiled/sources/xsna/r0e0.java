package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: ProfileUserIdHolderImpl.kt */
/* loaded from: classes5.dex */
public final class r0e0 {
    public volatile UserId a = UserId.d;
    public final io.reactivex.rxjava3.subjects.h b = io.reactivex.rxjava3.subjects.d.O0(this.a).M0();

    public final UserId a() {
        return this.a;
    }

    public final void b(UserId userId) {
        this.a = userId;
        this.b.onNext(userId);
    }
}
