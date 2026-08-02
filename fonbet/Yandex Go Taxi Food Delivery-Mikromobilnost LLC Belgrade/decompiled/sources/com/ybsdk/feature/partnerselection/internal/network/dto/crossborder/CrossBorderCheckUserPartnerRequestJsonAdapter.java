package com.ybsdk.feature.partnerselection.internal.network.dto.crossborder;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.hg91;
import defpackage.ny61;
import defpackage.uw51;
import defpackage.uza;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/partnerselection/internal/network/dto/crossborder/CrossBorderCheckUserPartnerRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/partnerselection/internal/network/dto/crossborder/CrossBorderCheckUserPartnerRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-partner-selection_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CrossBorderCheckUserPartnerRequestJsonAdapter extends JsonAdapter<CrossBorderCheckUserPartnerRequest> {
    private volatile Constructor<CrossBorderCheckUserPartnerRequest> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public CrossBorderCheckUserPartnerRequestJsonAdapter(Moshi moshi) {
        byte[] bArr = hg91.b;
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ hg91.a[i % 8]);
        }
        this.options = JsonReader.Options.of("phone", new String(bArr2, uza.a), "country", "agreement_id", "receiver_full_name", "date_of_birth");
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "phone");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "receiverFullName");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CrossBorderCheckUserPartnerRequest fromJson(JsonReader jsonReader) {
        byte[] bArr;
        byte[] bArr2 = hg91.a;
        byte[] bArr3 = hg91.b;
        jsonReader.beginObject();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (true) {
            byte[] bArr4 = bArr2;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (i == -49) {
                    String str7 = str6;
                    String str8 = str5;
                    String str9 = str4;
                    String str10 = str3;
                    String str11 = str2;
                    String str12 = str;
                    if (str12 == null) {
                        throw Util.missingProperty("phone", "phone", jsonReader);
                    }
                    if (str11 != null) {
                        if (str10 == null) {
                            throw Util.missingProperty("country", "country", jsonReader);
                        }
                        if (str9 != null) {
                            return new CrossBorderCheckUserPartnerRequest(str12, str11, str10, str9, str8, str7);
                        }
                        throw Util.missingProperty("agreementId", "agreement_id", jsonReader);
                    }
                    byte[] bArr5 = new byte[4];
                    int i2 = 0;
                    for (int i3 = 4; i2 < i3; i3 = 4) {
                        bArr5[i2] = (byte) (bArr3[i2] ^ bArr4[i2 % 8]);
                        i2++;
                    }
                    throw Util.missingProperty("partner", new String(bArr5, uza.a), jsonReader);
                }
                String str13 = str6;
                String str14 = str5;
                String str15 = str4;
                String str16 = str3;
                String str17 = str2;
                String str18 = str;
                Constructor<CrossBorderCheckUserPartnerRequest> constructor = this.constructorRef;
                if (constructor == null) {
                    bArr = bArr3;
                    constructor = CrossBorderCheckUserPartnerRequest.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
                    this.constructorRef = constructor;
                } else {
                    bArr = bArr3;
                }
                Constructor<CrossBorderCheckUserPartnerRequest> constructor2 = constructor;
                if (str18 == null) {
                    throw Util.missingProperty("phone", "phone", jsonReader);
                }
                if (str17 != null) {
                    if (str16 == null) {
                        throw Util.missingProperty("country", "country", jsonReader);
                    }
                    if (str15 != null) {
                        return constructor2.newInstance(str18, str17, str16, str15, str14, str13, Integer.valueOf(i), null);
                    }
                    throw Util.missingProperty("agreementId", "agreement_id", jsonReader);
                }
                byte[] bArr6 = new byte[4];
                for (int i4 = 0; i4 < 4; i4++) {
                    bArr6[i4] = (byte) (bArr[i4] ^ bArr4[i4 % 8]);
                }
                throw Util.missingProperty("partner", new String(bArr6, uza.a), jsonReader);
            }
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("phone", "phone", jsonReader);
                    }
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        byte[] bArr7 = new byte[4];
                        int i5 = 0;
                        for (int i6 = 4; i5 < i6; i6 = 4) {
                            bArr7[i5] = (byte) (bArr3[i5] ^ bArr4[i5 % 8]);
                            i5++;
                        }
                        throw Util.unexpectedNull("partner", new String(bArr7, uza.a), jsonReader);
                    }
                    break;
                case 2:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("country", "country", jsonReader);
                    }
                    break;
                case 3:
                    str4 = this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("agreementId", "agreement_id", jsonReader);
                    }
                    break;
                case 4:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -17;
                    break;
                case 5:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -33;
                    break;
            }
            bArr2 = bArr4;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CrossBorderCheckUserPartnerRequest crossBorderCheckUserPartnerRequest) {
        CrossBorderCheckUserPartnerRequest crossBorderCheckUserPartnerRequest2 = crossBorderCheckUserPartnerRequest;
        if (crossBorderCheckUserPartnerRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("phone");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) crossBorderCheckUserPartnerRequest2.getPhone());
        byte[] bArr = new byte[4];
        for (int i = 0; i < 4; i++) {
            bArr[i] = (byte) (hg91.b[i] ^ hg91.a[i % 8]);
        }
        jsonWriter.name(new String(bArr, uza.a));
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) crossBorderCheckUserPartnerRequest2.getPartner());
        jsonWriter.name("country");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) crossBorderCheckUserPartnerRequest2.getCountry());
        jsonWriter.name("agreement_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) crossBorderCheckUserPartnerRequest2.getAgreementId());
        jsonWriter.name("receiver_full_name");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) crossBorderCheckUserPartnerRequest2.getReceiverFullName());
        jsonWriter.name("date_of_birth");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) crossBorderCheckUserPartnerRequest2.getDateOfBirth());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(56, "GeneratedJsonAdapter(CrossBorderCheckUserPartnerRequest)");
    }
}
