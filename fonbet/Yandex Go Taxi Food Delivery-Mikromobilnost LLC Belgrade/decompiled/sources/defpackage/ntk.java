package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import coil.c;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes10.dex */
public final class ntk implements gtk {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;

    public ntk(Context context) {
        qm71 qm71Var = new qm71();
        z4m0 z4m0Var = mf71.d.a(context).a;
        this.b = qm71Var;
        this.c = z4m0Var;
    }

    @Override // defpackage.gtk
    public final hxy loadImage(String str, btk btkVar) {
        bev bevVar;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Context context = (Context) obj;
                if (evu0.J(str)) {
                    return new d7l();
                }
                Uri parse = Uri.parse(str);
                String host = parse.getHost();
                if (!jl40.l(parse.getScheme(), "drawable_res") || host == null) {
                    bevVar = new bev(context);
                    bevVar.c = str;
                } else {
                    Resources resources = context.getResources();
                    Drawable drawable = resources.getDrawable(resources.getIdentifier(host, "drawable", context.getPackageName()));
                    bevVar = new bev(context);
                    bevVar.c = drawable;
                }
                p1b p1bVar = new p1b(btkVar, parse);
                bevVar.a();
                bevVar.n = true;
                bevVar.o = Boolean.FALSE;
                bevVar.e = p1bVar;
                return new jac(((c) ((qav) this.c)).b(bevVar.d()), 4);
            default:
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ((qm71) obj).a(new hek0(ref$ObjectRef, this, str, btkVar, 16));
                return new qht(2, this, ref$ObjectRef);
        }
    }

    @Override // defpackage.gtk
    public final hxy loadImageBytes(String str, btk btkVar) {
        switch (this.a) {
            case 0:
                return loadImage(str, btkVar);
            default:
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ((qm71) this.b).a(new hek0(ref$ObjectRef, this, str, btkVar, 16));
                return new qht(2, this, ref$ObjectRef);
        }
    }

    public ntk(Context context, qav qavVar) {
        this.b = context;
        this.c = qavVar;
    }

    @Override // defpackage.gtk
    public final hxy loadImage(String str, ImageView imageView) {
        switch (this.a) {
            case 0:
                if (evu0.J(str)) {
                    return new d7l();
                }
                qav qavVar = (qav) this.c;
                bev bevVar = new bev(imageView.getContext());
                bevVar.c = str;
                bevVar.o(imageView);
                return new jac(((c) qavVar).b(bevVar.d()), 3);
            default:
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ((qm71) this.b).a(new hek0(ref$ObjectRef, this, str, imageView, 17));
                return new g2b(5, ref$ObjectRef);
        }
    }
}
