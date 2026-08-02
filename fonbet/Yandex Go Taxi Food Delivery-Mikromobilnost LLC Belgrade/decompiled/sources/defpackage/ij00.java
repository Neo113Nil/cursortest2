package defpackage;

import android.app.Activity;
import kotlin.a;

/* loaded from: classes5.dex */
public final class ij00 {
    public final h3y a;
    public final jw2 b;
    public final i3y c;
    public final i3y d;

    public ij00(Activity activity, h3y h3yVar) {
        this.a = h3yVar;
        this.b = new jw2(activity);
        final int i = 0;
        this.c = a.a(new sls(this) { // from class: gj00
            public final /* synthetic */ ij00 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                ij00 ij00Var = this.b;
                switch (i2) {
                    case 0:
                        return new pc4(ij00Var.b);
                    default:
                        return new y77(ij00Var.b);
                }
            }
        });
        final int i2 = 1;
        this.d = a.a(new sls(this) { // from class: gj00
            public final /* synthetic */ ij00 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                ij00 ij00Var = this.b;
                switch (i22) {
                    case 0:
                        return new pc4(ij00Var.b);
                    default:
                        return new y77(ij00Var.b);
                }
            }
        });
    }
}
