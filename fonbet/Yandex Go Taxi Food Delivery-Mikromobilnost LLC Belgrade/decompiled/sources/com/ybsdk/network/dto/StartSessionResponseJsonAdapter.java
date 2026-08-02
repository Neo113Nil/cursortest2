package com.ybsdk.network.dto;

import com.adjust.sdk.Constants;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.network.dto.StartSessionResponse;
import com.ybsdk.network.dto.common.Product;
import defpackage.ny61;
import defpackage.tje;
import defpackage.uw51;
import defpackage.uza;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/network/dto/StartSessionResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/StartSessionResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lcom/ybsdk/network/dto/StartSessionResponse$Action;", "actionAdapter", "", "Lcom/ybsdk/network/dto/StartSessionApplicationResponse;", "nullableListOfStartSessionApplicationResponseAdapter", "", "nullableIntAdapter", "Lcom/ybsdk/network/dto/StartSessionResponse$ActionReason;", "nullableActionReasonAdapter", "Lcom/ybsdk/network/dto/common/Product;", "nullableProductAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StartSessionResponseJsonAdapter extends JsonAdapter<StartSessionResponse> {
    private final JsonAdapter<StartSessionResponse.Action> actionAdapter;
    private final JsonAdapter<StartSessionResponse.ActionReason> nullableActionReasonAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<StartSessionApplicationResponse>> nullableListOfStartSessionApplicationResponseAdapter;
    private final JsonAdapter<Product> nullableProductAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public StartSessionResponseJsonAdapter(Moshi moshi) {
        byte[] bArr = tje.U0;
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        this.options = JsonReader.Options.of(new String(bArr2, uza.a), "yandex_uid", "action", Constants.DEEPLINK, "landing_url", "support_url", "applications", "authorization_track_id", "pin_attempts_left", "action_reason", "product_to_open");
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "sessionUUID");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "yandexUid");
        this.actionAdapter = moshi.adapter(StartSessionResponse.Action.class, emptySet, "action");
        this.nullableListOfStartSessionApplicationResponseAdapter = moshi.adapter(Types.newParameterizedType(List.class, StartSessionApplicationResponse.class), emptySet, "applications");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "pinAttemptsLeft");
        this.nullableActionReasonAdapter = moshi.adapter(StartSessionResponse.ActionReason.class, emptySet, "actionReason");
        this.nullableProductAdapter = moshi.adapter(Product.class, emptySet, "productToOpen");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final StartSessionResponse fromJson(JsonReader jsonReader) {
        byte[] bArr = tje.b;
        byte[] bArr2 = tje.U0;
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        StartSessionResponse.Action action = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        List<StartSessionApplicationResponse> list = null;
        String str6 = null;
        Integer num = null;
        StartSessionResponse.ActionReason actionReason = null;
        Product product = null;
        while (true) {
            byte[] bArr3 = bArr;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (str != null) {
                    if (action != null) {
                        return new StartSessionResponse(str, str2, action, str3, str4, str5, list, str6, num, actionReason, product);
                    }
                    throw Util.missingProperty("action", "action", jsonReader);
                }
                byte[] bArr4 = new byte[19];
                for (int i = 0; i < 19; i++) {
                    bArr4[i] = (byte) (bArr2[i] ^ bArr3[i % 8]);
                }
                throw Util.missingProperty("sessionUUID", new String(bArr4, uza.a), jsonReader);
            }
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        byte[] bArr5 = new byte[19];
                        int i2 = 0;
                        for (int i3 = 19; i2 < i3; i3 = 19) {
                            bArr5[i2] = (byte) (bArr2[i2] ^ bArr3[i2 % 8]);
                            i2++;
                        }
                        throw Util.unexpectedNull("sessionUUID", new String(bArr5, uza.a), jsonReader);
                    }
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    action = this.actionAdapter.fromJson(jsonReader);
                    if (action == null) {
                        throw Util.unexpectedNull("action", "action", jsonReader);
                    }
                    break;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    list = this.nullableListOfStartSessionApplicationResponseAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 8:
                    num = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 9:
                    actionReason = this.nullableActionReasonAdapter.fromJson(jsonReader);
                    break;
                case 10:
                    product = this.nullableProductAdapter.fromJson(jsonReader);
                    break;
            }
            bArr = bArr3;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, StartSessionResponse startSessionResponse) {
        StartSessionResponse startSessionResponse2 = startSessionResponse;
        if (startSessionResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        byte[] bArr = tje.U0;
        byte[] bArr2 = new byte[19];
        for (int i = 0; i < 19; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        jsonWriter.name(new String(bArr2, uza.a));
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) startSessionResponse2.getSessionUUID());
        jsonWriter.name("yandex_uid");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) startSessionResponse2.getYandexUid());
        jsonWriter.name("action");
        this.actionAdapter.toJson(jsonWriter, (JsonWriter) startSessionResponse2.getAction());
        jsonWriter.name(Constants.DEEPLINK);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) startSessionResponse2.getDeeplink());
        jsonWriter.name("landing_url");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) startSessionResponse2.getStartLandingUrl());
        jsonWriter.name("support_url");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) startSessionResponse2.getSupportUrl());
        jsonWriter.name("applications");
        this.nullableListOfStartSessionApplicationResponseAdapter.toJson(jsonWriter, (JsonWriter) startSessionResponse2.getApplications());
        jsonWriter.name("authorization_track_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) startSessionResponse2.getAuthorizationTrackId());
        jsonWriter.name("pin_attempts_left");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) startSessionResponse2.getPinAttemptsLeft());
        jsonWriter.name("action_reason");
        this.nullableActionReasonAdapter.toJson(jsonWriter, (JsonWriter) startSessionResponse2.getActionReason());
        jsonWriter.name("product_to_open");
        this.nullableProductAdapter.toJson(jsonWriter, (JsonWriter) startSessionResponse2.getProductToOpen());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(StartSessionResponse)");
    }
}
