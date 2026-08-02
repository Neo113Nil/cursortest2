package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.friends.dto.FriendsGetFieldsResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.core.serialize.Serializer;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import com.vk.voip.ui.ns.NoiseSuppressorFeature$State;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.chromium.base.version_info.VersionConstants;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.sfo;
import xsna.ty6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ux6 implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ ux6(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float f = 1.0f;
        int i = 0;
        switch (this.b) {
            case 0:
                List list = (List) obj2;
                List list2 = (List) obj3;
                List<UsersUserFullDto> d = ((FriendsGetFieldsResponseDto) obj).d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                for (UsersUserFullDto usersUserFullDto : d) {
                    Serializer.c<ProfileFriendItem> cVar = ProfileFriendItem.CREATOR;
                    arrayList.add(ProfileFriendItem.a.b(usersUserFullDto));
                }
                return new kqs(arrayList, list, list2, EmptyList.b);
            case 1:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(181028373, intValue, -1, "com.vk.music.playlist.display.presentation.ComposableSingletons$MusicPlaylistListContentKt.lambda$181028373.<anonymous> (MusicPlaylistListContent.kt:121)");
                    }
                    m470.a(null, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 2:
                String str = (String) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar2.J(str) ? 4 : 2;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(215954357, intValue2, -1, "com.vk.ecomm.design.compose.inputfield.ComposableSingletons$ReviewTextInputFieldKt.lambda$215954357.<anonymous> (ReviewTextInputField.kt:152)");
                    }
                    q630 E = ahn.E(txj0.f(q630.a.a, 1.0f), "progressHintTestTag");
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    frv0 frv0Var = wuv0Var.i0;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(str, E, ylu0Var.getText().p, null, null, 0, 0, null, 2, false, 0, 1, null, frv0Var, aVar2, (intValue2 & 14) | 100663344, 48, 5880);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 3:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1774072734, intValue3, -1, "com.vk.profile.user.impl.ui.content.gifts.ComposableSingletons$UserProfileContentGiftsViewHolderKt.lambda$-1774072734.<anonymous> (UserProfileContentGiftsViewHolder.kt:167)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) aVar3.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var2.c().a;
                    int i2 = 0;
                    while (i2 < 3) {
                        float f2 = 12;
                        q630.a aVar4 = q630.a.a;
                        q630 f3 = txj0.f(s200.H(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 7), f);
                        dt1.a.getClass();
                        ty6.a aVar5 = dt1.a.o;
                        a.m mVar = androidx.compose.foundation.layout.a.c;
                        androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, aVar5, aVar3, 48);
                        int hashCode = Long.hashCode(n34.n(aVar3));
                        sy90 D = aVar3.D();
                        q630 c = qri.c(aVar3, f3);
                        cri.h7.getClass();
                        LayoutNode.a aVar6 = cri.a.b;
                        if (aVar3.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar3.H();
                        if (aVar3.L()) {
                            aVar3.I(aVar6);
                        } else {
                            aVar3.f();
                        }
                        cri.a.c cVar2 = cri.a.f;
                        k9q0.w(aVar3, a, cVar2);
                        cri.a.e eVar = cri.a.e;
                        k9q0.w(aVar3, D, eVar);
                        Integer valueOf = Integer.valueOf(hashCode);
                        cri.a.b bVar = cri.a.g;
                        k9q0.w(aVar3, valueOf, bVar);
                        cri.a.C2678a c2678a = cri.a.h;
                        k9q0.t(aVar3, c2678a);
                        cri.a.d dVar = cri.a.d;
                        k9q0.w(aVar3, c, dVar);
                        q630 E2 = s200.E(txj0.f(aVar4, f), f2, f2);
                        androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, aVar3, 48);
                        int hashCode2 = Long.hashCode(n34.n(aVar3));
                        sy90 D2 = aVar3.D();
                        q630 c2 = qri.c(aVar3, E2);
                        if (aVar3.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar3.H();
                        if (aVar3.L()) {
                            aVar3.I(aVar6);
                        } else {
                            aVar3.f();
                        }
                        k9q0.w(aVar3, a2, cVar2);
                        k9q0.w(aVar3, D2, eVar);
                        ur.d(hashCode2, aVar3, bVar, aVar3, c2678a);
                        k9q0.w(aVar3, c2, dVar);
                        q630 d2 = rte0.d(txj0.q(aVar4, 40), vog0.a);
                        e.a aVar7 = androidx.compose.ui.graphics.e.a;
                        f9t.e(hr80.m(d2, j, aVar7), aVar3, 0);
                        q630 H = s200.H(aVar4, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                        androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar3, 0);
                        int hashCode3 = Long.hashCode(n34.n(aVar3));
                        sy90 D3 = aVar3.D();
                        q630 c3 = qri.c(aVar3, H);
                        if (aVar3.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar3.H();
                        if (aVar3.L()) {
                            aVar3.I(aVar6);
                        } else {
                            aVar3.f();
                        }
                        k9q0.w(aVar3, a3, cVar2);
                        k9q0.w(aVar3, D3, eVar);
                        ur.d(hashCode3, aVar3, bVar, aVar3, c2678a);
                        k9q0.w(aVar3, c3, dVar);
                        float f4 = 8;
                        float f5 = 4;
                        f9t.e(hr80.m(rte0.d(txj0.v(txj0.h(aVar4, f4), 120), vog0.b(f5)), j, aVar7), aVar3, 0);
                        f9t.e(txj0.h(aVar4, f4), aVar3, 6);
                        float f6 = 80;
                        f9t.e(hr80.m(rte0.d(txj0.v(txj0.h(aVar4, f4), f6), vog0.b(f5)), j, aVar7), aVar3, 0);
                        aVar3.G();
                        aVar3.G();
                        f9t.e(hr80.m(rte0.d(txj0.q(aVar4, 176), vog0.b(16)), j, aVar7), aVar3, 0);
                        f9t.e(txj0.h(aVar4, 18), aVar3, 6);
                        f9t.e(hr80.m(rte0.d(txj0.v(txj0.h(aVar4, f4), f6), vog0.b(f5)), j, aVar7), aVar3, 0);
                        f9t.e(txj0.h(aVar4, f4), aVar3, 6);
                        f9t.e(hr80.m(rte0.d(txj0.v(txj0.h(aVar4, f4), VersionConstants.PRODUCT_MAJOR_VERSION), vog0.b(f5)), j, aVar7), aVar3, 0);
                        aVar3.G();
                        i2++;
                        f = 1.0f;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 4:
                rdi.j((SQLiteStatement) obj, ((Integer) obj3).intValue(), ((com.vk.im.engine.models.dialogs.b) obj2).n);
                return s3q0.a;
            case 5:
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar8 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                aVar8.K(-2116838937);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-2116838937, intValue4, -1, "com.vk.catalog.mvi.section.ui.view.reorder.dragActivatorLongTap.<anonymous> (DragAndDropReorder.kt:203)");
                }
                wfo wfoVar = (wfo) aVar8.r(sfo.a);
                nfu nfuVar = (nfu) aVar8.r(sfo.b);
                Object r = aVar8.r(sfo.c);
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (wfoVar != null && r != null) {
                    aVar8.K(256333130);
                    boolean y = aVar8.y(wfoVar) | aVar8.y(r);
                    Object x = aVar8.x();
                    if (y || x == c0012a) {
                        x = new sfo.a(wfoVar, r);
                        aVar8.R(x);
                    }
                    q630Var = skn0.b(q630Var, wfoVar, (PointerInputEventHandler) x);
                    aVar8.j();
                } else if (nfuVar == null || r == null) {
                    aVar8.K(1532330539);
                    aVar8.j();
                } else {
                    aVar8.K(256996406);
                    boolean y2 = aVar8.y(nfuVar) | aVar8.y(r);
                    Object x2 = aVar8.x();
                    if (y2 || x2 == c0012a) {
                        x2 = new sfo.b(nfuVar, r);
                        aVar8.R(x2);
                    }
                    q630Var = skn0.b(q630Var, nfuVar, (PointerInputEventHandler) x2);
                    aVar8.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar8.j();
                return q630Var;
            case 6:
                ep10 ep10Var = (ep10) obj;
                long j2 = ((o6j) obj3).a;
                tra0 N = ((zo10) obj2).N(o6j.b(0, j2, (ep10Var.r0(kqu0.w) * 2) + o6j.i(j2), 0, 0, 13));
                return ep10Var.Q(N.b, N.c, jgp.b, new lxh0(N, i));
            default:
                Boolean bool = (Boolean) obj2;
                return new VoipActionsFeatureState.p(((Boolean) obj).booleanValue(), bool.booleanValue(), bool.booleanValue(), (NoiseSuppressorFeature$State) obj3);
        }
    }
}
