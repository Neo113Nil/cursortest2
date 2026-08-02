package com.ybsdk.widgets.common;

import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.Spanned;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.LoadableInput;
import defpackage.eyy;
import defpackage.hfb1;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.oyr;
import defpackage.smw0;
import defpackage.tse0;
import defpackage.ung0;
import defpackage.unr0;
import defpackage.vfc;
import defpackage.vvg0;
import defpackage.x4e;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class g {
    public static final g z = new g("", eyy.c, LoadableInput.LoadingState.DEFAULT, null, null, null, false, null, null, null, true, null, null, 33543168);
    public final String a;
    public final hfb1 b;
    public final boolean c;
    public final LoadableInput.LoadingState d;
    public final Text e;
    public final Text f;
    public final Spanned g;
    public final boolean h;
    public final Text i;
    public final Text j;
    public final Text k;
    public final boolean l;
    public final String m;
    public final Drawable n;
    public final ColorModel o;
    public final boolean p;
    public final int q;
    public final boolean r;
    public final int s;
    public final int t;
    public final LoadableInput.LabelState u;
    public final ColorModel v;
    public final ColorModel w;
    public final ColorModel x;
    public final boolean y;

    public /* synthetic */ g(String str, hfb1 hfb1Var, LoadableInput.LoadingState loadingState, Text text, Text text2, Spannable spannable, boolean z2, Text text3, Text.Join join, Text.Constant constant, boolean z3, Drawable drawable, LoadableInput.LabelState labelState, int i) {
        this(str, hfb1Var, true, loadingState, text, text2, spannable, z2, text3, (i & 512) != 0 ? null : join, (i & 1024) != 0 ? null : constant, (i & 2048) != 0 ? true : z3, (i & 4096) != 0 ? "" : "0", (i & 8192) != 0 ? null : drawable, null, false, ung0.ybColor_textIcon_negative, (131072 & i) == 0, Integer.MAX_VALUE, vvg0.ybsdk_loadable_input_icon_size, (1048576 & i) != 0 ? null : labelState, null, null, null, (i & 16777216) != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v41, types: [android.text.Spanned] */
    public static g a(g gVar, String str, hfb1 hfb1Var, boolean z2, LoadableInput.LoadingState loadingState, Text text, Text text2, Spannable spannable, boolean z3, Text text3, Text text4, Text text5, boolean z4, Drawable drawable, ColorModel colorModel, boolean z5, int i, boolean z6, int i2, int i3, ColorModel colorModel2, ColorModel colorModel3, ColorModel colorModel4, int i4) {
        String str2 = (i4 & 1) != 0 ? gVar.a : str;
        hfb1 hfb1Var2 = (i4 & 2) != 0 ? gVar.b : hfb1Var;
        boolean z7 = (i4 & 4) != 0 ? gVar.c : z2;
        LoadableInput.LoadingState loadingState2 = (i4 & 8) != 0 ? gVar.d : loadingState;
        Text text6 = (i4 & 16) != 0 ? gVar.e : text;
        Text text7 = (i4 & 32) != 0 ? gVar.f : text2;
        Spannable spannable2 = (i4 & 64) != 0 ? gVar.g : spannable;
        boolean z8 = (i4 & 128) != 0 ? gVar.h : z3;
        Text text8 = (i4 & 256) != 0 ? gVar.i : text3;
        Text text9 = (i4 & 512) != 0 ? gVar.j : text4;
        Text text10 = (i4 & 1024) != 0 ? gVar.k : text5;
        boolean z9 = (i4 & 2048) != 0 ? gVar.l : z4;
        String str3 = (i4 & 4096) != 0 ? gVar.m : "0";
        Drawable drawable2 = (i4 & 8192) != 0 ? gVar.n : drawable;
        ColorModel colorModel5 = (i4 & 16384) != 0 ? gVar.o : colorModel;
        boolean z10 = (32768 & i4) != 0 ? gVar.p : z5;
        int i5 = (65536 & i4) != 0 ? gVar.q : i;
        boolean z11 = (131072 & i4) != 0 ? gVar.r : z6;
        int i6 = (262144 & i4) != 0 ? gVar.s : i2;
        int i7 = (524288 & i4) != 0 ? gVar.t : i3;
        LoadableInput.LabelState labelState = gVar.u;
        ColorModel colorModel6 = (2097152 & i4) != 0 ? gVar.v : colorModel2;
        ColorModel colorModel7 = (4194304 & i4) != 0 ? gVar.w : colorModel3;
        ColorModel colorModel8 = (8388608 & i4) != 0 ? gVar.x : colorModel4;
        boolean z12 = (i4 & 16777216) != 0 ? gVar.y : false;
        gVar.getClass();
        return new g(str2, hfb1Var2, z7, loadingState2, text6, text7, spannable2, z8, text8, text9, text10, z9, str3, drawable2, colorModel5, z10, i5, z11, i6, i7, labelState, colorModel6, colorModel7, colorModel8, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return jl40.l(this.a, gVar.a) && jl40.l(this.b, gVar.b) && this.c == gVar.c && this.d == gVar.d && jl40.l(this.e, gVar.e) && jl40.l(this.f, gVar.f) && jl40.l(this.g, gVar.g) && this.h == gVar.h && jl40.l(this.i, gVar.i) && jl40.l(this.j, gVar.j) && jl40.l(this.k, gVar.k) && this.l == gVar.l && jl40.l(this.m, gVar.m) && jl40.l(this.n, gVar.n) && jl40.l(this.o, gVar.o) && this.p == gVar.p && this.q == gVar.q && this.r == gVar.r && this.s == gVar.s && this.t == gVar.t && this.u == gVar.u && jl40.l(this.v, gVar.v) && jl40.l(this.w, gVar.w) && jl40.l(this.x, gVar.x) && this.y == gVar.y;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + unr0.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31;
        Text text = this.e;
        int hashCode2 = (hashCode + (text == null ? 0 : text.hashCode())) * 31;
        Text text2 = this.f;
        int hashCode3 = (hashCode2 + (text2 == null ? 0 : text2.hashCode())) * 31;
        Spanned spanned = this.g;
        int e = unr0.e((hashCode3 + (spanned == null ? 0 : spanned.hashCode())) * 31, 31, this.h);
        Text text3 = this.i;
        int hashCode4 = (e + (text3 == null ? 0 : text3.hashCode())) * 31;
        Text text4 = this.j;
        int hashCode5 = (hashCode4 + (text4 == null ? 0 : text4.hashCode())) * 31;
        Text text5 = this.k;
        int b = unr0.b(unr0.e((hashCode5 + (text5 == null ? 0 : text5.hashCode())) * 31, 31, this.l), 31, this.m);
        Drawable drawable = this.n;
        int hashCode6 = (b + (drawable == null ? 0 : drawable.hashCode())) * 31;
        ColorModel colorModel = this.o;
        int b2 = oyr.b(this.t, oyr.b(this.s, unr0.e(oyr.b(this.q, unr0.e((hashCode6 + (colorModel == null ? 0 : colorModel.hashCode())) * 31, 31, this.p), 31), 31, this.r), 31), 31);
        LoadableInput.LabelState labelState = this.u;
        int hashCode7 = (b2 + (labelState == null ? 0 : labelState.hashCode())) * 31;
        ColorModel colorModel2 = this.v;
        int hashCode8 = (hashCode7 + (colorModel2 == null ? 0 : colorModel2.hashCode())) * 31;
        ColorModel colorModel3 = this.w;
        int hashCode9 = (hashCode8 + (colorModel3 == null ? 0 : colorModel3.hashCode())) * 31;
        ColorModel colorModel4 = this.x;
        return Boolean.hashCode(this.y) + ((hashCode9 + (colorModel4 != null ? colorModel4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(inputText=");
        sb.append(this.a);
        sb.append(", inputType=");
        sb.append(this.b);
        sb.append(", isInteractive=");
        sb.append(this.c);
        sb.append(", loadingState=");
        sb.append(this.d);
        sb.append(", label=");
        ly3.C(sb, this.e, ", placeholder=", this.f, ", helperText=");
        sb.append((Object) this.g);
        sb.append(", hasError=");
        sb.append(this.h);
        sb.append(", errorText=");
        ly3.C(sb, this.i, ", prefixText=", this.j, ", suffixText=");
        sb.append(this.k);
        sb.append(", showDivider=");
        sb.append(this.l);
        sb.append(", valueAfterClear=");
        sb.append(this.m);
        sb.append(", backgroundEditText=");
        sb.append(this.n);
        sb.append(", backgroundTintColor=");
        sb.append(this.o);
        sb.append(", hideClearIcon=");
        sb.append(this.p);
        sb.append(", errorDividerColorAttr=");
        tse0.z(sb, this.q, ", changeErrorLabelColor=", this.r, ", maxInputLength=");
        vfc.u(this.s, this.t, ", minHeight=", ", forcedLabelState=", sb);
        sb.append(this.u);
        sb.append(", inputTextColor=");
        sb.append(this.v);
        sb.append(", hintColor=");
        smw0.z(sb, this.w, ", inputLabelColor=", this.x, ", animateLabelOnEmptyInput=");
        return x4e.i(sb, this.y, Extension.C_BRAKE);
    }

    public g(String str, hfb1 hfb1Var, boolean z2, LoadableInput.LoadingState loadingState, Text text, Text text2, Spanned spanned, boolean z3, Text text3, Text text4, Text text5, boolean z4, String str2, Drawable drawable, ColorModel colorModel, boolean z5, int i, boolean z6, int i2, int i3, LoadableInput.LabelState labelState, ColorModel colorModel2, ColorModel colorModel3, ColorModel colorModel4, boolean z7) {
        this.a = str;
        this.b = hfb1Var;
        this.c = z2;
        this.d = loadingState;
        this.e = text;
        this.f = text2;
        this.g = spanned;
        this.h = z3;
        this.i = text3;
        this.j = text4;
        this.k = text5;
        this.l = z4;
        this.m = str2;
        this.n = drawable;
        this.o = colorModel;
        this.p = z5;
        this.q = i;
        this.r = z6;
        this.s = i2;
        this.t = i3;
        this.u = labelState;
        this.v = colorModel2;
        this.w = colorModel3;
        this.x = colorModel4;
        this.y = z7;
    }
}
