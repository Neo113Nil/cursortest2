package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/SurgeAlertContent;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/q5", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SurgeAlertContent {
    public static final q5 Companion = new q5();
    public final SurgeAlertContentBalance a;
    public final SurgeAlertContentTitle b;
    public final String c;
    public final SurgeBlizzardContentActionButton d;

    public /* synthetic */ SurgeAlertContent(int i, SurgeAlertContentBalance surgeAlertContentBalance, SurgeAlertContentTitle surgeAlertContentTitle, String str, SurgeBlizzardContentActionButton surgeBlizzardContentActionButton) {
        this.a = (i & 1) == 0 ? new SurgeAlertContentBalance(0) : surgeAlertContentBalance;
        if ((i & 2) == 0) {
            this.b = new SurgeAlertContentTitle(0);
        } else {
            this.b = surgeAlertContentTitle;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = new SurgeBlizzardContentActionButton(0);
        } else {
            this.d = surgeBlizzardContentActionButton;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurgeAlertContent)) {
            return false;
        }
        SurgeAlertContent surgeAlertContent = (SurgeAlertContent) obj;
        return jl40.l(this.a, surgeAlertContent.a) && jl40.l(this.b, surgeAlertContent.b) && jl40.l(this.c, surgeAlertContent.c) && jl40.l(this.d, surgeAlertContent.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "SurgeAlertContent(balance=" + this.a + ", title=" + this.b + ", deeplink=" + this.c + ", button=" + this.d + Extension.C_BRAKE;
    }

    public SurgeAlertContent() {
        this(0);
    }

    public SurgeAlertContent(int i) {
        SurgeAlertContentBalance surgeAlertContentBalance = new SurgeAlertContentBalance(0);
        SurgeAlertContentTitle surgeAlertContentTitle = new SurgeAlertContentTitle(0);
        SurgeBlizzardContentActionButton surgeBlizzardContentActionButton = new SurgeBlizzardContentActionButton(0);
        this.a = surgeAlertContentBalance;
        this.b = surgeAlertContentTitle;
        this.c = "";
        this.d = surgeBlizzardContentActionButton;
    }
}
