package xsna;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.vk.core.fragments.FragmentImpl;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import xsna.vhp0;

/* compiled from: VkFragmentTracker.kt */
/* loaded from: classes2.dex */
public final class rvu0 extends FragmentManager.m {
    public final zx10 a;
    public final Set<vhp0.c> b;

    /* JADX WARN: Multi-variable type inference failed */
    public rvu0(zx10 zx10Var, Set<? extends vhp0.c> set) {
        this.a = zx10Var;
        this.b = set;
    }

    @Override // androidx.fragment.app.FragmentManager.m
    public final void b(FragmentManager fragmentManager, Fragment fragment) {
        if (fragment instanceof FragmentImpl) {
            Set<vhp0.c> set = this.b;
            if ((set instanceof Collection) && set.isEmpty()) {
                return;
            }
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                if (((vhp0.c) it.next()).a(fragment)) {
                    mbs mbsVar = ((FragmentImpl) fragment).D;
                    mbsVar.a(new qvu0(this, mbsVar));
                    return;
                }
            }
        }
    }
}
