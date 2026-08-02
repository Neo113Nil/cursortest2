package com.yandex.go.scooters.qr.preview.domain;

import com.yandex.go.scooters.qr.domain.c;
import defpackage.ero0;
import defpackage.fro0;
import defpackage.hro0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o7p0;
import defpackage.r7p0;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wls;
import defpackage.xsn0;
import defpackage.zy11;
import io.appmetrica.analytics.BuildConfig;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.NGate.tools.Constants;
import ru.yandex.taxi.scooters.data.q;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lymo0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.qr.preview.domain.ScootersPreviewInteractor$getScootersPreviewStateFlow$1", f = "ScootersPreviewInteractor.kt", l = {103, HProv.PP_SET_PIN, HProv.PP_SET_PIN, 112, 112, HProv.PP_CACHE_SIZE, HProv.PP_CACHE_SIZE, Constants.VPN_TRAFFIC, HProv.PP_NK_SYNC, BuildConfig.API_LEVEL, HProv.PP_FAST_CODE, HProv.PP_FAST_CODE, HProv.PP_LCD_QUERY, HProv.PP_ENUM_CONTAINER_EXTENSION, HProv.PP_CONTAINER_EXTENSION}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPreviewInteractor$getScootersPreviewStateFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ Set<r7p0> $addedNumbers;
    final /* synthetic */ xsn0 $incomingResult;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPreviewInteractor$getScootersPreviewStateFlow$1(a aVar, xsn0 xsn0Var, Set set, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$incomingResult = xsn0Var;
        this.$addedNumbers = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersPreviewInteractor$getScootersPreviewStateFlow$1 scootersPreviewInteractor$getScootersPreviewStateFlow$1 = new ScootersPreviewInteractor$getScootersPreviewStateFlow$1(this.this$0, this.$incomingResult, this.$addedNumbers, continuation);
        scootersPreviewInteractor$getScootersPreviewStateFlow$1.L$0 = obj;
        return scootersPreviewInteractor$getScootersPreviewStateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPreviewInteractor$getScootersPreviewStateFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x01fa, code lost:
    
        if (r6.emit(r14, r13) != r1) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x015b, code lost:
    
        if (r6.emit(r14, r13) != r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00b7, code lost:
    
        if (r14 == r1) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x025a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x025b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01b4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        vpr vprVar;
        int i2;
        vpr vprVar2;
        int i3;
        int i4;
        com.yandex.go.scooters.qr.preview.data.mapper.a aVar;
        hro0 hro0Var;
        vpr vprVar3;
        int i5;
        int i6;
        vpr vprVar4;
        com.yandex.go.scooters.qr.preview.data.mapper.a aVar2;
        hro0 hro0Var2;
        vpr vprVar5;
        int i7;
        int i8;
        vpr vprVar6;
        vpr vprVar7 = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = this.label;
        zy11 zy11Var = zy11.a;
        switch (i9) {
            case 0:
                kotlin.b.b(obj);
                q qVar = this.this$0.f;
                this.L$0 = vprVar7;
                this.label = 1;
                obj = qVar.g(this);
                break;
            case 1:
                kotlin.b.b(obj);
                int intValue = ((Number) obj).intValue();
                hro0 hro0Var3 = this.$incomingResult.a;
                if (hro0Var3 instanceof ero0) {
                    if (!this.$addedNumbers.contains(((ero0) hro0Var3).a)) {
                        int size = this.$addedNumbers.size();
                        a aVar3 = this.this$0;
                        if (size < intValue) {
                            com.yandex.go.scooters.qr.preview.data.mapper.a aVar4 = aVar3.b;
                            r7p0 r7p0Var = ((ero0) this.$incomingResult.a).a;
                            this.L$0 = vprVar7;
                            this.L$1 = vprVar7;
                            this.I$0 = intValue;
                            this.label = 6;
                            Object j = aVar4.j(r7p0Var, this);
                            if (j != coroutineSingletons) {
                                i2 = intValue;
                                obj = j;
                                vprVar2 = vprVar7;
                                this.L$0 = vprVar7;
                                this.L$1 = null;
                                this.I$0 = i2;
                                this.label = 7;
                                break;
                            }
                        } else {
                            com.yandex.go.scooters.qr.preview.data.mapper.a aVar5 = aVar3.b;
                            this.L$0 = null;
                            this.L$1 = vprVar7;
                            this.I$0 = intValue;
                            this.label = 4;
                            Object k = aVar5.k(intValue, this);
                            if (k != coroutineSingletons) {
                                i3 = intValue;
                                obj = k;
                                this.L$0 = null;
                                this.L$1 = null;
                                this.I$0 = i3;
                                this.label = 5;
                                if (vprVar7.emit(obj, this) != coroutineSingletons) {
                                }
                            }
                        }
                    } else {
                        com.yandex.go.scooters.qr.preview.data.mapper.a aVar6 = this.this$0.b;
                        this.L$0 = null;
                        this.L$1 = vprVar7;
                        this.I$0 = intValue;
                        this.label = 2;
                        Object i10 = aVar6.i(this);
                        if (i10 != coroutineSingletons) {
                            i4 = intValue;
                            obj = i10;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.I$0 = i4;
                            this.label = 3;
                            if (vprVar7.emit(obj, this) != coroutineSingletons) {
                                return zy11Var;
                            }
                        }
                    }
                } else {
                    if (!jl40.l(hro0Var3, fro0.a)) {
                        w511.b();
                        return null;
                    }
                    com.yandex.go.scooters.qr.preview.data.mapper.a aVar7 = this.this$0.b;
                    r7p0 r7p0Var2 = r7p0.c;
                    this.L$0 = vprVar7;
                    this.L$1 = vprVar7;
                    this.I$0 = intValue;
                    this.label = 11;
                    Object j2 = aVar7.j(r7p0Var2, this);
                    if (j2 != coroutineSingletons) {
                        i = intValue;
                        obj = j2;
                        vprVar = vprVar7;
                        this.L$0 = vprVar7;
                        this.L$1 = null;
                        this.I$0 = i;
                        this.label = 12;
                        break;
                    }
                }
                return coroutineSingletons;
            case 2:
                int i11 = this.I$0;
                vpr vprVar8 = (vpr) this.L$1;
                kotlin.b.b(obj);
                i4 = i11;
                vprVar7 = vprVar8;
                this.L$0 = null;
                this.L$1 = null;
                this.I$0 = i4;
                this.label = 3;
                if (vprVar7.emit(obj, this) != coroutineSingletons) {
                    return coroutineSingletons;
                }
                break;
            case 3:
                kotlin.b.b(obj);
                return zy11Var;
            case 4:
                int i12 = this.I$0;
                vpr vprVar9 = (vpr) this.L$1;
                kotlin.b.b(obj);
                i3 = i12;
                vprVar7 = vprVar9;
                this.L$0 = null;
                this.L$1 = null;
                this.I$0 = i3;
                this.label = 5;
                if (vprVar7.emit(obj, this) != coroutineSingletons) {
                }
                break;
            case 5:
                kotlin.b.b(obj);
                return zy11Var;
            case 6:
                i2 = this.I$0;
                vprVar2 = (vpr) this.L$1;
                kotlin.b.b(obj);
                this.L$0 = vprVar7;
                this.L$1 = null;
                this.I$0 = i2;
                this.label = 7;
                break;
            case 7:
                i2 = this.I$0;
                kotlin.b.b(obj);
                aVar = this.this$0.b;
                hro0 hro0Var4 = this.$incomingResult.a;
                int size2 = this.$addedNumbers.size();
                xsn0 xsn0Var = this.$incomingResult;
                xsn0Var.getClass();
                c cVar = this.this$0.d;
                r7p0 r7p0Var3 = ((ero0) xsn0Var.a).a;
                boolean z = xsn0Var.c;
                this.L$0 = null;
                this.L$1 = vprVar7;
                this.L$2 = aVar;
                this.L$3 = hro0Var4;
                this.I$0 = i2;
                this.I$1 = size2;
                this.label = 8;
                Object b = cVar.b(r7p0Var3, z, true, this);
                if (b != coroutineSingletons) {
                    hro0Var = hro0Var4;
                    obj = b;
                    vprVar3 = vprVar7;
                    i5 = size2;
                    this.L$0 = null;
                    this.L$1 = vprVar3;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.I$0 = i2;
                    this.label = 9;
                    obj = aVar.f(hro0Var, i5, (o7p0) obj, this);
                    if (obj != coroutineSingletons) {
                        i6 = i2;
                        vprVar4 = vprVar3;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.I$0 = i6;
                        this.label = 10;
                        if (vprVar4.emit(obj, this) != coroutineSingletons) {
                        }
                    }
                }
                return coroutineSingletons;
            case 8:
                i5 = this.I$1;
                i2 = this.I$0;
                hro0Var = (hro0) this.L$3;
                aVar = (com.yandex.go.scooters.qr.preview.data.mapper.a) this.L$2;
                vprVar3 = (vpr) this.L$1;
                kotlin.b.b(obj);
                this.L$0 = null;
                this.L$1 = vprVar3;
                this.L$2 = null;
                this.L$3 = null;
                this.I$0 = i2;
                this.label = 9;
                obj = aVar.f(hro0Var, i5, (o7p0) obj, this);
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 9:
                i6 = this.I$0;
                vprVar4 = (vpr) this.L$1;
                kotlin.b.b(obj);
                this.L$0 = null;
                this.L$1 = null;
                this.I$0 = i6;
                this.label = 10;
                if (vprVar4.emit(obj, this) != coroutineSingletons) {
                }
                break;
            case 10:
                kotlin.b.b(obj);
                return zy11Var;
            case 11:
                i = this.I$0;
                vprVar = (vpr) this.L$1;
                kotlin.b.b(obj);
                this.L$0 = vprVar7;
                this.L$1 = null;
                this.I$0 = i;
                this.label = 12;
                break;
            case 12:
                i = this.I$0;
                kotlin.b.b(obj);
                aVar2 = this.this$0.b;
                hro0 hro0Var5 = this.$incomingResult.a;
                int size3 = this.$addedNumbers.size();
                this.$incomingResult.getClass();
                a aVar8 = this.this$0;
                this.L$0 = null;
                this.L$1 = vprVar7;
                this.L$2 = aVar2;
                this.L$3 = hro0Var5;
                this.I$0 = i;
                this.I$1 = size3;
                this.label = 13;
                Object c = aVar8.d.c(true, this);
                if (c != coroutineSingletons) {
                    hro0Var2 = hro0Var5;
                    obj = c;
                    vprVar5 = vprVar7;
                    i7 = size3;
                    this.L$0 = null;
                    this.L$1 = vprVar5;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.I$0 = i;
                    this.label = 14;
                    obj = aVar2.f(hro0Var2, i7, (o7p0) obj, this);
                    if (obj != coroutineSingletons) {
                        i8 = i;
                        vprVar6 = vprVar5;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.I$0 = i8;
                        this.label = 15;
                        if (vprVar6.emit(obj, this) != coroutineSingletons) {
                        }
                    }
                }
                return coroutineSingletons;
            case 13:
                i7 = this.I$1;
                i = this.I$0;
                hro0Var2 = (hro0) this.L$3;
                aVar2 = (com.yandex.go.scooters.qr.preview.data.mapper.a) this.L$2;
                vprVar5 = (vpr) this.L$1;
                kotlin.b.b(obj);
                this.L$0 = null;
                this.L$1 = vprVar5;
                this.L$2 = null;
                this.L$3 = null;
                this.I$0 = i;
                this.label = 14;
                obj = aVar2.f(hro0Var2, i7, (o7p0) obj, this);
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 14:
                i8 = this.I$0;
                vprVar6 = (vpr) this.L$1;
                kotlin.b.b(obj);
                this.L$0 = null;
                this.L$1 = null;
                this.I$0 = i8;
                this.label = 15;
                if (vprVar6.emit(obj, this) != coroutineSingletons) {
                }
                break;
            case 15:
                kotlin.b.b(obj);
                return zy11Var;
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
