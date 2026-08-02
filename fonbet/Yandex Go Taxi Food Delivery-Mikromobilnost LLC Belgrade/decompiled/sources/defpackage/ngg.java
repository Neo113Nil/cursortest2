package defpackage;

import android.net.Uri;
import androidx.media3.exoplayer.rtsp.RtspMediaSource$RtspPlaybackException;
import androidx.media3.exoplayer.rtsp.RtspMediaSource$RtspUdpUnsupportedTransportException;
import androidx.media3.exoplayer.upstream.a;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.net.BindException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* loaded from: classes10.dex */
public final class ngg implements oyy, tyl0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ngg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(pyy pyyVar, long j, long j2, boolean z) {
    }

    @Override // defpackage.tyl0
    public void b() {
        hjl0 hjl0Var = (hjl0) this.b;
        hjl0Var.b.post(new ejl0(hjl0Var, 1));
    }

    public void c(RtspMediaSource$RtspPlaybackException rtspMediaSource$RtspPlaybackException) {
        hjl0 hjl0Var = (hjl0) this.b;
        if (!(rtspMediaSource$RtspPlaybackException instanceof RtspMediaSource$RtspUdpUnsupportedTransportException) || hjl0Var.O) {
            hjl0Var.E = rtspMediaSource$RtspPlaybackException;
        } else {
            hjl0.d(hjl0Var);
        }
    }

    @Override // defpackage.oyy
    public final void d(pyy pyyVar, long j, long j2, boolean z) {
        switch (this.a) {
            case 0:
                ((ogg) this.b).j((hg90) pyyVar, j2);
                break;
            case 1:
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e(long j, ImmutableList immutableList) {
        kil0 kil0Var;
        ArrayList arrayList = new ArrayList(immutableList.size());
        for (int i = 0; i < immutableList.size(); i++) {
            String path = ((rjl0) immutableList.get(i)).c.getPath();
            path.getClass();
            arrayList.add(path);
        }
        for (int i2 = 0; i2 < ((hjl0) this.b).y.size(); i2++) {
            if (!arrayList.contains(((fjl0) ((hjl0) this.b).y.get(i2)).b.b.b.getPath())) {
                ijl0 ijl0Var = (ijl0) ((hjl0) this.b).z.b;
                ijl0Var.F = false;
                ijl0Var.i();
                if (((hjl0) this.b).m()) {
                    hjl0 hjl0Var = (hjl0) this.b;
                    hjl0Var.J = true;
                    hjl0Var.G = -9223372036854775807L;
                    hjl0Var.F = -9223372036854775807L;
                    hjl0Var.H = -9223372036854775807L;
                }
            }
        }
        for (int i3 = 0; i3 < immutableList.size(); i3++) {
            rjl0 rjl0Var = (rjl0) immutableList.get(i3);
            hjl0 hjl0Var2 = (hjl0) this.b;
            Uri uri = rjl0Var.c;
            ArrayList arrayList2 = hjl0Var2.x;
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList2.size()) {
                    kil0Var = null;
                    break;
                }
                if (!((gjl0) arrayList2.get(i4)).d) {
                    fjl0 fjl0Var = ((gjl0) arrayList2.get(i4)).a;
                    if (fjl0Var.b.b.b.equals(uri)) {
                        kil0Var = fjl0Var.b;
                        break;
                    }
                }
                i4++;
            }
            if (kil0Var != null) {
                long j2 = rjl0Var.a;
                if (j2 != -9223372036854775807L) {
                    lil0 lil0Var = kil0Var.A;
                    lil0Var.getClass();
                    if (!lil0Var.h) {
                        kil0Var.A.i = j2;
                    }
                }
                int i5 = rjl0Var.b;
                lil0 lil0Var2 = kil0Var.A;
                lil0Var2.getClass();
                if (!lil0Var2.h) {
                    kil0Var.A.j = i5;
                }
                if (((hjl0) this.b).m()) {
                    hjl0 hjl0Var3 = (hjl0) this.b;
                    if (hjl0Var3.G == hjl0Var3.F) {
                        long j3 = rjl0Var.a;
                        kil0Var.D = j;
                        kil0Var.E = j3;
                    }
                }
            }
        }
        boolean m = ((hjl0) this.b).m();
        hjl0 hjl0Var4 = (hjl0) this.b;
        if (!m) {
            long j4 = hjl0Var4.H;
            if (j4 == -9223372036854775807L || !hjl0Var4.O) {
                return;
            }
            hjl0Var4.e(j4);
            ((hjl0) this.b).H = -9223372036854775807L;
            return;
        }
        long j5 = hjl0Var4.G;
        long j6 = hjl0Var4.F;
        if (j5 == j6) {
            hjl0Var4.G = -9223372036854775807L;
            hjl0Var4.F = -9223372036854775807L;
        } else {
            hjl0Var4.G = -9223372036854775807L;
            hjl0Var4.e(j6);
        }
    }

    public void f(String str, IOException iOException) {
        ((hjl0) this.b).D = iOException == null ? new IOException(str) : new IOException(str, iOException);
    }

    @Override // defpackage.oyy
    public final void m(pyy pyyVar, long j, long j2) {
        boolean z;
        switch (this.a) {
            case 0:
                hg90 hg90Var = (hg90) pyyVar;
                ogg oggVar = (ogg) this.b;
                long j3 = hg90Var.a;
                npg npgVar = hg90Var.b;
                x7u0 x7u0Var = hg90Var.w;
                uwy uwyVar = new uwy(npgVar, x7u0Var.c, x7u0Var.w, j2, x7u0Var.b);
                oggVar.F.onLoadTaskConcluded(j3);
                oggVar.J.d(uwyVar, hg90Var.c);
                oggVar.g0 = ((Long) hg90Var.y).longValue() - j;
                oggVar.l(true);
                return;
            case 1:
                kil0 kil0Var = (kil0) pyyVar;
                hjl0 hjl0Var = (hjl0) this.b;
                long g = hjl0Var.g();
                ArrayList arrayList = hjl0Var.x;
                if (g == 0) {
                    if (hjl0Var.O) {
                        return;
                    }
                    hjl0.d(hjl0Var);
                    return;
                }
                int i = 0;
                while (true) {
                    if (i < arrayList.size()) {
                        gjl0 gjl0Var = (gjl0) arrayList.get(i);
                        if (gjl0Var.a.b == kil0Var) {
                            gjl0Var.a();
                        } else {
                            i++;
                        }
                    }
                }
                hjl0Var.w.H = 1;
                return;
            default:
                kgg kggVar = (kgg) this.b;
                synchronized (u0a1.b) {
                    z = u0a1.c;
                }
                if (z) {
                    kggVar.a();
                    return;
                } else {
                    kggVar.a.k(new IOException(new ConcurrentModificationException()));
                    return;
                }
        }
    }

    @Override // defpackage.oyy
    public final h0n p(pyy pyyVar, long j, long j2, IOException iOException, int i) {
        int i2 = this.a;
        h0n h0nVar = a.e;
        Object obj = this.b;
        switch (i2) {
            case 0:
                hg90 hg90Var = (hg90) pyyVar;
                ogg oggVar = (ogg) obj;
                xf10 xf10Var = oggVar.J;
                long j3 = hg90Var.a;
                npg npgVar = hg90Var.b;
                x7u0 x7u0Var = hg90Var.w;
                xf10Var.g(new uwy(npgVar, x7u0Var.c, x7u0Var.w, j2, x7u0Var.b), hg90Var.c, iOException, true);
                oggVar.F.onLoadTaskConcluded(hg90Var.a);
                oggVar.k(iOException);
                break;
            case 1:
                kil0 kil0Var = (kil0) pyyVar;
                hjl0 hjl0Var = (hjl0) obj;
                if (!hjl0Var.L) {
                    hjl0Var.D = iOException;
                    break;
                } else if (!(iOException.getCause() instanceof BindException)) {
                    hjl0Var.E = new RtspMediaSource$RtspPlaybackException(kil0Var.b.b.toString(), iOException);
                    break;
                } else {
                    int i3 = hjl0Var.N;
                    hjl0Var.N = i3 + 1;
                    if (i3 < 3) {
                        break;
                    }
                }
                break;
            default:
                ((kgg) obj).a.k(iOException);
                break;
        }
        return h0nVar;
    }
}
