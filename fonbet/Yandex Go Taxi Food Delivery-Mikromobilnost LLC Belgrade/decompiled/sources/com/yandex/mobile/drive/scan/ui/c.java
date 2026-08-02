package com.yandex.mobile.drive.scan.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.view.PreviewView;
import com.yandex.mobile.drive.view.Loader;
import com.yandex.mobile.drive.view.d;
import defpackage.bvf0;
import defpackage.dtg0;
import defpackage.e2c;
import defpackage.ike;
import defpackage.jy4;
import defpackage.ni91;
import defpackage.s2u0;
import defpackage.scc;
import defpackage.sk7;
import defpackage.tje;
import defpackage.zgh0;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public final class c {
    public final e2c A;
    public final ike B;
    public boolean C;
    public int D;
    public int E;
    public final Context a;
    public final Loader b;
    public final PreviewView c;
    public final View d;
    public final View e;
    public final View f;
    public final View g;
    public final View h;
    public final View i;
    public final View j;
    public final sk7 k;
    public final View l;
    public final View m;
    public final ImageView n;
    public final ViewGroup o;
    public final TextView p;
    public final TextView q;
    public final CameraPatternView r;
    public final List s;
    public final e2c t;
    public final e2c u;
    public final e2c v;
    public final e2c w;
    public final e2c x;
    public final e2c y;
    public final e2c z;

    public c(ViewGroup viewGroup, String str) {
        Context context = viewGroup.getContext();
        this.a = context;
        Loader loader = (Loader) viewGroup.findViewById(zgh0.hud);
        this.b = loader;
        this.c = (PreviewView) viewGroup.findViewById(zgh0.preview);
        View findViewById = viewGroup.findViewById(zgh0.turn);
        this.d = findViewById;
        View findViewById2 = viewGroup.findViewById(zgh0.torch);
        this.e = findViewById2;
        View findViewById3 = viewGroup.findViewById(zgh0.retake);
        this.f = findViewById3;
        View findViewById4 = viewGroup.findViewById(zgh0.photoOk);
        this.g = findViewById4;
        View findViewById5 = viewGroup.findViewById(zgh0.cameraClose);
        this.h = findViewById5;
        View findViewById6 = viewGroup.findViewById(zgh0.take);
        this.i = findViewById6;
        this.j = viewGroup.findViewById(zgh0.frontFlash);
        View findViewById7 = viewGroup.findViewById(zgh0.permission);
        sk7 sk7Var = new sk7(findViewById7);
        this.k = sk7Var;
        View findViewById8 = viewGroup.findViewById(zgh0.bottomBar);
        this.l = findViewById8;
        View findViewById9 = viewGroup.findViewById(zgh0.snap);
        this.m = findViewById9;
        this.n = (ImageView) viewGroup.findViewById(zgh0.snapshot);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(zgh0.topBar);
        this.o = viewGroup2;
        ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(zgh0.topContent);
        this.p = (TextView) viewGroup.findViewById(zgh0.capName);
        this.q = (TextView) viewGroup.findViewById(zgh0.capDesc);
        CameraPatternView cameraPatternView = (CameraPatternView) viewGroup.findViewById(zgh0.pattern);
        this.r = cameraPatternView;
        this.s = scc.g(viewGroup2, findViewById9, findViewById8, cameraPatternView);
        this.t = d.a(findViewById3);
        this.u = d.a(findViewById4);
        this.v = d.a(findViewById2);
        this.w = d.a(findViewById6);
        this.x = d.a(findViewById5);
        this.y = d.a((View) sk7Var.c);
        this.z = d.a((View) sk7Var.w);
        this.A = d.a(findViewById);
        this.B = bvf0.b();
        loader.applyModernLoadStyle();
        TextView textView = (TextView) findViewById7.findViewById(zgh0.permissionMessage);
        textView.setText(str);
        int i = 8;
        textView.setVisibility((str == null || str.length() == 0) ? 8 : 0);
        int i2 = 26;
        ni91.j(findViewById9, new s2u0(i2));
        ni91.j(viewGroup, new jy4(this, context.getResources().getDimensionPixelSize(dtg0.topBarHeight), i));
        ni91.j(viewGroup3, new s2u0(28));
        ni91.j(findViewById8, new s2u0(i2));
        ni91.j(findViewById7, new s2u0(i2));
    }

    public final void a(boolean z) {
        c(z, true);
        this.r.animate().setDuration(350L).alpha(z ? 0.0f : 1.0f);
        if (z) {
            return;
        }
        this.i.setVisibility(0);
        this.b.setVisibility(8);
        tje.N(this.B, null, null, new ScanView$setConfirm$1(this, null), 3);
    }

    public final void b(boolean z) {
        this.c.setVisibility(!z ? 0 : 8);
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(!z ? 0 : 8);
        }
        sk7 sk7Var = this.k;
        if (z) {
            ((View) sk7Var.b).setVisibility(0);
        } else {
            ((View) sk7Var.b).setVisibility(8);
        }
    }

    public final void c(boolean z, boolean z2) {
        this.C = z;
        Resources resources = this.a.getResources();
        float dimension = z ? resources.getDimension(dtg0.bottomBarVisible) : resources.getDimension(dtg0.bottomBarHeight) + this.D;
        float dimension2 = z ? resources.getDimension(dtg0.picSize) + this.D : resources.getDimension(dtg0.picVisible);
        float f = z ? -(resources.getDimension(dtg0.topBarHeight) + this.E) : 0.0f;
        View view = this.l;
        ViewGroup viewGroup = this.o;
        View view2 = this.m;
        if (z2) {
            view.animate().setDuration(350L).translationY(dimension);
            view2.animate().setDuration(350L).translationY(dimension2);
            viewGroup.animate().setDuration(350L).translationY(f);
        } else {
            view.animate().cancel();
            view.setTranslationY(dimension);
            view2.animate().cancel();
            view2.setTranslationY(dimension2);
            viewGroup.animate().cancel();
            viewGroup.setTranslationY(f);
        }
        this.d.setClickable(!z);
    }
}
