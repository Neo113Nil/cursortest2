package com.ybsdk.api.pro;

import android.net.Uri;
import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.api.pro.entities.RegistrationType$OngoingOperation;
import com.ybsdk.api.pro.entities.YBProSdkTrackId;
import com.ybsdk.common.InternalSdkState;
import com.ybsdk.common.entities.ApplicationTypeEntity;
import com.ybsdk.common.entities.SessionApplicationEntity;
import com.ybsdk.screens.initial.deeplink.SdkUri$QueryParam;
import defpackage.e6b1;
import defpackage.ei51;
import defpackage.esp0;
import defpackage.fi51;
import defpackage.gi51;
import defpackage.gu91;
import defpackage.hi51;
import defpackage.ii51;
import defpackage.ji51;
import defpackage.jl40;
import defpackage.ki51;
import defpackage.kri0;
import defpackage.ksp0;
import defpackage.li51;
import defpackage.lri0;
import defpackage.mi51;
import defpackage.mri0;
import defpackage.ni51;
import defpackage.ny61;
import defpackage.sd90;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x015c, code lost:
    
        if (defpackage.jl40.l(r10, r2.getValue()) != false) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PublicProApiInteractor$special$$inlined$mapNotNull$1$2$1 publicProApiInteractor$special$$inlined$mapNotNull$1$2$1;
        int i;
        ErrorType errorType;
        Uri parse;
        Object obj2;
        RegistrationType$OngoingOperation registrationType$OngoingOperation;
        ApplicationTypeEntity type;
        if (continuation instanceof PublicProApiInteractor$special$$inlined$mapNotNull$1$2$1) {
            publicProApiInteractor$special$$inlined$mapNotNull$1$2$1 = (PublicProApiInteractor$special$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = publicProApiInteractor$special$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                publicProApiInteractor$special$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = publicProApiInteractor$special$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = publicProApiInteractor$special$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    InternalSdkState internalSdkState = (InternalSdkState) obj;
                    boolean z = internalSdkState instanceof InternalSdkState.Ok;
                    gu91 gu91Var = ji51.f;
                    if (!z) {
                        if (internalSdkState instanceof InternalSdkState.ApplicationStatusCheck) {
                            Iterator<T> it = internalSdkState.getApplications().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it.next();
                                SessionApplicationEntity sessionApplicationEntity = (SessionApplicationEntity) obj2;
                                boolean z2 = sessionApplicationEntity.getType() == ApplicationTypeEntity.REGISTRATION || sessionApplicationEntity.getType() == ApplicationTypeEntity.PRODUCT || sessionApplicationEntity.getType() == ApplicationTypeEntity.CHANGE_PHONE;
                                if (sessionApplicationEntity.getRequired() && z2) {
                                    break;
                                }
                            }
                            SessionApplicationEntity sessionApplicationEntity2 = (SessionApplicationEntity) obj2;
                            String applicationId = sessionApplicationEntity2 != null ? sessionApplicationEntity2.getApplicationId() : null;
                            if (sessionApplicationEntity2 != null && (type = sessionApplicationEntity2.getType()) != null) {
                                switch (b.b[type.ordinal()]) {
                                    case 1:
                                        registrationType$OngoingOperation = RegistrationType$OngoingOperation.PRODUCT_OPENING;
                                        break;
                                    case 2:
                                        registrationType$OngoingOperation = RegistrationType$OngoingOperation.REGISTRATION;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                        break;
                                    default:
                                        w511.b();
                                        return null;
                                }
                                if ((sessionApplicationEntity2 == null ? sessionApplicationEntity2.getType() : null) != ApplicationTypeEntity.CHANGE_PHONE && applicationId != null) {
                                    gu91Var = new hi51(applicationId);
                                } else if (applicationId != null && registrationType$OngoingOperation != null) {
                                    gu91Var = new mi51(new mri0(YBProduct.PRO, applicationId, registrationType$OngoingOperation));
                                }
                            }
                            registrationType$OngoingOperation = null;
                            if ((sessionApplicationEntity2 == null ? sessionApplicationEntity2.getType() : null) != ApplicationTypeEntity.CHANGE_PHONE) {
                            }
                            if (applicationId != null) {
                                gu91Var = new mi51(new mri0(YBProduct.PRO, applicationId, registrationType$OngoingOperation));
                            }
                        } else if (internalSdkState instanceof InternalSdkState.OpenProduct) {
                            InternalSdkState.OpenProduct openProduct = (InternalSdkState.OpenProduct) internalSdkState;
                            gu91Var = new mi51(new lri0(openProduct.getProduct(), openProduct.getStartLandingUrl()));
                        } else if (internalSdkState instanceof InternalSdkState.YbRegistration) {
                            gu91Var = new mi51(new kri0(((InternalSdkState.YbRegistration) internalSdkState).getProduct()));
                        } else if (internalSdkState instanceof InternalSdkState.RequestNewAmToken) {
                            gu91Var = ei51.f;
                        } else if (internalSdkState instanceof InternalSdkState.SmsAuthorization) {
                            gu91Var = new gi51(new YBProSdkTrackId(((InternalSdkState.SmsAuthorization) internalSdkState).getTrackId()));
                        } else if (internalSdkState instanceof InternalSdkState.StartSessionDeeplink) {
                            InternalSdkState.StartSessionDeeplink startSessionDeeplink = (InternalSdkState.StartSessionDeeplink) internalSdkState;
                            String deeplink = startSessionDeeplink.getDeeplink();
                            if (deeplink == null || (parse = Uri.parse(deeplink)) == null) {
                                errorType = null;
                            } else {
                                String m = sd90.m(parse);
                                String queryParameter = parse.getQueryParameter(SdkUri$QueryParam.ERROR_TYPE.getParamValue());
                                esp0 esp0Var = ksp0.a;
                                Uri parse2 = Uri.parse(m);
                                if (e6b1.d(parse2) && jl40.l(parse2.getPath(), "/error_screen")) {
                                    errorType = ErrorType.PDD;
                                }
                                errorType = ErrorType.UNKNOWN;
                            }
                            gu91Var = (errorType == null ? -1 : b.a[errorType.ordinal()]) == 1 ? new ii51(errorType.getValue()) : new li51(startSessionDeeplink.getSupportUrl());
                        } else if (internalSdkState instanceof InternalSdkState.Support) {
                            gu91Var = new li51(((InternalSdkState.Support) internalSdkState).getSupportUrl());
                        } else if (internalSdkState instanceof InternalSdkState.UpdateRequired) {
                            gu91Var = fi51.f;
                        } else {
                            boolean z3 = internalSdkState instanceof InternalSdkState.PinInput;
                            gu91Var = ki51.f;
                            if (!z3 && !(internalSdkState instanceof InternalSdkState.PinTokenClear)) {
                                gu91Var = null;
                            }
                        }
                    }
                    ni51 ni51Var = gu91Var != null ? new ni51(gu91Var) : null;
                    if (ni51Var != null) {
                        publicProApiInteractor$special$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(ni51Var, publicProApiInteractor$special$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        publicProApiInteractor$special$$inlined$mapNotNull$1$2$1 = new PublicProApiInteractor$special$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj32 = publicProApiInteractor$special$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = publicProApiInteractor$special$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
