package xsna;

import com.vk.video.profile.exceptions.UserNotAuthorizedException;
import com.vk.video.profile.presentation.VideoProfileSource;
import com.vk.video.profile.presentation.views.creatoronboarding.items.VideoProfileCreatorOnboardingItemType;
import java.io.IOException;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: VideoProfileHeaderDelegate.kt */
/* loaded from: classes6.dex */
public final class e8t0 {
    public final f4z<com.vk.video.profile.presentation.h> a;
    public final lzh0 b;
    public final v8t0 c;
    public final t7t0 d;
    public final ud8 e;
    public final io.reactivex.rxjava3.disposables.b f;

    /* compiled from: VideoProfileHeaderDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoProfileCreatorOnboardingItemType.values().length];
            try {
                iArr[VideoProfileCreatorOnboardingItemType.AVATAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoProfileCreatorOnboardingItemType.COVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoProfileCreatorOnboardingItemType.DESCRIPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public e8t0(f4z f4zVar, lzh0 lzh0Var, x8t0 x8t0Var, o7t0 o7t0Var, u6t0 u6t0Var, t7t0 t7t0Var, ud8 ud8Var, io.reactivex.rxjava3.disposables.b bVar) {
        this.a = f4zVar;
        this.b = lzh0Var;
        this.c = x8t0Var;
        this.d = t7t0Var;
        this.e = ud8Var;
        this.f = bVar;
    }

    public final io.reactivex.rxjava3.core.x<List<u490>> a(VideoProfileSource videoProfileSource) {
        com.vk.core.utils.newtork.b.a.getClass();
        if (!com.vk.core.utils.newtork.b.d()) {
            return io.reactivex.rxjava3.core.x.i(new IOException());
        }
        boolean z = videoProfileSource instanceof VideoProfileSource.OwnProfile;
        if (z) {
            bpn0 bpn0Var = o25.a;
            if (bpn0Var == null) {
                bpn0Var = null;
            }
            if (!((b25) bpn0Var.getValue()).b()) {
                return io.reactivex.rxjava3.core.x.i(new UserNotAuthorizedException());
            }
        }
        if (!z) {
            return io.reactivex.rxjava3.core.x.k(EmptyList.b);
        }
        bpn0 bpn0Var2 = o25.a;
        return this.c.b(((b25) (bpn0Var2 != null ? bpn0Var2 : null).getValue()).c());
    }
}
