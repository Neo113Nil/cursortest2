package xsna;

import androidx.compose.animation.core.RepeatMode;

/* compiled from: AnimationSpec.kt */
/* loaded from: classes11.dex */
public final class jq2 {
    public static yuw a(int i, long j, RepeatMode repeatMode, aoo aooVar) {
        if ((i & 2) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        return new yuw(aooVar, repeatMode, j);
    }

    public static o0g0 b(int i, aoo aooVar, RepeatMode repeatMode, long j, int i2) {
        if ((i2 & 4) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        RepeatMode repeatMode2 = repeatMode;
        if ((i2 & 8) != 0) {
            j = 0;
        }
        return new o0g0(i, j, repeatMode2, aooVar);
    }

    public static xmk0 c(float f, float f2, Object obj, int i) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return new xmk0(f, f2, obj);
    }

    public static dtp0 d(int i, int i2, huo huoVar, int i3) {
        if ((i3 & 1) != 0) {
            i = 300;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            huoVar = luo.a;
        }
        return new dtp0(i, i2, huoVar);
    }
}
