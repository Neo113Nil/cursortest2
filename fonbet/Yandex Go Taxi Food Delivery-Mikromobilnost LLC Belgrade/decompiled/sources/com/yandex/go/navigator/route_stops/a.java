package com.yandex.go.navigator.route_stops;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import defpackage.bys;
import defpackage.cel0;
import defpackage.g0c;
import defpackage.gau;
import defpackage.he7;
import defpackage.ic0;
import defpackage.ip11;
import defpackage.iws;
import defpackage.ky31;
import defpackage.mt6;
import defpackage.pbu;
import defpackage.qcl0;
import defpackage.qoi0;
import defpackage.rcl0;
import defpackage.scc;
import defpackage.sgu0;
import defpackage.u17;
import defpackage.wk6;
import defpackage.wys;
import defpackage.xcl0;
import defpackage.yxf0;
import defpackage.z0l0;
import defpackage.zdk0;
import defpackage.zxs;
import kotlin.collections.EmptyList;

/* loaded from: classes12.dex */
public final class a extends bys {
    public final rcl0 A;
    public final s B;
    public final yxf0 z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(sgu0 sgu0Var, yxf0 yxf0Var, ip11 ip11Var, xcl0 xcl0Var) {
        super(scc.g(r3, r10, new zxs(r4.a(), 0, new wk6(r5), r14, new he7(r9, new ic0(r5, r22)), null)));
        int i = ky31.T;
        g0c a = qoi0.a(pbu.class);
        gau gauVar = new gau(3, ip11Var);
        iws iwsVar = new iws(21);
        Class a2 = a.a();
        int i2 = 1;
        he7 he7Var = new he7(i2, iwsVar);
        EmptyList emptyList = EmptyList.a;
        zxs zxsVar = new zxs(a2, 0, gauVar, emptyList, he7Var, null);
        int i3 = cel0.Z;
        RouteStopsListAdapter$1 routeStopsListAdapter$1 = new RouteStopsListAdapter$1(1, xcl0Var, xcl0.class, "onStopDeleteClicked", "onStopDeleteClicked(I)V", 0);
        RouteStopsListAdapter$2 routeStopsListAdapter$2 = new RouteStopsListAdapter$2(2, xcl0Var, xcl0.class, "onStopEditClicked", "onStopEditClicked(ILcom/yandex/go/navigator/entity/NavigatorRoute$RouteStopAddress;)V", 0);
        g0c a3 = qoi0.a(qcl0.class);
        int i4 = 9;
        zxs zxsVar2 = new zxs(a3.a(), 0, new z0l0(17), emptyList, new he7(i2, new zdk0(i4, routeStopsListAdapter$1, routeStopsListAdapter$2, sgu0Var)), null);
        int i5 = mt6.Z;
        RouteStopsListAdapter$3 routeStopsListAdapter$3 = new RouteStopsListAdapter$3(0, xcl0Var, xcl0.class, "onAddStopClicked", "onAddStopClicked()V", 0);
        g0c a4 = qoi0.a(u17.class);
        this.z = yxf0Var;
        rcl0 rcl0Var = new rcl0(this);
        this.A = rcl0Var;
        this.B = new s(rcl0Var);
    }

    @Override // defpackage.bys, defpackage.dvy0, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(wys wysVar, int i) {
        super.onBindViewHolder(wysVar, i);
        cel0 cel0Var = wysVar instanceof cel0 ? (cel0) wysVar : null;
        if (cel0Var != null) {
            if (i >= getItemCount() - 2) {
                i = -1;
            }
            cel0Var.c0(i, false);
        }
    }

    @Override // defpackage.dvy0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.B.f(recyclerView);
    }

    @Override // defpackage.bys, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: p */
    public final wys onCreateViewHolder(ViewGroup viewGroup, int i) {
        wys onCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
        if (onCreateViewHolder instanceof cel0) {
            cel0 cel0Var = (cel0) onCreateViewHolder;
            cel0Var.V = this.B;
            cel0Var.W = this.A;
        }
        return onCreateViewHolder;
    }
}
