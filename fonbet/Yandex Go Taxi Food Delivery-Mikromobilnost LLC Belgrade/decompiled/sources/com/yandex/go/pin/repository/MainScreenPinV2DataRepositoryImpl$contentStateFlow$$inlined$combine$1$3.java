package com.yandex.go.pin.repository;

import defpackage.e1c0;
import defpackage.f0c0;
import defpackage.fji;
import defpackage.lub0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.uwt;
import defpackage.uyb0;
import defpackage.vn6;
import defpackage.vpr;
import defpackage.vyb0;
import defpackage.w511;
import defpackage.wwt;
import defpackage.xyb0;
import defpackage.ybo;
import defpackage.za00;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.pin.repository.MainScreenPinV2DataRepositoryImpl$contentStateFlow$$inlined$combine$1$3", f = "MainScreenPinV2DataRepositoryImpl.kt", l = {346, MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class MainScreenPinV2DataRepositoryImpl$contentStateFlow$$inlined$combine$1$3 extends SuspendLambda implements zls {
    final /* synthetic */ e1c0 $exp$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    boolean Z$0;
    int label;
    final /* synthetic */ a0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainScreenPinV2DataRepositoryImpl$contentStateFlow$$inlined$combine$1$3(Continuation continuation, a0 a0Var, e1c0 e1c0Var) {
        super(3, continuation);
        this.this$0 = a0Var;
        this.$exp$inlined = e1c0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MainScreenPinV2DataRepositoryImpl$contentStateFlow$$inlined$combine$1$3 mainScreenPinV2DataRepositoryImpl$contentStateFlow$$inlined$combine$1$3 = new MainScreenPinV2DataRepositoryImpl$contentStateFlow$$inlined$combine$1$3((Continuation) obj3, this.this$0, this.$exp$inlined);
        mainScreenPinV2DataRepositoryImpl$contentStateFlow$$inlined$combine$1$3.L$0 = (vpr) obj;
        mainScreenPinV2DataRepositoryImpl$contentStateFlow$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return mainScreenPinV2DataRepositoryImpl$contentStateFlow$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x019d, code lost:
    
        if (r6.emit(r15, r29) != r7) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x019f, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x015d, code lost:
    
        if (r0 == r7) goto L51;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        SourceOnMapControl.a aVar;
        Object e;
        vpr vprVar = (vpr) this.L$0;
        Object[] objArr = (Object[]) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Object obj4 = objArr[0];
            Object obj5 = objArr[1];
            Object obj6 = objArr[2];
            Object obj7 = objArr[3];
            Object obj8 = objArr[4];
            Object obj9 = objArr[5];
            Object obj10 = objArr[6];
            Object obj11 = objArr[7];
            wwt wwtVar = (wwt) objArr[8];
            xyb0 xyb0Var = (xyb0) obj11;
            lub0 lub0Var = (lub0) obj10;
            obj2 = (SourceOnMapControl.a) obj9;
            fji fjiVar = (fji) obj8;
            SourceOnMapControl.a aVar2 = (SourceOnMapControl.a) obj7;
            ybo yboVar = (ybo) obj6;
            boolean booleanValue = ((Boolean) obj5).booleanValue();
            AddressResolveRepository.State state = (AddressResolveRepository.State) obj4;
            if (obj2 == null) {
                int i2 = za00.a[state.ordinal()];
                if (i2 == 1) {
                    obj3 = null;
                    aVar = this.this$0.s;
                } else if (i2 == 2) {
                    obj3 = null;
                    aVar = this.this$0.r;
                } else if (i2 == 3 || i2 == 4) {
                    obj3 = null;
                    obj2 = aVar2;
                    this.L$0 = obj3;
                    this.L$1 = obj3;
                    this.L$2 = obj3;
                    this.L$3 = obj3;
                    this.L$4 = obj3;
                    this.L$5 = obj3;
                    this.L$6 = obj3;
                    this.L$7 = obj3;
                    this.L$8 = obj3;
                    this.L$9 = obj3;
                    this.L$10 = obj3;
                    this.L$11 = obj3;
                    this.L$12 = obj3;
                    this.L$13 = obj3;
                    this.label = 2;
                } else {
                    if (i2 != 5) {
                        w511.b();
                        return null;
                    }
                    a0 a0Var = this.this$0;
                    e1c0 e1c0Var = this.$exp$inlined;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = vprVar;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.L$9 = null;
                    this.L$10 = null;
                    this.L$11 = null;
                    this.L$12 = null;
                    this.L$13 = null;
                    this.Z$0 = booleanValue;
                    this.label = 1;
                    a0Var.getClass();
                    if (fjiVar != null && booleanValue) {
                        f0c0 f0c0Var = fjiVar.a;
                        if (f0c0Var == null) {
                            f0c0Var = aVar2.a;
                        }
                        e = SourceOnMapControl.a.a(aVar2, f0c0Var, fjiVar.c, fjiVar.b, fjiVar.d, null, fjiVar.e, false, null, 1968);
                    } else if (xyb0Var instanceof vyb0) {
                        vyb0 vyb0Var = (vyb0) xyb0Var;
                        String str = vyb0Var.a;
                        uyb0 uyb0Var = vyb0Var.b;
                        String str2 = uyb0Var.a;
                        uyb0 uyb0Var2 = vyb0Var.c;
                        e = vn6.a(aVar2, str, str2, uyb0Var2.a, uyb0Var.b, uyb0Var2.b);
                    } else if (wwtVar instanceof uwt) {
                        uwt uwtVar = (uwt) wwtVar;
                        e = vn6.a(aVar2, uwtVar.a, uwtVar.b, uwtVar.c, uwtVar.d, uwtVar.e);
                    } else {
                        e = booleanValue ? (!e1c0Var.b || yboVar.a <= 0) ? aVar2 : a0Var.e(e1c0Var, yboVar, aVar2, lub0Var, this) : a0Var.s;
                    }
                }
                obj2 = aVar;
                this.L$0 = obj3;
                this.L$1 = obj3;
                this.L$2 = obj3;
                this.L$3 = obj3;
                this.L$4 = obj3;
                this.L$5 = obj3;
                this.L$6 = obj3;
                this.L$7 = obj3;
                this.L$8 = obj3;
                this.L$9 = obj3;
                this.L$10 = obj3;
                this.L$11 = obj3;
                this.L$12 = obj3;
                this.L$13 = obj3;
                this.label = 2;
            }
            obj3 = null;
            this.L$0 = obj3;
            this.L$1 = obj3;
            this.L$2 = obj3;
            this.L$3 = obj3;
            this.L$4 = obj3;
            this.L$5 = obj3;
            this.L$6 = obj3;
            this.L$7 = obj3;
            this.L$8 = obj3;
            this.L$9 = obj3;
            this.L$10 = obj3;
            this.L$11 = obj3;
            this.L$12 = obj3;
            this.L$13 = obj3;
            this.label = 2;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$2;
            kotlin.b.b(obj);
            e = obj;
        }
        obj2 = e;
        obj3 = null;
        this.L$0 = obj3;
        this.L$1 = obj3;
        this.L$2 = obj3;
        this.L$3 = obj3;
        this.L$4 = obj3;
        this.L$5 = obj3;
        this.L$6 = obj3;
        this.L$7 = obj3;
        this.L$8 = obj3;
        this.L$9 = obj3;
        this.L$10 = obj3;
        this.L$11 = obj3;
        this.L$12 = obj3;
        this.L$13 = obj3;
        this.label = 2;
    }
}
