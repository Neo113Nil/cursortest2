package xsna;

import xsna.kb70;

/* compiled from: FriendRequestNotification.kt */
/* loaded from: classes4.dex */
public final class x770 implements efj {
    public final wh50 a;
    public final wh50 b;

    public x770(kb70.c cVar, izs<? super snv, s3q0> izsVar) {
        this.a = androidx.compose.runtime.k.b(cVar);
        this.b = androidx.compose.runtime.k.b(izsVar);
    }

    @Override // xsna.efj
    public final void a(int i, long j, androidx.compose.runtime.a aVar, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(15684332);
        if ((i & 384) == 0) {
            i2 = (M.J(this) ? 256 : 128) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 129) != 128)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(15684332, i2, -1, "com.vk.notifications.list.impl.presentation.base.view.list.NotificationAvatar.invoke (FriendRequestNotification.kt:86)");
            }
            y770.a(((kb70.c) ((zak0) this.a).getValue()).c, (izs) ((zak0) this.b).getValue(), null, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xsz(this, j, q630Var, i, 1);
        }
    }
}
