package com.yandex.go.zone.repository;

import android.os.SystemClock;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.yandex.go.net.taxi.dto.request.ZoneInfoParam;
import com.yandex.go.zone.dto.ZoneInfoApi;
import com.yandex.go.zone.model.ClientCacheSettings;
import com.yandex.go.zone.model.Zone;
import com.ybsdk.widgets.common.BlendingGradientView;
import defpackage.cmt;
import defpackage.evu0;
import defpackage.fmt;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.perf.screen.ScreenEndpoint;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/yandex/go/zone/model/Zone;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.zone.repository.ZoneInfoRepositoryImpl$internalRequest$2", f = "ZoneInfoRepositoryImpl.kt", l = {152}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class ZoneInfoRepositoryImpl$internalRequest$2 extends SuspendLambda implements tls {
    final /* synthetic */ ZoneInfoParam $param;
    int label;
    final /* synthetic */ o this$0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lcom/yandex/go/zone/model/Zone;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.zone.repository.ZoneInfoRepositoryImpl$internalRequest$2$1", f = "ZoneInfoRepositoryImpl.kt", l = {BlendingGradientView.BASE_ALPHA, ModuleDescriptor.MODULE_VERSION, 161, HProv.PP_HANDLE_COUNT}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.zone.repository.ZoneInfoRepositoryImpl$internalRequest$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ ZoneInfoParam $param;
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ o this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ZoneInfoParam zoneInfoParam, o oVar, Continuation continuation) {
            super(2, continuation);
            this.$param = zoneInfoParam;
            this.this$0 = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$param, this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x0054, code lost:
        
            if (r15 == r0) goto L39;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00f7  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ZoneInfoParam zoneInfoParam;
            long j;
            fmt fmtVar;
            String a;
            long j2;
            h hVar;
            String str;
            String str2;
            kotlinx.serialization.json.c cVar;
            ClientCacheSettings clientCacheSettings;
            Object obj2;
            Zone zone;
            Object k0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                zoneInfoParam = this.$param;
                h hVar2 = this.this$0.e;
                String str3 = zoneInfoParam.a;
                String str4 = zoneInfoParam.b;
                this.L$0 = zoneInfoParam;
                this.label = 1;
                obj = hVar2.d(str3, str4, this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            zone = (Zone) this.L$1;
                            kotlin.b.b(obj);
                            return new Result(zone);
                        }
                        j2 = this.J$0;
                        fmtVar = (fmt) this.L$0;
                        kotlin.b.b(obj);
                        Zone zone2 = (Zone) obj;
                        hVar = this.this$0.e;
                        ZoneInfoParam zoneInfoParam2 = this.$param;
                        str = zoneInfoParam2.a;
                        str2 = zoneInfoParam2.b;
                        cVar = (kotlinx.serialization.json.c) fmtVar.a;
                        clientCacheSettings = zone2.C;
                        this.L$0 = null;
                        this.L$1 = zone2;
                        this.J$0 = j2;
                        this.label = 4;
                        hVar.getClass();
                        obj2 = zy11.a;
                        if (str2 != null && !evu0.J(str2) && clientCacheSettings != null) {
                            hVar.b.getClass();
                            sjh sjhVar = uyj.a;
                            k0 = tje.k0(mdh.b, new ZoneFallbackCache$putZoneInfo$2(hVar, str, clientCacheSettings, str2, cVar, null), this);
                            if (k0 == coroutineSingletons) {
                                obj2 = k0;
                            }
                        }
                        if (obj2 != coroutineSingletons) {
                            zone = zone2;
                            return new Result(zone);
                        }
                        return coroutineSingletons;
                    }
                    j = this.J$0;
                    kotlin.b.b(obj);
                    fmtVar = (fmt) obj;
                    ru.yandex.taxi.perf.screen.c cVar2 = this.this$0.o;
                    ScreenEndpoint screenEndpoint = ScreenEndpoint.ZoneInfo;
                    long elapsedRealtime = SystemClock.elapsedRealtime() - j;
                    a = fmtVar.e.a("X-YaTraceId");
                    if (a == null) {
                        a = "";
                    }
                    cVar2.e(screenEndpoint, elapsedRealtime, a);
                    o oVar = this.this$0;
                    kotlinx.serialization.json.c cVar3 = (kotlinx.serialization.json.c) fmtVar.a;
                    ZoneInfoParam zoneInfoParam3 = this.$param;
                    this.L$0 = fmtVar;
                    this.J$0 = j;
                    this.label = 3;
                    obj = oVar.e(cVar3, zoneInfoParam3, this);
                    if (obj != coroutineSingletons) {
                        j2 = j;
                        Zone zone22 = (Zone) obj;
                        hVar = this.this$0.e;
                        ZoneInfoParam zoneInfoParam22 = this.$param;
                        str = zoneInfoParam22.a;
                        str2 = zoneInfoParam22.b;
                        cVar = (kotlinx.serialization.json.c) fmtVar.a;
                        clientCacheSettings = zone22.C;
                        this.L$0 = null;
                        this.L$1 = zone22;
                        this.J$0 = j2;
                        this.label = 4;
                        hVar.getClass();
                        obj2 = zy11.a;
                        if (str2 != null) {
                            hVar.b.getClass();
                            sjh sjhVar2 = uyj.a;
                            k0 = tje.k0(mdh.b, new ZoneFallbackCache$putZoneInfo$2(hVar, str, clientCacheSettings, str2, cVar, null), this);
                            if (k0 == coroutineSingletons) {
                            }
                        }
                        if (obj2 != coroutineSingletons) {
                        }
                    }
                    return coroutineSingletons;
                }
                zoneInfoParam = (ZoneInfoParam) this.L$0;
                kotlin.b.b(obj);
            }
            zoneInfoParam.i = (String) obj;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            cmt<kotlinx.serialization.json.c> b = ((ZoneInfoApi) this.this$0.q.getValue()).b(this.$param);
            this.L$0 = null;
            this.J$0 = elapsedRealtime2;
            this.label = 2;
            obj = ru.yandex.taxi.network.api.a.b(b, null, this);
            if (obj != coroutineSingletons) {
                j = elapsedRealtime2;
                fmtVar = (fmt) obj;
                ru.yandex.taxi.perf.screen.c cVar22 = this.this$0.o;
                ScreenEndpoint screenEndpoint2 = ScreenEndpoint.ZoneInfo;
                long elapsedRealtime3 = SystemClock.elapsedRealtime() - j;
                a = fmtVar.e.a("X-YaTraceId");
                if (a == null) {
                }
                cVar22.e(screenEndpoint2, elapsedRealtime3, a);
                o oVar2 = this.this$0;
                kotlinx.serialization.json.c cVar32 = (kotlinx.serialization.json.c) fmtVar.a;
                ZoneInfoParam zoneInfoParam32 = this.$param;
                this.L$0 = fmtVar;
                this.J$0 = j;
                this.label = 3;
                obj = oVar2.e(cVar32, zoneInfoParam32, this);
                if (obj != coroutineSingletons) {
                }
            }
            return coroutineSingletons;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoneInfoRepositoryImpl$internalRequest$2(ZoneInfoParam zoneInfoParam, o oVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = oVar;
        this.$param = zoneInfoParam;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ZoneInfoRepositoryImpl$internalRequest$2(this.$param, this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ZoneInfoRepositoryImpl$internalRequest$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.i.getClass();
        sjh sjhVar = uyj.a;
        mdh mdhVar = mdh.b;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$param, this.this$0, null);
        this.label = 1;
        Object k0 = tje.k0(mdhVar, anonymousClass1, this);
        return k0 == coroutineSingletons ? coroutineSingletons : k0;
    }
}
