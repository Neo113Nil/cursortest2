package androidx.fragment.app;

import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"androidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact", "", "Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", JCP.RAW_PREFIX, "ADDING", "REMOVING", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SpecialEffectsController$Operation$LifecycleImpact {
    private static final /* synthetic */ SpecialEffectsController$Operation$LifecycleImpact[] $VALUES;
    public static final SpecialEffectsController$Operation$LifecycleImpact ADDING;
    public static final SpecialEffectsController$Operation$LifecycleImpact NONE;
    public static final SpecialEffectsController$Operation$LifecycleImpact REMOVING;

    static {
        SpecialEffectsController$Operation$LifecycleImpact specialEffectsController$Operation$LifecycleImpact = new SpecialEffectsController$Operation$LifecycleImpact(JCP.RAW_PREFIX, 0);
        NONE = specialEffectsController$Operation$LifecycleImpact;
        SpecialEffectsController$Operation$LifecycleImpact specialEffectsController$Operation$LifecycleImpact2 = new SpecialEffectsController$Operation$LifecycleImpact("ADDING", 1);
        ADDING = specialEffectsController$Operation$LifecycleImpact2;
        SpecialEffectsController$Operation$LifecycleImpact specialEffectsController$Operation$LifecycleImpact3 = new SpecialEffectsController$Operation$LifecycleImpact("REMOVING", 2);
        REMOVING = specialEffectsController$Operation$LifecycleImpact3;
        $VALUES = new SpecialEffectsController$Operation$LifecycleImpact[]{specialEffectsController$Operation$LifecycleImpact, specialEffectsController$Operation$LifecycleImpact2, specialEffectsController$Operation$LifecycleImpact3};
    }

    public static SpecialEffectsController$Operation$LifecycleImpact valueOf(String str) {
        return (SpecialEffectsController$Operation$LifecycleImpact) Enum.valueOf(SpecialEffectsController$Operation$LifecycleImpact.class, str);
    }

    public static SpecialEffectsController$Operation$LifecycleImpact[] values() {
        return (SpecialEffectsController$Operation$LifecycleImpact[]) $VALUES.clone();
    }
}
