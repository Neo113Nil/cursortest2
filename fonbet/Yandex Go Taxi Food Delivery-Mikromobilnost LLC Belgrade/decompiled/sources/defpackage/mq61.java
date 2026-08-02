package defpackage;

import android.graphics.Rect;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import java.nio.ByteBuffer;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import ru.CryptoPro.pc_0.pc_3.pc_0.pc_0.pc_0.pc_0.pc_0.pc_0.cl_6;

/* loaded from: classes11.dex */
public abstract class mq61 {
    public static volatile vr61 a;

    public static final void a(f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1137978812);
        int i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            f530 e = ljs0.e(ljs0.q(f530Var, 342.0f), 306.0f);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, e);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            s3b1.f(new cuj0(wzg0.ic_delivery_smartcam_rect_corner, null, null, null, 30), null, null, btsVar, 0, 6);
            cuj0 cuj0Var = new cuj0(wzg0.ic_delivery_smartcam_rect_corner, null, null, null, 30);
            c530 c530Var = c530.a;
            f530 i3 = ira1.i(c530Var, 90.0f);
            uo5 uo5Var = x4c.w;
            cj6 cj6Var = cj6.a;
            s3b1.f(cuj0Var, cj6Var.a(i3, uo5Var), null, btsVar, 0, 4);
            s3b1.f(new cuj0(wzg0.ic_delivery_smartcam_rect_corner, null, null, null, 30), cj6Var.a(ira1.i(c530Var, 180.0f), x4c.C), null, btsVar, 0, 4);
            s3b1.f(new cuj0(wzg0.ic_delivery_smartcam_rect_corner, null, null, null, 30), cj6Var.a(ira1.i(c530Var, 270.0f), x4c.A), null, btsVar, 0, 4);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new os(f530Var, i, 6);
        }
    }

    public static final void b(final float f, final float f2, final long j, fid fidVar, final int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(544703434);
        if ((i & 6) == 0) {
            i2 = i | (btsVar.b(f) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (btsVar.b(f2) ? 32 : 16);
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            fwi fwiVar = (fwi) btsVar.m(j.h);
            k3r k3rVar = ljs0.c;
            boolean k = ((i3 & 112) == 32) | btsVar.k(fwiVar) | ((i3 & 14) == 4);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                po7 po7Var = new po7(fwiVar, f, f2, j);
                btsVar.o0(po7Var);
                Q = po7Var;
            }
            qeb1.a(6, btsVar, (tls) Q, k3rVar);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: qo7
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    mq61.b(f, f2, j, (fid) obj, vng.O(i | 1));
                    return zy11.a;
                }
            };
        }
    }

    public static final String c(String str, String str2) {
        return g8e.p(str, evu0.y(str, "?", false) ? "&" : "?", str2);
    }

    public static String d(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return "null";
        }
        int position = byteBuffer.position();
        try {
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.get(bArr);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < remaining; i++) {
                sb.append(String.format("%02X ", Byte.valueOf(bArr[i])));
            }
            return sb.toString().trim();
        } finally {
            byteBuffer.position(position);
        }
    }

    public static final Rect e(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i - 1, i2, MetricAffectingSpan.class) != i2) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i < i2) {
                    int nextSpanTransition = spanned.nextSpanTransition(i, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i, nextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    textPaint2.getTextBounds(charSequence, i, nextSpanTransition, rect2);
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i = nextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        textPaint.getTextBounds(charSequence, i, i2, rect3);
        return rect3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.CharSequence] */
    public static GregorianCalendar f(String str) {
        char charAt;
        if (a == null) {
            synchronized (mq61.class) {
                a = new vr61();
            }
        }
        a.getClass();
        int length = str.length();
        int i = 0;
        while (i < length && (charAt = str.charAt(i)) <= ' ' && (charAt == '\t' || charAt == '\n' || charAt == '\r' || charAt == ' ')) {
            i++;
        }
        int i2 = length - 1;
        int i3 = i2;
        while (i3 > i) {
            char charAt2 = str.charAt(i3);
            if (charAt2 > ' ' || (charAt2 != '\t' && charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ')) {
                break;
            }
            i3--;
        }
        if (i != 0 || i3 != i2) {
            str = str.subSequence(i, i3 + 1);
        }
        String charSequence = str.toString();
        vr61.a.getClass();
        return new cl_6(charSequence).v();
    }

    public static String g(long j) {
        long j2 = j / 1000;
        long j3 = j2 / 3600000;
        TimeUnit timeUnit = TimeUnit.HOURS;
        long millis = (j2 - timeUnit.toMillis(j3)) / 60000;
        long millis2 = j2 - timeUnit.toMillis(j3);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        long millis3 = (millis2 - timeUnit2.toMillis(millis)) / 1000;
        return String.format(Locale.US, "%02d:%02d:%02d.%03d", Long.valueOf(j3), Long.valueOf(millis), Long.valueOf(millis3), Long.valueOf(((j2 - timeUnit.toMillis(j3)) - timeUnit2.toMillis(millis)) - TimeUnit.SECONDS.toMillis(millis3)));
    }
}
