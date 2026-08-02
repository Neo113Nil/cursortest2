package xsna;

import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.huw0;
import xsna.mp90;
import xsna.nir0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class guw0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ guw0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((huw0.a) this.c).l.a(mp90.c.C3367c.a);
                return s3q0.a;
            case 1:
                r4x0 r4x0Var = (r4x0) this.c;
                return Boolean.valueOf(r4x0Var.e() && r4x0Var.g());
            case 2:
                xkx0 xkx0Var = (xkx0) this.c;
                return new nir0(new nir0.a(new yyl0(xkx0Var, 29), new lbt0(xkx0Var, 10), new lxh0(xkx0Var, 25), new mvl0(xkx0Var, 24), new wgm0(xkx0Var, 24)));
            default:
                return (TextView) ((y0y0) this.c).a.findViewById(R.id.comment_restriction_text);
        }
    }
}
