package xsna;

import android.view.ViewStub;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.ui.fragments.chat.ChatFragment;

/* compiled from: EduScheduleComponent.kt */
/* loaded from: classes2.dex */
public final class z6p extends j8i implements w8i {
    public final long i;
    public final i7p j;
    public final io.reactivex.rxjava3.subjects.d<ProfilesInfo> k;

    /* compiled from: EduScheduleComponent.kt */
    public static final class a {
    }

    public z6p(ViewStub viewStub, long j, ChatFragment.f fVar) {
        this.i = j;
        this.j = new i7p(viewStub, viewStub.getContext(), fVar);
        new bpn0(new qfj(this, 4));
        io.reactivex.rxjava3.subjects.d<ProfilesInfo> N0 = io.reactivex.rxjava3.subjects.d.N0();
        this.k = N0;
        io.reactivex.rxjava3.core.q<R> L = N0.L(new l7(new n6f(this, 19), 21), false);
        L.getClass();
        new io.reactivex.rxjava3.internal.operators.observable.y(L, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
    }

    public final void X0(ProfilesInfo profilesInfo) {
        this.k.onNext(profilesInfo);
    }
}
