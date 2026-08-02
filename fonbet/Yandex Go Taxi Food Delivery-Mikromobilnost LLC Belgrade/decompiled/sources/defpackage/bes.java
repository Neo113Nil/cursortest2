package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.strictmode.Violation;

/* loaded from: classes.dex */
public abstract class bes {
    public static final aes a = aes.a;

    public static aes a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                fragment.getParentFragmentManager();
            }
            fragment = fragment.getParentFragment();
        }
        return a;
    }

    public static void b(Violation violation) {
        if (FragmentManager.O(3)) {
            violation.getFragment().getClass();
        }
    }
}
