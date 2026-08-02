package com.yandex.delivery.attrbutedtext.api;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import defpackage.g8e;
import defpackage.i8s;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.unr0;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.ui.theme.fonts.TextMetaStyle;

/* loaded from: classes5.dex */
public final class h implements i8s {
    public final String a;
    public final FormattedText.FontStyle b;
    public final FormattedText.FontWeight c;
    public final Integer d;
    public final List e;
    public final List f;
    public final String g;
    public final String h;
    public final TextMetaStyle i;
    public final String j;
    public final Float k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ h(String str, FormattedText.FontStyle fontStyle, FormattedText.FontWeight fontWeight, Integer num, List list, List list2, String str2, String str3, TextMetaStyle textMetaStyle, int i) {
        this(r4, r5, r6, r7, r1 != 0 ? r8 : list, (i & 32) != 0 ? r8 : list2, (i & 64) != 0 ? "" : str2, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : textMetaStyle, null, null);
        String str4 = (i & 1) != 0 ? "" : str;
        FormattedText.FontStyle fontStyle2 = (i & 2) != 0 ? FormattedText.FontStyle.NORMAL : fontStyle;
        FormattedText.FontWeight fontWeight2 = (i & 4) != 0 ? null : fontWeight;
        Integer num2 = (i & 8) != 0 ? null : num;
        int i2 = i & 16;
        EmptyList emptyList = EmptyList.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return jl40.l(this.a, hVar.a) && this.b == hVar.b && this.c == hVar.c && jl40.l(this.d, hVar.d) && jl40.l(this.e, hVar.e) && jl40.l(this.f, hVar.f) && jl40.l(this.g, hVar.g) && jl40.l(this.h, hVar.h) && this.i == hVar.i && jl40.l(this.j, hVar.j) && jl40.l(this.k, hVar.k);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        FormattedText.FontWeight fontWeight = this.c;
        int hashCode2 = (hashCode + (fontWeight == null ? 0 : fontWeight.hashCode())) * 31;
        Integer num = this.d;
        int b = unr0.b(unr0.c(unr0.c((hashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        int hashCode3 = (b + (str == null ? 0 : str.hashCode())) * 31;
        TextMetaStyle textMetaStyle = this.i;
        int hashCode4 = (hashCode3 + (textMetaStyle == null ? 0 : textMetaStyle.hashCode())) * 31;
        String str2 = this.j;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f = this.k;
        return hashCode5 + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Text(text=");
        sb.append(this.a);
        sb.append(", fontStyle=");
        sb.append(this.b);
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontSize=");
        sb.append(this.d);
        sb.append(", textDecoration=");
        nnm.w(sb, this.e, ", detailedTextDecoration=", this.f, ", color=");
        g8e.D(sb, this.g, ", metaColor=", this.h, ", metaStyle=");
        sb.append(this.i);
        sb.append(", strokeColor=");
        sb.append(this.j);
        sb.append(", strokeWidth=");
        sb.append(this.k);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public h() {
        this(null, null, null, null, null, null, null, null, null, 2047);
    }

    public h(String str, FormattedText.FontStyle fontStyle, FormattedText.FontWeight fontWeight, Integer num, List list, List list2, String str2, String str3, TextMetaStyle textMetaStyle, String str4, Float f) {
        this.a = str;
        this.b = fontStyle;
        this.c = fontWeight;
        this.d = num;
        this.e = list;
        this.f = list2;
        this.g = str2;
        this.h = str3;
        this.i = textMetaStyle;
        this.j = str4;
        this.k = f;
    }
}
