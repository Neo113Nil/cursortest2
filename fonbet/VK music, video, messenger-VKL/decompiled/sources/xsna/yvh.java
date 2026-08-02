package xsna;

import android.view.View;

/* compiled from: CommunityProfileWallView.kt */
/* loaded from: classes4.dex */
public final class yvh implements izs {
    public final /* synthetic */ vvh b;
    public final /* synthetic */ View c;
    public final /* synthetic */ String d;
    public final /* synthetic */ com.vk.movika.sdk.base.observable.o e;
    public final /* synthetic */ mh3 f;

    public yvh(vvh vvhVar, View view, String str, com.vk.movika.sdk.base.observable.o oVar, mh3 mh3Var) {
        this.b = vvhVar;
        this.c = view;
        this.d = str;
        this.e = oVar;
        this.f = mh3Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        vvh vvhVar = this.b;
        vvhVar.e(this.c, this.d, this.e, new ks2(9, vvhVar, this.f));
        return s3q0.a;
    }
}
