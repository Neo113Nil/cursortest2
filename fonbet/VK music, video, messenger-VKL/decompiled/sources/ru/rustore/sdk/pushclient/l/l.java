package ru.rustore.sdk.pushclient.l;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.asl;
import xsna.b6l;
import xsna.eay0;
import xsna.myc0;
import xsna.nyy0;
import xsna.s3q0;
import xsna.spj;
import xsna.ui50;
import xsna.wzs;
import xsna.yvj;

@b6l(c = "ru.rustore.sdk.pushclient.internal.data.source.IPCClientsDataSource$getOrUpdate$2", f = "IPCClientsDataSource.kt", l = {TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER, 45}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class l extends SuspendLambda implements wzs<yvj, spj<? super eay0>, Object> {
    public ui50 a;
    public nyy0 b;
    public boolean c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ nyy0 f;
    public final /* synthetic */ boolean g;

    @b6l(c = "ru.rustore.sdk.pushclient.internal.data.source.IPCClientsDataSource$getOrUpdate$2$2$ipcClientsNotNull$1", f = "IPCClientsDataSource.kt", l = {40}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super eay0>, Object> {
        public int a;
        public final /* synthetic */ nyy0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(nyy0 nyy0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.b = nyy0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.b, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super eay0> spjVar) {
            return new a(this.b, spjVar).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return obj;
            }
            kotlin.a.a(obj);
            nyy0 nyy0Var = this.b;
            this.a = 1;
            Object b = nyy0.b(nyy0Var, this);
            return b == coroutineSingletons ? coroutineSingletons : b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(nyy0 nyy0Var, boolean z, spj<? super l> spjVar) {
        super(2, spjVar);
        this.f = nyy0Var;
        this.g = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        l lVar = new l(this.f, this.g, spjVar);
        lVar.e = obj;
        return lVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super eay0> spjVar) {
        return ((l) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar;
        ui50 ui50Var;
        boolean z;
        nyy0 nyy0Var;
        asl aslVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.d;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                yvjVar = (yvj) this.e;
                if (this.f.f != null && !this.g) {
                    aslVar = this.f.f;
                    if (aslVar == null) {
                        throw new IllegalStateException("Something went wrong, deferred is null");
                    }
                    this.e = null;
                    this.a = null;
                    this.b = null;
                    this.d = 2;
                    Object J = aslVar.J(this);
                    return J != coroutineSingletons ? coroutineSingletons : J;
                }
                nyy0 nyy0Var2 = this.f;
                ui50Var = nyy0Var2.g;
                z = this.g;
                this.e = yvjVar;
                this.a = ui50Var;
                this.b = nyy0Var2;
                this.c = z;
                this.d = 1;
                if (ui50Var.b(this) != coroutineSingletons) {
                    nyy0Var = nyy0Var2;
                }
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return obj;
            }
            z = this.c;
            nyy0Var = this.b;
            ui50Var = this.a;
            yvjVar = (yvj) this.e;
            kotlin.a.a(obj);
            if (nyy0Var.f == null || z) {
                aslVar = myc0.b(yvjVar, null, null, new a(nyy0Var, null), 3);
                nyy0Var.f = aslVar;
            } else {
                aslVar = nyy0Var.f;
                if (aslVar == null) {
                    throw new IllegalStateException("Something went wrong, deferred is null");
                }
            }
            this.e = null;
            this.a = null;
            this.b = null;
            this.d = 2;
            Object J2 = aslVar.J(this);
            if (J2 != coroutineSingletons) {
            }
        } finally {
            ui50Var.c(null);
        }
    }
}
