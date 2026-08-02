package xsna;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.y5j;

/* compiled from: ConstrainScope.kt */
/* loaded from: classes11.dex */
public final class q5j {
    public static final /* synthetic */ qcy<Object>[] k = {new MutablePropertyReference1Impl(q5j.class, "width", "getWidth()Landroidx/constraintlayout/compose/Dimension;", 0), p5j.a(0, q5j.class, "height", "getHeight()Landroidx/constraintlayout/compose/Dimension;", fpf0.a), new MutablePropertyReference1Impl(q5j.class, "visibility", "getVisibility()Landroidx/constraintlayout/compose/Visibility;", 0), new MutablePropertyReference1Impl(q5j.class, "scaleX", "getScaleX()F", 0), new MutablePropertyReference1Impl(q5j.class, "scaleY", "getScaleY()F", 0), new MutablePropertyReference1Impl(q5j.class, "rotationX", "getRotationX()F", 0), new MutablePropertyReference1Impl(q5j.class, "rotationY", "getRotationY()F", 0), new MutablePropertyReference1Impl(q5j.class, "rotationZ", "getRotationZ()F", 0), new MutablePropertyReference1Impl(q5j.class, "translationX", "getTranslationX-D9Ej5fM()F", 0), new MutablePropertyReference1Impl(q5j.class, "translationY", "getTranslationY-D9Ej5fM()F", 0), new MutablePropertyReference1Impl(q5j.class, "translationZ", "getTranslationZ-D9Ej5fM()F", 0), new MutablePropertyReference1Impl(q5j.class, "pivotX", "getPivotX()F", 0), new MutablePropertyReference1Impl(q5j.class, "pivotY", "getPivotY()F", 0), new MutablePropertyReference1Impl(q5j.class, "horizontalChainWeight", "getHorizontalChainWeight()F", 0), new MutablePropertyReference1Impl(q5j.class, "verticalChainWeight", "getVerticalChainWeight()F", 0)};
    public final Object a;
    public final bv8 b;
    public final s5j c = new s5j("parent");
    public final m6j d;
    public final x5j e;
    public final m6j f;
    public final x5j g;
    public final a h;
    public final a i;
    public final d j;

    /* compiled from: ConstrainScope.kt */
    public final class a extends wq70<yym> {
        public a(bzm bzmVar) {
            super(bzmVar);
        }

        @Override // xsna.wq70
        public final void afterChange(qcy qcyVar, yym yymVar, yym yymVar2) {
            yu8 yu8Var;
            bv8 bv8Var = q5j.this.b;
            String name = qcyVar.getName();
            bzm bzmVar = (bzm) yymVar2;
            lj70 lj70Var = bzmVar.a;
            lj70 lj70Var2 = bzmVar.c;
            lj70 lj70Var3 = bzmVar.b;
            if (((String) lj70Var3.a) == null && ((String) lj70Var2.a) == null) {
                yu8Var = lj70Var.a();
            } else {
                bv8 bv8Var2 = new bv8(new char[0]);
                if (((String) lj70Var3.a) != null) {
                    bv8Var2.z(UcumUtils.UCUM_MINUTES, lj70Var3.a());
                }
                if (((String) lj70Var2.a) != null) {
                    bv8Var2.z(InneractiveMediationNameConsts.MAX, lj70Var2.a());
                }
                bv8Var2.z("value", lj70Var.a());
                yu8Var = bv8Var2;
            }
            bv8Var.z(name, yu8Var);
        }
    }

    /* compiled from: ConstrainScope.kt */
    public final class b extends wq70<pco> {
        public b(float f) {
            super(new pco(f));
        }

        @Override // xsna.wq70
        public final void afterChange(qcy qcyVar, pco pcoVar, pco pcoVar2) {
            float f = pcoVar.b;
            float f2 = pcoVar2.b;
            if (Float.isNaN(f2)) {
                return;
            }
            q5j.this.b.A(f2, qcyVar.getName());
        }
    }

    /* compiled from: ConstrainScope.kt */
    public final class c extends wq70<Float> {
        public final String b;

        public c(float f, String str) {
            super(Float.valueOf(f));
            this.b = str;
        }

        @Override // xsna.wq70
        public final void afterChange(qcy qcyVar, Float f, Float f2) {
            f.floatValue();
            float floatValue = f2.floatValue();
            if (Float.isNaN(floatValue)) {
                return;
            }
            bv8 bv8Var = q5j.this.b;
            String str = this.b;
            if (str == null) {
                str = qcyVar.getName();
            }
            bv8Var.A(floatValue, str);
        }
    }

    /* compiled from: ConstrainScope.kt */
    public static final class d extends wq70<q4u0> {
        public d() {
            super(q4u0.b);
        }

        @Override // xsna.wq70
        public final void afterChange(qcy qcyVar, q4u0 q4u0Var, q4u0 q4u0Var2) {
            q5j.this.b.B(qcyVar.getName(), q4u0Var2.a);
        }
    }

    public q5j(Object obj, bv8 bv8Var) {
        this.a = obj;
        this.b = bv8Var;
        this.d = new m6j(bv8Var, -2);
        new m6j(bv8Var, 0);
        this.e = new x5j(bv8Var, 0);
        this.f = new m6j(bv8Var, -1);
        new m6j(bv8Var, 1);
        this.g = new x5j(bv8Var, 1);
        this.h = new a(new bzm("wrap"));
        this.i = new a(new bzm("wrap"));
        this.j = new d();
        new c(1.0f, null);
        new c(1.0f, null);
        new c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null);
        new c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null);
        new c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null);
        float f = 0;
        new b(f);
        new b(f);
        new b(f);
        new c(0.5f, null);
        new c(0.5f, null);
        new c(Float.NaN, "hWeight");
        new c(Float.NaN, "vWeight");
    }

    public static void a(q5j q5jVar, y5j.a aVar, y5j.a aVar2, float f) {
        q5jVar.e.a(aVar, 0, 0);
        q5jVar.g.a(aVar2, 0, 0);
        q5jVar.b.A(f, "vBias");
    }

    public static void b(q5j q5jVar, y5j.b bVar, y5j.b bVar2, float f, float f2, float f3, int i) {
        if ((i & 4) != 0) {
            f = 0;
        }
        if ((i & 8) != 0) {
            f2 = 0;
        }
        q5jVar.d.b(bVar, f, 0);
        q5jVar.f.b(bVar2, f2, 0);
        q5jVar.b.A(f3, "hRtlBias");
    }

    public final void c(bzm bzmVar) {
        this.i.setValue(this, k[1], bzmVar);
    }

    public final void d(bzm bzmVar) {
        this.h.setValue(this, k[0], bzmVar);
    }
}
