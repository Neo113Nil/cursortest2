package xsna;

import com.vk.profile.design.compose.header.AuthorHeaderConfig;
import com.vk.profile.design.compose.header.sink.AuthorHeaderEvent;
import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: EmptySubscribersSlotImpl.kt */
/* loaded from: classes5.dex */
public final class rhp implements l95 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;

    public rhp(AuthorHeaderConfig.Info.b.C1659b c1659b, AuthorHeaderConfig.Viewer viewer, AuthorHeaderConfig.Author author) {
        this.a = androidx.compose.runtime.k.b(c1659b);
        this.b = androidx.compose.runtime.k.b(viewer);
        this.c = androidx.compose.runtime.k.b(author);
    }

    @Override // xsna.l95
    public final void a(int i, androidx.compose.runtime.a aVar) {
        int i2;
        exm0 exm0Var;
        androidx.compose.runtime.a M = aVar.M(-389008610);
        int i3 = i & 48;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 = (M.J(aVar2) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-389008610, i2, -1, "com.vk.profile.design.compose.header.info.EmptySubscribersSlotImpl.Content (EmptySubscribersSlotImpl.kt:24)");
            }
            izs izsVar = (izs) M.r(h85.a);
            AuthorHeaderConfig.Viewer viewer = (AuthorHeaderConfig.Viewer) ((zak0) this.b).getValue();
            AuthorHeaderConfig.Author author = (AuthorHeaderConfig.Author) ((zak0) this.c).getValue();
            AuthorHeaderConfig.Viewer.ViewerRole viewerRole = viewer.a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1701141956, 0, -1, "com.vk.profile.design.compose.header.info.subscribers.impl.empty.resolveEmptySubscribersSlotState (EmptySubscribersSlotImplContent.kt:16)");
            }
            int i4 = shp.$EnumSwitchMapping$0[author.a.ordinal()];
            if (i4 == 1) {
                M.K(1894360482);
                if (viewerRole == AuthorHeaderConfig.Viewer.ViewerRole.Owner) {
                    M.K(1894430015);
                    us2 e = ws2.e(d370.N(R.string.author_header_add_friends, 0, M));
                    qzu0.a.getClass();
                    exm0Var = new exm0(e, qzu0.w0(M), AuthorHeaderEvent.Info.SubscribersClick.c.a);
                    M.j();
                } else {
                    M.K(1894759948);
                    exm0Var = new exm0(dxm0.a(d370.N(R.string.author_header_no_subscribers, 0, M), M), null, AuthorHeaderEvent.Info.SubscribersClick.e.a);
                    M.j();
                }
                M.j();
            } else {
                if (i4 != 2) {
                    throw alb0.c(1585127451, M);
                }
                M.K(1895153338);
                if (viewerRole.h()) {
                    M.K(1895196924);
                    us2 e2 = ws2.e(d370.N(R.string.author_header_invite_friends, 0, M));
                    qzu0.a.getClass();
                    exm0Var = new exm0(e2, qzu0.w0(M), AuthorHeaderEvent.Info.SubscribersClick.c.a);
                    M.j();
                } else {
                    M.K(1895529740);
                    exm0Var = new exm0(dxm0.a(d370.N(R.string.author_header_no_subscribers, 0, M), M), null, AuthorHeaderEvent.Info.SubscribersClick.e.a);
                    M.j();
                }
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            tnv0.c(exm0Var, izsVar, aVar2, null, M, (i2 << 3) & 896, 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qhp(this, i);
        }
    }
}
