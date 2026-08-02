package com.yandex.go.places.api.map;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.Rect;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.RotationType;
import com.yandex.runtime.image.ImageProvider;
import defpackage.bk21;
import defpackage.ck21;
import defpackage.dk21;
import defpackage.f4c0;
import defpackage.jl40;
import defpackage.pwy0;
import defpackage.pzt0;
import defpackage.ro21;
import defpackage.t691;
import defpackage.tje;
import defpackage.tse;
import defpackage.u8b1;
import defpackage.vr21;
import defpackage.wuj0;
import defpackage.xm00;
import defpackage.xw31;

/* loaded from: classes13.dex */
public final class b implements vr21 {
    public static final Point E = new Point(0.0d, 0.0d);
    public static final PointF F = new PointF(0.5f, 0.6f);
    public static final PointF G = new PointF(0.5f, 0.5f);
    public final IconStyle A;
    public final IconStyle B;
    public t691 C;
    public pzt0 D;
    public final Context a;
    public final xm00 b;
    public final com.yandex.go.places.impl.ui.common.map.location.a c;
    public final tse w;
    public final ImageProvider x;
    public final f4c0 y;
    public final f4c0 z;

    public b(Context context, xm00 xm00Var, com.yandex.go.places.impl.ui.common.map.location.a aVar, tse tseVar, pwy0 pwy0Var, ImageProvider imageProvider) {
        this.a = context;
        this.b = xm00Var;
        this.c = aVar;
        this.w = tseVar;
        this.x = imageProvider;
        tje.N(tseVar, null, null, new UserAvatarPlaceholder$special$$inlined$safeCollectIn$1(pwy0Var.a(), null, this), 3);
        Point point = E;
        this.y = new f4c0(point, null, 6);
        this.z = new f4c0(point, null, 6);
        this.A = new IconStyle().setFlat(Boolean.TRUE).setRotationType(RotationType.ROTATE);
        this.B = new IconStyle();
        this.C = ck21.a;
    }

    @Override // defpackage.vr21
    public final void f6(boolean z) {
        this.z.i(z);
    }

    @Override // defpackage.vr21
    public final void gg(Context context, ro21 ro21Var) {
        t691 t691Var = this.C;
        dk21 dk21Var = t691Var instanceof dk21 ? (dk21) t691Var : null;
        if (jl40.l(dk21Var != null ? dk21Var.a : null, ro21Var)) {
            return;
        }
        t691 t691Var2 = this.C;
        bk21 bk21Var = t691Var2 instanceof bk21 ? (bk21) t691Var2 : null;
        if (jl40.l(bk21Var != null ? bk21Var.a : null, ro21Var)) {
            return;
        }
        pzt0 pzt0Var = this.D;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.C = new dk21(ro21Var);
        Context context2 = this.a;
        Resources resources = context2.getResources();
        int i = ro21Var.h;
        Rect rect = xw31.a;
        ThreadLocal threadLocal = wuj0.a;
        Float valueOf = Float.valueOf(resources.getFloat(i));
        IconStyle iconStyle = this.A;
        iconStyle.setScale(valueOf);
        iconStyle.setAnchor(new PointF(context2.getResources().getFloat(ro21Var.f), context2.getResources().getFloat(ro21Var.g)));
        f4c0 f4c0Var = this.y;
        f4c0Var.D(iconStyle);
        f4c0Var.y(ImageProvider.fromBitmap(u8b1.h(ro21Var.b, context2)));
        f4c0Var.k(10.01f);
        PointF pointF = new PointF(context2.getResources().getFloat(ro21Var.d), context2.getResources().getFloat(ro21Var.e));
        IconStyle iconStyle2 = this.B;
        iconStyle2.setAnchor(pointF);
        f4c0 f4c0Var2 = this.z;
        f4c0Var2.D(iconStyle2);
        f4c0Var2.k(10.02f);
        f4c0Var2.y(ImageProvider.fromBitmap(u8b1.h(ro21Var.a, context2)));
        this.D = tje.N(this.w, null, null, new UserAvatarPlaceholder$loadAvatar$1(this, ro21Var, null), 3);
    }

    @Override // defpackage.vr21
    public final void kc(Point point) {
        f4c0 f4c0Var = this.y;
        f4c0Var.o(point);
        if (f4c0Var.f == null) {
            f4c0Var.b(this.b);
        }
    }

    @Override // defpackage.vr21
    public final void ob(float f) {
        this.y.v(f);
    }

    @Override // defpackage.vr21
    public final void s0() {
        this.z.d();
        this.y.d();
    }

    @Override // defpackage.vr21
    public final void setGeometry(Point point) {
        f4c0 f4c0Var = this.z;
        f4c0Var.o(point);
        if (f4c0Var.f == null) {
            f4c0Var.b(this.b);
        }
    }

    @Override // defpackage.vr21
    public final void w9(boolean z) {
        this.y.i(z);
    }
}
