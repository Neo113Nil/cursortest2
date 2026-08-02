package defpackage;

import com.yandex.go.scooters.domain.c;
import java.util.ArrayList;

/* loaded from: classes13.dex */
public final class hxm0 extends ad5 {
    public final c x;
    public ArrayList y;
    public boolean z;

    public hxm0(c cVar) {
        super(exm0.class);
        this.x = cVar;
        this.y = new ArrayList();
    }

    public final boolean Kg() {
        ArrayList<jxm0> arrayList = this.y;
        if (arrayList == null || !arrayList.isEmpty()) {
            for (jxm0 jxm0Var : arrayList) {
                if (!jxm0Var.d && jxm0Var.c) {
                    break;
                }
            }
        }
        if (!this.y.isEmpty()) {
            return true;
        }
        return this.z;
    }
}
