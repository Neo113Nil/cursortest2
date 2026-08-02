package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.divs.pager.a;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import defpackage.gb51;

/* loaded from: classes11.dex */
public final class gb51 {
    public final DivPagerView a;
    public final float b;
    public final p2l c;
    public final l2l d;
    public final a e;
    public int f;

    public gb51(DivPagerView divPagerView, float f, p2l p2lVar, l2l l2lVar, a aVar) {
        this.a = divPagerView;
        this.b = f;
        this.c = p2lVar;
        this.d = l2lVar;
        this.e = aVar;
        this.f = 1;
        this.f = a();
        RecyclerView recyclerView = divPagerView.getRecyclerView();
        if (recyclerView != null) {
            recyclerView.setItemViewCacheSize((this.f * 2) + 3);
        }
        divPagerView.getViewPager().setOffscreenPageLimit(this.f);
        divPagerView.setChangePageCallbackForOffScreenPages$div_release(new DivPagerView.OffScreenPagesUpdateCallback() { // from class: com.yandex.div.core.view2.divs.pager.WrapContentPageSizeOffScreenPagesController$1
            @Override // com.yandex.div.core.view2.divs.widgets.DivPagerView.OffScreenPagesUpdateCallback, android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                gb51 gb51Var = gb51.this;
                int a = gb51Var.a();
                if (a <= gb51Var.f) {
                    return;
                }
                gb51Var.f = a;
                DivPagerView divPagerView2 = gb51Var.a;
                RecyclerView recyclerView2 = divPagerView2.getRecyclerView();
                if (recyclerView2 != null) {
                    recyclerView2.setItemViewCacheSize((gb51Var.f * 2) + 3);
                }
                divPagerView2.getViewPager().setOffscreenPageLimit(gb51Var.f);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.a
            public void onPageSelected(int position) {
                gb51 gb51Var = gb51.this;
                int a = gb51Var.a();
                if (a <= gb51Var.f) {
                    return;
                }
                gb51Var.f = a;
                DivPagerView divPagerView2 = gb51Var.a;
                RecyclerView recyclerView2 = divPagerView2.getRecyclerView();
                if (recyclerView2 != null) {
                    recyclerView2.setItemViewCacheSize((gb51Var.f * 2) + 3);
                }
                divPagerView2.getViewPager().setOffscreenPageLimit(gb51Var.f);
            }
        });
    }

    public final int a() {
        a aVar;
        l2l l2lVar = this.d;
        float f = l2lVar.g;
        DivPagerView divPagerView = this.a;
        int currentItem$div_release = divPagerView.getCurrentItem$div_release();
        p2l p2lVar = this.c;
        Float h = p2lVar.h(currentItem$div_release);
        if (h != null) {
            float floatValue = h.floatValue();
            int currentItem$div_release2 = divPagerView.getCurrentItem$div_release() - 1;
            int i = 0;
            int i2 = 0;
            while (floatValue > 0.0f && currentItem$div_release2 > 0) {
                i2++;
                Float b = b(currentItem$div_release2);
                if (b == null) {
                    break;
                }
                floatValue -= b.floatValue();
                currentItem$div_release2--;
            }
            if (floatValue > f && currentItem$div_release2 == 0) {
                i2++;
                Float b2 = b(currentItem$div_release2);
                floatValue -= b2 != null ? b2.floatValue() : 0.0f;
            }
            Float g = p2lVar.g(divPagerView.getCurrentItem$div_release());
            if (g != null) {
                float floatValue2 = g.floatValue();
                if (floatValue > f) {
                    floatValue2 += floatValue;
                }
                int currentItem$div_release3 = divPagerView.getCurrentItem$div_release() + 1;
                while (true) {
                    aVar = this.e;
                    if (floatValue2 <= 0.0f || currentItem$div_release3 >= aVar.G.size() - 1) {
                        break;
                    }
                    i++;
                    Float b3 = b(currentItem$div_release3);
                    if (b3 == null) {
                        break;
                    }
                    floatValue2 -= b3.floatValue();
                    currentItem$div_release3++;
                }
                if (floatValue2 > l2lVar.h && currentItem$div_release3 == aVar.G.size() - 1) {
                    i++;
                    Float b4 = b(currentItem$div_release3);
                    floatValue2 -= b4 != null ? b4.floatValue() : 0.0f;
                }
                while (floatValue2 > 0.0f && currentItem$div_release2 >= 0) {
                    i2++;
                    Float b5 = b(currentItem$div_release2);
                    if (b5 == null) {
                        break;
                    }
                    floatValue2 -= b5.floatValue();
                    currentItem$div_release2--;
                }
                int max = Math.max(i2, i);
                if (max >= 1) {
                    return max;
                }
            } else if (i2 >= 1) {
                return i2;
            }
        }
        return 1;
    }

    public final Float b(int i) {
        Float f = this.c.f(i);
        if (f != null) {
            return Float.valueOf(f.floatValue() + this.b);
        }
        return null;
    }
}
