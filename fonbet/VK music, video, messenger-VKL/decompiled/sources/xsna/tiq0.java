package xsna;

import com.vk.profile.user.impl.domain.edit.avatar.AvatarPopupChoice;
import java.util.List;

/* compiled from: UserEditProfilePatch.kt */
/* loaded from: classes5.dex */
public interface tiq0 extends wiq0 {

    /* compiled from: UserEditProfilePatch.kt */
    public static final class a implements tiq0 {
        public static final a b = new a();
    }

    /* compiled from: UserEditProfilePatch.kt */
    public static final class b implements tiq0 {
        public final List<AvatarPopupChoice> b;

        public b() {
            this(rl3.u0(AvatarPopupChoice.values()));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends AvatarPopupChoice> list) {
            this.b = list;
        }
    }
}
