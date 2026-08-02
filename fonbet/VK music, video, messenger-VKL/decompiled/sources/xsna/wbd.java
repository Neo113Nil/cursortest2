package xsna;

import com.vk.voip.OKVoipEngine;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class wbd implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ wbd(boolean z, int i) {
        this.b = i;
        this.c = z;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        boolean z;
        MediaMuteManager mediaMuteManager;
        switch (this.b) {
            case 0:
                if (this.c) {
                    z = true;
                } else {
                    g620.f().h().getClass();
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                OKVoipEngine.b.getClass();
                Conversation conversation = OKVoipEngine.E.getConversation();
                if (conversation != null && (mediaMuteManager = conversation.getMediaMuteManager()) != null) {
                    mediaMuteManager.setAudioPlayoutMuted(this.c);
                }
                return s3q0.a;
        }
    }
}
