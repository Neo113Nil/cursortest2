package com.ybsdk.feature.transfer.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.cf91;
import defpackage.ny61;
import defpackage.uw51;
import defpackage.uza;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/transfer/internal/network/dto/CheckUserYbRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/internal/network/dto/CheckUserYbRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/Money;", "nullableMoneyAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-transfer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CheckUserYbRequestJsonAdapter extends JsonAdapter<CheckUserYbRequest> {
    private volatile Constructor<CheckUserYbRequest> constructorRef;
    private final JsonAdapter<Money> nullableMoneyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public CheckUserYbRequestJsonAdapter(Moshi moshi) {
        byte[] bArr = cf91.c;
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ cf91.a[i % 8]);
        }
        this.options = JsonReader.Options.of("transfer_id", new String(bArr2, uza.a), "money", "comment");
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "transferId");
        this.nullableMoneyAdapter = moshi.adapter(Money.class, emptySet, "money");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "comment");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CheckUserYbRequest fromJson(JsonReader jsonReader) {
        byte[] bArr = cf91.a;
        byte[] bArr2 = cf91.c;
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        Money money = null;
        String str3 = null;
        int i = -1;
        while (true) {
            int i2 = 0;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (i == -13) {
                    if (str == null) {
                        throw Util.missingProperty("transferId", "transfer_id", jsonReader);
                    }
                    if (str2 != null) {
                        return new CheckUserYbRequest(str, str2, money, str3);
                    }
                    byte[] bArr3 = new byte[7];
                    while (i2 < 7) {
                        bArr3[i2] = (byte) (bArr2[i2] ^ bArr[i2 % 8]);
                        i2++;
                    }
                    throw Util.missingProperty("ybId", new String(bArr3, uza.a), jsonReader);
                }
                Constructor<CheckUserYbRequest> constructor = this.constructorRef;
                if (constructor == null) {
                    constructor = CheckUserYbRequest.class.getDeclaredConstructor(String.class, String.class, Money.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
                    this.constructorRef = constructor;
                }
                if (str == null) {
                    throw Util.missingProperty("transferId", "transfer_id", jsonReader);
                }
                if (str2 != null) {
                    return constructor.newInstance(str, str2, money, str3, Integer.valueOf(i), null);
                }
                byte[] bArr4 = new byte[7];
                while (i2 < 7) {
                    bArr4[i2] = (byte) (bArr2[i2] ^ bArr[i2 % 8]);
                    i2++;
                }
                throw Util.missingProperty("ybId", new String(bArr4, uza.a), jsonReader);
            }
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("transferId", "transfer_id", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    byte[] bArr5 = new byte[7];
                    while (i2 < 7) {
                        bArr5[i2] = (byte) (bArr2[i2] ^ bArr[i2 % 8]);
                        i2++;
                    }
                    throw Util.unexpectedNull("ybId", new String(bArr5, uza.a), jsonReader);
                }
            } else if (selectName == 2) {
                money = this.nullableMoneyAdapter.fromJson(jsonReader);
                i &= -5;
            } else if (selectName == 3) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -9;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CheckUserYbRequest checkUserYbRequest) {
        CheckUserYbRequest checkUserYbRequest2 = checkUserYbRequest;
        if (checkUserYbRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("transfer_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) checkUserYbRequest2.getTransferId());
        byte[] bArr = new byte[7];
        for (int i = 0; i < 7; i++) {
            bArr[i] = (byte) (cf91.c[i] ^ cf91.a[i % 8]);
        }
        jsonWriter.name(new String(bArr, uza.a));
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) checkUserYbRequest2.getYbId());
        jsonWriter.name("money");
        this.nullableMoneyAdapter.toJson(jsonWriter, (JsonWriter) checkUserYbRequest2.getMoney());
        jsonWriter.name("comment");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) checkUserYbRequest2.getComment());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(CheckUserYbRequest)");
    }
}
