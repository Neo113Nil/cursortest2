package com.ybsdk.feature.savings.internal.screens.dashboard.v4;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import defpackage.bab;
import defpackage.bgc;
import defpackage.dbm0;
import defpackage.g8m0;
import defpackage.hc5;
import defpackage.j6m0;
import defpackage.j8m;
import defpackage.lbb0;
import defpackage.lum;
import defpackage.pcm0;
import defpackage.q2d0;
import defpackage.qa3;
import defpackage.qcm0;
import defpackage.sdm0;
import defpackage.t1m0;
import defpackage.t3c0;
import defpackage.v4m0;
import defpackage.vam0;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class e {
    public final LinkedHashMap a = new LinkedHashMap();
    public final qa3 b;

    public e(RecyclerView recyclerView, bab babVar, g8m0 g8m0Var, lbb0 lbb0Var, j6m0 j6m0Var) {
        int i = 3;
        qa3 qa3Var = new qa3(hc5.b, new lum(new t1m0((byte) 0, 23), pcm0.a, new vam0(i, babVar, new SavingsShelfRecyclerHelper$accountsAdapter$1(1, this, e.class, "getCellBackgroundFetcher", "getCellBackgroundFetcher(Ljava/lang/String;)Lcom/ybsdk/feature/savings/internal/screens/common/SavingsAccountBackgroundFetcher;", 0)), qcm0.a));
        this.b = qa3Var;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(recyclerView.getContext(), 2);
        gridLayoutManager.Q = false;
        gridLayoutManager.h0 = new sdm0(this);
        recyclerView.setAdapter(qa3Var);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.addItemDecoration(new dbm0(recyclerView.getContext(), qa3Var, new v4m0(i)));
        t3c0 t3c0Var = new t3c0(recyclerView.getContext());
        s sVar = new s(new j8m(recyclerView, 0.05f, lbb0Var, j6m0Var, g8m0Var, new bgc(12), qa3Var, t3c0Var, new bgc(12), new q2d0(7), false));
        recyclerView.addItemDecoration(t3c0Var);
        sVar.f(recyclerView);
    }
}
