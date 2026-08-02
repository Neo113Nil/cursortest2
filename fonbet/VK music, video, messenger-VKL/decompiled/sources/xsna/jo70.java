package xsna;

import com.vk.voip.OKVoipEngine;
import ru.ok.android.externcalls.sdk.Conversation;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class jo70 implements gzs {
    public final /* synthetic */ boolean b;

    public /* synthetic */ jo70(boolean z) {
        this.b = z;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        wrj wrjVar = OKVoipEngine.E;
        if (!wrjVar.a()) {
            return s3q0.a;
        }
        OKVoipEngine.b.getClass();
        Conversation conversation = wrjVar.getConversation();
        if (conversation == null) {
            return s3q0.a;
        }
        conversation.getMicrophoneManager().setMicEnabled(this.b);
        OKVoipEngine.N(conversation, conversation.getMe());
        return s3q0.a;
    }
}
