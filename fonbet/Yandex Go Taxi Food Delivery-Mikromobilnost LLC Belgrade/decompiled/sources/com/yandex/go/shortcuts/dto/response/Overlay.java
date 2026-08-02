package com.yandex.go.shortcuts.dto.response;

import defpackage.aei0;
import defpackage.aw80;
import defpackage.cei0;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.w7s;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/Overlay;", "", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/g0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Overlay {
    public static final g0 Companion = new g0();
    public static final i3y[] k;
    public final ShowPolicy a;
    public final OverlayType b;
    public final String c;
    public final String d;
    public final String e;
    public final Background f;
    public final Shape g;
    public final FormattedText h;
    public final List i;
    public final cei0 j;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        k = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new aw80(4)), null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new aw80(6)), null, kotlin.a.b(lazyThreadSafetyMode, new aw80(8)), null};
    }

    public Overlay(int i, ShowPolicy showPolicy, OverlayType overlayType, String str, String str2, String str3, Background background, Shape shape, FormattedText formattedText, List list, cei0 cei0Var) {
        if ((i & 1) == 0) {
            ShowPolicy.Companion.getClass();
            showPolicy = ShowPolicy.d;
        }
        this.a = showPolicy;
        if ((i & 2) == 0) {
            this.b = OverlayType.STATIC_TEXT;
        } else {
            this.b = overlayType;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = new Background(0);
        } else {
            this.f = background;
        }
        if ((i & 64) == 0) {
            this.g = Shape.UNSUPPORTED;
        } else {
            this.g = shape;
        }
        if ((i & 128) == 0) {
            this.h = FormattedText.c;
        } else {
            this.h = formattedText;
        }
        if ((i & 256) == 0) {
            this.i = EmptyList.a;
        } else {
            this.i = list;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = cei0Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (defpackage.jl40.l(r0, com.yandex.go.shortcuts.dto.response.ShowPolicy.d) == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(Overlay overlay, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (!yjdVar.F()) {
            ShowPolicy showPolicy = overlay.a;
            ShowPolicy.Companion.getClass();
        }
        yjdVar.e(serialDescriptor, 0, ShowPolicy$$serializer.INSTANCE, overlay.a);
        boolean F = yjdVar.F();
        i3y[] i3yVarArr = k;
        if (F || overlay.b != OverlayType.STATIC_TEXT) {
            yjdVar.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), overlay.b);
        }
        if (yjdVar.F() || !jl40.l(overlay.c, "")) {
            yjdVar.o(serialDescriptor, 2, overlay.c);
        }
        if (yjdVar.F() || !jl40.l(overlay.d, "")) {
            yjdVar.o(serialDescriptor, 3, overlay.d);
        }
        if (yjdVar.F() || !jl40.l(overlay.e, "")) {
            yjdVar.o(serialDescriptor, 4, overlay.e);
        }
        if (yjdVar.F() || !jl40.l(overlay.f, new Background(0))) {
            yjdVar.e(serialDescriptor, 5, Background$$serializer.INSTANCE, overlay.f);
        }
        if (yjdVar.F() || overlay.g != Shape.UNSUPPORTED) {
            yjdVar.e(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), overlay.g);
        }
        if (yjdVar.F() || !jl40.l(overlay.h, FormattedText.c)) {
            yjdVar.e(serialDescriptor, 7, w7s.a, overlay.h);
        }
        if (yjdVar.F() || !jl40.l(overlay.i, EmptyList.a)) {
            yjdVar.e(serialDescriptor, 8, (KSerializer) i3yVarArr[8].getValue(), overlay.i);
        }
        if (!yjdVar.F() && overlay.j == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 9, aei0.a, overlay.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Overlay)) {
            return false;
        }
        Overlay overlay = (Overlay) obj;
        return jl40.l(this.a, overlay.a) && this.b == overlay.b && jl40.l(this.c, overlay.c) && jl40.l(this.d, overlay.d) && jl40.l(this.e, overlay.e) && jl40.l(this.f, overlay.f) && this.g == overlay.g && jl40.l(this.h, overlay.h) && jl40.l(this.i, overlay.i) && jl40.l(this.j, overlay.j);
    }

    public final int hashCode() {
        int c = unr0.c(unr0.c((this.g.hashCode() + ((this.f.hashCode() + unr0.b(unr0.b(unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e)) * 31)) * 31, 31, this.h.a), 31, this.i);
        cei0 cei0Var = this.j;
        return c + (cei0Var == null ? 0 : cei0Var.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Overlay(showPolicy=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", text=");
        g8e.D(sb, this.c, ", textColor=", this.d, ", imageTag=");
        sb.append(this.e);
        sb.append(", background=");
        sb.append(this.f);
        sb.append(", shape=");
        sb.append(this.g);
        sb.append(", attributedText=");
        sb.append(this.h);
        sb.append(", info=");
        sb.append(this.i);
        sb.append(", analyticsData=");
        sb.append(this.j);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public Overlay() {
        ShowPolicy.Companion.getClass();
        OverlayType overlayType = OverlayType.STATIC_TEXT;
        Background background = new Background(0);
        Shape shape = Shape.UNSUPPORTED;
        FormattedText formattedText = FormattedText.c;
        this.a = ShowPolicy.d;
        this.b = overlayType;
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = background;
        this.g = shape;
        this.h = formattedText;
        this.i = EmptyList.a;
        this.j = null;
    }
}
