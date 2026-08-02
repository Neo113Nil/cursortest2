package com.yandex.go.detailed_price.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.b4j;
import defpackage.c4j;
import defpackage.cp1;
import defpackage.g0c;
import defpackage.he7;
import defpackage.lhj;
import defpackage.q2j;
import defpackage.qoi0;
import defpackage.scc;
import defpackage.sts0;
import defpackage.t5r0;
import defpackage.wls;
import defpackage.y3j;
import defpackage.z3j;
import defpackage.zxs;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002BA\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/yandex/go/detailed_price/ui/DetailedPriceContentView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lc4j;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "Lkotlin/Function2;", "Landroid/view/View;", "", "Lzy11;", "onInfoClicked", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILwls;)V", "Lb4j;", "detailedPriceModel", "update", "(Lb4j;)V", "asView", "()Landroid/view/View;", "Lq2j;", "detailedPriceAdapter", "Lq2j;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DetailedPriceContentView extends RecyclerView implements c4j {
    private final q2j detailedPriceAdapter;

    public DetailedPriceContentView(Context context, AttributeSet attributeSet, int i, wls wlsVar) {
        super(context, attributeSet, i);
        int i2 = sts0.U;
        g0c a = qoi0.a(z3j.class);
        cp1 cp1Var = new cp1(wlsVar, 14);
        Class a2 = a.a();
        EmptyList emptyList = EmptyList.a;
        zxs zxsVar = new zxs(a2, 0, null, emptyList, null, cp1Var);
        int i3 = t5r0.T;
        g0c a3 = qoi0.a(y3j.class);
        q2j q2jVar = new q2j(scc.g(zxsVar, new zxs(a3.a(), 0, new lhj(25), emptyList, new he7(1, new lhj(27)), null)));
        this.detailedPriceAdapter = q2jVar;
        setLayoutManager(new LinearLayoutManager(context, 1, false));
        setAdapter(q2jVar);
    }

    @Override // defpackage.c4j
    public View asView() {
        return this;
    }

    @Override // defpackage.c4j
    public void update(b4j detailedPriceModel) {
        this.detailedPriceAdapter.submitList(detailedPriceModel.a, null);
    }

    public DetailedPriceContentView(Context context, AttributeSet attributeSet, wls wlsVar) {
        this(context, attributeSet, 0, wlsVar, 4, null);
    }

    public DetailedPriceContentView(Context context, wls wlsVar) {
        this(context, null, 0, wlsVar, 6, null);
    }

    public /* synthetic */ DetailedPriceContentView(Context context, AttributeSet attributeSet, int i, wls wlsVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, wlsVar);
    }
}
