package com.yandex.go.scooters.insurance;

import com.yandex.go.scooters.api.domain.model.ScootersInsuranceType;
import com.yandex.go.scooters.insurance.analytics.InsuranceOpenReason;
import com.yandex.go.scooters.insurance.model.ScootersInsuranceControl;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.etn0;
import defpackage.jl40;
import defpackage.ktn0;
import defpackage.ltn0;
import defpackage.msb1;
import defpackage.mtn0;
import defpackage.mvg;
import defpackage.n3o0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zgz;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.insurance.ScootersInsurancePresenter$attachView$1", f = "ScootersInsurancePresenter.kt", l = {37, 46, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE, 58, 59, 61}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersInsurancePresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ mtn0 $mvpView;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersInsurancePresenter$attachView$1(e eVar, mtn0 mtn0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$mvpView = mtn0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersInsurancePresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersInsurancePresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f0, code lost:
    
        if (r3.e(r17) == r2) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fd  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ScootersInsuranceType scootersInsuranceType;
        int i;
        ltn0 ltn0Var;
        etn0 etn0Var;
        Object e;
        ScootersInsuranceType scootersInsuranceType2;
        int i2;
        int i3;
        ScootersInsuranceType scootersInsuranceType3;
        int i4;
        e eVar;
        com.yandex.go.scooters.insurance.data.b bVar;
        Object c;
        ScootersInsuranceType scootersInsuranceType4;
        int i5;
        int i6;
        etn0 etn0Var2;
        mtn0 mtn0Var;
        Object f;
        ScootersInsuranceType scootersInsuranceType5;
        String str;
        Object d;
        int i7;
        String str2;
        com.yandex.go.scooters.insurance.data.b bVar2;
        etn0 etn0Var3;
        e eVar2;
        mtn0 mtn0Var2;
        int i8;
        ScootersInsuranceControl scootersInsuranceControl;
        Object b;
        etn0 etn0Var4;
        ScootersInsuranceType scootersInsuranceType6;
        String str3;
        String str4;
        mtn0 mtn0Var3;
        msb1 msb1Var = msb1.R;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = this.label;
        zy11 zy11Var = zy11.a;
        switch (i9) {
            case 0:
                kotlin.b.b(obj);
                e eVar3 = this.this$0;
                ltn0 ltn0Var2 = eVar3.A;
                if ((ltn0Var2 instanceof ktn0) && ((ktn0) ltn0Var2).a == InsuranceOpenReason.ONBOARDING) {
                    com.yandex.go.scooters.insurance.data.c cVar = eVar3.z;
                    this.label = 1;
                    break;
                }
                e eVar4 = this.this$0;
                n3o0 n3o0Var = eVar4.C;
                int i10 = n3o0Var == null ? n3o0Var.d : 0;
                scootersInsuranceType = (n3o0Var != null || (scootersInsuranceType3 = n3o0Var.a) == null) ? eVar4.x.d().a : scootersInsuranceType3;
                i = this.this$0.x.d().a != ScootersInsuranceType.FULL ? 1 : 0;
                ltn0Var = this.this$0.A;
                if (jl40.l(ltn0Var, msb1Var)) {
                    if (!(ltn0Var instanceof ktn0)) {
                        w511.b();
                        return null;
                    }
                    etn0Var = null;
                    i4 = i10;
                    if (!jl40.l(this.this$0.A, msb1Var)) {
                    }
                    eVar = this.this$0;
                    bVar = eVar.y;
                    mtn0 mtn0Var4 = this.$mvpView;
                    this.L$0 = scootersInsuranceType;
                    this.L$1 = etn0Var;
                    this.L$2 = eVar;
                    this.L$3 = bVar;
                    this.L$4 = mtn0Var4;
                    this.I$0 = i4;
                    this.I$1 = i;
                    this.label = 3;
                    c = bVar.c(this);
                    if (c != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                com.yandex.go.scooters.insurance.data.b bVar3 = this.this$0.y;
                this.L$0 = scootersInsuranceType;
                this.I$0 = i10 == true ? 1 : 0;
                this.I$1 = i;
                this.label = 2;
                e = bVar3.e(this);
                if (e != coroutineSingletons) {
                    int i11 = i10 == true ? 1 : 0;
                    scootersInsuranceType2 = scootersInsuranceType;
                    i2 = i;
                    i3 = i11;
                    etn0Var = (etn0) e;
                    int i12 = i3;
                    i = i2;
                    scootersInsuranceType = scootersInsuranceType2;
                    i4 = i12;
                    if (!jl40.l(this.this$0.A, msb1Var) && etn0Var == null) {
                        zgz.a(null, new IllegalStateException("Disable insurance config is not available"));
                        this.$mvpView.close();
                        return zy11Var;
                    }
                    eVar = this.this$0;
                    bVar = eVar.y;
                    mtn0 mtn0Var42 = this.$mvpView;
                    this.L$0 = scootersInsuranceType;
                    this.L$1 = etn0Var;
                    this.L$2 = eVar;
                    this.L$3 = bVar;
                    this.L$4 = mtn0Var42;
                    this.I$0 = i4;
                    this.I$1 = i;
                    this.label = 3;
                    c = bVar.c(this);
                    if (c != coroutineSingletons) {
                        int i13 = i4;
                        scootersInsuranceType4 = scootersInsuranceType;
                        i5 = i;
                        i6 = i13;
                        etn0Var2 = etn0Var;
                        mtn0Var = mtn0Var42;
                        String str5 = (String) c;
                        this.L$0 = scootersInsuranceType4;
                        this.L$1 = etn0Var2;
                        this.L$2 = eVar;
                        this.L$3 = bVar;
                        this.L$4 = mtn0Var;
                        this.L$5 = str5;
                        this.I$0 = i6;
                        this.I$1 = i5;
                        this.label = 4;
                        f = bVar.f(this);
                        if (f != coroutineSingletons) {
                            scootersInsuranceType5 = scootersInsuranceType4;
                            str = str5;
                            String str6 = (String) f;
                            this.L$0 = scootersInsuranceType5;
                            this.L$1 = etn0Var2;
                            this.L$2 = eVar;
                            this.L$3 = bVar;
                            this.L$4 = mtn0Var;
                            this.L$5 = str;
                            this.L$6 = str6;
                            this.I$0 = i6;
                            this.I$1 = i5;
                            this.label = 5;
                            d = bVar.d(this);
                            if (d != coroutineSingletons) {
                                int i14 = i6;
                                i7 = i5;
                                str2 = str6;
                                bVar2 = bVar;
                                etn0Var3 = etn0Var2;
                                eVar2 = eVar;
                                mtn0Var2 = mtn0Var;
                                i8 = i14;
                                String str7 = (String) d;
                                if (jl40.l(eVar2.A, msb1Var)) {
                                    boolean z = i7 != 0;
                                    boolean z2 = i8 != 0;
                                    bVar2.getClass();
                                    scootersInsuranceControl = z2 ? ScootersInsuranceControl.IMMUTABLE_TOGGLE : z ? ScootersInsuranceControl.TOGGLE : ScootersInsuranceControl.BUTTON;
                                } else {
                                    scootersInsuranceControl = ScootersInsuranceControl.BUTTON;
                                }
                                this.L$0 = scootersInsuranceType5;
                                this.L$1 = etn0Var3;
                                this.L$2 = eVar2;
                                this.L$3 = null;
                                this.L$4 = mtn0Var2;
                                this.L$5 = str;
                                this.L$6 = str2;
                                this.L$7 = str7;
                                this.L$8 = scootersInsuranceControl;
                                this.I$0 = i8;
                                this.I$1 = i7;
                                this.label = 6;
                                b = bVar2.b(this);
                                if (b != coroutineSingletons) {
                                    ScootersInsuranceType scootersInsuranceType7 = scootersInsuranceType5;
                                    etn0Var4 = etn0Var3;
                                    scootersInsuranceType6 = scootersInsuranceType7;
                                    str3 = str;
                                    str4 = str7;
                                    mtn0Var3 = mtn0Var2;
                                    ScootersInsuranceControl scootersInsuranceControl2 = scootersInsuranceControl;
                                    String str8 = str2;
                                    String str9 = (String) b;
                                    n3o0 n3o0Var2 = eVar2.C;
                                    mtn0Var3.e6(str3, str8, str4, scootersInsuranceControl2, str9, scootersInsuranceType6, (n3o0Var2 != null ? n3o0Var2.f : null) == null, etn0Var4);
                                    return zy11Var;
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                kotlin.b.b(obj);
                e eVar42 = this.this$0;
                n3o0 n3o0Var3 = eVar42.C;
                if (n3o0Var3 == null) {
                }
                if (n3o0Var3 != null) {
                    break;
                }
                if (this.this$0.x.d().a != ScootersInsuranceType.FULL) {
                }
                ltn0Var = this.this$0.A;
                if (jl40.l(ltn0Var, msb1Var)) {
                }
                break;
            case 2:
                i2 = this.I$1;
                i3 = this.I$0;
                scootersInsuranceType2 = (ScootersInsuranceType) this.L$0;
                kotlin.b.b(obj);
                e = obj;
                etn0Var = (etn0) e;
                int i122 = i3;
                i = i2;
                scootersInsuranceType = scootersInsuranceType2;
                i4 = i122;
                if (!jl40.l(this.this$0.A, msb1Var)) {
                }
                eVar = this.this$0;
                bVar = eVar.y;
                mtn0 mtn0Var422 = this.$mvpView;
                this.L$0 = scootersInsuranceType;
                this.L$1 = etn0Var;
                this.L$2 = eVar;
                this.L$3 = bVar;
                this.L$4 = mtn0Var422;
                this.I$0 = i4;
                this.I$1 = i;
                this.label = 3;
                c = bVar.c(this);
                if (c != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 3:
                i5 = this.I$1;
                i6 = this.I$0;
                mtn0 mtn0Var5 = (mtn0) this.L$4;
                com.yandex.go.scooters.insurance.data.b bVar4 = (com.yandex.go.scooters.insurance.data.b) this.L$3;
                eVar = (e) this.L$2;
                etn0 etn0Var5 = (etn0) this.L$1;
                ScootersInsuranceType scootersInsuranceType8 = (ScootersInsuranceType) this.L$0;
                kotlin.b.b(obj);
                mtn0Var = mtn0Var5;
                scootersInsuranceType4 = scootersInsuranceType8;
                etn0Var2 = etn0Var5;
                bVar = bVar4;
                c = obj;
                String str52 = (String) c;
                this.L$0 = scootersInsuranceType4;
                this.L$1 = etn0Var2;
                this.L$2 = eVar;
                this.L$3 = bVar;
                this.L$4 = mtn0Var;
                this.L$5 = str52;
                this.I$0 = i6;
                this.I$1 = i5;
                this.label = 4;
                f = bVar.f(this);
                if (f != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 4:
                i5 = this.I$1;
                i6 = this.I$0;
                str = (String) this.L$5;
                mtn0Var = (mtn0) this.L$4;
                com.yandex.go.scooters.insurance.data.b bVar5 = (com.yandex.go.scooters.insurance.data.b) this.L$3;
                e eVar5 = (e) this.L$2;
                etn0Var2 = (etn0) this.L$1;
                scootersInsuranceType5 = (ScootersInsuranceType) this.L$0;
                kotlin.b.b(obj);
                bVar = bVar5;
                eVar = eVar5;
                f = obj;
                String str62 = (String) f;
                this.L$0 = scootersInsuranceType5;
                this.L$1 = etn0Var2;
                this.L$2 = eVar;
                this.L$3 = bVar;
                this.L$4 = mtn0Var;
                this.L$5 = str;
                this.L$6 = str62;
                this.I$0 = i6;
                this.I$1 = i5;
                this.label = 5;
                d = bVar.d(this);
                if (d != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 5:
                int i15 = this.I$1;
                int i16 = this.I$0;
                String str10 = (String) this.L$6;
                String str11 = (String) this.L$5;
                mtn0Var2 = (mtn0) this.L$4;
                com.yandex.go.scooters.insurance.data.b bVar6 = (com.yandex.go.scooters.insurance.data.b) this.L$3;
                eVar2 = (e) this.L$2;
                etn0 etn0Var6 = (etn0) this.L$1;
                ScootersInsuranceType scootersInsuranceType9 = (ScootersInsuranceType) this.L$0;
                kotlin.b.b(obj);
                i7 = i15;
                str2 = str10;
                str = str11;
                i8 = i16;
                bVar2 = bVar6;
                etn0Var3 = etn0Var6;
                scootersInsuranceType5 = scootersInsuranceType9;
                d = obj;
                String str72 = (String) d;
                if (jl40.l(eVar2.A, msb1Var)) {
                }
                this.L$0 = scootersInsuranceType5;
                this.L$1 = etn0Var3;
                this.L$2 = eVar2;
                this.L$3 = null;
                this.L$4 = mtn0Var2;
                this.L$5 = str;
                this.L$6 = str2;
                this.L$7 = str72;
                this.L$8 = scootersInsuranceControl;
                this.I$0 = i8;
                this.I$1 = i7;
                this.label = 6;
                b = bVar2.b(this);
                if (b != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 6:
                scootersInsuranceControl = (ScootersInsuranceControl) this.L$8;
                String str12 = (String) this.L$7;
                str2 = (String) this.L$6;
                String str13 = (String) this.L$5;
                mtn0 mtn0Var6 = (mtn0) this.L$4;
                e eVar6 = (e) this.L$2;
                etn0 etn0Var7 = (etn0) this.L$1;
                ScootersInsuranceType scootersInsuranceType10 = (ScootersInsuranceType) this.L$0;
                kotlin.b.b(obj);
                scootersInsuranceType6 = scootersInsuranceType10;
                str3 = str13;
                mtn0Var3 = mtn0Var6;
                eVar2 = eVar6;
                etn0Var4 = etn0Var7;
                b = obj;
                str4 = str12;
                ScootersInsuranceControl scootersInsuranceControl22 = scootersInsuranceControl;
                String str82 = str2;
                String str92 = (String) b;
                n3o0 n3o0Var22 = eVar2.C;
                mtn0Var3.e6(str3, str82, str4, scootersInsuranceControl22, str92, scootersInsuranceType6, (n3o0Var22 != null ? n3o0Var22.f : null) == null, etn0Var4);
                return zy11Var;
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
