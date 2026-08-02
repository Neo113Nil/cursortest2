package xsna;

import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import xsna.t5c0;

/* compiled from: PostPagingMviTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class n6c0<T> implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ l6c0 b;

    public n6c0(l6c0 l6c0Var) {
        this.b = l6c0Var;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        boolean z = obj instanceof UserProfile;
        l6c0 l6c0Var = this.b;
        if (z) {
            l6c0Var.a(new t5c0.b.e((UserProfile) obj));
        } else if (obj instanceof Group) {
            l6c0Var.a(new t5c0.b.C3721b((Group) obj));
        }
    }
}
