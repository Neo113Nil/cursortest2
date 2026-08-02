package com.monetization.ads.mediation.appopenad;

import com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter;
import defpackage.aj81;
import defpackage.hd71;
import defpackage.kgx;
import defpackage.qha1;
import defpackage.r581;
import defpackage.sg61;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public final class a implements MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener {
    public static final /* synthetic */ kgx[] e = {qha1.a(a.class, "loadController", "getLoadController()Lcom/monetization/ads/fullscreen/FullScreenLoadController;")};
    public final aj81 a;
    public final r581 b;
    public WeakReference c = new WeakReference(null);
    public final sg61 d = new sg61();

    public a(hd71 hd71Var, aj81 aj81Var) {
        this.a = aj81Var;
        this.b = new r581(hd71Var);
    }
}
