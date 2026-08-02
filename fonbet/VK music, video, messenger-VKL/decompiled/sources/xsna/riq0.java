package xsna;

import com.vk.profile.user.impl.ui.edit.UserEditProfileModalBottomSheet;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.xn50;

/* compiled from: UserEditProfileModalBottomSheet.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class riq0 implements s40, g0t {
    public final /* synthetic */ UserEditProfileModalBottomSheet b;

    public riq0(UserEditProfileModalBottomSheet userEditProfileModalBottomSheet) {
        this.b = userEditProfileModalBottomSheet;
    }

    @Override // xsna.s40
    public final void e2(kj50 kj50Var) {
        UserEditProfileModalBottomSheet userEditProfileModalBottomSheet = this.b;
        userEditProfileModalBottomSheet.getClass();
        xn50.a.c(userEditProfileModalBottomSheet, (aiq0) kj50Var);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof s40) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.b, UserEditProfileModalBottomSheet.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
