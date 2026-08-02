package com.yandex.go.modals.progress.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* loaded from: classes12.dex */
public final class CircularProgressRouter$Payload {
    public final Animation a;
    public final boolean b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/modals/progress/api/CircularProgressRouter$Payload$Animation;", "", "None", "Slide", "Fade", "go-client-android.features.modals.progress:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Animation {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Animation[] $VALUES;
        public static final Animation Fade;
        public static final Animation None;
        public static final Animation Slide;

        static {
            Animation animation = new Animation("None", 0);
            None = animation;
            Animation animation2 = new Animation("Slide", 1);
            Slide = animation2;
            Animation animation3 = new Animation("Fade", 2);
            Fade = animation3;
            Animation[] animationArr = {animation, animation2, animation3};
            $VALUES = animationArr;
            $ENTRIES = a.a(animationArr);
        }

        public static Animation valueOf(String str) {
            return (Animation) Enum.valueOf(Animation.class, str);
        }

        public static Animation[] values() {
            return (Animation[]) $VALUES.clone();
        }
    }

    public CircularProgressRouter$Payload(Animation animation, boolean z, int i) {
        animation = (i & 1) != 0 ? Animation.Slide : animation;
        z = (i & 4) != 0 ? false : z;
        this.a = animation;
        this.b = z;
    }

    public CircularProgressRouter$Payload() {
        this(null, false, 7);
    }
}
