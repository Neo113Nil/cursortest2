package androidx.compose.foundation.text.input.internal;

import android.graphics.Rect;
import android.view.View;
import defpackage.asy0;
import defpackage.cre;
import defpackage.dry0;
import defpackage.eiv;
import defpackage.ffx;
import defpackage.g9y;
import defpackage.h0w;
import defpackage.hoy0;
import defpackage.hyu0;
import defpackage.iv60;
import defpackage.jl40;
import defpackage.lz40;
import defpackage.m810;
import defpackage.oav0;
import defpackage.pay;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.u50;
import defpackage.v9y;
import defpackage.w9y;
import defpackage.zii0;
import defpackage.zjy0;
import defpackage.zy11;
import java.lang.ref.WeakReference;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes10.dex */
public final class a extends w9y {
    public pzt0 b;
    public pay c;
    public n0 d;

    @Override // defpackage.gwc0
    public final void a() {
        pzt0 pzt0Var = this.b;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.b = null;
        lz40 k = k();
        if (k != null) {
            ((n0) k).f();
        }
    }

    @Override // defpackage.gwc0
    public final void b(hoy0 hoy0Var, hoy0 hoy0Var2) {
        pay payVar = this.c;
        if (payVar != null) {
            boolean z = (asy0.b(payVar.h.b, hoy0Var2.b) && jl40.l(payVar.h.c, hoy0Var2.c)) ? false : true;
            payVar.h = hoy0Var2;
            int size = payVar.j.size();
            for (int i = 0; i < size; i++) {
                RecordingInputConnection recordingInputConnection = (RecordingInputConnection) ((WeakReference) payVar.j.get(i)).get();
                if (recordingInputConnection != null) {
                    recordingInputConnection.setTextFieldValue$foundation(hoy0Var2);
                }
            }
            c cVar = payVar.m;
            synchronized (cVar.c) {
                cVar.j = null;
                cVar.l = null;
                cVar.k = null;
                cVar.m = null;
                cVar.n = null;
            }
            if (jl40.l(hoy0Var, hoy0Var2)) {
                if (z) {
                    h0w h0wVar = payVar.b;
                    int f = asy0.f(hoy0Var2.b);
                    int e = asy0.e(hoy0Var2.b);
                    asy0 asy0Var = payVar.h.c;
                    int f2 = asy0Var != null ? asy0.f(asy0Var.a) : -1;
                    asy0 asy0Var2 = payVar.h.c;
                    h0wVar.l().updateSelection((View) h0wVar.b, f, e, f2, asy0Var2 != null ? asy0.e(asy0Var2.a) : -1);
                    return;
                }
                return;
            }
            if (hoy0Var != null && (!jl40.l(hoy0Var.a.b, hoy0Var2.a.b) || (asy0.b(hoy0Var.b, hoy0Var2.b) && !jl40.l(hoy0Var.c, hoy0Var2.c)))) {
                h0w h0wVar2 = payVar.b;
                h0wVar2.l().restartInput((View) h0wVar2.b);
                return;
            }
            int size2 = payVar.j.size();
            for (int i2 = 0; i2 < size2; i2++) {
                RecordingInputConnection recordingInputConnection2 = (RecordingInputConnection) ((WeakReference) payVar.j.get(i2)).get();
                if (recordingInputConnection2 != null) {
                    recordingInputConnection2.updateInputState(payVar.h, payVar.b);
                }
            }
        }
    }

    @Override // defpackage.gwc0
    public final void c(hoy0 hoy0Var, eiv eivVar, zjy0 zjy0Var, cre creVar) {
        l(new u50(hoy0Var, this, eivVar, zjy0Var, creVar, 1));
    }

    @Override // defpackage.gwc0
    public final void d() {
        l(null);
    }

    @Override // defpackage.gwc0
    public final void f(zii0 zii0Var) {
        Rect rect;
        pay payVar = this.c;
        if (payVar != null) {
            payVar.l = new Rect(m810.b(zii0Var.a), m810.b(zii0Var.b), m810.b(zii0Var.c), m810.b(zii0Var.d));
            if (!payVar.j.isEmpty() || (rect = payVar.l) == null) {
                return;
            }
            payVar.a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // defpackage.gwc0
    public final void h(hoy0 hoy0Var, iv60 iv60Var, dry0 dry0Var, oav0 oav0Var, zii0 zii0Var, zii0 zii0Var2) {
        pay payVar = this.c;
        if (payVar != null) {
            c cVar = payVar.m;
            synchronized (cVar.c) {
                try {
                    cVar.j = hoy0Var;
                    cVar.l = iv60Var;
                    cVar.k = dry0Var;
                    cVar.m = zii0Var;
                    cVar.n = zii0Var2;
                    if (!cVar.e) {
                        if (cVar.d) {
                        }
                    }
                    cVar.a();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.w9y
    public final void i() {
        lz40 k = k();
        if (k != null) {
            ((n0) k).g(zy11.a);
        }
    }

    public final lz40 k() {
        n0 n0Var = this.d;
        if (n0Var != null) {
            return n0Var;
        }
        if (!hyu0.a) {
            return null;
        }
        n0 c = ffx.c(1, 0, BufferOverflow.DROP_LATEST, 2);
        this.d = c;
        return c;
    }

    public final void l(u50 u50Var) {
        v9y v9yVar = this.a;
        if (v9yVar == null) {
            return;
        }
        AndroidLegacyPlatformTextInputServiceAdapter$startInput$2 androidLegacyPlatformTextInputServiceAdapter$startInput$2 = new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(u50Var, this, v9yVar, null);
        g9y g9yVar = (g9y) v9yVar;
        this.b = g9yVar.isAttached() ? tje.N(g9yVar.getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1(g9yVar, androidLegacyPlatformTextInputServiceAdapter$startInput$2, null), 1) : null;
    }
}
