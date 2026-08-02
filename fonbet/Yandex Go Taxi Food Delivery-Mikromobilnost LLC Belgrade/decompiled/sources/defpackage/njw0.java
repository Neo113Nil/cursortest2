package defpackage;

import android.content.Context;
import com.yandex.go.taxi.order.support.ui.support_menu.adapter.a;
import java.util.Collections;
import kotlin.collections.EmptyList;

/* loaded from: classes14.dex */
public final class njw0 extends bys {
    public final tls z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public njw0(Context context, pav pavVar, tls tlsVar) {
        super(r0, Collections.singletonList(new zxs(r1.a(), 0, r5, EmptyList.a, new he7(1, r10), null)));
        r3a r3aVar = new r3a(2, tlsVar);
        int i = a.T;
        g0c a = qoi0.a(mjw0.class);
        z2v0 z2v0Var = new z2v0(context, 3);
        k47 k47Var = new k47(pavVar, 3);
        this.z = tlsVar;
    }

    @Override // defpackage.bys
    public final boolean j(Object obj, Object obj2) {
        return jl40.l((mjw0) obj, (mjw0) obj2);
    }

    @Override // defpackage.bys
    public final boolean k(Object obj, Object obj2) {
        return jl40.l(((mjw0) obj).a, ((mjw0) obj2).a);
    }
}
