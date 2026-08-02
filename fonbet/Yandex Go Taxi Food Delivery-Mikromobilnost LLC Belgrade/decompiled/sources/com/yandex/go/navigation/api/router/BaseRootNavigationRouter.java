package com.yandex.go.navigation.api.router;

import com.yandex.go.navigation.screen.api.Screen;
import defpackage.h55;
import defpackage.k4o;
import defpackage.lwk0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes8.dex */
public abstract class BaseRootNavigationRouter extends h55 implements lwk0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/navigation/api/router/BaseRootNavigationRouter$AnimationType;", "", "STAR_WARS", "SLIDE", JCP.RAW_PREFIX, "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class AnimationType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ AnimationType[] $VALUES;
        public static final AnimationType NONE;
        public static final AnimationType SLIDE;
        public static final AnimationType STAR_WARS;

        static {
            AnimationType animationType = new AnimationType("STAR_WARS", 0);
            STAR_WARS = animationType;
            AnimationType animationType2 = new AnimationType("SLIDE", 1);
            SLIDE = animationType2;
            AnimationType animationType3 = new AnimationType(JCP.RAW_PREFIX, 2);
            NONE = animationType3;
            AnimationType[] animationTypeArr = {animationType, animationType2, animationType3};
            $VALUES = animationTypeArr;
            $ENTRIES = kotlin.enums.a.a(animationTypeArr);
        }

        public static AnimationType valueOf(String str) {
            return (AnimationType) Enum.valueOf(AnimationType.class, str);
        }

        public static AnimationType[] values() {
            return (AnimationType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/navigation/api/router/BaseRootNavigationRouter$Background;", "", "MAP", "BLANK", JCP.RAW_PREFIX, "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Background {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Background[] $VALUES;
        public static final Background BLANK;
        public static final Background MAP;
        public static final Background NONE;

        static {
            Background background = new Background("MAP", 0);
            MAP = background;
            Background background2 = new Background("BLANK", 1);
            BLANK = background2;
            Background background3 = new Background(JCP.RAW_PREFIX, 2);
            NONE = background3;
            Background[] backgroundArr = {background, background2, background3};
            $VALUES = backgroundArr;
            $ENTRIES = kotlin.enums.a.a(backgroundArr);
        }

        public static k4o a() {
            return $ENTRIES;
        }

        public static Background valueOf(String str) {
            return (Background) Enum.valueOf(Background.class, str);
        }

        public static Background[] values() {
            return (Background[]) $VALUES.clone();
        }
    }

    public BaseRootNavigationRouter() {
        super(null);
    }

    public abstract a P();

    public static final class a {
        public final Screen a;
        public final Background b;
        public final AnimationType c;
        public final boolean d;

        public a(Screen screen, Background background, AnimationType animationType, int i) {
            screen = (i & 1) != 0 ? Screen.UNSUPPORTED : screen;
            background = (i & 2) != 0 ? Background.BLANK : background;
            animationType = (i & 4) != 0 ? AnimationType.STAR_WARS : animationType;
            boolean z = (i & 8) == 0;
            this.a = screen;
            this.b = background;
            this.c = animationType;
            this.d = z;
        }

        public a() {
            this(null, null, null, 15);
        }
    }
}
