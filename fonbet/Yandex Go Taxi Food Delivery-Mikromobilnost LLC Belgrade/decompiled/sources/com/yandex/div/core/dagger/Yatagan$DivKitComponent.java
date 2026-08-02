package com.yandex.div.core.dagger;

import android.content.Context;
import android.os.Build;
import android.view.ContextThemeWrapper;
import com.yandex.div.core.c;
import com.yandex.div.core.dagger.Div2Component;
import com.yandex.div.core.dagger.Div2ViewComponent;
import com.yandex.div.core.dagger.DivKitComponent;
import com.yandex.div.core.expression.variables.a;
import com.yandex.div.core.resources.ContextThemeWrapperWithResourceCache;
import com.yandex.div.core.tooltip.b;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.d;
import com.yandex.div.core.view2.divs.e;
import com.yandex.div.core.view2.divs.f;
import com.yandex.div.core.view2.divs.g;
import com.yandex.div.core.view2.divs.h;
import com.yandex.div.core.view2.divs.j;
import com.yandex.div.core.view2.divs.k;
import com.yandex.div.core.view2.divs.m;
import com.yandex.div.core.view2.divs.n;
import com.yandex.div.core.view2.divs.r;
import com.yandex.div.core.view2.divs.s;
import com.yandex.div.core.view2.divs.t;
import com.yandex.div.core.view2.divs.u;
import com.yandex.div.core.view2.divs.v;
import com.yandex.div.core.view2.divs.w;
import com.yandex.div.core.view2.divs.x;
import com.yandex.div.core.view2.i;
import com.yandex.div.histogram.HistogramConfiguration$DefaultHistogramConfiguration;
import com.yandex.div.storage.DivStorageComponent;
import defpackage.ad60;
import defpackage.am2;
import defpackage.au50;
import defpackage.b64;
import defpackage.bek;
import defpackage.bf10;
import defpackage.cot;
import defpackage.cpk;
import defpackage.crk;
import defpackage.cw5;
import defpackage.cx5;
import defpackage.dab1;
import defpackage.dpl;
import defpackage.dx5;
import defpackage.dxk;
import defpackage.dyf0;
import defpackage.e06;
import defpackage.eju;
import defpackage.f3l;
import defpackage.fl11;
import defpackage.fp31;
import defpackage.fq31;
import defpackage.g3y;
import defpackage.gt6;
import defpackage.gtk;
import defpackage.h6x0;
import defpackage.hgk;
import defpackage.hl11;
import defpackage.i3y;
import defpackage.i5l;
import defpackage.ibl;
import defpackage.ie10;
import defpackage.iek;
import defpackage.igy0;
import defpackage.il11;
import defpackage.ipl;
import defpackage.iva0;
import defpackage.jd1;
import defpackage.jjl;
import defpackage.jkl;
import defpackage.jlu;
import defpackage.jzv;
import defpackage.k4j0;
import defpackage.k890;
import defpackage.kbk;
import defpackage.l2f;
import defpackage.lbk;
import defpackage.lbl;
import defpackage.llu;
import defpackage.lnt0;
import defpackage.m6o;
import defpackage.mbk;
import defpackage.mfk;
import defpackage.myk;
import defpackage.nfh;
import defpackage.nlk;
import defpackage.nml;
import defpackage.ny61;
import defpackage.obk;
import defpackage.obl;
import defpackage.oil;
import defpackage.pbk;
import defpackage.ptk;
import defpackage.pw31;
import defpackage.qc20;
import defpackage.rol;
import defpackage.rtk;
import defpackage.ruz;
import defpackage.tbk;
import defpackage.ubk;
import defpackage.ubl;
import defpackage.ujk;
import defpackage.v2l;
import defpackage.vbk;
import defpackage.vml;
import defpackage.vsi0;
import defpackage.vt31;
import defpackage.wbk;
import defpackage.wkk;
import defpackage.wku;
import defpackage.wsi0;
import defpackage.wt31;
import defpackage.xbk;
import defpackage.xck;
import defpackage.xhl;
import defpackage.xku;
import defpackage.xw91;
import defpackage.xzk;
import defpackage.y4k;
import defpackage.y6k;
import defpackage.ybk;
import defpackage.yck;
import defpackage.yh;
import defpackage.ynk;
import defpackage.z2k;
import defpackage.z2l;
import defpackage.zkl0;
import defpackage.znl;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class Yatagan$DivKitComponent implements DivKitComponent {
    public volatile Object a = new UninitializedLock();
    public volatile Object b = new UninitializedLock();
    public volatile Object c = new UninitializedLock();
    public volatile Object d = new UninitializedLock();
    public volatile Object e = new UninitializedLock();
    public volatile Object f = new UninitializedLock();
    public volatile Object g = new UninitializedLock();
    public volatile Object h = new UninitializedLock();
    public final Context i;
    public final am2 j;

    public static final class ComponentFactoryImpl implements DivKitComponent.Builder {
        public Context a;
        public am2 b;

        @Override // com.yandex.div.core.dagger.DivKitComponent.Builder
        public final DivKitComponent.Builder a(Context context) {
            this.a = context;
            return this;
        }

        @Override // com.yandex.div.core.dagger.DivKitComponent.Builder
        public final DivKitComponent.Builder b(am2 am2Var) {
            this.b = am2Var;
            return this;
        }

        @Override // com.yandex.div.core.dagger.DivKitComponent.Builder
        public final Yatagan$DivKitComponent build() {
            return new Yatagan$DivKitComponent(this.a, this.b);
        }
    }

    public static final class Div2ComponentImpl implements Div2Component {
        public final ContextThemeWrapper T;
        public final Integer U;
        public final wkk V;
        public final a W;
        public final ujk X;
        public final Yatagan$DivKitComponent Y;
        public volatile Object a = new UninitializedLock();
        public volatile Object b = new UninitializedLock();
        public volatile Object c = new UninitializedLock();
        public volatile Object d = new UninitializedLock();
        public volatile Object e = new UninitializedLock();
        public volatile Object f = new UninitializedLock();
        public volatile Object g = new UninitializedLock();
        public volatile Object h = new UninitializedLock();
        public volatile Object i = new UninitializedLock();
        public volatile Object j = new UninitializedLock();
        public volatile Object k = new UninitializedLock();
        public volatile Object l = new UninitializedLock();
        public volatile Object m = new UninitializedLock();
        public volatile Object n = new UninitializedLock();
        public volatile Object o = new UninitializedLock();
        public volatile Object p = new UninitializedLock();
        public volatile Object q = new UninitializedLock();
        public volatile Object r = new UninitializedLock();
        public volatile Object s = new UninitializedLock();
        public volatile Object t = new UninitializedLock();
        public volatile Object u = new UninitializedLock();
        public volatile Object v = new UninitializedLock();
        public volatile Object w = new UninitializedLock();
        public volatile Object x = new UninitializedLock();
        public volatile Object y = new UninitializedLock();
        public volatile Object z = new UninitializedLock();
        public volatile Object A = new UninitializedLock();
        public volatile Object B = new UninitializedLock();
        public volatile Object C = new UninitializedLock();
        public volatile Object D = new UninitializedLock();
        public volatile Object E = new UninitializedLock();
        public volatile Object F = new UninitializedLock();
        public volatile Object G = new UninitializedLock();
        public volatile Object H = new UninitializedLock();
        public volatile Object I = new UninitializedLock();
        public volatile Object J = new UninitializedLock();
        public volatile Object K = new UninitializedLock();
        public volatile Object L = new UninitializedLock();
        public volatile Object M = new UninitializedLock();
        public volatile Object N = new UninitializedLock();
        public volatile Object O = new UninitializedLock();
        public volatile Object P = new UninitializedLock();
        public volatile Object Q = new UninitializedLock();
        public volatile Object R = new UninitializedLock();
        public volatile Object S = new UninitializedLock();

        public static final class ComponentFactoryImpl implements Div2Component.Builder {
            public Yatagan$DivKitComponent a;
            public ContextThemeWrapper b;
            public ujk c;
            public Integer d;
            public wkk e;
            public a f;

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public final Div2Component.Builder a(ContextThemeWrapper contextThemeWrapper) {
                this.b = contextThemeWrapper;
                return this;
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public final Div2Component.Builder b(ujk ujkVar) {
                this.c = ujkVar;
                return this;
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public final Div2Component build() {
                return new Div2ComponentImpl(this.a, this.b, this.c, this.d, this.e, this.f);
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public final Div2Component.Builder c(a aVar) {
                this.f = aVar;
                return this;
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public final Div2Component.Builder d(int i) {
                this.d = Integer.valueOf(i);
                return this;
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public final Div2Component.Builder e(wkk wkkVar) {
                this.e = wkkVar;
                return this;
            }
        }

        public static final class Div2ViewComponentImpl implements Div2ViewComponent {
            public volatile Object a = new UninitializedLock();
            public volatile Object b = new UninitializedLock();
            public volatile Object c = new UninitializedLock();
            public volatile Object d = new UninitializedLock();
            public volatile Object e = new UninitializedLock();
            public volatile Object f = new UninitializedLock();
            public volatile Object g = new UninitializedLock();
            public volatile Object h = new UninitializedLock();
            public volatile Object i = new UninitializedLock();
            public volatile Object j = new UninitializedLock();
            public volatile Object k = new UninitializedLock();
            public volatile Object l = new UninitializedLock();
            public volatile Object m = new UninitializedLock();
            public volatile Object n = new UninitializedLock();
            public volatile Object o = new UninitializedLock();
            public final Div2View p;
            public final Div2ComponentImpl q;
            public final Yatagan$DivKitComponent r;

            public static final class ComponentFactoryImpl implements Div2ViewComponent.Builder {
                public Div2ComponentImpl a;
                public Yatagan$DivKitComponent b;
                public Div2View c;

                @Override // com.yandex.div.core.dagger.Div2ViewComponent.Builder
                public final Div2ViewComponent.Builder a(Div2View div2View) {
                    this.c = div2View;
                    return this;
                }

                @Override // com.yandex.div.core.dagger.Div2ViewComponent.Builder
                public final Div2ViewComponent build() {
                    return new Div2ViewComponentImpl(this.a, this.b, this.c);
                }
            }

            public static final class DoubleCheck implements g3y {
                public final Div2ViewComponentImpl a;
                public final int b;
                public volatile lbl c;

                public DoubleCheck(Div2ViewComponentImpl div2ViewComponentImpl, int i) {
                    this.a = div2ViewComponentImpl;
                    this.b = i;
                }

                @Override // defpackage.yvf0
                public final Object get() {
                    lbl lblVar;
                    lbl dxkVar;
                    lbl lblVar2 = this.c;
                    if (lblVar2 != null) {
                        return lblVar2;
                    }
                    synchronized (this) {
                        try {
                            lblVar = this.c;
                            if (lblVar == null) {
                                Div2ViewComponentImpl div2ViewComponentImpl = this.a;
                                int i = this.b;
                                Div2ComponentImpl div2ComponentImpl = div2ViewComponentImpl.q;
                                Div2View div2View = div2ViewComponentImpl.p;
                                if (i == 0) {
                                    dxkVar = new dxk(div2View, div2ComponentImpl.M());
                                } else {
                                    if (i != 1) {
                                        throw new AssertionError();
                                    }
                                    dxkVar = new xzk(div2View, div2ComponentImpl.M());
                                }
                                lblVar = dxkVar;
                                this.c = lblVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return lblVar;
                }
            }

            public static final class UninitializedLock {
            }

            public Div2ViewComponentImpl(Div2ComponentImpl div2ComponentImpl, Yatagan$DivKitComponent yatagan$DivKitComponent, Div2View div2View) {
                this.q = div2ComponentImpl;
                this.r = yatagan$DivKitComponent;
                this.p = div2View;
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final m6o a() {
                return this.q.g0();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final b b() {
                return this.q.Y();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final n c() {
                Object obj;
                Object obj2 = this.m;
                if (obj2 instanceof UninitializedLock) {
                    synchronized (obj2) {
                        try {
                            obj = this.m;
                            if (obj instanceof UninitializedLock) {
                                obj = new n(this.q.g0(), this.p);
                                this.m = obj;
                            }
                        } finally {
                        }
                    }
                    obj2 = obj;
                }
                return (n) obj2;
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final ie10 d() {
                Object obj;
                Object obj2 = this.e;
                if (obj2 instanceof UninitializedLock) {
                    synchronized (obj2) {
                        try {
                            obj = this.e;
                            if (obj instanceof UninitializedLock) {
                                ie10 ie10Var = new ie10(this.q.P(), this.q.O(), this.q.b0(), this.q.g0(), this.q.N());
                                this.e = ie10Var;
                                obj = ie10Var;
                            }
                        } finally {
                        }
                    }
                    obj2 = obj;
                }
                return (ie10) obj2;
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final jkl e() {
                Object obj;
                Object obj2 = this.b;
                if (obj2 instanceof UninitializedLock) {
                    synchronized (obj2) {
                        try {
                            obj = this.b;
                            if (obj instanceof UninitializedLock) {
                                obj = new jkl(this.q.T, t());
                                this.b = obj;
                            }
                        } finally {
                        }
                    }
                    obj2 = obj;
                }
                return (jkl) obj2;
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final com.yandex.div.core.util.binding.a f() {
                return s();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final gt6 g() {
                Object obj;
                Object obj2 = this.o;
                if (obj2 instanceof UninitializedLock) {
                    synchronized (obj2) {
                        try {
                            obj = this.o;
                            if (obj instanceof UninitializedLock) {
                                obj = new gt6(this.p);
                                this.o = obj;
                            }
                        } finally {
                        }
                    }
                    obj2 = obj;
                }
                return (gt6) obj2;
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final obl h() {
                Object obj;
                Object obj2 = this.g;
                if (obj2 instanceof UninitializedLock) {
                    synchronized (obj2) {
                        try {
                            obj = this.g;
                            if (obj instanceof UninitializedLock) {
                                obj = new obl(this.p);
                                this.g = obj;
                            }
                        } finally {
                        }
                    }
                    obj2 = obj;
                }
                return (obl) obj2;
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final com.yandex.div.core.view2.errors.a i() {
                Object obj;
                Object obj2 = this.h;
                if (obj2 instanceof UninitializedLock) {
                    synchronized (obj2) {
                        try {
                            obj = this.h;
                            if (obj instanceof UninitializedLock) {
                                m6o g0 = this.q.g0();
                                Div2View div2View = this.p;
                                ujk ujkVar = this.q.X;
                                com.yandex.div.core.view2.errors.a aVar = new com.yandex.div.core.view2.errors.a(g0, div2View, ujkVar.s, ujkVar.D, u(), this.q.X.j);
                                this.h = aVar;
                                obj = aVar;
                            }
                        } finally {
                        }
                    }
                    obj2 = obj;
                }
                return (com.yandex.div.core.view2.errors.a) obj2;
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final jzv j() {
                Object obj;
                Object obj2 = this.j;
                if (obj2 instanceof UninitializedLock) {
                    synchronized (obj2) {
                        try {
                            obj = this.j;
                            if (obj instanceof UninitializedLock) {
                                obj = new jzv(this.p);
                                this.j = obj;
                            }
                        } finally {
                        }
                    }
                    obj2 = obj;
                }
                return (jzv) obj2;
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final com.yandex.div.core.expression.local.a k() {
                return this.q.W();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final k4j0 l() {
                Object obj;
                Object obj2 = this.l;
                if (obj2 instanceof UninitializedLock) {
                    synchronized (obj2) {
                        try {
                            obj = this.l;
                            if (obj instanceof UninitializedLock) {
                                Div2View div2View = this.p;
                                this.q.X.getClass();
                                obj = new k4j0(div2View);
                                this.l = obj;
                            }
                        } finally {
                        }
                    }
                    obj2 = obj;
                }
                return (k4j0) obj2;
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final lbl m() {
                Object obj;
                Object obj2 = this.f;
                if (obj2 instanceof UninitializedLock) {
                    synchronized (obj2) {
                        try {
                            obj = this.f;
                            if (obj instanceof UninitializedLock) {
                                obj = (lbl) (this.q.X.z ? new DoubleCheck(this, 1).get() : new DoubleCheck(this, 0).get());
                                this.f = obj;
                            }
                        } finally {
                        }
                    }
                    obj2 = obj;
                }
                return (lbl) obj2;
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final ipl n() {
                return t();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final bek o() {
                Object obj;
                Object obj2 = this.k;
                if (obj2 instanceof UninitializedLock) {
                    synchronized (obj2) {
                        try {
                            obj = this.k;
                            if (obj instanceof UninitializedLock) {
                                obj = new bek(this.p);
                                this.k = obj;
                            }
                        } finally {
                        }
                    }
                    obj2 = obj;
                }
                return (bek) obj2;
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final wsi0 p() {
                Object obj;
                Object obj2 = this.c;
                if (obj2 instanceof UninitializedLock) {
                    synchronized (obj2) {
                        try {
                            obj = this.c;
                            if (obj instanceof UninitializedLock) {
                                Div2View div2View = this.p;
                                Div2ComponentImpl div2ComponentImpl = this.q;
                                obj = new wsi0(div2View, div2ComponentImpl.X.e, div2ComponentImpl.N());
                                this.c = obj;
                            }
                        } finally {
                        }
                    }
                    obj2 = obj;
                }
                return (wsi0) obj2;
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final fp31 q() {
                return u();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final bf10 r() {
                Object obj;
                Object obj2 = this.d;
                if (obj2 instanceof UninitializedLock) {
                    synchronized (obj2) {
                        try {
                            obj = this.d;
                            if (obj instanceof UninitializedLock) {
                                obj = new bf10(s(), this.q.N());
                                this.d = obj;
                            }
                        } finally {
                        }
                    }
                    obj2 = obj;
                }
                return (bf10) obj2;
            }

            public final com.yandex.div.core.util.binding.a s() {
                Object obj;
                Object obj2;
                Object obj3 = this.n;
                if (obj3 instanceof UninitializedLock) {
                    synchronized (obj3) {
                        try {
                            obj = this.n;
                            if (obj instanceof UninitializedLock) {
                                Div2View div2View = this.p;
                                cw5 cw5Var = new cw5();
                                Yatagan$DivKitComponent yatagan$DivKitComponent = this.r;
                                Object obj4 = yatagan$DivKitComponent.a;
                                if (obj4 instanceof UninitializedLock) {
                                    synchronized (obj4) {
                                        obj2 = yatagan$DivKitComponent.a;
                                        if (obj2 instanceof UninitializedLock) {
                                            dx5 dx5Var = new dx5(new cx5());
                                            yatagan$DivKitComponent.a = dx5Var;
                                            obj2 = dx5Var;
                                        }
                                    }
                                    obj4 = obj2;
                                }
                                obj = new com.yandex.div.core.util.binding.a(div2View, cw5Var, (dx5) obj4);
                                this.n = obj;
                            }
                        } catch (Throwable th) {
                            throw th;
                        } finally {
                        }
                    }
                    obj3 = obj;
                }
                return (com.yandex.div.core.util.binding.a) obj3;
            }

            public final ipl t() {
                Object obj;
                Object obj2 = this.a;
                if (obj2 instanceof UninitializedLock) {
                    synchronized (obj2) {
                        try {
                            obj = this.a;
                            if (obj instanceof UninitializedLock) {
                                obj = new ipl();
                                this.a = obj;
                            }
                        } finally {
                        }
                    }
                    obj2 = obj;
                }
                return (ipl) obj2;
            }

            public final fp31 u() {
                Object obj;
                Object obj2 = this.i;
                if (obj2 instanceof UninitializedLock) {
                    synchronized (obj2) {
                        try {
                            obj = this.i;
                            if (obj instanceof UninitializedLock) {
                                obj = new fp31();
                                this.i = obj;
                            }
                        } finally {
                        }
                    }
                    obj2 = obj;
                }
                return (fp31) obj2;
            }
        }

        public static final class ProviderImpl implements g3y {
            public final Div2ComponentImpl a;
            public final int b;

            public ProviderImpl(Div2ComponentImpl div2ComponentImpl, int i) {
                this.a = div2ComponentImpl;
                this.b = i;
            }

            @Override // defpackage.yvf0
            public final Object get() {
                Div2ComponentImpl div2ComponentImpl = this.a;
                int i = this.b;
                if (i == 0) {
                    return div2ComponentImpl.M();
                }
                if (i == 1) {
                    return div2ComponentImpl.I();
                }
                if (i == 2) {
                    return div2ComponentImpl.d0();
                }
                ny61.w();
                return null;
            }
        }

        public static final class UninitializedLock {
        }

        public Div2ComponentImpl(Yatagan$DivKitComponent yatagan$DivKitComponent, ContextThemeWrapper contextThemeWrapper, ujk ujkVar, Integer num, wkk wkkVar, a aVar) {
            this.Y = yatagan$DivKitComponent;
            this.T = contextThemeWrapper;
            this.X = ujkVar;
            this.U = num;
            this.V = wkkVar;
            this.W = aVar;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final void A() {
            this.X.getClass();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final igy0 B() {
            return n0();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final f3l C() {
            return T();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final boolean D() {
            return Boolean.valueOf(this.X.B).booleanValue();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final hgk E() {
            return M();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final c F() {
            return K();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final i G() {
            return f0();
        }

        public final yh H() {
            Object obj;
            Object obj2 = this.G;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.G;
                        if (obj instanceof UninitializedLock) {
                            obj = new yh(this.X.u);
                            this.G = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (yh) obj2;
        }

        public final z2k I() {
            Object obj;
            Object obj2 = this.i;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.i;
                        if (obj instanceof UninitializedLock) {
                            obj = new z2k(d0(), M(), W());
                            this.i = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (z2k) obj2;
        }

        public final y4k J() {
            Object obj;
            Object obj2 = this.P;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.P;
                        if (obj instanceof UninitializedLock) {
                            obj = new y4k(new ProviderImpl(this.Y, 3), this.X.n, this.X.o, this.X.p);
                            this.P = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (y4k) obj2;
        }

        public final c K() {
            Object obj;
            Object obj2 = this.p;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.p;
                        if (obj instanceof UninitializedLock) {
                            obj = new c(this.X.b, J());
                            this.p = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (c) obj2;
        }

        public final e L() {
            Object obj;
            Object obj2 = this.H;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.H;
                        if (obj instanceof UninitializedLock) {
                            e eVar = new e(new mfk(Q()), Y(), new crk(K()), new d(this.X.u, H()), new myk(g0()));
                            this.H = eVar;
                            obj = eVar;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (e) obj2;
        }

        public final hgk M() {
            Object obj;
            Object obj2 = this.h;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.h;
                        if (obj instanceof UninitializedLock) {
                            vml a0 = a0();
                            w wVar = new w(L(), Z(), new lnt0(Z(), Q()), this.X.t);
                            f fVar = new f(L(), new ProviderImpl(this, 2), T(), new ProviderImpl(this, 0), g0());
                            s sVar = new s(4, L());
                            j P = P();
                            h O = O();
                            com.yandex.div.core.view2.divs.i iVar = new com.yandex.div.core.view2.divs.i(L(), T(), new ProviderImpl(this, 0), new ProviderImpl(this, 2));
                            e L = L();
                            com.yandex.div.core.view2.f d0 = d0();
                            ProviderImpl providerImpl = new ProviderImpl(this, 0);
                            z2l S = S();
                            this.X.getClass();
                            com.yandex.div.core.view2.divs.gallery.b bVar = new com.yandex.div.core.view2.divs.gallery.b(L, d0, providerImpl, S, 0.0f);
                            com.yandex.div.core.view2.divs.pager.b bVar2 = new com.yandex.div.core.view2.divs.pager.b(L(), d0(), new ProviderImpl(this, 0), S(), K(), i0(), H());
                            e L2 = L();
                            com.yandex.div.core.view2.f d02 = d0();
                            ProviderImpl providerImpl2 = new ProviderImpl(this, 0);
                            vt31 q0 = q0();
                            qc20 qc20Var = new qc20(this.X.j);
                            c K = K();
                            this.X.getClass();
                            com.yandex.div.core.view2.divs.tabs.b bVar3 = new com.yandex.div.core.view2.divs.tabs.b(L2, d02, providerImpl2, q0, qc20Var, K, Q(), f0(), S(), h0(), W(), m0());
                            u uVar = new u(L(), d0(), new ProviderImpl(this, 0), X(), K(), T(), S(), f0(), g0(), p0(), W());
                            g gVar = new g(L(), this.X.e, N(), new ProviderImpl(this, 0));
                            k kVar = new k(L(), i0());
                            e L3 = L();
                            this.X.getClass();
                            nml Z = Z();
                            hl11 o0 = o0();
                            m6o g0 = g0();
                            this.X.getClass();
                            hgk hgkVar = new hgk(a0, wVar, fVar, sVar, P, O, iVar, bVar, bVar2, bVar3, uVar, gVar, kVar, new t(L3, Z, o0, g0, 0.0f, K(), this.X.s), new m(L(), Z(), p0(), K(), H(), g0()), new r(L(), Z(), p0(), g0()), b0(), N(), i0(), new v(L(), new fl11(g0())));
                            this.h = hgkVar;
                            obj = hgkVar;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (hgk) obj2;
        }

        public final cpk N() {
            Object obj;
            Object obj2 = this.d;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.d;
                        if (obj instanceof UninitializedLock) {
                            obj = new cpk(this.X.h);
                            this.d = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (cpk) obj2;
        }

        public final h O() {
            Object obj;
            Object obj2 = this.f;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.f;
                        if (obj instanceof UninitializedLock) {
                            obj = new h(L(), Q(), U(), g0());
                            this.f = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (h) obj2;
        }

        public final j P() {
            Object obj;
            Object obj2 = this.e;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.e;
                        if (obj instanceof UninitializedLock) {
                            obj = new j(L(), Q(), U(), g0());
                            this.e = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (j) obj2;
        }

        public final gtk Q() {
            Object obj;
            Object obj2 = this.I;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.I;
                        if (obj instanceof UninitializedLock) {
                            ptk ptkVar = new ptk(this.T, this.X.a);
                            this.I = ptkVar;
                            obj = ptkVar;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (gtk) obj2;
        }

        public final rtk R() {
            Object obj;
            Object obj2 = this.k;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.k;
                        if (obj instanceof UninitializedLock) {
                            obj = new rtk(Q());
                            this.k = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (rtk) obj2;
        }

        public final z2l S() {
            Object obj;
            Object obj2 = this.Q;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.Q;
                        if (obj instanceof UninitializedLock) {
                            obj = new z2l();
                            this.Q = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (z2l) obj2;
        }

        public final f3l T() {
            Object obj;
            Object obj2 = this.x;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.x;
                        if (obj instanceof UninitializedLock) {
                            obj = new f3l(S(), new ProviderImpl(this, 1));
                            this.x = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (f3l) obj2;
        }

        public final com.yandex.div.core.view2.e U() {
            Object obj;
            Object obj2 = this.J;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.J;
                        if (obj instanceof UninitializedLock) {
                            this.X.getClass();
                            obj = new com.yandex.div.core.view2.e((ExecutorService) this.Y.j.a);
                            this.J = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (com.yandex.div.core.view2.e) obj2;
        }

        public final i5l V() {
            Object obj;
            Object obj2 = this.l;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.l;
                        if (obj instanceof UninitializedLock) {
                            rtk R = R();
                            ujk ujkVar = this.X;
                            i5l i5lVar = new i5l(R, ujkVar.e, N(), ujkVar.g);
                            this.l = i5lVar;
                            obj = i5lVar;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (i5l) obj2;
        }

        public final com.yandex.div.core.expression.local.a W() {
            Object obj;
            Object obj2 = this.c;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.c;
                        if (obj instanceof UninitializedLock) {
                            obj = new com.yandex.div.core.expression.local.a(X(), m0());
                            this.c = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (com.yandex.div.core.expression.local.a) obj2;
        }

        public final ibl X() {
            Object obj;
            Object obj2 = this.w;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.w;
                        if (obj instanceof UninitializedLock) {
                            obj = new ibl(this.X.c, n0());
                            this.w = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (ibl) obj2;
        }

        public final b Y() {
            Object obj;
            Object obj2 = this.b;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.b;
                        if (obj instanceof UninitializedLock) {
                            this.X.getClass();
                            b bVar = new b(f0(), V(), new jjl(new ProviderImpl(this, 1)), H(), g0());
                            this.b = bVar;
                            obj = bVar;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (b) obj2;
        }

        public final nml Z() {
            Object obj;
            Object obj2 = this.R;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.R;
                        if (obj instanceof UninitializedLock) {
                            ujk ujkVar = this.X;
                            obj = new nml(ujkVar.k, ujkVar.j);
                            this.R = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (nml) obj2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final m6o a() {
            return g0();
        }

        public final vml a0() {
            Object obj;
            Object obj2 = this.L;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.L;
                        if (obj instanceof UninitializedLock) {
                            obj = new vml();
                            this.L = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (vml) obj2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final y6k b() {
            return this.X.b;
        }

        public final x b0() {
            Object obj;
            Object obj2 = this.g;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.g;
                        if (obj instanceof UninitializedLock) {
                            x xVar = new x(L(), o0(), K(), c0(), (ExecutorService) this.Y.j.a, this.X.f);
                            this.g = xVar;
                            obj = xVar;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (x) obj2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final zkl0 c() {
            return k0();
        }

        public final rol c0() {
            Object obj;
            Object obj2 = this.v;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.v;
                        if (obj instanceof UninitializedLock) {
                            obj = new rol();
                            this.v = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (rol) obj2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final znl d() {
            Object obj;
            Object obj2 = this.u;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.u;
                        if (obj instanceof UninitializedLock) {
                            obj = new znl(c0());
                            this.u = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (znl) obj2;
        }

        public final com.yandex.div.core.view2.f d0() {
            Object obj;
            Object obj2 = this.j;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.j;
                        if (obj instanceof UninitializedLock) {
                            com.yandex.div.core.view2.f fVar = new com.yandex.div.core.view2.f(h0(), q0(), a0(), this.X.l, r0());
                            this.j = fVar;
                            obj = fVar;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (com.yandex.div.core.view2.f) obj2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final com.yandex.div.core.view2.g e() {
            return e0();
        }

        public final com.yandex.div.core.view2.g e0() {
            Object obj;
            Object obj2 = this.n;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.n;
                        if (obj instanceof UninitializedLock) {
                            this.X.getClass();
                            ujk ujkVar = this.X;
                            obj = new com.yandex.div.core.view2.g(ujkVar.d, ujkVar.b, J());
                            this.n = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (com.yandex.div.core.view2.g) obj2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final wkk f() {
            return this.V;
        }

        public final i f0() {
            Object obj;
            Object obj2 = this.m;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.m;
                        if (obj instanceof UninitializedLock) {
                            obj = new i(new pw31(), e0());
                            this.m = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (i) obj2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final com.yandex.div.core.view2.f g() {
            return d0();
        }

        public final m6o g0() {
            Object obj;
            Object obj2 = this.a;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.a;
                        if (obj instanceof UninitializedLock) {
                            this.X.getClass();
                            obj = new m6o();
                            this.a = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (m6o) obj2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final a getDivVariableController() {
            return this.W;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final ibl getStateManager() {
            return X();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final void h() {
            this.X.getClass();
        }

        public final Context h0() {
            Object obj;
            Object obj2 = this.N;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.N;
                        if (obj instanceof UninitializedLock) {
                            ContextThemeWrapper contextThemeWrapper = this.T;
                            int intValue = this.U.intValue();
                            obj = this.X.y ? new ContextThemeWrapperWithResourceCache(contextThemeWrapper, intValue) : new ContextThemeWrapper(contextThemeWrapper, intValue);
                            this.N = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (Context) obj2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final ynk i() {
            return this.X.i;
        }

        public final k890 i0() {
            Object obj;
            Object obj2 = this.M;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.M;
                        if (obj instanceof UninitializedLock) {
                            obj = new k890();
                            this.M = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (k890) obj2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final nlk j() {
            return new nlk();
        }

        public final iva0 j0() {
            Object obj;
            Object obj2 = this.y;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.y;
                        if (obj instanceof UninitializedLock) {
                            boolean z = this.X.x;
                            obj = new iva0();
                            this.y = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (iva0) obj2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final com.yandex.div.core.expression.storedvalues.a k() {
            return l0();
        }

        public final zkl0 k0() {
            Object obj;
            Object obj2 = this.s;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.s;
                        if (obj instanceof UninitializedLock) {
                            obj = new zkl0(new nfh(this.W, K(), l0()), g0());
                            this.s = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (zkl0) obj2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final llu l() {
            Object obj;
            Object obj2 = this.A;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.A;
                        if (obj instanceof UninitializedLock) {
                            this.Y.j.getClass();
                            HistogramConfiguration$DefaultHistogramConfiguration histogramConfiguration$DefaultHistogramConfiguration = xku.a;
                            llu lluVar = new llu(xw91.z);
                            this.A = lluVar;
                            obj = lluVar;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (llu) obj2;
        }

        public final com.yandex.div.core.expression.storedvalues.a l0() {
            Object obj;
            Object obj2 = this.C;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.C;
                        if (obj instanceof UninitializedLock) {
                            obj = new com.yandex.div.core.expression.storedvalues.a(new ProviderImpl(this.Y, 2));
                            this.C = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (com.yandex.div.core.expression.storedvalues.a) obj2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final e06 m() {
            Object obj;
            Object obj2 = this.D;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.D;
                        if (obj instanceof UninitializedLock) {
                            obj = (!this.X.E || Build.VERSION.SDK_INT < 31) ? new ruz(this.T) : new eju();
                            this.D = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (e06) obj2;
        }

        public final h6x0 m0() {
            Object obj;
            Object obj2 = this.r;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.r;
                        if (obj instanceof UninitializedLock) {
                            obj = new h6x0();
                            this.r = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (h6x0) obj2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final obk n() {
            Object obj;
            Yatagan$DivKitComponent yatagan$DivKitComponent = this.Y;
            Object obj2 = yatagan$DivKitComponent.b;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = yatagan$DivKitComponent.b;
                        if (obj instanceof UninitializedLock) {
                            obj = new obk(yatagan$DivKitComponent.f());
                            yatagan$DivKitComponent.b = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (obk) obj2;
        }

        public final igy0 n0() {
            Object obj;
            Object obj2 = this.q;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.q;
                        if (obj instanceof UninitializedLock) {
                            obj = new igy0();
                            this.q = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (igy0) obj2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final com.yandex.div.core.view2.divs.c o() {
            Object obj;
            Object obj2 = this.o;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.o;
                        if (obj instanceof UninitializedLock) {
                            c K = K();
                            this.X.getClass();
                            y4k J = J();
                            ujk ujkVar = this.X;
                            obj = new com.yandex.div.core.view2.divs.c(K, J, ujkVar.q, ujkVar.r);
                            this.o = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (com.yandex.div.core.view2.divs.c) obj2;
        }

        public final hl11 o0() {
            Object obj;
            Object obj2 = this.K;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.K;
                        if (obj instanceof UninitializedLock) {
                            obj = new hl11(g0());
                            this.K = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (hl11) obj2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final iva0 p() {
            return j0();
        }

        public final il11 p0() {
            Object obj;
            Object obj2 = this.S;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.S;
                        if (obj instanceof UninitializedLock) {
                            obj = new il11(g0());
                            this.S = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (il11) obj2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final dpl q() {
            Object obj;
            Object obj2 = this.E;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.E;
                        if (obj instanceof UninitializedLock) {
                            rtk R = R();
                            ujk ujkVar = this.X;
                            dpl dplVar = new dpl(R, ujkVar.e, N(), ujkVar.g);
                            this.E = dplVar;
                            obj = dplVar;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (dpl) obj2;
        }

        public final vt31 q0() {
            Object obj;
            Object obj2 = this.O;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.O;
                        if (obj instanceof UninitializedLock) {
                            boolean z = this.X.v;
                            boolean z2 = this.X.w;
                            this.X.getClass();
                            int i = 14;
                            obj = z ? new jd1((wt31) ((cot) (z2 ? new au50(i, new cot(1, new wt31())) : new au50(i, cot.c)).b).b, j0(), this.Y.e()) : new dyf0();
                            this.O = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (vt31) obj2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final Div2ViewComponent.Builder r() {
            Div2ViewComponentImpl.ComponentFactoryImpl componentFactoryImpl = new Div2ViewComponentImpl.ComponentFactoryImpl();
            componentFactoryImpl.a = this;
            componentFactoryImpl.b = this.Y;
            return componentFactoryImpl;
        }

        public final com.yandex.div.internal.viewpool.optimization.a r0() {
            Object obj;
            Object obj2 = this.z;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.z;
                        if (obj instanceof UninitializedLock) {
                            obj = new com.yandex.div.internal.viewpool.optimization.a(this.Y.i, this.X.l);
                            this.z = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (com.yandex.div.internal.viewpool.optimization.a) obj2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final com.yandex.div.internal.viewpool.optimization.a s() {
            return r0();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final b t() {
            return Y();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final boolean u() {
            return this.X.A;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final z2k v() {
            return I();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final boolean w() {
            return Boolean.valueOf(this.X.C).booleanValue();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final xhl x() {
            Object obj;
            Object obj2 = this.t;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.t;
                        if (obj instanceof UninitializedLock) {
                            obj = new xhl(K(), g0());
                            this.t = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (xhl) obj2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final oil y() {
            Object obj;
            Object obj2 = this.F;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.F;
                        if (obj instanceof UninitializedLock) {
                            Y();
                            obj = new oil();
                            this.F = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (oil) obj2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final vsi0 z() {
            Object obj;
            Object obj2 = this.B;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.B;
                        if (obj instanceof UninitializedLock) {
                            obj = new vsi0(k0());
                            this.B = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (vsi0) obj2;
        }
    }

    public static final class ProviderImpl implements g3y {
        public final Yatagan$DivKitComponent a;
        public final int b;

        public ProviderImpl(Yatagan$DivKitComponent yatagan$DivKitComponent, int i) {
            this.a = yatagan$DivKitComponent;
            this.b = i;
        }

        @Override // defpackage.yvf0
        public final Object get() {
            Object obj;
            Object obj2;
            Object obj3;
            Object obj4;
            Yatagan$DivKitComponent yatagan$DivKitComponent = this.a;
            int i = this.b;
            if (i == 1) {
                yatagan$DivKitComponent.j.getClass();
                HistogramConfiguration$DefaultHistogramConfiguration histogramConfiguration$DefaultHistogramConfiguration = xku.a;
                return xw91.z;
            }
            if (i == 2) {
                Object obj5 = yatagan$DivKitComponent.c;
                if (obj5 instanceof UninitializedLock) {
                    synchronized (obj5) {
                        try {
                            obj = yatagan$DivKitComponent.c;
                            if (obj instanceof UninitializedLock) {
                                yatagan$DivKitComponent.j.getClass();
                                au50 au50Var = new au50(14, cot.c);
                                Context context = yatagan$DivKitComponent.i;
                                yatagan$DivKitComponent.j.getClass();
                                HistogramConfiguration$DefaultHistogramConfiguration histogramConfiguration$DefaultHistogramConfiguration2 = xku.a;
                                obj = ubl.a(au50Var, context, yatagan$DivKitComponent.d());
                                yatagan$DivKitComponent.c = obj;
                            }
                        } finally {
                        }
                    }
                    obj5 = obj;
                }
                return (DivStorageComponent) obj5;
            }
            if (i == 3) {
                Object obj6 = yatagan$DivKitComponent.e;
                if (obj6 != null) {
                    synchronized (obj6) {
                        try {
                            obj2 = yatagan$DivKitComponent.e;
                            if (obj2 != null) {
                                yatagan$DivKitComponent.j.getClass();
                                yatagan$DivKitComponent.e = null;
                                obj2 = null;
                            }
                        } finally {
                        }
                    }
                    obj6 = obj2;
                }
                b64.D(obj6);
                return null;
            }
            if (i == 4) {
                Object obj7 = yatagan$DivKitComponent.f;
                if (obj7 instanceof UninitializedLock) {
                    synchronized (obj7) {
                        try {
                            obj3 = yatagan$DivKitComponent.f;
                            if (obj3 instanceof UninitializedLock) {
                                Object obj8 = yatagan$DivKitComponent.j.b;
                                jlu jluVar = new jlu((ad60) ((i3y) xku.a.b.b).getValue());
                                yatagan$DivKitComponent.f = jluVar;
                                obj3 = jluVar;
                            }
                        } finally {
                        }
                    }
                    obj7 = obj3;
                }
                return (jlu) obj7;
            }
            if (i != 5) {
                yatagan$DivKitComponent.getClass();
                ny61.w();
                return null;
            }
            Object obj9 = yatagan$DivKitComponent.h;
            if (obj9 instanceof UninitializedLock) {
                synchronized (obj9) {
                    try {
                        obj4 = yatagan$DivKitComponent.h;
                        if (obj4 instanceof UninitializedLock) {
                            obj4 = new wku();
                            yatagan$DivKitComponent.h = obj4;
                        }
                    } finally {
                    }
                }
                obj9 = obj4;
            }
            return (wku) obj9;
        }
    }

    public static final class UninitializedLock {
    }

    public Yatagan$DivKitComponent(Context context, am2 am2Var) {
        this.i = context;
        this.j = am2Var;
    }

    public static DivKitComponent.Builder builder() {
        return new ComponentFactoryImpl();
    }

    @Override // com.yandex.div.core.dagger.DivKitComponent
    public final xku a() {
        Object obj = this.j.b;
        return xku.a;
    }

    @Override // com.yandex.div.core.dagger.DivKitComponent
    public final v2l b() {
        return d();
    }

    @Override // com.yandex.div.core.dagger.DivKitComponent
    public final Div2Component.Builder c() {
        Div2ComponentImpl.ComponentFactoryImpl componentFactoryImpl = new Div2ComponentImpl.ComponentFactoryImpl();
        componentFactoryImpl.a = this;
        return componentFactoryImpl;
    }

    public final v2l d() {
        Object obj;
        Object obj2 = this.g;
        if (obj2 instanceof UninitializedLock) {
            synchronized (obj2) {
                try {
                    obj = this.g;
                    if (obj instanceof UninitializedLock) {
                        this.j.getClass();
                        HistogramConfiguration$DefaultHistogramConfiguration histogramConfiguration$DefaultHistogramConfiguration = xku.a;
                        v2l.a.getClass();
                        obj = (v2l) com.yandex.div.histogram.b.b.getValue();
                        this.g = obj;
                    }
                } finally {
                }
            }
            obj2 = obj;
        }
        return (v2l) obj2;
    }

    public final fq31 e() {
        Object obj;
        Object obj2 = this.d;
        if (obj2 instanceof UninitializedLock) {
            synchronized (obj2) {
                try {
                    obj = this.d;
                    if (obj instanceof UninitializedLock) {
                        Object obj3 = this.j.b;
                        fq31 fq31Var = new fq31((l2f) ((i3y) xku.a.c.b).getValue());
                        this.d = fq31Var;
                        obj = fq31Var;
                    }
                } finally {
                }
            }
            obj2 = obj;
        }
        return (fq31) obj2;
    }

    public final HashSet f() {
        HashSet hashSet = new HashSet(17);
        hashSet.add(new iek());
        hashSet.add(new com.yandex.div.core.actions.a());
        hashSet.add(new kbk());
        hashSet.add(new lbk());
        hashSet.add(new com.yandex.div.core.actions.b());
        hashSet.add(new mbk());
        hashSet.add(new pbk());
        hashSet.add(new tbk());
        hashSet.add(new vbk());
        hashSet.add(new com.yandex.div.core.actions.c());
        hashSet.add(new wbk());
        hashSet.add(new xbk());
        Object obj = this.j.c;
        hashSet.add(new ybk(dab1.C));
        hashSet.add(new xck());
        hashSet.add(new yck());
        hashSet.add(new com.yandex.div.core.actions.d());
        hashSet.add(new ubk());
        return hashSet;
    }
}
