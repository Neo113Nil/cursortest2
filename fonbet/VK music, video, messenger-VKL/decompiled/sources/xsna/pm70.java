package xsna;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.device.store.AppStore;
import com.vk.im.nspkchooser.impl.nspk.Source;
import com.vk.toggle.features.VkPayFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.om70;
import xsna.pl20;
import xsna.rl20;
import xsna.t06;
import xsna.yz80;

/* compiled from: NspkChooserViewController.kt */
/* loaded from: classes2.dex */
public final class pm70 extends fi6<qm70, om70> implements t06.a, yz80.a, pl20.a, rl20.a {
    public TextView f;
    public Group g;
    public RecyclerView h;
    public final im70 i;
    public Toolbar j;
    public View k;
    public Barrier l;
    public ImageView m;
    public TextView n;
    public Barrier o;
    public View p;
    public TextView q;

    public pm70() {
        super(R.layout.nspk_chooser, null);
        this.i = new im70(this);
    }

    @Override // xsna.fi6
    public final void Q(View view) {
        this.f = (TextView) view.findViewById(R.id.total_sum);
        this.g = (Group) view.findViewById(R.id.sum_group);
        this.m = (ImageView) view.findViewById(R.id.sbp_icon);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        this.h = recyclerView;
        recyclerView.setAdapter(this.i);
        RecyclerView recyclerView2 = this.h;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        view.getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        if (!dy2.g(context, AppStore.RUSTORE)) {
            ImageView imageView = this.m;
            omw.d(imageView != null ? imageView : null, R.drawable.vk_icon_qr_24, R.attr.vk_ui_icon_accent);
        }
        ((Toolbar) view.findViewById(R.id.toolbar)).setNavigationOnClickListener(new og(this, 4));
        VkPayFeatures vkPayFeatures = VkPayFeatures.FEATURE_VKPAY_SBP_DIALOG_SIMPLIFIED_UI;
        vkPayFeatures.getClass();
        if (com.vk.toggle.b.A.a(vkPayFeatures)) {
            this.j = (Toolbar) view.findViewById(R.id.toolbar);
            this.k = view.findViewById(R.id.top_divider);
            this.l = (Barrier) view.findViewById(R.id.sbp_top_barrier);
            this.n = (TextView) view.findViewById(R.id.sbp_info);
            this.o = (Barrier) view.findViewById(R.id.sbp_bottom_barrier);
            this.p = view.findViewById(R.id.bottom_divider);
            this.q = (TextView) view.findViewById(R.id.list_header);
        }
    }

    @Override // xsna.t06.a, xsna.pl20.a
    public final void b(int i) {
        O(new om70.a(i));
    }

    @Override // xsna.yz80.a, xsna.rl20.a
    public final void g() {
        O(om70.c.b);
    }

    @Override // xsna.wn50
    public final void l(ao50 ao50Var) {
        qm70 qm70Var = (qm70) ao50Var;
        List<hfz> list = qm70Var.d;
        String str = qm70Var.c;
        Group group = this.g;
        if (group == null) {
            group = null;
        }
        group.setVisibility(!drm0.N(str) ? 0 : 8);
        TextView textView = this.f;
        if (textView == null) {
            textView = null;
        }
        textView.setText(str);
        VkPayFeatures vkPayFeatures = VkPayFeatures.FEATURE_VKPAY_SBP_DIALOG_SIMPLIFIED_UI;
        vkPayFeatures.getClass();
        boolean a = com.vk.toggle.b.A.a(vkPayFeatures);
        im70 im70Var = this.i;
        if (!a || qm70Var.b.e != Source.MIDAS) {
            im70Var.setItems(list);
            return;
        }
        Toolbar toolbar = this.j;
        if (toolbar == null) {
            toolbar = null;
        }
        toolbar.setTitle(R.string.nspk_midas_chooser_title);
        Toolbar toolbar2 = this.j;
        if (toolbar2 == null) {
            toolbar2 = null;
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) toolbar2.getChildAt(0);
        appCompatTextView.setHorizontallyScrolling(false);
        appCompatTextView.setAutoSizeTextTypeUniformWithConfiguration(14, 23, 1, 2);
        View view = this.k;
        if (view == null) {
            view = null;
        }
        view.setVisibility(8);
        Group group2 = this.g;
        if (group2 == null) {
            group2 = null;
        }
        group2.setVisibility(8);
        Barrier barrier = this.l;
        if (barrier == null) {
            barrier = null;
        }
        barrier.setVisibility(8);
        ImageView imageView = this.m;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setVisibility(8);
        TextView textView2 = this.n;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setVisibility(8);
        Barrier barrier2 = this.o;
        if (barrier2 == null) {
            barrier2 = null;
        }
        barrier2.setVisibility(8);
        View view2 = this.p;
        if (view2 == null) {
            view2 = null;
        }
        view2.setVisibility(8);
        TextView textView3 = this.q;
        if (textView3 == null) {
            textView3 = null;
        }
        textView3.setVisibility(8);
        RecyclerView recyclerView = this.h;
        f4m.t(iah0.a(64), recyclerView != null ? recyclerView : null);
        if (list.isEmpty()) {
            return;
        }
        if (j5g.Y(list) instanceof xz80) {
            im70Var.setItems(Collections.singletonList(ql20.b));
            return;
        }
        List<hfz> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            r06 r06Var = (r06) ((hfz) it.next());
            arrayList.add(new ol20(r06Var.b, r06Var.c, r06Var.d));
        }
        im70Var.setItems(arrayList);
    }
}
