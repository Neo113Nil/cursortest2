package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import xsna.a5p0;

/* compiled from: TabLayoutExt.kt */
/* loaded from: classes18.dex */
public final class usn0 {
    public static final void a(TabLayout tabLayout) {
        int tabCount = tabLayout.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            TabLayout.g b = tabLayout.b(i);
            if (b != null) {
                a5p0.a.a(b.h, null);
            }
        }
        tabLayout.g(new a(tabLayout));
    }

    public static final View b(TabLayout tabLayout, int i) {
        View childAt = tabLayout != null ? tabLayout.getChildAt(0) : null;
        ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
        if (viewGroup != null) {
            return viewGroup.getChildAt(i);
        }
        return null;
    }

    /* compiled from: TabLayoutExt.kt */
    public static final class a implements TabLayout.d {
        public final /* synthetic */ TabLayout b;

        public a(TabLayout tabLayout) {
            this.b = tabLayout;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void Wd(TabLayout.g gVar) {
            TabLayout tabLayout = this.b;
            int tabCount = tabLayout.getTabCount();
            for (int i = 0; i < tabCount; i++) {
                TabLayout.g b = tabLayout.b(i);
                if (b != null) {
                    a5p0.a.a(b.h, null);
                }
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void hl(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void za(TabLayout.g gVar) {
        }
    }
}
