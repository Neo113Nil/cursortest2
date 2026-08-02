package com.ybsdk.feature.savings.internal.screens.dashboard.delegates;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import defpackage.a10;
import defpackage.bab;
import defpackage.bgc;
import defpackage.c3m0;
import defpackage.cbm0;
import defpackage.d3m0;
import defpackage.dbm0;
import defpackage.g8m0;
import defpackage.hdm0;
import defpackage.hxj0;
import defpackage.idm0;
import defpackage.j8m;
import defpackage.lb7;
import defpackage.lum;
import defpackage.mcm0;
import defpackage.ncm0;
import defpackage.pcm0;
import defpackage.q2d0;
import defpackage.qa3;
import defpackage.qam0;
import defpackage.qcm0;
import defpackage.ram0;
import defpackage.sls;
import defpackage.t1m0;
import defpackage.t3c0;
import defpackage.tls;
import defpackage.vam0;
import defpackage.vxj0;
import defpackage.wls;
import defpackage.wnf0;
import defpackage.xvq;
import defpackage.y5e;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public final class b {
    public final LinkedHashMap a = new LinkedHashMap();
    public boolean b;
    public int c;
    public final qa3 d;

    public b(bab babVar, g8m0 g8m0Var) {
        int i;
        a10 a10Var = new a10(13);
        synchronized (y5e.a) {
            try {
                i = 2;
                if (y5e.b == null) {
                    y5e.b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        byte b = 0;
        int i2 = 22;
        this.d = new qa3(new lb7(9, y5e.b, a10Var), new lum(new t1m0(b, 25), hdm0.a, new g8m0(7, babVar), idm0.a), new lum(new t1m0(b, 12), c3m0.a, new vxj0(i2, babVar, new SavingsDashboardRecyclerHelper$adapter$1(1, this, b.class, "getCellBackgroundFetcher", "getCellBackgroundFetcher(Ljava/lang/String;)Lcom/ybsdk/feature/savings/internal/screens/common/SavingsAccountBackgroundFetcher;", 0)), d3m0.a), new lum(new t1m0(b, 23), pcm0.a, new vam0(3, babVar, new SavingsDashboardRecyclerHelper$adapter$2(1, this, b.class, "getCellBackgroundFetcher", "getCellBackgroundFetcher(Ljava/lang/String;)Lcom/ybsdk/feature/savings/internal/screens/common/SavingsAccountBackgroundFetcher;", 0)), qcm0.a), new lum(new t1m0(b, i2), mcm0.a, new wnf0(g8m0Var, new xvq(29), i), ncm0.a));
    }

    public final void a(RecyclerView recyclerView, wls wlsVar, sls slsVar, tls tlsVar, qam0 qam0Var) {
        if (this.b) {
            return;
        }
        t3c0 t3c0Var = new t3c0(recyclerView.getContext());
        s sVar = new s(new j8m(recyclerView, 0.0f, wlsVar, slsVar, tlsVar, new bgc(12), this.d, t3c0Var, qam0Var, new q2d0(7), true));
        recyclerView.addItemDecoration(t3c0Var);
        sVar.f(recyclerView);
        this.b = true;
    }

    public final void b(RecyclerView recyclerView) {
        this.b = false;
        Context context = recyclerView.getContext();
        qa3 qa3Var = this.d;
        recyclerView.setAdapter(qa3Var);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new dbm0(context, qa3Var, new SavingsDashboardRecyclerHelper$getDecoration$1(this, b.class, "totalNotifications", "getTotalNotifications()I", 0)));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 2);
        gridLayoutManager.h0 = new cbm0(this);
        gridLayoutManager.Q = false;
        recyclerView.setLayoutManager(gridLayoutManager);
    }

    public final void c(List list, int i, ram0 ram0Var) {
        this.c = i;
        this.d.h(list, new hxj0(23, ram0Var));
    }
}
