package xsna;

import com.vk.dto.music.MusicTrack;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.r940;

/* compiled from: ListeningTimeMusicAnalyticsDataSource.kt */
/* loaded from: classes3.dex */
public final class mhz implements q940 {
    public final khz b;
    public r940 c;

    public mhz(khz khzVar) {
        this.b = khzVar;
    }

    public final void a(int i) {
        r940 r940Var = this.c;
        if (r940Var == null) {
            return;
        }
        r940.a aVar = r940Var.a;
        this.c = new r940(new r940.a(aVar.a, aVar.b + i));
    }

    @Override // xsna.q940
    public final r940 b() {
        r940 r940Var = this.c;
        if (r940Var != null) {
            return r940Var;
        }
        r940 r940Var2 = new r940(new r940.a(0, this.b.g()));
        this.c = r940Var2;
        return r940Var2;
    }

    @Override // xsna.u940
    public final List<ax1> e(s940 s940Var) {
        i7z i7zVar = s940Var.a;
        if (i7zVar.d) {
            return EmptyList.b;
        }
        long j = i7zVar.a;
        return fsk.D(this.b.m(i7zVar.b, j));
    }

    @Override // xsna.u940
    public final List<ax1> f(s940 s940Var) {
        i7z i7zVar = s940Var.a;
        if (i7zVar.d) {
            return EmptyList.b;
        }
        long j = i7zVar.a;
        ArrayList D = fsk.D(this.b.q(i7zVar.b, j));
        a(-D.size());
        return D;
    }

    @Override // xsna.q940
    public final ax1 h() {
        xm40 xm40Var;
        lhz o = this.b.o();
        if (o == null) {
            xm40Var = null;
        } else {
            boolean z = o.e;
            long j = o.a;
            my1.a(j);
            xm40Var = new xm40(j, o.c, o.d, o.b, o.f, z);
        }
        if (xm40Var != null) {
            a(-1);
        }
        return xm40Var;
    }

    @Override // xsna.q940
    public final void i(ax1 ax1Var) {
        lhz lhzVar;
        if (ax1Var instanceof xm40) {
            xm40 xm40Var = (xm40) ax1Var;
            long j = xm40Var.b;
            MusicTrack musicTrack = xm40Var.c;
            lhzVar = new lhz(j, xm40Var.d, xm40Var.e, musicTrack, xm40Var.f, xm40Var.a);
        } else {
            lhzVar = null;
        }
        if (lhzVar != null && this.b.n(lhzVar)) {
            a(1);
        }
    }
}
