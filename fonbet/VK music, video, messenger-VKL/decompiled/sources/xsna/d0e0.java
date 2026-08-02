package xsna;

import com.vk.profile.user.impl.ui.taboptions.domain.ProfileTabOptions;
import java.util.List;

/* compiled from: ProfileTabOptionsPatch.kt */
/* loaded from: classes5.dex */
public abstract class d0e0 implements xl50 {

    /* compiled from: ProfileTabOptionsPatch.kt */
    public static final class a extends d0e0 {
        public final ProfileTabOptions b;

        public a(ProfileTabOptions profileTabOptions) {
            this.b = profileTabOptions;
        }
    }

    /* compiled from: ProfileTabOptionsPatch.kt */
    public static final class b extends d0e0 {
        public final List<ProfileTabOptions> b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends ProfileTabOptions> list) {
            this.b = list;
        }
    }
}
