package com.yandex.mobile.drive.flutter.core;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR&\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/yandex/mobile/drive/flutter/core/FlutterMessageDto;", "", "<init>", "()V", "type", "", "getType$annotations", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", Constants.KEY_DATA, "getData$annotations", "getData", "setData", "drive_native_features_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FlutterMessageDto {
    private String data;
    private String type;

    @Json
    public static /* synthetic */ void getData$annotations() {
    }

    @Json
    public static /* synthetic */ void getType$annotations() {
    }

    public final String getData() {
        return this.data;
    }

    public final String getType() {
        return this.type;
    }

    public final void setData(String str) {
        this.data = str;
    }

    public final void setType(String str) {
        this.type = str;
    }
}
