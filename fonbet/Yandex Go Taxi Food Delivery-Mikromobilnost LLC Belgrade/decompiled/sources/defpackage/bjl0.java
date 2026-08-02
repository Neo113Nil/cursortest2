package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import androidx.media3.exoplayer.rtsp.RtspMediaSource$RtspPlaybackException;
import com.google.common.collect.ImmutableMap;
import java.io.Closeable;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Locale;
import javax.net.SocketFactory;

/* loaded from: classes10.dex */
public final class bjl0 implements Closeable {
    public Uri A;
    public ga0 C;
    public String D;
    public zil0 F;
    public lg G;
    public boolean I;
    public boolean J;
    public boolean K;
    public final ngg a;
    public final ngg b;
    public final String c;
    public final SocketFactory w;
    public final ArrayDeque x = new ArrayDeque();
    public final SparseArray y = new SparseArray();
    public final o3 z = new o3(this);
    public njl0 B = new njl0(new o8g0(this));
    public long E = 60000;
    public long L = -9223372036854775807L;
    public int H = -1;

    public bjl0(ngg nggVar, ngg nggVar2, String str, Uri uri, SocketFactory socketFactory) {
        this.a = nggVar;
        this.b = nggVar2;
        this.c = str;
        this.w = socketFactory;
        this.A = ojl0.f(uri);
        this.C = ojl0.d(uri);
    }

    public static void a(bjl0 bjl0Var, RtspMediaSource$RtspPlaybackException rtspMediaSource$RtspPlaybackException) {
        if (bjl0Var.I) {
            bjl0Var.b.c(rtspMediaSource$RtspPlaybackException);
            return;
        }
        ngg nggVar = bjl0Var.a;
        String message = rtspMediaSource$RtspPlaybackException.getMessage();
        if (message == null) {
            message = "";
        }
        nggVar.f(message, rtspMediaSource$RtspPlaybackException);
    }

    public final void c() {
        long l0;
        fjl0 fjl0Var = (fjl0) this.x.pollFirst();
        if (fjl0Var == null) {
            hjl0 hjl0Var = (hjl0) this.b.b;
            long j = hjl0Var.G;
            if (j != -9223372036854775807L) {
                l0 = tw21.l0(j);
            } else {
                long j2 = hjl0Var.H;
                l0 = j2 != -9223372036854775807L ? tw21.l0(j2) : 0L;
            }
            hjl0Var.w.k(l0);
            return;
        }
        Uri uri = fjl0Var.b.b.b;
        d6z.z(fjl0Var.c);
        String str = fjl0Var.c;
        String str2 = this.D;
        o3 o3Var = this.z;
        ((bjl0) o3Var.c).H = 0;
        o3Var.K(o3Var.t(10, str2, ImmutableMap.g("Transport", str), uri));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        zil0 zil0Var = this.F;
        if (zil0Var != null) {
            zil0Var.close();
            this.F = null;
            Uri uri = this.A;
            String str = this.D;
            str.getClass();
            o3 o3Var = this.z;
            bjl0 bjl0Var = (bjl0) o3Var.c;
            int i = bjl0Var.H;
            if (i != -1 && i != 0) {
                bjl0Var.H = 0;
                o3Var.K(o3Var.t(12, str, ImmutableMap.f(), uri));
            }
        }
        this.B.close();
    }

    public final Socket d(Uri uri) {
        d6z.l(uri.getHost() != null);
        int port = uri.getPort() > 0 ? uri.getPort() : 554;
        String host = uri.getHost();
        host.getClass();
        return this.w.createSocket(host, port);
    }

    public final void e(long j) {
        if (this.H == 2 && !this.K) {
            Uri uri = this.A;
            String str = this.D;
            str.getClass();
            o3 o3Var = this.z;
            bjl0 bjl0Var = (bjl0) o3Var.c;
            d6z.x(bjl0Var.H == 2);
            o3Var.K(o3Var.t(5, str, ImmutableMap.f(), uri));
            bjl0Var.K = true;
        }
        this.L = j;
    }

    public final void k(long j) {
        Uri uri = this.A;
        String str = this.D;
        str.getClass();
        o3 o3Var = this.z;
        int i = ((bjl0) o3Var.c).H;
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        d6z.x(z);
        qjl0 qjl0Var = qjl0.c;
        Object[] objArr = {Double.valueOf(j / 1000.0d)};
        int i2 = tw21.a;
        o3Var.K(o3Var.t(6, str, ImmutableMap.g("Range", String.format(Locale.US, "npt=%.3f-", objArr)), uri));
    }
}
