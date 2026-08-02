package xsna;

import com.vk.im.engine.models.messages.Msg;

/* compiled from: OnOpenAudioMsgTranscriptEvent.kt */
/* loaded from: classes2.dex */
public final class v980 extends sxp {
    public final Msg b;

    public v980(Msg msg) {
        this.b = msg;
    }

    @Override // xsna.sxp
    public final Object a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v980) && epx.f(this.b, ((v980) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "OnOpenAudioMsgTranscriptEvent(msg=" + this.b + ')';
    }
}
