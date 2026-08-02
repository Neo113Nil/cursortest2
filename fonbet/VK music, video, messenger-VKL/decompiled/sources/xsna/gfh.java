package xsna;

import android.os.SystemClock;

/* compiled from: CommunityProfileContentAlbumAdapter.kt */
/* loaded from: classes5.dex */
public final class gfh implements df90 {
    public final /* synthetic */ ffh b;

    public gfh(ffh ffhVar) {
        this.b = ffhVar;
    }

    @Override // xsna.df90
    public final void e(int i, int i2, int i3, int i4) {
        if (i - 5 > i3 || i3 > i) {
            return;
        }
        ffh ffhVar = this.b;
        m2l m2lVar = ffhVar.n;
        m2lVar.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = m2lVar.a;
        boolean z = j == 0 || elapsedRealtime - j > 300;
        if (z) {
            m2lVar.a = elapsedRealtime;
        }
        if (z) {
            ffhVar.m.invoke();
        }
    }

    @Override // xsna.df90
    public final void l(int i) {
    }
}
