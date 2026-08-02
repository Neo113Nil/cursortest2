package defpackage;

import java.util.List;
import kotlin.collections.a;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes9.dex */
public final class nex extends kex {
    public final c j;
    public final List k;
    public final int l;
    public int m;

    public nex(sbx sbxVar, c cVar) {
        super(sbxVar, cVar, (String) null, 12);
        this.j = cVar;
        List J0 = a.J0(cVar.a.keySet());
        this.k = J0;
        this.l = J0.size() * 2;
        this.m = -1;
    }

    @Override // defpackage.kex, defpackage.w150
    public final String W(SerialDescriptor serialDescriptor, int i) {
        return (String) this.k.get(i / 2);
    }

    @Override // defpackage.kex, defpackage.c8
    public final b Y(String str) {
        return this.m % 2 == 0 ? qcx.c(str) : (b) kotlin.collections.b.g(str, this.j);
    }

    @Override // defpackage.kex, defpackage.c8
    public final b a0() {
        return this.j;
    }

    @Override // defpackage.kex, defpackage.c8, defpackage.n7x0, defpackage.sjd
    public final void c(SerialDescriptor serialDescriptor) {
    }

    @Override // defpackage.kex
    /* renamed from: d0 */
    public final c a0() {
        return this.j;
    }

    @Override // defpackage.kex, defpackage.sjd
    public final int v(SerialDescriptor serialDescriptor) {
        int i = this.m;
        if (i >= this.l - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.m = i2;
        return i2;
    }
}
