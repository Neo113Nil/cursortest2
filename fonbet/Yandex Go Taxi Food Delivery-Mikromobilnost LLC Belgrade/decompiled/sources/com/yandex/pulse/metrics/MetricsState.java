package com.yandex.pulse.metrics;

import android.os.SystemClock;
import com.yandex.pulse.histogram.ComponentHistograms;
import com.yandex.pulse.utils.WeakHandler;
import defpackage.bfh;
import defpackage.csq0;
import defpackage.ffx;
import defpackage.qd20;
import defpackage.rd20;
import defpackage.u941;
import defpackage.vez0;
import defpackage.vku;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.zip.CRC32;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/pulse/metrics/MetricsState;", "", "Lu941;", "handlerCallback", "Lu941;", "histograms_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MetricsState {
    public static final vku f = ffx.L(3, "MetricsState.LoadStatus");
    public static final vku g;
    public static final vku h;
    public static final vku i;
    public final File a;
    public final WeakHandler b;
    public final csq0 c;
    public final qd20 d;
    public boolean e;
    private final u941 handlerCallback;

    static {
        Object obj = ComponentHistograms.b;
        g = ffx.J(vez0.u(), "MetricsState.LoadTimes", 1L, 10000L, 50);
        h = ffx.I(1, 2048, 50, "MetricsState.LoadSize");
        i = ffx.L(2, "MetricsState.StoreStatus");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MetricsState(File file, Executor executor) {
        FileInputStream fileInputStream;
        rd20 rd20Var;
        vku vkuVar = f;
        File file2 = new File(file, "metrics_state");
        this.a = file2;
        bfh bfhVar = new bfh(2, this);
        this.handlerCallback = bfhVar;
        this.b = new WeakHandler(bfhVar);
        this.c = new csq0(executor);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            fileInputStream = new FileInputStream(file2);
            try {
                byte[] bArr = new byte[1024];
                int read = fileInputStream.read(bArr);
                int i2 = 8;
                if (read < 8) {
                    throw new IOException("File to small");
                }
                long j = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).getLong();
                int i3 = read - 8;
                CRC32 crc32 = new CRC32();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (i3 >= 0) {
                    crc32.update(bArr, i2, i3);
                    byteArrayOutputStream.write(bArr, i2, i3);
                    i3 = fileInputStream.read(bArr);
                    i2 = 0;
                }
                if (crc32.getValue() != j) {
                    vkuVar.b(1);
                    try {
                        fileInputStream.close();
                    } catch (FileNotFoundException | IOException unused) {
                    }
                    rd20Var = null;
                    qd20 qd20Var = rd20Var != null ? (qd20) rd20Var.toBuilder() : null;
                    this.d = qd20Var == null ? rd20.newBuilder() : qd20Var;
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                rd20Var = rd20.parseFrom(byteArray);
                vkuVar.b(0);
                g.c(SystemClock.elapsedRealtime() - elapsedRealtime, TimeUnit.MILLISECONDS);
                h.b(byteArray.length / 1024);
                try {
                    fileInputStream.close();
                } catch (IOException unused2) {
                }
                if (rd20Var != null) {
                }
                this.d = qd20Var == null ? rd20.newBuilder() : qd20Var;
            } catch (Throwable th) {
                th = th;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                try {
                    throw th;
                } catch (IOException unused4) {
                    vkuVar.b(2);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }

    public final void a() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.b.sendEmptyMessageDelayed(0, 10000L);
    }
}
