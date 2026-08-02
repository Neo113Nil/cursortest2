package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;

/* loaded from: classes9.dex */
public final class mex extends c8 {
    public final a f;
    public final int g;
    public int h;

    public mex(sbx sbxVar, a aVar) {
        super(sbxVar, null);
        this.f = aVar;
        this.g = aVar.a.size();
        this.h = -1;
    }

    @Override // defpackage.w150
    public final String W(SerialDescriptor serialDescriptor, int i) {
        return String.valueOf(i);
    }

    @Override // defpackage.c8
    public final b Y(String str) {
        return this.f.get(Integer.parseInt(str));
    }

    @Override // defpackage.c8
    public final b a0() {
        return this.f;
    }

    @Override // defpackage.sjd
    public final int v(SerialDescriptor serialDescriptor) {
        int i = this.h;
        if (i >= this.g - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.h = i2;
        return i2;
    }
}
