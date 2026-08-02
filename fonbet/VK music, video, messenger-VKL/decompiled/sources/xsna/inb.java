package xsna;

import com.vk.catalog2.common.dto.ui.UIBlockVideoUpload;

/* compiled from: RxExt.kt */
/* loaded from: classes2.dex */
public final class inb implements izs {
    public static final inb c = new inb(0);
    public static final inb d = new inb(1);
    public final /* synthetic */ int b;

    public /* synthetic */ inb(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                if (obj != null) {
                    return (za80) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.vk.im.engine.events.OnRevertReactionEvent");
            default:
                return Boolean.valueOf(obj instanceof UIBlockVideoUpload);
        }
    }
}
