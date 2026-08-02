package yads;

import android.os.SystemClock;
import com.coremedia.iso.boxes.AuthorBox;
import com.ironsource.Hb;
import com.ironsource.X3;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* loaded from: classes10.dex */
public final class xo {
    public final ho a;
    public final gr b;

    public xo(c21 c21Var, gr grVar) {
        this.a = c21Var;
        this.b = grVar;
    }

    public final g92 a(qp2 qp2Var) {
        byte[] bArr;
        r92 r92Var;
        r92 r92Var2;
        int i;
        Map map;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            a21 a21Var = null;
            try {
                lr lrVar = qp2Var.p;
                if (lrVar == null) {
                    map = Collections.EMPTY_MAP;
                } else {
                    HashMap hashMap = new HashMap();
                    String str = lrVar.b;
                    if (str != null) {
                        hashMap.put("If-None-Match", str);
                    }
                    long j = lrVar.d;
                    if (j > 0) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                        hashMap.put("If-Modified-Since", simpleDateFormat.format(new Date(j)));
                    }
                    map = hashMap;
                }
                a21 a = this.a.a(qp2Var, map);
                try {
                    int i2 = a.a;
                    List unmodifiableList = Collections.unmodifiableList(a.b);
                    if (i2 == 304) {
                        return s92.a(qp2Var, SystemClock.elapsedRealtime() - elapsedRealtime, unmodifiableList);
                    }
                    InputStream inputStream = a.d;
                    if (inputStream == null) {
                        inputStream = a.e != null ? new ByteArrayInputStream(a.e) : null;
                    }
                    byte[] a2 = inputStream != null ? s92.a(inputStream, a.c, this.b) : new byte[0];
                    try {
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        if (pn3.a || elapsedRealtime2 > 3000) {
                            int i3 = qp2Var.o.b;
                        }
                        if (i2 < 200 || i2 > 299) {
                            throw new IOException();
                        }
                        SystemClock.elapsedRealtime();
                        return new g92(i2, a2, g92.a(unmodifiableList), unmodifiableList, false);
                    } catch (IOException e) {
                        e = e;
                        a21Var = a;
                        bArr = a2;
                        if (e instanceof SocketTimeoutException) {
                            r92Var = new r92("socket", new z73());
                        } else {
                            if (e instanceof MalformedURLException) {
                                throw new RuntimeException("Bad URL " + qp2Var.g(), e);
                            }
                            if (a21Var != null) {
                                int i4 = a21Var.a;
                                qp2Var.g();
                                boolean z = pn3.a;
                                if (bArr != null) {
                                    List unmodifiableList2 = Collections.unmodifiableList(a21Var.b);
                                    SystemClock.elapsedRealtime();
                                    g92 g92Var = new g92(i4, bArr, g92.a(unmodifiableList2), unmodifiableList2, false);
                                    if (i4 == 401 || i4 == 403) {
                                        r92Var = new r92(AuthorBox.TYPE, new pl(g92Var));
                                    } else {
                                        if (i4 >= 400 && i4 <= 499) {
                                            throw new ov(g92Var);
                                        }
                                        if (i4 < 500 || i4 > 599 || !qp2Var.m) {
                                            throw new wy2(g92Var);
                                        }
                                        r92Var = new r92(Hb.a, new wy2(g92Var));
                                    }
                                } else {
                                    r92Var = new r92("network", new d92());
                                }
                            } else {
                                if (!qp2Var.n) {
                                    throw new ca2(e);
                                }
                                r92Var = new r92(SignalingProtocol.NOTIFY_CONNECTION, new ca2());
                            }
                        }
                        r92Var2 = r92Var;
                        qe0 qe0Var = qp2Var.o;
                        i = qe0Var.a;
                        try {
                            mn3 mn3Var = r92Var2.b;
                            int i5 = qe0Var.b + 1;
                            qe0Var.b = i5;
                            qe0Var.a = ((int) (i * qe0Var.d)) + i;
                            if (i5 > qe0Var.c) {
                                throw mn3Var;
                            }
                            qp2Var.a(r92Var2.a + "-retry [timeout=" + i + X3.j.e);
                        } catch (mn3 e2) {
                            qp2Var.a(r92Var2.a + "-timeout-giveup [timeout=" + i + X3.j.e);
                            throw e2;
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                    bArr = null;
                    a21Var = a;
                }
            } catch (IOException e4) {
                e = e4;
                bArr = null;
            }
            qp2Var.a(r92Var2.a + "-retry [timeout=" + i + X3.j.e);
        }
    }
}
