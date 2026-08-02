package yads;

import android.view.View;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.fpf0;
import xsna.p5j;
import xsna.qcy;

/* loaded from: classes10.dex */
public final class pw2 extends to1 {
    public static final /* synthetic */ qcy[] j = {new MutablePropertyReference1Impl(pw2.class, "weakMediaView", "getWeakMediaView()Lcom/monetization/ads/nativeads/CustomizableMediaView;", 0), p5j.a(0, pw2.class, "weakMediaValue", "getWeakMediaValue()Lcom/monetization/ads/network/model/MediaValue;", fpf0.a), new MutablePropertyReference1Impl(pw2.class, "currentViewAdapter", "getCurrentViewAdapter()Lcom/monetization/ads/nativeads/assetadapter/viewadapter/MediaViewAdapter;", 0)};
    public final to1 d;
    public final to1 e;
    public final c13 f;
    public final mn2 g;
    public final mn2 h;
    public final ow2 i;

    public pw2(CustomizableMediaView customizableMediaView, lw2 lw2Var, to1 to1Var, bp1 bp1Var, c13 c13Var) {
        super(customizableMediaView, bp1Var);
        this.d = lw2Var;
        this.e = to1Var;
        this.f = c13Var;
        this.g = nn2.a(null);
        this.h = nn2.a(null);
        this.i = new ow2(lw2Var, this);
        customizableMediaView.setOnSizeChangedListener$mobileads_externalRelease(new mw2(new WeakReference(this)));
    }

    @Override // yads.ll3
    public final void a(View view) {
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) view;
        this.d.a((View) customizableMediaView);
        this.e.a((View) customizableMediaView);
    }

    @Override // yads.to1
    public final so1 d() {
        return ((to1) this.i.getValue(this, j[2])).d();
    }

    @Override // yads.ll3
    public final void a(oi oiVar, ol3 ol3Var, Object obj) {
        po1 po1Var = (po1) obj;
        this.d.a(oiVar, ol3Var, po1Var);
        this.e.a(oiVar, ol3Var, po1Var);
    }

    @Override // yads.ll3
    public final void a() {
        ((to1) this.i.getValue(this, j[2])).a();
    }

    @Override // yads.to1
    public final void a(CustomizableMediaView customizableMediaView) {
        this.d.a(customizableMediaView);
        this.e.a(customizableMediaView);
    }

    @Override // yads.ll3
    public final boolean a(View view, Object obj) {
        return ((to1) this.i.getValue(this, j[2])).a(view, obj);
    }

    @Override // yads.to1
    /* renamed from: a */
    public final void b(CustomizableMediaView customizableMediaView, po1 po1Var) {
        mn2 mn2Var = this.g;
        qcy<?>[] qcyVarArr = j;
        qcy<?> qcyVar = qcyVarArr[0];
        mn2Var.getClass();
        mn2Var.a = new WeakReference(customizableMediaView);
        mn2 mn2Var2 = this.h;
        qcy<?> qcyVar2 = qcyVarArr[1];
        mn2Var2.getClass();
        mn2Var2.a = new WeakReference(po1Var);
        ((to1) this.i.getValue(this, qcyVarArr[2])).b(customizableMediaView, po1Var);
    }

    @Override // yads.to1
    public final void a(po1 po1Var) {
        ((to1) this.i.getValue(this, j[2])).a(po1Var);
    }
}
