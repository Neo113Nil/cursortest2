package xsna;

import android.content.Context;
import com.vk.api.sdk.auth.AccountProfileType;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.EmptyList;
import xsna.c2r0;

/* compiled from: SilentAuthByLoginRepositoryImpl.kt */
/* loaded from: classes5.dex */
public final class xmj0 implements wmj0 {
    public final bpn0 a;
    public final CopyOnWriteArraySet<String> b = new CopyOnWriteArraySet<>();

    public xmj0(bpn0 bpn0Var) {
        this.a = bpn0Var;
    }

    @Override // xsna.wmj0
    public final List<i2q> a(Context context, String str) {
        if (this.b.contains(str)) {
            return EmptyList.b;
        }
        c2r0 c2r0Var = (c2r0) this.a.getValue();
        if (c2r0Var == null) {
            c2r0Var = c2r0.a.a;
        }
        List<c2r0.b> h = c2r0Var.h(context, true);
        ArrayList arrayList = new ArrayList();
        for (Object obj : h) {
            if (((c2r0.b) obj).i == AccountProfileType.NORMAL) {
                arrayList.add(obj);
            }
        }
        List<c2r0.b> H0 = j5g.H0(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(c5g.u(H0, 10));
        for (c2r0.b bVar : H0) {
            arrayList2.add(new i2q(bVar.a, bVar.g));
        }
        return arrayList2;
    }

    @Override // xsna.wmj0
    public final boolean b(String str) {
        return this.b.contains(str);
    }

    @Override // xsna.wmj0
    public final void c(String str) {
        this.b.add(str);
    }
}
