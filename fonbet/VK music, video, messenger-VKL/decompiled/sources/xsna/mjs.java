package xsna;

import com.vk.dto.common.data.VKFromList;
import com.vk.dto.common.data.VKList;
import com.vk.dto.user.RequestUserProfile;
import com.vk.friends.requests.impl.requests.presentation.FriendRequestsFragment;
import com.vk.friends.requests.impl.requests.presentation.FriendsRequestsPaginatedView;
import com.vk.newsfeed.posting.impl.domain.model.LocalAlbum;
import com.vk.newsfeed.posting.impl.domain.model.e;
import com.vkontakte.android.data.FriendsUtils;
import java.util.ArrayList;
import java.util.List;
import xsna.efc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class mjs implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ mjs(Object obj, boolean z, Object obj2, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
        this.e = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ijs ijsVar;
        s170 s170Var;
        ijs ijsVar2;
        ijs ijsVar3;
        s170 s170Var2;
        s170 s170Var3;
        VKList<RequestUserProfile> vKList;
        VKList<RequestUserProfile> vKList2;
        switch (this.b) {
            case 0:
                FriendRequestsFragment friendRequestsFragment = (FriendRequestsFragment) this.d;
                com.vk.lists.c cVar = (com.vk.lists.c) this.e;
                FriendRequestsFragment.b bVar = (FriendRequestsFragment.b) obj;
                ijs ijsVar4 = friendRequestsFragment.a0;
                if (ijsVar4 != null) {
                    ijsVar4.q = bVar.c;
                }
                if (this.c) {
                    cps cpsVar = bVar.a;
                    int i = (cpsVar == null || (vKList2 = cpsVar.a) == null) ? 0 : vKList2.i();
                    int i2 = (cpsVar == null || (vKList = cpsVar.b) == null) ? 0 : vKList.i();
                    ijs ijsVar5 = friendRequestsFragment.a0;
                    if (ijsVar5 != null) {
                        Boolean bool = o25.a().o().k;
                        ijsVar5.j = bool != null ? bool.booleanValue() : false;
                    }
                    ijs ijsVar6 = friendRequestsFragment.a0;
                    if (ijsVar6 != null) {
                        ijsVar6.l = i;
                    }
                    if (ijsVar6 != null) {
                        ijsVar6.m = i2;
                    }
                    if (ijsVar6 != null) {
                        ijsVar6.clear();
                    }
                    if ((cpsVar != null ? cpsVar.a : null) != null) {
                        ijs ijsVar7 = friendRequestsFragment.a0;
                        if (ijsVar7 != null) {
                            ijsVar7.n0(cpsVar.a);
                        }
                        VKList<RequestUserProfile> vKList3 = cpsVar.a;
                        VKList<RequestUserProfile> vKList4 = cpsVar.b;
                        int i3 = vKList3 != null ? vKList3.i() : 0;
                        ijs ijsVar8 = friendRequestsFragment.a0;
                        if (ijsVar8 != null && (s170Var3 = ijsVar8.n) != null) {
                            s170Var3.c(i3);
                        }
                        ijs ijsVar9 = friendRequestsFragment.a0;
                        if (((ijsVar9 == null || (s170Var2 = ijsVar9.n) == null) ? null : s170Var2.b()) == null) {
                            if (vKList4 != null && (ijsVar3 = friendRequestsFragment.a0) != null) {
                                ijsVar3.n0(vKList4);
                            }
                            ijs ijsVar10 = friendRequestsFragment.a0;
                            if (ijsVar10 != null) {
                                ijsVar10.n0(cpsVar.c.a);
                            }
                        } else if (vKList4 != null && (ijsVar2 = friendRequestsFragment.a0) != null) {
                            ijsVar2.o = vKList4;
                        }
                    } else if (cpsVar != null) {
                        ijs ijsVar11 = friendRequestsFragment.a0;
                        if (ijsVar11 != null && (s170Var = ijsVar11.n) != null) {
                            s170Var.f(null);
                        }
                        VKList<RequestUserProfile> vKList5 = cpsVar.b;
                        if (vKList5 != null && (ijsVar = friendRequestsFragment.a0) != null) {
                            ijsVar.n0(vKList5);
                        }
                        ijs ijsVar12 = friendRequestsFragment.a0;
                        if (ijsVar12 != null) {
                            ijsVar12.n0(cpsVar.c.a);
                        }
                    }
                    cVar.s(cpsVar != null ? cpsVar.c.a.i() : null);
                    int max = Math.max(0, i2);
                    g620.r(max);
                    g620.s(i);
                    FriendsUtils.c(max, FriendsUtils.Request.IN);
                    rsg0.y0(new drs(), null, null, 3).subscribe(new xn(new lbe(friendRequestsFragment, 26), 20), new ljs(new l3f(com.vk.metrics.eventtracking.b.a, 9), 0));
                    FriendsRequestsPaginatedView friendsRequestsPaginatedView = friendRequestsFragment.Z;
                    if (friendsRequestsPaginatedView != null) {
                        u1e0 u1e0Var = friendsRequestsPaginatedView.N;
                        f4m.j(u1e0Var != null ? u1e0Var : null);
                    }
                } else {
                    bVar.getClass();
                    VKFromList<RequestUserProfile> vKFromList = bVar.b;
                    if (vKFromList != null) {
                        if ((ijsVar4 != null ? ijsVar4.o : null) != null) {
                            if (ijsVar4 != null) {
                                ijsVar4.n0(ijsVar4.o);
                            }
                            ijs ijsVar13 = friendRequestsFragment.a0;
                            if (ijsVar13 != null) {
                                ijsVar13.o = null;
                            }
                        }
                        ijs ijsVar14 = friendRequestsFragment.a0;
                        if (ijsVar14 != null) {
                            ijsVar14.n0(vKFromList);
                        }
                        cVar.s(vKFromList.i());
                    }
                }
                break;
            default:
                st10 st10Var = (st10) this.d;
                LocalAlbum localAlbum = (LocalAlbum) this.e;
                st10Var.getClass();
                ArrayList d = st10.d((List) obj);
                efc0.a aVar = st10Var.a;
                if (this.c) {
                    aVar.a(new e.b.c(d, localAlbum.c));
                } else {
                    aVar.a(new e.b.C1424e(d));
                }
                break;
        }
        return s3q0.a;
    }
}
