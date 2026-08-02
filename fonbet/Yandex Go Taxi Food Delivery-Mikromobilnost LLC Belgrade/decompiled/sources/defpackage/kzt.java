package defpackage;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.ShapeStroke$LineCapType;
import com.airbnb.lottie.model.content.ShapeStroke$LineJoinType;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class kzt implements ehe {
    public final String a;
    public final GradientType b;
    public final ce2 c;
    public final ae2 d;
    public final ae2 e;
    public final ae2 f;
    public final be2 g;
    public final ShapeStroke$LineCapType h;
    public final ShapeStroke$LineJoinType i;
    public final float j;
    public final ArrayList k;
    public final be2 l;
    public final boolean m;

    public kzt(String str, GradientType gradientType, ce2 ce2Var, ae2 ae2Var, ae2 ae2Var2, ae2 ae2Var3, be2 be2Var, ShapeStroke$LineCapType shapeStroke$LineCapType, ShapeStroke$LineJoinType shapeStroke$LineJoinType, float f, ArrayList arrayList, be2 be2Var2, boolean z) {
        this.a = str;
        this.b = gradientType;
        this.c = ce2Var;
        this.d = ae2Var;
        this.e = ae2Var2;
        this.f = ae2Var3;
        this.g = be2Var;
        this.h = shapeStroke$LineCapType;
        this.i = shapeStroke$LineJoinType;
        this.j = f;
        this.k = arrayList;
        this.l = be2Var2;
        this.m = z;
    }

    @Override // defpackage.ehe
    public final uee a(LottieDrawable lottieDrawable, nsz nszVar, l35 l35Var) {
        return new lzt(lottieDrawable, l35Var, this);
    }
}
