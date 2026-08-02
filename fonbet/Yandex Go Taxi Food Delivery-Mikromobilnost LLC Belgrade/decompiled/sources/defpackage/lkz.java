package defpackage;

import android.content.Context;
import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class lkz implements lml {
    public final /* synthetic */ int b;
    public final ip11 c;
    public final Context d;

    public /* synthetic */ lkz(ip11 ip11Var, Context context, int i) {
        this.b = i;
        this.c = ip11Var;
        this.d = context;
    }

    @Override // defpackage.lml
    public final Typeface a() {
        switch (this.b) {
            case 0:
                return ((zmh) this.c).f(this.d);
            case 1:
                return this.c.c(this.d);
            case 2:
                return this.c.b(this.d);
            default:
                return this.c.a(this.d);
        }
    }

    @Override // defpackage.lml
    public final Typeface b() {
        switch (this.b) {
            case 0:
                return ((zmh) this.c).f(this.d);
            case 1:
                return this.c.c(this.d);
            case 2:
                return this.c.b(this.d);
            default:
                return this.c.a(this.d);
        }
    }

    @Override // defpackage.lml
    public final Typeface c() {
        switch (this.b) {
            case 0:
                return ((zmh) this.c).f(this.d);
            case 1:
                return this.c.c(this.d);
            case 2:
                return this.c.b(this.d);
            default:
                return this.c.a(this.d);
        }
    }

    @Override // defpackage.lml
    public final Typeface getLight() {
        switch (this.b) {
            case 0:
                return ((zmh) this.c).f(this.d);
            case 1:
                return this.c.c(this.d);
            case 2:
                return this.c.b(this.d);
            default:
                return this.c.a(this.d);
        }
    }
}
