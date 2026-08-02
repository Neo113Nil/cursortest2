package xsna;

import android.content.Context;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.photo.PhotoTag;
import com.vk.dto.tags.Tag;
import com.vk.ecomm.tool.view.feed.ProductsPhotoOverlayView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: OverlayViewControllerImpl.kt */
/* loaded from: classes18.dex */
public final class g390 implements d390, g530 {
    public int b;
    public final k2o0 c;
    public final fea0 d;
    public final ProductsPhotoOverlayView e;

    public g390(Context context, q530 q530Var, o0r0 o0r0Var) {
        k2o0 k2o0Var = new k2o0(context);
        bwt0.p0(k2o0Var, false);
        k2o0Var.setOnTagClickListener(new defpackage.m(29, o0r0Var, context));
        this.c = k2o0Var;
        if (q530Var != null) {
            q530Var.d(this);
            s3q0 s3q0Var = s3q0.a;
        } else {
            q530Var = null;
        }
        fea0 fea0Var = new fea0(context, q530Var);
        this.d = fea0Var;
        this.e = fea0Var.g;
    }

    @Override // xsna.g530
    public final void H2() {
        Iterator it = this.d.e.iterator();
        while (it.hasNext()) {
            ((ctd0) it.next()).c();
        }
    }

    @Override // xsna.d390
    public final View a() {
        return this.e;
    }

    @Override // xsna.d390
    public final void b() {
        d3m.e(this.c, (r15 & 1) != 0 ? 300L : 150L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
    }

    @Override // xsna.d390
    public final void c() {
        this.d.a();
    }

    @Override // xsna.d390
    public final void d(b9u0 b9u0Var) {
        this.c.setDisplayRectProvider(b9u0Var);
        this.d.h = b9u0Var;
    }

    @Override // xsna.d390
    public final void e() {
        d3m.e(this.e, (r15 & 1) != 0 ? 300L : 150L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
    }

    @Override // xsna.d390
    public final void f(List<PhotoTag> list) {
        this.c.setPhotoTags(list);
    }

    @Override // xsna.d390
    public final View g() {
        return this.c;
    }

    @Override // xsna.d390
    public final int getCurrentPosition() {
        return this.b;
    }

    @Override // xsna.d390
    public final void h(int i) {
        if (this.b != i) {
            this.c.setPhotoTags(EmptyList.b);
        }
        this.b = i;
    }

    @Override // xsna.d390
    public final void i(wlw wlwVar) {
        this.d.i = wlwVar;
    }

    @Override // xsna.d390
    public final void j() {
        d3m.c(this.e, (r15 & 1) != 0 ? 300L : 150L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // xsna.d390
    public final void k(List<Tag> list, boolean z) {
        fea0 fea0Var = this.d;
        ArrayList arrayList = fea0Var.c;
        arrayList.clear();
        arrayList.addAll(list);
        fea0Var.d = z;
        fea0Var.a();
    }

    @Override // xsna.d390
    public final void l(tbq tbqVar) {
        this.d.j = tbqVar;
    }

    @Override // xsna.d390
    public final void m() {
        d3m.c(this.c, (r15 & 1) != 0 ? 300L : 150L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // xsna.g530
    public final void g3() {
    }
}
