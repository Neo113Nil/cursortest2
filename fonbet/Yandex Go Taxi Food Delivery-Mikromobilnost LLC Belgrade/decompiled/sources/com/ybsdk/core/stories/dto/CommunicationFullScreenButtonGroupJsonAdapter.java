package com.ybsdk.core.stories.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/core/stories/dto/CommunicationFullScreenButtonGroupJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/stories/dto/CommunicationFullScreenButtonGroup;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/stories/dto/CommunicationFullScreenButton;", "communicationFullScreenButtonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableCommunicationFullScreenButtonAdapter", "Lcom/ybsdk/core/stories/dto/LegalAgreement;", "nullableLegalAgreementAdapter", "core-stories_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommunicationFullScreenButtonGroupJsonAdapter extends JsonAdapter<CommunicationFullScreenButtonGroup> {
    private final JsonAdapter<CommunicationFullScreenButton> communicationFullScreenButtonAdapter;
    private final JsonAdapter<CommunicationFullScreenButton> nullableCommunicationFullScreenButtonAdapter;
    private final JsonAdapter<LegalAgreement> nullableLegalAgreementAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("first_button", "second_button", "legal_agreement");

    public CommunicationFullScreenButtonGroupJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.communicationFullScreenButtonAdapter = moshi.adapter(CommunicationFullScreenButton.class, emptySet, "firstButton");
        this.nullableCommunicationFullScreenButtonAdapter = moshi.adapter(CommunicationFullScreenButton.class, emptySet, "secondButton");
        this.nullableLegalAgreementAdapter = moshi.adapter(LegalAgreement.class, emptySet, "legalAgreement");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CommunicationFullScreenButtonGroup fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        CommunicationFullScreenButton communicationFullScreenButton = null;
        CommunicationFullScreenButton communicationFullScreenButton2 = null;
        LegalAgreement legalAgreement = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                communicationFullScreenButton = this.communicationFullScreenButtonAdapter.fromJson(jsonReader);
                if (communicationFullScreenButton == null) {
                    throw Util.unexpectedNull("firstButton", "first_button", jsonReader);
                }
            } else if (selectName == 1) {
                communicationFullScreenButton2 = this.nullableCommunicationFullScreenButtonAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                legalAgreement = this.nullableLegalAgreementAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (communicationFullScreenButton != null) {
            return new CommunicationFullScreenButtonGroup(communicationFullScreenButton, communicationFullScreenButton2, legalAgreement);
        }
        throw Util.missingProperty("firstButton", "first_button", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CommunicationFullScreenButtonGroup communicationFullScreenButtonGroup) {
        CommunicationFullScreenButtonGroup communicationFullScreenButtonGroup2 = communicationFullScreenButtonGroup;
        if (communicationFullScreenButtonGroup2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("first_button");
        this.communicationFullScreenButtonAdapter.toJson(jsonWriter, (JsonWriter) communicationFullScreenButtonGroup2.getFirstButton());
        jsonWriter.name("second_button");
        this.nullableCommunicationFullScreenButtonAdapter.toJson(jsonWriter, (JsonWriter) communicationFullScreenButtonGroup2.getSecondButton());
        jsonWriter.name("legal_agreement");
        this.nullableLegalAgreementAdapter.toJson(jsonWriter, (JsonWriter) communicationFullScreenButtonGroup2.getLegalAgreement());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(56, "GeneratedJsonAdapter(CommunicationFullScreenButtonGroup)");
    }
}
