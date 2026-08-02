package xsna;

import androidx.compose.ui.graphics.Path;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.music.MusicTrack;
import com.vk.music.analytics.api.collector.strategy.CollectorStrategy;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import xsna.er9;
import xsna.kw40;

/* compiled from: CanvasDrawScope.kt */
/* loaded from: classes11.dex */
public final class fr9 implements CollectorStrategy {
    public Object b;

    public /* synthetic */ fr9(Object obj) {
        this.b = obj;
    }

    public static boolean k(fr9 fr9Var, czi cziVar) {
        if (!((czi) fr9Var.b).j().contains(cziVar)) {
            return false;
        }
        fr9Var.b = cziVar;
        s3q0 s3q0Var = s3q0.a;
        return true;
    }

    public qn5 a() {
        return gag0.b(null, ((lk3) this.b).e());
    }

    public void b(Path path, int i) {
        ((er9.b) this.b).a().j(path, i);
    }

    public void c(float f, float f2, float f3, float f4, int i) {
        ((er9.b) this.b).a().c(f, f2, f3, f4, i);
    }

    public void d(float f, float f2, float f3, float f4) {
        er9.b bVar = (er9.b) this.b;
        yq9 a = bVar.a();
        float intBitsToFloat = Float.intBitsToFloat((int) (bVar.d() >> 32)) - (f3 + f);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (bVar.d() & 4294967295L)) - (f4 + f2);
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            tzw.a("Width and height must be greater than or equal to zero");
        }
        bVar.h(floatToRawIntBits);
        a.p(f, f2);
    }

    public void e(i94 i94Var, int i) {
        if (i94Var == null || i94Var.getKey() == null || i94Var.getKey().isEmpty()) {
            return;
        }
        ((lk3) this.b).f(i94Var, Long.valueOf(i));
    }

    public void f(i94 i94Var, Object obj) {
        if (i94Var == null || i94Var.getKey() == null || i94Var.getKey().isEmpty() || obj == null) {
            return;
        }
        ((lk3) this.b).f(i94Var, obj);
    }

    @Override // com.vk.music.analytics.api.collector.strategy.CollectorStrategy
    public ax1 g(iwa0 iwa0Var) {
        q4b0 q4b0Var = iwa0Var.b.b;
        kw40 kw40Var = iwa0Var.a;
        mw40 mw40Var = kw40Var.a;
        long j = mw40Var.a;
        Long l = (Long) this.b;
        long longValue = j - (l != null ? l.longValue() : mw40Var.b);
        this.b = iwa0Var.m ? Long.valueOf(mw40Var.a) : null;
        boolean z = kw40Var instanceof kw40.c;
        long a = qni0.a();
        my1.a(a);
        MusicTrack musicTrack = q4b0Var.a;
        long j2 = q4b0Var.d;
        r4b0 r4b0Var = q4b0Var.e;
        return new xm40(a, longValue, j2, musicTrack, new PlaybackLaunchMeta(r4b0Var.a, r4b0Var.b, q4b0Var.b, r4b0Var.d, null, 16, null), z);
    }

    public void h(float f, long j) {
        yq9 a = ((er9.b) this.b).a();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        a.p(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        a.t(f);
        a.p(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void i(long j, float f, float f2) {
        yq9 a = ((er9.b) this.b).a();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        a.p(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        a.g(f, f2);
        a.p(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    @Override // com.vk.music.analytics.api.collector.strategy.CollectorStrategy
    public boolean j(iwa0 iwa0Var) {
        if (!iwa0Var.b.a) {
            kw40 kw40Var = iwa0Var.a;
            mw40 mw40Var = kw40Var.a;
            boolean z = mw40Var.a - mw40Var.b > 0;
            if ((!(kw40Var instanceof kw40.b) && z) || iwa0Var.m) {
                return true;
            }
        }
        return false;
    }

    public void l(float f, float f2) {
        ((er9.b) this.b).a().p(f, f2);
    }
}
