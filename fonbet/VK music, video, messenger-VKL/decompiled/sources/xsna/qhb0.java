package xsna;

import com.vk.dto.common.id.UserId;
import xsna.k840;

/* compiled from: PodcastInteractorImpl.kt */
/* loaded from: classes3.dex */
public final class qhb0 implements phb0 {
    public final ejb0 a;
    public final oc40 b;
    public final bpn0 c;
    public final bpn0 d;

    public qhb0(bpn0 bpn0Var, bpn0 bpn0Var2, ejb0 ejb0Var) {
        r5v0 r5v0Var = k840.a.h;
        r5v0Var = r5v0Var == null ? null : r5v0Var;
        this.a = ejb0Var;
        this.b = r5v0Var;
        this.c = bpn0Var;
        this.d = bpn0Var2;
    }

    @Override // xsna.phb0
    public final io.reactivex.rxjava3.core.a a(String str) {
        ((clb0) this.a.a).getClass();
        tfx tfxVar = new tfx("podcasts.enableNotifications", new com.vk.movika.sdk.android.defaultplayer.view.a(26), new er(29));
        if (str != null) {
            tfx.o(tfxVar, "podcast_id", str, 5, 0, 8);
        }
        return new io.reactivex.rxjava3.internal.operators.single.s(rsg0.w0(yfb.x(tfxVar)), new xw70(new com(27), 3));
    }

    @Override // xsna.phb0
    public final io.reactivex.rxjava3.core.a b(UserId userId, Integer num, String str, String str2) {
        UserId userId2;
        io.reactivex.rxjava3.core.x w0;
        ejb0 ejb0Var = this.a;
        ejb0Var.getClass();
        if (!str.equals("kids_section") || num == null) {
            ((clb0) ejb0Var.a).getClass();
            tfx tfxVar = new tfx("podcasts.subscribe", new wd10(7), new hr(27));
            userId2 = userId;
            tfx.n(tfxVar, "owner_id", userId2, 0L, 0L, 12);
            w0 = rsg0.w0(yfb.x(tfxVar));
        } else {
            w0 = rsg0.w0(yfb.x(((qxi) ejb0Var.b).e(num.intValue(), userId, str2))).l(new adz(new ept(19), 9));
            userId2 = userId;
        }
        return new io.reactivex.rxjava3.internal.operators.single.s(new io.reactivex.rxjava3.internal.operators.single.o(w0, new hms(new mp3(26, this, userId2), 26)), new op0(new k22(16, this, userId2), 28));
    }

    @Override // xsna.phb0
    public final io.reactivex.rxjava3.core.a c(UserId userId, Integer num, String str, String str2) {
        io.reactivex.rxjava3.core.x w0;
        ejb0 ejb0Var = this.a;
        ejb0Var.getClass();
        if (!str.equals("kids_section") || num == null) {
            ((clb0) ejb0Var.a).getClass();
            tfx tfxVar = new tfx("podcasts.unsubscribe", new ar(27), new br(26));
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
            w0 = rsg0.w0(yfb.x(tfxVar));
        } else {
            qxi qxiVar = (qxi) ejb0Var.b;
            int intValue = num.intValue();
            qxiVar.getClass();
            tfx tfxVar2 = new tfx("kidsCollection.removePodcast", new gq(21), new hq(19));
            tfx.l(tfxVar2, "podcast_id", intValue, 0, 0, 12);
            tfx.n(tfxVar2, "owner_id", userId, 0L, 0L, 12);
            if (str2 != null) {
                tfx.o(tfxVar2, "ref", str2, 0, 0, 12);
            }
            w0 = rsg0.w0(yfb.x(tfxVar2)).l(new nh40(new c4r(23), 8));
        }
        return new io.reactivex.rxjava3.internal.operators.single.s(new io.reactivex.rxjava3.internal.operators.single.o(w0, new ubq(new l22(26, this, userId), 25)), new bk1(new com.vk.movika.sdk.base.ui.s0(23, this, userId), 28));
    }

    @Override // xsna.phb0
    public final io.reactivex.rxjava3.core.a d(String str) {
        ((clb0) this.a.a).getClass();
        tfx tfxVar = new tfx("podcasts.disableNotifications", new alb0(0), new gr(28));
        if (str != null) {
            tfx.o(tfxVar, "podcast_id", str, 5, 0, 8);
        }
        return new io.reactivex.rxjava3.internal.operators.single.s(rsg0.w0(yfb.x(tfxVar)), new l340(new d4r(18), 5));
    }
}
