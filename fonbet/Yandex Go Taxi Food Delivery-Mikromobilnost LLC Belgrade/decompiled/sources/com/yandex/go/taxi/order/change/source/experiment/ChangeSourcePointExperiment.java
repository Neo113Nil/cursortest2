package com.yandex.go.taxi.order.change.source.experiment;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.w96;
import defpackage.y99;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0006\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/taxi/order/change/source/experiment/ChangeSourcePointExperiment;", "Lw96;", "Lc6z;", "Companion", "ChangeScreen", "Notification", "ChangeConfirmationScreens", "PinConfig", "com/yandex/go/taxi/order/change/source/experiment/c", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ChangeSourcePointExperiment extends w96 implements c6z {
    public static final c Companion = new c();
    public static final i3y[] j;
    public static final ChangeSourcePointExperiment k;
    public final boolean b;
    public final Map c;
    public final ChangeScreen d;
    public final Notification e;
    public final Notification f;
    public final Notification g;
    public final List h;
    public final PinConfig i;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        j = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new y99(1)), null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new y99(2)), null};
        k = new ChangeSourcePointExperiment(0);
    }

    public ChangeSourcePointExperiment(int i, boolean z, Map map, ChangeScreen changeScreen, Notification notification, Notification notification2, Notification notification3, List list, PinConfig pinConfig) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            ChangeScreen.Companion.getClass();
            this.d = ChangeScreen.g;
        } else {
            this.d = changeScreen;
        }
        int i2 = i & 8;
        Notification notification4 = Notification.c;
        if (i2 == 0) {
            Notification.Companion.getClass();
            this.e = notification4;
        } else {
            this.e = notification;
        }
        if ((i & 16) == 0) {
            Notification.Companion.getClass();
            this.f = notification4;
        } else {
            this.f = notification2;
        }
        if ((i & 32) == 0) {
            Notification.Companion.getClass();
            this.g = notification4;
        } else {
            this.g = notification3;
        }
        if ((i & 64) == 0) {
            this.h = EmptyList.a;
        } else {
            this.h = list;
        }
        if ((i & 128) == 0) {
            this.i = null;
        } else {
            this.i = pinConfig;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/change/source/experiment/ChangeSourcePointExperiment$Notification;", "", "Companion", "com/yandex/go/taxi/order/change/source/experiment/d", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Notification {
        public static final d Companion = new d();
        public static final Notification c = new Notification(0);
        public final String a;
        public final String b;

        public /* synthetic */ Notification(int i, String str, String str2) {
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
        }

        public Notification(int i) {
            this.a = "";
            this.b = "";
        }

        public Notification() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/change/source/experiment/ChangeSourcePointExperiment$ChangeConfirmationScreens;", "", "Companion", "com/yandex/go/taxi/order/change/source/experiment/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ChangeConfirmationScreens {
        public static final a Companion = new a();
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public /* synthetic */ ChangeConfirmationScreens(int i, String str, String str2, String str3, String str4) {
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

        public ChangeConfirmationScreens() {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/change/source/experiment/ChangeSourcePointExperiment$ChangeScreen;", "", "Companion", "com/yandex/go/taxi/order/change/source/experiment/b", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ChangeScreen {
        public static final b Companion = new b();
        public static final ChangeScreen g = new ChangeScreen(0);
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        public /* synthetic */ ChangeScreen(int i, String str, String str2, String str3, String str4, String str5, String str6) {
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
            if ((i & 16) == 0) {
                this.e = "";
            } else {
                this.e = str5;
            }
            if ((i & 32) == 0) {
                this.f = "";
            } else {
                this.f = str6;
            }
        }

        public ChangeScreen(int i) {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = "";
            this.e = "";
            this.f = "";
        }

        public ChangeScreen() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/change/source/experiment/ChangeSourcePointExperiment$PinConfig;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/change/source/experiment/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class PinConfig {
        public static final e Companion = new e();
        public final String a;
        public final String b;
        public final int c;
        public final int d;
        public final int e;
        public final boolean f;

        public /* synthetic */ PinConfig(int i, String str, String str2, int i2, int i3, int i4, boolean z) {
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
                this.c = 0;
            } else {
                this.c = i2;
            }
            if ((i & 8) == 0) {
                this.d = 0;
            } else {
                this.d = i3;
            }
            if ((i & 16) == 0) {
                this.e = 0;
            } else {
                this.e = i4;
            }
            if ((i & 32) == 0) {
                this.f = false;
            } else {
                this.f = z;
            }
        }

        public PinConfig() {
            this.a = "";
            this.b = "";
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = false;
        }
    }

    public ChangeSourcePointExperiment() {
        this(0);
    }

    public ChangeSourcePointExperiment(int i) {
        Map f = kotlin.collections.b.f();
        ChangeScreen.Companion.getClass();
        d dVar = Notification.Companion;
        dVar.getClass();
        dVar.getClass();
        dVar.getClass();
        this.b = false;
        this.c = f;
        this.d = ChangeScreen.g;
        Notification notification = Notification.c;
        this.e = notification;
        this.f = notification;
        this.g = notification;
        this.h = EmptyList.a;
        this.i = null;
    }
}
