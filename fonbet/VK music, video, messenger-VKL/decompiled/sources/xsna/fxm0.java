package xsna;

import androidx.compose.runtime.a;
import com.vk.profile.design.compose.header.AuthorHeaderConfig;
import com.vk.profile.design.compose.header.sink.AuthorHeaderEvent;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ixm0;
import xsna.q630;

/* compiled from: SubscribersSlotImpl.kt */
/* loaded from: classes5.dex */
public final class fxm0 implements l95 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;

    public fxm0(AuthorHeaderConfig.Info.b.a aVar, AuthorHeaderConfig.Viewer viewer, AuthorHeaderConfig.Author author) {
        this.a = androidx.compose.runtime.k.b(aVar);
        this.b = androidx.compose.runtime.k.b(viewer);
        this.c = androidx.compose.runtime.k.b(author);
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x0638  */
    @Override // xsna.l95
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i, androidx.compose.runtime.a aVar) {
        int i2;
        izs izsVar;
        izs izsVar2;
        q630.a aVar2;
        List list;
        int i3;
        us2 b;
        exm0 exm0Var;
        exm0 exm0Var2;
        int i4;
        us2 b2;
        int i5;
        exm0 exm0Var3;
        int i6;
        int i7;
        int i8;
        androidx.compose.runtime.a M = aVar.M(1780170306);
        int i9 = i & 48;
        q630.a aVar3 = q630.a.a;
        if (i9 == 0) {
            i2 = (M.J(aVar3) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1780170306, i2, -1, "com.vk.profile.design.compose.header.info.SubscribersSlotImpl.Content (SubscribersSlotImpl.kt:26)");
            }
            izs izsVar3 = (izs) M.r(h85.a);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = androidx.compose.runtime.k.b(zhf0.e);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            wh50 wh50Var2 = this.a;
            AuthorHeaderConfig.Info.b.a aVar4 = (AuthorHeaderConfig.Info.b.a) ((zak0) wh50Var2).getValue();
            AuthorHeaderConfig.Viewer viewer = (AuthorHeaderConfig.Viewer) ((zak0) this.b).getValue();
            AuthorHeaderConfig.Author author = (AuthorHeaderConfig.Author) ((zak0) this.c).getValue();
            boolean J = M.J(izsVar3);
            Object x2 = M.x();
            if (J || x2 == obj) {
                x2 = new qk(21, izsVar3, wh50Var);
                M.R(x2);
            }
            gzs gzsVar = (gzs) x2;
            if (((AuthorHeaderConfig.Info.b.a) ((zak0) wh50Var2).getValue()).e) {
                M.K(-1201999711);
                boolean J2 = M.J(izsVar3);
                Object x3 = M.x();
                if (J2 || x3 == obj) {
                    x3 = new u3z(izsVar3, 2);
                    M.R(x3);
                }
                izsVar = (izs) x3;
                M.j();
            } else {
                M.K(-1201839844);
                M.j();
                izsVar = null;
            }
            List list2 = aVar4.d;
            int i10 = aVar4.c;
            int i11 = aVar4.b;
            int i12 = i2;
            AuthorHeaderConfig.Viewer.RelationToAuthor relationToAuthor = viewer.b;
            AuthorHeaderConfig.Viewer.ViewerRole viewerRole = viewer.a;
            if (androidx.compose.runtime.b.d()) {
                izsVar2 = izsVar3;
                aVar2 = aVar3;
                list = list2;
                androidx.compose.runtime.b.f(297305554, 0, -1, "com.vk.profile.design.compose.header.info.subscribers.impl.bydefault.resolveSubscribersSlotState (SubscribersSlotImplContent.kt:31)");
            } else {
                izsVar2 = izsVar3;
                aVar2 = aVar3;
                list = list2;
            }
            int i13 = ixm0.a.$EnumSwitchMapping$0[author.a.ordinal()];
            if (i13 == 1) {
                M.K(807625764);
                M.K(-2003841970);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-2003841970, 0, -1, "com.vk.profile.design.compose.header.info.subscribers.impl.bydefault.profilePresentation (SubscribersSlotImplContent.kt:50)");
                }
                int i14 = aVar4.a;
                List f = ixm0.f(list);
                if (viewerRole == AuthorHeaderConfig.Viewer.ViewerRole.Owner) {
                    M.K(-705086832);
                    if (androidx.compose.runtime.b.d()) {
                        i6 = 0;
                        androidx.compose.runtime.b.f(-524267025, 0, -1, "com.vk.profile.design.compose.header.info.subscribers.impl.bydefault.profileOwnerPresentation (SubscribersSlotImplContent.kt:80)");
                    } else {
                        i6 = 0;
                    }
                    boolean z = !f.isEmpty();
                    if (i14 > 0 && i11 > 0) {
                        M.K(-1937536046);
                        exm0Var2 = new exm0(ixm0.b(e43.l(ixm0.a(i14, i6, M, izsVar), ixm0.e(i11, izsVar, M, i6, i6)), M), null, AuthorHeaderEvent.Info.SubscribersClick.a.a, z, f);
                        M.j();
                    } else if (i11 > 0) {
                        M.K(-1937128551);
                        exm0Var2 = new exm0(ixm0.e(i11, izsVar, M, 0, 0), null, AuthorHeaderEvent.Info.SubscribersClick.a.a, z, f);
                        M.j();
                    } else {
                        if (i14 <= 0) {
                            M.K(-1309395084);
                            M.j();
                            throw new IllegalStateException("You must use Subscribers.Empty for empty subscribers state");
                        }
                        M.K(-1936824255);
                        exm0Var2 = new exm0(ixm0.a(i14, 0, M, izsVar), null, AuthorHeaderEvent.Info.SubscribersClick.a.a, z, f);
                        M.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                } else {
                    M.K(-707596716);
                    M.j();
                    int i15 = ixm0.a.$EnumSwitchMapping$1[relationToAuthor.ordinal()];
                    if (i15 == 1) {
                        M.K(-1546758387);
                        if (androidx.compose.runtime.b.d()) {
                            i3 = 0;
                            androidx.compose.runtime.b.f(486218122, 0, -1, "com.vk.profile.design.compose.header.info.subscribers.impl.bydefault.profileFriendPresentation (SubscribersSlotImplContent.kt:221)");
                        } else {
                            i3 = 0;
                        }
                        us2 d = ixm0.d(R.string.author_header_subscribers_you_friends, i3, M, gzsVar);
                        if (i14 > 0 && i11 > 0) {
                            M.K(-895803053);
                            b = ixm0.b(e43.l(d, ixm0.a(i14, i3, M, izsVar), ixm0.e(i11, izsVar, M, i3, i3)), M);
                            M.j();
                        } else if (i14 > 0 && i11 == 0) {
                            M.K(-895799757);
                            b = ixm0.b(e43.l(d, ixm0.a(i14, 0, M, izsVar)), M);
                            M.j();
                        } else if (i14 != 0 || i11 <= 0) {
                            M.K(-895792557);
                            b = ixm0.b(e43.l(d, ixm0.a(i14, 0, M, izsVar)), M);
                            M.j();
                        } else {
                            M.K(-895794989);
                            b = ixm0.b(e43.l(d, ixm0.a(i14, 0, M, izsVar), ixm0.e(i11, izsVar, M, 0, 0)), M);
                            M.j();
                        }
                        exm0Var = new exm0(b, null, AuthorHeaderEvent.Info.SubscribersClick.a.a, false, EmptyList.b);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                    } else if (i15 == 2) {
                        M.K(-1546752815);
                        if (androidx.compose.runtime.b.d()) {
                            i4 = 0;
                            androidx.compose.runtime.b.f(-1011570220, 0, -1, "com.vk.profile.design.compose.header.info.subscribers.impl.bydefault.profileSubscriberPresentation (SubscribersSlotImplContent.kt:195)");
                        } else {
                            i4 = 0;
                        }
                        us2 d2 = ixm0.d(R.string.author_header_subscribers_you_subscribed, i4, M, gzsVar);
                        if (i14 > 0 && i11 > 0) {
                            M.K(-1456355331);
                            b2 = ixm0.b(e43.l(d2, ixm0.a(i14, i4, M, izsVar), ixm0.e(i11, izsVar, M, i4, i4)), M);
                            M.j();
                        } else if (i11 > 0 && i14 == 0) {
                            M.K(-1456351779);
                            b2 = ixm0.b(e43.l(d2, ixm0.e(i11, izsVar, M, 0, 0)), M);
                            M.j();
                        } else if (i14 <= 0 || i11 != 0) {
                            M.K(-1456344323);
                            b2 = ixm0.b(e43.l(d2, ixm0.e(i11, izsVar, M, 0, 0)), M);
                            M.j();
                        } else {
                            M.K(-1456347011);
                            b2 = ixm0.b(e43.l(d2, ixm0.a(i14, 0, M, izsVar), ixm0.e(i11, izsVar, M, 0, 0)), M);
                            M.j();
                        }
                        exm0Var = new exm0(b2, null, AuthorHeaderEvent.Info.SubscribersClick.a.a, false, EmptyList.b);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                    } else {
                        if (i15 != 3 && i15 != 4 && i15 != 5) {
                            throw alb0.c(-1546761191, M);
                        }
                        M.K(-1546743093);
                        if (androidx.compose.runtime.b.d()) {
                            i5 = 0;
                            androidx.compose.runtime.b.f(-560480054, 0, -1, "com.vk.profile.design.compose.header.info.subscribers.impl.bydefault.profileNonSubscriberPresentation (SubscribersSlotImplContent.kt:121)");
                        } else {
                            i5 = 0;
                        }
                        boolean z2 = !f.isEmpty();
                        if (i14 > 0 && i11 > 0 && i10 > 0) {
                            M.K(1571912032);
                            exm0Var2 = new exm0(ixm0.b(e43.l(ixm0.a(i14, i5, M, izsVar), ixm0.c(i10, i5, M, izsVar), ixm0.e(i11, izsVar, M, i5, i5)), M), null, AuthorHeaderEvent.Info.SubscribersClick.a.a, z2, f);
                            M.j();
                        } else if (i14 > 0 && i11 > 0) {
                            M.K(1572390331);
                            exm0Var2 = new exm0(ixm0.b(e43.l(ixm0.a(i14, 0, M, izsVar), ixm0.e(i11, izsVar, M, 0, 0)), M), null, AuthorHeaderEvent.Info.SubscribersClick.a.a, z2, f);
                            M.j();
                        } else if (i11 > 0 && i10 > 0) {
                            M.K(1572811094);
                            exm0Var2 = new exm0(ixm0.b(e43.l(ixm0.e(i11, izsVar, M, 0, 0), ixm0.c(i10, 0, M, izsVar)), M), null, AuthorHeaderEvent.Info.SubscribersClick.a.a, z2, f);
                            M.j();
                        } else if (i11 > 0) {
                            M.K(1573219426);
                            exm0Var2 = new exm0(ixm0.e(i11, izsVar, M, 0, 0), null, AuthorHeaderEvent.Info.SubscribersClick.a.a, z2, f);
                            M.j();
                        } else if (i14 > 0 && i10 > 0) {
                            M.K(1573536990);
                            exm0Var2 = new exm0(ixm0.b(e43.l(ixm0.a(i14, 0, M, izsVar), ixm0.c(i10, 0, M, izsVar)), M), null, AuthorHeaderEvent.Info.SubscribersClick.a.a, z2, f);
                            M.j();
                        } else {
                            if (i14 <= 0) {
                                M.K(-1750334289);
                                M.j();
                                throw new IllegalStateException("You must use Subscribers.Empty for empty subscribers state");
                            }
                            M.K(1573933418);
                            exm0Var2 = new exm0(ixm0.a(i14, 0, M, izsVar), null, AuthorHeaderEvent.Info.SubscribersClick.a.a, z2, f);
                            M.j();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                    }
                    exm0Var2 = exm0Var;
                    if (androidx.compose.runtime.b.d()) {
                    }
                    M.j();
                }
                exm0Var3 = exm0Var2;
                M.j();
            } else {
                if (i13 != 2) {
                    throw alb0.c(-2052159764, M);
                }
                M.K(807792017);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1150330561, 0, -1, "com.vk.profile.design.compose.header.info.subscribers.impl.bydefault.communityPresentation (SubscribersSlotImplContent.kt:246)");
                }
                boolean h = viewerRole.h();
                boolean z3 = relationToAuthor == AuthorHeaderConfig.Viewer.RelationToAuthor.Friend || relationToAuthor == AuthorHeaderConfig.Viewer.RelationToAuthor.Subscriber;
                List f2 = ixm0.f(list);
                if (h) {
                    M.K(1661096461);
                    if (androidx.compose.runtime.b.d()) {
                        i8 = 0;
                        androidx.compose.runtime.b.f(609180905, 0, -1, "com.vk.profile.design.compose.header.info.subscribers.impl.bydefault.communityAdminPresentation (SubscribersSlotImplContent.kt:265)");
                    } else {
                        i8 = 0;
                    }
                    if (i11 <= 0) {
                        throw new IllegalStateException("You must use Subscribers.Empty for empty subscribers state");
                    }
                    exm0Var3 = new exm0(ixm0.e(i11, null, M, i8, 2), null, AuthorHeaderEvent.Info.SubscribersClick.a.a, false, EmptyList.b);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                } else if (z3) {
                    M.K(1661098569);
                    if (androidx.compose.runtime.b.d()) {
                        i7 = 0;
                        androidx.compose.runtime.b.f(-53180316, 0, -1, "com.vk.profile.design.compose.header.info.subscribers.impl.bydefault.communitySubscriberPresentation (SubscribersSlotImplContent.kt:313)");
                    } else {
                        i7 = 0;
                    }
                    exm0 exm0Var4 = new exm0(ixm0.b(e43.l(ixm0.d(R.string.author_header_subscribers_you_subscribed, i7, M, gzsVar), ixm0.e(i11, null, M, i7, 2)), M), null, AuthorHeaderEvent.Info.SubscribersClick.a.a, false, EmptyList.b);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    exm0Var3 = exm0Var4;
                } else {
                    M.K(1661101411);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-118094208, 0, -1, "com.vk.profile.design.compose.header.info.subscribers.impl.bydefault.communityNonSubscriberPresentation (SubscribersSlotImplContent.kt:283)");
                    }
                    boolean z4 = i10 > 0 && i11 > 0 && !f2.isEmpty();
                    if (i11 > 0 && i10 > 0) {
                        M.K(-566040075);
                        us2 e = ixm0.e(i11, null, M, 0, 2);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-209277263, 0, -1, "com.vk.profile.design.compose.header.info.subscribers.impl.bydefault.communityMutualFriendsLabel (SubscribersSlotImplContent.kt:390)");
                        }
                        us2 us2Var = new us2(d370.F(R.plurals.author_header_subscribers_friends_count, i10, new Object[]{xpm0.b(i10)}, M, 0));
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        exm0Var3 = new exm0(ixm0.b(e43.l(e, us2Var), M), null, AuthorHeaderEvent.Info.SubscribersClick.a.a, z4, f2);
                        M.j();
                    } else {
                        if (i11 <= 0) {
                            M.K(-1819353307);
                            M.j();
                            throw new IllegalStateException("You must use Subscribers.Empty for empty subscribers state");
                        }
                        M.K(-565652296);
                        exm0Var3 = new exm0(ixm0.e(i11, null, M, 0, 2), null, AuthorHeaderEvent.Info.SubscribersClick.a.a, false, EmptyList.b);
                        M.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            }
            exm0 exm0Var5 = exm0Var3;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            Object x4 = M.x();
            if (x4 == obj) {
                x4 = new g8q(2, wh50Var);
                M.R(x4);
            }
            tnv0.c(exm0Var5, izsVar2, aVar2, (izs) x4, M, ((i12 << 3) & 896) | 3072, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new tss(this, i);
        }
    }
}
