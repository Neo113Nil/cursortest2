package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.juc;
import defpackage.k4o;
import defpackage.unr0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/CompanionHeader;", "", "Companion", "Animation", "AnimationSettings", "$serializer", "com/yandex/go/taxi/order/models/api/response/b0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CompanionHeader {
    public static final b0 Companion = new b0();
    public static final i3y[] h = {null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new juc(3)), null};
    public final CompanionHeaderTitle a;
    public final CompanionHeaderSubtitle b;
    public final Car c;
    public final Chevron d;
    public final String e;
    public final Animation f;
    public final AnimationSettings g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/CompanionHeader$Animation;", "", "", "localDataKey", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "com/yandex/go/taxi/order/models/api/response/z", "RADAR_ANIMATION", "FOUND_COMPANION_ANIMATION", "WALK_ANIMATION", "WAVE_ANIMATION", "UNSUPPORTED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Animation {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Animation[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final z Companion;
        public static final Animation FOUND_COMPANION_ANIMATION;
        public static final Animation RADAR_ANIMATION;
        public static final Animation UNSUPPORTED;
        public static final Animation WALK_ANIMATION;
        public static final Animation WAVE_ANIMATION;
        private final String localDataKey;

        static {
            Animation animation = new Animation("RADAR_ANIMATION", 0, "RADAR_ANIMATION");
            RADAR_ANIMATION = animation;
            Animation animation2 = new Animation("FOUND_COMPANION_ANIMATION", 1, "FOUND_COMPANION_ANIMATION");
            FOUND_COMPANION_ANIMATION = animation2;
            Animation animation3 = new Animation("WALK_ANIMATION", 2, "WALK_ANIMATION");
            WALK_ANIMATION = animation3;
            Animation animation4 = new Animation("WAVE_ANIMATION", 3, "WAVE_ANIMATION");
            WAVE_ANIMATION = animation4;
            Animation animation5 = new Animation("UNSUPPORTED", 4, "UNSUPPORTED");
            UNSUPPORTED = animation5;
            Animation[] animationArr = {animation, animation2, animation3, animation4, animation5};
            $VALUES = animationArr;
            $ENTRIES = kotlin.enums.a.a(animationArr);
            Companion = new z();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new juc(4));
        }

        public Animation(String str, int i, String str2) {
            this.localDataKey = str2;
        }

        public static Animation valueOf(String str) {
            return (Animation) Enum.valueOf(Animation.class, str);
        }

        public static Animation[] values() {
            return (Animation[]) $VALUES.clone();
        }

        /* renamed from: b, reason: from getter */
        public final String getLocalDataKey() {
            return this.localDataKey;
        }
    }

    public CompanionHeader(int i, CompanionHeaderTitle companionHeaderTitle, CompanionHeaderSubtitle companionHeaderSubtitle, Car car, Chevron chevron, String str, Animation animation, AnimationSettings animationSettings) {
        this.a = (i & 1) == 0 ? new CompanionHeaderTitle(0) : companionHeaderTitle;
        if ((i & 2) == 0) {
            this.b = new CompanionHeaderSubtitle(0);
        } else {
            this.b = companionHeaderSubtitle;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = car;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = chevron;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str;
        }
        if ((i & 32) == 0) {
            this.f = Animation.UNSUPPORTED;
        } else {
            this.f = animation;
        }
        if ((i & 64) != 0) {
            this.g = animationSettings;
        } else {
            AnimationSettings.Companion.getClass();
            this.g = AnimationSettings.c;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompanionHeader)) {
            return false;
        }
        CompanionHeader companionHeader = (CompanionHeader) obj;
        return jl40.l(this.a, companionHeader.a) && jl40.l(this.b, companionHeader.b) && jl40.l(this.c, companionHeader.c) && jl40.l(this.d, companionHeader.d) && jl40.l(this.e, companionHeader.e) && this.f == companionHeader.f && jl40.l(this.g, companionHeader.g);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b.a);
        Car car = this.c;
        int hashCode = (b + (car == null ? 0 : Boolean.hashCode(car.a))) * 31;
        Chevron chevron = this.d;
        return this.g.hashCode() + ((this.f.hashCode() + unr0.b((hashCode + (chevron != null ? chevron.a.hashCode() : 0)) * 31, 31, this.e)) * 31);
    }

    public final String toString() {
        return "CompanionHeader(title=" + this.a + ", subtitle=" + this.b + ", car=" + this.c + ", chevron=" + this.d + ", imageTag=" + this.e + ", animation=" + this.f + ", animationSettings=" + this.g + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/CompanionHeader$AnimationSettings;", "", "Companion", "com/yandex/go/taxi/order/models/api/response/a0", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class AnimationSettings {
        public static final a0 Companion = new a0();
        public static final AnimationSettings c = new AnimationSettings(0);
        public final Integer a;
        public final long b;

        public /* synthetic */ AnimationSettings(int i, Integer num, long j) {
            this.a = (i & 1) == 0 ? null : num;
            if ((i & 2) == 0) {
                this.b = 0L;
            } else {
                this.b = j;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnimationSettings)) {
                return false;
            }
            AnimationSettings animationSettings = (AnimationSettings) obj;
            return jl40.l(this.a, animationSettings.a) && this.b == animationSettings.b;
        }

        public final int hashCode() {
            Integer num = this.a;
            return Long.hashCode(this.b) + ((num == null ? 0 : num.hashCode()) * 31);
        }

        public final String toString() {
            return "AnimationSettings(repeatCount=" + this.a + ", delay=" + this.b + Extension.C_BRAKE;
        }

        public AnimationSettings(int i) {
            this.a = null;
            this.b = 0L;
        }

        public AnimationSettings() {
            this(0);
        }
    }

    public CompanionHeader() {
        this(0);
    }

    public CompanionHeader(int i) {
        CompanionHeaderTitle companionHeaderTitle = new CompanionHeaderTitle(0);
        CompanionHeaderSubtitle companionHeaderSubtitle = new CompanionHeaderSubtitle(0);
        Animation animation = Animation.UNSUPPORTED;
        AnimationSettings.Companion.getClass();
        this.a = companionHeaderTitle;
        this.b = companionHeaderSubtitle;
        this.c = null;
        this.d = null;
        this.e = "";
        this.f = animation;
        this.g = AnimationSettings.c;
    }
}
