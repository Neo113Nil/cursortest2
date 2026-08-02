package xsna;

import android.app.Activity;
import android.content.Context;
import com.vk.core.preference.Preference;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.audiobook.AudioBookChapterBottomSheetLaunchPoint;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.notifications.restriction.MusicRestrictionPopupDisplayer;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.h7u0;
import xsna.k840;

/* compiled from: AlertMusicTrackModel.kt */
/* loaded from: classes3.dex */
public final class ms1 implements a630 {
    public final a630 b;
    public final FunctionReferenceImpl c;
    public final MusicPlaybackLaunchContext d;
    public final lq40 e;
    public final lq40 f;
    public final MusicRestrictionPopupDisplayer g;
    public boolean h;

    public ms1() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ms1(a630 a630Var, gzs gzsVar) {
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = MusicPlaybackLaunchContext.d;
        lq40 d = k840.a.d();
        lq40 d2 = k840.a.d();
        com.vk.music.notifications.restriction.a aVar = k840.a.d;
        aVar = aVar == null ? null : aVar;
        this.b = a630Var;
        this.c = (FunctionReferenceImpl) gzsVar;
        this.d = musicPlaybackLaunchContext;
        this.e = d;
        this.f = d2;
        this.g = aVar;
    }

    @Override // xsna.a630
    public final boolean D(MusicTrack musicTrack) {
        return this.b.D(musicTrack);
    }

    @Override // xsna.a630
    public final io.reactivex.rxjava3.core.q<Boolean> E(MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        return this.b.E(musicTrack, musicPlaybackLaunchContext);
    }

    @Override // xsna.a630
    public final io.reactivex.rxjava3.core.q<Pair<int[], Playlist>> F(MusicTrack musicTrack, Playlist playlist, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        return this.b.F(musicTrack, playlist, musicPlaybackLaunchContext);
    }

    @Override // xsna.a630
    public final boolean G(MusicTrack musicTrack) {
        return this.b.G(musicTrack);
    }

    @Override // xsna.a630
    public final io.reactivex.rxjava3.core.q<Boolean> J(MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        return this.b.J(musicTrack, musicPlaybackLaunchContext);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    @Override // xsna.a630
    public final void M(Context context, MusicTrack musicTrack) {
        if (!((Boolean) this.c.invoke()).booleanValue()) {
            MusicRestrictionPopupDisplayer.e(this.g, context, "download", MusicPlaybackLaunchContext.d, null, null, null, 56);
            return;
        }
        a630 a630Var = this.b;
        if (!a630Var.i(musicTrack)) {
            a630Var.M(context, musicTrack);
            return;
        }
        int i = 0;
        gs1 gs1Var = new gs1(this, musicTrack, context, i);
        if (Preference.j().getBoolean("pref_track_to_mm", false)) {
            gs1Var.invoke();
            return;
        }
        boolean d = jnj.d(musicTrack.V);
        int i2 = h7u0.p;
        h7u0.a c = h7u0.b.c(context);
        c.g0(d ? R.string.music_download_not_in_my_kids_music : R.string.music_download_not_in_my_music);
        c.U(d ? R.string.music_download_not_in_my_kids_music_hint : R.string.music_download_not_in_my_music_hint);
        c.W(R.string.cancel, new ks1());
        c.c0(R.string.download, new ls1(gs1Var, i));
        c.m();
    }

    @Override // xsna.a630
    public final void P(Activity activity, int i, AudioBookChapter audioBookChapter, boolean z) {
        if (z || this.h) {
            this.b.P(activity, i, audioBookChapter, z);
            return;
        }
        this.h = true;
        ic40 w = lyd.g().w();
        bpn0 bpn0Var = enj.a;
        w.u(e3m.h(activity), new AudioBookChapterBottomSheetLaunchPoint.RemoveDownload(i, audioBookChapter.b, audioBookChapter.j));
    }

    @Override // xsna.a630
    public final io.reactivex.rxjava3.core.q<Boolean> Q(int i, boolean z, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        return this.b.Q(i, z, musicPlaybackLaunchContext);
    }

    @Override // xsna.a630
    public final io.reactivex.rxjava3.core.q<Playlist> V(MusicTrack musicTrack, Playlist playlist) {
        return this.b.V(musicTrack, playlist);
    }

    @Override // xsna.a630
    public final void W(Context context, MusicTrack musicTrack, boolean z, List<String> list) {
        if (z || this.h) {
            a630.d1(this.b, context, musicTrack, z);
            return;
        }
        this.h = true;
        ic40 w = lyd.g().w();
        MusicBottomSheetLaunchPoint.Delete delete = MusicBottomSheetLaunchPoint.Delete.b;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = MusicPlaybackLaunchContext.d;
        u2b0 b = k840.a.g().b();
        bpn0 bpn0Var = enj.a;
        w.e(delete, musicPlaybackLaunchContext, this, this.e, b, musicTrack, this.b, z, e3m.h(context));
    }

    @Override // xsna.a630
    public final io.reactivex.rxjava3.core.q<Boolean> X0(MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        return this.b.X0(musicTrack, musicPlaybackLaunchContext);
    }

    @Override // xsna.a630
    public final io.reactivex.rxjava3.core.q<Integer> e1(MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext, boolean z) {
        return this.b.e1(musicTrack, musicPlaybackLaunchContext, true);
    }

    @Override // xsna.a630
    public final void f1(Context context, MusicTrack musicTrack, Playlist playlist) {
        this.b.f1(context, musicTrack, playlist);
    }

    @Override // xsna.a630
    public final boolean i(MusicTrack musicTrack) {
        return this.b.i(musicTrack);
    }

    @Override // xsna.a630
    public final boolean i0(MusicTrack musicTrack) {
        return this.b.i0(musicTrack);
    }

    @Override // xsna.a630
    public final io.reactivex.rxjava3.core.q<Boolean> j0(int i, boolean z, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        return this.b.j0(i, z, musicPlaybackLaunchContext);
    }

    @Override // xsna.a630
    public final boolean j1(MusicTrack musicTrack) {
        return this.b.j1(musicTrack);
    }

    @Override // xsna.a630
    public final void l0(List<String> list, MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext, gzs<s3q0> gzsVar) {
        this.b.l0(list, musicTrack, musicPlaybackLaunchContext, gzsVar);
    }

    @Override // xsna.a630
    public final io.reactivex.rxjava3.core.q<Boolean> p1(MusicTrack musicTrack, boolean z, boolean z2) {
        return this.b.p1(musicTrack, z, z2);
    }

    @Override // xsna.a630
    public final io.reactivex.rxjava3.core.q<Boolean> q1(MusicTrack musicTrack, boolean z) {
        return this.b.q1(musicTrack, z);
    }

    @Override // xsna.a630
    public final io.reactivex.rxjava3.core.q<List<String>> u1(MusicTrack musicTrack, boolean z) {
        return this.b.u1(musicTrack, z);
    }

    @Override // xsna.a630
    public final boolean y(MusicTrack musicTrack) {
        return this.b.y(musicTrack);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    @Override // xsna.a630
    public final void y1(Activity activity, AudioBook audioBook, AudioBookChapter audioBookChapter) {
        if (((Boolean) this.c.invoke()).booleanValue() || !audioBook.Fb()) {
            this.b.y1(activity, audioBook, audioBookChapter);
        } else {
            MusicRestrictionPopupDisplayer.d(this.g, jnj.d(audioBook.u) ? "audio_kids" : "audiobook", this.d, null, null, 12);
        }
    }
}
