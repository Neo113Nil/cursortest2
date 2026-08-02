package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.toggle.features.MusicFeatures;
import java.util.Collections;
import xsna.gsf0;

/* compiled from: RelatedMusicInVideoInteractorImpl.kt */
/* loaded from: classes6.dex */
public final class ksf0 implements jsf0 {
    public final gsf0 a;

    public ksf0(gsf0 gsf0Var) {
        this.a = gsf0Var;
    }

    @Override // xsna.jsf0
    public final io.reactivex.rxjava3.core.a a(UserId userId, Integer num, String str) {
        if (userId == null || num.intValue() == 0) {
            return io.reactivex.rxjava3.core.a.k(new IllegalArgumentException("One or more arg null or 0"));
        }
        final int intValue = num.intValue();
        final gsf0 gsf0Var = this.a;
        gsf0Var.a.getClass();
        tfx tfxVar = new tfx("video.removeRelatedAudioFromFavoritePlaylist", new pq(26), new iun0(7));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "audio_id", intValue, 1, 0, 8);
        if (str != null) {
            tfx.o(tfxVar, "access_key", str, 0, 0, 12);
        }
        return rsg0.Z(yfb.x(tfxVar)).g(new io.reactivex.rxjava3.functions.a() { // from class: xsna.esf0
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                int i = intValue;
                gsf0 gsf0Var2 = gsf0.this;
                gsf0Var2.b(i, false);
                gsf0Var2.d.onNext(s3q0.a);
            }
        });
    }

    @Override // xsna.jsf0
    public final boolean b(int i, Integer num) {
        if (!MusicFeatures.AUDIO_VIDEO_TRACK_ADD.h()) {
            return false;
        }
        this.a.b.getClass();
        return (num == null || num.intValue() == 0 || num.intValue() == i) ? false : true;
    }

    @Override // xsna.jsf0
    public final io.reactivex.rxjava3.core.x<csf0> c(UserId userId, Integer num, String str, String str2) {
        if (userId == null || num.intValue() == 0) {
            return io.reactivex.rxjava3.core.x.i(new IllegalArgumentException("One or more arg null or 0"));
        }
        int intValue = num.intValue();
        gsf0 gsf0Var = this.a;
        gsf0Var.a.getClass();
        tfx tfxVar = new tfx("video.addRelatedAudioToFavoritePlaylist", new fyp0(3), new oft0(0));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "audio_id", intValue, 1, 0, 8);
        if (str2 != null) {
            tfx.o(tfxVar, "access_key", str2, 0, 0, 12);
        }
        if (str != null) {
            tfx.o(tfxVar, "track_code", str, 0, 0, 12);
        }
        return new io.reactivex.rxjava3.internal.operators.single.o(rsg0.w0(yfb.x(tfxVar)).l(new qca0(new hx3(b3s0.a, 7), 2)), new ljs(new fsf0(gsf0Var, intValue), 22));
    }

    @Override // xsna.jsf0
    public final boolean d(int i, Integer num) {
        return (!this.a.a() || num == null || num.intValue() == 0 || num.intValue() == i) ? false : true;
    }

    @Override // xsna.jsf0
    public final boolean e(int i, UserId userId) {
        gsf0.a aVar = this.a.e;
        return aVar != null && epx.f(aVar.a, userId) && aVar.b == i;
    }

    @Override // xsna.jsf0
    public final io.reactivex.rxjava3.core.q<s3q0> f() {
        return this.a.d;
    }

    @Override // xsna.jsf0
    public final boolean g() {
        return this.a.a();
    }

    @Override // xsna.jsf0
    public final void h() {
        this.a.e = null;
    }

    @Override // xsna.jsf0
    public final io.reactivex.rxjava3.core.x i(int i, UserId userId) {
        gsf0 gsf0Var = this.a;
        gsf0.a aVar = gsf0Var.e;
        if (aVar != null) {
            if (!epx.f(aVar.a, userId) || aVar.b != i) {
                aVar = null;
            }
            if (aVar != null) {
                return io.reactivex.rxjava3.core.x.k(new isf0(Collections.singletonList(aVar.c)));
            }
        }
        gsf0Var.a.getClass();
        tfx tfxVar = new tfx("video.getRelatedAudios", new oyh0(5), new iub0(5));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "video_id", i, 1, 0, 8);
        dz2 x = yfb.x(tfxVar);
        if (!gsf0Var.c.b()) {
            x.d = true;
            x.c = true;
        }
        return new io.reactivex.rxjava3.internal.operators.single.o(rsg0.w0(x).l(new kxa0(new hoh(pns0.a, 9), 4)), new g600(new dsf0(gsf0Var, userId, i), 19));
    }
}
