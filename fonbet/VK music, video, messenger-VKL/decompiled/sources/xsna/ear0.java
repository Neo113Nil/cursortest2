package xsna;

import com.vk.avatar.api.border.AvatarBorderType;
import xsna.cq5;

/* compiled from: VKAvatarViewDelegate.kt */
/* loaded from: classes15.dex */
public abstract class ear0 {
    public final zjt<?> a;

    public ear0(zjt<?> zjtVar) {
        this.a = zjtVar;
    }

    public static void d(ear0 ear0Var, AvatarBorderType avatarBorderType, cq5 cq5Var, int i) {
        if ((i & 2) != 0) {
            cq5Var = cq5.b.a;
        }
        ear0Var.c(avatarBorderType, cq5Var, new wp5());
    }

    public abstract o9r0 a();

    public abstract void b(o9r0 o9r0Var);

    public abstract void c(AvatarBorderType avatarBorderType, cq5 cq5Var, wp5 wp5Var);
}
