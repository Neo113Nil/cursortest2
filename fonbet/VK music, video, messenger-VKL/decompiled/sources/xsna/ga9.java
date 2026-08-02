package xsna;

import android.util.LruCache;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.friends.dto.FriendsGetFieldsResponseDto;
import com.vk.api.generated.friends.dto.FriendsGetFiltersDto;
import com.vk.api.generated.friends.dto.FriendsGetOrderDto;
import com.vk.api.generated.friends.dto.FriendsSearchFiltersDto;
import com.vk.api.generated.friends.dto.FriendsSearchResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetMembersFieldsResponseDto;
import com.vk.api.generated.groups.dto.GroupsUserXtrRoleDto;
import com.vk.api.users.UsersSearch;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import com.vk.dto.user.UserSex;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogMember;
import com.vk.im.engine.models.users.User;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.toggle.features.ComFeatures;
import com.vk.voip.api.dto.VoipChatInfo;
import com.vk.voip.api.id.CallId;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.dto.profiles.VoipFriendStatus;
import com.vk.voip.ui.members.VoipDataProvider;
import com.vungle.ads.internal.protos.Sdk;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.c8x0;
import xsna.ca9;
import xsna.mts;
import xsna.pdg0;
import xsna.sew0;
import xsna.whr0;

/* compiled from: CallStateLoader.kt */
/* loaded from: classes7.dex */
public final class ga9 {
    public final com.vk.voip.b a;

    public ga9(com.vk.voip.b bVar) {
        this.a = bVar;
    }

    public static Map c(Collection collection) {
        com.vk.voip.ui.c.b.getClass();
        VoipDataProvider voipDataProvider = com.vk.voip.ui.c.d0;
        if (voipDataProvider == null) {
            voipDataProvider = null;
        }
        return (Map) new io.reactivex.rxjava3.internal.operators.single.g0(voipDataProvider.j(collection), new io.reactivex.rxjava3.internal.operators.completable.b0(io.reactivex.rxjava3.core.a.r(500L, TimeUnit.MILLISECONDS))).c();
    }

    public final Set<CallMemberId> a() {
        Set<ParticipantId> raisedHandIds;
        ParticipantStatesManager participantStatesManager = this.a.getParticipantStatesManager();
        if (participantStatesManager != null && (raisedHandIds = participantStatesManager.getRaisedHandIds()) != null) {
            Set<ParticipantId> set = raisedHandIds;
            ArrayList arrayList = new ArrayList(c5g.u(set, 10));
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(mnh0.E((ParticipantId) it.next()));
            }
            Set<CallMemberId> S0 = j5g.S0(arrayList);
            if (S0 != null) {
                return S0;
            }
        }
        return EmptySet.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0683 A[LOOP:4: B:120:0x067d->B:122:0x0683, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x072c A[LOOP:7: B:174:0x0726->B:176:0x072c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0752 A[LOOP:8: B:179:0x0750->B:180:0x0752, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0770 A[LOOP:9: B:183:0x076a->B:185:0x0770, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x07a9  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x07fa  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0809  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x08b1  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x08da  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x08fd  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0908  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0915  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0924  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x094c  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x098d  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0995  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x09a3  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x09a8  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0990  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x090c  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0883  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x07ac  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0379 A[LOOP:0: B:35:0x0373->B:37:0x0379, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0a5a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0a1b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0565  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r2v73 */
    /* JADX WARN: Type inference failed for: r2v74 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v22, types: [com.vk.voip.ui.members.VoipDataProvider] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r6v36, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v43, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r6v45, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v65 */
    /* JADX WARN: Type inference failed for: r9v8, types: [com.vk.voip.ui.members.VoipDataProvider, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ca9 b(String str, boolean z) {
        Boolean valueOf;
        Object obj;
        Dialog dialog;
        CallMemberId callMemberId;
        long j;
        ChatSettings chatSettings;
        String str2;
        CallId callId;
        ?? r2;
        VoipDataProvider voipDataProvider;
        a1w a1wVar;
        pdg0 n;
        Object obj2;
        xpp xppVar;
        ?? r6;
        a1w a1wVar2;
        pdg0 n2;
        Object obj3;
        Iterator it;
        ohm ohmVar;
        List O0;
        VoipDataProvider voipDataProvider2;
        pdg0 n3;
        Object obj4;
        Iterator it2;
        Iterator it3;
        Iterator it4;
        int i;
        Iterator it5;
        Iterator it6;
        Set set;
        boolean z2;
        boolean z3;
        Set<CallMemberId> set2;
        Iterator it7;
        List list;
        Boolean bool;
        c8x0.f fVar;
        whr0 whr0Var;
        Object obj5;
        Object obj6;
        HashMap hashMap;
        VoipFriendStatus voipFriendStatus;
        whr0 whr0Var2;
        com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
        cVar.getClass();
        CallId callId2 = com.vk.voip.ui.c.T0;
        dhw0 L = cVar.L();
        if (callId2.c || L == null) {
            return ca9.b.a;
        }
        CallMemberId a = this.a.a();
        if (a == null || !L.h.contains(a)) {
            return ca9.b.a;
        }
        boolean a2 = com.vk.voip.ui.c.W().a();
        if (L.r() || a2) {
            Map c = c(L.h);
            y59 y59Var = new y59(a, c);
            String obj7 = str != null ? drm0.p0(str).toString() : null;
            if (obj7 == null) {
                obj7 = "";
            }
            boolean N = drm0.N(obj7);
            Set<CallMemberId> set3 = L.h;
            ArrayList arrayList = new ArrayList();
            for (Object obj8 : set3) {
                CallMemberId callMemberId2 = (CallMemberId) obj8;
                if (N) {
                    valueOf = Boolean.TRUE;
                } else {
                    whr0 whr0Var3 = (whr0) c.get(callMemberId2.b);
                    if (whr0Var3 == null) {
                        valueOf = Boolean.FALSE;
                    } else {
                        valueOf = Boolean.valueOf(brm0.B(whr0Var3.s, obj7, true) || brm0.B(whr0Var3.t, obj7, true));
                        if (!valueOf.booleanValue()) {
                            arrayList.add(obj8);
                        }
                    }
                }
                if (!valueOf.booleanValue()) {
                }
            }
            List D0 = j5g.D0(y59Var, arrayList);
            com.vk.voip.ui.c cVar2 = com.vk.voip.ui.c.b;
            cVar2.getClass();
            FeatureRoles p = ((r6x0) com.vk.voip.ui.c.l0()).p();
            Set<CallMemberId> set4 = L.h;
            EmptySet emptySet = EmptySet.b;
            Set<CallMemberId> set5 = L.k;
            Set<CallMemberId> set6 = L.l;
            Set<CallMemberId> a3 = a();
            Set<CallMemberId> set7 = L.r;
            Set<CallMemberId> set8 = L.n;
            Set<CallMemberId> set9 = L.o;
            Map<CallMemberId, MediaOptionState> map = L.s;
            Map<CallMemberId, MediaOptionState> map2 = L.t;
            Map<CallMemberId, MediaOptionState> map3 = L.u;
            Set<CallMemberId> set10 = L.w;
            Set<CallMemberId> set11 = L.x;
            CallMemberId callMemberId3 = L.z;
            CallMemberId callMemberId4 = L.y;
            boolean z4 = L.I;
            cVar2.getClass();
            SessionRoomId j2 = com.vk.voip.ui.c.B0.j();
            VoipChatInfo voipChatInfo = L.B;
            return new ca9.c(callId2, a, (Dialog) null, (Set) set4, D0, (Set) emptySet, (Set) emptySet, (Set) emptySet, (Set) emptySet, true, (Collection) null, false, c, (Set) set5, (Set) set6, (Set) a3, (Set) set7, (Set) set8, (Set) set9, (Map) map, (Map) map2, (Map) map3, false, false, false, false, false, (Set) set10, (Set) set11, callMemberId3, callMemberId4, z4, false, false, p, false, false, j2, false, voipChatInfo != null ? voipChatInfo.g : null, 1024);
        }
        jgp jgpVar = jgp.b;
        long j3 = L.b;
        if (j3 == 0) {
            dialog = null;
        } else {
            Serializer.c<Peer> cVar3 = Peer.CREATOR;
            tqm tqmVar = new tqm(new sqm(Peer.a.b(j3), Source.ACTUAL, true, (Object) null, 24));
            a1w a1wVar3 = q1w.a;
            if (a1wVar3 == null) {
                a1wVar3 = null;
            }
            pdg0 n4 = a1wVar3.n(this, tqmVar);
            if (n4 instanceof pdg0.a) {
                obj = new wpp();
            } else {
                if (!(n4 instanceof pdg0.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                obj = ((pdg0.b) n4).a;
            }
            dialog = (Dialog) ((wpp) obj).c.get(Long.valueOf(j3));
        }
        ChatSettings Hb = dialog != null ? dialog.Hb() : null;
        boolean z5 = (dialog == null || Hb == null) ? true : Hb.n;
        UserId Bb = a.Bb();
        boolean z6 = Bb != null && fkq0.b(Bb);
        int i2 = 17;
        if (Bb == null || !z6 || str == null || str.length() == 0) {
            if (Bb == null || !z6) {
                callMemberId = a;
                j = j3;
                chatSettings = Hb;
                str2 = "";
                callId = callId2;
                if (z5) {
                    VoipDataProvider voipDataProvider3 = com.vk.voip.ui.c.d0;
                    ?? r9 = voipDataProvider3;
                    if (voipDataProvider3 == null) {
                        r9 = 0;
                    }
                    String str3 = str == null ? str2 : str;
                    r9.getClass();
                    if (drm0.N(str3)) {
                        r9.getClass();
                        if (z) {
                            r2 = 0;
                        } else {
                            if (z) {
                                throw new NoWhenBranchMatchedException();
                            }
                            synchronized (r9) {
                                r2 = r9.l;
                            }
                        }
                        if (r2 == 0) {
                            hnw0 hnw0Var = r9.f;
                            dz2 x = yfb.x(mts.a.b(hnw0Var.e, null, FriendsGetOrderDto.HINTS, null, 200, 0, hnw0.i, hnw0Var.c, e43.l(FriendsGetFiltersDto.WITHOUT_DEAD, FriendsGetFiltersDto.WITHOUT_BANNED, FriendsGetFiltersDto.WITHOUT_DELETED), 197));
                            x.q = 0;
                            x.n = false;
                            zdw0.a(x, hnw0Var.d);
                            vx2.a.getClass();
                            r2 = hnw0Var.a.a(((FriendsGetFieldsResponseDto) x.f(vx2.b())).d());
                            r9.k(r2, VoipDataProvider.ShouldPutUsersToInviteIntoCache.UsersForInviteCachedFrom.Friends);
                        }
                    } else {
                        hnw0 hnw0Var2 = r9.f;
                        dz2 x2 = yfb.x(nts.h(hnw0Var2.e, null, str3, hnw0.i, 0, 50, e43.l(FriendsSearchFiltersDto.WITHOUT_DEAD, FriendsSearchFiltersDto.WITHOUT_BANNED, FriendsSearchFiltersDto.WITHOUT_DELETED), 19));
                        x2.q = 0;
                        x2.n = false;
                        zdw0.a(x2, hnw0Var2.d);
                        vx2.a.getClass();
                        r2 = hnw0Var2.a.a(((FriendsSearchResponseDto) x2.f(vx2.b())).d());
                    }
                } else {
                    r2 = EmptyList.b;
                }
            } else {
                VoipDataProvider voipDataProvider4 = com.vk.voip.ui.c.d0;
                ?? r3 = voipDataProvider4;
                if (voipDataProvider4 == null) {
                    r3 = 0;
                }
                UserId a4 = fkq0.a(Bb);
                Set singleton = Collections.singleton(o25.a().c());
                List<whr0> list2 = r3.l;
                if (z || list2 == null) {
                    hnw0 hnw0Var3 = r3.f;
                    d8t0 d8t0Var = hnw0Var3.d;
                    ComFeatures comFeatures = ComFeatures.COM_MIGRATE_GROUPS_GET_MEMBERS;
                    comFeatures.getClass();
                    if (com.vk.toggle.b.A.a(comFeatures)) {
                        str2 = "";
                        callId = callId2;
                        j = j3;
                        callMemberId = a;
                        chatSettings = Hb;
                        dz2 x3 = yfb.x(xqu.g(new zqu(), fkq0.a(a4), null, 0, 1000, hnw0.h, null, null, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE));
                        x3.K("ref", hnw0Var3.c);
                        zdw0.a(x3, d8t0Var);
                        vx2.a.getClass();
                        List<GroupsUserXtrRoleDto> d = ((GroupsGetMembersFieldsResponseDto) x3.f(vx2.b())).d();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj9 : d) {
                            if (!singleton.contains(((GroupsUserXtrRoleDto) obj9).D0())) {
                                arrayList2.add(obj9);
                            }
                        }
                        r2 = new ArrayList(c5g.u(arrayList2, 10));
                        Iterator it8 = arrayList2.iterator();
                        while (it8.hasNext()) {
                            r2.add(inw0.a(qru.a((GroupsUserXtrRoleDto) it8.next())));
                        }
                    } else {
                        callMemberId = a;
                        j = j3;
                        chatSettings = Hb;
                        str2 = "";
                        callId = callId2;
                        vpu vpuVar = new vpu(a4, 0, 1000, "", "first_name,last_name,photo_base,sex,verified,friend_status,can_call,contact_name,first_name_gen,first_name_dat,is_nft", hnw0Var3.c);
                        zdw0.a(vpuVar, d8t0Var);
                        vx2.a.getClass();
                        r2 = rli0.A(new ulp0(rli0.j(new i5g(vpuVar.f(vx2.b())), new q9i0(singleton, 17)), new pcw0(1)));
                    }
                    r3.k(r2, VoipDataProvider.ShouldPutUsersToInviteIntoCache.UsersForInviteCachedFrom.UsersOfGroup);
                } else {
                    callMemberId = a;
                    j = j3;
                    chatSettings = Hb;
                    r2 = list2;
                }
            }
            Collection<whr0> collection = (Collection) r2;
            HashMap hashMap2 = new HashMap(collection.size());
            for (whr0 whr0Var4 : collection) {
                hashMap2.put(whr0Var4.a, whr0Var4);
            }
            if (dialog == null || chatSettings == null) {
                voipDataProvider = null;
            } else {
                Serializer.c<Peer> cVar4 = Peer.CREATOR;
                voipDataProvider = null;
                xdm xdmVar = new xdm(Peer.a.b(j), Source.NETWORK, true, null);
                a1wVar = q1w.a;
                if (a1wVar == null) {
                    a1wVar = null;
                }
                n = a1wVar.n(this, xdmVar);
                if (!(n instanceof pdg0.a)) {
                    obj2 = new xpp();
                } else {
                    if (!(n instanceof pdg0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj2 = ((pdg0.b) n).a;
                }
                xppVar = (xpp) obj2;
                if (xppVar != null || (ohmVar = (ohm) xppVar.a()) == null || (O0 = j5g.O0(ohmVar.b)) == null) {
                    r6 = EmptyList.b;
                } else {
                    List list3 = O0;
                    r6 = new ArrayList(c5g.u(list3, 10));
                    Iterator it9 = list3.iterator();
                    while (it9.hasNext()) {
                        r6.add(((DialogMember) it9.next()).b);
                    }
                }
                d1e0 d1e0Var = new d1e0((Collection<? extends Peer>) r6, Source.ACTUAL, true);
                a1wVar2 = q1w.a;
                if (a1wVar2 == null) {
                    a1wVar2 = null;
                }
                n2 = a1wVar2.n(this, d1e0Var);
                if (!(n2 instanceof pdg0.a)) {
                    obj3 = new ProfilesInfo();
                } else {
                    if (!(n2 instanceof pdg0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj3 = ((pdg0.b) n2).a;
                }
                ?? hashMap3 = new HashMap();
                it = ((ProfilesInfo) obj3).b.c.entrySet().iterator();
                while (it.hasNext()) {
                    User user = (User) ((Map.Entry) it.next()).getValue();
                    String valueOf2 = String.valueOf(user.B7().b);
                    Image Ab = user.h.Ab();
                    String str4 = Ab != null ? Ab.d : null;
                    if (str4 == null) {
                        str4 = str2;
                    }
                    UserNameCase userNameCase = UserNameCase.NOM;
                    String Ab2 = user.Ab(userNameCase);
                    String Bb2 = user.Bb(userNameCase);
                    String Ab3 = user.Ab(UserNameCase.GEN);
                    String h8 = user.h8();
                    LruCache<String, fxj0> lruCache = sew0.a;
                    sew0.b a5 = sew0.a.a(str4, str4, user.Q);
                    boolean z7 = user.g == UserSex.FEMALE;
                    boolean z8 = user.q9().b;
                    int i3 = user.z;
                    VoipFriendStatus voipFriendStatus2 = i3 == 1 ? VoipFriendStatus.FOLLOWING : i3 == 2 ? VoipFriendStatus.INCOME_FRIENDSHIP_REQUEST : i3 == 3 ? VoipFriendStatus.FRIENDS : VoipFriendStatus.NOT_FRIENDS;
                    boolean z9 = user.w;
                    com.vk.voip.ui.c.b.getClass();
                    hashMap3.put(valueOf2, new whr0(valueOf2, a5, z7, z8, false, z9, voipFriendStatus2, Ab2, Bb2, Ab3, "", h8, ((Boolean) com.vk.voip.ui.c.s0.g.invoke()).booleanValue(), false, null, false, null, null, 253952));
                }
                jgpVar = hashMap3;
            }
            Map c2 = c(L.h);
            Set keySet = c2.keySet();
            Set keySet2 = jgpVar.keySet();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj10 : keySet2) {
                if (!keySet.contains((String) obj10)) {
                    arrayList3.add(obj10);
                }
            }
            Set C = rli0.C(rli0.j(new i5g(hashMap2.keySet()), new bp7(1, keySet, arrayList3)));
            com.vk.voip.ui.c.b.getClass();
            voipDataProvider2 = com.vk.voip.ui.c.d0;
            if (voipDataProvider2 == null) {
                voipDataProvider2 = voipDataProvider;
            }
            com.vk.voip.ui.members.a aVar = voipDataProvider2.e;
            aVar.getClass();
            n3 = aVar.a.n(aVar, new com.vk.im.engine.commands.contacts.a(Source.CACHE, voipDataProvider, 6));
            if (n3 instanceof pdg0.a) {
                obj4 = EmptyList.b;
            } else {
                if (!(n3 instanceof pdg0.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                obj4 = ((pdg0.b) n3).a;
            }
            ArrayList arrayList4 = new ArrayList();
            for (qtd0 qtd0Var : (Iterable) obj4) {
                if (qtd0Var instanceof Contact) {
                    whr0Var2 = aVar.a((Contact) qtd0Var);
                    hashMap = hashMap2;
                } else {
                    String valueOf3 = String.valueOf(qtd0Var.r8());
                    Image Ab4 = qtd0Var.C8().Ab();
                    String str5 = Ab4 != null ? Ab4.d : null;
                    if (str5 == null) {
                        str5 = str2;
                    }
                    UserNameCase userNameCase2 = UserNameCase.NOM;
                    String d6 = qtd0Var.d6(userNameCase2);
                    String H5 = qtd0Var.H5(userNameCase2);
                    String d62 = qtd0Var.d6(UserNameCase.GEN);
                    String h82 = qtd0Var.h8();
                    LruCache<String, fxj0> lruCache2 = sew0.a;
                    sew0.b a6 = sew0.a.a(str5, str5, qtd0Var.n9());
                    whr0.a aVar2 = new whr0.a(valueOf3);
                    boolean z10 = qtd0Var.B2() == UserSex.FEMALE;
                    boolean z11 = qtd0Var.q9().b;
                    User user2 = qtd0Var instanceof User ? (User) qtd0Var : null;
                    Integer valueOf4 = user2 != null ? Integer.valueOf(user2.z) : null;
                    if (valueOf4 == null) {
                        hashMap = hashMap2;
                    } else {
                        hashMap = hashMap2;
                        if (valueOf4.intValue() == 1) {
                            voipFriendStatus = VoipFriendStatus.FOLLOWING;
                            VoipFriendStatus voipFriendStatus3 = voipFriendStatus;
                            boolean ib = qtd0Var.ib();
                            com.vk.voip.ui.c.b.getClass();
                            whr0Var2 = new whr0(valueOf3, a6, z10, z11, false, ib, voipFriendStatus3, d6, H5, d62, "", h82, ((Boolean) com.vk.voip.ui.c.s0.g.invoke()).booleanValue(), false, aVar2, false, null, null, 237568);
                        }
                    }
                    voipFriendStatus = (valueOf4 != null && valueOf4.intValue() == 2) ? VoipFriendStatus.INCOME_FRIENDSHIP_REQUEST : (valueOf4 != null && valueOf4.intValue() == 3) ? VoipFriendStatus.FRIENDS : VoipFriendStatus.NOT_FRIENDS;
                    VoipFriendStatus voipFriendStatus32 = voipFriendStatus;
                    boolean ib2 = qtd0Var.ib();
                    com.vk.voip.ui.c.b.getClass();
                    whr0Var2 = new whr0(valueOf3, a6, z10, z11, false, ib2, voipFriendStatus32, d6, H5, d62, "", h82, ((Boolean) com.vk.voip.ui.c.s0.g.invoke()).booleanValue(), false, aVar2, false, null, null, 237568);
                }
                if (whr0Var2 != null) {
                    arrayList4.add(whr0Var2);
                }
                hashMap2 = hashMap;
            }
            HashMap hashMap4 = hashMap2;
            ArrayList arrayList5 = new ArrayList();
            it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                whr0 whr0Var5 = (whr0) next;
                if (str == null || drm0.D(whr0Var5.e(), str, true)) {
                    arrayList5.add(next);
                }
            }
            HashMap hashMap5 = new HashMap();
            it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                whr0 whr0Var6 = (whr0) it3.next();
                hashMap5.put(whr0Var6.a, whr0Var6);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : hashMap5.entrySet()) {
                if (!keySet.contains(entry.getKey()) && !arrayList3.contains(entry.getKey()) && !C.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Collection values = linkedHashMap.values();
            ArrayList arrayList6 = new ArrayList();
            for (Object obj11 : values) {
                whr0 whr0Var7 = (whr0) obj11;
                whr0.a aVar3 = whr0Var7.o;
                String str6 = aVar3 != null ? aVar3.a : null;
                boolean contains = keySet.contains(whr0Var7.a);
                boolean z12 = str6 == null;
                boolean z13 = str6 != null && (arrayList3.contains(str6) || C.contains(str6));
                if (!contains && (z12 || !z13)) {
                    arrayList6.add(obj11);
                }
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            it4 = arrayList6.iterator();
            while (it4.hasNext()) {
                linkedHashSet.add(((whr0) it4.next()).a);
            }
            Map[] mapArr = {linkedHashMap, jgpVar, hashMap4, c2};
            HashMap hashMap6 = new HashMap();
            for (i = 0; i < 4; i++) {
                hashMap6.putAll(mapArr[i]);
            }
            k8x0 k8x0Var = L.L;
            Set<CallMemberId> set12 = k8x0Var.a;
            Set<CallMemberId> set13 = set12;
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            it5 = set13.iterator();
            while (it5.hasNext()) {
                linkedHashSet2.add(((CallMemberId) it5.next()).b);
            }
            c1e0 c1e0Var = new c1e0(str, hashMap6);
            CallMemberId callMemberId5 = callMemberId;
            b1e0 b1e0Var = new b1e0(callMemberId5, hashMap6);
            List B = rli0.B(new oli0(linkedHashSet2, rli0.j(new i5g(arrayList3), c1e0Var)));
            g5g.L(B, b1e0Var);
            it6 = ((ArrayList) B).iterator();
            if (it6.hasNext()) {
                Object next2 = it6.next();
                if (it6.hasNext()) {
                    LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                    linkedHashSet3.add(next2);
                    while (it6.hasNext()) {
                        linkedHashSet3.add(it6.next());
                    }
                    set = linkedHashSet3;
                } else {
                    set = Collections.singleton(next2);
                }
            } else {
                set = EmptySet.b;
            }
            com.vk.voip.ui.c.b.getClass();
            boolean z14 = !((Boolean) com.vk.voip.ui.c.s0.i.invoke()).booleanValue() && L.D && this.a.isMeCreatorOrAdmin();
            z2 = !z14 && this.a.isWaitingRoomEnabled();
            if (z2) {
                set2 = set12;
                hashMap6.putAll(c(set2));
                if (set2.isEmpty()) {
                    z3 = false;
                    fVar = new c8x0.f(0);
                } else if (!k8x0Var.b || (whr0Var = (whr0) hashMap6.get(((CallMemberId) j5g.X(set13)).b)) == null) {
                    z3 = false;
                    fVar = null;
                } else {
                    String str7 = whr0Var.h;
                    String str8 = whr0Var.i;
                    if (str8.length() > 0) {
                        obj5 = Character.valueOf(erm0.x0(str8));
                        obj6 = str2;
                    } else {
                        obj5 = str2;
                        obj6 = obj5;
                    }
                    if (!obj5.equals(obj6)) {
                        str7 = str7 + ' ' + obj5 + JwtParser.SEPARATOR_CHAR;
                    }
                    fVar = new c8x0.f(str7, set12.size());
                    z3 = false;
                }
                if (fVar != null) {
                    com.vk.voip.ui.c.x.onNext(fVar);
                }
            } else {
                z3 = false;
                set2 = EmptyList.b;
            }
            Collection collection2 = set2;
            Set<CallMemberId> set14 = L.h;
            y59 y59Var2 = new y59(callMemberId5, c2);
            List B2 = rli0.B(rli0.j(new i5g(set14), new c69(str, c2)));
            g5g.L(B2, y59Var2);
            it7 = ((ArrayList) B2).iterator();
            if (it7.hasNext()) {
                Object next3 = it7.next();
                if (it7.hasNext()) {
                    ArrayList b = y57.b(next3);
                    while (it7.hasNext()) {
                        b.add(it7.next());
                    }
                    list = b;
                } else {
                    list = Collections.singletonList(next3);
                }
            } else {
                list = EmptyList.b;
            }
            boolean z15 = (!L.D && this.a.isMeCreatorOrAdmin() && this.a.isFeedbackEnabled()) ? true : z3;
            Set<CallMemberId> set15 = L.h;
            Set keySet3 = jgpVar.keySet();
            Long n5 = arm0.n(callMemberId5.b);
            boolean z16 = !((n5 != null ? n5.longValue() : 0L) < 0 ? true : z3);
            boolean z17 = (L.D || !this.a.isMeCreatorOrAdmin()) ? z3 : true;
            boolean z18 = (dialog == null && dialog.uc()) ? z3 : true;
            Set<CallMemberId> set16 = L.k;
            Set<CallMemberId> set17 = L.l;
            Set<CallMemberId> a7 = a();
            Set<CallMemberId> set18 = L.r;
            Set<CallMemberId> set19 = L.n;
            Set<CallMemberId> set20 = L.o;
            Map<CallMemberId, MediaOptionState> map4 = L.s;
            Map<CallMemberId, MediaOptionState> map5 = L.t;
            List list4 = list;
            Map<CallMemberId, MediaOptionState> map6 = L.u;
            VoipChatInfo voipChatInfo2 = L.B;
            boolean booleanValue = (voipChatInfo2 != null || (bool = voipChatInfo2.e) == null) ? false : bool.booleanValue();
            boolean z19 = L.H;
            Set<CallMemberId> set21 = L.w;
            Set<CallMemberId> set22 = L.x;
            CallMemberId callMemberId6 = L.z;
            CallMemberId callMemberId7 = L.y;
            boolean z20 = L.I;
            com.vk.voip.ui.c cVar5 = com.vk.voip.ui.c.b;
            cVar5.getClass();
            FeatureRoles p2 = ((r6x0) com.vk.voip.ui.c.l0()).p();
            cVar5.getClass();
            SessionRoomId j4 = com.vk.voip.ui.c.B0.j();
            com.vk.voip.ui.actions.feature.c cVar6 = com.vk.voip.ui.c.e0;
            djw0 djw0Var = (cVar6 != null ? cVar6 : null).f;
            boolean z21 = djw0Var == null && djw0Var.a;
            VoipChatInfo voipChatInfo3 = L.B;
            return new ca9.c(callId, callMemberId5, dialog, (Set) set15, list4, keySet3, set, C, (Set) linkedHashSet, z16, collection2, z18, (Map) hashMap6, (Set) set16, (Set) set17, (Set) a7, (Set) set18, (Set) set19, (Set) set20, (Map) map4, (Map) map5, (Map) map6, z5, true, booleanValue, z5, z19, (Set) set21, (Set) set22, callMemberId6, callMemberId7, z20, z14, z2, p2, z17, z15, j4, z21, voipChatInfo3 != null ? voipChatInfo3.g : null, 134217728);
        }
        VoipDataProvider voipDataProvider5 = com.vk.voip.ui.c.d0;
        if (voipDataProvider5 == null) {
            voipDataProvider5 = null;
        }
        UserId a8 = fkq0.a(Bb);
        Set singleton2 = Collections.singleton(o25.a().c());
        hnw0 hnw0Var4 = voipDataProvider5.f;
        hnw0Var4.getClass();
        UsersSearch.Entrypoint entrypoint = UsersSearch.Entrypoint.InviteCallMembersFromCommunity;
        UsersSearch usersSearch = new UsersSearch("users.search");
        usersSearch.K("fields", "first_name,last_name,photo_base,sex,verified,friend_status,can_call,contact_name,first_name_gen,first_name_dat,is_nft");
        usersSearch.K(CampaignEx.JSON_KEY_AD_Q, str);
        usersSearch.K("screen_ref", entrypoint.h());
        usersSearch.F(a8, "group_id");
        zdw0.a(usersSearch, hnw0Var4.d);
        vx2.a.getClass();
        callMemberId = a;
        j = j3;
        chatSettings = Hb;
        r2 = rli0.A(new ulp0(rli0.j(new i5g(usersSearch.f(vx2.b())), new q9i0(singleton2, i2)), new pcw0(1)));
        str2 = "";
        callId = callId2;
        Collection<whr0> collection3 = (Collection) r2;
        HashMap hashMap22 = new HashMap(collection3.size());
        while (r2.hasNext()) {
        }
        if (dialog == null) {
            Serializer.c<Peer> cVar42 = Peer.CREATOR;
            voipDataProvider = null;
            xdm xdmVar2 = new xdm(Peer.a.b(j), Source.NETWORK, true, null);
            a1wVar = q1w.a;
            if (a1wVar == null) {
            }
            n = a1wVar.n(this, xdmVar2);
            if (!(n instanceof pdg0.a)) {
            }
            xppVar = (xpp) obj2;
            if (xppVar != null) {
            }
            r6 = EmptyList.b;
            d1e0 d1e0Var2 = new d1e0((Collection<? extends Peer>) r6, Source.ACTUAL, true);
            a1wVar2 = q1w.a;
            if (a1wVar2 == null) {
            }
            n2 = a1wVar2.n(this, d1e0Var2);
            if (!(n2 instanceof pdg0.a)) {
            }
            ?? hashMap32 = new HashMap();
            it = ((ProfilesInfo) obj3).b.c.entrySet().iterator();
            while (it.hasNext()) {
            }
            jgpVar = hashMap32;
            Map c22 = c(L.h);
            Set keySet4 = c22.keySet();
            Set keySet22 = jgpVar.keySet();
            ArrayList arrayList32 = new ArrayList();
            while (r7.hasNext()) {
            }
            Set C2 = rli0.C(rli0.j(new i5g(hashMap22.keySet()), new bp7(1, keySet4, arrayList32)));
            com.vk.voip.ui.c.b.getClass();
            voipDataProvider2 = com.vk.voip.ui.c.d0;
            if (voipDataProvider2 == null) {
            }
            com.vk.voip.ui.members.a aVar4 = voipDataProvider2.e;
            aVar4.getClass();
            n3 = aVar4.a.n(aVar4, new com.vk.im.engine.commands.contacts.a(Source.CACHE, voipDataProvider, 6));
            if (n3 instanceof pdg0.a) {
            }
            ArrayList arrayList42 = new ArrayList();
            while (r11.hasNext()) {
            }
            HashMap hashMap42 = hashMap22;
            ArrayList arrayList52 = new ArrayList();
            it2 = arrayList42.iterator();
            while (it2.hasNext()) {
            }
            HashMap hashMap52 = new HashMap();
            it3 = arrayList52.iterator();
            while (it3.hasNext()) {
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            while (r3.hasNext()) {
            }
            Collection values2 = linkedHashMap2.values();
            ArrayList arrayList62 = new ArrayList();
            while (r3.hasNext()) {
            }
            LinkedHashSet linkedHashSet4 = new LinkedHashSet();
            it4 = arrayList62.iterator();
            while (it4.hasNext()) {
            }
            Map[] mapArr2 = {linkedHashMap2, jgpVar, hashMap42, c22};
            HashMap hashMap62 = new HashMap();
            while (i < 4) {
            }
            k8x0 k8x0Var2 = L.L;
            Set<CallMemberId> set122 = k8x0Var2.a;
            Set<CallMemberId> set132 = set122;
            LinkedHashSet linkedHashSet22 = new LinkedHashSet();
            it5 = set132.iterator();
            while (it5.hasNext()) {
            }
            c1e0 c1e0Var2 = new c1e0(str, hashMap62);
            CallMemberId callMemberId52 = callMemberId;
            b1e0 b1e0Var2 = new b1e0(callMemberId52, hashMap62);
            List B3 = rli0.B(new oli0(linkedHashSet22, rli0.j(new i5g(arrayList32), c1e0Var2)));
            g5g.L(B3, b1e0Var2);
            it6 = ((ArrayList) B3).iterator();
            if (it6.hasNext()) {
            }
            com.vk.voip.ui.c.b.getClass();
            if (((Boolean) com.vk.voip.ui.c.s0.i.invoke()).booleanValue()) {
            }
            if (z14) {
            }
            if (z2) {
            }
            Collection collection22 = set2;
            Set<CallMemberId> set142 = L.h;
            y59 y59Var22 = new y59(callMemberId52, c22);
            List B22 = rli0.B(rli0.j(new i5g(set142), new c69(str, c22)));
            g5g.L(B22, y59Var22);
            it7 = ((ArrayList) B22).iterator();
            if (it7.hasNext()) {
            }
            if (!L.D) {
            }
            Set<CallMemberId> set152 = L.h;
            Set keySet32 = jgpVar.keySet();
            Long n52 = arm0.n(callMemberId52.b);
            boolean z162 = !((n52 != null ? n52.longValue() : 0L) < 0 ? true : z3);
            if (L.D) {
            }
            if (dialog == null) {
            }
            Set<CallMemberId> set162 = L.k;
            Set<CallMemberId> set172 = L.l;
            Set<CallMemberId> a72 = a();
            Set<CallMemberId> set182 = L.r;
            Set<CallMemberId> set192 = L.n;
            Set<CallMemberId> set202 = L.o;
            Map<CallMemberId, MediaOptionState> map42 = L.s;
            Map<CallMemberId, MediaOptionState> map52 = L.t;
            List list42 = list;
            Map<CallMemberId, MediaOptionState> map62 = L.u;
            VoipChatInfo voipChatInfo22 = L.B;
            if (voipChatInfo22 != null) {
            }
            boolean z192 = L.H;
            Set<CallMemberId> set212 = L.w;
            Set<CallMemberId> set222 = L.x;
            CallMemberId callMemberId62 = L.z;
            CallMemberId callMemberId72 = L.y;
            boolean z202 = L.I;
            com.vk.voip.ui.c cVar52 = com.vk.voip.ui.c.b;
            cVar52.getClass();
            FeatureRoles p22 = ((r6x0) com.vk.voip.ui.c.l0()).p();
            cVar52.getClass();
            SessionRoomId j42 = com.vk.voip.ui.c.B0.j();
            com.vk.voip.ui.actions.feature.c cVar62 = com.vk.voip.ui.c.e0;
            djw0 djw0Var2 = (cVar62 != null ? cVar62 : null).f;
            if (djw0Var2 == null) {
            }
            VoipChatInfo voipChatInfo32 = L.B;
            return new ca9.c(callId, callMemberId52, dialog, (Set) set152, list42, keySet32, set, C2, (Set) linkedHashSet4, z162, collection22, z18, (Map) hashMap62, (Set) set162, (Set) set172, (Set) a72, (Set) set182, (Set) set192, (Set) set202, (Map) map42, (Map) map52, (Map) map62, z5, true, booleanValue, z5, z192, (Set) set212, (Set) set222, callMemberId62, callMemberId72, z202, z14, z2, p22, z17, z15, j42, z21, voipChatInfo32 != null ? voipChatInfo32.g : null, 134217728);
        }
        voipDataProvider = null;
        Map c222 = c(L.h);
        Set keySet42 = c222.keySet();
        Set keySet222 = jgpVar.keySet();
        ArrayList arrayList322 = new ArrayList();
        while (r7.hasNext()) {
        }
        Set C22 = rli0.C(rli0.j(new i5g(hashMap22.keySet()), new bp7(1, keySet42, arrayList322)));
        com.vk.voip.ui.c.b.getClass();
        voipDataProvider2 = com.vk.voip.ui.c.d0;
        if (voipDataProvider2 == null) {
        }
        com.vk.voip.ui.members.a aVar42 = voipDataProvider2.e;
        aVar42.getClass();
        n3 = aVar42.a.n(aVar42, new com.vk.im.engine.commands.contacts.a(Source.CACHE, voipDataProvider, 6));
        if (n3 instanceof pdg0.a) {
        }
        ArrayList arrayList422 = new ArrayList();
        while (r11.hasNext()) {
        }
        HashMap hashMap422 = hashMap22;
        ArrayList arrayList522 = new ArrayList();
        it2 = arrayList422.iterator();
        while (it2.hasNext()) {
        }
        HashMap hashMap522 = new HashMap();
        it3 = arrayList522.iterator();
        while (it3.hasNext()) {
        }
        LinkedHashMap linkedHashMap22 = new LinkedHashMap();
        while (r3.hasNext()) {
        }
        Collection values22 = linkedHashMap22.values();
        ArrayList arrayList622 = new ArrayList();
        while (r3.hasNext()) {
        }
        LinkedHashSet linkedHashSet42 = new LinkedHashSet();
        it4 = arrayList622.iterator();
        while (it4.hasNext()) {
        }
        Map[] mapArr22 = {linkedHashMap22, jgpVar, hashMap422, c222};
        HashMap hashMap622 = new HashMap();
        while (i < 4) {
        }
        k8x0 k8x0Var22 = L.L;
        Set<CallMemberId> set1222 = k8x0Var22.a;
        Set<CallMemberId> set1322 = set1222;
        LinkedHashSet linkedHashSet222 = new LinkedHashSet();
        it5 = set1322.iterator();
        while (it5.hasNext()) {
        }
        c1e0 c1e0Var22 = new c1e0(str, hashMap622);
        CallMemberId callMemberId522 = callMemberId;
        b1e0 b1e0Var22 = new b1e0(callMemberId522, hashMap622);
        List B32 = rli0.B(new oli0(linkedHashSet222, rli0.j(new i5g(arrayList322), c1e0Var22)));
        g5g.L(B32, b1e0Var22);
        it6 = ((ArrayList) B32).iterator();
        if (it6.hasNext()) {
        }
        com.vk.voip.ui.c.b.getClass();
        if (((Boolean) com.vk.voip.ui.c.s0.i.invoke()).booleanValue()) {
        }
        if (z14) {
        }
        if (z2) {
        }
        Collection collection222 = set2;
        Set<CallMemberId> set1422 = L.h;
        y59 y59Var222 = new y59(callMemberId522, c222);
        List B222 = rli0.B(rli0.j(new i5g(set1422), new c69(str, c222)));
        g5g.L(B222, y59Var222);
        it7 = ((ArrayList) B222).iterator();
        if (it7.hasNext()) {
        }
        if (!L.D) {
        }
        Set<CallMemberId> set1522 = L.h;
        Set keySet322 = jgpVar.keySet();
        Long n522 = arm0.n(callMemberId522.b);
        boolean z1622 = !((n522 != null ? n522.longValue() : 0L) < 0 ? true : z3);
        if (L.D) {
        }
        if (dialog == null) {
        }
        Set<CallMemberId> set1622 = L.k;
        Set<CallMemberId> set1722 = L.l;
        Set<CallMemberId> a722 = a();
        Set<CallMemberId> set1822 = L.r;
        Set<CallMemberId> set1922 = L.n;
        Set<CallMemberId> set2022 = L.o;
        Map<CallMemberId, MediaOptionState> map422 = L.s;
        Map<CallMemberId, MediaOptionState> map522 = L.t;
        List list422 = list;
        Map<CallMemberId, MediaOptionState> map622 = L.u;
        VoipChatInfo voipChatInfo222 = L.B;
        if (voipChatInfo222 != null) {
        }
        boolean z1922 = L.H;
        Set<CallMemberId> set2122 = L.w;
        Set<CallMemberId> set2222 = L.x;
        CallMemberId callMemberId622 = L.z;
        CallMemberId callMemberId722 = L.y;
        boolean z2022 = L.I;
        com.vk.voip.ui.c cVar522 = com.vk.voip.ui.c.b;
        cVar522.getClass();
        FeatureRoles p222 = ((r6x0) com.vk.voip.ui.c.l0()).p();
        cVar522.getClass();
        SessionRoomId j422 = com.vk.voip.ui.c.B0.j();
        com.vk.voip.ui.actions.feature.c cVar622 = com.vk.voip.ui.c.e0;
        djw0 djw0Var22 = (cVar622 != null ? cVar622 : null).f;
        if (djw0Var22 == null) {
        }
        VoipChatInfo voipChatInfo322 = L.B;
        return new ca9.c(callId, callMemberId522, dialog, (Set) set1522, list422, keySet322, set, C22, (Set) linkedHashSet42, z1622, collection222, z18, (Map) hashMap622, (Set) set1622, (Set) set1722, (Set) a722, (Set) set1822, (Set) set1922, (Set) set2022, (Map) map422, (Map) map522, (Map) map622, z5, true, booleanValue, z5, z1922, (Set) set2122, (Set) set2222, callMemberId622, callMemberId722, z2022, z14, z2, p222, z17, z15, j422, z21, voipChatInfo322 != null ? voipChatInfo322.g : null, 134217728);
    }
}
