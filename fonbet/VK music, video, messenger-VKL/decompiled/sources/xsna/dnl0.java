package xsna;

import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: StorefrontServicesActor.kt */
@b6l(c = "com.vk.ecomm.storefrontservices.impl.presentation.feature.StorefrontServicesActor$loadMore$2", f = "StorefrontServicesActor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class dnl0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ bnl0 this$0;

    /* compiled from: StorefrontServicesActor.kt */
    @b6l(c = "com.vk.ecomm.storefrontservices.impl.presentation.feature.StorefrontServicesActor$loadMore$2$1", f = "StorefrontServicesActor.kt", l = {116, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 127, 130, 138, 141}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ bnl0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(bnl0 bnl0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = bnl0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x011d  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0123  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00de  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            mol0 mol0Var;
            Object obj2;
            mol0 mol0Var2;
            Object obj3;
            mol0 mol0Var3;
            wyh0 wyh0Var;
            wyh0 wyh0Var2;
            lsi0 lsi0Var;
            lsi0 lsi0Var2;
            gr1 gr1Var;
            gr1 gr1Var2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            switch (this.label) {
                case 0:
                    kotlin.a.a(obj);
                    mol0 mol0Var4 = (mol0) this.this$0.b.getCurrentState();
                    wyh0 wyh0Var3 = mol0Var4.f;
                    if (wyh0Var3 != null) {
                        bnl0 bnl0Var = this.this$0;
                        ggr ggrVar = mol0Var4.g;
                        int size = wyh0Var3.a.size();
                        this.L$0 = mol0Var4;
                        this.label = 1;
                        Object q = bnl0.q(bnl0Var, ggrVar, size, this);
                        if (q != coroutineSingletons) {
                            mol0Var3 = mol0Var4;
                            obj = q;
                            wyh0Var = (wyh0) obj;
                            if (wyh0Var == null) {
                                this.L$0 = mol0Var3;
                                this.L$1 = wyh0Var;
                                this.label = 2;
                                if (qsl.b(3000L, this) != coroutineSingletons) {
                                    wyh0Var2 = wyh0Var;
                                    wyh0Var = wyh0Var2;
                                }
                            }
                            rdi.y(this.this$0, new yl0(26, mol0Var3, wyh0Var));
                            return s3q0.a;
                        }
                    } else {
                        lsi0 lsi0Var3 = mol0Var4.e;
                        if (lsi0Var3 == null) {
                            gr1 gr1Var3 = mol0Var4.d;
                            if (gr1Var3 != null) {
                                dol0 dol0Var = this.this$0.d;
                                int size2 = gr1Var3.a.size();
                                this.L$0 = mol0Var4;
                                this.label = 5;
                                Object d = dol0Var.d(size2, this);
                                if (d != coroutineSingletons) {
                                    mol0Var = mol0Var4;
                                    obj2 = d;
                                    gr1Var = (gr1) (obj2 instanceof Result.Failure ? null : obj2);
                                    if (gr1Var == null) {
                                        this.L$0 = mol0Var;
                                        this.L$1 = gr1Var;
                                        this.label = 6;
                                        if (qsl.b(3000L, this) != coroutineSingletons) {
                                            gr1Var2 = gr1Var;
                                            gr1Var = gr1Var2;
                                        }
                                    }
                                    rdi.y(this.this$0, new b7(28, mol0Var, gr1Var));
                                }
                            }
                            return s3q0.a;
                        }
                        dol0 dol0Var2 = this.this$0.d;
                        List<fsi0> list = lsi0Var3.c;
                        int size3 = list != null ? list.size() : lsi0Var3.b.size();
                        this.L$0 = mol0Var4;
                        this.label = 3;
                        Object e = dol0Var2.e(size3, this);
                        if (e != coroutineSingletons) {
                            mol0Var2 = mol0Var4;
                            obj3 = e;
                            lsi0Var = (lsi0) (obj3 instanceof Result.Failure ? null : obj3);
                            if (lsi0Var == null) {
                                this.L$0 = mol0Var2;
                                this.L$1 = lsi0Var;
                                this.label = 4;
                                if (qsl.b(3000L, this) != coroutineSingletons) {
                                    lsi0Var2 = lsi0Var;
                                    lsi0Var = lsi0Var2;
                                }
                            }
                            rdi.y(this.this$0, new com.vk.movika.sdk.base.logic.interactor.i(27, mol0Var2, lsi0Var));
                            return s3q0.a;
                        }
                    }
                    return coroutineSingletons;
                case 1:
                    mol0Var3 = (mol0) this.L$0;
                    kotlin.a.a(obj);
                    wyh0Var = (wyh0) obj;
                    if (wyh0Var == null) {
                    }
                    rdi.y(this.this$0, new yl0(26, mol0Var3, wyh0Var));
                    return s3q0.a;
                case 2:
                    wyh0Var2 = (wyh0) this.L$1;
                    mol0Var3 = (mol0) this.L$0;
                    kotlin.a.a(obj);
                    wyh0Var = wyh0Var2;
                    rdi.y(this.this$0, new yl0(26, mol0Var3, wyh0Var));
                    return s3q0.a;
                case 3:
                    mol0Var2 = (mol0) this.L$0;
                    kotlin.a.a(obj);
                    obj3 = ((Result) obj).d();
                    lsi0Var = (lsi0) (obj3 instanceof Result.Failure ? null : obj3);
                    if (lsi0Var == null) {
                    }
                    rdi.y(this.this$0, new com.vk.movika.sdk.base.logic.interactor.i(27, mol0Var2, lsi0Var));
                    return s3q0.a;
                case 4:
                    lsi0Var2 = (lsi0) this.L$1;
                    mol0Var2 = (mol0) this.L$0;
                    kotlin.a.a(obj);
                    lsi0Var = lsi0Var2;
                    rdi.y(this.this$0, new com.vk.movika.sdk.base.logic.interactor.i(27, mol0Var2, lsi0Var));
                    return s3q0.a;
                case 5:
                    mol0Var = (mol0) this.L$0;
                    kotlin.a.a(obj);
                    obj2 = ((Result) obj).d();
                    gr1Var = (gr1) (obj2 instanceof Result.Failure ? null : obj2);
                    if (gr1Var == null) {
                    }
                    rdi.y(this.this$0, new b7(28, mol0Var, gr1Var));
                    return s3q0.a;
                case 6:
                    gr1Var2 = (gr1) this.L$1;
                    mol0Var = (mol0) this.L$0;
                    kotlin.a.a(obj);
                    gr1Var = gr1Var2;
                    rdi.y(this.this$0, new b7(28, mol0Var, gr1Var));
                    return s3q0.a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnl0(bnl0 bnl0Var, spj<? super dnl0> spjVar) {
        super(2, spjVar);
        this.this$0 = bnl0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        dnl0 dnl0Var = new dnl0(this.this$0, spjVar);
        dnl0Var.L$0 = obj;
        return dnl0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((dnl0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        myc0.h(yvjVar, null, null, new a(this.this$0, null), 3);
        return s3q0.a;
    }
}
