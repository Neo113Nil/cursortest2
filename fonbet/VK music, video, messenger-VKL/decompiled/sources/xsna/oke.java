package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.ui.bottomsheet.internal.VkBottomSheetBehavior;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.zez;

/* compiled from: ClipsListHashtagViewControllerImpl.kt */
/* loaded from: classes16.dex */
public final class oke implements efe {
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final int n;
    public final com.vk.movika.sdk.base.observable.a a;
    public final int b;
    public RecyclerView c;
    public FrameLayout d;
    public View e;
    public VkBottomSheetBehavior<FrameLayout> f;
    public final yez g;
    public float h = 3.0f;
    public final bpn0 i = new bpn0(new yce(this, 1));

    static {
        int a = iah0.a(40);
        j = a;
        int a2 = iah0.a(6);
        k = a2;
        l = (a2 * 2) + a;
        m = (a * 2) + a2;
        n = (a * 3) + a2;
    }

    public oke(dfe dfeVar, com.vk.movika.sdk.base.observable.a aVar, int i) {
        this.a = aVar;
        this.b = i;
        this.g = new yez(dfeVar);
    }

    @Override // xsna.efe
    public final View a(mqd mqdVar) {
        View inflate = LayoutInflater.from(mqdVar.getContext()).inflate(R.layout.view_hashtag_select, (ViewGroup) mqdVar, false);
        f4m.v(this.b, inflate);
        this.d = (FrameLayout) inflate.findViewById(R.id.hashtag_select_layout);
        this.e = inflate.findViewById(R.id.v_select_shadow);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.rv_hashtag_list);
        this.c = recyclerView;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.g);
        }
        RecyclerView recyclerView2 = this.c;
        if (recyclerView2 != null) {
            inflate.getContext();
            recyclerView2.setLayoutManager(new LinearLayoutManager());
        }
        RecyclerView recyclerView3 = this.c;
        if (recyclerView3 != null) {
            int i = k;
            recyclerView3.addItemDecoration(new v98(0, i, i, false));
        }
        FrameLayout frameLayout = this.d;
        if (frameLayout != null) {
            bwt0.p0(frameLayout, false);
        }
        VkBottomSheetBehavior<FrameLayout> F = VkBottomSheetBehavior.F(this.d);
        F.I(n);
        F.h = true;
        F.J(4);
        F.q = (nke) this.i.getValue();
        this.f = F;
        return inflate;
    }

    @Override // xsna.efe
    public final void b(List<o5f> list) {
        yez yezVar = this.g;
        yezVar.getClass();
        ArrayList arrayList = new ArrayList();
        List<o5f> list2 = list;
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        for (o5f o5fVar : list2) {
            arrayList2.add(new zez.a(o5fVar.a, o5fVar.b));
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((zez.a) next).b) {
                arrayList3.add(next);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (!((zez.a) next2).b) {
                arrayList4.add(next2);
            }
        }
        arrayList.addAll(arrayList3);
        if (!arrayList3.isEmpty() && !arrayList4.isEmpty()) {
            arrayList.add(zez.b.a);
        }
        arrayList.addAll(arrayList4);
        yezVar.d = arrayList;
        yezVar.notifyDataSetChanged();
        VkBottomSheetBehavior<FrameLayout> vkBottomSheetBehavior = this.f;
        if (vkBottomSheetBehavior != null && vkBottomSheetBehavior.i == 5) {
            vkBottomSheetBehavior.J(4);
        }
        boolean isEmpty = list.isEmpty();
        com.vk.movika.sdk.base.observable.a aVar = this.a;
        if (isEmpty) {
            FrameLayout frameLayout = this.d;
            if (frameLayout != null) {
                bwt0.p0(frameLayout, false);
            }
            VkBottomSheetBehavior<FrameLayout> vkBottomSheetBehavior2 = this.f;
            if (vkBottomSheetBehavior2 != null) {
                vkBottomSheetBehavior2.J(4);
            }
            RecyclerView recyclerView = this.c;
            if (recyclerView != null) {
                recyclerView.scrollToPosition(0);
            }
            aVar.invoke(Boolean.FALSE);
            return;
        }
        int size = list.size();
        int a = y8g0.a(R.dimen.clip_bottomsheet_separator_height);
        VkBottomSheetBehavior<FrameLayout> vkBottomSheetBehavior3 = this.f;
        if (vkBottomSheetBehavior3 != null) {
            int i = (size != 1 ? size != 2 ? size != 3 ? ((int) (this.h * j)) + k : n : m : l) + a;
            RecyclerView recyclerView2 = this.c;
            ViewGroup.LayoutParams layoutParams = recyclerView2 != null ? recyclerView2.getLayoutParams() : null;
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            vkBottomSheetBehavior3.I(i + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0) + this.b);
        }
        FrameLayout frameLayout2 = this.d;
        if (frameLayout2 != null) {
            bwt0.p0(frameLayout2, true);
        }
        aVar.invoke(Boolean.TRUE);
    }

    @Override // xsna.efe
    public final void hide() {
        b(EmptyList.b);
    }
}
