package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.search.SearchEntrypoint;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ij20;

/* compiled from: UsersSearchApiCmd.kt */
/* loaded from: classes2.dex */
public final class o1r0 extends nx2<a> {
    public final String b;
    public final int c;
    public final int d;
    public final Peer e;
    public final String f;
    public final String g;
    public final SearchEntrypoint h;

    /* compiled from: UsersSearchApiCmd.kt */
    public static final class a {
        public final int a;
        public final ArrayList b;

        public a(int i, ArrayList arrayList) {
            this.a = i;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Result(totalCount=");
            sb.append(this.a);
            sb.append(", items=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.b);
        }
    }

    /* compiled from: UsersSearchApiCmd.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SearchEntrypoint.values().length];
            try {
                iArr[SearchEntrypoint.IM_SEARCH_CHATS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchEntrypoint.SEARCH_CHATS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SearchEntrypoint.SEARCH_DIALOGS_COMPONENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SearchEntrypoint.SEARCH_INVITE_DONS_TO_CHAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SearchEntrypoint.SEARCH_INVITE_TO_CHAT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SearchEntrypoint.SEARCH_DIALOG_TO_SHARE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SearchEntrypoint.SEARCH_MSGS_IN_DIALOG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SearchEntrypoint.SEARCH_ARCHIVED_CHATS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SearchEntrypoint.SEARCH_FILTER_UNREAD_DIALOGS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SearchEntrypoint.SEARCH_FILTER_REQUESTS_DIALOGS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SearchEntrypoint.SEARCH_FILTER_BUSINESS_DIALOGS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[SearchEntrypoint.SEARCH_FILTER_ALL_DIALOGS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[SearchEntrypoint.SEARCH_FILTER_ARCHIVE_DIALOGS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[SearchEntrypoint.CALLS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[SearchEntrypoint.UNKNOWN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public o1r0(String str, int i, int i2, Peer peer, String str2, String str3, SearchEntrypoint searchEntrypoint) {
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = peer;
        this.f = str2;
        this.g = str3;
        this.h = searchEntrypoint;
    }

    @Override // xsna.nx2
    public final a f(l7r0 l7r0Var) {
        String str;
        ij20.a aVar = new ij20.a();
        aVar.d = l7r0Var.a.g;
        aVar.c = "users.search";
        aVar.f.put(SignalingProtocol.KEY_OFFSET, Integer.valueOf(this.c).toString());
        aVar.f.put("count", Integer.valueOf(this.d).toString());
        aVar.b(CampaignEx.JSON_KEY_AD_Q, this.b);
        aVar.b("search_quid", this.g);
        switch (b.$EnumSwitchMapping$0[this.h.ordinal()]) {
            case 1:
                str = "im_search_dialogs";
                break;
            case 2:
                str = "search_dialogs";
                break;
            case 3:
                str = "search_dialogs_component";
                break;
            case 4:
                str = "search_invite_dons_to_chat";
                break;
            case 5:
                str = "search_invite_to_chat";
                break;
            case 6:
                str = "search_dialog_to_share";
                break;
            case 7:
                str = "search_msgs_in_dialog";
                break;
            case 8:
                str = "search_archived_dialogs";
                break;
            case 9:
                str = "search_filter_unread_dialogs";
                break;
            case 10:
                str = "search_filter_requests_dialogs";
                break;
            case 11:
                str = "search_filter_business_dialogs";
                break;
            case 12:
                str = "search_filter_all_dialogs";
                break;
            case 13:
                str = "search_filter_archive_dialogs";
                break;
            case 14:
                str = "calls";
                break;
            case 15:
                str = "unknown";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        aVar.b("screen_ref", str);
        aVar.b("fields", ky2.b);
        Peer peer = this.e;
        peer.getClass();
        if (!peer.Ab(Peer.Type.UNKNOWN)) {
            aVar.f.put("group_id", Long.valueOf(peer.d).toString());
        }
        String str2 = this.f;
        if (str2 != null && str2.length() != 0) {
            aVar.b("from_list", str2);
        }
        return (a) l7r0Var.d(new ij20(aVar), p1r0.b);
    }
}
