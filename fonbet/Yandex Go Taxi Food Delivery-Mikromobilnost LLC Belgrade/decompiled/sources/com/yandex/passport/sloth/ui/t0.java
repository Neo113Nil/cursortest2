package com.yandex.passport.sloth.ui;

import android.R;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yandex.passport.sloth.SlothMetricaEvent$Event;
import com.yandex.passport.sloth.ui.string.SlothString;
import defpackage.li91;
import defpackage.sls;
import defpackage.w511;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class t0 implements com.yandex.passport.sloth.ui.webview.n {
    public final o0 a;
    public final com.yandex.passport.sloth.ui.string.a b;
    public final c1 c;
    public sls d;
    public boolean e;
    public w f = s0.c;

    public t0(o0 o0Var, com.yandex.passport.sloth.ui.string.a aVar, c1 c1Var) {
        this.a = o0Var;
        this.b = aVar;
        this.c = c1Var;
    }

    public static String a(w wVar) {
        if (wVar.equals(s0.a)) {
            return "ConnectionError";
        }
        if (wVar.equals(s0.b)) {
            return "Progress";
        }
        if (wVar.equals(s0.c)) {
            return "WebView";
        }
        w511.b();
        return null;
    }

    public final void b(w wVar) {
        q0 q0Var = q0.a;
        s0 s0Var = s0.c;
        if (wVar.equals(this.f)) {
            return;
        }
        if (this.e && wVar.equals(s0Var)) {
            return;
        }
        boolean equals = wVar.equals(s0.b);
        o0 o0Var = this.a;
        if (equals) {
            o0Var.x.setVisibility(8);
            i2 i2Var = o0Var.y;
            ((LinearLayout) i2Var.getRoot()).setVisibility(0);
            i2Var.w.setVisibility(0);
            i2Var.y.setVisibility(8);
            i2Var.z.setVisibility(8);
            f(q0Var, false);
        } else if (wVar.equals(s0Var)) {
            o0Var.x.setVisibility(0);
            ((LinearLayout) o0Var.y.getRoot()).setVisibility(8);
            f(q0Var, false);
        } else if (!wVar.equals(s0.a)) {
            w511.b();
            return;
        }
        this.c.a(new com.yandex.passport.sloth.n0(SlothMetricaEvent$Event.UI_STATE_CHANGE, kotlin.collections.b.i(new Pair("from", a(this.f)), new Pair("to", a(wVar)))));
        this.f = wVar;
    }

    public final void c() {
        b(s0.a);
        o0 o0Var = this.a;
        o0Var.x.setVisibility(8);
        i2 i2Var = o0Var.y;
        ((LinearLayout) i2Var.getRoot()).setVisibility(0);
        i2Var.w.setVisibility(0);
        i2Var.y.setVisibility(8);
        TextView textView = i2Var.z;
        textView.setVisibility(0);
        textView.setText(((com.yandex.passport.internal.ui.sloth.k) this.b).a(SlothString.ERROR_CONNECTION_LOST));
        f(q0.a, true);
    }

    public final void d(SlothString slothString, r0 r0Var) {
        o0 o0Var = this.a;
        o0Var.x.setVisibility(8);
        i2 i2Var = o0Var.y;
        ((LinearLayout) i2Var.getRoot()).setVisibility(0);
        i2Var.w.setVisibility(8);
        ImageView imageView = i2Var.y;
        imageView.setVisibility(0);
        imageView.setImageResource(d.passport_sloth_unexpected_error);
        TextView textView = i2Var.z;
        textView.setVisibility(0);
        textView.setText(((com.yandex.passport.internal.ui.sloth.k) this.b).a(slothString));
        f(r0Var, false);
    }

    public final void e(sls slsVar) {
        d(SlothString.ERROR_UNEXPECTED, new p0(slsVar));
    }

    public final void f(r0 r0Var, boolean z) {
        Button button = this.a.y.A;
        if (r0Var.equals(q0.c)) {
            button.setVisibility(8);
            button.setText("");
            button.setOnClickListener(null);
            return;
        }
        if (r0Var.equals(q0.a)) {
            button.setVisibility(z ? 0 : 8);
            button.setText(R.string.cancel);
            li91.e(new SlothUiController$switchButton$1$1(this, null), button);
            return;
        }
        boolean equals = r0Var.equals(q0.b);
        com.yandex.passport.sloth.ui.string.a aVar = this.b;
        if (equals) {
            button.setVisibility(0);
            button.setText(((com.yandex.passport.internal.ui.sloth.k) aVar).a(SlothString.CLOSE));
            li91.e(new SlothUiController$switchButton$1$2(this, null), button);
        } else {
            if (!(r0Var instanceof p0)) {
                w511.b();
                return;
            }
            button.setVisibility(8);
            button.setText(((com.yandex.passport.internal.ui.sloth.k) aVar).a(SlothString.BACK_BUTTON));
            li91.e(new SlothUiController$switchButton$1$3(r0Var, null), button);
        }
    }
}
