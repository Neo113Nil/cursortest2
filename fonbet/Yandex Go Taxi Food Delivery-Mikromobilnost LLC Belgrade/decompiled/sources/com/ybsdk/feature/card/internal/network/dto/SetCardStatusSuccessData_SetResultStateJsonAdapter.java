package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.card.internal.network.dto.SetCardStatusSuccessData$SetResultState;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData_SetResultStateJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$SetResultState;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$ActionType;", "actionTypeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$SetResultState$StateType;", "stateTypeAdapter", "", "stringAdapter", "Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$SetResultState$ButtonData;", "nullableButtonDataAdapter", "nullableStringAdapter", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SetCardStatusSuccessData_SetResultStateJsonAdapter extends JsonAdapter<SetCardStatusSuccessData$SetResultState> {
    private final JsonAdapter<SetCardStatusSuccessData$ActionType> actionTypeAdapter;
    private final JsonAdapter<SetCardStatusSuccessData$SetResultState.ButtonData> nullableButtonDataAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("action_type", "state_type", "title", "subtitle", "primary_button", "secondary_button", "close_action");
    private final JsonAdapter<SetCardStatusSuccessData$SetResultState.StateType> stateTypeAdapter;
    private final JsonAdapter<String> stringAdapter;

    public SetCardStatusSuccessData_SetResultStateJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.actionTypeAdapter = moshi.adapter(SetCardStatusSuccessData$ActionType.class, emptySet, "actionType");
        this.stateTypeAdapter = moshi.adapter(SetCardStatusSuccessData$SetResultState.StateType.class, emptySet, "stateType");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableButtonDataAdapter = moshi.adapter(SetCardStatusSuccessData$SetResultState.ButtonData.class, emptySet, "primaryButton");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "closeAction");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SetCardStatusSuccessData$SetResultState fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        SetCardStatusSuccessData$ActionType setCardStatusSuccessData$ActionType = null;
        SetCardStatusSuccessData$SetResultState.StateType stateType = null;
        String str = null;
        String str2 = null;
        SetCardStatusSuccessData$SetResultState.ButtonData buttonData = null;
        SetCardStatusSuccessData$SetResultState.ButtonData buttonData2 = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    setCardStatusSuccessData$ActionType = this.actionTypeAdapter.fromJson(jsonReader);
                    if (setCardStatusSuccessData$ActionType == null) {
                        throw Util.unexpectedNull("actionType", "action_type", jsonReader);
                    }
                    break;
                case 1:
                    stateType = this.stateTypeAdapter.fromJson(jsonReader);
                    if (stateType == null) {
                        throw Util.unexpectedNull("stateType", "state_type", jsonReader);
                    }
                    break;
                case 2:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    break;
                case 3:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("subtitle", "subtitle", jsonReader);
                    }
                    break;
                case 4:
                    buttonData = this.nullableButtonDataAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    buttonData2 = this.nullableButtonDataAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (setCardStatusSuccessData$ActionType == null) {
            throw Util.missingProperty("actionType", "action_type", jsonReader);
        }
        if (stateType == null) {
            throw Util.missingProperty("stateType", "state_type", jsonReader);
        }
        if (str == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (str2 != null) {
            return new SetCardStatusSuccessData$SetResultState(setCardStatusSuccessData$ActionType, stateType, str, str2, buttonData, buttonData2, str3);
        }
        throw Util.missingProperty("subtitle", "subtitle", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SetCardStatusSuccessData$SetResultState setCardStatusSuccessData$SetResultState) {
        SetCardStatusSuccessData$SetResultState setCardStatusSuccessData$SetResultState2 = setCardStatusSuccessData$SetResultState;
        if (setCardStatusSuccessData$SetResultState2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("action_type");
        this.actionTypeAdapter.toJson(jsonWriter, (JsonWriter) setCardStatusSuccessData$SetResultState2.getActionType());
        jsonWriter.name("state_type");
        this.stateTypeAdapter.toJson(jsonWriter, (JsonWriter) setCardStatusSuccessData$SetResultState2.getStateType());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) setCardStatusSuccessData$SetResultState2.getTitle());
        jsonWriter.name("subtitle");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) setCardStatusSuccessData$SetResultState2.getSubtitle());
        jsonWriter.name("primary_button");
        this.nullableButtonDataAdapter.toJson(jsonWriter, (JsonWriter) setCardStatusSuccessData$SetResultState2.getPrimaryButton());
        jsonWriter.name("secondary_button");
        this.nullableButtonDataAdapter.toJson(jsonWriter, (JsonWriter) setCardStatusSuccessData$SetResultState2.getSecondaryButton());
        jsonWriter.name("close_action");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) setCardStatusSuccessData$SetResultState2.getCloseAction());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(61, "GeneratedJsonAdapter(SetCardStatusSuccessData.SetResultState)");
    }
}
