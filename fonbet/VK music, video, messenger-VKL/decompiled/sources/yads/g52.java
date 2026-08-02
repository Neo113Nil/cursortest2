package yads;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.drm0;
import xsna.epx;
import xsna.g5g;
import xsna.i5g;
import xsna.izi0;
import xsna.myc0;
import xsna.rli0;
import xsna.rsr;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* loaded from: classes10.dex */
public final class g52 extends SuspendLambda implements wzs {
    public int b;
    public final /* synthetic */ k52 c;
    public final /* synthetic */ sz1 d;
    public final /* synthetic */ nj2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g52(k52 k52Var, sz1 sz1Var, nj2 nj2Var, spj spjVar) {
        super(2, spjVar);
        this.c = k52Var;
        this.d = sz1Var;
        this.e = nj2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new g52(this.c, this.d, this.e, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return ((g52) create((yvj) obj, (spj) obj2)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010c A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            kotlin.a.a(obj);
            a52 a52Var = this.c.a;
            sz1 sz1Var = this.d;
            nj2 nj2Var = this.e;
            this.b = 1;
            q41 q41Var = (q41) a52Var.g.invoke(nj2Var);
            j51 j51Var = a52Var.f;
            j51Var.getClass();
            v9 v9Var = sz1Var.b;
            e22 e22Var = sz1Var.a;
            List list = e22Var.a;
            e51 e51Var = j51Var.a;
            e51Var.getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                g5g.y(e51Var.a(((gz1) it.next()).b), linkedHashSet);
            }
            j51Var.a.getClass();
            List list2 = e22Var.f;
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                Iterable iterable = ((hi0) it2.next()).d;
                if (iterable == null) {
                    iterable = EmptyList.b;
                }
                g5g.y(iterable, linkedHashSet2);
            }
            Set j = izi0.j(linkedHashSet, linkedHashSet2);
            f82 f82Var = j51Var.b;
            f82Var.getClass();
            Set C = rli0.C(rli0.t(rli0.t(rli0.p(new i5g(e22Var.a), new c82(f82Var)), d82.b), e82.b));
            LinkedHashSet j2 = izi0.j(j, C);
            if (!v9Var.B) {
                j = null;
            }
            if (j == null) {
                j = EmptySet.b;
            }
            LinkedHashSet j3 = izi0.j(C, j);
            HashSet hashSet = new HashSet();
            for (Object obj2 : j3) {
                if (((x41) obj2).f) {
                    hashSet.add(obj2);
                }
            }
            Set g = izi0.g(j2, hashSet);
            q41Var.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : j2) {
                if (((x41) obj3).g != null && (!drm0.N(r13))) {
                    arrayList.add(obj3);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                x41 x41Var = (x41) it3.next();
                nj2 nj2Var2 = q41Var.a;
                nj2Var2.getClass();
                String str = x41Var.g;
                mj2 mj2Var = str != null ? new mj2(str, new c13(x41Var.a, x41Var.b)) : null;
                if ((mj2Var != null ? (Bitmap) nj2Var2.c.get(mj2Var) : null) == null && q41Var.a.a(x41Var) == null) {
                    p41 p41Var = q41Var.b;
                    p41Var.getClass();
                    String str2 = x41Var.g;
                    if (str2 != null) {
                        p41Var.a.getClass();
                        Bitmap a = tj2.a(str2);
                        if (a != null) {
                            try {
                                failure = p41Var.b.a(a, x41Var);
                            } catch (Throwable th) {
                                failure = new Result.Failure(th);
                            }
                            if (failure instanceof Result.Failure) {
                                failure = null;
                            }
                            bitmap = (Bitmap) failure;
                        } else {
                            bitmap = null;
                        }
                        if (bitmap != null) {
                            p41Var.c.getClass();
                            try {
                                bitmap = kq.a(bitmap, 1.0d);
                            } catch (Throwable unused) {
                            }
                            if (bitmap == null) {
                                nj2 nj2Var3 = q41Var.a;
                                nj2Var3.getClass();
                                String str3 = x41Var.g;
                                mj2 mj2Var2 = str3 != null ? new mj2(str3, new c13(x41Var.a, x41Var.b)) : null;
                                if (mj2Var2 != null) {
                                    nj2Var3.c.put(mj2Var2, bitmap);
                                }
                            }
                        }
                    }
                    bitmap = null;
                    if (bitmap == null) {
                    }
                }
            }
            String str4 = sz1Var.b.w;
            s42 s42Var = s42.c;
            if (epx.f(str4, "loading_on_back")) {
                f41 f41Var = a52Var.e;
                f41Var.getClass();
                myc0.h(a52Var.a, null, null, new z42(rsr.i(new c41(f41Var, g, null)), nj2Var, null), 3);
            }
            Object a2 = a52Var.a(hashSet, nj2Var, sz1Var, this);
            if (a2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                a2 = s3q0.a;
            }
            if (a2 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
