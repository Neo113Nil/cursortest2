package com.yandex.go.preorder.suggested.menu.experiment;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jsq0;
import defpackage.ksq0;
import defpackage.r6u0;
import defpackage.s6u0;
import defpackage.w0v0;
import defpackage.w96;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.map_common.image.StaticMapImageConfig$MapType;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0005\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/preorder/suggested/menu/experiment/SuggestMenuExperiment;", "Lw96;", "Lc6z;", "Companion", "SuggestTypeKeys", "ErrorScreen", "ContentDescriptions", "com/yandex/go/preorder/suggested/menu/experiment/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SuggestMenuExperiment extends w96 implements c6z {
    public static final a Companion = new a();
    public static final i3y[] o;
    public static final SuggestMenuExperiment p;
    public final boolean b;
    public final Map c;
    public final boolean d;
    public final boolean e;
    public final SuggestTypeKeys f;
    public final SuggestTypeKeys g;
    public final ErrorScreen h;
    public final ContentDescriptions i;
    public final jsq0 j;
    public final String k;
    public final Integer l;
    public final List m;
    public final s6u0 n;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        o = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new w0v0(10)), null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new w0v0(11)), null, null, kotlin.a.b(lazyThreadSafetyMode, new w0v0(12))};
        p = new SuggestMenuExperiment(0);
    }

    public /* synthetic */ SuggestMenuExperiment(int i, boolean z, Map map, boolean z2, boolean z3, SuggestTypeKeys suggestTypeKeys, SuggestTypeKeys suggestTypeKeys2, ErrorScreen errorScreen, ContentDescriptions contentDescriptions, jsq0 jsq0Var, String str, Integer num, List list) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = false;
        } else {
            this.d = z2;
        }
        if ((i & 8) == 0) {
            this.e = false;
        } else {
            this.e = z3;
        }
        if ((i & 16) == 0) {
            this.f = new SuggestTypeKeys(0);
        } else {
            this.f = suggestTypeKeys;
        }
        if ((i & 32) == 0) {
            this.g = new SuggestTypeKeys(0);
        } else {
            this.g = suggestTypeKeys2;
        }
        if ((i & 64) == 0) {
            this.h = new ErrorScreen(0);
        } else {
            this.h = errorScreen;
        }
        if ((i & 128) == 0) {
            this.i = new ContentDescriptions(0);
        } else {
            this.i = contentDescriptions;
        }
        if ((i & 256) == 0) {
            this.j = ksq0.a;
        } else {
            this.j = jsq0Var;
        }
        if ((i & 512) == 0) {
            this.k = "";
        } else {
            this.k = str;
        }
        if ((i & 1024) == 0) {
            this.l = null;
        } else {
            this.l = num;
        }
        if ((i & 2048) == 0) {
            this.m = EmptyList.a;
        } else {
            this.m = list;
        }
        Integer num2 = (Integer) kotlin.collections.a.R(this.m);
        Integer num3 = this.m.size() == 2 ? (Integer) this.m.get(1) : null;
        Integer num4 = this.l;
        r6u0 r6u0Var = StaticMapImageConfig$MapType.Companion;
        String str2 = this.k;
        r6u0Var.getClass();
        this.n = new s6u0(num2, num3, num4, r6u0.a(str2));
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/suggested/menu/experiment/SuggestMenuExperiment$SuggestTypeKeys;", "", "Companion", "$serializer", "com/yandex/go/preorder/suggested/menu/experiment/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final class SuggestTypeKeys {
        public static final d Companion = new d();
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ SuggestTypeKeys(int i, String str, String str2, String str3) {
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
        }

        public SuggestTypeKeys(int i) {
            this.a = null;
            this.b = null;
            this.c = null;
        }

        public SuggestTypeKeys() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/suggested/menu/experiment/SuggestMenuExperiment$ContentDescriptions;", "", "Companion", "$serializer", "com/yandex/go/preorder/suggested/menu/experiment/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final class ContentDescriptions {
        public static final b Companion = new b();
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ ContentDescriptions(int i, String str, String str2, String str3) {
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

        public ContentDescriptions(int i) {
            this.a = "";
            this.b = "";
            this.c = "";
        }

        public ContentDescriptions() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/suggested/menu/experiment/SuggestMenuExperiment$ErrorScreen;", "", "Companion", "$serializer", "com/yandex/go/preorder/suggested/menu/experiment/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final class ErrorScreen {
        public static final c Companion = new c();
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

    public SuggestMenuExperiment() {
        this(0);
    }

    public SuggestMenuExperiment(int i) {
        Map f = kotlin.collections.b.f();
        SuggestTypeKeys suggestTypeKeys = new SuggestTypeKeys(0);
        SuggestTypeKeys suggestTypeKeys2 = new SuggestTypeKeys(0);
        ErrorScreen errorScreen = new ErrorScreen(0);
        ContentDescriptions contentDescriptions = new ContentDescriptions(0);
        jsq0 jsq0Var = ksq0.a;
        this.b = false;
        this.c = f;
        this.d = false;
        this.e = false;
        this.f = suggestTypeKeys;
        this.g = suggestTypeKeys2;
        this.h = errorScreen;
        this.i = contentDescriptions;
        this.j = jsq0Var;
        this.k = "";
        this.l = null;
        EmptyList emptyList = EmptyList.a;
        this.m = emptyList;
        Integer num = (Integer) kotlin.collections.a.R(emptyList);
        StaticMapImageConfig$MapType.Companion.getClass();
        this.n = new s6u0(num, (Integer) null, (Integer) null, r6u0.a(""));
    }
}
