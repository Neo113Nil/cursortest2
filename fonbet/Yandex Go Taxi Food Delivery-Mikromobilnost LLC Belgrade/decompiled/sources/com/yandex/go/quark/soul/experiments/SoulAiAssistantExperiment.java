package com.yandex.go.quark.soul.experiments;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.tqs0;
import defpackage.w96;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0005\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/quark/soul/experiments/SoulAiAssistantExperiment;", "Lw96;", "Lc6z;", "Companion", "ErrorScreen", "Onboarding", "Navbar", "com/yandex/go/quark/soul/experiments/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SoulAiAssistantExperiment extends w96 implements c6z {
    public static final a Companion = new a();
    public static final i3y[] h = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tqs0(26)), null, null, null, null, null};
    public static final SoulAiAssistantExperiment i = new SoulAiAssistantExperiment(0);
    public final Map b;
    public final boolean c;
    public final boolean d;
    public final ErrorScreen e;
    public final Onboarding f;
    public final Navbar g;

    public /* synthetic */ SoulAiAssistantExperiment(int i2, Map map, boolean z, boolean z2, ErrorScreen errorScreen, Onboarding onboarding, Navbar navbar) {
        this.b = (i2 & 1) == 0 ? kotlin.collections.b.f() : map;
        if ((i2 & 2) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
        if ((i2 & 4) == 0) {
            this.d = false;
        } else {
            this.d = z2;
        }
        if ((i2 & 8) == 0) {
            this.e = new ErrorScreen(0);
        } else {
            this.e = errorScreen;
        }
        if ((i2 & 16) == 0) {
            this.f = null;
        } else {
            this.f = onboarding;
        }
        if ((i2 & 32) == 0) {
            this.g = new Navbar(0);
        } else {
            this.g = navbar;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getB() {
        return this.b;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.c;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/quark/soul/experiments/SoulAiAssistantExperiment$Navbar;", "", "Companion", "Mode", "$serializer", "com/yandex/go/quark/soul/experiments/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Navbar {
        public static final c Companion = new c();
        public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tqs0(27))};
        public final Mode a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/quark/soul/experiments/SoulAiAssistantExperiment$Navbar$Mode;", "", "Companion", "com/yandex/go/quark/soul/experiments/d", "Native", "Web", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class Mode {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ Mode[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final d Companion;
            public static final Mode Native;
            public static final Mode Web;

            static {
                Mode mode = new Mode("Native", 0);
                Native = mode;
                Mode mode2 = new Mode("Web", 1);
                Web = mode2;
                Mode[] modeArr = {mode, mode2};
                $VALUES = modeArr;
                $ENTRIES = kotlin.enums.a.a(modeArr);
                Companion = new d();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tqs0(28));
            }

            public static Mode valueOf(String str) {
                return (Mode) Enum.valueOf(Mode.class, str);
            }

            public static Mode[] values() {
                return (Mode[]) $VALUES.clone();
            }
        }

        public /* synthetic */ Navbar(int i, Mode mode) {
            if ((i & 1) == 0) {
                this.a = Mode.Native;
            } else {
                this.a = mode;
            }
        }

        public Navbar() {
            this(0);
        }

        public Navbar(int i) {
            this.a = Mode.Native;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/quark/soul/experiments/SoulAiAssistantExperiment$Onboarding;", "", "Companion", "ShowPolicy", "$serializer", "com/yandex/go/quark/soul/experiments/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Onboarding {
        public static final e Companion = new e();
        public final String a;
        public final ShowPolicy b;

        public /* synthetic */ Onboarding(int i, String str, ShowPolicy showPolicy) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = new ShowPolicy(0);
            } else {
                this.b = showPolicy;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/quark/soul/experiments/SoulAiAssistantExperiment$Onboarding$ShowPolicy;", "", "Companion", "$serializer", "com/yandex/go/quark/soul/experiments/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class ShowPolicy {
            public static final f Companion = new f();
            public final String a;
            public final int b;

            public /* synthetic */ ShowPolicy(int i, String str, int i2) {
                this.a = (i & 1) == 0 ? "" : str;
                if ((i & 2) == 0) {
                    this.b = 1;
                } else {
                    this.b = i2;
                }
            }

            public ShowPolicy(int i) {
                this.a = "";
                this.b = 1;
            }

            public ShowPolicy() {
                this(0);
            }
        }

        public Onboarding() {
            ShowPolicy showPolicy = new ShowPolicy(0);
            this.a = "";
            this.b = showPolicy;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/quark/soul/experiments/SoulAiAssistantExperiment$ErrorScreen;", "", "Companion", "$serializer", "com/yandex/go/quark/soul/experiments/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ErrorScreen {
        public static final b Companion = new b();
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ ErrorScreen(int i, String str, String str2, String str3) {
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
                this.c = "";
            } else {
                this.c = str3;
            }
        }

        public ErrorScreen(int i) {
            this.a = "";
            this.b = "";
            this.c = "";
        }

        public ErrorScreen() {
            this(0);
        }
    }

    public SoulAiAssistantExperiment() {
        this(0);
    }

    public SoulAiAssistantExperiment(int i2) {
        Map f = kotlin.collections.b.f();
        ErrorScreen errorScreen = new ErrorScreen(0);
        Navbar navbar = new Navbar(0);
        this.b = f;
        this.c = false;
        this.d = false;
        this.e = errorScreen;
        this.f = null;
        this.g = navbar;
    }
}
