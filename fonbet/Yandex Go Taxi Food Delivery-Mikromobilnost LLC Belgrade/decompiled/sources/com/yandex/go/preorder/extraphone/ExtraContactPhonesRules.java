package com.yandex.go.preorder.extraphone;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/extraphone/ExtraContactPhonesRules;", "", "Companion", "com/yandex/go/preorder/extraphone/a", "$serializer", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ExtraContactPhonesRules {
    public static final a Companion = new a();
    public static final ExtraContactPhonesRules f = new ExtraContactPhonesRules(0);
    public final boolean a;
    public final String b;
    public final String c;
    public final PopupProperties d;
    public final PhoneSelectionScreen e;

    public /* synthetic */ ExtraContactPhonesRules(int i, boolean z, String str, String str2, PopupProperties popupProperties, PhoneSelectionScreen phoneSelectionScreen) {
        if ((i & 1) == 0) {
            this.a = false;
        } else {
            this.a = z;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = new PopupProperties(0);
        } else {
            this.d = popupProperties;
        }
        if ((i & 16) == 0) {
            this.e = new PhoneSelectionScreen(0);
        } else {
            this.e = phoneSelectionScreen;
        }
    }

    public final boolean a() {
        if (this.c.length() <= 0 || this.b.length() <= 0 || this.e.a.length() <= 0) {
            return false;
        }
        PopupProperties popupProperties = this.d;
        return popupProperties.c.length() > 0 && popupProperties.b.length() > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtraContactPhonesRules)) {
            return false;
        }
        ExtraContactPhonesRules extraContactPhonesRules = (ExtraContactPhonesRules) obj;
        return this.a == extraContactPhonesRules.a && jl40.l(this.b, extraContactPhonesRules.b) && jl40.l(this.c, extraContactPhonesRules.c) && jl40.l(this.d, extraContactPhonesRules.d) && jl40.l(this.e, extraContactPhonesRules.e);
    }

    public final int hashCode() {
        return this.e.a.hashCode() + ((this.d.hashCode() + unr0.b(unr0.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder v = ly3.v("ExtraContactPhonesRules(required=", ", requirementLabel=", this.b, ", selectedLabel=", this.a);
        v.append(this.c);
        v.append(", popupProperties=");
        v.append(this.d);
        v.append(", phoneSelectionScreen=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public ExtraContactPhonesRules() {
        this(0);
    }

    public ExtraContactPhonesRules(int i) {
        PopupProperties popupProperties = new PopupProperties(0);
        PhoneSelectionScreen phoneSelectionScreen = new PhoneSelectionScreen(0);
        this.a = false;
        this.b = "";
        this.c = "";
        this.d = popupProperties;
        this.e = phoneSelectionScreen;
    }
}
