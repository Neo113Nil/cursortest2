package defpackage;

import androidx.media3.exoplayer.upstream.a;
import java.io.Closeable;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class njl0 implements Closeable {
    public static final Charset z = StandardCharsets.UTF_8;
    public final o8g0 a;
    public final a b = new a("ExoPlayer:RtspMessageChannel:ReceiverLoader");
    public final Map c = Collections.synchronizedMap(new HashMap());
    public mjl0 w;
    public Socket x;
    public volatile boolean y;

    public njl0(o8g0 o8g0Var) {
        this.a = o8g0Var;
    }

    public final void a(Socket socket) {
        this.x = socket;
        this.w = new mjl0(this, socket.getOutputStream());
        this.b.g(new ljl0(this, socket.getInputStream()), new ity(this), 0);
    }

    public final void c(List list) {
        d6z.z(this.w);
        mjl0 mjl0Var = this.w;
        mjl0Var.getClass();
        mjl0Var.c.post(new ajl0(mjl0Var, new mf1(ojl0.h).i(list).getBytes(z), list));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.y) {
            return;
        }
        try {
            mjl0 mjl0Var = this.w;
            if (mjl0Var != null) {
                mjl0Var.close();
            }
            this.b.f(null);
            Socket socket = this.x;
            if (socket != null) {
                socket.close();
            }
            this.y = true;
        } catch (Throwable th) {
            this.y = true;
            throw th;
        }
    }
}
