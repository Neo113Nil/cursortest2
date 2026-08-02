package xsna;

import com.vk.dto.photo.PhotoTag;
import java.util.List;

/* compiled from: VkAppCallback.kt */
/* loaded from: classes6.dex */
public final class c9u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z8u0 b;

    public c9u0(int i, z8u0 z8u0Var) {
        this.a = i;
        this.b = z8u0Var;
    }

    public final void a(List<PhotoTag> list) {
        d390 d390Var;
        z8u0 z8u0Var = this.b;
        d390 d390Var2 = z8u0Var.x;
        if (d390Var2 == null || this.a != d390Var2.getCurrentPosition() || (d390Var = z8u0Var.x) == null) {
            return;
        }
        d390Var.f(list);
    }
}
