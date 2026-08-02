package com.yandex.go.suggest.impl.data.experiments;

import com.adjust.sdk.Constants;
import defpackage.c6z;
import defpackage.cyv0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.w5w0;
import defpackage.xn11;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0006\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/suggest/impl/data/experiments/SuperappSuggestExperiment;", "Lxn11;", "Lc6z;", "Companion", "SearchTrailButton", "LoadingStrategy", "SearchScaffoldStyle", "BackendErrorAction", "com/yandex/go/suggest/impl/data/experiments/d", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SuperappSuggestExperiment implements xn11, c6z {
    public static final d Companion = new d();
    public static final i3y[] m;
    public static final SuperappSuggestExperiment n;
    public final Map b;
    public final int c;
    public final int d;
    public final LoadingStrategy e;
    public final int f;
    public final SearchScaffoldStyle g;
    public final SearchTrailButton h;
    public final String i;
    public final boolean j;
    public final Boolean k;
    public final BackendErrorAction l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/suggest/impl/data/experiments/SuperappSuggestExperiment$LoadingStrategy;", "", "Companion", "com/yandex/go/suggest/impl/data/experiments/e", "ASYNC_RELOADING", "FULL_REQUEST", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class LoadingStrategy {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ LoadingStrategy[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final LoadingStrategy ASYNC_RELOADING;
        public static final e Companion;
        public static final LoadingStrategy FULL_REQUEST;

        static {
            LoadingStrategy loadingStrategy = new LoadingStrategy("ASYNC_RELOADING", 0);
            ASYNC_RELOADING = loadingStrategy;
            LoadingStrategy loadingStrategy2 = new LoadingStrategy("FULL_REQUEST", 1);
            FULL_REQUEST = loadingStrategy2;
            LoadingStrategy[] loadingStrategyArr = {loadingStrategy, loadingStrategy2};
            $VALUES = loadingStrategyArr;
            $ENTRIES = kotlin.enums.a.a(loadingStrategyArr);
            Companion = new e();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w5w0(15));
        }

        public static LoadingStrategy valueOf(String str) {
            return (LoadingStrategy) Enum.valueOf(LoadingStrategy.class, str);
        }

        public static LoadingStrategy[] values() {
            return (LoadingStrategy[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/suggest/impl/data/experiments/SuperappSuggestExperiment$SearchScaffoldStyle;", "", "", "identifier", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "com/yandex/go/suggest/impl/data/experiments/f", "NORMAL", "FLOATING_INPUT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class SearchScaffoldStyle {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ SearchScaffoldStyle[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final f Companion;
        public static final SearchScaffoldStyle FLOATING_INPUT;
        public static final SearchScaffoldStyle NORMAL;
        private final String identifier;

        static {
            SearchScaffoldStyle searchScaffoldStyle = new SearchScaffoldStyle("NORMAL", 0, Constants.NORMAL);
            NORMAL = searchScaffoldStyle;
            SearchScaffoldStyle searchScaffoldStyle2 = new SearchScaffoldStyle("FLOATING_INPUT", 1, "floating_input");
            FLOATING_INPUT = searchScaffoldStyle2;
            SearchScaffoldStyle[] searchScaffoldStyleArr = {searchScaffoldStyle, searchScaffoldStyle2};
            $VALUES = searchScaffoldStyleArr;
            $ENTRIES = kotlin.enums.a.a(searchScaffoldStyleArr);
            Companion = new f();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w5w0(16));
        }

        public SearchScaffoldStyle(String str, int i, String str2) {
            this.identifier = str2;
        }

        public static SearchScaffoldStyle valueOf(String str) {
            return (SearchScaffoldStyle) Enum.valueOf(SearchScaffoldStyle.class, str);
        }

        public static SearchScaffoldStyle[] values() {
            return (SearchScaffoldStyle[]) $VALUES.clone();
        }

        /* renamed from: b, reason: from getter */
        public final String getIdentifier() {
            return this.identifier;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        m = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new w5w0(12)), null, null, kotlin.a.b(lazyThreadSafetyMode, new w5w0(13)), null, kotlin.a.b(lazyThreadSafetyMode, new w5w0(14)), null, null, null, null, null};
        n = new SuperappSuggestExperiment(0);
    }

    public /* synthetic */ SuperappSuggestExperiment(int i, Map map, int i2, int i3, LoadingStrategy loadingStrategy, int i4, SearchScaffoldStyle searchScaffoldStyle, SearchTrailButton searchTrailButton, String str, boolean z, Boolean bool, BackendErrorAction backendErrorAction) {
        this.b = (i & 1) == 0 ? kotlin.collections.b.f() : map;
        if ((i & 2) == 0) {
            this.c = 1000;
        } else {
            this.c = i2;
        }
        if ((i & 4) == 0) {
            this.d = 500;
        } else {
            this.d = i3;
        }
        if ((i & 8) == 0) {
            this.e = LoadingStrategy.FULL_REQUEST;
        } else {
            this.e = loadingStrategy;
        }
        if ((i & 16) == 0) {
            this.f = 0;
        } else {
            this.f = i4;
        }
        if ((i & 32) == 0) {
            this.g = SearchScaffoldStyle.NORMAL;
        } else {
            this.g = searchScaffoldStyle;
        }
        if ((i & 64) == 0) {
            this.h = null;
        } else {
            this.h = searchTrailButton;
        }
        if ((i & 128) == 0) {
            this.i = null;
        } else {
            this.i = str;
        }
        if ((i & 256) == 0) {
            this.j = false;
        } else {
            this.j = z;
        }
        if ((i & 512) == 0) {
            this.k = null;
        } else {
            this.k = bool;
        }
        if ((i & 1024) == 0) {
            this.l = null;
        } else {
            this.l = backendErrorAction;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/suggest/impl/data/experiments/SuperappSuggestExperiment$BackendErrorAction;", "", "Companion", "$serializer", "com/yandex/go/suggest/impl/data/experiments/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class BackendErrorAction {
        public static final c Companion = new c();
        public final boolean a;
        public final String b;

        public /* synthetic */ BackendErrorAction(int i, String str, boolean z) {
            this.a = (i & 1) == 0 ? false : z;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
        }

        public BackendErrorAction() {
            this.a = false;
            this.b = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/suggest/impl/data/experiments/SuperappSuggestExperiment$SearchTrailButton;", "", "Companion", "TextChangeBehaviour", "$serializer", "com/yandex/go/suggest/impl/data/experiments/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class SearchTrailButton {
        public static final g Companion = new g();
        public static final i3y[] g = {null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new cyv0(12)), null};
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final TextChangeBehaviour e;
        public final String f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/suggest/impl/data/experiments/SuperappSuggestExperiment$SearchTrailButton$TextChangeBehaviour;", "", "Companion", "com/yandex/go/suggest/impl/data/experiments/h", JCP.RAW_PREFIX, "CHANGE_VISIBLE", "CHANGE_ENABLE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        /* loaded from: classes14.dex */
        public static final class TextChangeBehaviour {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ TextChangeBehaviour[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final TextChangeBehaviour CHANGE_ENABLE;
            public static final TextChangeBehaviour CHANGE_VISIBLE;
            public static final h Companion;
            public static final TextChangeBehaviour NONE;

            static {
                TextChangeBehaviour textChangeBehaviour = new TextChangeBehaviour(JCP.RAW_PREFIX, 0);
                NONE = textChangeBehaviour;
                TextChangeBehaviour textChangeBehaviour2 = new TextChangeBehaviour("CHANGE_VISIBLE", 1);
                CHANGE_VISIBLE = textChangeBehaviour2;
                TextChangeBehaviour textChangeBehaviour3 = new TextChangeBehaviour("CHANGE_ENABLE", 2);
                CHANGE_ENABLE = textChangeBehaviour3;
                TextChangeBehaviour[] textChangeBehaviourArr = {textChangeBehaviour, textChangeBehaviour2, textChangeBehaviour3};
                $VALUES = textChangeBehaviourArr;
                $ENTRIES = kotlin.enums.a.a(textChangeBehaviourArr);
                Companion = new h();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new cyv0(13));
            }

            public static TextChangeBehaviour valueOf(String str) {
                return (TextChangeBehaviour) Enum.valueOf(TextChangeBehaviour.class, str);
            }

            public static TextChangeBehaviour[] values() {
                return (TextChangeBehaviour[]) $VALUES.clone();
            }
        }

        public /* synthetic */ SearchTrailButton(int i, String str, String str2, String str3, String str4, TextChangeBehaviour textChangeBehaviour, String str5) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str4;
            }
            if ((i & 16) == 0) {
                this.e = TextChangeBehaviour.NONE;
            } else {
                this.e = textChangeBehaviour;
            }
            if ((i & 32) == 0) {
                this.f = "";
            } else {
                this.f = str5;
            }
        }

        public SearchTrailButton() {
            TextChangeBehaviour textChangeBehaviour = TextChangeBehaviour.NONE;
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = textChangeBehaviour;
            this.f = "";
        }
    }

    public SuperappSuggestExperiment() {
        this(0);
    }

    public SuperappSuggestExperiment(int i) {
        Map f = kotlin.collections.b.f();
        LoadingStrategy loadingStrategy = LoadingStrategy.FULL_REQUEST;
        SearchScaffoldStyle searchScaffoldStyle = SearchScaffoldStyle.NORMAL;
        this.b = f;
        this.c = 1000;
        this.d = 500;
        this.e = loadingStrategy;
        this.f = 0;
        this.g = searchScaffoldStyle;
        this.h = null;
        this.i = null;
        this.j = false;
        this.k = null;
        this.l = null;
    }
}
