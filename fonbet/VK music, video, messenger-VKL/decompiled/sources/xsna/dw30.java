package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.SearchMode;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.search.SearchEntrypoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.ij20;

/* compiled from: MsgSearchApiCmd.kt */
/* loaded from: classes2.dex */
public final class dw30 extends nx2<ccq<a, Pair<? extends a, ? extends ipm>>> {
    public final CharSequence b;
    public final SearchMode c;
    public final int d;
    public final int e;
    public final Long f;
    public final Peer g;
    public final Peer h;
    public final boolean i;
    public final boolean j;
    public final String k;
    public final String l;
    public final SearchEntrypoint m;

    /* compiled from: MsgSearchApiCmd.kt */
    public interface a extends dux0 {

        /* compiled from: MsgSearchApiCmd.kt */
        /* renamed from: xsna.dw30$a$a, reason: collision with other inner class name */
        public static final class C2765a implements a {
            public final List<zpp<com.vk.im.engine.models.dialogs.a>> a;
            public final ProfilesSimpleInfo b;
            public final boolean c;
            public final f1e0 d;

            public C2765a(List<zpp<com.vk.im.engine.models.dialogs.a>> list, ProfilesSimpleInfo profilesSimpleInfo, boolean z, f1e0 f1e0Var) {
                this.a = list;
                this.b = profilesSimpleInfo;
                this.c = z;
                this.d = f1e0Var;
            }

            @Override // xsna.dw30.a
            public final ProfilesSimpleInfo b() {
                return this.b;
            }

            @Override // xsna.dux0
            public final f1e0 c() {
                return this.d;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2765a)) {
                    return false;
                }
                C2765a c2765a = (C2765a) obj;
                return epx.f(this.a, c2765a.a) && epx.f(this.b, c2765a.b) && this.c == c2765a.c && epx.f(this.d, c2765a.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + qoy.b(io.reactivex.rxjava3.subjects.c.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
            }

            public final String toString() {
                return "Dialogs(dialogs=" + this.a + ", profilesInfo=" + this.b + ", fullResultForPeers=" + this.c + ", requestedProfiles=" + this.d + ')';
            }
        }

        /* compiled from: MsgSearchApiCmd.kt */
        public static final class b implements a, cux0 {
            public final Map<Long, com.vk.im.engine.models.dialogs.a> a;
            public final ProfilesSimpleInfo b;
            public final List<Msg> c;
            public final boolean d;
            public final f1e0 e;
            public final Set<Long> f;

            /* JADX WARN: Multi-variable type inference failed */
            public b(Map<Long, com.vk.im.engine.models.dialogs.a> map, ProfilesSimpleInfo profilesSimpleInfo, List<? extends Msg> list, boolean z, f1e0 f1e0Var, Set<Long> set) {
                this.a = map;
                this.b = profilesSimpleInfo;
                this.c = list;
                this.d = z;
                this.e = f1e0Var;
                this.f = set;
            }

            @Override // xsna.cux0
            public final Set<Long> a() {
                return this.f;
            }

            @Override // xsna.dw30.a
            public final ProfilesSimpleInfo b() {
                return this.b;
            }

            @Override // xsna.dux0
            public final f1e0 c() {
                return this.e;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f);
            }

            public final int hashCode() {
                return this.f.hashCode() + ((this.e.hashCode() + qoy.b(fw3.a(io.reactivex.rxjava3.subjects.c.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Messages(msgsDialogs=");
                sb.append(this.a);
                sb.append(", profilesInfo=");
                sb.append(this.b);
                sb.append(", messages=");
                sb.append(this.c);
                sb.append(", fullResultForMsgs=");
                sb.append(this.d);
                sb.append(", requestedProfiles=");
                sb.append(this.e);
                sb.append(", requestedDialogs=");
                return ur.c(sb, this.f, ')');
            }
        }

        ProfilesSimpleInfo b();
    }

    /* compiled from: MsgSearchApiCmd.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SearchMode.values().length];
            try {
                iArr[SearchMode.MESSAGES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchMode.PEERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SearchMode.CHANNELS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SearchEntrypoint.values().length];
            try {
                iArr2[SearchEntrypoint.IM_SEARCH_CHATS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[SearchEntrypoint.SEARCH_CHATS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[SearchEntrypoint.SEARCH_DIALOGS_COMPONENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[SearchEntrypoint.SEARCH_INVITE_DONS_TO_CHAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[SearchEntrypoint.SEARCH_INVITE_TO_CHAT.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[SearchEntrypoint.SEARCH_DIALOG_TO_SHARE.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[SearchEntrypoint.SEARCH_MSGS_IN_DIALOG.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[SearchEntrypoint.SEARCH_ARCHIVED_CHATS.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[SearchEntrypoint.SEARCH_FILTER_UNREAD_DIALOGS.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[SearchEntrypoint.SEARCH_FILTER_REQUESTS_DIALOGS.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[SearchEntrypoint.SEARCH_FILTER_BUSINESS_DIALOGS.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[SearchEntrypoint.SEARCH_FILTER_ALL_DIALOGS.ordinal()] = 12;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[SearchEntrypoint.SEARCH_FILTER_ARCHIVE_DIALOGS.ordinal()] = 13;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[SearchEntrypoint.CALLS.ordinal()] = 14;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[SearchEntrypoint.UNKNOWN.ordinal()] = 15;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public dw30(CharSequence charSequence, SearchMode searchMode, int i, int i2, Long l, Peer peer, Peer peer2, boolean z, boolean z2, String str, String str2, SearchEntrypoint searchEntrypoint) {
        this.b = charSequence;
        this.c = searchMode;
        this.d = i;
        this.e = i2;
        this.f = l;
        this.g = peer;
        this.h = peer2;
        this.i = z;
        this.j = z2;
        this.k = str;
        this.l = str2;
        this.m = searchEntrypoint;
    }

    @Override // xsna.nx2
    public final ccq<a, Pair<? extends a, ? extends ipm>> f(l7r0 l7r0Var) {
        a bVar;
        String str = l7r0Var.a.g;
        int i = b.$EnumSwitchMapping$0[this.c.ordinal()];
        if (i == 1) {
            ij20 g = g("messages.search", str, new lwh(this, 29));
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ProfilesSimpleInfo profilesSimpleInfo = new ProfilesSimpleInfo();
            f1e0 f1e0Var = new f1e0();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            hw30 hw30Var = new hw30(arrayList, arrayList2, profilesSimpleInfo, f1e0Var, linkedHashSet);
            bz2.k(g, hw30Var, new l49(l7r0Var, g, hw30Var, 7));
            int size = arrayList.size();
            int i2 = this.d;
            int min = Math.min(size, i2);
            int e = on00.e(c5g.u(arrayList2, 10));
            if (e < 16) {
                e = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(e);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                linkedHashMap.put(Long.valueOf(((com.vk.im.engine.models.dialogs.a) next).a), next);
            }
            bVar = new a.b(linkedHashMap, profilesSimpleInfo, arrayList.subList(0, min), arrayList.size() < i2 + 1, f1e0Var, linkedHashSet);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalArgumentException("SearchMode.CHANNELS mode is not supported");
            }
            ij20 g2 = g("messages.searchConversations", str, new kdw(this, 5));
            gw30 gw30Var = new gw30(this);
            bVar = (a) bz2.k(g2, gw30Var, new defpackage.a0(l7r0Var, g2, gw30Var, 4));
        }
        return new tbg0(bVar, this.j, new ew30(2, this, dw30.class, "unwrapProfiles", "unwrapProfiles(Lcom/vk/im/engine/internal/api_commands/messages/MsgSearchApiCmd$Result;Lcom/vk/im/engine/models/ProfilesSimpleInfo;)Lcom/vk/im/engine/internal/api_commands/messages/MsgSearchApiCmd$Result;", 0), new fw30(2, this, dw30.class, "unwrapDialogs", "unwrapDialogs(Lcom/vk/im/engine/internal/api_commands/messages/MsgSearchApiCmd$Result;Lcom/vk/im/engine/models/EntityMap;)Lkotlin/Pair;", 0));
    }

    public final ij20 g(String str, String str2, izs<? super ij20.a, ? extends ij20.a> izsVar) {
        String str3;
        ij20.a aVar = new ij20.a();
        aVar.d = str2;
        aVar.c = str;
        aVar.b(CampaignEx.JSON_KEY_AD_Q, this.b.toString());
        aVar.f.put("count", Integer.valueOf(this.d + 1).toString());
        aVar.b("lang", this.k);
        aVar.j("skip_empty", this.i);
        Peer peer = this.h;
        peer.getClass();
        if (peer.Ab(Peer.Type.GROUP)) {
            aVar.f.put("group_id", Long.valueOf(peer.d).toString());
        }
        String str4 = this.l;
        if (str4 != null) {
            aVar.b("search_quid", str4);
        }
        SearchEntrypoint searchEntrypoint = this.m;
        if (searchEntrypoint != null) {
            switch (b.$EnumSwitchMapping$1[searchEntrypoint.ordinal()]) {
                case 1:
                    str3 = "im_search_dialogs";
                    break;
                case 2:
                    str3 = "search_dialogs";
                    break;
                case 3:
                    str3 = "search_dialogs_component";
                    break;
                case 4:
                    str3 = "search_invite_dons_to_chat";
                    break;
                case 5:
                    str3 = "search_invite_to_chat";
                    break;
                case 6:
                    str3 = "search_dialog_to_share";
                    break;
                case 7:
                    str3 = "search_msgs_in_dialog";
                    break;
                case 8:
                    str3 = "search_archived_dialogs";
                    break;
                case 9:
                    str3 = "search_filter_unread_dialogs";
                    break;
                case 10:
                    str3 = "search_filter_requests_dialogs";
                    break;
                case 11:
                    str3 = "search_filter_business_dialogs";
                    break;
                case 12:
                    str3 = "search_filter_all_dialogs";
                    break;
                case 13:
                    str3 = "search_filter_archive_dialogs";
                    break;
                case 14:
                    str3 = "calls";
                    break;
                case 15:
                    str3 = "unknown";
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            aVar.b("screen_ref", str3);
        }
        return izsVar.invoke(aVar).l(this.j).c();
    }
}
