package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.stories.dto.FullScreenDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/BindingPaymentInstructionsDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/BindingPaymentInstructionsDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/stories/dto/FullScreenDto;", "nullableFullScreenDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/BindingPaymentConfirmInstructionDto;", "bindingPaymentConfirmInstructionDtoAdapter", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BindingPaymentInstructionsDtoJsonAdapter extends JsonAdapter<BindingPaymentInstructionsDto> {
    private final JsonAdapter<BindingPaymentConfirmInstructionDto> bindingPaymentConfirmInstructionDtoAdapter;
    private final JsonAdapter<FullScreenDto> nullableFullScreenDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("introduction_screen", "confirm_instruction");

    public BindingPaymentInstructionsDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableFullScreenDtoAdapter = moshi.adapter(FullScreenDto.class, emptySet, "introductionScreen");
        this.bindingPaymentConfirmInstructionDtoAdapter = moshi.adapter(BindingPaymentConfirmInstructionDto.class, emptySet, "confirmInstruction");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final BindingPaymentInstructionsDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        FullScreenDto fullScreenDto = null;
        BindingPaymentConfirmInstructionDto bindingPaymentConfirmInstructionDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                fullScreenDto = this.nullableFullScreenDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 1 && (bindingPaymentConfirmInstructionDto = this.bindingPaymentConfirmInstructionDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("confirmInstruction", "confirm_instruction", jsonReader);
            }
        }
        jsonReader.endObject();
        if (bindingPaymentConfirmInstructionDto != null) {
            return new BindingPaymentInstructionsDto(fullScreenDto, bindingPaymentConfirmInstructionDto);
        }
        throw Util.missingProperty("confirmInstruction", "confirm_instruction", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, BindingPaymentInstructionsDto bindingPaymentInstructionsDto) {
        BindingPaymentInstructionsDto bindingPaymentInstructionsDto2 = bindingPaymentInstructionsDto;
        if (bindingPaymentInstructionsDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("introduction_screen");
        this.nullableFullScreenDtoAdapter.toJson(jsonWriter, (JsonWriter) bindingPaymentInstructionsDto2.getIntroductionScreen());
        jsonWriter.name("confirm_instruction");
        this.bindingPaymentConfirmInstructionDtoAdapter.toJson(jsonWriter, (JsonWriter) bindingPaymentInstructionsDto2.getConfirmInstruction());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(51, "GeneratedJsonAdapter(BindingPaymentInstructionsDto)");
    }
}
