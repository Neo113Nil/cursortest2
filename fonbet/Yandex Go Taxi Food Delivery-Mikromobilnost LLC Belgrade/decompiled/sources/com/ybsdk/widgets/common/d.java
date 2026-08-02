package com.ybsdk.widgets.common;

import com.ybsdk.core.utils.text.Text;
import defpackage.jl40;
import defpackage.x4e;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class d extends e {
    public final Text d;
    public final Text e;
    public final boolean f;

    public /* synthetic */ d(Text text, Text text2, int i) {
        this((i & 1) != 0 ? null : text, (i & 2) != 0 ? null : text2, (i & 4) == 0);
    }

    @Override // com.ybsdk.widgets.common.e
    public final boolean b() {
        return this.f;
    }

    @Override // com.ybsdk.widgets.common.e
    public final Text d() {
        return this.e;
    }

    @Override // com.ybsdk.widgets.common.e
    public final Text e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return jl40.l(this.d, dVar.d) && jl40.l(this.e, dVar.e) && this.f == dVar.f;
    }

    public final int hashCode() {
        Text text = this.d;
        int hashCode = (text == null ? 0 : text.hashCode()) * 31;
        Text text2 = this.e;
        return Boolean.hashCode(this.f) + ((hashCode + (text2 != null ? text2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return x4e.i(defpackage.n.p("Progress(title=", this.d, ", subtitle=", this.e, ", closeButtonVisible="), this.f, Extension.C_BRAKE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d() {
        this(r0, r0, 7);
        Text text = null;
    }

    public d(Text text, Text text2, boolean z) {
        super(null, null, 12);
        this.d = text;
        this.e = text2;
        this.f = z;
    }
}
