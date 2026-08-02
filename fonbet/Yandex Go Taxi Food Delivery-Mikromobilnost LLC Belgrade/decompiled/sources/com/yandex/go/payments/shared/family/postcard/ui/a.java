package com.yandex.go.payments.shared.family.postcard.ui;

import android.graphics.Bitmap;
import com.yandex.go.payments.shared.family.web.nativeapi.request.BackgroundState;
import defpackage.ad5;
import defpackage.d800;
import defpackage.k7x0;
import defpackage.kfe0;
import defpackage.m7x0;
import defpackage.pav;
import defpackage.pzt0;
import defpackage.rv70;
import defpackage.scc;
import defpackage.tje;
import defpackage.ugd0;
import defpackage.z9p;
import defpackage.zuj0;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes13.dex */
public final class a extends ad5 {
    public final rv70 A;
    public final k7x0 B;
    public final z9p C;
    public ugd0 D;
    public pzt0 E;
    public int F;
    public List G;
    public Bitmap[] H;
    public boolean I;
    public final pav x;
    public final d800 y;
    public final zuj0 z;

    public a(pav pavVar, d800 d800Var, zuj0 zuj0Var, rv70 rv70Var, k7x0 k7x0Var, z9p z9pVar) {
        super(kfe0.class);
        this.x = pavVar;
        this.y = d800Var;
        this.z = zuj0Var;
        this.A = rv70Var;
        this.B = k7x0Var;
        this.C = z9pVar;
        this.G = EmptyList.a;
        this.H = new Bitmap[0];
    }

    public final void Kg(boolean z) {
        Bitmap bitmap;
        if (this.G.isEmpty()) {
            return;
        }
        if (z || this.F + 1 > scc.f(this.G)) {
            this.F = 0;
        } else {
            this.F++;
        }
        int i = this.F;
        Bitmap[] bitmapArr = this.H;
        if (i < bitmapArr.length && (bitmap = bitmapArr[i]) != null) {
            ((kfe0) Dg()).P7(false);
            ((kfe0) Dg()).be(bitmap, ((BackgroundState) this.G.get(this.F)).b);
            return;
        }
        String a = ((m7x0) this.B).a(((BackgroundState) this.G.get(i)).a);
        ((kfe0) Dg()).P7(true);
        ((kfe0) Dg()).be(null, ((BackgroundState) this.G.get(this.F)).b);
        pzt0 pzt0Var = this.E;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.E = tje.N(Jg(), null, null, new PostcardPresenter$changeBackgroundClick$1(this, a, null), 3);
    }
}
