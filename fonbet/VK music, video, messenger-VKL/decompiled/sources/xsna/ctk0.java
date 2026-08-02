package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.external.AudioTrack;

/* compiled from: State.kt */
/* loaded from: classes2.dex */
public final class ctk0 {
    public boolean a;
    public Peer b;
    public Msg c;
    public ProfilesInfo d;
    public AudioTrack e;
    public sxv f;
    public uxv g;

    public ctk0() {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        this.b = Peer.Unknown.e;
        this.c = new MsgFromUser();
        this.d = new ProfilesInfo();
    }
}
