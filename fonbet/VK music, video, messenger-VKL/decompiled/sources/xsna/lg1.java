package xsna;

import com.vk.dto.music.audiobook.AudioBookPerson;

/* compiled from: RxExt.kt */
/* loaded from: classes4.dex */
public final class lg1 implements izs {
    public static final lg1 c = new lg1(0);
    public static final lg1 d = new lg1(1);
    public static final lg1 e = new lg1(2);
    public final /* synthetic */ int b;

    public /* synthetic */ lg1(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(obj instanceof h7o0);
            case 1:
                return Boolean.valueOf(obj instanceof AudioBookPerson);
            default:
                if (obj != null) {
                    return (p980) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.vk.im.engine.models.events.OnMsgUpdateEvent");
        }
    }
}
