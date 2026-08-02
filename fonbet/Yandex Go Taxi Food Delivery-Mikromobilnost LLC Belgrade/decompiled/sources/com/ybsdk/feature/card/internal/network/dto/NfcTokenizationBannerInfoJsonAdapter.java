package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.ny61;
import defpackage.uw51;
import io.appmetrica.analytics.impl.C0553n3;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/NfcTokenizationBannerInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/card/internal/network/dto/NfcTokenizationBannerInfo;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/card/internal/network/dto/NfcBannerButtonInfo;", "nfcBannerButtonInfoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "nullableStringAdapter", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "themesOfStringAdapter", "Lcom/ybsdk/feature/card/internal/network/dto/NfcBannerBackgroundInfo;", "nfcBannerBackgroundInfoAdapter", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NfcTokenizationBannerInfoJsonAdapter extends JsonAdapter<NfcTokenizationBannerInfo> {
    private final JsonAdapter<NfcBannerBackgroundInfo> nfcBannerBackgroundInfoAdapter;
    private final JsonAdapter<NfcBannerButtonInfo> nfcBannerButtonInfoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("button", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "title_color", "description_color", C0553n3.g);
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<Themes<String>> themesOfStringAdapter;

    public NfcTokenizationBannerInfoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nfcBannerButtonInfoAdapter = moshi.adapter(NfcBannerButtonInfo.class, emptySet, "button");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.themesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "titleColor");
        this.nfcBannerBackgroundInfoAdapter = moshi.adapter(NfcBannerBackgroundInfo.class, emptySet, C0553n3.g);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final NfcTokenizationBannerInfo fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        NfcBannerButtonInfo nfcBannerButtonInfo = null;
        String str = null;
        String str2 = null;
        Themes<String> themes = null;
        Themes<String> themes2 = null;
        NfcBannerBackgroundInfo nfcBannerBackgroundInfo = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    nfcBannerButtonInfo = this.nfcBannerButtonInfoAdapter.fromJson(jsonReader);
                    if (nfcBannerButtonInfo == null) {
                        throw Util.unexpectedNull("button", "button", jsonReader);
                    }
                    break;
                case 1:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    themes = this.themesOfStringAdapter.fromJson(jsonReader);
                    if (themes == null) {
                        throw Util.unexpectedNull("titleColor", "title_color", jsonReader);
                    }
                    break;
                case 4:
                    themes2 = this.themesOfStringAdapter.fromJson(jsonReader);
                    if (themes2 == null) {
                        throw Util.unexpectedNull("descriptionColor", "description_color", jsonReader);
                    }
                    break;
                case 5:
                    nfcBannerBackgroundInfo = this.nfcBannerBackgroundInfoAdapter.fromJson(jsonReader);
                    if (nfcBannerBackgroundInfo == null) {
                        throw Util.unexpectedNull(C0553n3.g, C0553n3.g, jsonReader);
                    }
                    break;
            }
        }
        jsonReader.endObject();
        if (nfcBannerButtonInfo == null) {
            throw Util.missingProperty("button", "button", jsonReader);
        }
        if (str == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (themes == null) {
            throw Util.missingProperty("titleColor", "title_color", jsonReader);
        }
        if (themes2 == null) {
            throw Util.missingProperty("descriptionColor", "description_color", jsonReader);
        }
        if (nfcBannerBackgroundInfo != null) {
            return new NfcTokenizationBannerInfo(nfcBannerButtonInfo, str, str2, themes, themes2, nfcBannerBackgroundInfo);
        }
        throw Util.missingProperty(C0553n3.g, C0553n3.g, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, NfcTokenizationBannerInfo nfcTokenizationBannerInfo) {
        NfcTokenizationBannerInfo nfcTokenizationBannerInfo2 = nfcTokenizationBannerInfo;
        if (nfcTokenizationBannerInfo2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("button");
        this.nfcBannerButtonInfoAdapter.toJson(jsonWriter, (JsonWriter) nfcTokenizationBannerInfo2.getButton());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) nfcTokenizationBannerInfo2.getTitle());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) nfcTokenizationBannerInfo2.getDescription());
        jsonWriter.name("title_color");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) nfcTokenizationBannerInfo2.getTitleColor());
        jsonWriter.name("description_color");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) nfcTokenizationBannerInfo2.getDescriptionColor());
        jsonWriter.name(C0553n3.g);
        this.nfcBannerBackgroundInfoAdapter.toJson(jsonWriter, (JsonWriter) nfcTokenizationBannerInfo2.getBackground());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(47, "GeneratedJsonAdapter(NfcTokenizationBannerInfo)");
    }
}
