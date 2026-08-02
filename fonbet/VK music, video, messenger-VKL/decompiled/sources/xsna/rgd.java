package xsna;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.vk.clips.clipsaudio.views.ClipsAudioFragment;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.dto.clips.music.ClipsEditorMusicTrack;
import com.vk.dto.music.MusicTrack;
import com.vk.storycamera.utils.CatalogModalBottomSheetFragment;
import com.vkontakte.android.R;
import xsna.h7u0;

/* compiled from: ClipsAudioControllerImpl.kt */
/* loaded from: classes16.dex */
public final class rgd {
    public final Context a;
    public final a b;
    public ClipsEditorMusicInfo c;
    public int d;
    public io.reactivex.rxjava3.disposables.c e;
    public io.reactivex.rxjava3.disposables.c f;
    public io.reactivex.rxjava3.disposables.c g;

    /* compiled from: ClipsAudioControllerImpl.kt */
    public static final class a {
        public final CameraUIView a;
        public final com.vk.cameraui.impl.a b;
        public final dm9 c;
        public final jpd d;

        public a(CameraUIView cameraUIView, com.vk.cameraui.impl.a aVar, dm9 dm9Var, jpd jpdVar) {
            this.a = cameraUIView;
            this.b = aVar;
            this.c = dm9Var;
            this.d = jpdVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c) && this.d.equals(aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "ClipsAudioCameraParams(view=" + this.a + ", presenter=" + this.b + ", deps=" + this.c + ", clipsDelegate=" + this.d + ')';
        }
    }

    public rgd(Context context, a aVar) {
        this.a = context;
        this.b = aVar;
    }

    public final void a(ClipsEditorMusicInfo clipsEditorMusicInfo) {
        a aVar = this.b;
        com.vk.cameraui.impl.a aVar2 = aVar.b;
        CameraUIView cameraUIView = aVar.a;
        boolean z = clipsEditorMusicInfo.j;
        ClipsEditorMusicTrack clipsEditorMusicTrack = clipsEditorMusicInfo.b;
        if (z) {
            lmv clipsControls = cameraUIView.getClipsControls();
            if (clipsControls != null) {
                clipsControls.Z0();
            }
            aVar2.W0();
        } else if (clipsEditorMusicInfo.i) {
            lmv clipsControls2 = cameraUIView.getClipsControls();
            if (clipsControls2 != null) {
                clipsControls2.setMusicThumb(hxd.c(clipsEditorMusicTrack).Jb());
            }
        } else {
            lmv clipsControls3 = cameraUIView.getClipsControls();
            if (clipsControls3 != null) {
                clipsControls3.setMusicThumb(hxd.c(clipsEditorMusicTrack).Jb());
            }
            aVar2.T(hxd.d(clipsEditorMusicInfo));
        }
        this.c = clipsEditorMusicInfo;
    }

    public final void b() {
        a aVar = this.b;
        CameraUIView cameraUIView = aVar.a;
        lmv clipsControls = cameraUIView.getClipsControls();
        if (clipsControls != null) {
            clipsControls.B1();
        }
        cameraUIView.n0(null, 0L);
        this.c = null;
        this.d = 0;
        aVar.b.W0();
    }

    public final void c() {
        io.reactivex.rxjava3.disposables.c cVar = this.e;
        if (cVar != null) {
            cVar.dispose();
        }
        this.e = null;
        io.reactivex.rxjava3.disposables.c cVar2 = this.f;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.f = null;
        io.reactivex.rxjava3.disposables.c cVar3 = this.g;
        if (cVar3 != null) {
            cVar3.dispose();
        }
        this.g = null;
    }

    public final ClipsEditorMusicInfo d() {
        ClipsEditorMusicInfo clipsEditorMusicInfo = this.c;
        if (clipsEditorMusicInfo != null) {
            return ClipsEditorMusicInfo.zb(clipsEditorMusicInfo, null, null, clipsEditorMusicInfo.d + this.d, 0, 0, null, 0, 2043);
        }
        return null;
    }

    public final void e() {
        int i = h7u0.p;
        h7u0.a c = h7u0.b.c(this.a);
        c.g0(R.string.clips_audio_extraction_error_title);
        c.U(R.string.clips_audio_extraction_error_explanation);
        c.c0(R.string.clips_audio_extraction_error_retry_buttom, new yb5(this, 1));
        c.W(R.string.clips_audio_extraction_error_close_button, new o1c());
        c.m();
    }

    public final void f() {
        if (this.e == null) {
            this.e = bh6.m.subscribe(new ez(new com.vk.movika.sdk.base.observable.g(this, 17), 10));
        }
        Context context = this.a;
        if (!j8.d(context)) {
            int i = CatalogModalBottomSheetFragment.X;
            CatalogModalBottomSheetFragment.a.a(context, CatalogModalBottomSheetFragment.Content.CLIPS, null, 12);
            nf9.b.h(false, null, null);
        }
        nf9.b.h(false, null, null);
    }

    public final void g(MusicTrack musicTrack, ClipsEditorMusicInfo clipsEditorMusicInfo) {
        ClipsAudioFragment.a aVar = new ClipsAudioFragment.a(ClipsAudioFragment.class, null, null);
        dhr0.a.getClass();
        aVar.w(dhr0.u().c);
        aVar.s(true);
        ClipsAudioFragment clipsAudioFragment = (ClipsAudioFragment) aVar.f();
        hb hbVar = new hb(this, 25);
        yg ygVar = new yg(this, 22);
        go1 go1Var = new go1(this, 20);
        clipsAudioFragment.Td(((AppCompatActivity) e3m.h(this.a)).getSupportFragmentManager(), "clips_audio_fragment");
        clipsAudioFragment.Q = hbVar;
        clipsAudioFragment.R = ygVar;
        clipsAudioFragment.S = go1Var;
        Bundle arguments = clipsAudioFragment.getArguments();
        if (arguments != null) {
            arguments.putParcelable("clips_audio_track", musicTrack);
        }
        Bundle arguments2 = clipsAudioFragment.getArguments();
        if (arguments2 != null) {
            arguments2.putParcelable("clips_audio_music_info", clipsEditorMusicInfo);
        }
    }
}
