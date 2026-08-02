package xsna;

import android.content.Context;
import android.media.Image;
import android.net.Uri;
import android.util.Size;
import com.vk.media.pipeline.metrics.ComparableVideoFragmentInfo;
import com.vk.media.pipeline.metrics.CropRange;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: SsimPsnrHelper.kt */
/* loaded from: classes3.dex */
public final class ynk0 {
    public static final /* synthetic */ qcy<Object>[] b = {new MutablePropertyReference1Impl(ynk0.class, "comparedDurationMs", "getComparedDurationMs()J", 0), p5j.a(0, ynk0.class, "comparedVideosSize", "getComparedVideosSize()Landroid/util/Size;", fpf0.a), new MutablePropertyReference1Impl(ynk0.class, "referenceVideoFPS", "getReferenceVideoFPS()I", 0), new MutablePropertyReference1Impl(ynk0.class, "referenceVideoRotation", "getReferenceVideoRotation()I", 0), new MutablePropertyReference1Impl(ynk0.class, "distortedVideoFPS", "getDistortedVideoFPS()I", 0), new MutablePropertyReference1Impl(ynk0.class, "distortedVideoRotation", "getDistortedVideoRotation()I", 0)};
    public static final ynk0 a = new ynk0();
    public static final nf3 c = new nf3();
    public static final nf3 d = new nf3();
    public static final nf3 e = new nf3();
    public static final nf3 f = new nf3();
    public static final nf3 g = new nf3();
    public static final nf3 h = new nf3();

    /* JADX WARN: Removed duplicated region for block: B:67:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x021b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qts0 a(Context context, ComparableVideoFragmentInfo comparableVideoFragmentInfo, Uri uri, jq10 jq10Var, f100 f100Var) throws InterruptedException {
        oes0 oes0Var;
        oes0 oes0Var2;
        oes0 oes0Var3;
        boolean z;
        Image h2;
        nf3 nf3Var = h;
        nf3 nf3Var2 = f;
        nf3 nf3Var3 = g;
        nf3 nf3Var4 = e;
        nf3 nf3Var5 = d;
        CropRange cropRange = comparableVideoFragmentInfo.c;
        byte[] bArr = new byte[0];
        byte[] bArr2 = new byte[0];
        long j = cropRange != null ? cropRange.d : -1L;
        qcy<Object>[] qcyVarArr = b;
        qcy<Object> qcyVar = qcyVarArr[0];
        Long valueOf = Long.valueOf(j);
        nf3 nf3Var6 = c;
        nf3Var6.c = valueOf;
        oes0 oes0Var4 = null;
        try {
            oes0 oes0Var5 = new oes0(context, comparableVideoFragmentInfo.b, cropRange, jq10Var, f100Var);
            Size size = oes0Var5.b;
            a.getClass();
            boolean z2 = true;
            qcy<Object> qcyVar2 = qcyVarArr[1];
            nf3Var5.c = size;
            int i = oes0Var5.d;
            qcy<Object> qcyVar3 = qcyVarArr[2];
            nf3Var4.c = Integer.valueOf(i);
            int i2 = oes0Var5.c;
            qcy<Object> qcyVar4 = qcyVarArr[3];
            nf3Var2.c = Integer.valueOf(i2);
            try {
                oes0 oes0Var6 = new oes0(context, uri, comparableVideoFragmentInfo.d, jq10Var, f100Var);
                int i3 = oes0Var6.d;
                qcy<Object> qcyVar5 = qcyVarArr[4];
                nf3Var3.c = Integer.valueOf(i3);
                int i4 = oes0Var6.c;
                qcy<Object> qcyVar6 = qcyVarArr[5];
                nf3Var.c = Integer.valueOf(i4);
                int i5 = 0;
                long j2 = 0;
                double d2 = 0.0d;
                double d3 = 0.0d;
                while (!Thread.currentThread().isInterrupted()) {
                    try {
                        z = z2;
                        try {
                            h2 = oes0Var5.h(j2);
                            oes0Var2 = oes0Var5;
                        } catch (Throwable th) {
                            th = th;
                            oes0Var2 = oes0Var5;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        oes0Var2 = oes0Var5;
                    }
                    try {
                        Image h3 = oes0Var6.h(j2);
                        Size size2 = size;
                        oes0Var3 = oes0Var6;
                        try {
                            long micros = j2 + TimeUnit.MILLISECONDS.toMicros(350L);
                            if (h2 == null || h3 == null) {
                                double d4 = d2;
                                double d5 = d3;
                                oes0Var2.close();
                                oes0Var3.close();
                                if (i5 <= 0) {
                                    throw new IllegalStateException("Provided input with no frames");
                                }
                                float f2 = i5;
                                return new qts0(((float) d4) / f2, ((float) d5) / f2, (Size) nf3Var5.getValue(this, qcyVarArr[z ? 1 : 0]), (int) ((Number) nf3Var6.getValue(this, qcyVarArr[0])).longValue(), ((Number) nf3Var4.getValue(this, qcyVarArr[2])).intValue(), ((Number) nf3Var2.getValue(this, qcyVarArr[3])).intValue(), ((Number) nf3Var3.getValue(this, qcyVarArr[4])).intValue(), ((Number) nf3Var.getValue(this, qcyVarArr[5])).intValue());
                            }
                            int width = size2.getWidth();
                            int height = size2.getHeight();
                            int i6 = width * height;
                            if (i6 != h2.getWidth() * h2.getHeight()) {
                                throw new IllegalArgumentException("Incorrect input reference image size");
                            }
                            if (i6 != h3.getWidth() * h3.getHeight()) {
                                throw new IllegalArgumentException("Incorrect input distorted image size");
                            }
                            if (bArr.length != i6) {
                                bArr2 = new byte[i6];
                                bArr = new byte[i6];
                            }
                            egw.a(h2, ((Number) nf3Var2.getValue(this, qcyVarArr[3])).intValue(), bArr);
                            egw.a(h3, ((Number) nf3Var.getValue(this, qcyVarArr[5])).intValue(), bArr2);
                            d2 += u140.a(width, height, bArr, bArr2);
                            if (bArr.length != bArr2.length) {
                                throw new IllegalArgumentException("The luma buffer sizes must match!");
                            }
                            int i7 = 0;
                            long j3 = 0;
                            for (int length = bArr.length; i7 < length; length = length) {
                                int i8 = (bArr[i7] & 255) - (bArr2[i7] & 255);
                                j3 += i8 * i8;
                                i7++;
                            }
                            double d6 = j3 / i6;
                            d3 += d6 == ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? Double.POSITIVE_INFINITY : Math.log10(65025.0d / d6) * 10;
                            i5++;
                            oes0Var6 = oes0Var3;
                            j2 = micros;
                            z2 = z ? 1 : 0;
                            oes0Var5 = oes0Var2;
                            size = size2;
                        } catch (Throwable th3) {
                            th = th3;
                            oes0Var = oes0Var3;
                            oes0Var4 = oes0Var2;
                            if (oes0Var4 != null) {
                                oes0Var4.close();
                            }
                            if (oes0Var != null) {
                                oes0Var.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        oes0Var3 = oes0Var6;
                        oes0Var = oes0Var3;
                        oes0Var4 = oes0Var2;
                        if (oes0Var4 != null) {
                        }
                        if (oes0Var != null) {
                        }
                        throw th;
                    }
                }
                throw new InterruptedException("SsimPsnrHelper calculation was interrupted");
            } catch (Throwable th5) {
                th = th5;
                oes0Var2 = oes0Var5;
                oes0Var = null;
            }
        } catch (Throwable th6) {
            th = th6;
            oes0Var = null;
        }
    }
}
