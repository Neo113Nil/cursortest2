package defpackage;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import com.ybsdk.core.utils.ext.a;
import java.util.List;

/* loaded from: classes3.dex */
public final class kac implements gtk {
    public final Context a;
    public final boolean b;

    public kac(Context context, int i, boolean z) {
        z = (i & 4) != 0 ? true : z;
        this.a = context;
        this.b = z;
    }

    @Override // defpackage.gtk
    public final Boolean hasSvgSupport() {
        return Boolean.TRUE;
    }

    @Override // defpackage.gtk
    public final hxy loadImage(String str, btk btkVar) {
        if (evu0.J(str)) {
            return new d7l();
        }
        List list = rcv.a;
        rev revVar = rev.e;
        Context context = this.a;
        String a = rcv.a(str, revVar, context);
        if (a == null || evu0.J(a)) {
            return new d7l();
        }
        w6m w6mVar = new w6m(Uri.parse(a), btkVar);
        bev b = a.b(context, 6, false);
        b.c = a;
        b.n = true;
        b.e = w6mVar;
        b.o = Boolean.valueOf(this.b);
        b.e();
        return new jac(a.f().b(b.d()), 0);
    }

    @Override // defpackage.gtk
    public final hxy loadImageBytes(String str, btk btkVar) {
        return loadImage(str, btkVar);
    }

    @Override // defpackage.gtk
    public final hxy loadImage(String str, ImageView imageView) {
        qu quVar = new qu(14);
        if (evu0.J(str)) {
            return new d7l();
        }
        List list = rcv.a;
        String a = rcv.a(str, rev.e, this.a);
        if (a != null && !evu0.J(a)) {
            return new g2b(2, v4b1.k(new pbv(a, (ccv) null, rev.d, (dcv) null, (vfv) null, 50), imageView, null, quVar, 2));
        }
        return new d7l();
    }
}
