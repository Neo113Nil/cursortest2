package defpackage;

import com.yandex.plus.pay.internal.di.b;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class lbd0 {
    public final /* synthetic */ hhw a;

    public lbd0(hhw hhwVar) {
        this.a = hhwVar;
    }

    public final hio a() {
        String str;
        String uuid = UUID.randomUUID().toString();
        long currentTimeMillis = System.currentTimeMillis();
        Long id = ((lj) ((b) this.a.a).t.h.getValue()).getId();
        if (id == null || (str = id.toString()) == null) {
            str = "no_value";
        }
        return new hio(uuid, currentTimeMillis, str);
    }
}
