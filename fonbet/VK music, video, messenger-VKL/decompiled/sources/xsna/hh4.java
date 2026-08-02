package xsna;

import android.app.Activity;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookPerson;
import com.vk.music.bottomsheets.audiobook.AudioBookPersonBottomSheetLaunchPoint;
import com.vk.music.common.MusicPlaybackLaunchContext;
import java.util.List;

/* compiled from: AudioBookInteractorImpl.kt */
/* loaded from: classes3.dex */
public final class hh4 implements ch4 {
    public final tj4 a;
    public final bpn0 b;
    public final bpn0 c;
    public final bpn0 d;

    public hh4(tj4 tj4Var, bpn0 bpn0Var, bpn0 bpn0Var2, bpn0 bpn0Var3) {
        this.a = tj4Var;
        this.b = bpn0Var;
        this.c = bpn0Var2;
        this.d = bpn0Var3;
    }

    @Override // xsna.ch4
    public final io.reactivex.rxjava3.internal.operators.single.s a(int i, String str, boolean z) {
        int i2;
        io.reactivex.rxjava3.internal.operators.single.y l;
        tj4 tj4Var = this.a;
        if (z) {
            tj4Var.b.getClass();
            tfx tfxVar = new tfx("kidsCollection.addAudiobook", new l4(21), new nq(14));
            tfx.l(tfxVar, "audio_book_id", i, 0, 0, 12);
            i2 = i;
            if (str != null) {
                tfx.o(tfxVar, "ref", str, 0, 0, 12);
            }
            l = rsg0.w0(yfb.x(tfxVar)).l(new rj4(new af2(1), 0));
        } else {
            i2 = i;
            tj4Var.a.getClass();
            tfx tfxVar2 = new tfx("audioBooks.addToFavorites", new xr(3), new io.reactivex.rxjava3.processors.b(3));
            tfx.l(tfxVar2, "audio_book_id", i2, 0, 0, 8);
            l = rsg0.w0(yfb.x(tfxVar2)).l(new sj4(new vd1(3), 0));
        }
        return new io.reactivex.rxjava3.internal.operators.single.s(new io.reactivex.rxjava3.internal.operators.single.o(l, new cw(new fh4(this, i2, 0), 3)), new m40(new gh4(i2), 2));
    }

    @Override // xsna.ch4
    public final io.reactivex.rxjava3.core.x<AudioBook> b(int i, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        String Lb = musicPlaybackLaunchContext.Lb();
        this.a.a.getClass();
        tfx tfxVar = new tfx("audioBooks.getAudioBookById", new io.reactivex.rxjava3.subjects.b(4), new io.reactivex.rxjava3.subjects.c(5));
        tfx.l(tfxVar, "audio_book_id", i, 0, 0, 8);
        if (Lb != null) {
            tfx.o(tfxVar, "ref", Lb, 0, 0, 12);
        }
        int i2 = 0;
        return rsg0.w0(yfb.x(tfxVar)).l(new pj4(new p60(4), i2)).l(new qj4(new g53(2), i2));
    }

    @Override // xsna.ch4
    public final io.reactivex.rxjava3.internal.operators.single.s c(int i, String str, boolean z) {
        int i2;
        io.reactivex.rxjava3.internal.operators.single.y l;
        tj4 tj4Var = this.a;
        if (z) {
            tj4Var.b.getClass();
            tfx tfxVar = new tfx("kidsCollection.removeAudiobook", new oq(15), new pq(11));
            tfx.l(tfxVar, "audio_book_id", i, 0, 0, 12);
            i2 = i;
            if (str != null) {
                tfx.o(tfxVar, "ref", str, 0, 0, 12);
            }
            l = rsg0.w0(yfb.x(tfxVar)).l(new t34(new b40(2), 1));
        } else {
            i2 = i;
            tj4Var.a.getClass();
            tfx tfxVar2 = new tfx("audioBooks.deleteFromFavorites", new vr(3), new wr(4));
            tfx.l(tfxVar2, "audio_book_id", i2, 0, 0, 8);
            l = rsg0.w0(yfb.x(tfxVar2)).l(new dg1(new com.vk.movika.sdk.base.observable.u(3), 4));
        }
        int i3 = 2;
        return new io.reactivex.rxjava3.internal.operators.single.s(new io.reactivex.rxjava3.internal.operators.single.o(l, new k41(new dh4(this, i2, 0), i3)), new com.vk.movika.sdk.base.flow.binding.c(new eh4(i2, 0), i3));
    }

    @Override // xsna.ch4
    public final void d(Activity activity, List<AudioBookPerson> list, AudioBookPersonBottomSheetLaunchPoint audioBookPersonBottomSheetLaunchPoint, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        bpn0 bpn0Var = this.d;
        if (size > 1) {
            qd4.t(((fl4) bpn0Var.getValue()).w(), activity, audioBookPersonBottomSheetLaunchPoint, list, null, musicPlaybackLaunchContext, 8);
        } else if (jnj.j(((AudioBookPerson) j5g.Y(list)).g)) {
            i0q0.f(new i3r(activity, 2));
        } else {
            ((fl4) bpn0Var.getValue()).G(activity, ((AudioBookPerson) j5g.Y(list)).b, musicPlaybackLaunchContext);
        }
    }

    @Override // xsna.ch4
    public final io.reactivex.rxjava3.core.a e(int i) {
        return io.reactivex.rxjava3.internal.operators.completable.i.b;
    }
}
