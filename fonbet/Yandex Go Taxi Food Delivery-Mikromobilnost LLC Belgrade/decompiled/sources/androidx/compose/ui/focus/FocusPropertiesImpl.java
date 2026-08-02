package androidx.compose.ui.focus;

import defpackage.rur;
import defpackage.tls;
import defpackage.xw91;
import defpackage.yur;
import defpackage.zii0;

/* loaded from: classes10.dex */
public final class FocusPropertiesImpl implements rur {
    public boolean a = true;
    public yur b;
    public final yur c;
    public final yur d;
    public yur e;
    public final yur f;
    public final yur g;
    public final yur h;
    public final yur i;
    public tls j;
    public tls k;
    public zii0 l;

    public FocusPropertiesImpl() {
        yur yurVar = yur.b;
        yur yurVar2 = yur.b;
        this.b = yurVar2;
        this.c = yurVar2;
        this.d = yurVar2;
        this.e = yurVar2;
        this.f = yurVar2;
        this.g = yurVar2;
        this.h = yurVar2;
        this.i = yurVar2;
        this.j = FocusPropertiesImpl$onEnter$1.w;
        this.k = FocusPropertiesImpl$onExit$1.w;
        this.l = xw91.y;
    }

    @Override // defpackage.rur
    public final void a(tls tlsVar) {
        this.k = tlsVar;
    }

    @Override // defpackage.rur
    public final void b(boolean z) {
        this.a = z;
    }

    @Override // defpackage.rur
    public final void c(tls tlsVar) {
        this.j = tlsVar;
    }

    @Override // defpackage.rur
    public final void d(yur yurVar) {
        this.e = yurVar;
    }

    @Override // defpackage.rur
    public final void e(zii0 zii0Var) {
        this.l = zii0Var;
    }

    @Override // defpackage.rur
    public final void f(yur yurVar) {
        this.b = yurVar;
    }

    @Override // defpackage.rur
    public final boolean g() {
        return this.a;
    }

    public final zii0 h() {
        return this.l;
    }
}
