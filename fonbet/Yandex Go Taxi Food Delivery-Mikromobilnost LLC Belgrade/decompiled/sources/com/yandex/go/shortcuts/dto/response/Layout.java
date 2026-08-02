package com.yandex.go.shortcuts.dto.response;

import com.yandex.go.shortcuts.models.LayoutType;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.wwx;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/Layout;", "", "Companion", "com/yandex/go/shortcuts/dto/response/t", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Layout {
    public static final t Companion = new t();
    public static final i3y[] d = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wwx(5)), null, null};
    public static final Layout e = new Layout(0);
    public final LayoutType a;
    public final int b;
    public final String c;

    public /* synthetic */ Layout(int i, LayoutType layoutType, int i2, String str) {
        this.a = (i & 1) == 0 ? LayoutType.LinearGrid : layoutType;
        if ((i & 2) == 0) {
            this.b = 6;
        } else {
            this.b = i2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Layout)) {
            return false;
        }
        Layout layout = (Layout) obj;
        return this.a == layout.a && this.b == layout.b && jl40.l(this.c, layout.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Layout(type=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", gridId=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }

    public Layout() {
        this(0);
    }

    public Layout(int i) {
        this.a = LayoutType.LinearGrid;
        this.b = 6;
        this.c = "";
    }
}
