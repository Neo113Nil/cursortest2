package xsna;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.widget.EditText;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vk.typography.a;
import kotlin.text.Regex;

/* compiled from: TextPostingPresenter.kt */
/* loaded from: classes4.dex */
public final class lko0 implements jko0 {
    public static final Regex o = new Regex(".*\\[id[0-9]+\\|(\\s)*].*");
    public static final Regex p = new Regex(".*\\[club[0-9]+\\|(\\s)*].*");
    public final qdc0 b;
    public final kko0 c;
    public final boolean d;
    public boolean e;
    public boolean f;
    public final pil g;
    public final float h;
    public final float i;
    public final Typeface j;
    public final Typeface k;
    public q420 l;
    public dvu m;
    public boolean n;

    public lko0(qdc0 qdc0Var, oko0 oko0Var, ndc0 ndc0Var) {
        this.b = qdc0Var;
        this.c = oko0Var;
        this.d = ndc0Var.d;
        Context context = e43.a;
        this.g = new pil(context == null ? null : context);
        this.h = 23.0f;
        this.i = 16.0f;
        Context context2 = e43.a;
        context2 = context2 == null ? null : context2;
        FontFamily fontFamily = FontFamily.LIGHT;
        TextSizeUnit textSizeUnit = TextSizeUnit.SP;
        this.j = a.C1933a.a(context2, fontFamily, 23.0f, textSizeUnit).a;
        Context context3 = e43.a;
        this.k = a.C1933a.a(context3 != null ? context3 : null, FontFamily.REGULAR, 16.0f, textSizeUnit).a;
        this.n = true;
    }

    public final void Z() {
        if (this.n) {
            this.n = false;
            float f = this.i;
            kko0 kko0Var = this.c;
            kko0Var.Qi(f);
            kko0Var.sm(this.k);
        }
    }

    @Override // com.vk.dto.stories.model.mention.SelectionChangeEditText.a
    public final void b(int i, int i2) {
        if (i != i2) {
            return;
        }
        dvu dvuVar = this.m;
        if (dvuVar != null) {
            dvuVar.b(i);
        }
        q420 q420Var = this.l;
        if (q420Var == null) {
            q420Var = null;
        }
        q420Var.d(i);
    }

    public final void d0(boolean z) {
        this.c.v7(z);
    }

    public final void g(String str) {
        this.c.rk(str);
    }

    @Override // xsna.cc6
    public final void onDestroy() {
        throw null;
    }

    @Override // xsna.cc6
    public final void onPause() {
        throw null;
    }

    @Override // xsna.cc6
    public final void onResume() {
        throw null;
    }

    @Override // xsna.ik6
    public final void onStart() {
        boolean z = this.d;
        qdc0 qdc0Var = this.b;
        kko0 kko0Var = this.c;
        if (z) {
            EditText l0 = kko0Var.l0();
            this.m = new dvu(l0, qdc0Var, new pil(l0.getContext()));
        }
        this.l = new q420(kko0Var.l0(), qdc0Var, this.g, 24);
        bpn0 bpn0Var = t5m.a;
        if ("samsung".equalsIgnoreCase(Build.MANUFACTURER) && "j1xlte".equalsIgnoreCase(Build.DEVICE)) {
            Z();
        }
    }

    @Override // xsna.jko0
    public final void setText(CharSequence charSequence) {
        this.e = true;
        this.c.setText(charSequence);
    }

    public final void x() {
        this.c.d0();
    }

    public final void z() {
        bpn0 bpn0Var = t5m.a;
        if ("samsung".equalsIgnoreCase(Build.MANUFACTURER) && "j1xlte".equalsIgnoreCase(Build.DEVICE)) {
            this.n = true;
            Z();
        } else {
            if (this.n) {
                return;
            }
            this.n = true;
            float f = this.h;
            kko0 kko0Var = this.c;
            kko0Var.Qi(f);
            kko0Var.sm(this.j);
        }
    }

    @Override // xsna.ik6
    public final void onStop() {
    }
}
