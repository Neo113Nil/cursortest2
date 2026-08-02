package xsna;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.eh3;

/* compiled from: ArchiveChannelsViewController.kt */
/* loaded from: classes15.dex */
public final class fh3 extends fi6<hh3, eh3> {
    public final boolean f;
    public rg3 g;
    public a h;
    public RecyclerView i;
    public VkPlaceholder j;
    public final m0g0 k;

    /* compiled from: ArchiveChannelsViewController.kt */
    public final class a extends vc80 {
        public final RecyclerView f;

        public a(RecyclerView recyclerView) {
            this.f = recyclerView;
        }

        @Override // xsna.vc80
        public final void l(int i, int i2, int i3) {
            if (i2 >= i3 || i2 < i3 - 61) {
                return;
            }
            fh3 fh3Var = fh3.this;
            fh3Var.getClass();
            fh3Var.O(eh3.c.b);
        }
    }

    /* compiled from: ArchiveChannelsViewController.kt */
    public final class b implements d.b<hfz> {
        public b() {
        }

        @Override // androidx.recyclerview.widget.d.b
        public final void a(List<hfz> list, List<hfz> list2) {
            if (list.size() != list2.size()) {
                a aVar = fh3.this.h;
                if (aVar == null) {
                    aVar = null;
                }
                aVar.onScrolled(aVar.f, 0, 0);
            }
        }
    }

    /* compiled from: ArchiveChannelsViewController.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            fh3 fh3Var = (fh3) this.receiver;
            fh3Var.getClass();
            fh3Var.O(eh3.a.b);
            return s3q0.a;
        }
    }

    public fh3(boolean z) {
        super(R.layout.im_archive_channels, null);
        this.f = z;
        this.k = new m0g0(this);
    }

    @Override // xsna.fi6
    public final void Q(View view) {
        this.i = (RecyclerView) view.findViewById(R.id.im_archive_channels_recycler_view);
        this.j = (VkPlaceholder) view.findViewById(R.id.im_archive_channels_empty_placeholder);
        RecyclerView recyclerView = this.i;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setItemAnimator(null);
        c cVar = new c(0, this, fh3.class, "onHideBannerClick", "onHideBannerClick()V", 0);
        rg3 rg3Var = new rg3(new qg3(0));
        rg3Var.y0(new jg3(cVar, this.f));
        m0g0 m0g0Var = this.k;
        rg3Var.y0(new lg3(m0g0Var));
        rg3Var.y0(new mg3(m0g0Var));
        rg3Var.y0(new pg3());
        rg3Var.setHasStableIds(true);
        rg3Var.h.d.add(new b());
        rg3Var.registerAdapterDataObserver(new tgh0(recyclerView, new pj0(rg3Var)));
        this.g = rg3Var;
        recyclerView.setAdapter(rg3Var);
        a aVar = new a(recyclerView);
        this.h = aVar;
        recyclerView.addOnScrollListener(aVar);
    }

    @Override // xsna.wn50
    public final void l(ao50 ao50Var) {
        List<fi3> list = ((hh3) ao50Var).a;
        if (list.isEmpty()) {
            RecyclerView recyclerView = this.i;
            if (recyclerView == null) {
                recyclerView = null;
            }
            f4m.j(recyclerView);
            VkPlaceholder vkPlaceholder = this.j;
            if (vkPlaceholder == null) {
                vkPlaceholder = null;
            }
            vkPlaceholder.setTop(new VkPlaceholder.c.b(new gko(R.drawable.vk_icon_archive_outline_56), new b8g(dhr0.Y(R.attr.vk_ui_icon_secondary, vkPlaceholder.getContext())), null, 12));
            vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, (tlo0) null), new VkPlaceholder.b.C0859b(14, tq.h(tlo0.Companion, R.string.im_archive_channels_empty))));
            vkPlaceholder.setVisibility(0);
        } else {
            RecyclerView recyclerView2 = this.i;
            if (recyclerView2 == null) {
                recyclerView2 = null;
            }
            recyclerView2.setVisibility(0);
            VkPlaceholder vkPlaceholder2 = this.j;
            if (vkPlaceholder2 == null) {
                vkPlaceholder2 = null;
            }
            f4m.j(vkPlaceholder2);
        }
        rg3 rg3Var = this.g;
        (rg3Var != null ? rg3Var : null).setItems(list);
    }
}
