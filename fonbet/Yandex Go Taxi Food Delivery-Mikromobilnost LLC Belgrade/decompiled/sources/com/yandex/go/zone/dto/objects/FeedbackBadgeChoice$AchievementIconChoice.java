package com.yandex.go.zone.dto.objects;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/zone/dto/objects/FeedbackBadgeChoice$AchievementIconChoice", "Lcom/yandex/go/zone/dto/objects/h2;", "Companion", "Images", "$serializer", "com/yandex/go/zone/dto/objects/d2", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class FeedbackBadgeChoice$AchievementIconChoice extends h2 {
    public static final d2 Companion = new d2();
    public final String a;
    public final String b;
    public final Images c;

    public FeedbackBadgeChoice$AchievementIconChoice(int i, String str, String str2, Images images) {
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
            this.c = new Images(0);
        } else {
            this.c = images;
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
        return FeedbackBadgeChoice$FeedbackBadgeType.ACHIEVEMENT_ICON;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedbackBadgeChoice$AchievementIconChoice)) {
            return false;
        }
        FeedbackBadgeChoice$AchievementIconChoice feedbackBadgeChoice$AchievementIconChoice = (FeedbackBadgeChoice$AchievementIconChoice) obj;
        return jl40.l(this.a, feedbackBadgeChoice$AchievementIconChoice.a) && jl40.l(this.b, feedbackBadgeChoice$AchievementIconChoice.b) && jl40.l(this.c, feedbackBadgeChoice$AchievementIconChoice.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = b64.v("AchievementIconChoice(name=", this.a, ", label=", this.b, ", images=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/FeedbackBadgeChoice$AchievementIconChoice$Images;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/e2", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Images {
        public static final e2 Companion = new e2();
        public final String a;
        public final String b;

        public /* synthetic */ Images(int i, String str, String str2) {
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

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Images)) {
                return false;
            }
            Images images = (Images) obj;
            return jl40.l(this.a, images.a) && jl40.l(this.b, images.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return unr0.p("Images(activeImageTag=", this.a, ", inactiveImageTag=", this.b, Extension.C_BRAKE);
        }

        public Images(int i) {
            this.a = "";
            this.b = "";
        }

        public Images() {
            this(0);
        }
    }

    public FeedbackBadgeChoice$AchievementIconChoice() {
        Images images = new Images(0);
        this.a = "";
        this.b = "";
        this.c = images;
    }
}
