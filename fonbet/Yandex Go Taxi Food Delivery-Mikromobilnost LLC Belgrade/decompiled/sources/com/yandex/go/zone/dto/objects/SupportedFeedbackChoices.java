package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.unr0;
import defpackage.w5w0;
import defpackage.xvz;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/SupportedFeedbackChoices;", "", "Companion", "com/yandex/go/zone/dto/objects/p5", "$serializer", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SupportedFeedbackChoices {
    public static final p5 Companion = new p5();
    public static final i3y[] i;
    public static final SupportedFeedbackChoices j;
    public final String a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;
    public final CancelReasonsPresentation f;
    public final CancelReasonsGrouped g;
    public final boolean h;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        i = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new w5w0(25)), kotlin.a.b(lazyThreadSafetyMode, new w5w0(26)), kotlin.a.b(lazyThreadSafetyMode, new w5w0(27)), kotlin.a.b(lazyThreadSafetyMode, new w5w0(28)), null, null, null};
        j = new SupportedFeedbackChoices(0);
    }

    public /* synthetic */ SupportedFeedbackChoices(int i2, String str, List list, List list2, List list3, List list4, CancelReasonsPresentation cancelReasonsPresentation, CancelReasonsGrouped cancelReasonsGrouped, boolean z) {
        this.a = (i2 & 1) == 0 ? "" : str;
        int i3 = i2 & 2;
        EmptyList emptyList = EmptyList.a;
        if (i3 == 0) {
            this.b = emptyList;
        } else {
            this.b = list;
        }
        if ((i2 & 4) == 0) {
            this.c = emptyList;
        } else {
            this.c = list2;
        }
        if ((i2 & 8) == 0) {
            this.d = emptyList;
        } else {
            this.d = list3;
        }
        if ((i2 & 16) == 0) {
            this.e = emptyList;
        } else {
            this.e = list4;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = cancelReasonsPresentation;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = cancelReasonsGrouped;
        }
        if ((i2 & 128) == 0) {
            this.h = false;
        } else {
            this.h = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SupportedFeedbackChoices)) {
            return false;
        }
        SupportedFeedbackChoices supportedFeedbackChoices = (SupportedFeedbackChoices) obj;
        return jl40.l(this.a, supportedFeedbackChoices.a) && jl40.l(this.b, supportedFeedbackChoices.b) && jl40.l(this.c, supportedFeedbackChoices.c) && jl40.l(this.d, supportedFeedbackChoices.d) && jl40.l(this.e, supportedFeedbackChoices.e) && jl40.l(this.f, supportedFeedbackChoices.f) && jl40.l(this.g, supportedFeedbackChoices.g) && this.h == supportedFeedbackChoices.h;
    }

    public final int hashCode() {
        int c = unr0.c(unr0.c(unr0.c(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        CancelReasonsPresentation cancelReasonsPresentation = this.f;
        int hashCode = (c + (cancelReasonsPresentation == null ? 0 : cancelReasonsPresentation.hashCode())) * 31;
        CancelReasonsGrouped cancelReasonsGrouped = this.g;
        return Boolean.hashCode(this.h) + ((hashCode + (cancelReasonsGrouped != null ? cancelReasonsGrouped.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder r = xvz.r("SupportedFeedbackChoices(textHint=", this.a, ", feedbackBadges=", this.b, ", feedbackRatingMappings=");
        nnm.w(r, this.c, ", cancelledReasons=", this.d, ", lowRatingReasons=");
        r.append(this.e);
        r.append(", cancelReasonsPresentation=");
        r.append(this.f);
        r.append(", cancelReasonsGrouped=");
        r.append(this.g);
        r.append(", forceAskCancelReasonsOnAllRideStates=");
        r.append(this.h);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }

    public SupportedFeedbackChoices(int i2) {
        this.a = "";
        EmptyList emptyList = EmptyList.a;
        this.b = emptyList;
        this.c = emptyList;
        this.d = emptyList;
        this.e = emptyList;
        this.f = null;
        this.g = null;
        this.h = false;
    }

    public SupportedFeedbackChoices() {
        this(0);
    }
}
