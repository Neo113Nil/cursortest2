package xsna;

import android.webkit.URLUtil;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.dto.clips.music.ClipsEditorMusicTrack;
import com.vk.dto.music.MusicTrack;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.ngd;
import xsna.tgd;
import xsna.xgd;

/* compiled from: ClipsAudioFeature.kt */
/* loaded from: classes16.dex */
public final class ugd extends wk50<bhd, zgd, ngd, xgd> {
    public final f4z f;
    public final bpn0 g;

    public ugd(ygd ygdVar) {
        super(ngd.c.b, ygdVar);
        this.f = new f4z();
        this.g = new bpn0(new tj2(4));
    }

    @Override // xsna.wk50
    public final void N(zgd zgdVar, ngd ngdVar) {
        zgd zgdVar2 = zgdVar;
        ngd ngdVar2 = ngdVar;
        int i = zgdVar2.f;
        if (ngdVar2 instanceof ngd.c) {
            return;
        }
        boolean z = ngdVar2 instanceof ngd.d;
        f4z f4zVar = this.f;
        if (z) {
            f4zVar.b(new tgd.c(((ngd.d) ngdVar2).b));
            return;
        }
        if (ngdVar2 instanceof ngd.k) {
            T(new xgd.b(((ngd.k) ngdVar2).b));
            return;
        }
        if (ngdVar2 instanceof ngd.j) {
            T(new xgd.a(((ngd.j) ngdVar2).b));
            return;
        }
        if (ngdVar2 instanceof ngd.n) {
            MusicTrack musicTrack = ((ngd.n) ngdVar2).b;
            if (musicTrack != null && i <= 0) {
                if (URLUtil.isFileUrl(musicTrack.i)) {
                    T(new xgd.c(Integer.min(musicTrack.c0, ynd.f) / 1000.0f));
                    T(new xgd.d(0, true, musicTrack.c0, false, 0));
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(musicTrack.c.b);
                sb.append('_');
                sb.append(musicTrack.b);
                a7f0.a.f(this, rsg0.w0(yfb.x(((mgj0) this.g.getValue()).t(sb.toString()))).l(new pb(new ob(9), 8)), new k8(6, musicTrack, this), new x4(15), 1);
                return;
            }
            return;
        }
        if (ngdVar2 instanceof ngd.a) {
            f4zVar.b(tgd.a.a);
            return;
        }
        if (ngdVar2 instanceof ngd.m) {
            ngd.m mVar = (ngd.m) ngdVar2;
            T(new xgd.d(mVar.b, zgdVar2.h, mVar.c, true, zgdVar2.g));
            return;
        }
        if (ngdVar2 instanceof ngd.o) {
            int i2 = ((ngd.o) ngdVar2).b;
            T(new xgd.e(i2));
            if (i2 > i) {
                f4zVar.b(tgd.f.a);
                return;
            }
            return;
        }
        if (ngdVar2 instanceof ngd.l) {
            T(new xgd.c(((ngd.l) ngdVar2).b));
            return;
        }
        if (ngdVar2 instanceof ngd.i) {
            f4zVar.b(tgd.e.a);
            return;
        }
        if (ngdVar2 instanceof ngd.h) {
            T(new xgd.f(false));
            return;
        }
        if (ngdVar2 instanceof ngd.f) {
            T(new xgd.f(true));
            return;
        }
        if (ngdVar2 instanceof ngd.g) {
            T(new xgd.f(!zgdVar2.i));
            return;
        }
        if (!(ngdVar2 instanceof ngd.e)) {
            if (!(ngdVar2 instanceof ngd.b)) {
                throw new NoWhenBranchMatchedException();
            }
            f4zVar.b(tgd.b.a);
        } else {
            MusicTrack musicTrack2 = zgdVar2.b;
            if (musicTrack2 == null) {
                return;
            }
            ClipsEditorMusicTrack b = hxd.b(musicTrack2);
            String str = musicTrack2.i;
            f4zVar.b(new tgd.d(new ClipsEditorMusicInfo(b, str == null ? "" : str, zgdVar2.e, zgdVar2.f, 0, null, zgdVar2.g, false, URLUtil.isFileUrl(str), null, false)));
        }
    }
}
