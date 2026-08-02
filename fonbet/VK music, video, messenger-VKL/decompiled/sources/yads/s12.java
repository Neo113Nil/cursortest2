package yads;

import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class s12 implements g51 {
    public final /* synthetic */ t12 a;

    public s12(t12 t12Var) {
        this.a = t12Var;
    }

    @Override // yads.g51
    public final void a(String str, Bitmap bitmap) {
    }

    @Override // yads.g51
    public final void a(Map map) {
        this.a.b.b.putAll(map);
        this.a.c.a();
        Iterator it = this.a.g.iterator();
        while (it.hasNext()) {
            ((b10) it.next()).onFinishLoadingImages();
        }
    }
}
