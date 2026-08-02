package defpackage;

import android.util.Base64;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.squareup.wire.internal.MathMethodsKt;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import ru.yandex.video.m3.player.impl.utils.MemoryDependsLoadControl;

/* loaded from: classes4.dex */
public abstract class m7a1 {
    public static final cjw0 a = new cjw0();

    public static ArrayList a(byte[] bArr) {
        long j = ((((bArr[11] & 255) << 8) | (bArr[10] & 255)) * MathMethodsKt.NANOS_PER_SECOND) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static byte[] b(String str) {
        return Base64.decode(str, 1);
    }

    public static String c(byte[] bArr) {
        return Base64.encodeToString(bArr, 1);
    }

    public static final long d(long j) {
        if (j < 0) {
            return 0L;
        }
        return j < 100 ? (j / 20) * 20 : j < 1000 ? (j / 100) * 100 : j < 2000 ? (j / 200) * 200 : j < 5000 ? (j / 500) * 500 : j < 10000 ? (j / 1000) * 1000 : j < DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT ? (j / 2000) * 2000 : j < MemoryDependsLoadControl.DEFAULT_MAX_DURATION_MS ? (j / 5000) * 5000 : MemoryDependsLoadControl.DEFAULT_MAX_DURATION_MS;
    }
}
