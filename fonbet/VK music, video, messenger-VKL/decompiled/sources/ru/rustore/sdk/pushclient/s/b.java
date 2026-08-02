package ru.rustore.sdk.pushclient.s;

import com.vk.push.common.Logger;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Lambda;
import xsna.b6l;
import xsna.bpn0;
import xsna.drm0;
import xsna.gzs;
import xsna.jay0;
import xsna.kay0;
import xsna.s3q0;

/* loaded from: classes9.dex */
public final class b {
    public final jay0 a;
    public final bpn0 b;

    @b6l(c = "ru.rustore.sdk.pushclient.internal.domain.usecase.DeletePushTokenIfExistsUseCase", f = "DeletePushTokenIfExistsUseCase.kt", l = {15, 18, 21}, m = "invoke")
    public final class a extends ContinuationImpl {
        public b a;
        public boolean b;
        public /* synthetic */ Object c;
        public int e;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return b.this.a(false, this);
        }
    }

    /* renamed from: ru.rustore.sdk.pushclient.s.b$b, reason: collision with other inner class name */
    public static final class C2408b extends Lambda implements gzs<Logger> {
        public final /* synthetic */ Logger a;
        public final /* synthetic */ b b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2408b(Logger logger, b bVar) {
            super(0);
            this.a = logger;
            this.b = bVar;
        }

        @Override // xsna.gzs
        public final Logger invoke() {
            return this.a.createLogger(this.b);
        }
    }

    public b(jay0 jay0Var, Logger logger) {
        this.a = jay0Var;
        this.b = new bpn0(new C2408b(logger, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
    
        if (r8.b(r9, r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009d, code lost:
    
        if (r8.c(r0) != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, ContinuationImpl continuationImpl) {
        a aVar;
        int i;
        Object a2;
        b bVar;
        String str;
        if (continuationImpl instanceof a) {
            aVar = (a) continuationImpl;
            int i2 = aVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.e = i2 - Integer.MIN_VALUE;
                Object obj = aVar.c;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.e;
                if (i != 0) {
                    kotlin.a.a(obj);
                    aVar.a = this;
                    aVar.b = z;
                    aVar.e = 1;
                    a2 = this.a.a(aVar);
                    if (a2 != coroutineSingletons) {
                        bVar = this;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.a.a(obj);
                        ((Result) obj).getClass();
                        return s3q0.a;
                    }
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return s3q0.a;
                }
                z = aVar.b;
                bVar = aVar.a;
                kotlin.a.a(obj);
                a2 = ((kay0) obj).a;
                str = (String) a2;
                if (drm0.N(str) && z) {
                    Logger.DefaultImpls.info$default((Logger) bVar.b.getValue(), "Push token exists, need to remote delete token", null, 2, null);
                    jay0 jay0Var = bVar.a;
                    aVar.a = null;
                    aVar.e = 2;
                } else {
                    Logger.DefaultImpls.info$default((Logger) bVar.b.getValue(), "Push token is null, no need to remote delete token", null, 2, null);
                    jay0 jay0Var2 = bVar.a;
                    aVar.a = null;
                    aVar.e = 3;
                }
                return coroutineSingletons;
            }
        }
        aVar = new a(continuationImpl);
        Object obj2 = aVar.c;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.e;
        if (i != 0) {
        }
        str = (String) a2;
        if (drm0.N(str)) {
        }
        Logger.DefaultImpls.info$default((Logger) bVar.b.getValue(), "Push token is null, no need to remote delete token", null, 2, null);
        jay0 jay0Var22 = bVar.a;
        aVar.a = null;
        aVar.e = 3;
    }
}
