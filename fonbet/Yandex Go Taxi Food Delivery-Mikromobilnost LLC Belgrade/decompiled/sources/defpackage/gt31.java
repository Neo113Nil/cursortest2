package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes10.dex */
public final class gt31 extends ft31 {
    public final /* synthetic */ ViewPager2 a;

    public gt31(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    @Override // defpackage.ft31
    public final boolean a(int i) {
        return (i == 8192 || i == 4096) && !this.a.isUserInputEnabled();
    }

    @Override // defpackage.ft31
    public final void h(wh whVar) {
        if (this.a.isUserInputEnabled()) {
            return;
        }
        whVar.i(ph.l);
        whVar.i(ph.k);
        whVar.B(false);
    }

    @Override // defpackage.ft31
    public final boolean j(int i) {
        if (a(i)) {
            return false;
        }
        ny61.k();
        return false;
    }

    @Override // defpackage.ft31
    public final CharSequence m() {
        return "androidx.viewpager.widget.ViewPager";
    }
}
