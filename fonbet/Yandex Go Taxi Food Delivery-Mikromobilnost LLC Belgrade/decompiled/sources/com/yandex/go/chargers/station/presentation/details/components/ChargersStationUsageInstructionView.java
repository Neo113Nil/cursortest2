package com.yandex.go.chargers.station.presentation.details.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.payment.common.result.ResultType;
import defpackage.a2i0;
import defpackage.aki0;
import defpackage.bys;
import defpackage.era;
import defpackage.f3x;
import defpackage.fra;
import defpackage.g18;
import defpackage.hh8;
import defpackage.j3x;
import defpackage.mj1;
import defpackage.nac;
import defpackage.pav;
import defpackage.qha;
import defpackage.rcc;
import defpackage.tcc;
import defpackage.tje;
import defpackage.vsa;
import defpackage.wsa;
import defpackage.wxs;
import defpackage.xji0;
import defpackage.xsa;
import defpackage.zxs;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringBar;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\u00020\u0015*\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010(\u001a\n\u0012\u0006\b\u0000\u0012\u00020'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/yandex/go/chargers/station/presentation/details/components/ChargersStationUsageInstructionView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/yandex/taxi/widget/RobotoTextView;", "createTextView", "()Lru/yandex/taxi/widget/RobotoTextView;", "Lru/yandex/taxi/design/ListItemComponent;", "createListItemComponent", "()Lru/yandex/taxi/design/ListItemComponent;", "Lcom/yandex/go/design/view/GoLinearLayout;", "createShimmer", "()Lcom/yandex/go/design/view/GoLinearLayout;", "Lera;", "item", "Lg18;", "bindInstructionItem", "(Lru/yandex/taxi/design/ListItemComponent;Lera;)Lg18;", "Lzy11;", ResultType.RESULT_TYPE_LOADING, "()V", "Lfra;", "usageInstruction", "success", "(Lfra;)V", "Lpav;", "imageLoader", "Lpav;", "getImageLoader", "()Lpav;", "setImageLoader", "(Lpav;)V", "Lbys;", "", "adapter", "Lbys;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersStationUsageInstructionView extends RecyclerView {
    public static final int $stable = 8;
    private final bys adapter;
    private pav imageLoader;

    public ChargersStationUsageInstructionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j3x j3xVar = new j3x();
        adapter$lambda$0(this, j3xVar);
        RecyclerView.e eVar = j3xVar.b;
        setLayoutManager(eVar == null ? new LinearLayoutManager(getContext(), 1, false) : eVar);
        bys bysVar = new bys(new wxs(), j3xVar.a);
        setAdapter(bysVar);
        this.adapter = bysVar;
        setVisibility(4);
        setItemAnimator(null);
    }

    private static final zy11 adapter$lambda$0(ChargersStationUsageInstructionView chargersStationUsageInstructionView, j3x j3xVar) {
        ChargersStationUsageInstructionView$adapter$1$1 chargersStationUsageInstructionView$adapter$1$1 = new ChargersStationUsageInstructionView$adapter$1$1(0, chargersStationUsageInstructionView, ChargersStationUsageInstructionView.class, "createTextView", "createTextView()Lru/yandex/taxi/widget/RobotoTextView;", 0);
        j3xVar.getClass();
        aki0.b(new f3x(wsa.class, j3xVar, chargersStationUsageInstructionView$adapter$1$1), new qha(5));
        f3x f3xVar = new f3x(xsa.class, j3xVar, new ChargersStationUsageInstructionView$adapter$1$3(0, chargersStationUsageInstructionView, ChargersStationUsageInstructionView.class, "createListItemComponent", "createListItemComponent()Lru/yandex/taxi/design/ListItemComponent;", 0));
        j3xVar.a.add(new zxs(xsa.class, new xji0(f3xVar, 1), new mj1(new hh8(22, chargersStationUsageInstructionView), f3xVar, 4)));
        aki0.b(new f3x(vsa.class, j3xVar, new ChargersStationUsageInstructionView$adapter$1$5(0, chargersStationUsageInstructionView, ChargersStationUsageInstructionView.class, "createShimmer", "createShimmer()Lcom/yandex/go/design/view/GoLinearLayout;", 0)), new qha(6));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 adapter$lambda$0$0(RobotoTextView robotoTextView, wsa wsaVar) {
        robotoTextView.setText(wsaVar.a);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g18 adapter$lambda$0$1(ChargersStationUsageInstructionView chargersStationUsageInstructionView, ListItemComponent listItemComponent, xsa xsaVar) {
        return chargersStationUsageInstructionView.bindInstructionItem(listItemComponent, xsaVar.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 adapter$lambda$0$2(GoLinearLayout goLinearLayout, vsa vsaVar) {
        return zy11.a;
    }

    private final g18 bindInstructionItem(ListItemComponent listItemComponent, era eraVar) {
        CharSequence charSequence = eraVar.a;
        String str = eraVar.b;
        listItemComponent.setTitle(charSequence);
        pav pavVar = this.imageLoader;
        return (pavVar == null || str == null) ? g18.u1 : ((nac) pavVar.a(listItemComponent.getLeadImageView())).c(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ListItemComponent createListItemComponent() {
        ListItemComponent listItemComponent = new ListItemComponent(getContext(), null, 0, 6, null);
        listItemComponent.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        return listItemComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GoLinearLayout createShimmer() {
        GoLinearLayout goLinearLayout = new GoLinearLayout(getContext(), null, 0, 0, 14, null);
        goLinearLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        goLinearLayout.setOrientation(1);
        int u = tje.u(16, goLinearLayout.getContext());
        goLinearLayout.setPadding(u, u, u, u);
        Context context = goLinearLayout.getContext();
        int u2 = tje.u(18, goLinearLayout.getContext());
        View shimmeringBar = new ShimmeringBar(context, null, 0, a2i0.StandartShimmeringBarStyle, 6, null);
        shimmeringBar.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, u2));
        shimmeringBar.setPadding(0, 0, tje.u(16, goLinearLayout.getContext()), 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(shimmeringBar.getLayoutParams());
        marginLayoutParams.setMargins(0, 0, 0, tje.u(18, goLinearLayout.getContext()));
        shimmeringBar.setLayoutParams(marginLayoutParams);
        goLinearLayout.addView(shimmeringBar);
        Context context2 = goLinearLayout.getContext();
        int u3 = tje.u(200, goLinearLayout.getContext());
        ShimmeringBar shimmeringBar2 = new ShimmeringBar(context2, null, 0, a2i0.StandartShimmeringBarStyle, 6, null);
        shimmeringBar2.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, u3));
        goLinearLayout.addView(shimmeringBar2);
        return goLinearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RobotoTextView createTextView() {
        RobotoTextView robotoTextView = new RobotoTextView(getContext(), null, 0, 6, null);
        robotoTextView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        int u = tje.u(16, robotoTextView.getContext());
        robotoTextView.setPadding(u, u, u, tje.u(8, robotoTextView.getContext()));
        return robotoTextView;
    }

    public final pav getImageLoader() {
        return this.imageLoader;
    }

    public final void loading() {
        setVisibility(0);
        this.adapter.submitList(Collections.singletonList(vsa.a), null);
    }

    public final void setImageLoader(pav pavVar) {
        this.imageLoader = pavVar;
    }

    public final void success(fra usageInstruction) {
        List list;
        CharSequence charSequence = usageInstruction != null ? usageInstruction.a : null;
        List list2 = usageInstruction != null ? usageInstruction.b : null;
        if (list2 == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        if (charSequence != null) {
            ListBuilder a = rcc.a();
            a.add(new wsa(charSequence));
            List list3 = list2;
            ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(new xsa((era) it.next()));
            }
            a.addAll(arrayList);
            list = a.j();
        } else {
            List list4 = list2;
            ArrayList arrayList2 = new ArrayList(tcc.n(list4, 10));
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new xsa((era) it2.next()));
            }
            list = arrayList2;
        }
        this.adapter.submitList(list, null);
    }

    public ChargersStationUsageInstructionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ChargersStationUsageInstructionView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ChargersStationUsageInstructionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
