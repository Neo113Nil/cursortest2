package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.taxi.order.models.api.response.status.RideCardTimerDto;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.unr0;
import defpackage.x1z0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/taxi/order/models/api/response/TimelineAdditionalOrderOptionButtons$SingleAdditionalOrderOptionButton", "Lcom/yandex/go/taxi/order/models/api/response/o8;", "Companion", "AdditionalOrderOptionButton", "AdditionalOrderOptionButtonAction", "$serializer", "com/yandex/go/taxi/order/models/api/response/m8", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TimelineAdditionalOrderOptionButtons$SingleAdditionalOrderOptionButton extends o8 {
    public static final m8 Companion = new m8();
    public final AdditionalOrderOptionButton a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/TimelineAdditionalOrderOptionButtons$SingleAdditionalOrderOptionButton$AdditionalOrderOptionButtonAction;", "", "Companion", "com/yandex/go/taxi/order/models/api/response/l8", "APPLY_OPTION", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class AdditionalOrderOptionButtonAction {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ AdditionalOrderOptionButtonAction[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final AdditionalOrderOptionButtonAction APPLY_OPTION;
        public static final l8 Companion;
        public static final AdditionalOrderOptionButtonAction UNKNOWN;

        static {
            AdditionalOrderOptionButtonAction additionalOrderOptionButtonAction = new AdditionalOrderOptionButtonAction("APPLY_OPTION", 0);
            APPLY_OPTION = additionalOrderOptionButtonAction;
            AdditionalOrderOptionButtonAction additionalOrderOptionButtonAction2 = new AdditionalOrderOptionButtonAction("UNKNOWN", 1);
            UNKNOWN = additionalOrderOptionButtonAction2;
            AdditionalOrderOptionButtonAction[] additionalOrderOptionButtonActionArr = {additionalOrderOptionButtonAction, additionalOrderOptionButtonAction2};
            $VALUES = additionalOrderOptionButtonActionArr;
            $ENTRIES = kotlin.enums.a.a(additionalOrderOptionButtonActionArr);
            Companion = new l8();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new x1z0(19));
        }

        public static AdditionalOrderOptionButtonAction valueOf(String str) {
            return (AdditionalOrderOptionButtonAction) Enum.valueOf(AdditionalOrderOptionButtonAction.class, str);
        }

        public static AdditionalOrderOptionButtonAction[] values() {
            return (AdditionalOrderOptionButtonAction[]) $VALUES.clone();
        }
    }

    public TimelineAdditionalOrderOptionButtons$SingleAdditionalOrderOptionButton(int i, AdditionalOrderOptionButton additionalOrderOptionButton) {
        if ((i & 1) == 0) {
            this.a = new AdditionalOrderOptionButton(0);
        } else {
            this.a = additionalOrderOptionButton;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TimelineAdditionalOrderOptionButtons$SingleAdditionalOrderOptionButton) && jl40.l(this.a, ((TimelineAdditionalOrderOptionButtons$SingleAdditionalOrderOptionButton) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SingleAdditionalOrderOptionButton(button=" + this.a + Extension.C_BRAKE;
    }

    public TimelineAdditionalOrderOptionButtons$SingleAdditionalOrderOptionButton() {
        this.a = new AdditionalOrderOptionButton(0);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/TimelineAdditionalOrderOptionButtons$SingleAdditionalOrderOptionButton$AdditionalOrderOptionButton;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/k8", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class AdditionalOrderOptionButton {
        public static final k8 Companion = new k8();
        public static final i3y[] e;
        public final AdditionalOrderOptionButtonAction a;
        public final String b;
        public final TimelineAdditionalOrderOptionButtons$AdditionalOrderOptionButtonStyle c;
        public final RideCardTimerDto d;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            e = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new x1z0(17)), null, kotlin.a.b(lazyThreadSafetyMode, new x1z0(18)), null};
        }

        public /* synthetic */ AdditionalOrderOptionButton(int i, AdditionalOrderOptionButtonAction additionalOrderOptionButtonAction, String str, TimelineAdditionalOrderOptionButtons$AdditionalOrderOptionButtonStyle timelineAdditionalOrderOptionButtons$AdditionalOrderOptionButtonStyle, RideCardTimerDto rideCardTimerDto) {
            this.a = (i & 1) == 0 ? AdditionalOrderOptionButtonAction.UNKNOWN : additionalOrderOptionButtonAction;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = TimelineAdditionalOrderOptionButtons$AdditionalOrderOptionButtonStyle.MAIN;
            } else {
                this.c = timelineAdditionalOrderOptionButtons$AdditionalOrderOptionButtonStyle;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = rideCardTimerDto;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdditionalOrderOptionButton)) {
                return false;
            }
            AdditionalOrderOptionButton additionalOrderOptionButton = (AdditionalOrderOptionButton) obj;
            return this.a == additionalOrderOptionButton.a && jl40.l(this.b, additionalOrderOptionButton.b) && this.c == additionalOrderOptionButton.c && jl40.l(this.d, additionalOrderOptionButton.d);
        }

        public final int hashCode() {
            int hashCode = (this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31;
            RideCardTimerDto rideCardTimerDto = this.d;
            return hashCode + (rideCardTimerDto == null ? 0 : rideCardTimerDto.hashCode());
        }

        public final String toString() {
            return "AdditionalOrderOptionButton(action=" + this.a + ", title=" + this.b + ", style=" + this.c + ", timer=" + this.d + Extension.C_BRAKE;
        }

        public AdditionalOrderOptionButton() {
            this(0);
        }

        public AdditionalOrderOptionButton(int i) {
            AdditionalOrderOptionButtonAction additionalOrderOptionButtonAction = AdditionalOrderOptionButtonAction.UNKNOWN;
            TimelineAdditionalOrderOptionButtons$AdditionalOrderOptionButtonStyle timelineAdditionalOrderOptionButtons$AdditionalOrderOptionButtonStyle = TimelineAdditionalOrderOptionButtons$AdditionalOrderOptionButtonStyle.MAIN;
            this.a = additionalOrderOptionButtonAction;
            this.b = "";
            this.c = timelineAdditionalOrderOptionButtons$AdditionalOrderOptionButtonStyle;
            this.d = null;
        }
    }
}
