package xsna;

import android.content.Context;
import android.view.KeyEvent;
import androidx.compose.runtime.a;
import com.vkontakte.android.R;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CountDownLatch;

/* compiled from: PlaylistButtonTransformer.kt */
/* loaded from: classes16.dex */
public final class k7b0 {
    public static void a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static void b(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static void c(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(lhg.a(i, "Negative size: "));
        }
        if (Math.min(byteBuffer.remaining(), byteBuffer2.remaining()) < i) {
            StringBuilder b = ji.b(i, "Requested to copy ", " bytes; fromRemaining=");
            b.append(byteBuffer.remaining());
            b.append(" toRemaining=");
            b.append(byteBuffer2.remaining());
            throw new IllegalArgumentException(b.toString());
        }
        if (byteBuffer.hasArray()) {
            byteBuffer2.put(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), i);
            byteBuffer.position(byteBuffer.position() + i);
            return;
        }
        if (!byteBuffer2.hasArray()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            byteBuffer2.put(bArr);
        } else {
            byteBuffer.get(byteBuffer2.array(), byteBuffer2.position() + byteBuffer2.arrayOffset(), i);
            byteBuffer2.position(byteBuffer2.position() + i);
        }
    }

    public static final long d(mc90 mc90Var) {
        return an10.c(mc90Var.l() * mc90Var.q()) + (mc90Var.k() * mc90Var.q());
    }

    public static final String e(int i, Context context) {
        return i < 1000 ? String.format("%d %s", Arrays.copyOf(new Object[]{Integer.valueOf(i), context.getString(R.string.distance_meter)}, 2)) : i < 100000 ? String.format("%.1f %s", Arrays.copyOf(new Object[]{Float.valueOf(i / 1000.0f), context.getString(R.string.distance_kilometer)}, 2)) : String.format("%d %s", Arrays.copyOf(new Object[]{Integer.valueOf(i / 1000), context.getString(R.string.distance_kilometer)}, 2));
    }

    public static zel f(int i, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1107739818, i, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.flingBehavior (Scrollable.kt:622)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(162564459, 0, -1, "androidx.compose.foundation.gestures.rememberPlatformDefaultFlingBehavior (Scrollable.android.kt:28)");
        }
        l7l a = ilk0.a(aVar);
        boolean J = aVar.J(a);
        Object x = aVar.x();
        if (J || x == a.C0011a.a) {
            x = new zel(a);
            aVar.R(x);
        }
        zel zelVar = (zel) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return zelVar;
    }

    public static final int g(KeyEvent keyEvent) {
        return (keyEvent.isAltPressed() ? 1 : 0) | (keyEvent.isCtrlPressed() ? 2 : 0) | (keyEvent.isMetaPressed() ? 4 : 0) | (keyEvent.isShiftPressed() ? 8 : 0);
    }

    public static final e8i h(String str) {
        return new e8i(str);
    }

    public static final a540 i(Collection collection) {
        return new a540(collection);
    }

    public static final tmy j(gzv gzvVar) {
        return new tmy("MsgPushEnabledSyncManager", gzvVar);
    }

    public static void k(jvb0 jvb0Var, long j) throws IOException {
        if (!(j >= 0)) {
            throw new IllegalArgumentException();
        }
        while (j > 0) {
            long skip = jvb0Var.skip(j);
            if (skip <= 0) {
                if (jvb0Var.read() == -1) {
                    return;
                } else {
                    skip = 1;
                }
            }
            j -= skip;
        }
    }

    public static final wwj l(CountDownLatch countDownLatch) {
        return new wwj("UsersOnlineSyncManager", countDownLatch);
    }
}
