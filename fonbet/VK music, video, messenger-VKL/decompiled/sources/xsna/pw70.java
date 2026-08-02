package xsna;

import java.util.Collection;
import java.util.List;
import ru.ok.gleffects.EffectRegistry;

/* compiled from: OkEffectIdConverter.kt */
/* loaded from: classes3.dex */
public final class pw70 {
    public static final List<k9x> a = e43.l(qw70.a, qw70.b, qw70.c, qw70.d, qw70.e, qw70.f, qw70.g, qw70.h);

    public static boolean a(int i) {
        List<k9x> list = a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (k9x k9xVar : list) {
            int i2 = k9xVar.b;
            if (i <= k9xVar.c && i2 <= i) {
                return true;
            }
        }
        return false;
    }

    public static EffectRegistry.EffectId b(int i) {
        k9x k9xVar = qw70.a;
        int i2 = k9xVar.b;
        if (i <= k9xVar.c && i2 <= i) {
            return EffectRegistry.EffectId.ROMA_ZOMBIE;
        }
        k9x k9xVar2 = qw70.b;
        int i3 = k9xVar2.b;
        if (i <= k9xVar2.c && i3 <= i) {
            return EffectRegistry.EffectId.PICTURE_BACKGROUND;
        }
        k9x k9xVar3 = qw70.c;
        int i4 = k9xVar3.b;
        if (i <= k9xVar3.c && i4 <= i) {
            return EffectRegistry.EffectId.SPHERE_IMAGE0;
        }
        k9x k9xVar4 = qw70.d;
        int i5 = k9xVar4.b;
        if (i <= k9xVar4.c && i5 <= i) {
            return EffectRegistry.EffectId.BACKGROUND;
        }
        k9x k9xVar5 = qw70.e;
        int i6 = k9xVar5.b;
        if (i <= k9xVar5.c && i6 <= i) {
            return EffectRegistry.EffectId.SPHERE_VIDEO0;
        }
        k9x k9xVar6 = qw70.f;
        int i7 = k9xVar6.b;
        if (i <= k9xVar6.c && i7 <= i) {
            return EffectRegistry.EffectId.PICTURE_BACKGROUND;
        }
        k9x k9xVar7 = qw70.g;
        int i8 = k9xVar7.b;
        if (i <= k9xVar7.c && i8 <= i) {
            return EffectRegistry.EffectId.SKY_BACKGROUND1;
        }
        k9x k9xVar8 = qw70.h;
        int i9 = k9xVar8.b;
        if (i <= k9xVar8.c && i9 <= i) {
            return EffectRegistry.EffectId.SKY_BACKGROUND_VIDEO1;
        }
        for (EffectRegistry.EffectId effectId : EffectRegistry.EffectId.values()) {
            if (effectId.id == (-i)) {
                return effectId;
            }
        }
        return null;
    }
}
