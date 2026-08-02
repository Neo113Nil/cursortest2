package com.ybsdk.feature.pdf.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.pdf.internal.network.dto.SplitContractDraftStatusResponse;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/pdf/internal/network/dto/SplitContractDraftStatusResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/pdf/internal/network/dto/SplitContractDraftStatusResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/pdf/internal/network/dto/SplitContractDraftStatusResponse$Link;", "nullableLinkAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/pdf/internal/network/dto/SplitContractDraftStatusResponse$Status;", "statusAdapter", "feature-pdf_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SplitContractDraftStatusResponseJsonAdapter extends JsonAdapter<SplitContractDraftStatusResponse> {
    private final JsonAdapter<SplitContractDraftStatusResponse.Link> nullableLinkAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("link", ACSPConstants.STATUS);
    private final JsonAdapter<SplitContractDraftStatusResponse.Status> statusAdapter;

    public SplitContractDraftStatusResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableLinkAdapter = moshi.adapter(SplitContractDraftStatusResponse.Link.class, emptySet, "link");
        this.statusAdapter = moshi.adapter(SplitContractDraftStatusResponse.Status.class, emptySet, ACSPConstants.STATUS);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SplitContractDraftStatusResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        SplitContractDraftStatusResponse.Link link = null;
        SplitContractDraftStatusResponse.Status status = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                link = this.nullableLinkAdapter.fromJson(jsonReader);
            } else if (selectName == 1 && (status = this.statusAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
            }
        }
        jsonReader.endObject();
        if (status != null) {
            return new SplitContractDraftStatusResponse(link, status);
        }
        throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SplitContractDraftStatusResponse splitContractDraftStatusResponse) {
        SplitContractDraftStatusResponse splitContractDraftStatusResponse2 = splitContractDraftStatusResponse;
        if (splitContractDraftStatusResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("link");
        this.nullableLinkAdapter.toJson(jsonWriter, (JsonWriter) splitContractDraftStatusResponse2.getLink());
        jsonWriter.name(ACSPConstants.STATUS);
        this.statusAdapter.toJson(jsonWriter, (JsonWriter) splitContractDraftStatusResponse2.getStatus());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(54, "GeneratedJsonAdapter(SplitContractDraftStatusResponse)");
    }
}
