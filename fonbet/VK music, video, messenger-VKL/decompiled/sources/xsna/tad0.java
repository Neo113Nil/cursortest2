package xsna;

import androidx.viewpager2.widget.ViewPager2;
import com.vk.log.L;
import java.lang.ref.WeakReference;

/* compiled from: PrimaryTabLayoutMediator.kt */
/* loaded from: classes7.dex */
public final class tad0 {
    public final ViewPager2 a;
    public final com.vk.voip.ui.groupcalls.list.primary.tab.a b;
    public boolean c;
    public a d;

    /* compiled from: PrimaryTabLayoutMediator.kt */
    public static final class a extends ViewPager2.g {
        public final WeakReference<com.vk.voip.ui.groupcalls.list.primary.tab.a> d;
        public int e = 0;
        public int f = 0;

        public a(com.vk.voip.ui.groupcalls.list.primary.tab.a aVar) {
            this.d = new WeakReference<>(aVar);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageScrollStateChanged(int i) {
            this.e = this.f;
            this.f = i;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageScrolled(int i, float f, int i2) {
            com.vk.voip.ui.groupcalls.list.primary.tab.a aVar = this.d.get();
            if (aVar != null) {
                try {
                    aVar.a(f, i);
                } catch (IllegalArgumentException e) {
                    L.G("Position is incorrect: " + e.getMessage());
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0019, code lost:
        
            r0.setSelectedPageIndex(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x001c, code lost:
        
            return;
         */
        @Override // androidx.viewpager2.widget.ViewPager2.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onPageSelected(int i) {
            com.vk.voip.ui.groupcalls.list.primary.tab.a aVar = this.d.get();
            try {
                int i2 = this.f;
                if (i2 != 0 && (i2 != 2 || this.e != 0)) {
                }
            } catch (IllegalArgumentException e) {
                L.G("Position is incorrect: " + e.getMessage());
            }
        }
    }

    public tad0(ViewPager2 viewPager2, com.vk.voip.ui.groupcalls.list.primary.tab.a aVar) {
        this.a = viewPager2;
        this.b = aVar;
    }
}
