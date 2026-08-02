package defpackage;

import android.os.Looper;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.internal.entities.SeenMarkerEntity;
import java.util.HashMap;

/* loaded from: classes15.dex */
public final class nta0 {
    public final n5t0 a;
    public final h3y b;
    public final l7q0 c;
    public final Looper d = Looper.myLooper();
    public final HashMap e = new HashMap();
    public final p370 f;
    public boolean g;

    public nta0(n5t0 n5t0Var, at2 at2Var, Moshi moshi, h3y h3yVar, l7q0 l7q0Var) {
        this.a = n5t0Var;
        this.b = h3yVar;
        this.c = l7q0Var;
        this.f = new p370(at2Var, "seen_marker", new uk10(moshi));
    }

    public final void a(String str, SeenMarkerEntity seenMarkerEntity) {
        int i = 1;
        z83.h(null, seenMarkerEntity.a >= 0);
        x08 f = this.a.f(new j0b(i, this, seenMarkerEntity, str));
        HashMap hashMap = this.e;
        x08 x08Var = (x08) hashMap.get(str);
        if (x08Var != null) {
            x08Var.cancel();
        }
        hashMap.put(str, f);
    }
}
