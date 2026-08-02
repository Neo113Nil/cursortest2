package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.friends.groupinvite.impl.models.InviteFriendsTabIndex;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class dsx implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ xzs e;

    public /* synthetic */ dsx(Object obj, Object obj2, xzs xzsVar, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = xzsVar;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        boolean z;
        switch (this.b) {
            case 0:
                List list = (List) this.c;
                InviteFriendsTabIndex inviteFriendsTabIndex = (InviteFriendsTabIndex) this.d;
                final wzs wzsVar = (wzs) this.e;
                jj jjVar = (jj) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(jjVar) ? 4 : 2;
                }
                int i = intValue;
                if (aVar.t(i & 1, (i & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(953808874, i, -1, "com.vk.friends.groupinvite.impl.ui.InviteFriendsTabs.<anonymous> (InviteFriendsTabs.kt:41)");
                    }
                    final int i2 = 0;
                    for (Object obj4 : list) {
                        int i3 = i2 + 1;
                        String str2 = null;
                        if (i2 < 0) {
                            e43.t();
                            throw null;
                        }
                        final yrx yrxVar = (yrx) obj4;
                        if (i2 == InviteFriendsTabIndex.INVITED.h()) {
                            str2 = "TAB_INVITED";
                        } else if (i2 == InviteFriendsTabIndex.NOT_INVITED.h()) {
                            str2 = "TAB_NOT_INVITED";
                        } else if (i2 == InviteFriendsTabIndex.SELECTED.h()) {
                            str2 = "TAB_SELECTED";
                        }
                        q630 q630Var = q630.a.a;
                        if (str2 != null) {
                            q630Var = ahn.E(q630Var, str2);
                        }
                        String g = kq01.g(yrxVar.a, aVar);
                        String valueOf = String.valueOf(yrxVar.b);
                        if (i2 == inviteFriendsTabIndex.h()) {
                            str = g;
                            z = true;
                        } else {
                            str = g;
                            z = false;
                        }
                        boolean o = aVar.o(i2) | aVar.J(wzsVar) | aVar.J(yrxVar);
                        Object x = aVar.x();
                        if (o || x == a.C0011a.a) {
                            x = new gzs() { // from class: xsna.fsx
                                @Override // xsna.gzs
                                public final Object invoke() {
                                    InviteFriendsTabIndex inviteFriendsTabIndex2;
                                    InviteFriendsTabIndex.Companion.getClass();
                                    InviteFriendsTabIndex[] values = InviteFriendsTabIndex.values();
                                    int length = values.length;
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 >= length) {
                                            inviteFriendsTabIndex2 = null;
                                            break;
                                        }
                                        inviteFriendsTabIndex2 = values[i4];
                                        if (inviteFriendsTabIndex2.h() == i2) {
                                            break;
                                        }
                                        i4++;
                                    }
                                    if (inviteFriendsTabIndex2 != null) {
                                        wzsVar.invoke(inviteFriendsTabIndex2, yrxVar);
                                    }
                                    return s3q0.a;
                                }
                            };
                            aVar.R(x);
                        }
                        hsx.a(jjVar, str, valueOf, z, q630Var, (gzs) x, aVar, i & 14);
                        i2 = i3;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                xrs0 xrs0Var = (xrs0) this.c;
                srs0 srs0Var = (srs0) this.d;
                izs izsVar = (izs) this.e;
                q630 q630Var2 = (q630) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar2.J(q630Var2) ? 4 : 2;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1992566586, intValue2, -1, "com.vk.catalog.mvi.block.video.impl.video.largelist.VideoLargeListView.BlockView.ContentImpl.<anonymous> (VideoLargeListView.kt:307)");
                    }
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(aVar2));
                    sy90 D = aVar2.D();
                    q630 c = qri.c(aVar2, q630Var2);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (aVar2.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar2.H();
                    if (aVar2.L()) {
                        aVar2.I(aVar3);
                    } else {
                        aVar2.f();
                    }
                    k9q0.w(aVar2, d, cri.a.f);
                    k9q0.w(aVar2, D, cri.a.e);
                    k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar2, cri.a.h);
                    k9q0.w(aVar2, c, cri.a.d);
                    q5b0 q5b0Var = xrs0Var.d;
                    if (q5b0Var == null) {
                        aVar2.K(780805682);
                    } else {
                        aVar2.K(780805683);
                        srs0Var.h(xrs0Var.b, q5b0Var, izsVar, null, aVar2, 0);
                    }
                    aVar2.j();
                    kjz kjzVar = xrs0Var.f;
                    if (kjzVar == null) {
                        aVar2.K(780949646);
                    } else {
                        aVar2.K(780949647);
                        srs0Var.g(xrs0Var.b, kjzVar, izsVar, null, aVar2, 0);
                    }
                    aVar2.j();
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
        }
    }
}
