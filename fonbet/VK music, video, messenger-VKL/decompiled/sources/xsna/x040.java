package xsna;

import android.content.Context;
import com.ironsource.X3;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachArtist;
import com.vk.dto.attaches.AttachAudio;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.attaches.AttachCurator;
import com.vk.dto.attaches.AttachDeleted;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.common.Peer;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.newsfeed.Owner;
import com.vk.im.engine.models.CallState;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.attaches.AttachCall;
import com.vk.im.engine.models.attaches.AttachLink;
import com.vk.im.engine.models.attaches.AttachPlaylist;
import com.vk.im.engine.models.attaches.AttachPoll;
import com.vk.im.engine.models.attaches.AttachStory;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.attaches.AttachVideoMsg;
import com.vk.im.engine.models.attaches.AttachWallReply;
import com.vk.im.engine.models.attaches.miniapp.AttachMiniApp;
import com.vk.im.engine.models.attaches.miniapp.MiniAppSnippetDataAttach;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vkontakte.android.R;
import java.util.List;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;
import kotlin.text.Regex;

/* compiled from: MsgToTextFormatter.kt */
/* loaded from: classes2.dex */
public final class x040 {
    public final Context a;
    public final Regex b = new Regex("\\r?\\n");
    public final String c = "  ";
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;

    /* compiled from: MsgToTextFormatter.kt */
    public static final class a {
        public final ProfilesSimpleInfo a;
        public final Peer b;

        public a(Peer peer, ProfilesSimpleInfo profilesSimpleInfo) {
            this.a = profilesSimpleInfo;
            this.b = peer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FormatParams(info=");
            sb.append(this.a);
            sb.append(", currentMember=");
            return eq.a(sb, this.b, ')');
        }
    }

    public x040(Context context) {
        this.a = context;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.d = msy.a(lazyThreadSafetyMode, new kk1(14));
        this.e = msy.a(lazyThreadSafetyMode, new wnh(this, 27));
        this.f = msy.a(lazyThreadSafetyMode, new nef(this, 21));
        this.g = msy.a(lazyThreadSafetyMode, new sim(this, 23));
        this.h = msy.a(lazyThreadSafetyMode, new atm(this, 21));
        this.i = msy.a(lazyThreadSafetyMode, new m1o(this, 22));
        this.j = msy.a(lazyThreadSafetyMode, new ob0(19));
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
    public final String a(List<? extends Msg> list, ProfilesSimpleInfo profilesSimpleInfo, Peer peer) {
        String sb;
        a aVar = new a(peer, profilesSimpleInfo);
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (Msg msg : list) {
            boolean z = list.size() > 1;
            if (msg == null) {
                sb = "…";
            } else if (msg instanceof MsgFromUser) {
                sb = c((MsgFromUser) msg, aVar, z, 0);
            } else {
                StringBuilder sb3 = new StringBuilder();
                ProfilesSimpleInfo profilesSimpleInfo2 = aVar.a;
                if (z) {
                    sb3.append(((DisplayNameFormatter) this.d.getValue()).b(msg.getFrom(), profilesSimpleInfo2) + ", " + ((bj30) this.e.getValue()).a(msg.g).toLowerCase(Locale.ROOT));
                    sb3.append("\n");
                }
                sb3.append(((com.vk.im.ui.formatters.b) this.f.getValue()).a(msg, profilesSimpleInfo2, null, com.vk.dto.common.a.b(aVar.b)));
                sb = sb3.toString();
            }
            sb2.append(sb);
            sb2.append("\n\n");
        }
        return drm0.p0(sb2).toString();
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, kotlin.Lazy] */
    public final String b(Attach attach, a aVar) {
        String str;
        String str2;
        str = "";
        if (attach instanceof AttachVideoMsg) {
            AttachVideoMsg attachVideoMsg = (AttachVideoMsg) attach;
            if (attachVideoMsg.m == 2) {
                return attachVideoMsg.r;
            }
            String title = attachVideoMsg.b.getTitle();
            return (title != null ? title : "").concat("\n");
        }
        if (attach instanceof AttachVideo) {
            AttachVideo attachVideo = (AttachVideo) attach;
            StringBuilder e = fw3.e(drm0.N(attachVideo.getTitle()) ? "" : attachVideo.getTitle().concat("\n"));
            e.append(d(attach, aVar));
            return e.toString();
        }
        if (attach instanceof AttachAudio) {
            StringBuilder sb = new StringBuilder();
            e14.a.getClass();
            sb.append((Object) e14.a(attach));
            sb.append(" — ");
            String str3 = ((AttachAudio) attach).b.d;
            sb.append(str3 != null ? str3 : "");
            return sb.toString();
        }
        if (attach instanceof AttachDoc) {
            lar larVar = lar.a;
            AttachDoc attachDoc = (AttachDoc) attach;
            long j = attachDoc.h;
            larVar.getClass();
            String a2 = lar.a(j);
            if (drm0.N(attachDoc.g)) {
                str2 = a2.concat("\n");
            } else {
                str2 = attachDoc.g + " • " + a2 + '\n';
            }
            StringBuilder e2 = fw3.e(str2);
            e2.append(d(attach, aVar));
            return e2.toString();
        }
        if (attach instanceof AttachWallReply) {
            AttachWallReply attachWallReply = (AttachWallReply) attach;
            StringBuilder e3 = fw3.e(drm0.N(attachWallReply.j) ? "" : ho8.a(new StringBuilder(), attachWallReply.j, '\n'));
            e3.append(d(attach, aVar));
            return e3.toString();
        }
        if (attach instanceof AttachLink) {
            AttachLink attachLink = (AttachLink) attach;
            StringBuilder e4 = fw3.e(drm0.N(attachLink.f) ? "" : ho8.a(new StringBuilder(), attachLink.f, '\n'));
            e4.append(attachLink.e);
            return e4.toString();
        }
        if (attach instanceof AttachPlaylist) {
            AttachPlaylist attachPlaylist = (AttachPlaylist) attach;
            StringBuilder e5 = fw3.e(drm0.N(attachPlaylist.getTitle()) ? "" : attachPlaylist.getTitle().concat("\n"));
            e5.append(d(attach, aVar));
            return e5.toString();
        }
        if (attach instanceof AttachArtist) {
            AttachArtist attachArtist = (AttachArtist) attach;
            StringBuilder e6 = fw3.e(drm0.N(attachArtist.c) ? "" : ho8.a(new StringBuilder(), attachArtist.c, '\n'));
            e6.append(d(attach, aVar));
            return e6.toString();
        }
        if (attach instanceof AttachCurator) {
            AttachCurator attachCurator = (AttachCurator) attach;
            StringBuilder e7 = fw3.e(drm0.N(attachCurator.c) ? "" : ho8.a(new StringBuilder(), attachCurator.c, '\n'));
            e7.append(d(attach, aVar));
            return e7.toString();
        }
        boolean z = attach instanceof AttachCall;
        Context context = this.a;
        if (z) {
            AttachCall attachCall = (AttachCall) attach;
            boolean f = epx.f(attachCall.f, aVar.b);
            String string = f ? context.getString(R.string.vkim_msg_list_call_outgoing) : context.getString(R.string.vkim_msg_list_call_incoming);
            CallState callState = attachCall.e;
            if (callState == CallState.ERROR) {
                str = context.getString(R.string.vkim_msg_list_call_error);
            } else if (callState == CallState.DONE) {
                str = ((coo) this.i.getValue()).a(attachCall.g);
            } else if (!f) {
                str = context.getString(R.string.vkim_msg_list_call_missed);
            } else if (f && callState == CallState.CANCELLED) {
                str = context.getString(R.string.vkim_msg_list_call_cancelled);
            } else if (f && callState == CallState.DECLINED) {
                str = context.getString(R.string.vkim_msg_list_call_declined);
            }
            return v1v.a('\n', string, str);
        }
        if (attach instanceof AttachPoll) {
            return d(attach, aVar);
        }
        if (attach instanceof AttachDeleted) {
            return ((com.vk.im.ui.formatters.a) this.h.getValue()).a((AttachDeleted) attach);
        }
        if (attach instanceof AttachMiniApp) {
            AttachMiniApp attachMiniApp = (AttachMiniApp) attach;
            StringBuilder e8 = fw3.e(drm0.N(attachMiniApp.c) ? "" : ho8.a(new StringBuilder(), attachMiniApp.c, '\n'));
            e8.append(d(attach, aVar));
            return e8.toString();
        }
        if (attach instanceof AttachAudioMsg) {
            AttachAudioMsg attachAudioMsg = (AttachAudioMsg) attach;
            if (attachAudioMsg.m == 2) {
                return attachAudioMsg.l;
            }
        } else {
            if (!(attach instanceof MiniAppSnippetDataAttach)) {
                return d(attach, aVar);
            }
            ApiApplication apiApplication = ((MiniAppSnippetDataAttach) attach).h;
            if (apiApplication != null) {
                String str4 = apiApplication.c;
                int i = apiApplication.zb().booleanValue() ? R.string.vkim_text_game_action_attach : R.string.vkim_text_app_action_attach;
                if (str4 != null && !drm0.N(str4)) {
                    return context.getString(i, str4);
                }
            }
        }
        return "";
    }

    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    public final String c(com.vk.im.engine.models.messages.a aVar, final a aVar2, boolean z, final int i) {
        String str;
        final StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append(e(i, ((DisplayNameFormatter) this.d.getValue()).b(aVar.getFrom(), aVar2.a) + ", " + ((bj30) this.e.getValue()).a(aVar.C()).toLowerCase(Locale.ROOT)));
            sb.append("\n");
        }
        boolean p3 = aVar.p3();
        ?? r3 = this.g;
        if (p3) {
            String e = e(i + 1, air.b(']', X3.j.d, ((en30) r3.getValue()).b(aVar, NestedMsg.Type.REPLY)));
            sb.append("\n");
            sb.append(e);
            sb.append("\n");
            aVar.tb(new v040(this, aVar2, i, sb));
        }
        if (aVar.k8()) {
            sb.append(e(i, ine0.q(aVar.getBody()).toString()));
            sb.append("\n");
        }
        if (aVar.g8()) {
            String str2 = "";
            int i2 = 0;
            String c = (z || aVar.k8() || aVar.K0().size() > 1 || aVar.D3(AttachStory.class, false)) ? ((com.vk.im.ui.formatters.a) this.h.getValue()).c(aVar.K0()) : "";
            if (!aVar.E7()) {
                str = "";
            } else if (aVar.K0().size() == 1) {
                str = b(aVar.K0().get(0), aVar2);
            } else {
                List<Attach> K0 = aVar.K0();
                if (K0.size() == bu00.b(K0, AttachDeleted.class)) {
                    str = this.a.getString(R.string.vkim_msg_etc_deleted);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    int size = aVar.K0().size();
                    while (i2 < size) {
                        int i3 = i2 + 1;
                        jax0.a(i3, ". ", b(aVar.K0().get(i2), aVar2), "\n", sb2);
                        i2 = i3;
                    }
                    str = sb2.toString();
                }
            }
            if (!drm0.N(c) && !drm0.N(str)) {
                str2 = X3.j.d + ((Object) c) + "]\n" + str;
            } else if (!drm0.N(c)) {
                str2 = X3.j.d + ((Object) c) + ']';
            } else if (!drm0.N(str)) {
                str2 = str;
            }
            sb.append(e(i, str2));
            sb.append("\n");
        }
        if (aVar.db()) {
            String e2 = e(i + 1, air.b(']', X3.j.d, ((en30) r3.getValue()).b(aVar, NestedMsg.Type.FWD)));
            sb.append("\n");
            sb.append(e2);
            sb.append("\n");
            aVar.wb(new izs() { // from class: xsna.w040
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    int i4 = i + 1;
                    jh.f(sb, x040.this.c((NestedMsg) obj, aVar2, true, i4), "\n", "\n");
                    return s3q0.a;
                }
            });
        }
        return drm0.r0(sb.toString()).toString();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    public final String d(Attach attach, a aVar) {
        Group group = (Group) aVar.a.e.get(Long.valueOf(fkq0.a(attach.q()).b));
        return ((j24) this.j.getValue()).a(new Owner(null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, group != null ? group.u : null, false, 3145727, null), attach);
    }

    public final String e(int i, String str) {
        if (i < 1) {
            return str;
        }
        String x = brm0.x(i, this.c);
        StringBuilder e = fw3.e(x);
        e.append(this.b.g(str, "\n" + x));
        return e.toString();
    }
}
