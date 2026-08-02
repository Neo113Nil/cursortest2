package com.ybsdk.widgets.common;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import defpackage.bks;
import defpackage.jl40;
import defpackage.unr0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class c extends e {
    public final Text d;
    public final Text e;
    public final bks f;
    public final boolean g;
    public final YbButtonViewGroup.b h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(Text text, Text text2, bks bksVar, boolean z, Text text3, Text text4) {
        this(text, text2, bksVar, z, r8);
        YbButtonView.a aVar;
        YbButtonView.a aVar2;
        YbButtonViewGroup.b bVar;
        if (text3 != null) {
            aVar = new YbButtonView.a(text3, null, null, null, null, null, null, false, false, null, 4094);
        } else {
            aVar = null;
        }
        if (text4 != null) {
            aVar2 = new YbButtonView.a(text4, null, null, null, null, null, null, false, false, null, 4094);
        } else {
            aVar2 = null;
        }
        if (aVar == null && aVar2 == null) {
            bVar = null;
        } else {
            bVar = new YbButtonViewGroup.b(null, aVar, aVar2, null, 9);
        }
    }

    @Override // com.ybsdk.widgets.common.e
    public final YbButtonViewGroup.b a() {
        return this.h;
    }

    @Override // com.ybsdk.widgets.common.e
    public final boolean b() {
        return this.g;
    }

    @Override // com.ybsdk.widgets.common.e
    public final bks c() {
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
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return jl40.l(this.d, cVar.d) && jl40.l(this.e, cVar.e) && jl40.l(this.f, cVar.f) && this.g == cVar.g && jl40.l(this.h, cVar.h);
    }

    public final int hashCode() {
        Text text = this.d;
        int hashCode = (text == null ? 0 : text.hashCode()) * 31;
        Text text2 = this.e;
        int hashCode2 = (hashCode + (text2 == null ? 0 : text2.hashCode())) * 31;
        bks bksVar = this.f;
        int e = unr0.e((hashCode2 + (bksVar == null ? 0 : bksVar.hashCode())) * 31, 31, this.g);
        YbButtonViewGroup.b bVar = this.h;
        return e + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder p = defpackage.n.p("Content(title=", this.d, ", subtitle=", this.e, ", icon=");
        p.append(this.f);
        p.append(", closeButtonVisible=");
        p.append(this.g);
        p.append(", buttonsState=");
        p.append(this.h);
        p.append(Extension.C_BRAKE);
        return p.toString();
    }

    public c(Text text, Text text2, bks bksVar, boolean z, YbButtonViewGroup.b bVar) {
        super(bksVar, bVar, 48);
        this.d = text;
        this.e = text2;
        this.f = bksVar;
        this.g = z;
        this.h = bVar;
    }

    public /* synthetic */ c(Text text, Text text2, bks bksVar, Text.Resource resource) {
        this(text, text2, bksVar, false, resource, null);
    }

    public c() {
        this(null, null, null, false, null);
    }
}
