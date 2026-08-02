package xsna;

import com.vkontakte.android.api.ExtendedUserProfile;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.aiq0;
import xsna.niq0;

/* compiled from: AvatarActionHandler.kt */
/* loaded from: classes5.dex */
public final class mp5 implements s40<aiq0>, yp90<wiq0> {
    public final /* synthetic */ s40<aiq0> b;
    public final /* synthetic */ yp90<wiq0> c;
    public final pta d;
    public final ExtendedUserProfile e;
    public final io.reactivex.rxjava3.disposables.b f;
    public final ls5 g;
    public final mq5 h;
    public final lyd0 i;
    public final aha0 j;
    public final io.reactivex.rxjava3.subjects.f<aiq0.a> k;
    public final AtomicBoolean l;
    public String m;

    /* compiled from: AvatarActionHandler.kt */
    public static final class a {
        public final String a;
        public final int b;
        public final int c;
        public final float d;
        public final float e;
        public final float f;

        public a(String str, int i, int i2, float f, float f2, float f3) {
            this.a = str;
            this.b = i;
            this.c = i2;
            this.d = f;
            this.e = f2;
            this.f = f3;
        }
    }

    public mp5(pta ptaVar, ExtendedUserProfile extendedUserProfile, io.reactivex.rxjava3.disposables.b bVar, lyd0 lyd0Var, liq0 liq0Var, niq0.a aVar) {
        ls5 ls5Var = new ls5();
        mq5 mq5Var = new mq5(ls5Var);
        this.b = liq0Var;
        this.c = aVar;
        this.d = ptaVar;
        this.e = extendedUserProfile;
        this.f = bVar;
        this.g = ls5Var;
        this.h = mq5Var;
        this.i = lyd0Var;
        this.j = new aha0();
        io.reactivex.rxjava3.subjects.f<aiq0.a> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.k = fVar;
        this.l = new AtomicBoolean(false);
        this.m = "profile_edit_photo";
        io.reactivex.rxjava3.internal.operators.observable.i0 i0Var = new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, new e05(new n40(this, 6), 1));
        zl0 zl0Var = new zl0(new ka(this, 5), 3);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        bVar.b(i0Var.E(zl0Var, lVar, kVar, kVar).U(new c7(new i50(this, 6), 6)).subscribe(new qf(new pf(4), 1), new lp5(new rf(2), 0)));
    }

    @Override // xsna.yp90
    public final void a(wiq0 wiq0Var) {
        this.c.a(wiq0Var);
    }

    @Override // xsna.s40
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void e2(aiq0 aiq0Var) {
        this.b.e2(aiq0Var);
    }
}
