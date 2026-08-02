package xsna;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: GLTextureRepository.kt */
/* loaded from: classes4.dex */
public final class j2t implements e2t {
    public final List<Bitmap> a;
    public final /* synthetic */ gzg0 b;

    public j2t(o3p o3pVar, gzg0 gzg0Var) {
        this.b = gzg0Var;
        this.a = Collections.singletonList(o3pVar.c.a);
    }

    @Override // xsna.e2t
    public final void a(ArrayList arrayList) {
        this.b.resumeWith(j5g.Y(arrayList));
    }

    @Override // xsna.e2t
    public final List<Bitmap> b() {
        return this.a;
    }
}
