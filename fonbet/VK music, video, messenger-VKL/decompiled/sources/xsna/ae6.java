package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.dto.messages.HistoryAttachAction;
import com.vk.im.engine.models.attaches.HistoryAttach;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.cwb0;
import xsna.w8m;
import xsna.z7v;

/* compiled from: BaseHistoryAttachesVC.kt */
/* loaded from: classes2.dex */
public abstract class ae6 implements f8v {
    public static final float k = cn70.a() * 45.0f;
    public final c8v a;
    public View c;
    public RecyclerView d;
    public VkSpinner e;
    public SwipeRefreshLayout f;
    public VkPlaceholder g;
    public s7j i;
    public final bpn0 b = new bpn0(new u40(this, 5));
    public final bpn0 h = new bpn0(new v40(this, 5));
    public final zd6 j = new zd6(this);

    public ae6(c8v c8vVar) {
        this.a = c8vVar;
    }

    @Override // xsna.f8v
    public final void L() {
        RecyclerView recyclerView = this.d;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.removeCallbacks(null);
        RecyclerView recyclerView2 = this.d;
        (recyclerView2 != null ? recyclerView2 : null).removeOnScrollListener(this.j);
        s7j s7jVar = this.i;
        if (s7jVar != null) {
            s7jVar.b.removeOnScrollListener(s7jVar);
        }
        ((bzb0) this.b.getValue()).a();
    }

    @Override // xsna.f8v
    public final void a(Throwable th) {
        zk70.e(th);
    }

    @Override // xsna.f8v
    public final void b(boolean z) {
        VkSpinner vkSpinner = this.e;
        if (vkSpinner == null) {
            vkSpinner = null;
        }
        vkSpinner.setVisibility(z ? 0 : 8);
    }

    @Override // xsna.f8v
    public View c(Context context, ViewGroup viewGroup) {
        View inflate = e3m.b(context).inflate(R.layout.vkim_history_attaches, viewGroup, false);
        this.c = inflate.findViewById(R.id.root_view);
        this.e = (VkSpinner) inflate.findViewById(R.id.vkim_progress);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.vkim_recycler_view);
        this.d = recyclerView;
        recyclerView.setHasFixedSize(true);
        RecyclerView recyclerView2 = this.d;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.setLayoutManager(g());
        recyclerView2.setAdapter(e());
        recyclerView2.addOnScrollListener(this.j);
        recyclerView2.setItemAnimator(null);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R.id.vkim_swipe_refresh_layout);
        this.f = swipeRefreshLayout;
        swipeRefreshLayout.setColorSchemeResources(R.color.vk_blue_400);
        SwipeRefreshLayout swipeRefreshLayout2 = this.f;
        if (swipeRefreshLayout2 == null) {
            swipeRefreshLayout2 = null;
        }
        final c8v c8vVar = this.a;
        swipeRefreshLayout2.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: xsna.wd6
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
            public final void h() {
                c8v c8vVar2 = c8v.this;
                c8vVar2.r = null;
                c8vVar2.I0(new io.reactivex.rxjava3.internal.operators.single.n(c8vVar2.i1(c8vVar2.n, null), new tts(new eqd(c8vVar2, 25), 5)).subscribe(new com.vk.im.ui.components.dialogs_list.b(new iou(c8vVar2, 1), 28), new b8v(new b5h(c8vVar2, 18), 0)));
            }
        });
        VkPlaceholder vkPlaceholder = (VkPlaceholder) inflate.findViewById(R.id.vkim_empty_list_view);
        this.g = vkPlaceholder;
        vkPlaceholder.setMiddle(new VkPlaceholder.b(null, new VkPlaceholder.b.C0859b(14, oq.d(tlo0.Companion, f())), 1));
        return inflate;
    }

    public final int d(RecyclerView recyclerView) {
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).x();
        }
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).x();
        }
        if (layoutManager instanceof FlexboxLayoutManager) {
            return ((FlexboxLayoutManager) layoutManager).x();
        }
        if (recyclerView.canScrollVertically(1)) {
            return 0;
        }
        return e().getItemCount();
    }

    public abstract qul e();

    public abstract String f();

    public abstract RecyclerView.o g();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [T, xsna.dw20] */
    public final void h(Context context, final HistoryAttach historyAttach) {
        r10 r10Var;
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        vv8 vv8Var = a1wVar.r().a.o;
        final z7v.a.C4163a c4163a = z7v.a.a;
        List<HistoryAttachAction> c1 = this.a.c1(historyAttach);
        final ArrayList arrayList = new ArrayList();
        for (Object obj : c1) {
            arrayList.add(obj);
        }
        ImFeatures imFeatures = ImFeatures.IM_CHAT_PROFILE_REDESIGN;
        imFeatures.getClass();
        if (!com.vk.toggle.b.A.a(imFeatures)) {
            ((bzb0) this.b.getValue()).b(new cwb0.b0(context, arrayList, BuildInfo.t()), new yd6(c4163a, historyAttach, this, 0), null);
            return;
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        int i = w8m.a;
        cwb0.b0 b0Var = new cwb0.b0(context, arrayList, BuildInfo.t());
        View view = this.c;
        if (view == null) {
            view = null;
        }
        view.getContext();
        Iterable iterable = b0Var.l;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : iterable) {
            if (j5g.P(b0Var.m, ((jwb0) obj2).f)) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            jwb0 jwb0Var = (jwb0) it.next();
            Integer valueOf = Integer.valueOf(R.attr.vk_ui_background_negative);
            HistoryAttachAction historyAttachAction = (HistoryAttachAction) jwb0Var.f;
            switch (historyAttachAction == null ? -1 : w8m.a.$EnumSwitchMapping$1[historyAttachAction.ordinal()]) {
                case -1:
                    r10Var = null;
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    r10Var = new r10(jwb0Var.b, R.drawable.vk_icon_message_arrow_right_outline_28, historyAttachAction.ordinal(), (Integer) null, 24);
                    break;
                case 2:
                    r10Var = new r10(jwb0Var.b, R.drawable.vk_icon_share_outline_28, historyAttachAction.ordinal(), (Integer) null, 24);
                    break;
                case 3:
                    r10Var = new r10(jwb0Var.b, R.drawable.vk_icon_copy_outline_28, historyAttachAction.ordinal(), (Integer) null, 24);
                    break;
                case 4:
                    r10Var = new r10(jwb0Var.b, R.drawable.vk_icon_download_outline_28, historyAttachAction.ordinal(), (Integer) null, 24);
                    break;
                case 5:
                    r10Var = new r10(jwb0Var.b, R.drawable.vk_icon_add_outline_28, historyAttachAction.ordinal(), (Integer) null, 24);
                    break;
                case 6:
                    r10Var = new r10(jwb0Var.b, R.drawable.vk_icon_add_square_outline_28, historyAttachAction.ordinal(), (Integer) null, 24);
                    break;
                case 7:
                    r10Var = new r10(jwb0Var.b, R.drawable.vk_icon_delete_outline_28, historyAttachAction.ordinal(), valueOf, (Integer) null);
                    break;
            }
            if (r10Var != null) {
                arrayList3.add(r10Var);
            }
        }
        ref$ObjectRef.element = new rew(context, arrayList3, new izs() { // from class: xsna.xd6
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.izs
            public final Object invoke(Object obj3) {
                Object obj4;
                int intValue = ((Integer) obj3).intValue();
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    obj4 = it2.next();
                    if (((HistoryAttachAction) obj4).ordinal() == intValue) {
                        break;
                    }
                }
                HistoryAttachAction historyAttachAction2 = (HistoryAttachAction) obj4;
                if (historyAttachAction2 != null) {
                    c4163a.getClass();
                    this.a.j1(historyAttachAction2, historyAttach);
                    dw20 dw20Var = (dw20) ref$ObjectRef.element;
                    if (dw20Var != null) {
                        dw20Var.dismiss();
                    }
                }
                return s3q0.a;
            }
        }, null).c.b(context, "IM_ACTIONS_CHOOSER_DIALOG_TAG");
    }

    @Override // xsna.f8v
    public final void j(int i) {
        View view = this.c;
        if (view != null) {
            if (view == null) {
                view = null;
            }
            float height = view.getHeight() / 2.0f;
            float min = Math.min(height - (i / 2.0f), height - k);
            VkPlaceholder vkPlaceholder = this.g;
            if (vkPlaceholder == null) {
                vkPlaceholder = null;
            }
            float f = -min;
            vkPlaceholder.setTranslationY(f);
            VkSpinner vkSpinner = this.e;
            (vkSpinner != null ? vkSpinner : null).setTranslationY(f);
        }
    }

    @Override // xsna.f8v
    public final void n(kkm kkmVar) {
        if (((Boolean) this.h.getValue()).booleanValue()) {
            return;
        }
        if (BuildInfo.t()) {
            VkSpinner vkSpinner = this.e;
            (vkSpinner != null ? vkSpinner : null).setProgressTintList(ColorStateList.valueOf(dhr0.t.c(R.attr.vk_ui_icon_accent)));
        } else {
            VkSpinner vkSpinner2 = this.e;
            VkSpinner vkSpinner3 = vkSpinner2 != null ? vkSpinner2 : null;
            kkmVar.getClass();
            kkmVar.a(vkSpinner3, "progressTint", new zl9(kkmVar, R.attr.vk_ui_icon_accent));
        }
    }

    @Override // xsna.f8v
    public final void o(kkm kkmVar) {
        if (BuildInfo.t() || ((Boolean) this.h.getValue()).booleanValue()) {
            return;
        }
        VkSpinner vkSpinner = this.e;
        if (vkSpinner == null) {
            vkSpinner = null;
        }
        kkmVar.h(vkSpinner);
    }

    @Override // xsna.f8v
    public final void p(boolean z) {
        SwipeRefreshLayout swipeRefreshLayout = this.f;
        if (swipeRefreshLayout == null) {
            swipeRefreshLayout = null;
        }
        swipeRefreshLayout.setRefreshing(z);
    }

    @Override // xsna.f8v
    public final void q(int i, int[] iArr) {
        s7j s7jVar = this.i;
        if (s7jVar == null) {
            RecyclerView recyclerView = this.d;
            if (recyclerView == null) {
                recyclerView = null;
            }
            s7jVar = new s7j(recyclerView);
            this.i = s7jVar;
        }
        s7jVar.c = 0;
        s7jVar.d = 0;
        s7jVar.b.scrollBy(0, i);
        iArr[0] = s7jVar.c;
        iArr[1] = s7jVar.d;
    }

    @Override // xsna.f8v
    public final void r(boolean z) {
        VkPlaceholder vkPlaceholder = this.g;
        if (vkPlaceholder == null) {
            vkPlaceholder = null;
        }
        vkPlaceholder.setVisibility(z ? 0 : 4);
    }

    @Override // xsna.f8v
    public final void s(List<? extends hfz> list, m.d dVar) {
        RecyclerView recyclerView = this.d;
        if (recyclerView == null) {
            recyclerView = null;
        }
        wjf0.c(recyclerView, new tm1(this, list, dVar, 1));
    }
}
