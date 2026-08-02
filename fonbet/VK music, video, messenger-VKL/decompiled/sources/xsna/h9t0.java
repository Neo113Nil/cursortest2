package xsna;

import com.vk.dto.newsfeed.Owner;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.video.profile.presentation.f;
import com.vk.video.profile.presentation.models.StateProfileSubscribe;
import com.vk.video.profile.presentation.models.StateSubscribeNotification;

/* compiled from: VideoProfileSubscribeDelegate.kt */
/* loaded from: classes6.dex */
public final class h9t0 {
    public final wd8 a;
    public final f4z<com.vk.video.profile.presentation.h> b;
    public final lzh0 c;
    public final v8t0 d;
    public final xd8 e;
    public final j7t0 f;
    public final io.reactivex.rxjava3.disposables.b g;
    public final b8t0 h;

    /* compiled from: VideoProfileSubscribeDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoNotificationsStatus.values().length];
            try {
                iArr[VideoNotificationsStatus.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoNotificationsStatus.PREFERRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoNotificationsStatus.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public h9t0(wd8 wd8Var, f4z f4zVar, lzh0 lzh0Var, x8t0 x8t0Var, xd8 xd8Var, a8t0 a8t0Var, j7t0 j7t0Var, io.reactivex.rxjava3.disposables.b bVar, b8t0 b8t0Var) {
        this.a = wd8Var;
        this.b = f4zVar;
        this.c = lzh0Var;
        this.d = x8t0Var;
        this.e = xd8Var;
        this.f = j7t0Var;
        this.g = bVar;
        this.h = b8t0Var;
    }

    public final void a(final u490 u490Var, final boolean z) {
        boolean z2 = u490Var.i;
        Owner owner = u490Var.a;
        boolean d = fkq0.d(owner.b);
        v8t0 v8t0Var = this.d;
        xd8 xd8Var = this.e;
        io.reactivex.rxjava3.disposables.b bVar = this.g;
        if (d) {
            xd8Var.invoke(f.h.e.b);
            if (z2) {
                bVar.b(v8t0.f(v8t0Var, owner.b, null, null, 6).q(io.reactivex.rxjava3.schedulers.a.b()).o(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new io.reactivex.rxjava3.functions.a() { // from class: xsna.f9t0
                    @Override // io.reactivex.rxjava3.functions.a
                    public final void run() {
                        h9t0 h9t0Var = h9t0.this;
                        h9t0Var.h.invoke(StateSubscribeNotification.UNSUBSCRIBE, u490Var.a.b, Boolean.valueOf(z));
                        h9t0Var.e.invoke(f.h.i.b);
                        h9t0Var.c.a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNSUBSCRIBE_OUT);
                    }
                }, new eeh0(new yka0(this, 24), 16)));
                return;
            } else {
                bVar.b(v8t0Var.d(owner.b).q(io.reactivex.rxjava3.schedulers.a.b()).o(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new io.reactivex.rxjava3.functions.a() { // from class: xsna.d9t0
                    @Override // io.reactivex.rxjava3.functions.a
                    public final void run() {
                        h9t0 h9t0Var = h9t0.this;
                        h9t0Var.h.invoke(StateSubscribeNotification.SUBSCRIBE, u490Var.a.b, Boolean.valueOf(z));
                        h9t0Var.e.invoke(f.h.i.b);
                        h9t0Var.c.a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE_OUT);
                    }
                }, new m3y(new hij0(this, 16), 28)));
                return;
            }
        }
        if (fkq0.b(owner.b)) {
            if (z2) {
                xd8Var.invoke(f.h.C1961f.b);
            } else {
                xd8Var.invoke(f.h.e.b);
                bVar.b(v8t0Var.d(owner.b).q(io.reactivex.rxjava3.schedulers.a.b()).o(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new io.reactivex.rxjava3.functions.a() { // from class: xsna.e9t0
                    @Override // io.reactivex.rxjava3.functions.a
                    public final void run() {
                        h9t0 h9t0Var = h9t0.this;
                        b8t0 b8t0Var = h9t0Var.h;
                        StateSubscribeNotification stateSubscribeNotification = StateSubscribeNotification.SUBSCRIBE;
                        u490 u490Var2 = u490Var;
                        b8t0Var.invoke(stateSubscribeNotification, u490Var2.a.b, Boolean.valueOf(z));
                        h9t0Var.e.invoke(f.h.C1962h.b);
                        h9t0Var.c.a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE_OUT);
                        h9t0Var.f.a(StateProfileSubscribe.SUBSCRIBE, u490Var2.a.b);
                    }
                }, new wks0(new lyl0(this, 14), 1)));
            }
        }
    }
}
