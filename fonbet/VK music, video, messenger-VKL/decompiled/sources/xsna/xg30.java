package xsna;

import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.vk.im.ui.reporters.ShareType;
import com.vk.metrics.eventtracking.Event;
import kotlin.Pair;
import ru.ok.android.webrtc.signaling.transport.SignalingTransport;
import xsna.ug30;

/* compiled from: MsgActionReporter.kt */
/* loaded from: classes2.dex */
public final class xg30 {
    public static final Object a = pn00.k(new Pair(ug30.q.a, "reply"), new Pair(ug30.t.a, SignalingTransport.URL_TYPE_RETRY), new Pair(ug30.c.a, "copy"), new Pair(ug30.i.a, "download_photo"), new Pair(ug30.j.a, "edit"), new Pair(ug30.l.a, "edit_transcription"), new Pair(ug30.f.a, "copy_transcription"), new Pair(ug30.m.a, ToolBar.FORWARD), new Pair(ug30.r.a, "direct_reply"), new Pair(ug30.p.a, "pin"), new Pair(ug30.b0.a, "unpin"), new Pair(ug30.g.a, "delete_for_me"), new Pair(ug30.h.a, "delete_for_everyone"), new Pair(ug30.a0.a, "translate"), new Pair(ug30.d0.a, "reacted_peers"), new Pair(ug30.n.a, "who_read_message"), new Pair(ug30.e0.a, "write_restriction"), new Pair(ug30.s.a, "report"), new Pair(new ug30.w(true), "share_file"), new Pair(new ug30.x(true), "share_files"), new Pair(ug30.y.a, "share_to_story"));

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static void a(ug30 ug30Var, long j, boolean z) {
        String str = (String) a.get(ug30Var);
        if (str == null) {
            com.vk.metrics.eventtracking.b.a.q(new IllegalArgumentException("Unknown action=" + ug30Var));
            return;
        }
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a aVar = new Event.a();
        aVar.g("vkm_message_context_menu_select");
        aVar.c("action", str);
        aVar.a(Boolean.valueOf(z), "from_popup");
        aVar.b("peer_id", Long.valueOf(j));
        aVar.i("StatlogTracker");
        bVar.k(aVar.e());
    }

    public static void b(ShareType shareType) {
        if (shareType == ShareType.BUTTON) {
            com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
            el3 el3Var = Event.b;
            Event.a aVar = new Event.a();
            aVar.g("IM.MSG_ACTION.SHARE_BUTTON");
            aVar.i("StatlogTracker");
            bVar.k(aVar.e());
        }
    }
}
