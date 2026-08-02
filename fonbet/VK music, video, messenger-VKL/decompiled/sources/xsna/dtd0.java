package xsna;

import android.graphics.RectF;
import android.view.ViewGroup;
import com.vk.dto.tags.Tag;

/* compiled from: ProductsOverlayPinHolderAdapter.kt */
/* loaded from: classes18.dex */
public interface dtd0 {
    static /* synthetic */ void b(dtd0 dtd0Var, Tag tag, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        dtd0Var.d(tag, z, null);
    }

    void a(kg kgVar);

    void c();

    void d(Tag tag, boolean z, String str);

    void f(gzs<s3q0> gzsVar);

    void g(ViewGroup viewGroup);

    void h(float f, float f2, ViewGroup viewGroup, RectF rectF);

    default void e() {
    }
}
