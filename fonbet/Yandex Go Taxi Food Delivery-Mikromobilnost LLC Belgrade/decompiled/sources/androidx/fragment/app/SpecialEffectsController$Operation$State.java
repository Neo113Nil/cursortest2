package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import defpackage.fot0;
import defpackage.got0;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0001\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"androidx/fragment/app/SpecialEffectsController$Operation$State", "", "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "Companion", "fot0", "REMOVED", "VISIBLE", "GONE", "INVISIBLE", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SpecialEffectsController$Operation$State {
    private static final /* synthetic */ SpecialEffectsController$Operation$State[] $VALUES;
    public static final fot0 Companion;
    public static final SpecialEffectsController$Operation$State GONE;
    public static final SpecialEffectsController$Operation$State INVISIBLE;
    public static final SpecialEffectsController$Operation$State REMOVED;
    public static final SpecialEffectsController$Operation$State VISIBLE;

    static {
        SpecialEffectsController$Operation$State specialEffectsController$Operation$State = new SpecialEffectsController$Operation$State("REMOVED", 0);
        REMOVED = specialEffectsController$Operation$State;
        SpecialEffectsController$Operation$State specialEffectsController$Operation$State2 = new SpecialEffectsController$Operation$State("VISIBLE", 1);
        VISIBLE = specialEffectsController$Operation$State2;
        SpecialEffectsController$Operation$State specialEffectsController$Operation$State3 = new SpecialEffectsController$Operation$State("GONE", 2);
        GONE = specialEffectsController$Operation$State3;
        SpecialEffectsController$Operation$State specialEffectsController$Operation$State4 = new SpecialEffectsController$Operation$State("INVISIBLE", 3);
        INVISIBLE = specialEffectsController$Operation$State4;
        $VALUES = new SpecialEffectsController$Operation$State[]{specialEffectsController$Operation$State, specialEffectsController$Operation$State2, specialEffectsController$Operation$State3, specialEffectsController$Operation$State4};
        Companion = new fot0();
    }

    public static SpecialEffectsController$Operation$State valueOf(String str) {
        return (SpecialEffectsController$Operation$State) Enum.valueOf(SpecialEffectsController$Operation$State.class, str);
    }

    public static SpecialEffectsController$Operation$State[] values() {
        return (SpecialEffectsController$Operation$State[]) $VALUES.clone();
    }

    public final void a(View view, ViewGroup viewGroup) {
        FragmentManager.O(2);
        int i = got0.a[ordinal()];
        if (i == 1) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (FragmentManager.O(2)) {
                    view.toString();
                    viewGroup2.toString();
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (i == 2) {
            if (FragmentManager.O(2)) {
                view.toString();
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (FragmentManager.O(2)) {
                    view.toString();
                    viewGroup.toString();
                }
                viewGroup.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (i == 3) {
            if (FragmentManager.O(2)) {
                view.toString();
            }
            view.setVisibility(8);
        } else {
            if (i != 4) {
                return;
            }
            if (FragmentManager.O(2)) {
                view.toString();
            }
            view.setVisibility(4);
        }
    }
}
