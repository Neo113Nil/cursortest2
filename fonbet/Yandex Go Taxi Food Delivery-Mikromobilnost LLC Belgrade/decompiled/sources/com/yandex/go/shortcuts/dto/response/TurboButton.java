package com.yandex.go.shortcuts.dto.response;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jg11;
import defpackage.jl40;
import defpackage.o170;
import defpackage.unr0;
import defpackage.w7s;
import defpackage.xx;
import defpackage.yjd;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/TurboButton;", "", "Companion", "com/yandex/go/shortcuts/dto/response/z2", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TurboButton {
    public static final z2 Companion = new z2();
    public static final i3y[] m;
    public final String a;
    public final String b;
    public final FormattedText c;
    public final List d;
    public final TextStyleDto e;
    public final Background f;
    public final Counters g;
    public final com.yandex.go.dto.response.q1 h;
    public final String i;
    public final ShortcutIconSize j;
    public final String k;
    public final f0 l;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        m = new i3y[]{null, null, null, kotlin.a.b(lazyThreadSafetyMode, new jg11(5)), null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new jg11(6)), null, null};
    }

    public /* synthetic */ TurboButton(int i, String str, String str2, FormattedText formattedText, List list, TextStyleDto textStyleDto, Background background, Counters counters, com.yandex.go.dto.response.q1 q1Var, String str3, ShortcutIconSize shortcutIconSize, String str4, f0 f0Var) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = formattedText;
        }
        if ((i & 8) == 0) {
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = new TextStyleDto(0);
        } else {
            this.e = textStyleDto;
        }
        if ((i & 32) == 0) {
            this.f = new Background(0);
        } else {
            this.f = background;
        }
        if ((i & 64) == 0) {
            this.g = new Counters(0);
        } else {
            this.g = counters;
        }
        if ((i & 128) == 0) {
            this.h = com.yandex.go.dto.response.e0.INSTANCE;
        } else {
            this.h = q1Var;
        }
        if ((i & 256) == 0) {
            this.i = "";
        } else {
            this.i = str3;
        }
        if ((i & 512) == 0) {
            this.j = ShortcutIconSize.MEDIUM;
        } else {
            this.j = shortcutIconSize;
        }
        if ((i & 1024) == 0) {
            this.k = "";
        } else {
            this.k = str4;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = f0Var;
        }
    }

    public static final /* synthetic */ void b(TurboButton turboButton, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(turboButton.a, "")) {
            yjdVar.o(serialDescriptor, 0, turboButton.a);
        }
        if (yjdVar.F() || !jl40.l(turboButton.b, "")) {
            yjdVar.o(serialDescriptor, 1, turboButton.b);
        }
        if (yjdVar.F() || turboButton.c != null) {
            yjdVar.g(serialDescriptor, 2, w7s.a, turboButton.c);
        }
        boolean F = yjdVar.F();
        i3y[] i3yVarArr = m;
        if (F || !jl40.l(turboButton.d, EmptyList.a)) {
            yjdVar.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), turboButton.d);
        }
        if (yjdVar.F() || !jl40.l(turboButton.e, new TextStyleDto(0))) {
            yjdVar.e(serialDescriptor, 4, TextStyleDto$$serializer.INSTANCE, turboButton.e);
        }
        if (yjdVar.F() || !jl40.l(turboButton.f, new Background(0))) {
            yjdVar.e(serialDescriptor, 5, Background$$serializer.INSTANCE, turboButton.f);
        }
        if (yjdVar.F() || !jl40.l(turboButton.g, new Counters(0))) {
            yjdVar.e(serialDescriptor, 6, Counters$$serializer.INSTANCE, turboButton.g);
        }
        if (yjdVar.F() || !jl40.l(turboButton.h, com.yandex.go.dto.response.e0.INSTANCE)) {
            yjdVar.e(serialDescriptor, 7, xx.f, turboButton.h);
        }
        if (yjdVar.F() || !jl40.l(turboButton.i, "")) {
            yjdVar.o(serialDescriptor, 8, turboButton.i);
        }
        if (yjdVar.F() || turboButton.j != ShortcutIconSize.MEDIUM) {
            yjdVar.e(serialDescriptor, 9, (KSerializer) i3yVarArr[9].getValue(), turboButton.j);
        }
        if (yjdVar.F() || !jl40.l(turboButton.k, "")) {
            yjdVar.o(serialDescriptor, 10, turboButton.k);
        }
        if (!yjdVar.F() && turboButton.l == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 11, o170.e, turboButton.l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TurboButton)) {
            return false;
        }
        TurboButton turboButton = (TurboButton) obj;
        return jl40.l(this.a, turboButton.a) && jl40.l(this.b, turboButton.b) && jl40.l(this.c, turboButton.c) && jl40.l(this.d, turboButton.d) && jl40.l(this.e, turboButton.e) && jl40.l(this.f, turboButton.f) && jl40.l(this.g, turboButton.g) && jl40.l(this.h, turboButton.h) && jl40.l(this.i, turboButton.i) && this.j == turboButton.j && jl40.l(this.k, turboButton.k) && jl40.l(this.l, turboButton.l);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        FormattedText formattedText = this.c;
        int b2 = unr0.b((this.j.hashCode() + unr0.b((this.h.hashCode() + unr0.c((this.f.hashCode() + ((this.e.hashCode() + unr0.c((b + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31, 31, this.d)) * 31)) * 31, 31, this.g.a)) * 31, 31, this.i)) * 31, 31, this.k);
        f0 f0Var = this.l;
        return b2 + (f0Var != null ? f0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("TurboButton(id=", this.a, ", title=", this.b, ", attributedTitle=");
        v.append(this.c);
        v.append(", overlays=");
        v.append(this.d);
        v.append(", textStyle=");
        v.append(this.e);
        v.append(", background=");
        v.append(this.f);
        v.append(", counters=");
        v.append(this.g);
        v.append(", action=");
        v.append(this.h);
        v.append(", imageTag=");
        v.append(this.i);
        v.append(", imageSize=");
        v.append(this.j);
        v.append(", service=");
        v.append(this.k);
        v.append(", onboarding=");
        v.append(this.l);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public TurboButton() {
        TextStyleDto textStyleDto = new TextStyleDto(0);
        Background background = new Background(0);
        Counters counters = new Counters(0);
        com.yandex.go.dto.response.e0 e0Var = com.yandex.go.dto.response.e0.INSTANCE;
        ShortcutIconSize shortcutIconSize = ShortcutIconSize.MEDIUM;
        this.a = "";
        this.b = "";
        this.c = null;
        this.d = EmptyList.a;
        this.e = textStyleDto;
        this.f = background;
        this.g = counters;
        this.h = e0Var;
        this.i = "";
        this.j = shortcutIconSize;
        this.k = "";
        this.l = null;
    }
}
