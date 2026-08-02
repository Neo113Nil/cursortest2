package xsna;

import android.widget.TextView;
import android.widget.Toast;
import com.vk.log.L;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.ui.dumps.CollectDumpDuration;
import com.vkontakte.android.R;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.dev.DebugManager;
import ru.ok.android.externcalls.sdk.dev.MediaDumpManager;
import xsna.p4x0;

/* compiled from: CollectDumpFeature.kt */
/* loaded from: classes7.dex */
public final class f4g {
    public final g4g a;
    public final io.reactivex.rxjava3.disposables.b b;
    public j4g c;
    public n4g d;

    /* compiled from: CollectDumpFeature.kt */
    public static final class a implements MediaDumpManager.RemoteMediaDumpRequestListener {
        @Override // ru.ok.android.externcalls.sdk.dev.MediaDumpManager.RemoteMediaDumpRequestListener
        public final void onRequestSent() {
            i0q0.f(new f4(9));
        }
    }

    public f4g(g4g g4gVar) {
        this.a = g4gVar;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.b = bVar;
        this.c = new j4g(0);
        com.vk.voip.ui.c.b.getClass();
        bVar.b(io.reactivex.rxjava3.kotlin.c.f(2, com.vk.voip.ui.c.G.b.U(new oq80(new l4k0(16), 16)), null, new qp3(L.a, 2), new oce(this, 3)));
    }

    public final void a() {
        n4g n4gVar = this.d;
        if (n4gVar != null) {
            j4g j4gVar = this.c;
            n4gVar.c.b(j4gVar.a, true);
            n4gVar.d.b(j4gVar.b, true);
            TextView textView = n4gVar.e;
            CollectDumpDuration collectDumpDuration = j4gVar.c;
            textView.setText(collectDumpDuration.h());
            n4gVar.f.setProgress(collectDumpDuration.ordinal());
            n4gVar.h.setEnabled(!j4gVar.d);
        }
    }

    public final void b(boolean z) {
        DebugManager debugManager;
        MediaDumpManager mediaDumpManager;
        j4g j4gVar = this.c;
        if (!j4gVar.a && !j4gVar.b && !z) {
            n4g n4gVar = this.d;
            if (n4gVar != null) {
                Toast.makeText(n4gVar.a.getContext(), R.string.voip_settings_dump_submit_nothing_to_dump_err, 0).show();
                return;
            }
            return;
        }
        if (z) {
            com.vk.voip.ui.c.b.getClass();
            p4x0 p4x0Var = com.vk.voip.ui.c.G;
            int j = this.c.c.j();
            p4x0Var.getClass();
            L.e("VoipViewModelAudioDumpDelegate", "Starting multi-track audio dump by user request");
            p4x0Var.f(new p4x0.a(j, 1));
        } else {
            OKVoipEngine oKVoipEngine = OKVoipEngine.b;
            int j2 = j4gVar.c.j();
            j4g j4gVar2 = this.c;
            boolean z2 = j4gVar2.a;
            boolean z3 = j4gVar2.b;
            a aVar = new a();
            oKVoipEngine.getClass();
            Conversation conversation = OKVoipEngine.E.getConversation();
            if (conversation != null && (debugManager = conversation.getDebugManager()) != null && (mediaDumpManager = debugManager.getMediaDumpManager()) != null) {
                mediaDumpManager.requestMediaDump(j2, z2, z3, aVar);
            }
        }
        this.a.invoke();
    }
}
