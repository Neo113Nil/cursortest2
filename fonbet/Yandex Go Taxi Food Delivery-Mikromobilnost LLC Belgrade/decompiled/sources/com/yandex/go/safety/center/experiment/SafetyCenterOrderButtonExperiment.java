package com.yandex.go.safety.center.experiment;

import defpackage.b7l0;
import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.w96;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/safety/center/experiment/SafetyCenterOrderButtonExperiment;", "Lw96;", "Lc6z;", "Companion", "SafetyCenterOrderButtonState", "com/yandex/go/safety/center/experiment/q", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SafetyCenterOrderButtonExperiment extends w96 implements c6z {
    public static final q Companion = new q();
    public static final i3y[] h;
    public static final SafetyCenterOrderButtonExperiment i;
    public final boolean b;
    public final Map c;
    public final FormattedText d;
    public final String e;
    public final SafetyCenterOrderButtonState f;
    public final String g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/safety/center/experiment/SafetyCenterOrderButtonExperiment$SafetyCenterOrderButtonState;", "", "Companion", "com/yandex/go/safety/center/experiment/r", "DEFAULT", "ONLY_EXPANDED", "ONLY_COLLAPSED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final class SafetyCenterOrderButtonState {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ SafetyCenterOrderButtonState[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final r Companion;
        public static final SafetyCenterOrderButtonState DEFAULT;
        public static final SafetyCenterOrderButtonState ONLY_COLLAPSED;
        public static final SafetyCenterOrderButtonState ONLY_EXPANDED;

        static {
            SafetyCenterOrderButtonState safetyCenterOrderButtonState = new SafetyCenterOrderButtonState("DEFAULT", 0);
            DEFAULT = safetyCenterOrderButtonState;
            SafetyCenterOrderButtonState safetyCenterOrderButtonState2 = new SafetyCenterOrderButtonState("ONLY_EXPANDED", 1);
            ONLY_EXPANDED = safetyCenterOrderButtonState2;
            SafetyCenterOrderButtonState safetyCenterOrderButtonState3 = new SafetyCenterOrderButtonState("ONLY_COLLAPSED", 2);
            ONLY_COLLAPSED = safetyCenterOrderButtonState3;
            SafetyCenterOrderButtonState[] safetyCenterOrderButtonStateArr = {safetyCenterOrderButtonState, safetyCenterOrderButtonState2, safetyCenterOrderButtonState3};
            $VALUES = safetyCenterOrderButtonStateArr;
            $ENTRIES = kotlin.enums.a.a(safetyCenterOrderButtonStateArr);
            Companion = new r();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new b7l0(16));
        }

        public static SafetyCenterOrderButtonState valueOf(String str) {
            return (SafetyCenterOrderButtonState) Enum.valueOf(SafetyCenterOrderButtonState.class, str);
        }

        public static SafetyCenterOrderButtonState[] values() {
            return (SafetyCenterOrderButtonState[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new b7l0(14)), null, null, kotlin.a.b(lazyThreadSafetyMode, new b7l0(15)), null};
        i = new SafetyCenterOrderButtonExperiment(0);
    }

    public /* synthetic */ SafetyCenterOrderButtonExperiment(int i2, boolean z, Map map, FormattedText formattedText, String str, SafetyCenterOrderButtonState safetyCenterOrderButtonState, String str2) {
        this.b = (i2 & 1) == 0 ? false : z;
        if ((i2 & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i2 & 4) == 0) {
            this.d = FormattedText.c;
        } else {
            this.d = formattedText;
        }
        if ((i2 & 8) == 0) {
            this.e = "";
        } else {
            this.e = str;
        }
        if ((i2 & 16) == 0) {
            this.f = SafetyCenterOrderButtonState.DEFAULT;
        } else {
            this.f = safetyCenterOrderButtonState;
        }
        if ((i2 & 32) == 0) {
            this.g = "";
        } else {
            this.g = str2;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getB() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getC() {
        return this.b;
    }

    public SafetyCenterOrderButtonExperiment() {
        this(0);
    }

    public SafetyCenterOrderButtonExperiment(int i2) {
        Map f = kotlin.collections.b.f();
        FormattedText formattedText = FormattedText.c;
        SafetyCenterOrderButtonState safetyCenterOrderButtonState = SafetyCenterOrderButtonState.DEFAULT;
        this.b = false;
        this.c = f;
        this.d = formattedText;
        this.e = "";
        this.f = safetyCenterOrderButtonState;
        this.g = "";
    }
}
