package com.yandex.go.navigator.experiment;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ic50;
import defpackage.w96;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/navigator/experiment/NavigatorLanguageSettingAvailabilityExperiment;", "Lw96;", "Lc6z;", "Companion", "com/yandex/go/navigator/experiment/b", "Language", "Voice", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NavigatorLanguageSettingAvailabilityExperiment extends w96 implements c6z {
    public static final b Companion = new b();
    public static final i3y[] f;
    public static final NavigatorLanguageSettingAvailabilityExperiment g;
    public final boolean b;
    public final List c;
    public final String d;
    public final Map e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new ic50(1)), null, kotlin.a.b(lazyThreadSafetyMode, new ic50(2))};
        g = new NavigatorLanguageSettingAvailabilityExperiment(0);
    }

    public /* synthetic */ NavigatorLanguageSettingAvailabilityExperiment(int i, String str, List list, Map map, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        this.c = (i & 2) == 0 ? EmptyList.a : list;
        this.d = (i & 4) == 0 ? null : str;
        if ((i & 8) == 0) {
            this.e = kotlin.collections.b.f();
        } else {
            this.e = map;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.e;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/navigator/experiment/NavigatorLanguageSettingAvailabilityExperiment$Voice;", "", "Companion", "$serializer", "com/yandex/go/navigator/experiment/d", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Voice {
        public static final d Companion = new d();
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ Voice(int i, String str, String str2, String str3) {
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

        public Voice() {
            this.a = "";
            this.b = "";
            this.c = "";
        }
    }

    public NavigatorLanguageSettingAvailabilityExperiment() {
        this(0);
    }

    public NavigatorLanguageSettingAvailabilityExperiment(int i) {
        Map f2 = kotlin.collections.b.f();
        this.b = false;
        this.c = EmptyList.a;
        this.d = null;
        this.e = f2;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/navigator/experiment/NavigatorLanguageSettingAvailabilityExperiment$Language;", "", "Companion", "$serializer", "com/yandex/go/navigator/experiment/c", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Language {
        public static final c Companion = new c();
        public static final i3y[] e = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ic50(3))};
        public final String a;
        public final String b;
        public final String c;
        public final List d;

        public /* synthetic */ Language(String str, int i, String str2, String str3, List list) {
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
            if ((i & 8) == 0) {
                this.d = EmptyList.a;
            } else {
                this.d = list;
            }
        }

        public Language() {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = EmptyList.a;
        }
    }
}
