package com.ybsdk.feature.transfer.version2.internal.network.dto.me2me;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.ActionButtonDto;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.transfer.utils.domain.dto.PageHeaderDto;
import defpackage.gf91;
import defpackage.ny61;
import defpackage.uw51;
import defpackage.uza;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitAutoPullPageContentJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitAutoPullPageContent;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/transfer/utils/domain/dto/PageHeaderDto;", "nullablePageHeaderDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "themesOfStringAdapter", "stringAdapter", "Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;", "actionButtonDtoAdapter", "nullableStringAdapter", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Me2MeDebitAutoPullPageContentJsonAdapter extends JsonAdapter<Me2MeDebitAutoPullPageContent> {
    private final JsonAdapter<ActionButtonDto> actionButtonDtoAdapter;
    private final JsonAdapter<PageHeaderDto> nullablePageHeaderDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<Themes<String>> themesOfStringAdapter;

    public Me2MeDebitAutoPullPageContentJsonAdapter(Moshi moshi) {
        byte[] bArr = gf91.m;
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ gf91.a[i % 8]);
        }
        this.options = JsonReader.Options.of("header", new String(bArr2, uza.a), "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "button", "legal");
        EmptySet emptySet = EmptySet.a;
        this.nullablePageHeaderDtoAdapter = moshi.adapter(PageHeaderDto.class, emptySet, "header");
        this.themesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "ybLogo");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.actionButtonDtoAdapter = moshi.adapter(ActionButtonDto.class, emptySet, "button");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "legal");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Me2MeDebitAutoPullPageContent fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        PageHeaderDto pageHeaderDto = null;
        Themes<String> themes = null;
        String str = null;
        String str2 = null;
        ActionButtonDto actionButtonDto = null;
        String str3 = null;
        while (true) {
            boolean hasNext = jsonReader.hasNext();
            byte[] bArr = gf91.a;
            byte[] bArr2 = gf91.m;
            if (!hasNext) {
                jsonReader.endObject();
                if (themes == null) {
                    byte[] bArr3 = new byte[9];
                    for (int i = 0; i < 9; i++) {
                        bArr3[i] = (byte) (bArr2[i] ^ bArr[i % 8]);
                    }
                    throw Util.missingProperty("ybLogo", new String(bArr3, uza.a), jsonReader);
                }
                if (str == null) {
                    throw Util.missingProperty("title", "title", jsonReader);
                }
                if (str2 == null) {
                    throw Util.missingProperty(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
                }
                if (actionButtonDto != null) {
                    return new Me2MeDebitAutoPullPageContent(pageHeaderDto, themes, str, str2, actionButtonDto, str3);
                }
                throw Util.missingProperty("button", "button", jsonReader);
            }
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    pageHeaderDto = this.nullablePageHeaderDtoAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    themes = this.themesOfStringAdapter.fromJson(jsonReader);
                    if (themes == null) {
                        byte[] bArr4 = new byte[9];
                        for (int i2 = 0; i2 < 9; i2++) {
                            bArr4[i2] = (byte) (bArr2[i2] ^ bArr[i2 % 8]);
                        }
                        throw Util.unexpectedNull("ybLogo", new String(bArr4, uza.a), jsonReader);
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
                        throw Util.unexpectedNull(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
                    }
                    break;
                case 4:
                    actionButtonDto = this.actionButtonDtoAdapter.fromJson(jsonReader);
                    if (actionButtonDto == null) {
                        throw Util.unexpectedNull("button", "button", jsonReader);
                    }
                    break;
                case 5:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Me2MeDebitAutoPullPageContent me2MeDebitAutoPullPageContent) {
        Me2MeDebitAutoPullPageContent me2MeDebitAutoPullPageContent2 = me2MeDebitAutoPullPageContent;
        if (me2MeDebitAutoPullPageContent2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("header");
        this.nullablePageHeaderDtoAdapter.toJson(jsonWriter, (JsonWriter) me2MeDebitAutoPullPageContent2.getHeader());
        byte[] bArr = new byte[9];
        for (int i = 0; i < 9; i++) {
            bArr[i] = (byte) (gf91.m[i] ^ gf91.a[i % 8]);
        }
        jsonWriter.name(new String(bArr, uza.a));
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) me2MeDebitAutoPullPageContent2.getYbLogo());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) me2MeDebitAutoPullPageContent2.getTitle());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) me2MeDebitAutoPullPageContent2.getDescription());
        jsonWriter.name("button");
        this.actionButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) me2MeDebitAutoPullPageContent2.getButton());
        jsonWriter.name("legal");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) me2MeDebitAutoPullPageContent2.getLegal());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(51, "GeneratedJsonAdapter(Me2MeDebitAutoPullPageContent)");
    }
}
