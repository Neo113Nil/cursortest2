package com.yandex.go.mainscreen.superapp.impl.header.domain;

import com.yandex.go.address.models.Address;
import com.yandex.go.mainscreen.superapp.impl.header.experiment.SuperAppMainScreenLogoImageExperiment;
import defpackage.bk10;
import defpackage.d6z;
import defpackage.e0w0;
import defpackage.evu0;
import defpackage.i0w0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q5z;
import defpackage.r8z;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.taxi.persuggest.api.GeoPointAcquisitionType;
import ru.yandex.taxi.statebar.data.LocationErrorReason;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.header.domain.SuperAppHeaderInteractor$getHeaderStateFlow$$inlined$combine$1$3", f = "SuperAppHeaderInteractor.kt", l = {MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class SuperAppHeaderInteractor$getHeaderStateFlow$$inlined$combine$1$3 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ e0w0 receiver$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppHeaderInteractor$getHeaderStateFlow$$inlined$combine$1$3(Continuation continuation, e0w0 e0w0Var) {
        super(3, continuation);
        this.receiver$inlined = e0w0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SuperAppHeaderInteractor$getHeaderStateFlow$$inlined$combine$1$3 superAppHeaderInteractor$getHeaderStateFlow$$inlined$combine$1$3 = new SuperAppHeaderInteractor$getHeaderStateFlow$$inlined$combine$1$3((Continuation) obj3, this.receiver$inlined);
        superAppHeaderInteractor$getHeaderStateFlow$$inlined$combine$1$3.L$0 = (vpr) obj;
        superAppHeaderInteractor$getHeaderStateFlow$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return superAppHeaderInteractor$getHeaderStateFlow$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x007d, code lost:
    
        if (r2 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0085, code lost:
    
        if (r7.i.c() != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        i0w0 i0w0Var;
        boolean z;
        String str;
        vpr vprVar = (vpr) this.L$0;
        Object[] objArr = (Object[]) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            Object obj7 = objArr[5];
            Object obj8 = objArr[6];
            boolean booleanValue = ((Boolean) objArr[7]).booleanValue();
            r8z r8zVar = (r8z) obj8;
            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
            boolean booleanValue3 = ((Boolean) obj6).booleanValue();
            boolean booleanValue4 = ((Boolean) obj5).booleanValue();
            Address address = (Address) obj4;
            SuperAppMainScreenLogoImageExperiment superAppMainScreenLogoImageExperiment = (SuperAppMainScreenLogoImageExperiment) obj3;
            bk10 bk10Var = (bk10) obj2;
            e0w0 e0w0Var = this.receiver$inlined;
            e0w0Var.getClass();
            if (booleanValue3) {
                if (booleanValue2 && !booleanValue) {
                    if (r8zVar.a != LocationErrorReason.LOCATION_SERVICE_ERROR_REASON) {
                        boolean a = e0w0Var.g.a();
                        if (r8zVar.a == LocationErrorReason.LOCATION_PERMISSION_ERROR_REASON) {
                        }
                    }
                    z = true;
                    if (superAppMainScreenLogoImageExperiment != null) {
                        String str2 = superAppMainScreenLogoImageExperiment.g;
                        if (superAppMainScreenLogoImageExperiment.f && !z) {
                            str = ((address != null ? address.getGeoPointAcquisitionType() : null) != GeoPointAcquisitionType.USER_LOCATION || evu0.J(d6z.Y(superAppMainScreenLogoImageExperiment, str2))) ? q5z.F(address) : d6z.Y(superAppMainScreenLogoImageExperiment, str2);
                            String str3 = str;
                            String Y = evu0.J(str3) ? d6z.Y(superAppMainScreenLogoImageExperiment, superAppMainScreenLogoImageExperiment.g) : str3;
                            String str4 = superAppMainScreenLogoImageExperiment.i;
                            boolean z2 = superAppMainScreenLogoImageExperiment.f;
                            i0w0Var = new i0w0(d6z.Y(superAppMainScreenLogoImageExperiment, str4), d6z.Y(superAppMainScreenLogoImageExperiment, superAppMainScreenLogoImageExperiment.h), str3, address != null && z2, !booleanValue4 && z2, Y, bk10Var);
                        }
                    }
                    str = "";
                    String str32 = str;
                    if (evu0.J(str32)) {
                    }
                    String str42 = superAppMainScreenLogoImageExperiment.i;
                    boolean z22 = superAppMainScreenLogoImageExperiment.f;
                    i0w0Var = new i0w0(d6z.Y(superAppMainScreenLogoImageExperiment, str42), d6z.Y(superAppMainScreenLogoImageExperiment, superAppMainScreenLogoImageExperiment.h), str32, address != null && z22, !booleanValue4 && z22, Y, bk10Var);
                }
                z = false;
                if (superAppMainScreenLogoImageExperiment != null) {
                }
                str = "";
                String str322 = str;
                if (evu0.J(str322)) {
                }
                String str422 = superAppMainScreenLogoImageExperiment.i;
                boolean z222 = superAppMainScreenLogoImageExperiment.f;
                i0w0Var = new i0w0(d6z.Y(superAppMainScreenLogoImageExperiment, str422), d6z.Y(superAppMainScreenLogoImageExperiment, superAppMainScreenLogoImageExperiment.h), str322, address != null && z222, !booleanValue4 && z222, Y, bk10Var);
            } else {
                i0w0Var = new i0w0(d6z.Y(superAppMainScreenLogoImageExperiment, superAppMainScreenLogoImageExperiment.i), d6z.Y(superAppMainScreenLogoImageExperiment, superAppMainScreenLogoImageExperiment.h), "", true, false, "", bk10Var);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (vprVar.emit(i0w0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
