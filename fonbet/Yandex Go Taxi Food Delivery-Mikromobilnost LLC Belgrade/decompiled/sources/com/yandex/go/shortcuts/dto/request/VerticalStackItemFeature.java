package com.yandex.go.shortcuts.dto.request;

import defpackage.gs21;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.llw0;
import defpackage.ly3;
import defpackage.unr0;
import defpackage.xvz;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/request/VerticalStackItemFeature;", "Lllw0;", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/request/u", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class VerticalStackItemFeature implements llw0 {
    public static final u Companion = new u();
    public static final i3y[] d;
    public final String a;
    public final List b;
    public final List c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new gs21(17)), kotlin.a.b(lazyThreadSafetyMode, new gs21(18))};
    }

    public /* synthetic */ VerticalStackItemFeature(int i, String str, List list, List list2) {
        this.a = (i & 1) == 0 ? "" : str;
        int i2 = i & 2;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.b = emptyList;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = emptyList;
        } else {
            this.c = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerticalStackItemFeature)) {
            return false;
        }
        VerticalStackItemFeature verticalStackItemFeature = (VerticalStackItemFeature) obj;
        return jl40.l(this.a, verticalStackItemFeature.a) && jl40.l(this.b, verticalStackItemFeature.b) && jl40.l(this.c, verticalStackItemFeature.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ly3.s(xvz.r("VerticalStackItemFeature(type=", this.a, ", items=", this.b, ", prefetchStrategies="), this.c, Extension.C_BRAKE);
    }

    public VerticalStackItemFeature() {
        this(null, 7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, kotlin.collections.EmptyList] */
    public VerticalStackItemFeature(ArrayList arrayList, int i) {
        String str;
        if ((i & 1) != 0) {
            str = "";
        } else {
            str = "vertical_stack_item";
        }
        int i2 = i & 2;
        ?? r1 = EmptyList.a;
        arrayList = i2 != 0 ? r1 : arrayList;
        this.a = str;
        this.b = arrayList;
        this.c = r1;
    }
}
