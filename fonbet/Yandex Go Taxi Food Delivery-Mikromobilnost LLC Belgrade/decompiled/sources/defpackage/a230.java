package defpackage;

import android.view.View;
import kotlin.a;

/* loaded from: classes10.dex */
public final class a230 implements e230 {
    public static final /* synthetic */ int f = 0;
    public final int a;
    public final sls b;
    public final sls c;
    public final i3y d;
    public final i3y e;

    public a230(int i, sls slsVar, sls slsVar2) {
        final int i2 = 0;
        int i3 = (i & 2) != 0 ? 0 : 48;
        slsVar = (i & 4) != 0 ? new sq20(23) : slsVar;
        slsVar2 = (i & 8) != 0 ? new sq20(23) : slsVar2;
        this.a = i3;
        this.b = slsVar;
        this.c = slsVar2;
        this.d = a.a(new sls(this) { // from class: z130
            public final /* synthetic */ a230 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i4 = i2;
                a230 a230Var = this.b;
                switch (i4) {
                    case 0:
                        View view = (View) a230Var.b.invoke();
                        return Integer.valueOf(view != null ? view.getPaddingTop() : 0);
                    default:
                        View view2 = (View) a230Var.c.invoke();
                        return Integer.valueOf(view2 != null ? view2.getPaddingBottom() : 0);
                }
            }
        });
        final int i4 = 1;
        this.e = a.a(new sls(this) { // from class: z130
            public final /* synthetic */ a230 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i42 = i4;
                a230 a230Var = this.b;
                switch (i42) {
                    case 0:
                        View view = (View) a230Var.b.invoke();
                        return Integer.valueOf(view != null ? view.getPaddingTop() : 0);
                    default:
                        View view2 = (View) a230Var.c.invoke();
                        return Integer.valueOf(view2 != null ? view2.getPaddingBottom() : 0);
                }
            }
        });
    }

    @Override // defpackage.e230
    public final boolean a() {
        return false;
    }

    @Override // defpackage.e230
    public final int b() {
        return this.a;
    }

    public a230() {
        this(15, null, null);
    }
}
