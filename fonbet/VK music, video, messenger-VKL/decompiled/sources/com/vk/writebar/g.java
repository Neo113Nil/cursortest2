package com.vk.writebar;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.writebar.a;
import com.vk.writebar.b;
import com.vkontakte.android.R;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import xsna.b2y0;
import xsna.bpn0;
import xsna.bwt0;
import xsna.dhr0;
import xsna.f4m;
import xsna.gbt0;
import xsna.h1y0;
import xsna.h6m0;
import xsna.hfm0;
import xsna.ikk0;
import xsna.kkm;
import xsna.lqs0;
import xsna.msy;
import xsna.pyr0;
import xsna.qbe0;
import xsna.qqt0;
import xsna.sjo;
import xsna.x2j0;
import xsna.x9l0;
import xsna.xq4;

/* compiled from: WriteBarAudioHolder.kt */
/* loaded from: classes7.dex */
public final class g {
    public final WriteBar a;
    public final WriteBar b;
    public final b2y0 c;
    public h1y0 d;
    public boolean e;
    public boolean f;
    public final Object g;
    public final Object h;
    public final bpn0 i;
    public final bpn0 j;
    public final bpn0 k;
    public final bpn0 l;
    public final bpn0 m;
    public b n;
    public a o;
    public final bpn0 p;
    public final bpn0 q;

    public g(WriteBar writeBar, WriteBar writeBar2, b2y0 b2y0Var) {
        this.a = writeBar;
        this.b = writeBar2;
        this.c = b2y0Var;
        qbe0 qbe0Var = new qbe0(16);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.g = msy.a(lazyThreadSafetyMode, qbe0Var);
        UUID.randomUUID().toString();
        this.h = msy.a(lazyThreadSafetyMode, new pyr0(this, 19));
        this.i = new bpn0(new x9l0(this, 27));
        this.j = new bpn0(new lqs0(this, 13));
        this.k = new bpn0(new x2j0(this, 26));
        this.l = new bpn0(new h6m0(this, 28));
        this.m = new bpn0(new ikk0(this, 24));
        this.p = new bpn0(new qqt0(this, 9));
        this.q = new bpn0(new gbt0(this, 8));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void a() {
        Drawable drawable;
        b2y0 b2y0Var = this.c;
        int b = b2y0Var.b(R.attr.vk_ui_text_accent);
        kkm kkmVar = b2y0Var.b;
        int f = kkmVar != null ? kkmVar.f(R.attr.vk_ui_text_negative) : dhr0.t.c(R.attr.vk_ui_text_negative);
        if (this.h.isInitialized()) {
            b bVar = this.n;
            if (bVar == null) {
                bVar = null;
            }
            bVar.getClass();
            a aVar = this.o;
            a aVar2 = aVar != null ? aVar : null;
            aVar2.e = f;
            aVar2.f = b;
            WaveRecordCircleView waveRecordCircleView = aVar2.i;
            if (waveRecordCircleView != null) {
                waveRecordCircleView.setPaintColor(b);
            }
            ObjectAnimator objectAnimator = aVar2.h;
            if (objectAnimator != null) {
                objectAnimator.setIntValues(b, f);
            }
            ImageView imageView = aVar2.t;
            if (imageView != null && (drawable = imageView.getDrawable()) != null) {
                sjo.b(drawable, b, PorterDuff.Mode.SRC_IN);
            }
            c().setTextColor(b);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final xq4 b() {
        return (xq4) this.g.getValue();
    }

    public final TextView c() {
        return (TextView) this.i.getValue();
    }

    public final View d() {
        return (View) this.k.getValue();
    }

    public final View e() {
        return (View) this.j.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ViewGroup f() {
        return (ViewGroup) this.h.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void g() {
        if (this.h.isInitialized()) {
            return;
        }
        bwt0.i0(c(), new hfm0(this, 27));
        WriteBar writeBar = this.a;
        View findViewById = writeBar.findViewById(R.id.writebar_action);
        View findViewById2 = writeBar.findViewById(R.id.writebar_record_video);
        if (!f4m.h(findViewById)) {
            findViewById = findViewById2;
        }
        Context context = writeBar.getContext();
        this.n = new b(context, findViewById, c(), (b.a) this.p.getValue());
        this.o = new a(context, findViewById, c(), (a.d) this.q.getValue());
        a();
    }

    public final void h(int i) {
        String format = String.format(Locale.US, "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i / 60), Integer.valueOf(i % 60)}, 2));
        g();
        ((TextView) this.m.getValue()).setText(format);
    }
}
