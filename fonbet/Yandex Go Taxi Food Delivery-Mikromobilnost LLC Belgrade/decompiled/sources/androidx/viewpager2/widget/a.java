package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import defpackage.ny61;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a extends ViewPager2.a {
    public final ArrayList a = new ArrayList(3);

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageScrollStateChanged(int i) {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.a) it.next()).onPageScrollStateChanged(i);
            }
        } catch (ConcurrentModificationException e) {
            ny61.h("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageScrolled(int i, float f, int i2) {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.a) it.next()).onPageScrolled(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            ny61.h("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageSelected(int i) {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.a) it.next()).onPageSelected(i);
            }
        } catch (ConcurrentModificationException e) {
            ny61.h("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }
}
