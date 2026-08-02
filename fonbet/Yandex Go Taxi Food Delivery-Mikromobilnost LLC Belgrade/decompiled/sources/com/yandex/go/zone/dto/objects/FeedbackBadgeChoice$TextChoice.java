package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/zone/dto/objects/FeedbackBadgeChoice$TextChoice", "Lcom/yandex/go/zone/dto/objects/h2;", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/g2", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class FeedbackBadgeChoice$TextChoice extends h2 {
    public static final g2 Companion = new g2();
    public final String a;
    public final String b;

    public FeedbackBadgeChoice$TextChoice(int i, String str, String str2) {
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
    }

    @Override // com.yandex.go.zone.dto.objects.h2
    /* renamed from: a, reason: from getter */
    public final String getB() {
        return this.b;
    }

    @Override // com.yandex.go.zone.dto.objects.h2
    /* renamed from: b, reason: from getter */
    public final String getA() {
        return this.a;
    }

    @Override // com.yandex.go.zone.dto.objects.h2
    public final FeedbackBadgeChoice$FeedbackBadgeType c() {
        return FeedbackBadgeChoice$FeedbackBadgeType.TEXT;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedbackBadgeChoice$TextChoice)) {
            return false;
        }
        FeedbackBadgeChoice$TextChoice feedbackBadgeChoice$TextChoice = (FeedbackBadgeChoice$TextChoice) obj;
        return jl40.l(this.a, feedbackBadgeChoice$TextChoice.a) && jl40.l(this.b, feedbackBadgeChoice$TextChoice.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("TextChoice(name=", this.a, ", label=", this.b, Extension.C_BRAKE);
    }

    public FeedbackBadgeChoice$TextChoice() {
        this.a = "";
        this.b = "";
    }
}
