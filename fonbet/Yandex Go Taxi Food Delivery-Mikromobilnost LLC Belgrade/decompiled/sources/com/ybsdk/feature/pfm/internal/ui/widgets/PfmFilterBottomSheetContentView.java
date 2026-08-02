package com.ybsdk.feature.pfm.internal.ui.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.feature.pfm.internal.ui.PfmFragment;
import com.ybsdk.feature.pfm.internal.ui.b;
import defpackage.c461;
import defpackage.dab0;
import defpackage.eab0;
import defpackage.fab0;
import defpackage.g990;
import defpackage.gab0;
import defpackage.hc5;
import defpackage.i4b0;
import defpackage.jab0;
import defpackage.kab0;
import defpackage.lab0;
import defpackage.lum;
import defpackage.mab0;
import defpackage.n4r;
import defpackage.nab0;
import defpackage.ny61;
import defpackage.o4r;
import defpackage.p4r;
import defpackage.q4r;
import defpackage.qa3;
import defpackage.qbb0;
import defpackage.r4r;
import defpackage.s4r;
import defpackage.tab0;
import defpackage.tcc;
import defpackage.unh0;
import defpackage.wcb0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\n\u000fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R\"\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00180\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/ui/widgets/PfmFilterBottomSheetContentView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lgab0;", ClidProvider.STATE, "Lzy11;", "render", "(Lgab0;)V", "Lfab0;", "listener", "setOnClickListener", "(Lfab0;)V", "Lc461;", "binding", "Lc461;", "Lfab0;", "Lqa3;", "Lgc5;", "kotlin.jvm.PlatformType", "itemsAdapter", "Lqa3;", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PfmFilterBottomSheetContentView extends LinearLayout {
    private final c461 binding;
    private final qa3 itemsAdapter;
    private fab0 listener;

    public PfmFilterBottomSheetContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2 = 0;
        View inflate = LayoutInflater.from(context).inflate(unh0.ybsdk_pfm_filter_bottom_sheet_content, (ViewGroup) this, false);
        addView(inflate);
        if (inflate == null) {
            ny61.t("rootView");
            throw null;
        }
        RecyclerView recyclerView = (RecyclerView) inflate;
        this.binding = new c461(recyclerView, recyclerView);
        qa3 qa3Var = new qa3(hc5.b, new lum(new g990(9), lab0.a, new i4b0(3, new eab0(this, i2)), mab0.a), new lum(new g990(10), jab0.a, new i4b0(4, new eab0(this, 1)), kab0.a));
        this.itemsAdapter = qa3Var;
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView.setAdapter(qa3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 itemsAdapter$lambda$0(PfmFilterBottomSheetContentView pfmFilterBottomSheetContentView, nab0 nab0Var, boolean z) {
        r4r a;
        fab0 fab0Var = pfmFilterBottomSheetContentView.listener;
        if (fab0Var != null) {
            b access$getViewModel = PfmFragment.access$getViewModel(((qbb0) fab0Var).a);
            String str = nab0Var.c;
            s4r s4rVar = ((wcb0) access$getViewModel.X()).h;
            if (s4rVar instanceof r4r) {
                r4r r4rVar = (r4r) s4rVar;
                access$getViewModel.I.getClass();
                q4r q4rVar = r4rVar.c;
                if (q4rVar instanceof p4r) {
                    Set<o4r> set = ((p4r) q4rVar).a;
                    ArrayList arrayList = new ArrayList(tcc.n(set, 10));
                    for (o4r o4rVar : set) {
                        if (str.equals(o4rVar.b)) {
                            o4rVar = o4r.a(o4rVar, z);
                        }
                        arrayList.add(o4rVar);
                    }
                    a = r4r.a(r4rVar, new p4r(a.N0(arrayList)));
                } else {
                    a = null;
                }
                if (a != null) {
                    access$getViewModel.K.k(r4rVar.b, str, z);
                    access$getViewModel.B0(a);
                }
            }
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 itemsAdapter$lambda$1(PfmFilterBottomSheetContentView pfmFilterBottomSheetContentView, dab0 dab0Var, boolean z) {
        fab0 fab0Var = pfmFilterBottomSheetContentView.listener;
        if (fab0Var != null) {
            b access$getViewModel = PfmFragment.access$getViewModel(((qbb0) fab0Var).a);
            String str = dab0Var.c;
            s4r s4rVar = ((wcb0) access$getViewModel.X()).h;
            if (s4rVar instanceof r4r) {
                r4r r4rVar = (r4r) s4rVar;
                access$getViewModel.I.getClass();
                q4r q4rVar = r4rVar.c;
                r4r r4rVar2 = null;
                if (q4rVar instanceof n4r) {
                    n4r n4rVar = (n4r) q4rVar;
                    tab0 tab0Var = new tab0(str);
                    if (!z) {
                        tab0Var = null;
                    }
                    r4rVar2 = r4r.a(r4rVar, new n4r(tab0Var != null ? tab0Var.a : null, n4rVar.b));
                }
                if (r4rVar2 != null) {
                    access$getViewModel.K.k(r4rVar.b, str, z);
                    access$getViewModel.B0(r4rVar2);
                }
            }
        }
        return zy11.a;
    }

    public final void render(gab0 state) {
        this.itemsAdapter.g(state.a);
    }

    public final void setOnClickListener(fab0 listener) {
        this.listener = listener;
    }

    public PfmFilterBottomSheetContentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PfmFilterBottomSheetContentView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public PfmFilterBottomSheetContentView(Context context) {
        this(context, null, 0, 6, null);
    }
}
