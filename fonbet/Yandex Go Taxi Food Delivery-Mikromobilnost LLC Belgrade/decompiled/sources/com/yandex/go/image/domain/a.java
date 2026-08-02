package com.yandex.go.image.domain;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.yandex.go.image.domain.requests.d;
import com.yandex.go.image.domain.requests.e;
import com.yandex.go.image.domain.requests.f;
import com.yandex.go.image.domain.requests.g;
import defpackage.aev;
import defpackage.am2;
import defpackage.cpe0;
import defpackage.fyg;
import defpackage.g16;
import defpackage.i2v;
import defpackage.i3y;
import defpackage.kq2;
import defpackage.lbm;
import defpackage.nac;
import defpackage.oav;
import defpackage.pav;
import defpackage.ppr;
import defpackage.pwy0;
import defpackage.qje;
import defpackage.wls;

/* loaded from: classes.dex */
public final class a implements pav {
    public static final wls f = ImageLoaderImpl$Companion$IMAGE_SET$1.b;
    public final Context a;
    public final ppr b;
    public final i3y c;
    public final i3y d;
    public final i3y e = kotlin.a.a(new i2v(3));

    public a(Context context, kq2 kq2Var, kq2 kq2Var2, ppr pprVar) {
        this.a = context;
        this.b = pprVar;
        this.c = kotlin.a.a(kq2Var);
        this.d = kotlin.a.a(kq2Var2);
    }

    @Override // defpackage.pav
    public final lbm a(ImageView imageView) {
        return new nac(imageView, f, (oav) this.c.getValue(), (pwy0) this.d.getValue(), this.b);
    }

    @Override // defpackage.pav
    public final g16 b() {
        return new d(this.a, (oav) this.c.getValue(), (pwy0) this.d.getValue(), this.b);
    }

    @Override // defpackage.pav
    public final void c(ImageView imageView) {
        imageView.setImageDrawable(null);
        qje.v(imageView).dispose();
    }

    @Override // defpackage.pav
    public final am2 d() {
        oav oavVar = (oav) this.c.getValue();
        fyg fygVar = (fyg) this.e.getValue();
        am2 am2Var = new am2();
        Context context = this.a;
        am2Var.a = context;
        am2Var.b = oavVar;
        aev aevVar = new aev(context);
        aevVar.h = fygVar;
        am2Var.c = aevVar;
        return am2Var;
    }

    @Override // defpackage.pav
    public final cpe0 e() {
        return new g(this.a, (oav) this.c.getValue(), (pwy0) this.d.getValue(), this.b);
    }

    @Override // defpackage.pav
    public final lbm f(wls wlsVar, View view) {
        return new nac(view, wlsVar, (oav) this.c.getValue(), (pwy0) this.d.getValue(), this.b);
    }

    @Override // defpackage.pav
    public final f g() {
        return new f(this.a, (oav) this.c.getValue(), (pwy0) this.d.getValue(), this.b);
    }

    @Override // defpackage.pav
    public final e h() {
        return new e(this.a, (oav) this.c.getValue(), (pwy0) this.d.getValue());
    }
}
