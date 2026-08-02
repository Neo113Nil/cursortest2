package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferV3RequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferV3Request;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/UserSessionInfoDto;", "userSessionInfoDtoAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/PaymentInfoDto;", "paymentInfoDtoAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SourcePaymentSideDto;", "sourcePaymentSideDtoAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TargetPaymentSideDto;", "targetPaymentSideDtoAdapter", "", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/ActionRequestDto;", "listOfActionRequestDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransferV3RequestJsonAdapter extends JsonAdapter<TransferV3Request> {
    private volatile Constructor<TransferV3Request> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<ActionRequestDto>> listOfActionRequestDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("type", "version", "transfer_id", "user_info", "payment_info", "source", "target", "actions");
    private final JsonAdapter<PaymentInfoDto> paymentInfoDtoAdapter;
    private final JsonAdapter<SourcePaymentSideDto> sourcePaymentSideDtoAdapter;
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<TargetPaymentSideDto> targetPaymentSideDtoAdapter;
    private final JsonAdapter<UserSessionInfoDto> userSessionInfoDtoAdapter;

    public TransferV3RequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "type");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "version");
        this.userSessionInfoDtoAdapter = moshi.adapter(UserSessionInfoDto.class, emptySet, "userInfo");
        this.paymentInfoDtoAdapter = moshi.adapter(PaymentInfoDto.class, emptySet, "paymentInfo");
        this.sourcePaymentSideDtoAdapter = moshi.adapter(SourcePaymentSideDto.class, emptySet, "source");
        this.targetPaymentSideDtoAdapter = moshi.adapter(TargetPaymentSideDto.class, emptySet, "target");
        this.listOfActionRequestDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, ActionRequestDto.class), emptySet, "actions");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TransferV3Request fromJson(JsonReader jsonReader) {
        int i;
        jsonReader.beginObject();
        int i2 = -1;
        String str = null;
        Integer num = null;
        String str2 = null;
        UserSessionInfoDto userSessionInfoDto = null;
        PaymentInfoDto paymentInfoDto = null;
        SourcePaymentSideDto sourcePaymentSideDto = null;
        TargetPaymentSideDto targetPaymentSideDto = null;
        List<ActionRequestDto> list = null;
        while (true) {
            String str3 = str;
            Integer num2 = num;
            String str4 = str2;
            UserSessionInfoDto userSessionInfoDto2 = userSessionInfoDto;
            PaymentInfoDto paymentInfoDto2 = paymentInfoDto;
            if (!jsonReader.hasNext()) {
                SourcePaymentSideDto sourcePaymentSideDto2 = sourcePaymentSideDto;
                jsonReader.endObject();
                if (i2 == -129) {
                    if (str3 == null) {
                        throw Util.missingProperty("type", "type", jsonReader);
                    }
                    if (num2 == null) {
                        throw Util.missingProperty("version", "version", jsonReader);
                    }
                    int intValue = num2.intValue();
                    if (str4 == null) {
                        throw Util.missingProperty("transferId", "transfer_id", jsonReader);
                    }
                    if (userSessionInfoDto2 == null) {
                        throw Util.missingProperty("userInfo", "user_info", jsonReader);
                    }
                    if (paymentInfoDto2 == null) {
                        throw Util.missingProperty("paymentInfo", "payment_info", jsonReader);
                    }
                    if (sourcePaymentSideDto2 == null) {
                        throw Util.missingProperty("source", "source", jsonReader);
                    }
                    if (targetPaymentSideDto == null) {
                        throw Util.missingProperty("target", "target", jsonReader);
                    }
                    return new TransferV3Request(str3, intValue, str4, userSessionInfoDto2, paymentInfoDto2, sourcePaymentSideDto2, targetPaymentSideDto, list);
                }
                Constructor<TransferV3Request> constructor = this.constructorRef;
                if (constructor == null) {
                    Class<?> cls = Util.DEFAULT_CONSTRUCTOR_MARKER;
                    Class cls2 = Integer.TYPE;
                    i = i2;
                    constructor = TransferV3Request.class.getDeclaredConstructor(String.class, cls2, String.class, UserSessionInfoDto.class, PaymentInfoDto.class, SourcePaymentSideDto.class, TargetPaymentSideDto.class, List.class, cls2, cls);
                    this.constructorRef = constructor;
                } else {
                    i = i2;
                }
                Constructor<TransferV3Request> constructor2 = constructor;
                if (str3 == null) {
                    throw Util.missingProperty("type", "type", jsonReader);
                }
                if (num2 == null) {
                    throw Util.missingProperty("version", "version", jsonReader);
                }
                if (str4 == null) {
                    throw Util.missingProperty("transferId", "transfer_id", jsonReader);
                }
                if (userSessionInfoDto2 == null) {
                    throw Util.missingProperty("userInfo", "user_info", jsonReader);
                }
                if (paymentInfoDto2 == null) {
                    throw Util.missingProperty("paymentInfo", "payment_info", jsonReader);
                }
                if (sourcePaymentSideDto2 == null) {
                    throw Util.missingProperty("source", "source", jsonReader);
                }
                if (targetPaymentSideDto != null) {
                    return constructor2.newInstance(str3, num2, str4, userSessionInfoDto2, paymentInfoDto2, sourcePaymentSideDto2, targetPaymentSideDto, list, Integer.valueOf(i), null);
                }
                throw Util.missingProperty("target", "target", jsonReader);
            }
            SourcePaymentSideDto sourcePaymentSideDto3 = sourcePaymentSideDto;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    sourcePaymentSideDto = sourcePaymentSideDto3;
                    str = str3;
                    num = num2;
                    str2 = str4;
                    userSessionInfoDto = userSessionInfoDto2;
                    paymentInfoDto = paymentInfoDto2;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("type", "type", jsonReader);
                    }
                    sourcePaymentSideDto = sourcePaymentSideDto3;
                    num = num2;
                    str2 = str4;
                    userSessionInfoDto = userSessionInfoDto2;
                    paymentInfoDto = paymentInfoDto2;
                case 1:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("version", "version", jsonReader);
                    }
                    sourcePaymentSideDto = sourcePaymentSideDto3;
                    str = str3;
                    str2 = str4;
                    userSessionInfoDto = userSessionInfoDto2;
                    paymentInfoDto = paymentInfoDto2;
                case 2:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("transferId", "transfer_id", jsonReader);
                    }
                    sourcePaymentSideDto = sourcePaymentSideDto3;
                    str = str3;
                    num = num2;
                    userSessionInfoDto = userSessionInfoDto2;
                    paymentInfoDto = paymentInfoDto2;
                case 3:
                    userSessionInfoDto = this.userSessionInfoDtoAdapter.fromJson(jsonReader);
                    if (userSessionInfoDto == null) {
                        throw Util.unexpectedNull("userInfo", "user_info", jsonReader);
                    }
                    sourcePaymentSideDto = sourcePaymentSideDto3;
                    str = str3;
                    num = num2;
                    str2 = str4;
                    paymentInfoDto = paymentInfoDto2;
                case 4:
                    paymentInfoDto = this.paymentInfoDtoAdapter.fromJson(jsonReader);
                    if (paymentInfoDto == null) {
                        throw Util.unexpectedNull("paymentInfo", "payment_info", jsonReader);
                    }
                    sourcePaymentSideDto = sourcePaymentSideDto3;
                    str = str3;
                    num = num2;
                    str2 = str4;
                    userSessionInfoDto = userSessionInfoDto2;
                case 5:
                    sourcePaymentSideDto = this.sourcePaymentSideDtoAdapter.fromJson(jsonReader);
                    if (sourcePaymentSideDto == null) {
                        throw Util.unexpectedNull("source", "source", jsonReader);
                    }
                    str = str3;
                    num = num2;
                    str2 = str4;
                    userSessionInfoDto = userSessionInfoDto2;
                    paymentInfoDto = paymentInfoDto2;
                case 6:
                    targetPaymentSideDto = this.targetPaymentSideDtoAdapter.fromJson(jsonReader);
                    if (targetPaymentSideDto == null) {
                        throw Util.unexpectedNull("target", "target", jsonReader);
                    }
                    sourcePaymentSideDto = sourcePaymentSideDto3;
                    str = str3;
                    num = num2;
                    str2 = str4;
                    userSessionInfoDto = userSessionInfoDto2;
                    paymentInfoDto = paymentInfoDto2;
                case 7:
                    list = this.listOfActionRequestDtoAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("actions", "actions", jsonReader);
                    }
                    sourcePaymentSideDto = sourcePaymentSideDto3;
                    str = str3;
                    num = num2;
                    str2 = str4;
                    userSessionInfoDto = userSessionInfoDto2;
                    paymentInfoDto = paymentInfoDto2;
                    i2 = -129;
                default:
                    sourcePaymentSideDto = sourcePaymentSideDto3;
                    str = str3;
                    num = num2;
                    str2 = str4;
                    userSessionInfoDto = userSessionInfoDto2;
                    paymentInfoDto = paymentInfoDto2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TransferV3Request transferV3Request) {
        TransferV3Request transferV3Request2 = transferV3Request;
        if (transferV3Request2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("type");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) transferV3Request2.getType());
        jsonWriter.name("version");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(transferV3Request2.getVersion()));
        jsonWriter.name("transfer_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) transferV3Request2.getTransferId());
        jsonWriter.name("user_info");
        this.userSessionInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) transferV3Request2.getUserInfo());
        jsonWriter.name("payment_info");
        this.paymentInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) transferV3Request2.getPaymentInfo());
        jsonWriter.name("source");
        this.sourcePaymentSideDtoAdapter.toJson(jsonWriter, (JsonWriter) transferV3Request2.getSource());
        jsonWriter.name("target");
        this.targetPaymentSideDtoAdapter.toJson(jsonWriter, (JsonWriter) transferV3Request2.getTarget());
        jsonWriter.name("actions");
        this.listOfActionRequestDtoAdapter.toJson(jsonWriter, (JsonWriter) transferV3Request2.getActions());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(TransferV3Request)");
    }
}
