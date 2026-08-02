package sg.bigo.ads.cw;

import android.os.SystemClock;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import ru.ok.android.webrtc.signaling.transport.SignalingTransport;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes9.dex */
public final class d {
    ServerSocket b;
    public int c;
    private Thread f;
    private h g;
    private final Object d = new Object();
    final sg.bigo.ads.bh.e a = new sg.bigo.ads.bh.e("Play", 3, 0);
    private final Map<String, e> e = new ConcurrentHashMap();

    public final class a implements Runnable {
        private final Socket b;

        public a(Socket socket) {
            this.b = socket;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v15, types: [sg.bigo.ads.cw.e] */
        /* JADX WARN: Type inference failed for: r6v2 */
        @Override // java.lang.Runnable
        public final void run() {
            d dVar;
            final d dVar2;
            Socket socket;
            d dVar3;
            e eVar;
            long j;
            String str;
            d dVar4 = d.this;
            Socket socket2 = this.b;
            try {
                try {
                    try {
                        sg.bigo.ads.cw.b a = sg.bigo.ads.cw.b.a(socket2.getInputStream());
                        if (a == null) {
                            d.a(socket2);
                            dVar4.b();
                            return;
                        }
                        a.toString();
                        String f = r.f(a.a);
                        if (SignalingTransport.PING.equals(f)) {
                            try {
                                OutputStream outputStream = socket2.getOutputStream();
                                outputStream.write("HTTP/1.1 200 OK\n\n".getBytes());
                                outputStream.write("ping ok".getBytes());
                            } catch (IOException e) {
                                sg.bigo.ads.bn.a.a(0, "ProxyCache", "Pinger#responseToPing, error message is : " + e.toString());
                            }
                        } else if (!TextUtils.isEmpty(f)) {
                            dVar2 = dVar4.a(f);
                            try {
                                if (dVar2.a()) {
                                    try {
                                        if (SystemClock.elapsedRealtime() - dVar2.e > 300000) {
                                            dVar2.f.getAndSet(0);
                                            dVar2.e = SystemClock.elapsedRealtime();
                                        }
                                        dVar2.a.incrementAndGet();
                                        boolean z = true;
                                        if (dVar2.c != null && dVar2.c.j != 1 && !dVar2.c.b() && SystemClock.elapsedRealtime() - dVar2.d > 15000 && dVar2.f.getAndIncrement() < 3) {
                                            dVar2.f.get();
                                            dVar2.d = SystemClock.elapsedRealtime();
                                            sg.bigo.ads.bh.d.a(1, new Runnable() { // from class: sg.bigo.ads.cw.e.1
                                                public AnonymousClass1() {
                                                }

                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    sg.bigo.ads.core.player.b.a().c.a(e.this.c, true);
                                                }
                                            });
                                        }
                                        c cVar = dVar2.b;
                                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket2.getOutputStream());
                                        String a2 = sg.bigo.ads.common.utils.g.a(r.f(a.a));
                                        boolean isEmpty = TextUtils.isEmpty(a2);
                                        long a3 = cVar.a.c() ? cVar.a.a() : cVar.a.b.i;
                                        boolean z2 = a3 >= 0;
                                        boolean z3 = a.c;
                                        if (z3) {
                                            eVar = dVar2;
                                            try {
                                                j = a3 - a.b;
                                            } catch (Throwable th) {
                                                th = th;
                                                eVar.b();
                                                throw th;
                                            }
                                        } else {
                                            eVar = dVar2;
                                            j = a3;
                                        }
                                        if (!z2 || !z3) {
                                            z = false;
                                        }
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(a.c ? "HTTP/1.1 206 PARTIAL CONTENT\n" : "HTTP/1.1 200 OK\n");
                                        sb.append("Accept-Ranges: bytes\n");
                                        sb.append(z2 ? c.a("Content-Length: %d\n", Long.valueOf(j)) : "");
                                        if (z) {
                                            dVar3 = dVar4;
                                            socket = socket2;
                                            try {
                                                str = c.a("Content-Range: bytes %d-%d/%d\n", Long.valueOf(a.b), Long.valueOf(a3 - 1), Long.valueOf(a3));
                                            } catch (Throwable th2) {
                                                th = th2;
                                                eVar.b();
                                                throw th;
                                            }
                                        } else {
                                            dVar3 = dVar4;
                                            socket = socket2;
                                            str = "";
                                        }
                                        sb.append(str);
                                        sb.append(isEmpty ? "" : c.a("Content-Type: %s\n", a2));
                                        sb.append("\n");
                                        bufferedOutputStream.write(sb.toString().getBytes(C.UTF8_NAME));
                                        cVar.a(bufferedOutputStream, a.b);
                                        eVar.b();
                                        d.a(socket);
                                        dVar3.b();
                                    } catch (Throwable th3) {
                                        th = th3;
                                        eVar = dVar2;
                                    }
                                } else {
                                    sg.bigo.ads.bn.a.a(0, "ProxyCache", "startProcessRequest failed");
                                    dVar2.b();
                                }
                            } catch (SocketException unused) {
                                sg.bigo.ads.bn.a.a(0, "ProxyCache", "Closing socket… Socket is closed by client.");
                                d.a(socket2);
                                dVar2.b();
                                return;
                            } catch (IOException e2) {
                                e = e2;
                                dVar = dVar2;
                                sg.bigo.ads.bn.a.a(0, "ProxyCache", "Error processing request, error message is : " + e.toString());
                                d.a(socket2);
                                dVar.b();
                            } catch (j e3) {
                                e = e3;
                                dVar = dVar2;
                                sg.bigo.ads.bn.a.a(0, "ProxyCache", "Error processing request, error message is : " + e.toString());
                                d.a(socket2);
                                dVar.b();
                            }
                        }
                        dVar3 = dVar4;
                        socket = socket2;
                        d.a(socket);
                        dVar3.b();
                    } catch (Throwable th4) {
                        th = th4;
                        d.a(socket2);
                        dVar4.b();
                        throw th;
                    }
                } catch (SocketException unused2) {
                    dVar2 = dVar4;
                } catch (IOException e4) {
                    e = e4;
                    dVar = dVar4;
                    sg.bigo.ads.bn.a.a(0, "ProxyCache", "Error processing request, error message is : " + e.toString());
                    d.a(socket2);
                    dVar.b();
                }
            } catch (j e5) {
                e = e5;
                dVar = dVar4;
                sg.bigo.ads.bn.a.a(0, "ProxyCache", "Error processing request, error message is : " + e.toString());
                d.a(socket2);
                dVar.b();
            } catch (Throwable th5) {
                th = th5;
                d.a(socket2);
                dVar4.b();
                throw th;
            }
        }
    }

    public final class b implements Runnable {
        private final CountDownLatch b;

        public b(CountDownLatch countDownLatch) {
            this.b = countDownLatch;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.b.countDown();
            d dVar = d.this;
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Socket accept = dVar.b.accept();
                    Objects.toString(accept);
                    dVar.a.submit(dVar.new a(accept));
                } catch (Throwable th) {
                    sg.bigo.ads.da.b.a(3005, 10111, th.toString());
                    sg.bigo.ads.bn.a.a(0, "ProxyCache", "Error during waiting connection, error message is : " + th.toString());
                    return;
                }
            }
        }
    }

    public d() {
        try {
            ServerSocket serverSocket = new ServerSocket(0, 8, InetAddress.getByName("127.0.0.1"));
            this.b = serverSocket;
            int localPort = serverSocket.getLocalPort();
            this.c = localPort;
            f.a("127.0.0.1", localPort);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Thread thread = new Thread(new b(countDownLatch));
            this.f = thread;
            thread.setName("BGAd-Conn");
            this.f.start();
            countDownLatch.await();
            this.g = new h("127.0.0.1", this.c);
            a();
        } catch (IOException | InterruptedException e) {
            this.a.shutdown();
            sg.bigo.ads.da.b.a(3005, 10110, "Error starting local proxy server, error message is : " + e.toString());
            sg.bigo.ads.bn.a.a(0, "ProxyCache", "Error starting local proxy server, error message is : " + e.toString());
        }
    }

    public final e a(String str) {
        e eVar;
        synchronized (this.d) {
            try {
                eVar = this.e.get(str);
                if (eVar == null) {
                    eVar = new e(str);
                    this.e.put(str, eVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public final int b() {
        int i;
        synchronized (this.d) {
            try {
                Iterator<e> it = this.e.values().iterator();
                i = 0;
                while (it.hasNext()) {
                    i += it.next().a.get();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(3:2|3|(1:5))|7|8|(1:10)|12|13|(2:15|17)(1:19)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0031, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0032, code lost:
    
        sg.bigo.ads.bn.a.a(0, "ProxyCache", "Failed to close socket on proxy side: {}. It seems client have already closed connection." + r2.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d A[Catch: IOException -> 0x0031, TRY_LEAVE, TryCatch #1 {IOException -> 0x0031, blocks: (B:8:0x0027, B:10:0x002d), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d A[Catch: IOException -> 0x0051, TRY_LEAVE, TryCatch #0 {IOException -> 0x0051, blocks: (B:13:0x0047, B:15:0x004d), top: B:12:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Socket socket) {
        String str;
        try {
            try {
                if (!socket.isInputShutdown()) {
                    socket.shutdownInput();
                }
            } catch (SocketException unused) {
                str = "Releasing input stream… Socket is closed by client.";
                sg.bigo.ads.bn.a.a(0, "ProxyCache", str);
                if (!socket.isOutputShutdown()) {
                }
                if (socket.isClosed()) {
                }
            } catch (IOException e) {
                str = "Error closing socket input stream, error message is " + e.getMessage();
                sg.bigo.ads.bn.a.a(0, "ProxyCache", str);
                if (!socket.isOutputShutdown()) {
                }
                if (socket.isClosed()) {
                }
            }
            if (socket.isClosed()) {
                return;
            }
            socket.close();
            return;
        } catch (IOException e2) {
            sg.bigo.ads.bn.a.a(0, "ProxyCache", "Error closing socket" + e2.getMessage());
            return;
        }
        if (!socket.isOutputShutdown()) {
            socket.shutdownOutput();
        }
    }

    public final boolean a() {
        h hVar = this.g;
        return hVar != null && hVar.a();
    }
}
