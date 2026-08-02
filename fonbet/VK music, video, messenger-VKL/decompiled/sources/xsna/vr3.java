package xsna;

import com.vk.notifications.core.item.NotificationImage;
import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes3.dex */
public final class vr3 implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ List c;

    public vr3(List list) {
        this.c = list;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.get(((Number) obj).intValue());
                return null;
            default:
                return NotificationImage.class;
        }
    }

    public vr3(gz30 gz30Var, List list) {
        this.c = list;
    }
}
