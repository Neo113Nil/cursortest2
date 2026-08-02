package ru.rustore.sdk.pushclient.t;

import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.c5g;
import xsna.fto0;
import xsna.hay0;
import xsna.myc0;
import xsna.s3q0;
import xsna.siy0;
import xsna.spj;
import xsna.voy0;
import xsna.wzs;
import xsna.yvj;

@b6l(c = "ru.rustore.sdk.pushclient.internal.external.HandleNoMasterHostUseCase$invoke$1", f = "HandleNoMasterHostUseCase.kt", l = {21, 25, 29, 41, 47}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ siy0 c;

    @b6l(c = "ru.rustore.sdk.pushclient.internal.external.HandleNoMasterHostUseCase$invoke$1$installedAndRequested$2$1", f = "HandleNoMasterHostUseCase.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super Pair<? extends String, ? extends Boolean>>, Object> {
        public final /* synthetic */ String a;
        public final /* synthetic */ siy0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, siy0 siy0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.a = str;
            this.b = siy0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.a, this.b, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super Pair<? extends String, ? extends Boolean>> spjVar) {
            return new a(this.a, this.b, spjVar).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            kotlin.a.a(obj);
            String str = this.a;
            return new Pair(str, Boolean.valueOf(this.b.b.checkAppInstalled(str)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(siy0 siy0Var, spj<? super b> spjVar) {
        super(2, spjVar);
        this.c = siy0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        b bVar = new b(this.c, spjVar);
        bVar.b = obj;
        return bVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        b bVar = new b(this.c, spjVar);
        bVar.b = yvjVar;
        return bVar.invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0157, code lost:
    
        if (r12.e(r11) != r0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0159, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f0, code lost:
    
        if (r12 == r0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x008c, code lost:
    
        if (r12 == r0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0071, code lost:
    
        if (r12 == r0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0056, code lost:
    
        if (r12 == r0) goto L61;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar;
        ArrayList arrayList;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            kotlin.a.a(obj);
            yvjVar = (yvj) this.b;
            hay0 hay0Var = this.c.a;
            this.b = yvjVar;
            this.a = 1;
            obj = hay0Var.b(this);
        } else if (i == 1) {
            yvjVar = (yvj) this.b;
            kotlin.a.a(obj);
        } else if (i == 2) {
            yvjVar = (yvj) this.b;
            kotlin.a.a(obj);
            if (((Boolean) obj).booleanValue()) {
                return s3q0.a;
            }
            hay0 hay0Var2 = this.c.a;
            this.b = yvjVar;
            this.a = 3;
            obj = hay0Var2.a(this);
        } else if (i == 3) {
            yvjVar = (yvj) this.b;
            kotlin.a.a(obj);
            List list = (List) obj;
            if (Build.VERSION.SDK_INT >= 30) {
                List<String> initializedClientPackages = this.c.b.getInitializedClientPackages();
                arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (initializedClientPackages.contains((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                this.c.c.send(new voy0(arrayList));
                hay0 hay0Var3 = this.c.a;
                this.b = null;
                this.a = 5;
            } else {
                siy0 siy0Var = this.c;
                ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(myc0.b(yvjVar, null, null, new a((String) it.next(), siy0Var, null), 3));
                }
                this.b = null;
                this.a = 4;
                obj = fto0.e(arrayList2, this);
            }
        } else {
            if (i != 4) {
                if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            kotlin.a.a(obj);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : (Iterable) obj) {
                if (((Boolean) ((Pair) obj3).j()).booleanValue()) {
                    arrayList3.add(obj3);
                }
            }
            ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add((String) ((Pair) it2.next()).i());
            }
            arrayList = arrayList4;
            this.c.c.send(new voy0(arrayList));
            hay0 hay0Var32 = this.c.a;
            this.b = null;
            this.a = 5;
        }
        if (!((Boolean) obj).booleanValue()) {
            return s3q0.a;
        }
        hay0 hay0Var4 = this.c.a;
        this.b = yvjVar;
        this.a = 2;
        obj = hay0Var4.c(this);
    }
}
