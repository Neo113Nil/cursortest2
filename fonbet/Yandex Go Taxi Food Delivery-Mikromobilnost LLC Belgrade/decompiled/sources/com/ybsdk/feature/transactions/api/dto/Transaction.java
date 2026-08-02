package com.ybsdk.feature.transactions.api.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0003\u0010\n\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\u000e\b\u0003\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0007HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0017HÆ\u0003J¯\u0001\u0010?\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00112\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\f2\u000e\b\u0003\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÆ\u0001J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020DHÖ\u0001J\t\u0010E\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010(\u001a\u0004\b)\u0010\u001bR\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010$R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b/\u00100¨\u0006F"}, d2 = {"Lcom/ybsdk/feature/transactions/api/dto/Transaction;", "", "transactionId", "", ACSPConstants.STATUS, "Lcom/ybsdk/feature/transactions/api/dto/TransactionStatus;", "type", "Lcom/ybsdk/feature/transactions/api/dto/TransactionType;", ClidProvider.TIMESTAMP, "name", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "money", "Lcom/ybsdk/core/common/data/network/dto/Money;", "transactionMoney", "plus", "image", "themedImage", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "cashback", "additionalFields", "", "Lcom/ybsdk/feature/transactions/api/dto/TransactionInfoAdditionalField;", "comment", "Lcom/ybsdk/feature/transactions/api/dto/Comment;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/transactions/api/dto/TransactionStatus;Lcom/ybsdk/feature/transactions/api/dto/TransactionType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/util/List;Lcom/ybsdk/feature/transactions/api/dto/Comment;)V", "getTransactionId", "()Ljava/lang/String;", "getStatus", "()Lcom/ybsdk/feature/transactions/api/dto/TransactionStatus;", "getType", "()Lcom/ybsdk/feature/transactions/api/dto/TransactionType;", "getTimestamp", "getName", "getDescription", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getTransactionMoney", "getPlus", "getImage$annotations", "()V", "getImage", "getThemedImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getCashback", "getAdditionalFields", "()Ljava/util/List;", "getComment", "()Lcom/ybsdk/feature/transactions/api/dto/Comment;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transactions-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Transaction {
    private final List<TransactionInfoAdditionalField> additionalFields;
    private final Money cashback;
    private final Comment comment;
    private final String description;
    private final String image;
    private final Money money;
    private final String name;
    private final Money plus;
    private final TransactionStatus status;
    private final Themes<String> themedImage;
    private final String timestamp;
    private final String transactionId;
    private final Money transactionMoney;
    private final TransactionType type;

    public /* synthetic */ Transaction(String str, TransactionStatus transactionStatus, TransactionType transactionType, String str2, String str3, String str4, Money money, Money money2, Money money3, String str5, Themes themes, Money money4, List list, Comment comment, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, transactionStatus, transactionType, str2, str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? null : money, (i & 128) != 0 ? null : money2, (i & 256) != 0 ? null : money3, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : themes, (i & 2048) != 0 ? null : money4, (i & 4096) != 0 ? EmptyList.a : list, comment);
    }

    @jxi
    public static /* synthetic */ void getImage$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    public final Themes<String> component11() {
        return this.themedImage;
    }

    /* renamed from: component12, reason: from getter */
    public final Money getCashback() {
        return this.cashback;
    }

    public final List<TransactionInfoAdditionalField> component13() {
        return this.additionalFields;
    }

    /* renamed from: component14, reason: from getter */
    public final Comment getComment() {
        return this.comment;
    }

    /* renamed from: component2, reason: from getter */
    public final TransactionStatus getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final TransactionType getType() {
        return this.type;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component7, reason: from getter */
    public final Money getMoney() {
        return this.money;
    }

    /* renamed from: component8, reason: from getter */
    public final Money getTransactionMoney() {
        return this.transactionMoney;
    }

    /* renamed from: component9, reason: from getter */
    public final Money getPlus() {
        return this.plus;
    }

    public final Transaction copy(@Json(name = "transaction_id") String transactionId, @Json(name = "status") TransactionStatus status, @Json(name = "type") TransactionType type, @Json(name = "timestamp") String timestamp, @Json(name = "name") String name, @Json(name = "description") String description, @Json(name = "money") Money money, @Json(name = "transaction_money") Money transactionMoney, @Json(name = "plus") Money plus, @Json(name = "image") String image, @Json(name = "themed_image") Themes<String> themedImage, @Json(name = "cashback") Money cashback, @Json(name = "additional_fields") List<TransactionInfoAdditionalField> additionalFields, @Json(name = "comment") Comment comment) {
        return new Transaction(transactionId, status, type, timestamp, name, description, money, transactionMoney, plus, image, themedImage, cashback, additionalFields, comment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Transaction)) {
            return false;
        }
        Transaction transaction = (Transaction) other;
        return jl40.l(this.transactionId, transaction.transactionId) && jl40.l(this.status, transaction.status) && this.type == transaction.type && jl40.l(this.timestamp, transaction.timestamp) && jl40.l(this.name, transaction.name) && jl40.l(this.description, transaction.description) && jl40.l(this.money, transaction.money) && jl40.l(this.transactionMoney, transaction.transactionMoney) && jl40.l(this.plus, transaction.plus) && jl40.l(this.image, transaction.image) && jl40.l(this.themedImage, transaction.themedImage) && jl40.l(this.cashback, transaction.cashback) && jl40.l(this.additionalFields, transaction.additionalFields) && jl40.l(this.comment, transaction.comment);
    }

    public final List<TransactionInfoAdditionalField> getAdditionalFields() {
        return this.additionalFields;
    }

    public final Money getCashback() {
        return this.cashback;
    }

    public final Comment getComment() {
        return this.comment;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getImage() {
        return this.image;
    }

    public final Money getMoney() {
        return this.money;
    }

    public final String getName() {
        return this.name;
    }

    public final Money getPlus() {
        return this.plus;
    }

    public final TransactionStatus getStatus() {
        return this.status;
    }

    public final Themes<String> getThemedImage() {
        return this.themedImage;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public final Money getTransactionMoney() {
        return this.transactionMoney;
    }

    public final TransactionType getType() {
        return this.type;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b(unr0.b((this.type.hashCode() + ((this.status.hashCode() + (this.transactionId.hashCode() * 31)) * 31)) * 31, 31, this.timestamp), 31, this.name), 31, this.description);
        Money money = this.money;
        int hashCode = (b + (money == null ? 0 : money.hashCode())) * 31;
        Money money2 = this.transactionMoney;
        int hashCode2 = (hashCode + (money2 == null ? 0 : money2.hashCode())) * 31;
        Money money3 = this.plus;
        int hashCode3 = (hashCode2 + (money3 == null ? 0 : money3.hashCode())) * 31;
        String str = this.image;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Themes<String> themes = this.themedImage;
        int hashCode5 = (hashCode4 + (themes == null ? 0 : themes.hashCode())) * 31;
        Money money4 = this.cashback;
        int c = unr0.c((hashCode5 + (money4 == null ? 0 : money4.hashCode())) * 31, 31, this.additionalFields);
        Comment comment = this.comment;
        return c + (comment != null ? comment.hashCode() : 0);
    }

    public String toString() {
        String str = this.transactionId;
        TransactionStatus transactionStatus = this.status;
        TransactionType transactionType = this.type;
        String str2 = this.timestamp;
        String str3 = this.name;
        String str4 = this.description;
        Money money = this.money;
        Money money2 = this.transactionMoney;
        Money money3 = this.plus;
        String str5 = this.image;
        Themes<String> themes = this.themedImage;
        Money money4 = this.cashback;
        List<TransactionInfoAdditionalField> list = this.additionalFields;
        Comment comment = this.comment;
        StringBuilder sb = new StringBuilder("Transaction(transactionId=");
        sb.append(str);
        sb.append(", status=");
        sb.append(transactionStatus);
        sb.append(", type=");
        sb.append(transactionType);
        sb.append(", timestamp=");
        sb.append(str2);
        sb.append(", name=");
        g8e.D(sb, str3, ", description=", str4, ", money=");
        sb.append(money);
        sb.append(", transactionMoney=");
        sb.append(money2);
        sb.append(", plus=");
        sb.append(money3);
        sb.append(", image=");
        sb.append(str5);
        sb.append(", themedImage=");
        sb.append(themes);
        sb.append(", cashback=");
        sb.append(money4);
        sb.append(", additionalFields=");
        sb.append(list);
        sb.append(", comment=");
        sb.append(comment);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public Transaction(@Json(name = "transaction_id") String str, @Json(name = "status") TransactionStatus transactionStatus, @Json(name = "type") TransactionType transactionType, @Json(name = "timestamp") String str2, @Json(name = "name") String str3, @Json(name = "description") String str4, @Json(name = "money") Money money, @Json(name = "transaction_money") Money money2, @Json(name = "plus") Money money3, @Json(name = "image") String str5, @Json(name = "themed_image") Themes<String> themes, @Json(name = "cashback") Money money4, @Json(name = "additional_fields") List<TransactionInfoAdditionalField> list, @Json(name = "comment") Comment comment) {
        this.transactionId = str;
        this.status = transactionStatus;
        this.type = transactionType;
        this.timestamp = str2;
        this.name = str3;
        this.description = str4;
        this.money = money;
        this.transactionMoney = money2;
        this.plus = money3;
        this.image = str5;
        this.themedImage = themes;
        this.cashback = money4;
        this.additionalFields = list;
        this.comment = comment;
    }
}
