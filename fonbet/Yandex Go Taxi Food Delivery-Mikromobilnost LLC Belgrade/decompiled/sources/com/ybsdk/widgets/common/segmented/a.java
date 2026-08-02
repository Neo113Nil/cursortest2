package com.ybsdk.widgets.common.segmented;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.segmented.SegmentedControlView;
import defpackage.jl40;
import defpackage.nbv;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class a {
    public final Text a;
    public final nbv b;
    public final SegmentedControlView.ItemDesign c;

    public a(Text.Resource resource, nbv nbvVar, SegmentedControlView.ItemDesign itemDesign) {
        this.a = resource;
        this.b = nbvVar;
        this.c = itemDesign;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return jl40.l(this.a, aVar.a) && this.b.equals(aVar.b) && this.c == aVar.c;
    }

    public final int hashCode() {
        Text text = this.a;
        int hashCode = text == null ? 0 : text.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "ItemState(text=" + this.a + ", icon=" + this.b + ", design=" + this.c + Extension.C_BRAKE;
    }
}
