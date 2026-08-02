package xsna;

import com.google.gson.Gson;
import com.google.gson.stream.JsonWriter;
import com.vk.network.msgpack.internal.LimitException;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.OutputStreamWriter;
import java.nio.channels.Channel;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.nn30;
import xsna.vl8.b;

/* compiled from: MsgPackToJsonSource.kt */
/* loaded from: classes3.dex */
public final class qn30 implements agk0, Channel {
    public static final bpn0 g = new bpn0(new com.vk.movika.sdk.base.model.props.c(22));
    public final agk0 b;
    public volatile boolean c = true;
    public final nn30 d;
    public final utl e;
    public final JsonWriter f;

    public qn30(agk0 agk0Var) {
        this.b = agk0Var;
        this.d = new nn30(agk0Var);
        utl utlVar = new utl();
        this.e = utlVar;
        this.f = ((Gson) g.getValue()).newJsonWriter(new BufferedWriter(new OutputStreamWriter(utlVar, emb.b)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        this.c = false;
        this.d.close();
        this.f.close();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.c;
    }

    public final void m() {
        nn30 nn30Var = this.d;
        byte q = nn30Var.q();
        JsonWriter jsonWriter = this.f;
        if (q == 1) {
            nn30Var.beginObject();
            jsonWriter.beginObject();
            return;
        }
        if (q == 3) {
            nn30Var.beginArray();
            jsonWriter.beginArray();
            return;
        }
        if (q == 2) {
            nn30Var.m();
            jsonWriter.endObject();
            return;
        }
        if (q == 4) {
            nn30Var.m();
            jsonWriter.endArray();
            return;
        }
        if (q == 7) {
            nn30Var.q();
            nn30Var.b = (byte) 0;
            int[] iArr = nn30Var.i;
            int i = nn30Var.d - 1;
            iArr[i] = iArr[i] + 1;
            jsonWriter.nullValue();
            return;
        }
        if (q == 11 || q == 12 || q == 13) {
            String p = nn30Var.p(false);
            String[] strArr = nn30Var.j;
            int i2 = nn30Var.d - 1;
            strArr[i2] = p;
            int[] iArr2 = nn30Var.h;
            iArr2[i2] = iArr2[i2] + 1;
            nn30Var.b = (byte) 0;
            jsonWriter.name(p);
            return;
        }
        if (q == 8) {
            jsonWriter.value(nn30Var.p(true));
            return;
        }
        if (q == 6 || q == 5) {
            byte q2 = nn30Var.q();
            nn30Var.b = (byte) 0;
            int[] iArr3 = nn30Var.i;
            int i3 = nn30Var.d - 1;
            iArr3[i3] = iArr3[i3] + 1;
            jsonWriter.value(q2 == 5);
            return;
        }
        if (q == 9) {
            jsonWriter.value(nn30Var.o(true).longValue());
            return;
        }
        if (q != 10) {
            StringBuilder sb = new StringBuilder("invalid_peek:");
            bl3<int[]> bl3Var = nn30.l;
            sb.append(nn30.a.a(q));
            sb.append(" tag:0x");
            byte b = nn30Var.c;
            ro.d(16);
            sb.append(Integer.toString(b, 16));
            sb.append(" path:");
            sb.append(nn30Var.getPath());
            throw new IllegalStateException(sb.toString());
        }
        double doubleValue = nn30Var.o(true).doubleValue();
        try {
            jsonWriter.value(doubleValue);
        } catch (IllegalArgumentException e) {
            if (Double.isNaN(doubleValue)) {
                jsonWriter.value("NaN");
            } else {
                if (!Double.isInfinite(doubleValue)) {
                    throw e;
                }
                jsonWriter.value(doubleValue > ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? "Infinity" : "-Infinity");
            }
        }
    }

    @Override // xsna.agk0
    public final long read(vl8 vl8Var, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(defpackage.k0.a(j, "byteCount < 0: ").toString());
        }
        if (!this.c) {
            throw new IllegalArgumentException("closed!");
        }
        if (j == 0) {
            return 0L;
        }
        this.e.b = vl8Var.new b();
        this.d.e.d = j;
        long j2 = 0;
        while (j2 <= j) {
            long j3 = this.d.e.e;
            try {
                m();
                j2 += this.d.e.e - j3;
            } catch (LimitException unused) {
                j2 += this.d.e.e - j3;
            } catch (EOFException unused2) {
                if (j2 == 0) {
                    this.f.flush();
                    return -1L;
                }
            }
        }
        this.f.flush();
        return j2;
    }

    @Override // xsna.agk0
    public final mxo0 timeout() {
        return this.b.timeout();
    }
}
