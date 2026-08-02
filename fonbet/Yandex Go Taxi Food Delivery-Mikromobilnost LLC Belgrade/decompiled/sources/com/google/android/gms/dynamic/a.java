package com.google.android.gms.dynamic;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.b;
import defpackage.cz81;
import defpackage.mz81;
import defpackage.qy81;
import defpackage.ry81;
import defpackage.sl81;
import defpackage.udy;
import defpackage.uz81;
import java.util.LinkedList;

/* loaded from: classes11.dex */
public abstract class a {
    public udy a;
    public Bundle b;
    public LinkedList c;
    public final sl81 d = new sl81(this);

    public static void k(FrameLayout frameLayout) {
        com.google.android.gms.common.a aVar = com.google.android.gms.common.a.d;
        Context context = frameLayout.getContext();
        int d = aVar.d(context, b.a);
        String c = qy81.c(d, context);
        String b = qy81.b(d, context);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(c);
        linearLayout.addView(textView);
        Intent b2 = aVar.b(context, d, null);
        if (b2 != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(b);
            linearLayout.addView(button);
            button.setOnClickListener(new zae(context, b2));
        }
    }

    public abstract void a(sl81 sl81Var);

    public final void b(Bundle bundle) {
        m(bundle, new ry81(this, bundle));
    }

    public final FrameLayout c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        m(bundle, new cz81(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.a == null) {
            k(frameLayout);
        }
        return frameLayout;
    }

    public final void d() {
        udy udyVar = this.a;
        if (udyVar != null) {
            udyVar.onDestroy();
        } else {
            l(1);
        }
    }

    public final void e() {
        udy udyVar = this.a;
        if (udyVar != null) {
            udyVar.onLowMemory();
        }
    }

    public final void f() {
        udy udyVar = this.a;
        if (udyVar != null) {
            udyVar.onPause();
        } else {
            l(5);
        }
    }

    public final void g() {
        m(null, new mz81(this, 1));
    }

    public final void h(Bundle bundle) {
        udy udyVar = this.a;
        if (udyVar != null) {
            udyVar.onSaveInstanceState(bundle);
            return;
        }
        Bundle bundle2 = this.b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    public final void i() {
        m(null, new mz81(this, 0));
    }

    public final void j() {
        udy udyVar = this.a;
        if (udyVar != null) {
            udyVar.onStop();
        } else {
            l(4);
        }
    }

    public final void l(int i) {
        while (!this.c.isEmpty() && ((uz81) this.c.getLast()).zaa() >= i) {
            this.c.removeLast();
        }
    }

    public final void m(Bundle bundle, uz81 uz81Var) {
        if (this.a != null) {
            uz81Var.zab();
            return;
        }
        if (this.c == null) {
            this.c = new LinkedList();
        }
        this.c.add(uz81Var);
        if (bundle != null) {
            Bundle bundle2 = this.b;
            if (bundle2 == null) {
                this.b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        a(this.d);
    }
}
