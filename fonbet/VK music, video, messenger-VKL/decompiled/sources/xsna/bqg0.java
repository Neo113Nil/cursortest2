package xsna;

import android.util.Log;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URI;
import java.nio.ByteBuffer;
import one.video.player.live.proto.rtmp.ProtocolException;

/* compiled from: RtmpClient.java */
/* loaded from: classes8.dex */
public final class bqg0 implements Runnable {
    public final /* synthetic */ URI b;
    public final /* synthetic */ aqg0 c;

    /* compiled from: RtmpClient.java */
    public class a {
        public a() {
        }
    }

    /* compiled from: RtmpClient.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            aqg0 aqg0Var = bqg0.this.c;
            aqg0Var.s = true;
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.putInt(500000);
            allocate.position(0);
            aqg0Var.u(2, (byte) 5, allocate, false);
            if (65536 != aqg0Var.f) {
                ByteBuffer putInt = ByteBuffer.allocate(4).putInt(65536);
                putInt.position(0);
                aqg0Var.u(2, (byte) 1, putInt, false);
                aqg0Var.f = 65536;
            }
            aqg0.c(aqg0Var);
            aqg0Var.f();
        }
    }

    public bqg0(aqg0 aqg0Var, URI uri) {
        this.c = aqg0Var;
        this.b = uri;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.t = null;
        try {
            try {
                try {
                    try {
                        try {
                            InetAddress byName = InetAddress.getByName(this.b.getHost());
                            int port = this.b.getPort();
                            aqg0 aqg0Var = this.c;
                            if (port < 0) {
                                port = 1935;
                            }
                            aqg0Var.t = c4g0.k(byName, port);
                            a aVar = new a();
                            this.c.o();
                            this.c.k = new lyj(new BufferedInputStream(this.c.t.getInputStream(), 16384), aVar);
                            this.c.l = new DataInputStream(this.c.k);
                            this.c.m = new myj(new BufferedOutputStream(this.c.t.getOutputStream(), 16384));
                            aqg0.b(this.c);
                            this.c.g(new b());
                            while (!this.c.j) {
                                aqg0.a(this.c);
                                aqg0.d(this.c);
                            }
                            try {
                                DataInputStream dataInputStream = this.c.l;
                                if (dataInputStream != null) {
                                    dataInputStream.close();
                                    this.c.l = null;
                                }
                                aqg0 aqg0Var2 = this.c;
                                aqg0Var2.k = null;
                                myj myjVar = aqg0Var2.m;
                                if (myjVar != null) {
                                    myjVar.close();
                                    this.c.m = null;
                                }
                            } catch (IOException e) {
                                e = e;
                                e.printStackTrace();
                                c4g0.i(this.c.t);
                                this.c.l();
                                this.c.t();
                            }
                        } catch (IOException e2) {
                            e2.printStackTrace();
                            c4g0.i(this.c.t);
                            this.c.l();
                            return;
                        }
                    } catch (IOException e3) {
                        if (this.c.j) {
                            e3.getMessage();
                        } else {
                            Log.e("xsna.aqg0", "Socket exception in reader thread", e3);
                            this.c.i(10);
                            this.c.q();
                        }
                        try {
                            DataInputStream dataInputStream2 = this.c.l;
                            if (dataInputStream2 != null) {
                                dataInputStream2.close();
                                this.c.l = null;
                            }
                            aqg0 aqg0Var3 = this.c;
                            aqg0Var3.k = null;
                            myj myjVar2 = aqg0Var3.m;
                            if (myjVar2 != null) {
                                myjVar2.close();
                                this.c.m = null;
                            }
                        } catch (IOException e4) {
                            e = e4;
                            e.printStackTrace();
                            c4g0.i(this.c.t);
                            this.c.l();
                            this.c.t();
                        }
                    }
                } catch (ProtocolException e5) {
                    Log.e("xsna.aqg0", "Protocol exception in reader thread", e5);
                    this.c.q();
                    this.c.i(11);
                    try {
                        DataInputStream dataInputStream3 = this.c.l;
                        if (dataInputStream3 != null) {
                            dataInputStream3.close();
                            this.c.l = null;
                        }
                        aqg0 aqg0Var4 = this.c;
                        aqg0Var4.k = null;
                        myj myjVar3 = aqg0Var4.m;
                        if (myjVar3 != null) {
                            myjVar3.close();
                            this.c.m = null;
                        }
                    } catch (IOException e6) {
                        e = e6;
                        e.printStackTrace();
                        c4g0.i(this.c.t);
                        this.c.l();
                        this.c.t();
                    }
                }
            } catch (InterruptedException unused) {
                DataInputStream dataInputStream4 = this.c.l;
                if (dataInputStream4 != null) {
                    dataInputStream4.close();
                    this.c.l = null;
                }
                aqg0 aqg0Var5 = this.c;
                aqg0Var5.k = null;
                myj myjVar4 = aqg0Var5.m;
                if (myjVar4 != null) {
                    myjVar4.close();
                    this.c.m = null;
                }
                c4g0.i(this.c.t);
                this.c.l();
                return;
            } catch (Exception e7) {
                Log.e("xsna.aqg0", "Unexpected exception in reader thread", e7);
                this.c.q();
                this.c.i(12);
                try {
                    DataInputStream dataInputStream5 = this.c.l;
                    if (dataInputStream5 != null) {
                        dataInputStream5.close();
                        this.c.l = null;
                    }
                    aqg0 aqg0Var6 = this.c;
                    aqg0Var6.k = null;
                    myj myjVar5 = aqg0Var6.m;
                    if (myjVar5 != null) {
                        myjVar5.close();
                        this.c.m = null;
                    }
                } catch (IOException e8) {
                    e = e8;
                    e.printStackTrace();
                    c4g0.i(this.c.t);
                    this.c.l();
                    this.c.t();
                }
            }
            c4g0.i(this.c.t);
            this.c.l();
            this.c.t();
        } catch (Throwable th) {
            try {
                DataInputStream dataInputStream6 = this.c.l;
                if (dataInputStream6 != null) {
                    dataInputStream6.close();
                    this.c.l = null;
                }
                aqg0 aqg0Var7 = this.c;
                aqg0Var7.k = null;
                myj myjVar6 = aqg0Var7.m;
                if (myjVar6 != null) {
                    myjVar6.close();
                    this.c.m = null;
                }
            } catch (IOException e9) {
                e9.printStackTrace();
            }
            c4g0.i(this.c.t);
            this.c.l();
            throw th;
        }
    }
}
