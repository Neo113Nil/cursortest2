package com.yandex.go.payments.shared.details.experiments;

import defpackage.c6z;
import defpackage.evu0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.n96;
import defpackage.ogr;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/payments/shared/details/experiments/ForceZaloginForFamilyExperiment;", "Ln96;", "Lc6z;", "Companion", "Screens", "Screen", "com/yandex/go/payments/shared/details/experiments/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ForceZaloginForFamilyExperiment extends n96 implements c6z {
    public static final a Companion = new a();
    public static final i3y[] e = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ogr(21)), null};
    public static final ForceZaloginForFamilyExperiment f = new ForceZaloginForFamilyExperiment(0);
    public final boolean b;
    public final Map c;
    public final Screens d;

    public /* synthetic */ ForceZaloginForFamilyExperiment(int i, boolean z, Map map, Screens screens) {
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
            this.d = new Screens(0);
        } else {
            this.d = screens;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final Screen c(Screen screen) {
        Screen screen2 = this.d.d;
        if (screen == null && screen2 == null) {
            return null;
        }
        if (screen2 == null) {
            return screen;
        }
        String str = screen != null ? screen.a : null;
        if (str == null || evu0.J(str)) {
            str = screen2.a;
        }
        String str2 = screen != null ? screen.b : null;
        if (str2 == null || evu0.J(str2)) {
            str2 = screen2.b;
        }
        String str3 = screen != null ? screen.c : null;
        if (str3 == null || evu0.J(str3)) {
            str3 = screen2.c;
        }
        String str4 = screen != null ? screen.d : null;
        if (str4 == null || evu0.J(str4)) {
            str4 = screen2.d;
        }
        return new Screen(str, str2, str3, str4);
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/details/experiments/ForceZaloginForFamilyExperiment$Screens;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/details/experiments/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Screens {
        public static final c Companion = new c();
        public final Screen a;
        public final Screen b;
        public final Screen c;
        public final Screen d;

        public /* synthetic */ Screens(int i, Screen screen, Screen screen2, Screen screen3, Screen screen4) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = screen;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = screen2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = screen3;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = screen4;
            }
        }

        public Screens(int i) {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
        }

        public Screens() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/details/experiments/ForceZaloginForFamilyExperiment$Screen;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/details/experiments/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Screen {
        public static final b Companion = new b();
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public /* synthetic */ Screen(int i, String str, String str2, String str3, String str4) {
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
                this.d = "";
            } else {
                this.d = str4;
            }
        }

        public Screen(String str, String str2, String str3, String str4) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public Screen() {
            this("", "", "", "");
        }
    }

    public ForceZaloginForFamilyExperiment() {
        this(0);
    }

    public ForceZaloginForFamilyExperiment(int i) {
        Map f2 = kotlin.collections.b.f();
        Screens screens = new Screens(0);
        this.b = false;
        this.c = f2;
        this.d = screens;
    }
}
