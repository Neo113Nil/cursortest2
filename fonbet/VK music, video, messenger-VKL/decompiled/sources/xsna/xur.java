package xsna;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.user.UserProfile;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.BackpressureOverflowStrategy;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: FlyPresenter.java */
/* loaded from: classes3.dex */
public final class xur implements tur {
    public final UserProfile b;
    public final uur c;
    public final ArrayList<io.reactivex.rxjava3.observers.a> d = new ArrayList<>();

    @NonNull
    public final io.reactivex.rxjava3.subjects.f<io.reactivex.rxjava3.core.q<Drawable>> e = new io.reactivex.rxjava3.subjects.f<>();

    @NonNull
    public final io.reactivex.rxjava3.subjects.d<Boolean> f = io.reactivex.rxjava3.subjects.d.O0(Boolean.TRUE);

    @NonNull
    public io.reactivex.rxjava3.disposables.c g = EmptyDisposable.INSTANCE;
    public long h;
    public long i;

    public xur(UserProfile userProfile, uur uurVar) {
        this.b = userProfile;
        this.c = uurVar;
    }

    public final void Q(long j, UserId userId, boolean z) {
        UserProfile userProfile = this.b;
        if (userProfile.c.equals(userId)) {
            if (z) {
                this.h = j;
            } else if (j - this.h <= 3000) {
                return;
            }
        }
        d(mcr0.h(er.a("res").path(String.valueOf(Objects.equals(userProfile.c, userId) ? R.drawable.ic_stream_fly_like2 : R.drawable.ic_stream_flying_like)).build()).U(new rr(16)).r0(asu0.a.c()));
    }

    public final void W(UserId userId, StickerItem stickerItem, long j, boolean z) {
        io.reactivex.rxjava3.internal.operators.observable.j1 U;
        if (t(j, userId, z)) {
            if (stickerItem.g.V0()) {
                String a = stickerItem.a(true);
                int i = stickerItem.b;
                bpn0 bpn0Var = c7r0.a;
                U = c7r0.i(a).U(new vur(this, i));
            } else {
                t6g0 t6g0Var = t6g0.b;
                U = mcr0.h(Uri.parse(t6g0.d().z0(stickerItem, h9l0.d, true))).U(new com.vk.movika.sdk.base.ui.j(this, 12));
            }
            d(U);
        }
    }

    @Override // xsna.tur
    public final void Y(boolean z) {
        this.f.onNext(Boolean.valueOf(z));
    }

    public final void d(io.reactivex.rxjava3.internal.operators.observable.a aVar) {
        uur uurVar = this.c;
        if (uurVar == null || !uurVar.isVisible()) {
            return;
        }
        boolean h = this.g.h();
        io.reactivex.rxjava3.subjects.f<io.reactivex.rxjava3.core.q<Drawable>> fVar = this.e;
        if (h) {
            io.reactivex.rxjava3.core.g f = new io.reactivex.rxjava3.internal.operators.flowable.z0(fVar.D0(BackpressureStrategy.BUFFER).k(40L, null, BackpressureOverflowStrategy.DROP_OLDEST), new m40(this, 14)).f(new o40(this, 18), 6, io.reactivex.rxjava3.core.g.b);
            defpackage.j0 j0Var = new defpackage.j0(18);
            f.getClass();
            this.g = new io.reactivex.rxjava3.internal.operators.flowable.j0(f, j0Var).j(asu0.a.d()).subscribe(new cp0(this, 26), new rao());
        }
        fVar.onNext(aVar);
    }

    @Override // xsna.pk6
    public final void release() {
        ArrayList<io.reactivex.rxjava3.observers.a> arrayList = this.d;
        Iterator<io.reactivex.rxjava3.observers.a> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        arrayList.clear();
        this.g.dispose();
    }

    public final boolean t(long j, UserId userId, boolean z) {
        if (this.b.c.equals(userId)) {
            if (z) {
                this.i = j;
                return true;
            }
            if (j - this.i <= 3000) {
                return false;
            }
        }
        return true;
    }

    @Override // xsna.pk6
    public final void pause() {
    }

    @Override // xsna.pk6
    public final void resume() {
    }

    @Override // xsna.pk6
    public final void start() {
    }
}
