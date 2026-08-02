package com.ybsdk.network.dto.changephone;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.network.dto.changephone.ChangePhoneSendCodeResponse;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/network/dto/changephone/ChangePhoneSendCodeResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/changephone/ChangePhoneSendCodeResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/network/dto/changephone/ChangePhoneSendCodeResponse$SendStatus;", "sendStatusAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "", "nullableIntAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChangePhoneSendCodeResponseJsonAdapter extends JsonAdapter<ChangePhoneSendCodeResponse> {
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("send_status", "masked_phone", "seconds");
    private final JsonAdapter<ChangePhoneSendCodeResponse.SendStatus> sendStatusAdapter;

    public ChangePhoneSendCodeResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.sendStatusAdapter = moshi.adapter(ChangePhoneSendCodeResponse.SendStatus.class, emptySet, ACSPConstants.STATUS);
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "maskedPhone");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "seconds");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ChangePhoneSendCodeResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ChangePhoneSendCodeResponse.SendStatus sendStatus = null;
        String str = null;
        Integer num = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                sendStatus = this.sendStatusAdapter.fromJson(jsonReader);
                if (sendStatus == null) {
                    throw Util.unexpectedNull(ACSPConstants.STATUS, "send_status", jsonReader);
                }
            } else if (selectName == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                num = this.nullableIntAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (sendStatus != null) {
            return new ChangePhoneSendCodeResponse(sendStatus, str, num);
        }
        throw Util.missingProperty(ACSPConstants.STATUS, "send_status", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ChangePhoneSendCodeResponse changePhoneSendCodeResponse) {
        ChangePhoneSendCodeResponse changePhoneSendCodeResponse2 = changePhoneSendCodeResponse;
        if (changePhoneSendCodeResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("send_status");
        this.sendStatusAdapter.toJson(jsonWriter, (JsonWriter) changePhoneSendCodeResponse2.getStatus());
        jsonWriter.name("masked_phone");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) changePhoneSendCodeResponse2.getMaskedPhone());
        jsonWriter.name("seconds");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) changePhoneSendCodeResponse2.getSeconds());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(49, "GeneratedJsonAdapter(ChangePhoneSendCodeResponse)");
    }
}
