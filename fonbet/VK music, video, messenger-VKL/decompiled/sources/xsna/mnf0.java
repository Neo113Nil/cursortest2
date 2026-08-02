package xsna;

import com.vk.reefton.ReefEvent;

/* compiled from: extensions.kt */
/* loaded from: classes5.dex */
public final class mnf0 implements izs {
    public static final mnf0 c = new mnf0(0);
    public static final mnf0 d = new mnf0(1);
    public final /* synthetic */ int b;

    public /* synthetic */ mnf0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(obj instanceof ReefEvent.h);
            default:
                throw ((Throwable) obj);
        }
    }
}
