package xsna;

import com.vk.profile.user.api.domain.actions.ProfileAction;
import com.vkontakte.android.R;

/* compiled from: UserProfileServicesDialogAdapterItem.kt */
/* loaded from: classes5.dex */
public abstract class yuq0 {
    public final int a;

    /* compiled from: UserProfileServicesDialogAdapterItem.kt */
    public static final class a extends yuq0 {
        public final je80 b;

        public a(je80 je80Var) {
            super(R.layout.item_header_onboarding_panel);
            this.b = je80Var;
        }
    }

    /* compiled from: UserProfileServicesDialogAdapterItem.kt */
    public static final class b extends yuq0 {
        public final ProfileAction b;

        public b(ProfileAction profileAction) {
            super(0);
            this.b = profileAction;
        }
    }

    public yuq0(int i) {
        this.a = i;
    }
}
