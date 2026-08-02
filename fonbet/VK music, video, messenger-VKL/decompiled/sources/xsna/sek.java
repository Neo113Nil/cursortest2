package xsna;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import xsna.ydk;

/* compiled from: CronetKnetEngine.kt */
/* loaded from: classes.dex */
public final class sek implements kjy {
    public final ydk b;
    public final List<ojv> c;
    public final String d;

    /* compiled from: CronetKnetEngine.kt */
    public static final class a {
        public final ydk.a a;
        public final ArrayList b = new ArrayList();

        public a(Context context) {
            this.a = new ydk.a(context);
        }

        public final void a(ojv ojvVar) {
            this.b.add(ojvVar);
        }
    }

    public sek() {
        throw null;
    }

    public sek(ydk ydkVar, List list) {
        this.b = ydkVar;
        this.c = list;
        this.d = "CRONET";
    }

    @Override // xsna.kjy
    public final mkv a(ckv ckvVar, yjv yjvVar) {
        return zjv.a(yjvVar.c(), this, ckvVar, this.c).c(ckvVar);
    }

    @Override // xsna.kjy
    public final String getId() {
        return this.d;
    }
}
