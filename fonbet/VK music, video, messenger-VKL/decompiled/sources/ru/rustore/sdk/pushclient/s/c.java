package ru.rustore.sdk.pushclient.s;

import com.vk.push.common.DefaultLogger;
import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.core.domain.repository.PackagesRepository;
import com.vk.push.core.utils.StringExtensionsKt;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Lambda;
import xsna.aaz0;
import xsna.b6l;
import xsna.bpn0;
import xsna.gzs;
import xsna.jay0;
import xsna.kiy0;
import xsna.s101;
import xsna.s3q0;

/* loaded from: classes9.dex */
public final class c {
    public final jay0 a;
    public final PackagesRepository b;
    public final AnalyticsSender c;
    public final bpn0 d = new bpn0(b.i);

    @b6l(c = "ru.rustore.sdk.pushclient.internal.domain.usecase.DeletePushTokenIfNoHostsUseCase", f = "DeletePushTokenIfNoHostsUseCase.kt", l = {25}, m = "invoke-gIAlu-s")
    public final class a extends ContinuationImpl {
        public c a;
        public String b;
        public /* synthetic */ Object c;
        public int e;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            Object a = c.this.a(null, this);
            return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
        }
    }

    public static final class b extends Lambda implements gzs<Logger> {
        public static final b i = new b();

        public b() {
            super(0);
        }

        @Override // xsna.gzs
        public final Logger invoke() {
            Logger defaultLogger;
            aaz0 aaz0Var = s101.f;
            if (aaz0Var == null || (defaultLogger = aaz0Var.c) == null) {
                defaultLogger = new DefaultLogger("VkpnsClientSdk");
            }
            return defaultLogger.createLogger("DeletePushTokenIfNoHostsUseCase");
        }
    }

    public c(jay0 jay0Var, PackagesRepository packagesRepository, AnalyticsSender analyticsSender) {
        this.a = jay0Var;
        this.b = packagesRepository;
        this.c = analyticsSender;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        a aVar;
        int i;
        Object b2;
        c cVar;
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
                    if (!this.b.getInitializedHostPackages().isEmpty()) {
                        Logger.DefaultImpls.info$default((Logger) this.d.getValue(), "Push token " + StringExtensionsKt.hideSensitive(str) + " will not be deleted because host app has been installed", null, 2, null);
                        return s3q0.a;
                    }
                    aVar.a = this;
                    aVar.b = str;
                    aVar.e = 1;
                    b2 = this.a.b(str, aVar);
                    if (b2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    cVar = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = aVar.b;
                    cVar = aVar.a;
                    kotlin.a.a(obj);
                    b2 = ((Result) obj).d();
                }
                if (!(b2 instanceof Result.Failure)) {
                    Logger.DefaultImpls.info$default((Logger) cVar.d.getValue(), "Push token " + StringExtensionsKt.hideSensitive(str) + " has been deleted", null, 2, null);
                    cVar.c.send(new kiy0(str, ru.rustore.sdk.pushclient.b.b.c));
                }
                return b2;
            }
        }
        aVar = new a(continuationImpl);
        Object obj2 = aVar.c;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.e;
        if (i != 0) {
        }
        if (!(b2 instanceof Result.Failure)) {
        }
        return b2;
    }
}
