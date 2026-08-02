package xsna;

import com.ironsource.AbstractC4308f3;
import com.ironsource.Ca;
import com.ironsource.L2;
import com.vk.log.L;
import com.vk.music.offline.api.domain.download.DownloadType;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.api.id.CallId;
import com.vk.voip.b;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.NoWhenBranchMatchedException;
import xsna.bx10;
import xsna.sg40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class fv8 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ fv8(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dhw0 dhw0Var;
        switch (this.b) {
            case 0:
                Ca.a((Ca) this.c, (L2) this.d, (AbstractC4308f3) this.e, (Long) this.f);
                return;
            case 1:
                ((bx10.b.InterfaceC2630b) this.d).a((bx10.b) this.c, (vw10) this.e, (ArrayList) this.f);
                return;
            case 2:
                String str = (String) this.c;
                sg40 sg40Var = (sg40) this.d;
                String str2 = (String) this.e;
                String str3 = (String) this.f;
                int i = sg40.a.$EnumSwitchMapping$0[(brm0.B(str, "chapter_download_", false) ? DownloadType.AUDIO_BOOK_CHAPTER : brm0.B(str, "episode_download_", false) ? DownloadType.PODCAST_EPISODE : DownloadType.MUSIC_TRACK).ordinal()];
                if (i == 1) {
                    sg40Var.e.o(o25.a().c(), str2, str3);
                    return;
                }
                if (i != 2) {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sg40Var.j.w(o25.a().c(), str2, str3);
                    return;
                } else {
                    String U = brm0.B(str, "track_download_", false) ? drm0.U(str, "track_download_") : brm0.B(str, "chapter_download_", false) ? drm0.U(str, "chapter_download_") : brm0.B(str, "episode_download_", false) ? drm0.U(str, "episode_download_") : null;
                    if (U != null) {
                        sg40Var.g.f(o25.a().c(), U, str3);
                        return;
                    }
                    return;
                }
            default:
                CallId callId = (CallId) this.c;
                fqw0 fqw0Var = (fqw0) this.d;
                sy5 sy5Var = (sy5) this.e;
                b.d dVar = (b.d) this.f;
                OKVoipEngine oKVoipEngine = OKVoipEngine.b;
                if (oKVoipEngine.w()) {
                    CopyOnWriteArraySet<CallId> copyOnWriteArraySet = OKVoipEngine.u;
                    if (copyOnWriteArraySet.contains(callId) || ((dhw0Var = OKVoipEngine.B) != null && fqw0Var.a.b == dhw0Var.b)) {
                        L.A("OKVoipEngine", "Call (" + callId + ") already accepted");
                        return;
                    }
                    if (OKVoipEngine.E.getConversation() == null) {
                        copyOnWriteArraySet.add(callId);
                        sy5Var.invoke(oKVoipEngine, new kt(callId, fqw0Var, dVar, 3));
                        return;
                    } else {
                        L.A("OKVoipEngine", "Call (" + callId + ") ignored because another call is in progress");
                        return;
                    }
                }
                return;
        }
    }
}
