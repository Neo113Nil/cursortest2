package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.im.engine.models.messages.MsgFromChannel;

/* compiled from: _Sequences.kt */
/* loaded from: classes16.dex */
public final class igb0 implements izs {
    public static final igb0 c = new igb0(0);
    public static final igb0 d = new igb0(1);
    public final /* synthetic */ int b;

    public /* synthetic */ igb0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(obj instanceof MusicTrack);
            default:
                return Boolean.valueOf(obj instanceof MsgFromChannel);
        }
    }
}
