package xsna;

import com.vk.profile.user.impl.domain.edit.nickname.popup.NicknamePopupChoice;
import java.util.List;

/* compiled from: UserEditProfilePatch.kt */
/* loaded from: classes5.dex */
public interface yiq0 extends wiq0 {

    /* compiled from: UserEditProfilePatch.kt */
    public static final class a implements yiq0 {
        public static final a b = new a();
    }

    /* compiled from: UserEditProfilePatch.kt */
    public static final class b implements yiq0 {
        public final List<NicknamePopupChoice> b;

        public b() {
            this(rl3.u0(NicknamePopupChoice.values()));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends NicknamePopupChoice> list) {
            this.b = list;
        }
    }
}
