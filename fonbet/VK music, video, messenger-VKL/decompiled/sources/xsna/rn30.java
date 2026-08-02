package xsna;

import com.google.gson.Gson;
import com.google.gson.stream.JsonWriter;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.OutputStreamWriter;
import kotlin.Result;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.nn30;
import xsna.vl8.b;

/* compiled from: MsgPackToJsonSourceUnlimited.kt */
/* loaded from: classes3.dex */
public final class rn30 implements agk0 {
    public static final bpn0 g = new bpn0(new cy20(1));
    public final agk0 b;
    public final nn30 c;
    public final vl8 d;
    public final JsonWriter e;
    public boolean f;

    public rn30(bn8 bn8Var) {
        this.b = bn8Var;
        nn30 nn30Var = new nn30(bn8Var);
        nn30Var.e.d = 2147483647L;
        this.c = nn30Var;
        vl8 vl8Var = new vl8();
        this.d = vl8Var;
        this.e = ((Gson) g.getValue()).newJsonWriter(new BufferedWriter(new OutputStreamWriter(vl8Var.new b(), emb.b)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.c.close();
        this.e.close();
    }

    public final void m() {
        nn30 nn30Var = this.c;
        byte q = nn30Var.q();
        JsonWriter jsonWriter = this.e;
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
        vl8 vl8Var2;
        Object failure;
        if (j < 0) {
            throw new IllegalArgumentException(defpackage.k0.a(j, "byteCount < 0: ").toString());
        }
        boolean z = this.f;
        if (z) {
            throw new IllegalArgumentException("closed!");
        }
        if (z) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return 0L;
        }
        do {
            vl8Var2 = this.d;
            if (vl8Var2.c >= j) {
                break;
            }
            try {
                m();
                failure = s3q0.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if ((failure instanceof Result.Failure) && a != null && !(a instanceof EOFException)) {
                throw a;
            }
            this.e.flush();
            if (a instanceof EOFException) {
                long j2 = vl8Var2.c;
                if (j2 == 0) {
                    return -1L;
                }
                vl8Var2.read(vl8Var, j2);
                return j2;
            }
        } while (vl8Var2.c < j);
        long j3 = vl8Var2.c;
        if (j3 <= j) {
            j = j3;
        }
        vl8Var2.read(vl8Var, j);
        return j;
    }

    @Override // xsna.agk0
    public final mxo0 timeout() {
        return this.b.timeout();
    }
}
