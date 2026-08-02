package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.m;

/* loaded from: classes.dex */
public final class ocs extends m {
    public final /* synthetic */ FragmentManager b;

    public ocs(FragmentManager fragmentManager) {
        this.b = fragmentManager;
    }

    @Override // androidx.fragment.app.m
    public final Fragment a(ClassLoader classLoader, String str) {
        return Fragment.instantiate(this.b.x.b, str, null);
    }
}
