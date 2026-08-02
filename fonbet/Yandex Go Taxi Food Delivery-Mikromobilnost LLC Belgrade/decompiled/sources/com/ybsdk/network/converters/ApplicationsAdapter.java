package com.ybsdk.network.converters;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.ToJson;
import com.ybsdk.core.utils.dto.common.ApplicationType;
import com.ybsdk.network.dto.ApplicationResponse;
import defpackage.h13;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/network/converters/ApplicationsAdapter;", "", "", "string", "Lcom/ybsdk/core/utils/dto/common/ApplicationType;", "fromApplicationTypeJson", "(Ljava/lang/String;)Lcom/ybsdk/core/utils/dto/common/ApplicationType;", "value", "toApplicationTypeJson", "(Lcom/ybsdk/core/utils/dto/common/ApplicationType;)Ljava/lang/String;", "Lcom/ybsdk/network/dto/ApplicationResponse$ApplicationStatus;", "fromApplicationStatusJson", "(Ljava/lang/String;)Lcom/ybsdk/network/dto/ApplicationResponse$ApplicationStatus;", "toApplicationStatusJson", "(Lcom/ybsdk/network/dto/ApplicationResponse$ApplicationStatus;)Ljava/lang/String;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ApplicationsAdapter {
    public static final ApplicationsAdapter a = new ApplicationsAdapter();

    @FromJson
    public final ApplicationResponse.ApplicationStatus fromApplicationStatusJson(String string) {
        return ApplicationResponse.ApplicationStatus.valueOf(string);
    }

    @FromJson
    public final ApplicationType fromApplicationTypeJson(String string) {
        ApplicationType.Companion.getClass();
        return h13.a(string);
    }

    @ToJson
    public final String toApplicationStatusJson(ApplicationResponse.ApplicationStatus value) {
        return value.name();
    }

    @ToJson
    public final String toApplicationTypeJson(ApplicationType value) {
        return value.name();
    }
}
