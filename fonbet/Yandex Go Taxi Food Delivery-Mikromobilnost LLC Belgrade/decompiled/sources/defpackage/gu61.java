package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.security.InvalidKeyException;
import ru.CryptoPro.JCP.Key.InternalGostPrivateKey;

/* loaded from: classes4.dex */
public final class gu61 {
    public final long[] a;
    public final Object b;
    public boolean c;
    public int d;
    public long e;
    public final /* synthetic */ wu61 f;

    public gu61(wu61 wu61Var, gu61 gu61Var) {
        this.f = wu61Var;
        this.c = false;
        this.d = 8;
        this.e = PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
        this.b = new Object();
        int length = gu61Var.a.length;
        long[] jArr = new long[length];
        this.a = jArr;
        System.arraycopy(gu61Var.a, 0, jArr, 0, length);
        this.c = gu61Var.c;
        this.e = gu61Var.e;
        this.d = gu61Var.d;
    }

    public final void a(long j) {
        long j2 = this.c ? PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID : 0L;
        synchronized (this.b) {
            try {
                long[] jArr = this.a;
                long j3 = jArr[0] + j;
                if (j3 > (this.e * this.d) + j2) {
                    throw new InvalidKeyException(InternalGostPrivateKey.resource.getString("ErrorLongMaterial"));
                }
                jArr[0] = j3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public gu61(wu61 wu61Var) {
        this.f = wu61Var;
        this.c = false;
        this.d = 8;
        this.e = PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
        this.b = new Object();
        this.a = new long[]{0};
    }
}
