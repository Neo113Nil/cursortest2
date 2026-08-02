package com.ybsdk.feature.transactions.impl.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.feature.transactions.api.dto.Transaction;
import com.ybsdk.feature.transactions.impl.data.network.dto.TransactionInfoResponse;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionInfoResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionInfoResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/transactions/api/dto/Transaction;", "transactionAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionErrorResponse;", "nullableTransactionErrorResponseAdapter", "", "nullableStringAdapter", "Lcom/ybsdk/core/common/data/network/dto/Money;", "nullableMoneyAdapter", "stringAdapter", "Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionInfoResponse$UsedCardInfo;", "nullableUsedCardInfoAdapter", "Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionInfoResponse$UsedTokenInfo;", "nullableUsedTokenInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-transactions-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransactionInfoResponseJsonAdapter extends JsonAdapter<TransactionInfoResponse> {
    private volatile Constructor<TransactionInfoResponse> constructorRef;
    private final JsonAdapter<Money> nullableMoneyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<TransactionErrorResponse> nullableTransactionErrorResponseAdapter;
    private final JsonAdapter<TransactionInfoResponse.UsedCardInfo> nullableUsedCardInfoAdapter;
    private final JsonAdapter<TransactionInfoResponse.UsedTokenInfo> nullableUsedTokenInfoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("base_info", "error", "statement", "fee", "support_url", "mcc_category", "mcc", "used_card", "used_token");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<Transaction> transactionAdapter;

    public TransactionInfoResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.transactionAdapter = moshi.adapter(Transaction.class, emptySet, "baseTransactionInfo");
        this.nullableTransactionErrorResponseAdapter = moshi.adapter(TransactionErrorResponse.class, emptySet, "error");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "statement");
        this.nullableMoneyAdapter = moshi.adapter(Money.class, emptySet, "fee");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "supportUrl");
        this.nullableUsedCardInfoAdapter = moshi.adapter(TransactionInfoResponse.UsedCardInfo.class, emptySet, "usedCardInfo");
        this.nullableUsedTokenInfoAdapter = moshi.adapter(TransactionInfoResponse.UsedTokenInfo.class, emptySet, "usedTokenInfo");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TransactionInfoResponse fromJson(JsonReader jsonReader) {
        int i;
        jsonReader.beginObject();
        int i2 = -1;
        Transaction transaction = null;
        TransactionErrorResponse transactionErrorResponse = null;
        String str = null;
        Money money = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        TransactionInfoResponse.UsedCardInfo usedCardInfo = null;
        TransactionInfoResponse.UsedTokenInfo usedTokenInfo = null;
        while (jsonReader.hasNext()) {
            Transaction transaction2 = transaction;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    transaction = this.transactionAdapter.fromJson(jsonReader);
                    if (transaction == null) {
                        throw Util.unexpectedNull("baseTransactionInfo", "base_info", jsonReader);
                    }
                    continue;
                case 1:
                    transactionErrorResponse = this.nullableTransactionErrorResponseAdapter.fromJson(jsonReader);
                    i2 &= -3;
                    break;
                case 2:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -5;
                    break;
                case 3:
                    money = this.nullableMoneyAdapter.fromJson(jsonReader);
                    i2 &= -9;
                    break;
                case 4:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("supportUrl", "support_url", jsonReader);
                    }
                    break;
                case 5:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -33;
                    break;
                case 6:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -65;
                    break;
                case 7:
                    usedCardInfo = this.nullableUsedCardInfoAdapter.fromJson(jsonReader);
                    i2 &= -129;
                    break;
                case 8:
                    usedTokenInfo = this.nullableUsedTokenInfoAdapter.fromJson(jsonReader);
                    i2 &= -257;
                    break;
            }
            transaction = transaction2;
        }
        Transaction transaction3 = transaction;
        jsonReader.endObject();
        if (i2 == -495) {
            if (transaction3 == null) {
                throw Util.missingProperty("baseTransactionInfo", "base_info", jsonReader);
            }
            if (str2 == null) {
                throw Util.missingProperty("supportUrl", "support_url", jsonReader);
            }
            TransactionInfoResponse.UsedTokenInfo usedTokenInfo2 = usedTokenInfo;
            TransactionInfoResponse.UsedCardInfo usedCardInfo2 = usedCardInfo;
            String str5 = str4;
            String str6 = str3;
            String str7 = str2;
            return new TransactionInfoResponse(transaction3, transactionErrorResponse, str, money, str7, str6, str5, usedCardInfo2, usedTokenInfo2);
        }
        Constructor<TransactionInfoResponse> constructor = this.constructorRef;
        if (constructor == null) {
            i = i2;
            constructor = TransactionInfoResponse.class.getDeclaredConstructor(Transaction.class, TransactionErrorResponse.class, String.class, Money.class, String.class, String.class, String.class, TransactionInfoResponse.UsedCardInfo.class, TransactionInfoResponse.UsedTokenInfo.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        } else {
            i = i2;
        }
        Constructor<TransactionInfoResponse> constructor2 = constructor;
        if (transaction3 == null) {
            throw Util.missingProperty("baseTransactionInfo", "base_info", jsonReader);
        }
        if (str2 != null) {
            return constructor2.newInstance(transaction3, transactionErrorResponse, str, money, str2, str3, str4, usedCardInfo, usedTokenInfo, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("supportUrl", "support_url", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TransactionInfoResponse transactionInfoResponse) {
        TransactionInfoResponse transactionInfoResponse2 = transactionInfoResponse;
        if (transactionInfoResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("base_info");
        this.transactionAdapter.toJson(jsonWriter, (JsonWriter) transactionInfoResponse2.getBaseTransactionInfo());
        jsonWriter.name("error");
        this.nullableTransactionErrorResponseAdapter.toJson(jsonWriter, (JsonWriter) transactionInfoResponse2.getError());
        jsonWriter.name("statement");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) transactionInfoResponse2.getStatement());
        jsonWriter.name("fee");
        this.nullableMoneyAdapter.toJson(jsonWriter, (JsonWriter) transactionInfoResponse2.getFee());
        jsonWriter.name("support_url");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) transactionInfoResponse2.getSupportUrl());
        jsonWriter.name("mcc_category");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) transactionInfoResponse2.getMccCategory());
        jsonWriter.name("mcc");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) transactionInfoResponse2.getMcc());
        jsonWriter.name("used_card");
        this.nullableUsedCardInfoAdapter.toJson(jsonWriter, (JsonWriter) transactionInfoResponse2.getUsedCardInfo());
        jsonWriter.name("used_token");
        this.nullableUsedTokenInfoAdapter.toJson(jsonWriter, (JsonWriter) transactionInfoResponse2.getUsedTokenInfo());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(TransactionInfoResponse)");
    }
}
