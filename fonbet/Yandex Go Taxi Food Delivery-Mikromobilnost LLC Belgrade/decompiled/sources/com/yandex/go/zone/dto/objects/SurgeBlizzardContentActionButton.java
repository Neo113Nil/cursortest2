package com.yandex.go.zone.dto.objects;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/SurgeBlizzardContentActionButton;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/w5", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SurgeBlizzardContentActionButton {
    public static final w5 Companion = new w5();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ SurgeBlizzardContentActionButton(int i, String str, String str2, String str3) {
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurgeBlizzardContentActionButton)) {
            return false;
        }
        SurgeBlizzardContentActionButton surgeBlizzardContentActionButton = (SurgeBlizzardContentActionButton) obj;
        return jl40.l(this.a, surgeBlizzardContentActionButton.a) && jl40.l(this.b, surgeBlizzardContentActionButton.b) && jl40.l(this.c, surgeBlizzardContentActionButton.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("SurgeBlizzardContentActionButton(text=", this.a, ", textColor=", this.b, ", backgroundColor="), this.c, Extension.C_BRAKE);
    }

    public SurgeBlizzardContentActionButton(int i) {
        this.a = "";
        this.b = "";
        this.c = "";
    }

    public SurgeBlizzardContentActionButton() {
        this(0);
    }
}
