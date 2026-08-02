package com.ybsdk.core.utils.dto;

import com.ybsdk.core.utils.dto.SecondAuthorizationResponse;
import defpackage.tls;
import defpackage.w511;
import defpackage.xxp0;
import defpackage.yxp0;
import defpackage.zxp0;
import kotlin.Result;

/* loaded from: classes2.dex */
public abstract class e {
    public static final Object a(SecondAuthorizationResponse secondAuthorizationResponse, tls tlsVar) {
        String trackId;
        int i = d.a[secondAuthorizationResponse.getResultStatus().ordinal()];
        if (i == 1) {
            Object successData = secondAuthorizationResponse.getSuccessData();
            return successData == null ? new Result.Failure(new Exception("successData null")) : new zxp0(tlsVar.invoke(successData));
        }
        if (i == 2) {
            SecondAuthorizationResponse.AuthorizationInfo authorizationInfo = secondAuthorizationResponse.getAuthorizationInfo();
            return (authorizationInfo == null || (trackId = authorizationInfo.getTrackId()) == null) ? new Result.Failure(new Exception("authorizationInfo null")) : new xxp0(trackId);
        }
        if (i == 3) {
            SecondAuthorizationResponse.FailData failData = secondAuthorizationResponse.getFailData();
            return new yxp0(failData != null ? failData.getSupportUrl() : null);
        }
        w511.b();
        return null;
    }
}
