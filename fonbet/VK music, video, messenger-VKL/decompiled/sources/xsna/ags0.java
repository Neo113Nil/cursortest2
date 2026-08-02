package xsna;

import com.vk.core.view.components.subnavigation.VkSubnavigationBar;
import com.vk.lists.RecyclerPaginatedView;
import com.vkontakte.android.R;

/* compiled from: VideoDiscoveryCatalogTabsController.kt */
/* loaded from: classes7.dex */
public final class ags0 {
    public final VkSubnavigationBar a;
    public final VkSubnavigationBar b;
    public final wrl0 c;
    public final rme0 d;
    public final a e;
    public final int f;
    public final int g;
    public final int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public final int l;
    public final VkSubnavigationBar m;
    public final mha n;
    public final mha o;

    /* compiled from: VideoDiscoveryCatalogTabsController.kt */
    public static final class a {
        public final bvs0 a;
        public final cvs0 b;
        public final dvs0 c;
        public final evs0 d;

        public a(bvs0 bvs0Var, cvs0 cvs0Var, dvs0 dvs0Var, evs0 evs0Var) {
            this.a = bvs0Var;
            this.b = cvs0Var;
            this.c = dvs0Var;
            this.d = evs0Var;
        }
    }

    public ags0(VkSubnavigationBar vkSubnavigationBar, VkSubnavigationBar vkSubnavigationBar2, boolean z, boolean z2, wrl0 wrl0Var, pvh0 pvh0Var, rme0 rme0Var, a aVar) {
        cvs0 cvs0Var = aVar.b;
        bvs0 bvs0Var = aVar.a;
        this.a = vkSubnavigationBar;
        this.b = vkSubnavigationBar2;
        this.c = wrl0Var;
        this.d = rme0Var;
        this.e = aVar;
        int dimensionPixelSize = vkSubnavigationBar.getResources().getDimensionPixelSize(R.dimen.video_discovery_catalog_tabs_height);
        this.f = dimensionPixelSize;
        this.g = dimensionPixelSize * 2;
        this.h = dimensionPixelSize;
        this.i = true;
        this.l = iah0.a(1.0f);
        VkSubnavigationBar vkSubnavigationBar3 = z ? vkSubnavigationBar2 : vkSubnavigationBar;
        this.m = vkSubnavigationBar3;
        mha mhaVar = new mha(vkSubnavigationBar, bvs0Var, cvs0Var, null, 24);
        this.n = mhaVar;
        this.o = new mha(vkSubnavigationBar2, bvs0Var, cvs0Var, mhaVar, 8);
        vkSubnavigationBar.setVisibility((z && z2) ? 8 : 0);
        vkSubnavigationBar2.setVisibility(0);
        vkSubnavigationBar2.setPadding(vkSubnavigationBar2.getPaddingLeft(), vkSubnavigationBar2.getPaddingTop(), iah0.a(12), vkSubnavigationBar2.getPaddingBottom());
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) pvh0Var.invoke();
        recyclerPaginatedView.setPadding(recyclerPaginatedView.getPaddingLeft(), dimensionPixelSize, recyclerPaginatedView.getPaddingRight(), recyclerPaginatedView.getPaddingBottom());
        RecyclerPaginatedView recyclerPaginatedView2 = (RecyclerPaginatedView) wrl0Var.invoke();
        if (recyclerPaginatedView2 != null) {
            recyclerPaginatedView2.Om(new zfs0(this));
        }
        if (gsi0.b().g) {
            f4m.a(vkSubnavigationBar3, new qkd0(this, 23));
        }
    }

    public final void a() {
        if (gsi0.b().g) {
            VkSubnavigationBar vkSubnavigationBar = this.m;
            boolean z = vkSubnavigationBar.getVisibility() == 0 && Math.abs(vkSubnavigationBar.getTranslationY()) < ((float) this.l);
            if (this.j != z) {
                this.j = z;
                this.e.c.invoke(Boolean.valueOf(z));
            }
        }
    }
}
