package com.yandex.go.flex.main_screen.data.widgets.shimmer;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.pyp0;
import defpackage.unr0;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/main_screen/data/widgets/shimmer/ShimmerWidgetSection;", "Lpyp0;", "Companion", "$serializer", "com/yandex/go/flex/main_screen/data/widgets/shimmer/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ShimmerWidgetSection extends pyp0 {
    public static final a Companion = new a();
    public final String a;
    public final String b;
    public final boolean c;

    public /* synthetic */ ShimmerWidgetSection(String str, int i, String str2, boolean z) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = ShimmerDivHandler.EXTENSION_ID;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
    }

    @Override // defpackage.pyp0
    /* renamed from: c, reason: from getter */
    public final String getA() {
        return this.a;
    }

    @Override // defpackage.pyp0
    /* renamed from: d, reason: from getter */
    public final boolean getC() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShimmerWidgetSection)) {
            return false;
        }
        ShimmerWidgetSection shimmerWidgetSection = (ShimmerWidgetSection) obj;
        return jl40.l(this.a, shimmerWidgetSection.a) && jl40.l(this.b, shimmerWidgetSection.b) && this.c == shimmerWidgetSection.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(b64.v("ShimmerWidgetSection(id=", this.a, ", type=", this.b, ", reloadable="), this.c, Extension.C_BRAKE);
    }

    public ShimmerWidgetSection() {
        this(7);
    }

    public ShimmerWidgetSection(int i) {
        String str;
        if ((i & 1) == 0) {
            str = ShimmerDivHandler.EXTENSION_ID;
        } else {
            str = "";
        }
        this.a = str;
        this.b = ShimmerDivHandler.EXTENSION_ID;
        this.c = false;
    }
}
