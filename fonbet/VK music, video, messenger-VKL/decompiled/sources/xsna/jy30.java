package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.vk.core.view.VKTabLayout;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.im.engine.models.SearchMode;
import java.util.ArrayList;

/* compiled from: MsgSearchVc.kt */
/* loaded from: classes2.dex */
public final class jy30 extends z1q0 {
    public final /* synthetic */ iy30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy30(iy30 iy30Var, ArrayList arrayList) {
        super(arrayList);
        this.c = iy30Var;
    }

    @Override // xsna.z1q0, com.google.android.material.tabs.TabLayout.c
    public final void Wd(TabLayout.g gVar) {
        super.Wd(gVar);
        iy30 iy30Var = this.c;
        mkr0 mkr0Var = iy30Var.a;
        rwh0 rwh0Var = iy30Var.a().b.get(gVar.e);
        VkSearchView vkSearchView = iy30Var.k;
        if (vkSearchView == null) {
            vkSearchView = null;
        }
        String obj = drm0.p0(vkSearchView.getQuery()).toString();
        boolean f = epx.f(rwh0Var.g, obj);
        if (!f) {
            mkr0Var.o0(obj, rwh0Var.c);
        }
        b0i0 b0i0Var = (b0i0) iy30Var.a().e.get(Integer.valueOf(gVar.e));
        if (b0i0Var == null) {
            return;
        }
        if (f) {
            if (rwh0Var.a()) {
                b0i0Var.a();
            } else if (obj.length() == 0) {
                RecyclerView recyclerView = b0i0Var.d;
                recyclerView.setVisibility(4);
                recyclerView.stopScroll();
                b0i0Var.a.setVisibility(4);
                b0i0Var.b.setVisibility(4);
                b0i0Var.c.setVisibility(4);
            } else {
                b0i0Var.b();
            }
        }
        iy30Var.g(rwh0Var.e);
        int i = gVar.e;
        if (i == 0) {
            mkr0Var.H();
        } else if (i == 1) {
            mkr0Var.f0();
        } else if (i == 2) {
            mkr0Var.p0();
        }
        if (iy30Var.w) {
            return;
        }
        int count = iy30Var.a().getCount();
        for (int i2 = 0; i2 < count; i2++) {
            rwh0 rwh0Var2 = iy30Var.a().b.get(i2);
            if (rwh0Var2.h > 0) {
                VKTabLayout vKTabLayout = iy30Var.m;
                if (vKTabLayout == null) {
                    vKTabLayout = null;
                }
                TabLayout.g b = vKTabLayout.b(i2);
                if (b != null) {
                    int i3 = rwh0Var2.h;
                    TabLayout tabLayout = b.g;
                    if (tabLayout == null) {
                        throw new IllegalArgumentException("Tab not attached to a TabLayout");
                    }
                    b.d = tabLayout.getResources().getText(i3);
                    b.r();
                } else {
                    continue;
                }
            }
        }
        iy30Var.w = true;
    }

    @Override // xsna.z1q0
    public final boolean a(TabLayout.g gVar) {
        return this.c.a().b.get(gVar.e).c == SearchMode.MESSAGES;
    }

    @Override // xsna.z1q0, com.google.android.material.tabs.TabLayout.c
    public final void hl(TabLayout.g gVar) {
        Wd(gVar);
    }

    @Override // xsna.z1q0, com.google.android.material.tabs.TabLayout.c
    public final void za(TabLayout.g gVar) {
        RecyclerView recyclerView;
        b0i0 b0i0Var = (b0i0) this.c.a().e.get(Integer.valueOf(gVar.e));
        if (b0i0Var == null || (recyclerView = b0i0Var.d) == null) {
            return;
        }
        recyclerView.stopScroll();
    }
}
