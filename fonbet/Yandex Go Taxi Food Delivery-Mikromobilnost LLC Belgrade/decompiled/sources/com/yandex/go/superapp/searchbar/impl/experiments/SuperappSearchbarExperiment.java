package com.yandex.go.superapp.searchbar.impl.experiments;

import com.yandex.go.dto.response.e0;
import com.yandex.go.dto.response.q1;
import com.yandex.plus.pay.ui.core.mobile.ui.kit.PlusPayUiKitInflaterFactory;
import defpackage.c6z;
import defpackage.cyv0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import defpackage.w5w0;
import defpackage.w96;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0006\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/superapp/searchbar/impl/experiments/SuperappSearchbarExperiment;", "Lw96;", "Lc6z;", "Companion", "Searchbar", PlusPayUiKitInflaterFactory.NAME_BUTTON, "RotatableIcon", "LottieAnimation", "com/yandex/go/superapp/searchbar/impl/experiments/b", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SuperappSearchbarExperiment extends w96 implements c6z {
    public static final b Companion = new b();
    public static final i3y[] j;
    public static final SuperappSearchbarExperiment k;
    public final Map b;
    public final boolean c;
    public final Searchbar d;
    public final List e;
    public final List f;
    public final Button g;
    public final boolean h;
    public final boolean i;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        j = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new w5w0(7)), null, null, kotlin.a.b(lazyThreadSafetyMode, new w5w0(8)), kotlin.a.b(lazyThreadSafetyMode, new w5w0(9)), null, null, null};
        k = new SuperappSearchbarExperiment(0);
    }

    public /* synthetic */ SuperappSearchbarExperiment(int i, Map map, boolean z, Searchbar searchbar, List list, List list2, Button button, boolean z2, boolean z3) {
        this.b = (i & 1) == 0 ? kotlin.collections.b.f() : map;
        if ((i & 2) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
        if ((i & 4) == 0) {
            this.d = new Searchbar(0);
        } else {
            this.d = searchbar;
        }
        int i2 = i & 8;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.e = emptyList;
        } else {
            this.e = list;
        }
        if ((i & 16) == 0) {
            this.f = emptyList;
        } else {
            this.f = list2;
        }
        if ((i & 32) == 0) {
            this.g = new Button(0);
        } else {
            this.g = button;
        }
        if ((i & 64) == 0) {
            this.h = false;
        } else {
            this.h = z2;
        }
        if ((i & 128) == 0) {
            this.i = false;
        } else {
            this.i = z3;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.b;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.c;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/superapp/searchbar/impl/experiments/SuperappSearchbarExperiment$Searchbar;", "", "Companion", "AnimatedText", "$serializer", "com/yandex/go/superapp/searchbar/impl/experiments/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Searchbar {
        public static final h Companion = new h();
        public final String a;
        public final AnimatedText b;
        public final String c;
        public final String d;
        public final q1 e;

        public /* synthetic */ Searchbar(int i, String str, AnimatedText animatedText, String str2, String str3, q1 q1Var) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = animatedText;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str2;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str3;
            }
            if ((i & 16) == 0) {
                this.e = e0.INSTANCE;
            } else {
                this.e = q1Var;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/superapp/searchbar/impl/experiments/SuperappSearchbarExperiment$Searchbar$AnimatedText;", "", "Companion", "Item", "Keyframe", "$serializer", "com/yandex/go/superapp/searchbar/impl/experiments/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class AnimatedText {
            public static final e Companion = new e();
            public static final i3y[] j;
            public final Map a;
            public final List b;
            public final String c;
            public final long d;
            public final long e;
            public final long f;
            public final long g;
            public final long h;
            public final Integer i;

            static {
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                j = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new cyv0(9)), kotlin.a.b(lazyThreadSafetyMode, new cyv0(10)), null, null, null, null, null, null, null};
            }

            public /* synthetic */ AnimatedText(int i, Map map, List list, String str, long j2, long j3, long j4, long j5, long j6, Integer num) {
                if (3 != (i & 3)) {
                    qje.Z(i, 3, SuperappSearchbarExperiment$Searchbar$AnimatedText$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.a = map;
                this.b = list;
                if ((i & 4) == 0) {
                    this.c = null;
                } else {
                    this.c = str;
                }
                if ((i & 8) == 0) {
                    this.d = 1500L;
                } else {
                    this.d = j2;
                }
                if ((i & 16) == 0) {
                    this.e = 400L;
                } else {
                    this.e = j3;
                }
                this.f = (i & 32) == 0 ? 200L : j4;
                this.g = (i & 64) != 0 ? j5 : 400L;
                if ((i & 128) == 0) {
                    this.h = 1500L;
                } else {
                    this.h = j6;
                }
                if ((i & 256) == 0) {
                    this.i = null;
                } else {
                    this.i = num;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/searchbar/impl/experiments/SuperappSearchbarExperiment$Searchbar$AnimatedText$Keyframe;", "", "Companion", "$serializer", "com/yandex/go/superapp/searchbar/impl/experiments/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
            @gsq0
            /* loaded from: classes14.dex */
            public static final class Keyframe {
                public static final g Companion = new g();
                public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new cyv0(11))};
                public final List a;

                public /* synthetic */ Keyframe(int i, List list) {
                    if ((i & 1) == 0) {
                        this.a = null;
                    } else {
                        this.a = list;
                    }
                }

                /* renamed from: a, reason: from getter */
                public final List getA() {
                    return this.a;
                }

                public Keyframe() {
                    this.a = null;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/searchbar/impl/experiments/SuperappSearchbarExperiment$Searchbar$AnimatedText$Item;", "", "Companion", "$serializer", "com/yandex/go/superapp/searchbar/impl/experiments/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
            @gsq0
            /* loaded from: classes14.dex */
            public static final class Item {
                public static final f Companion = new f();
                public final String a;
                public final String b;

                public /* synthetic */ Item(int i, String str, String str2) {
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
                }

                /* renamed from: a, reason: from getter */
                public final String getB() {
                    return this.b;
                }

                /* renamed from: b, reason: from getter */
                public final String getA() {
                    return this.a;
                }

                public Item() {
                    this.a = null;
                    this.b = null;
                }
            }
        }

        public Searchbar() {
            this(0);
        }

        public Searchbar(int i) {
            e0 e0Var = e0.INSTANCE;
            this.a = "";
            this.b = null;
            this.c = "";
            this.d = "";
            this.e = e0Var;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/searchbar/impl/experiments/SuperappSearchbarExperiment$LottieAnimation;", "", "Companion", "$serializer", "com/yandex/go/superapp/searchbar/impl/experiments/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class LottieAnimation {
        public static final c Companion = new c();
        public final String a;
        public final Integer b;
        public final boolean c;

        public /* synthetic */ LottieAnimation(int i, String str, Integer num, boolean z) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = num;
            }
            if ((i & 4) == 0) {
                this.c = false;
            } else {
                this.c = z;
            }
        }

        public LottieAnimation() {
            this.a = "";
            this.b = null;
            this.c = false;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/searchbar/impl/experiments/SuperappSearchbarExperiment$RotatableIcon;", "", "Companion", "$serializer", "com/yandex/go/superapp/searchbar/impl/experiments/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class RotatableIcon {
        public static final d Companion = new d();
        public final String a;
        public final String b;
        public final Float c;

        public /* synthetic */ RotatableIcon(int i, String str, String str2, Float f) {
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
                this.c = null;
            } else {
                this.c = f;
            }
        }

        public RotatableIcon() {
            this.a = "";
            this.b = "";
            this.c = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/searchbar/impl/experiments/SuperappSearchbarExperiment$Button;", "", "Companion", "$serializer", "com/yandex/go/superapp/searchbar/impl/experiments/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Button {
        public static final a Companion = new a();
        public final String a;
        public final LottieAnimation b;
        public final RotatableIcon c;
        public final String d;
        public final q1 e;

        public /* synthetic */ Button(int i, String str, LottieAnimation lottieAnimation, RotatableIcon rotatableIcon, String str2, q1 q1Var) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = lottieAnimation;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = rotatableIcon;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str2;
            }
            if ((i & 16) == 0) {
                this.e = e0.INSTANCE;
            } else {
                this.e = q1Var;
            }
        }

        public Button() {
            this(0);
        }

        public Button(int i) {
            e0 e0Var = e0.INSTANCE;
            this.a = "";
            this.b = null;
            this.c = null;
            this.d = "";
            this.e = e0Var;
        }
    }

    public SuperappSearchbarExperiment() {
        this(0);
    }

    public SuperappSearchbarExperiment(int i) {
        Map f = kotlin.collections.b.f();
        Searchbar searchbar = new Searchbar(0);
        Button button = new Button(0);
        this.b = f;
        this.c = false;
        this.d = searchbar;
        EmptyList emptyList = EmptyList.a;
        this.e = emptyList;
        this.f = emptyList;
        this.g = button;
        this.h = false;
        this.i = false;
    }
}
