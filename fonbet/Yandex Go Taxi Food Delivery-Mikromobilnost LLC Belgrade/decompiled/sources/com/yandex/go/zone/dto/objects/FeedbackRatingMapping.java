package com.yandex.go.zone.dto.objects;

import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.nsq;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.smw0;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/zone/dto/objects/FeedbackRatingMapping;", "", "Companion", "LayoutOptions", "$serializer", "com/yandex/go/zone/dto/objects/i2", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class FeedbackRatingMapping {
    public static final i2 Companion = new i2();
    public static final i3y[] g;
    public final List a;
    public final FeedbackBadgeChoice$FeedbackBadgeType b;
    public final String c;
    public final String d;
    public final int e;
    public final LayoutOptions f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new nsq(9)), kotlin.a.b(lazyThreadSafetyMode, new nsq(10)), null, null, null, null};
    }

    public FeedbackRatingMapping(int i, List list, FeedbackBadgeChoice$FeedbackBadgeType feedbackBadgeChoice$FeedbackBadgeType, String str, String str2, int i2, LayoutOptions layoutOptions) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = FeedbackBadgeChoice$FeedbackBadgeType.TEXT;
        } else {
            this.b = feedbackBadgeChoice$FeedbackBadgeType;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = 0;
        } else {
            this.e = i2;
        }
        if ((i & 32) != 0) {
            this.f = layoutOptions;
        } else {
            LayoutOptions.Companion.getClass();
            this.f = LayoutOptions.e;
        }
    }

    /* renamed from: a, reason: from getter */
    public final FeedbackBadgeChoice$FeedbackBadgeType getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final int getE() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedbackRatingMapping)) {
            return false;
        }
        FeedbackRatingMapping feedbackRatingMapping = (FeedbackRatingMapping) obj;
        return jl40.l(this.a, feedbackRatingMapping.a) && this.b == feedbackRatingMapping.b && jl40.l(this.c, feedbackRatingMapping.c) && jl40.l(this.d, feedbackRatingMapping.d) && this.e == feedbackRatingMapping.e && jl40.l(this.f, feedbackRatingMapping.f);
    }

    public final int hashCode() {
        int b = unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        return this.f.hashCode() + oyr.b(this.e, (b + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedbackRatingMapping(badges=");
        sb.append(this.a);
        sb.append(", badgesType=");
        sb.append(this.b);
        sb.append(", choiceTitle=");
        g8e.D(sb, this.c, ", commentPlaceholder=", this.d, ", rating=");
        sb.append(this.e);
        sb.append(", layoutOptions=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/FeedbackRatingMapping$LayoutOptions;", "", "Companion", "com/yandex/go/zone/dto/objects/j2", "$serializer", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class LayoutOptions {
        public static final j2 Companion = new j2();
        public static final LayoutOptions e = new LayoutOptions(0);
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;

        public /* synthetic */ LayoutOptions(int i, boolean z, boolean z2, boolean z3, boolean z4) {
            if ((i & 1) == 0) {
                this.a = true;
            } else {
                this.a = z;
            }
            if ((i & 2) == 0) {
                this.b = true;
            } else {
                this.b = z2;
            }
            if ((i & 4) == 0) {
                this.c = true;
            } else {
                this.c = z3;
            }
            if ((i & 8) == 0) {
                this.d = true;
            } else {
                this.d = z4;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LayoutOptions)) {
                return false;
            }
            LayoutOptions layoutOptions = (LayoutOptions) obj;
            return this.a == layoutOptions.a && this.b == layoutOptions.b && this.c == layoutOptions.c && this.d == layoutOptions.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + unr0.e(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return smw0.k(", showSurveyQuestion=", Extension.C_BRAKE, qv10.u("LayoutOptions(showTextHint=", ", showTextCommentInput=", ", choiceTitleBeforeBadges=", this.a, this.b), this.c, this.d);
        }

        public LayoutOptions(int i) {
            this.a = true;
            this.b = true;
            this.c = true;
            this.d = true;
        }

        public LayoutOptions() {
            this(0);
        }
    }

    public FeedbackRatingMapping() {
        FeedbackBadgeChoice$FeedbackBadgeType feedbackBadgeChoice$FeedbackBadgeType = FeedbackBadgeChoice$FeedbackBadgeType.TEXT;
        LayoutOptions.Companion.getClass();
        this.a = EmptyList.a;
        this.b = feedbackBadgeChoice$FeedbackBadgeType;
        this.c = "";
        this.d = null;
        this.e = 0;
        this.f = LayoutOptions.e;
    }
}
