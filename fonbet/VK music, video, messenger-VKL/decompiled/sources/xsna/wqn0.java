package xsna;

import android.content.Intent;
import android.net.Uri;
import com.vk.attachpicker.b;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import java.io.File;

/* compiled from: SystemMediaInteractor.kt */
/* loaded from: classes15.dex */
public abstract class wqn0 {
    public final GalleryFragmentImpl a;
    public final q3t b;
    public final gzs<tq10> c;
    public final t4t d;
    public final t4t e;
    public final t4t f;
    public final t4t g;

    public wqn0(GalleryFragmentImpl galleryFragmentImpl, t4t t4tVar, q3t q3tVar, gzs gzsVar) {
        this.a = galleryFragmentImpl;
        this.b = q3tVar;
        this.c = gzsVar;
        this.d = t4tVar;
        this.e = t4tVar;
        this.f = t4tVar;
        this.g = t4tVar;
    }

    public final void c(File file, boolean z) {
        Intent a;
        boolean z2 = this.e.a;
        boolean z3 = (z2 || this.g.c || !z) ? false : true;
        if ((z2 || this.f.b || z) && !z3) {
            if (z) {
                Uri fromFile = Uri.fromFile(file);
                a = b.a.a(fromFile, true, false);
                a.setData(fromFile);
            } else {
                a = b.a.a(Uri.fromFile(file), false, false);
            }
            this.a.Mf(-1, a);
            return;
        }
        tq10 invoke = this.c.invoke();
        if (invoke != null) {
            if (invoke.isShowing()) {
                invoke = null;
            }
            if (invoke != null) {
                vqn0 vqn0Var = new vqn0(this, z, 0);
                if (z) {
                    invoke.b(Uri.fromFile(file), vqn0Var, null, null);
                } else {
                    invoke.c(file, vqn0Var, d(), e());
                }
            }
        }
    }

    public String d() {
        return null;
    }

    public abstract String e();
}
