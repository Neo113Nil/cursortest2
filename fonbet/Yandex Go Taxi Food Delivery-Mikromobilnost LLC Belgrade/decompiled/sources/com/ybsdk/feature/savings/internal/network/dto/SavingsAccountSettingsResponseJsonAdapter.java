package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountSettingsResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountSettingsResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountSettingsChangeStatus;", "savingsAccountSettingsChangeStatusAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountSettingsChangeError;", "nullableSavingsAccountSettingsChangeErrorAdapter", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavingsAccountSettingsResponseJsonAdapter extends JsonAdapter<SavingsAccountSettingsResponse> {
    private final JsonAdapter<SavingsAccountSettingsChangeError> nullableSavingsAccountSettingsChangeErrorAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("response_status", "error_response");
    private final JsonAdapter<SavingsAccountSettingsChangeStatus> savingsAccountSettingsChangeStatusAdapter;

    public SavingsAccountSettingsResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.savingsAccountSettingsChangeStatusAdapter = moshi.adapter(SavingsAccountSettingsChangeStatus.class, emptySet, ACSPConstants.STATUS);
        this.nullableSavingsAccountSettingsChangeErrorAdapter = moshi.adapter(SavingsAccountSettingsChangeError.class, emptySet, "error");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SavingsAccountSettingsResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        SavingsAccountSettingsChangeStatus savingsAccountSettingsChangeStatus = null;
        SavingsAccountSettingsChangeError savingsAccountSettingsChangeError = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                savingsAccountSettingsChangeStatus = this.savingsAccountSettingsChangeStatusAdapter.fromJson(jsonReader);
                if (savingsAccountSettingsChangeStatus == null) {
                    throw Util.unexpectedNull(ACSPConstants.STATUS, "response_status", jsonReader);
                }
            } else if (selectName == 1) {
                savingsAccountSettingsChangeError = this.nullableSavingsAccountSettingsChangeErrorAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (savingsAccountSettingsChangeStatus != null) {
            return new SavingsAccountSettingsResponse(savingsAccountSettingsChangeStatus, savingsAccountSettingsChangeError);
        }
        throw Util.missingProperty(ACSPConstants.STATUS, "response_status", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SavingsAccountSettingsResponse savingsAccountSettingsResponse) {
        SavingsAccountSettingsResponse savingsAccountSettingsResponse2 = savingsAccountSettingsResponse;
        if (savingsAccountSettingsResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("response_status");
        this.savingsAccountSettingsChangeStatusAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountSettingsResponse2.getStatus());
        jsonWriter.name("error_response");
        this.nullableSavingsAccountSettingsChangeErrorAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountSettingsResponse2.getError());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(52, "GeneratedJsonAdapter(SavingsAccountSettingsResponse)");
    }
}
