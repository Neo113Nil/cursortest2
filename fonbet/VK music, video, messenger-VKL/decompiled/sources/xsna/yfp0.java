package xsna;

import com.vk.dto.music.AlbumLink;
import com.vk.dto.music.MusicTrack;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import java.util.ArrayList;
import xsna.tfp0;

/* compiled from: TrackMenuItemsFactory.kt */
/* loaded from: classes3.dex */
public final class yfp0 {
    public final MusicTrack a;
    public final a630 b;
    public final u2b0 c;
    public final g950 d;
    public final boolean e;

    public yfp0(MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint, MusicTrack musicTrack, a630 a630Var, u2b0 u2b0Var, g950 g950Var, boolean z) {
        this.a = musicTrack;
        this.b = a630Var;
        this.c = u2b0Var;
        this.d = g950Var;
        this.e = z;
    }

    public static void g(ArrayList arrayList) {
        arrayList.add(tfp0.b.o.b);
    }

    public final void a(ArrayList arrayList) {
        a630 a630Var = this.b;
        MusicTrack musicTrack = this.a;
        if (a630Var.i(musicTrack)) {
            if (this.e) {
                arrayList.add(tfp0.b.C3742b.b);
            } else if (jnj.h(musicTrack.V)) {
                arrayList.add(tfp0.b.a.b);
            } else {
                arrayList.add(tfp0.b.c.b);
            }
        }
    }

    public final void b(ArrayList arrayList) {
        a630 a630Var = this.b;
        MusicTrack musicTrack = this.a;
        if (!a630Var.G(musicTrack) || jnj.d(musicTrack.V)) {
            return;
        }
        arrayList.add(tfp0.b.e.b);
    }

    public final void c(ArrayList arrayList) {
        MusicTrack musicTrack = this.a;
        if (musicTrack.B() || this.e) {
            return;
        }
        arrayList.add(new tfp0.b.f(musicTrack.P));
    }

    public final void d(ArrayList arrayList) {
        AlbumLink albumLink = this.a.q;
        Integer valueOf = albumLink != null ? Integer.valueOf(albumLink.b) : null;
        if (valueOf == null || valueOf.intValue() == 0) {
            return;
        }
        arrayList.add(tfp0.b.i.b);
    }

    public final void e(ArrayList arrayList) {
        if (this.a.Bb() > 0) {
            arrayList.add(tfp0.b.j.b);
        } else {
            arrayList.add(tfp0.b.h.b);
        }
    }

    public final void f(ArrayList arrayList) {
        a630 a630Var = this.b;
        MusicTrack musicTrack = this.a;
        if (a630Var.i(musicTrack) || !a630Var.i0(musicTrack)) {
            return;
        }
        if (jnj.h(musicTrack.V)) {
            arrayList.add(tfp0.b.l.b);
        } else {
            arrayList.add(tfp0.b.m.b);
        }
    }
}
