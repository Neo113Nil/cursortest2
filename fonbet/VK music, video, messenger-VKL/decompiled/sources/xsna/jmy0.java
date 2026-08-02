package xsna;

import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: Receiver.java */
/* loaded from: classes8.dex */
public final class jmy0 {
    public volatile DatagramSocket a;
    public final ggy0 b;
    public final ojs c;
    public final Thread d;
    public final LinkedBlockingQueue e;
    public volatile boolean f = false;

    public jmy0(DatagramSocket datagramSocket, sp spVar, ggy0 ggy0Var, ojs ojsVar) {
        Objects.requireNonNull(datagramSocket);
        this.a = datagramSocket;
        this.b = ggy0Var;
        this.c = ojsVar;
        Thread thread = new Thread(new xw1(this, 20), "receiver");
        this.d = thread;
        thread.setDaemon(true);
        this.e = new LinkedBlockingQueue();
        try {
            datagramSocket.getReceiveBufferSize();
        } catch (SocketException unused) {
        }
    }
}
