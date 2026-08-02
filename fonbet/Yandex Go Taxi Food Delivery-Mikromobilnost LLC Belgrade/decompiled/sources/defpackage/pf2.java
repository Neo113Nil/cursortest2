package defpackage;

import com.yandex.go.pin.api.v1.AnimatedParams$Index;

/* loaded from: classes13.dex */
public final class pf2 {
    public static final nf2 a(pf2 pf2Var) {
        pf2Var.getClass();
        nf2 nf2Var = new nf2(false);
        nf2Var.b(AnimatedParams$Index.BASE_OFFSET, 1.1f);
        return nf2Var;
    }

    public static final nf2 b(pf2 pf2Var) {
        pf2Var.getClass();
        nf2 c = c();
        c.b(AnimatedParams$Index.EYE_ALPHA, 1.0f);
        AnimatedParams$Index animatedParams$Index = AnimatedParams$Index.EYE_OFFSET;
        c.b(animatedParams$Index, 0.0f, 0.5f);
        mf2[] mf2VarArr = c.a;
        mf2VarArr[animatedParams$Index.ordinal()].c = new float[]{0.0f, 0.8f};
        AnimatedParams$Index animatedParams$Index2 = AnimatedParams$Index.EYE_COMPRESS;
        c.b(animatedParams$Index2, 0.0f, 0.07f);
        mf2VarArr[animatedParams$Index2.ordinal()].c = new float[]{0.0f, 0.8f};
        c.b(AnimatedParams$Index.BASE_OFFSET, 1.5f, 0.9f);
        c.b(AnimatedParams$Index.SHADOW_ALPHA, 0.1f, 0.15f);
        c.b(AnimatedParams$Index.SHADOW_SIZE, 1.0f, 0.75f);
        c.b(AnimatedParams$Index.DOT_ALPHA, 0.2f, 0.4f);
        return c;
    }

    public static nf2 c() {
        nf2 nf2Var = new nf2(false);
        nf2Var.b(AnimatedParams$Index.CONTENT_OFFSET, 0.9f);
        nf2Var.b(AnimatedParams$Index.COLUMN_ALPHA, 1.0f);
        nf2Var.b(AnimatedParams$Index.SHADOW_ALPHA, 0.15f);
        nf2Var.b(AnimatedParams$Index.SHADOW_SIZE, 0.33f);
        return nf2Var;
    }
}
