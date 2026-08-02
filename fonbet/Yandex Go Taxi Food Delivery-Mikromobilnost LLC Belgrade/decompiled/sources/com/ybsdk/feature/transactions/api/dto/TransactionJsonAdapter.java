package com.ybsdk.feature.transactions.api.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\"\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\fR\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/feature/transactions/api/dto/TransactionJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transactions/api/dto/Transaction;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transactions/api/dto/TransactionStatus;", "transactionStatusAdapter", "Lcom/ybsdk/feature/transactions/api/dto/TransactionType;", "transactionTypeAdapter", "Lcom/ybsdk/core/common/data/network/dto/Money;", "nullableMoneyAdapter", "nullableStringAdapter", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "nullableThemesOfStringAdapter", "", "Lcom/ybsdk/feature/transactions/api/dto/TransactionInfoAdditionalField;", "listOfTransactionInfoAdditionalFieldAdapter", "Lcom/ybsdk/feature/transactions/api/dto/Comment;", "nullableCommentAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-transactions-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransactionJsonAdapter extends JsonAdapter<Transaction> {
    private volatile Constructor<Transaction> constructorRef;
    private final JsonAdapter<List<TransactionInfoAdditionalField>> listOfTransactionInfoAdditionalFieldAdapter;
    private final JsonAdapter<Comment> nullableCommentAdapter;
    private final JsonAdapter<Money> nullableMoneyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<Themes<String>> nullableThemesOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("transaction_id", ACSPConstants.STATUS, "type", ClidProvider.TIMESTAMP, "name", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "money", "transaction_money", "plus", "image", "themed_image", "cashback", "additional_fields", "comment");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<TransactionStatus> transactionStatusAdapter;
    private final JsonAdapter<TransactionType> transactionTypeAdapter;

    public TransactionJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "transactionId");
        this.transactionStatusAdapter = moshi.adapter(TransactionStatus.class, emptySet, ACSPConstants.STATUS);
        this.transactionTypeAdapter = moshi.adapter(TransactionType.class, emptySet, "type");
        this.nullableMoneyAdapter = moshi.adapter(Money.class, emptySet, "money");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "image");
        this.nullableThemesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "themedImage");
        this.listOfTransactionInfoAdditionalFieldAdapter = moshi.adapter(Types.newParameterizedType(List.class, TransactionInfoAdditionalField.class), emptySet, "additionalFields");
        this.nullableCommentAdapter = moshi.adapter(Comment.class, emptySet, "comment");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Transaction fromJson(JsonReader jsonReader) {
        String str;
        jsonReader.beginObject();
        int i = -1;
        String str2 = null;
        TransactionStatus transactionStatus = null;
        TransactionType transactionType = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Money money = null;
        Money money2 = null;
        Money money3 = null;
        String str6 = null;
        Themes<String> themes = null;
        Money money4 = null;
        List<TransactionInfoAdditionalField> list = null;
        Comment comment = null;
        while (true) {
            String str7 = str2;
            TransactionStatus transactionStatus2 = transactionStatus;
            TransactionType transactionType2 = transactionType;
            String str8 = str3;
            if (!jsonReader.hasNext()) {
                String str9 = str4;
                jsonReader.endObject();
                if (i == -8161) {
                    if (str7 == null) {
                        throw Util.missingProperty("transactionId", "transaction_id", jsonReader);
                    }
                    if (transactionStatus2 == null) {
                        throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                    }
                    if (transactionType2 == null) {
                        throw Util.missingProperty("type", "type", jsonReader);
                    }
                    if (str8 == null) {
                        throw Util.missingProperty(ClidProvider.TIMESTAMP, ClidProvider.TIMESTAMP, jsonReader);
                    }
                    if (str9 == null) {
                        throw Util.missingProperty("name", "name", jsonReader);
                    }
                    Money money5 = money3;
                    return new Transaction(str7, transactionStatus2, transactionType2, str8, str9, str5, money, money2, money5, str6, themes, money4, list, comment);
                }
                int i2 = i;
                Constructor<Transaction> constructor = this.constructorRef;
                if (constructor == null) {
                    str = str8;
                    constructor = Transaction.class.getDeclaredConstructor(String.class, TransactionStatus.class, TransactionType.class, String.class, String.class, String.class, Money.class, Money.class, Money.class, String.class, Themes.class, Money.class, List.class, Comment.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
                    this.constructorRef = constructor;
                } else {
                    str = str8;
                }
                Constructor<Transaction> constructor2 = constructor;
                if (str7 == null) {
                    throw Util.missingProperty("transactionId", "transaction_id", jsonReader);
                }
                if (transactionStatus2 == null) {
                    throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                }
                if (transactionType2 == null) {
                    throw Util.missingProperty("type", "type", jsonReader);
                }
                if (str == null) {
                    throw Util.missingProperty(ClidProvider.TIMESTAMP, ClidProvider.TIMESTAMP, jsonReader);
                }
                if (str9 == null) {
                    throw Util.missingProperty("name", "name", jsonReader);
                }
                return constructor2.newInstance(str7, transactionStatus2, transactionType2, str, str9, str5, money, money2, money3, str6, themes, money4, list, comment, Integer.valueOf(i2), null);
            }
            String str10 = str4;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    str4 = str10;
                    str2 = str7;
                    transactionStatus = transactionStatus2;
                    transactionType = transactionType2;
                    str3 = str8;
                case 0:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("transactionId", "transaction_id", jsonReader);
                    }
                    str4 = str10;
                    transactionStatus = transactionStatus2;
                    transactionType = transactionType2;
                    str3 = str8;
                case 1:
                    transactionStatus = this.transactionStatusAdapter.fromJson(jsonReader);
                    if (transactionStatus == null) {
                        throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                    }
                    str4 = str10;
                    str2 = str7;
                    transactionType = transactionType2;
                    str3 = str8;
                case 2:
                    transactionType = this.transactionTypeAdapter.fromJson(jsonReader);
                    if (transactionType == null) {
                        throw Util.unexpectedNull("type", "type", jsonReader);
                    }
                    str4 = str10;
                    str2 = str7;
                    transactionStatus = transactionStatus2;
                    str3 = str8;
                case 3:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull(ClidProvider.TIMESTAMP, ClidProvider.TIMESTAMP, jsonReader);
                    }
                    str4 = str10;
                    str2 = str7;
                    transactionStatus = transactionStatus2;
                    transactionType = transactionType2;
                case 4:
                    str4 = this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("name", "name", jsonReader);
                    }
                    str2 = str7;
                    transactionStatus = transactionStatus2;
                    transactionType = transactionType2;
                    str3 = str8;
                case 5:
                    str5 = this.stringAdapter.fromJson(jsonReader);
                    if (str5 == null) {
                        throw Util.unexpectedNull(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
                    }
                    i &= -33;
                    str4 = str10;
                    str2 = str7;
                    transactionStatus = transactionStatus2;
                    transactionType = transactionType2;
                    str3 = str8;
                case 6:
                    money = this.nullableMoneyAdapter.fromJson(jsonReader);
                    i &= -65;
                    str4 = str10;
                    str2 = str7;
                    transactionStatus = transactionStatus2;
                    transactionType = transactionType2;
                    str3 = str8;
                case 7:
                    money2 = this.nullableMoneyAdapter.fromJson(jsonReader);
                    i &= -129;
                    str4 = str10;
                    str2 = str7;
                    transactionStatus = transactionStatus2;
                    transactionType = transactionType2;
                    str3 = str8;
                case 8:
                    money3 = this.nullableMoneyAdapter.fromJson(jsonReader);
                    i &= -257;
                    str4 = str10;
                    str2 = str7;
                    transactionStatus = transactionStatus2;
                    transactionType = transactionType2;
                    str3 = str8;
                case 9:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -513;
                    str4 = str10;
                    str2 = str7;
                    transactionStatus = transactionStatus2;
                    transactionType = transactionType2;
                    str3 = str8;
                case 10:
                    themes = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
                    i &= -1025;
                    str4 = str10;
                    str2 = str7;
                    transactionStatus = transactionStatus2;
                    transactionType = transactionType2;
                    str3 = str8;
                case 11:
                    money4 = this.nullableMoneyAdapter.fromJson(jsonReader);
                    i &= -2049;
                    str4 = str10;
                    str2 = str7;
                    transactionStatus = transactionStatus2;
                    transactionType = transactionType2;
                    str3 = str8;
                case 12:
                    list = this.listOfTransactionInfoAdditionalFieldAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("additionalFields", "additional_fields", jsonReader);
                    }
                    i &= -4097;
                    str4 = str10;
                    str2 = str7;
                    transactionStatus = transactionStatus2;
                    transactionType = transactionType2;
                    str3 = str8;
                case 13:
                    comment = this.nullableCommentAdapter.fromJson(jsonReader);
                    str4 = str10;
                    str2 = str7;
                    transactionStatus = transactionStatus2;
                    transactionType = transactionType2;
                    str3 = str8;
                default:
                    str4 = str10;
                    str2 = str7;
                    transactionStatus = transactionStatus2;
                    transactionType = transactionType2;
                    str3 = str8;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Transaction transaction) {
        Transaction transaction2 = transaction;
        if (transaction2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("transaction_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) transaction2.getTransactionId());
        jsonWriter.name(ACSPConstants.STATUS);
        this.transactionStatusAdapter.toJson(jsonWriter, (JsonWriter) transaction2.getStatus());
        jsonWriter.name("type");
        this.transactionTypeAdapter.toJson(jsonWriter, (JsonWriter) transaction2.getType());
        jsonWriter.name(ClidProvider.TIMESTAMP);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) transaction2.getTimestamp());
        jsonWriter.name("name");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) transaction2.getName());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) transaction2.getDescription());
        jsonWriter.name("money");
        this.nullableMoneyAdapter.toJson(jsonWriter, (JsonWriter) transaction2.getMoney());
        jsonWriter.name("transaction_money");
        this.nullableMoneyAdapter.toJson(jsonWriter, (JsonWriter) transaction2.getTransactionMoney());
        jsonWriter.name("plus");
        this.nullableMoneyAdapter.toJson(jsonWriter, (JsonWriter) transaction2.getPlus());
        jsonWriter.name("image");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) transaction2.getImage());
        jsonWriter.name("themed_image");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) transaction2.getThemedImage());
        jsonWriter.name("cashback");
        this.nullableMoneyAdapter.toJson(jsonWriter, (JsonWriter) transaction2.getCashback());
        jsonWriter.name("additional_fields");
        this.listOfTransactionInfoAdditionalFieldAdapter.toJson(jsonWriter, (JsonWriter) transaction2.getAdditionalFields());
        jsonWriter.name("comment");
        this.nullableCommentAdapter.toJson(jsonWriter, (JsonWriter) transaction2.getComment());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(33, "GeneratedJsonAdapter(Transaction)");
    }
}
