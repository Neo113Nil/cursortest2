package xsna;

import com.vk.audiomsg.player.Speed;
import com.vk.log.L;
import com.vk.metrics.eventtracking.Event;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AudioMsgPlayerReporter.kt */
/* loaded from: classes2.dex */
public final class qr4 {
    public static final List<String> a = e43.l("LoggingTracker", "StatlogTracker");

    public static String a(bgk0 bgk0Var) {
        lza0 lza0Var = bgk0Var instanceof lza0 ? (lza0) bgk0Var : null;
        if (lza0Var != null) {
            return lza0Var.b;
        }
        return null;
    }

    public static void b(Throwable th) {
        L.i(th);
    }

    public static void c(lza0 lza0Var, ur4 ur4Var) {
        String a2 = a(lza0Var);
        if (a2 == null) {
            return;
        }
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a b = h5s.b("audio_message_player_view");
        b.b("peer_id", Long.valueOf(ur4Var.d));
        b.b("conversation_message_id", Integer.valueOf(ur4Var.e));
        StringBuilder sb = new StringBuilder();
        sb.append(ur4Var.c);
        sb.append('_');
        sb.append(ur4Var.b);
        b.c("audio_message_id", sb.toString());
        b.c("source", a2);
        b.c("action", "go_to_message");
        com.vk.movika.sdk.base.model.n.c(b, a, bVar);
    }

    public static void d(bgk0 bgk0Var, ur4 ur4Var) {
        String a2 = a(bgk0Var);
        if (a2 == null) {
            return;
        }
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a b = h5s.b("audio_message_player_view");
        b.b("peer_id", Long.valueOf(ur4Var.d));
        b.b("conversation_message_id", Integer.valueOf(ur4Var.e));
        StringBuilder sb = new StringBuilder();
        sb.append(ur4Var.c);
        sb.append('_');
        sb.append(ur4Var.b);
        b.c("audio_message_id", sb.toString());
        b.c("source", a2);
        b.c("action", "pause");
        com.vk.movika.sdk.base.model.n.c(b, a, bVar);
    }

    public static void e(bgk0 bgk0Var, ur4 ur4Var, Speed speed) {
        int i;
        long j = ur4Var.b;
        long j2 = ur4Var.c;
        int i2 = ur4Var.e;
        long j3 = ur4Var.d;
        String a2 = a(bgk0Var);
        if (a2 == null) {
            return;
        }
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a b = h5s.b("audio_message_play");
        b.b("peer_id", Long.valueOf(j3));
        b.b("conversation_message_id", Integer.valueOf(i2));
        b.c("source", a2);
        StringBuilder sb = new StringBuilder();
        sb.append(j2);
        sb.append('_');
        sb.append(j);
        b.c("audio_message_id", sb.toString());
        int i3 = Speed.b.$EnumSwitchMapping$0[speed.ordinal()];
        if (i3 == 1) {
            i = 100;
        } else if (i3 == 2) {
            i = 150;
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = 200;
        }
        b.b("audio_message_playback_rate", Integer.valueOf(i));
        List<String> list = a;
        b.j(list);
        bVar.k(b.e());
        Event.a aVar = new Event.a();
        aVar.g("audio_message_player_view");
        aVar.b("peer_id", Long.valueOf(j3));
        aVar.b("conversation_message_id", Integer.valueOf(i2));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j2);
        sb2.append('_');
        sb2.append(j);
        aVar.c("audio_message_id", sb2.toString());
        aVar.c("source", a2);
        aVar.c("action", "play");
        aVar.j(list);
        bVar.k(aVar.e());
    }
}
