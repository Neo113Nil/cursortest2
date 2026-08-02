package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* loaded from: classes9.dex */
public final class mwl implements lml {
    public final Context b;
    public final i3y c;
    public final i3y d;
    public final i3y e;
    public final i3y f;

    public mwl(Context context) {
        this.b = context;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final int i = 0;
        this.c = a.b(lazyThreadSafetyMode, new sls(this) { // from class: lwl
            public final /* synthetic */ mwl b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                mwl mwlVar = this.b;
                switch (i2) {
                    case 0:
                        Typeface b = wuj0.b(l5h0.ys_text_regular, mwlVar.b);
                        if (b == null) {
                            break;
                        }
                        break;
                    case 1:
                        Typeface b2 = wuj0.b(l5h0.ys_text_medium, mwlVar.b);
                        if (b2 == null) {
                            break;
                        }
                        break;
                    case 2:
                        Typeface b3 = wuj0.b(l5h0.ys_text_light, mwlVar.b);
                        if (b3 == null) {
                            break;
                        }
                        break;
                    default:
                        Typeface b4 = wuj0.b(l5h0.ys_text_bold, mwlVar.b);
                        if (b4 == null) {
                            break;
                        }
                        break;
                }
                return Typeface.DEFAULT;
            }
        });
        final int i2 = 1;
        this.d = a.b(lazyThreadSafetyMode, new sls(this) { // from class: lwl
            public final /* synthetic */ mwl b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                mwl mwlVar = this.b;
                switch (i22) {
                    case 0:
                        Typeface b = wuj0.b(l5h0.ys_text_regular, mwlVar.b);
                        if (b == null) {
                            break;
                        }
                        break;
                    case 1:
                        Typeface b2 = wuj0.b(l5h0.ys_text_medium, mwlVar.b);
                        if (b2 == null) {
                            break;
                        }
                        break;
                    case 2:
                        Typeface b3 = wuj0.b(l5h0.ys_text_light, mwlVar.b);
                        if (b3 == null) {
                            break;
                        }
                        break;
                    default:
                        Typeface b4 = wuj0.b(l5h0.ys_text_bold, mwlVar.b);
                        if (b4 == null) {
                            break;
                        }
                        break;
                }
                return Typeface.DEFAULT;
            }
        });
        final int i3 = 2;
        this.e = a.b(lazyThreadSafetyMode, new sls(this) { // from class: lwl
            public final /* synthetic */ mwl b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                mwl mwlVar = this.b;
                switch (i22) {
                    case 0:
                        Typeface b = wuj0.b(l5h0.ys_text_regular, mwlVar.b);
                        if (b == null) {
                            break;
                        }
                        break;
                    case 1:
                        Typeface b2 = wuj0.b(l5h0.ys_text_medium, mwlVar.b);
                        if (b2 == null) {
                            break;
                        }
                        break;
                    case 2:
                        Typeface b3 = wuj0.b(l5h0.ys_text_light, mwlVar.b);
                        if (b3 == null) {
                            break;
                        }
                        break;
                    default:
                        Typeface b4 = wuj0.b(l5h0.ys_text_bold, mwlVar.b);
                        if (b4 == null) {
                            break;
                        }
                        break;
                }
                return Typeface.DEFAULT;
            }
        });
        final int i4 = 3;
        this.f = a.b(lazyThreadSafetyMode, new sls(this) { // from class: lwl
            public final /* synthetic */ mwl b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i4;
                mwl mwlVar = this.b;
                switch (i22) {
                    case 0:
                        Typeface b = wuj0.b(l5h0.ys_text_regular, mwlVar.b);
                        if (b == null) {
                            break;
                        }
                        break;
                    case 1:
                        Typeface b2 = wuj0.b(l5h0.ys_text_medium, mwlVar.b);
                        if (b2 == null) {
                            break;
                        }
                        break;
                    case 2:
                        Typeface b3 = wuj0.b(l5h0.ys_text_light, mwlVar.b);
                        if (b3 == null) {
                            break;
                        }
                        break;
                    default:
                        Typeface b4 = wuj0.b(l5h0.ys_text_bold, mwlVar.b);
                        if (b4 == null) {
                            break;
                        }
                        break;
                }
                return Typeface.DEFAULT;
            }
        });
    }

    @Override // defpackage.lml
    public final Typeface a() {
        return (Typeface) this.c.getValue();
    }

    @Override // defpackage.lml
    public final Typeface b() {
        return (Typeface) this.d.getValue();
    }

    @Override // defpackage.lml
    public final Typeface c() {
        return (Typeface) this.f.getValue();
    }

    @Override // defpackage.lml
    public final Typeface getLight() {
        return (Typeface) this.e.getValue();
    }
}
