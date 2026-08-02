package com.yandex.go.zone.dto.objects;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/UiOnOrderButton;", "Lcom/yandex/go/zone/dto/objects/o6;", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/p6", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class UiOnOrderButton extends o6 {
    public static final p6 Companion = new p6();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public UiOnOrderButton(int i, String str, String str2, String str3, String str4, String str5, String str6) {
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
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UiOnOrderButton)) {
            return false;
        }
        UiOnOrderButton uiOnOrderButton = (UiOnOrderButton) obj;
        return jl40.l(this.a, uiOnOrderButton.a) && jl40.l(this.b, uiOnOrderButton.b) && jl40.l(this.c, uiOnOrderButton.c) && jl40.l(this.d, uiOnOrderButton.d) && jl40.l(this.e, uiOnOrderButton.e) && jl40.l(this.f, uiOnOrderButton.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder v = b64.v("UiOnOrderButton(title=", this.a, ", text=", this.b, ", freeRoadText=");
        g8e.D(v, this.c, ", tollRoadText=", this.d, ", buttonTitle=");
        return g8e.r(v, this.e, ", buttonSubtitle=", this.f, Extension.C_BRAKE);
    }

    public UiOnOrderButton() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
    }
}
