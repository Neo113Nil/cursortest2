package com.vkontakte.android.fragments;

import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import xsna.bpn0;
import xsna.cl30;
import xsna.i770;
import xsna.kyq0;
import xsna.l990;
import xsna.mpx0;
import xsna.qit0;
import xsna.rsg0;
import xsna.rt10;
import xsna.ver0;

/* compiled from: WikiPageLoaderHelper.kt */
/* loaded from: classes7.dex */
public final class h {
    public final Bundle a = new Bundle();
    public mpx0 b;

    public final void a(Context context) {
        new WeakReference(context);
        Bundle bundle = this.a;
        this.b = new mpx0(context, this, bundle);
        if (bundle.containsKey("nid")) {
            mpx0 mpx0Var = this.b;
            if (mpx0Var == null) {
                mpx0Var = null;
            }
            long j = bundle.getLong("oid", 0L);
            int i = bundle.getInt("nid", 0);
            mpx0Var.getClass();
            i770 i770Var = new i770("notes.getById");
            i770Var.D(j, "owner_id");
            i770Var.C(i, "note_id");
            io.reactivex.rxjava3.disposables.c subscribe = rsg0.y0(i770Var, null, null, 3).subscribe(new rt10(new kyq0(mpx0Var, 18), 28), new cl30(new qit0(7), 23));
            Context context2 = mpx0Var.c.get();
            if (context2 != null) {
                ver0.c(context2, subscribe);
                return;
            }
            return;
        }
        mpx0 mpx0Var2 = this.b;
        mpx0 mpx0Var3 = mpx0Var2 != null ? mpx0Var2 : null;
        Bundle bundle2 = mpx0Var3.b;
        bpn0 bpn0Var = mpx0Var3.d;
        if (bundle2.getLong("oid", 0L) == 0) {
            l990 l990Var = (l990) bpn0Var.getValue();
            String string = bundle2.getString("title");
            l990Var.c(string != null ? string : "");
        } else {
            if (bundle2.getInt("pid", 0) != 0) {
                ((l990) bpn0Var.getValue()).b(bundle2.getInt("pid", 0), bundle2.getLong("oid", 0L), bundle2.getBoolean("site", false));
                return;
            }
            long j2 = bundle2.getLong("oid", 0L);
            String string2 = bundle2.getString("title");
            ((l990) bpn0Var.getValue()).a(j2, string2 != null ? string2 : "");
        }
    }

    public final void b(int i) {
        this.a.putInt("nid", i);
    }

    public final void c(long j) {
        this.a.putLong("oid", j);
    }

    public final void d(int i) {
        this.a.putInt("pid", i);
    }

    public final void e(String str) {
        this.a.putString("refer", str);
    }

    public final void f(String str) {
        this.a.putString("section", str);
    }

    public final void g(boolean z) {
        this.a.putBoolean("site", z);
    }

    public final void h(String str) {
        this.a.putString("title", str);
    }
}
