package com.ybsdk.common.repositiories.auth;

import com.ybsdk.network.Api;
import com.ybsdk.network.dto.StartSessionRequest;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import defpackage.g8e;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.tls;
import defpackage.wlp;
import defpackage.wls;
import defpackage.ynb1;
import defpackage.yu50;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/network/dto/StartSessionResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.common.repositiories.auth.AuthRepositoryImpl$authorize$2", f = "AuthRepositoryImpl.kt", l = {119, HProv.PP_VERSION_EX, HProv.PP_ENUM_CONTAINER_EXTENSION}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AuthRepositoryImpl$authorize$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $lastPinToken;
    final /* synthetic */ StartSessionRequest $request;
    final /* synthetic */ String $tokenValue;
    final /* synthetic */ String $verificationToken;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/network/dto/StartSessionResponse;", "idempotencyToken", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @mvg(c = "com.ybsdk.common.repositiories.auth.AuthRepositoryImpl$authorize$2$1", f = "AuthRepositoryImpl.kt", l = {HProv.PP_DELETE_SAVED_PASSWD, 120}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.common.repositiories.auth.AuthRepositoryImpl$authorize$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ String $lastPinToken;
        final /* synthetic */ StartSessionRequest $request;
        final /* synthetic */ String $tokenValue;
        final /* synthetic */ String $verificationToken;
        int I$0;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, String str, StartSessionRequest startSessionRequest, String str2, String str3, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$tokenValue = str;
            this.$request = startSessionRequest;
            this.$lastPinToken = str2;
            this.$verificationToken = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$tokenValue, this.$request, this.$lastPinToken, this.$verificationToken, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x00d6, code lost:
        
            if (r0 == r7) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String str;
            Api api;
            String o;
            StartSessionRequest startSessionRequest;
            String str2;
            Pair[] pairArr;
            String str3;
            int i;
            Object b;
            Pair[] pairArr2;
            Object m;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                kotlin.b.b(obj);
                str = (String) this.L$0;
                api = this.this$0.b;
                o = g8e.o("Bearer ", this.$tokenValue);
                startSessionRequest = this.$request;
                str2 = this.$lastPinToken;
                pairArr = new Pair[3];
                str3 = yu50.f;
                a aVar = this.this$0;
                this.L$0 = pairArr;
                this.L$1 = api;
                this.L$2 = o;
                this.L$3 = startSessionRequest;
                this.L$4 = str2;
                this.L$5 = str;
                this.L$6 = pairArr;
                this.L$7 = str3;
                i = 0;
                this.I$0 = 0;
                this.label = 1;
                b = ((com.ybsdk.persistence.a) aVar.a).b(this);
                if (b != coroutineSingletons) {
                    pairArr2 = pairArr;
                }
                return coroutineSingletons;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                m = ((Result) obj).getValue();
                return new Result(m);
            }
            int i3 = this.I$0;
            str3 = (String) this.L$7;
            pairArr = (Pair[]) this.L$6;
            str = (String) this.L$5;
            str2 = (String) this.L$4;
            startSessionRequest = (StartSessionRequest) this.L$3;
            o = (String) this.L$2;
            api = (Api) this.L$1;
            Pair[] pairArr3 = (Pair[]) this.L$0;
            kotlin.b.b(obj);
            pairArr2 = pairArr3;
            i = i3;
            b = obj;
            pairArr[i] = new Pair(str3, b);
            pairArr2[1] = new Pair(yu50.g, oyr.p("package=", this.this$0.p.getPackageName(), ";sdk_version=0.233.1;build_type=release;os=android"));
            pairArr2[2] = new Pair(yu50.a, this.$verificationToken);
            Map<String, String> b2 = ynb1.b(pairArr2);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.L$7 = null;
            this.label = 2;
            StartSessionRequest startSessionRequest2 = startSessionRequest;
            String str4 = o;
            Api api2 = api;
            m = api2.m(str4, startSessionRequest2, str2, str, b2, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthRepositoryImpl$authorize$2(a aVar, String str, StartSessionRequest startSessionRequest, String str2, String str3, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$tokenValue = str;
        this.$request = startSessionRequest;
        this.$lastPinToken = str2;
        this.$verificationToken = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new AuthRepositoryImpl$authorize$2(this.this$0, this.$tokenValue, this.$request, this.$lastPinToken, this.$verificationToken, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((AuthRepositoryImpl$authorize$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00fb, code lost:
    
        if (r0 != r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        if (r0 == r6) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Api api;
        String o;
        StartSessionRequest startSessionRequest;
        String str;
        Pair[] pairArr;
        String str2;
        int i;
        Object b;
        Pair[] pairArr2;
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    int i3 = this.I$0;
                    str2 = (String) this.L$6;
                    pairArr = (Pair[]) this.L$5;
                    str = (String) this.L$4;
                    startSessionRequest = (StartSessionRequest) this.L$3;
                    o = (String) this.L$2;
                    api = (Api) this.L$1;
                    Pair[] pairArr3 = (Pair[]) this.L$0;
                    kotlin.b.b(obj);
                    pairArr2 = pairArr3;
                    i = i3;
                    b = obj;
                    pairArr[i] = new Pair(str2, b);
                    pairArr2[1] = new Pair(yu50.g, oyr.p("package=", this.this$0.p.getPackageName(), ";sdk_version=0.233.1;build_type=release;os=android"));
                    pairArr2[2] = new Pair(yu50.a, this.$verificationToken);
                    Map<String, String> b2 = ynb1.b(pairArr2);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.label = 3;
                    String str3 = o;
                    Api api2 = api;
                    a = api2.v(str3, startSessionRequest, str, b2, this);
                } else if (i2 != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
            return new Result(a);
        }
        kotlin.b.b(obj);
        boolean isEnabled = ((CommonFeatureFlag) this.this$0.j.d(wlp.v).getData()).isEnabled();
        a aVar = this.this$0;
        if (isEnabled) {
            com.ybsdk.core.utils.c cVar = aVar.s;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(aVar, this.$tokenValue, this.$request, this.$lastPinToken, this.$verificationToken, null);
            this.label = 1;
            a = com.ybsdk.core.utils.d.a(cVar, anonymousClass1, this);
        } else {
            api = aVar.b;
            o = g8e.o("Bearer ", this.$tokenValue);
            startSessionRequest = this.$request;
            str = this.$lastPinToken;
            pairArr = new Pair[3];
            str2 = yu50.f;
            a aVar2 = this.this$0;
            this.L$0 = pairArr;
            this.L$1 = api;
            this.L$2 = o;
            this.L$3 = startSessionRequest;
            this.L$4 = str;
            this.L$5 = pairArr;
            this.L$6 = str2;
            i = 0;
            this.I$0 = 0;
            this.label = 2;
            b = ((com.ybsdk.persistence.a) aVar2.a).b(this);
            if (b != coroutineSingletons) {
                pairArr2 = pairArr;
                pairArr[i] = new Pair(str2, b);
                pairArr2[1] = new Pair(yu50.g, oyr.p("package=", this.this$0.p.getPackageName(), ";sdk_version=0.233.1;build_type=release;os=android"));
                pairArr2[2] = new Pair(yu50.a, this.$verificationToken);
                Map<String, String> b22 = ynb1.b(pairArr2);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.label = 3;
                String str32 = o;
                Api api22 = api;
                a = api22.v(str32, startSessionRequest, str, b22, this);
            }
        }
        return coroutineSingletons;
    }
}
