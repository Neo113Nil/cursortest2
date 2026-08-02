package xsna;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class h7a implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h7a(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                TextView textView = (TextView) this.d;
                f4m.x(this.c, textView);
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) obj, (Drawable) null, (Drawable) null, (Drawable) null);
                break;
            case 1:
                ((z0s) this.d).c.d(new z480(this.c));
                break;
            case 2:
                awt0.f((am) obj, ((a4d0) this.d).itemView.getContext(), this.c);
                break;
            default:
                ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                bVar.k = wbp0.a((bjz) this.d);
                bVar.t = 0;
                bVar.v = 0;
                int b = cn70.b(16);
                int i = this.c;
                bVar.setMargins(i, 0, i, b);
                break;
        }
        return s3q0.a;
    }
}
