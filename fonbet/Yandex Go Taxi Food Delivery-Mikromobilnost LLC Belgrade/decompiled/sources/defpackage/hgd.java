package defpackage;

import android.content.Context;
import com.yandex.go.design.compose.haptic.HapticEffect;
import ru.yandex.taxi.HapticController$Effect;

/* loaded from: classes12.dex */
public final class hgd implements fgd {
    public final Context a;

    public hgd(Context context) {
        this.a = context;
    }

    @Override // defpackage.fgd
    public final void a(HapticEffect hapticEffect) {
        HapticController$Effect hapticController$Effect;
        int i = ggd.a[hapticEffect.ordinal()];
        if (i == 1) {
            hapticController$Effect = HapticController$Effect.PROMO_APPEARANCE;
        } else if (i == 2) {
            hapticController$Effect = HapticController$Effect.CLICK_LIGHT;
        } else if (i == 3) {
            hapticController$Effect = HapticController$Effect.CLICK_MEDIUM;
        } else if (i == 4) {
            hapticController$Effect = HapticController$Effect.CLICK_HEAVY;
        } else {
            if (i != 5) {
                w511.b();
                return;
            }
            hapticController$Effect = HapticController$Effect.TICK;
        }
        qke.w(this.a, hapticController$Effect, true, false);
    }
}
