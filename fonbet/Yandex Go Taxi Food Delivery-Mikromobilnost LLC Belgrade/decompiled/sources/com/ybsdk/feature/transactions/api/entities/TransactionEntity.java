package com.ybsdk.feature.transactions.api.entities;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.ColorModel;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.ly3;
import defpackage.lyg0;
import defpackage.oo31;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.vfc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b/\b\u0087\b\u0018\u00002\u00020\u0001:\u0011}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001Bù\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 \u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u001d\u0010,\u001a\u00020+2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020)¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b2\u00101J\u0010\u00103\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b3\u00101J\u0010\u00104\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b8\u00107J\u0012\u00109\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b9\u00107J\u0012\u0010:\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b:\u00107J\u0012\u0010;\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bC\u00101J\u0010\u0010D\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bD\u00101J\u0012\u0010E\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bE\u00101J\u0012\u0010F\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bF\u00101J\u0012\u0010G\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bG\u00101J\u0012\u0010H\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bH\u00101J\u0012\u0010I\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0012\u0010K\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bK\u0010LJ\u0012\u0010M\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bM\u00107J\u0016\u0010N\u001a\b\u0012\u0004\u0012\u00020!0 HÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0012\u0010P\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0004\bP\u0010QJ\u009a\u0002\u0010R\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#HÆ\u0001¢\u0006\u0004\bR\u0010SJ\u0010\u0010T\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bT\u00101J\u0010\u0010U\u001a\u00020)HÖ\u0001¢\u0006\u0004\bU\u0010/J\u001a\u0010Y\u001a\u00020X2\b\u0010W\u001a\u0004\u0018\u00010VHÖ\u0003¢\u0006\u0004\bY\u0010ZR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010[\u001a\u0004\b\\\u00101R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010[\u001a\u0004\b]\u00101R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010[\u001a\u0004\b^\u00101R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010_\u001a\u0004\b`\u00105R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010a\u001a\u0004\bb\u00107R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010a\u001a\u0004\bc\u00107R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010a\u001a\u0004\bd\u00107R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\f\u0010a\u001a\u0004\be\u00107R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010f\u001a\u0004\bg\u0010<R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010h\u001a\u0004\bi\u0010>R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010j\u001a\u0004\bk\u0010@R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010l\u001a\u0004\bm\u0010BR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010[\u001a\u0004\bn\u00101R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010[\u001a\u0004\bo\u00101R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010[\u001a\u0004\bp\u00101R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010[\u001a\u0004\bq\u00101R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010[\u001a\u0004\br\u00101R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010[\u001a\u0004\bs\u00101R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010t\u001a\u0004\bu\u0010JR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010v\u001a\u0004\bw\u0010LR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010a\u001a\u0004\bx\u00107R\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0006¢\u0006\f\n\u0004\b\"\u0010y\u001a\u0004\bz\u0010OR\u0019\u0010$\u001a\u0004\u0018\u00010#8\u0006¢\u0006\f\n\u0004\b$\u0010{\u001a\u0004\b|\u0010Q¨\u0006\u0087\u0001"}, d2 = {"Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity;", "Landroid/os/Parcelable;", "", "id", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "", ClidProvider.TIMESTAMP, "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "amount", "secondaryAmount", "cashback", "plusAmount", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "imageUrl", "Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$Type;", "type", "Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$State;", ClidProvider.STATE, "Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$Error;", "error", "statementUrl", ACSPConstants.STATUS, "category", "mccCode", "supportUrl", "transactionSource", "Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$UsedCardInfo;", "usedCardInfo", "Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$UsedTokenInfo;", "usedTokenInfo", "fee", "", "Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$AdditionalField;", "additionalFields", "Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$CommentEntity;", "comment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcom/ybsdk/core/common/domain/entities/MoneyEntity;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$Type;Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$State;Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$Error;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$UsedCardInfo;Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$UsedTokenInfo;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/util/List;Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$CommentEntity;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()J", "component5", "()Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "component6", "component7", "component8", "component9", "()Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "component10", "()Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$Type;", "component11", "()Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$State;", "component12", "()Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$Error;", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "()Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$UsedCardInfo;", "component20", "()Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$UsedTokenInfo;", "component21", "component22", "()Ljava/util/List;", "component23", "()Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$CommentEntity;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcom/ybsdk/core/common/domain/entities/MoneyEntity;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$Type;Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$State;Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$Error;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$UsedCardInfo;Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$UsedTokenInfo;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/util/List;Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$CommentEntity;)Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getTitle", "getDescription", "J", "getTimestamp", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "getAmount", "getSecondaryAmount", "getCashback", "getPlusAmount", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "getImageUrl", "Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$Type;", "getType", "Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$State;", "getState", "Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$Error;", "getError", "getStatementUrl", "getStatus", "getCategory", "getMccCode", "getSupportUrl", "getTransactionSource", "Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$UsedCardInfo;", "getUsedCardInfo", "Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$UsedTokenInfo;", "getUsedTokenInfo", "getFee", "Ljava/util/List;", "getAdditionalFields", "Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$CommentEntity;", "getComment", "Error", "Type", "State", "AdditionalField", "UsedCardInfo", "UsedTokenInfo", "PaymentSystem", "TokenProvider", "CommentEntity", "CommentThemeEntity", "feature-transactions-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransactionEntity implements Parcelable {
    public static final Parcelable.Creator<TransactionEntity> CREATOR = new Creator();
    private final List<AdditionalField> additionalFields;
    private final MoneyEntity amount;
    private final MoneyEntity cashback;
    private final String category;
    private final CommentEntity comment;
    private final String description;
    private final Error error;
    private final MoneyEntity fee;
    private final String id;
    private final ThemedImageUrlEntity imageUrl;
    private final String mccCode;
    private final MoneyEntity plusAmount;
    private final MoneyEntity secondaryAmount;
    private final State state;
    private final String statementUrl;
    private final String status;
    private final String supportUrl;
    private final long timestamp;
    private final String title;
    private final String transactionSource;
    private final Type type;
    private final UsedCardInfo usedCardInfo;
    private final UsedTokenInfo usedTokenInfo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$PaymentSystem;", "", "<init>", "(Ljava/lang/String;I)V", "MIR", "AMERICAN_EXPRESS", "MASTERCARD", "VISA", "UNKNOWN", "feature-transactions-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class PaymentSystem {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ PaymentSystem[] $VALUES;
        public static final PaymentSystem MIR = new PaymentSystem("MIR", 0);
        public static final PaymentSystem AMERICAN_EXPRESS = new PaymentSystem("AMERICAN_EXPRESS", 1);
        public static final PaymentSystem MASTERCARD = new PaymentSystem("MASTERCARD", 2);
        public static final PaymentSystem VISA = new PaymentSystem("VISA", 3);
        public static final PaymentSystem UNKNOWN = new PaymentSystem("UNKNOWN", 4);

        private static final /* synthetic */ PaymentSystem[] $values() {
            return new PaymentSystem[]{MIR, AMERICAN_EXPRESS, MASTERCARD, VISA, UNKNOWN};
        }

        static {
            PaymentSystem[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private PaymentSystem(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static PaymentSystem valueOf(String str) {
            return (PaymentSystem) Enum.valueOf(PaymentSystem.class, str);
        }

        public static PaymentSystem[] values() {
            return (PaymentSystem[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$State;", "", "<init>", "(Ljava/lang/String;I)V", "NORMAL", "SUCCESS", "FAILED", "CANCEL", "HOLD", "feature-transactions-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class State {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State NORMAL = new State("NORMAL", 0);
        public static final State SUCCESS = new State("SUCCESS", 1);
        public static final State FAILED = new State("FAILED", 2);
        public static final State CANCEL = new State("CANCEL", 3);
        public static final State HOLD = new State("HOLD", 4);

        private static final /* synthetic */ State[] $values() {
            return new State[]{NORMAL, SUCCESS, FAILED, CANCEL, HOLD};
        }

        static {
            State[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private State(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$TokenProvider;", "", "<init>", "(Ljava/lang/String;I)V", "APPLE", "GOOGLE", "UNDEFINED", "feature-transactions-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class TokenProvider {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TokenProvider[] $VALUES;
        public static final TokenProvider APPLE = new TokenProvider("APPLE", 0);
        public static final TokenProvider GOOGLE = new TokenProvider("GOOGLE", 1);
        public static final TokenProvider UNDEFINED = new TokenProvider("UNDEFINED", 2);

        private static final /* synthetic */ TokenProvider[] $values() {
            return new TokenProvider[]{APPLE, GOOGLE, UNDEFINED};
        }

        static {
            TokenProvider[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private TokenProvider(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static TokenProvider valueOf(String str) {
            return (TokenProvider) Enum.valueOf(TokenProvider.class, str);
        }

        public static TokenProvider[] values() {
            return (TokenProvider[]) $VALUES.clone();
        }
    }

    public /* synthetic */ TransactionEntity(String str, String str2, String str3, long j, MoneyEntity moneyEntity, MoneyEntity moneyEntity2, MoneyEntity moneyEntity3, MoneyEntity moneyEntity4, ThemedImageUrlEntity themedImageUrlEntity, Type type, State state, Error error, String str4, String str5, String str6, String str7, String str8, String str9, UsedCardInfo usedCardInfo, UsedTokenInfo usedTokenInfo, MoneyEntity moneyEntity5, List list, CommentEntity commentEntity, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, j, moneyEntity, moneyEntity2, moneyEntity3, moneyEntity4, themedImageUrlEntity, type, state, (i & 2048) != 0 ? null : error, (i & 4096) != 0 ? null : str4, str5, (i & 16384) != 0 ? null : str6, (32768 & i) != 0 ? null : str7, (65536 & i) != 0 ? null : str8, (131072 & i) != 0 ? null : str9, (262144 & i) != 0 ? null : usedCardInfo, (524288 & i) != 0 ? null : usedTokenInfo, (1048576 & i) != 0 ? null : moneyEntity5, (2097152 & i) != 0 ? EmptyList.a : list, (i & SelfTester_JCP.ENCRYPT_CBC) != 0 ? null : commentEntity);
    }

    public static /* synthetic */ TransactionEntity copy$default(TransactionEntity transactionEntity, String str, String str2, String str3, long j, MoneyEntity moneyEntity, MoneyEntity moneyEntity2, MoneyEntity moneyEntity3, MoneyEntity moneyEntity4, ThemedImageUrlEntity themedImageUrlEntity, Type type, State state, Error error, String str4, String str5, String str6, String str7, String str8, String str9, UsedCardInfo usedCardInfo, UsedTokenInfo usedTokenInfo, MoneyEntity moneyEntity5, List list, CommentEntity commentEntity, int i, Object obj) {
        CommentEntity commentEntity2;
        List list2;
        String str10 = (i & 1) != 0 ? transactionEntity.id : str;
        String str11 = (i & 2) != 0 ? transactionEntity.title : str2;
        String str12 = (i & 4) != 0 ? transactionEntity.description : str3;
        long j2 = (i & 8) != 0 ? transactionEntity.timestamp : j;
        MoneyEntity moneyEntity6 = (i & 16) != 0 ? transactionEntity.amount : moneyEntity;
        MoneyEntity moneyEntity7 = (i & 32) != 0 ? transactionEntity.secondaryAmount : moneyEntity2;
        MoneyEntity moneyEntity8 = (i & 64) != 0 ? transactionEntity.cashback : moneyEntity3;
        MoneyEntity moneyEntity9 = (i & 128) != 0 ? transactionEntity.plusAmount : moneyEntity4;
        ThemedImageUrlEntity themedImageUrlEntity2 = (i & 256) != 0 ? transactionEntity.imageUrl : themedImageUrlEntity;
        Type type2 = (i & 512) != 0 ? transactionEntity.type : type;
        State state2 = (i & 1024) != 0 ? transactionEntity.state : state;
        Error error2 = (i & 2048) != 0 ? transactionEntity.error : error;
        String str13 = (i & 4096) != 0 ? transactionEntity.statementUrl : str4;
        String str14 = str10;
        String str15 = (i & 8192) != 0 ? transactionEntity.status : str5;
        String str16 = (i & 16384) != 0 ? transactionEntity.category : str6;
        String str17 = (i & 32768) != 0 ? transactionEntity.mccCode : str7;
        String str18 = (i & 65536) != 0 ? transactionEntity.supportUrl : str8;
        String str19 = (i & 131072) != 0 ? transactionEntity.transactionSource : str9;
        UsedCardInfo usedCardInfo2 = (i & 262144) != 0 ? transactionEntity.usedCardInfo : usedCardInfo;
        UsedTokenInfo usedTokenInfo2 = (i & 524288) != 0 ? transactionEntity.usedTokenInfo : usedTokenInfo;
        MoneyEntity moneyEntity10 = (i & 1048576) != 0 ? transactionEntity.fee : moneyEntity5;
        List list3 = (i & 2097152) != 0 ? transactionEntity.additionalFields : list;
        if ((i & SelfTester_JCP.ENCRYPT_CBC) != 0) {
            list2 = list3;
            commentEntity2 = transactionEntity.comment;
        } else {
            commentEntity2 = commentEntity;
            list2 = list3;
        }
        return transactionEntity.copy(str14, str11, str12, j2, moneyEntity6, moneyEntity7, moneyEntity8, moneyEntity9, themedImageUrlEntity2, type2, state2, error2, str13, str15, str16, str17, str18, str19, usedCardInfo2, usedTokenInfo2, moneyEntity10, list2, commentEntity2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    /* renamed from: component11, reason: from getter */
    public final State getState() {
        return this.state;
    }

    /* renamed from: component12, reason: from getter */
    public final Error getError() {
        return this.error;
    }

    /* renamed from: component13, reason: from getter */
    public final String getStatementUrl() {
        return this.statementUrl;
    }

    /* renamed from: component14, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component15, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* renamed from: component16, reason: from getter */
    public final String getMccCode() {
        return this.mccCode;
    }

    /* renamed from: component17, reason: from getter */
    public final String getSupportUrl() {
        return this.supportUrl;
    }

    /* renamed from: component18, reason: from getter */
    public final String getTransactionSource() {
        return this.transactionSource;
    }

    /* renamed from: component19, reason: from getter */
    public final UsedCardInfo getUsedCardInfo() {
        return this.usedCardInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component20, reason: from getter */
    public final UsedTokenInfo getUsedTokenInfo() {
        return this.usedTokenInfo;
    }

    /* renamed from: component21, reason: from getter */
    public final MoneyEntity getFee() {
        return this.fee;
    }

    public final List<AdditionalField> component22() {
        return this.additionalFields;
    }

    /* renamed from: component23, reason: from getter */
    public final CommentEntity getComment() {
        return this.comment;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component5, reason: from getter */
    public final MoneyEntity getAmount() {
        return this.amount;
    }

    /* renamed from: component6, reason: from getter */
    public final MoneyEntity getSecondaryAmount() {
        return this.secondaryAmount;
    }

    /* renamed from: component7, reason: from getter */
    public final MoneyEntity getCashback() {
        return this.cashback;
    }

    /* renamed from: component8, reason: from getter */
    public final MoneyEntity getPlusAmount() {
        return this.plusAmount;
    }

    /* renamed from: component9, reason: from getter */
    public final ThemedImageUrlEntity getImageUrl() {
        return this.imageUrl;
    }

    public final TransactionEntity copy(String id, String title, String description, long timestamp, MoneyEntity amount, MoneyEntity secondaryAmount, MoneyEntity cashback, MoneyEntity plusAmount, ThemedImageUrlEntity imageUrl, Type type, State state, Error error, String statementUrl, String status, String category, String mccCode, String supportUrl, String transactionSource, UsedCardInfo usedCardInfo, UsedTokenInfo usedTokenInfo, MoneyEntity fee, List<AdditionalField> additionalFields, CommentEntity comment) {
        return new TransactionEntity(id, title, description, timestamp, amount, secondaryAmount, cashback, plusAmount, imageUrl, type, state, error, statementUrl, status, category, mccCode, supportUrl, transactionSource, usedCardInfo, usedTokenInfo, fee, additionalFields, comment);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionEntity)) {
            return false;
        }
        TransactionEntity transactionEntity = (TransactionEntity) other;
        return jl40.l(this.id, transactionEntity.id) && jl40.l(this.title, transactionEntity.title) && jl40.l(this.description, transactionEntity.description) && this.timestamp == transactionEntity.timestamp && jl40.l(this.amount, transactionEntity.amount) && jl40.l(this.secondaryAmount, transactionEntity.secondaryAmount) && jl40.l(this.cashback, transactionEntity.cashback) && jl40.l(this.plusAmount, transactionEntity.plusAmount) && jl40.l(this.imageUrl, transactionEntity.imageUrl) && this.type == transactionEntity.type && this.state == transactionEntity.state && jl40.l(this.error, transactionEntity.error) && jl40.l(this.statementUrl, transactionEntity.statementUrl) && jl40.l(this.status, transactionEntity.status) && jl40.l(this.category, transactionEntity.category) && jl40.l(this.mccCode, transactionEntity.mccCode) && jl40.l(this.supportUrl, transactionEntity.supportUrl) && jl40.l(this.transactionSource, transactionEntity.transactionSource) && jl40.l(this.usedCardInfo, transactionEntity.usedCardInfo) && jl40.l(this.usedTokenInfo, transactionEntity.usedTokenInfo) && jl40.l(this.fee, transactionEntity.fee) && jl40.l(this.additionalFields, transactionEntity.additionalFields) && jl40.l(this.comment, transactionEntity.comment);
    }

    public final List<AdditionalField> getAdditionalFields() {
        return this.additionalFields;
    }

    public final MoneyEntity getAmount() {
        return this.amount;
    }

    public final MoneyEntity getCashback() {
        return this.cashback;
    }

    public final String getCategory() {
        return this.category;
    }

    public final CommentEntity getComment() {
        return this.comment;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Error getError() {
        return this.error;
    }

    public final MoneyEntity getFee() {
        return this.fee;
    }

    public final String getId() {
        return this.id;
    }

    public final ThemedImageUrlEntity getImageUrl() {
        return this.imageUrl;
    }

    public final String getMccCode() {
        return this.mccCode;
    }

    public final MoneyEntity getPlusAmount() {
        return this.plusAmount;
    }

    public final MoneyEntity getSecondaryAmount() {
        return this.secondaryAmount;
    }

    public final State getState() {
        return this.state;
    }

    public final String getStatementUrl() {
        return this.statementUrl;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getSupportUrl() {
        return this.supportUrl;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTransactionSource() {
        return this.transactionSource;
    }

    public final Type getType() {
        return this.type;
    }

    public final UsedCardInfo getUsedCardInfo() {
        return this.usedCardInfo;
    }

    public final UsedTokenInfo getUsedTokenInfo() {
        return this.usedTokenInfo;
    }

    public int hashCode() {
        int c = qv10.c(unr0.b(unr0.b(this.id.hashCode() * 31, 31, this.title), 31, this.description), 31, this.timestamp);
        MoneyEntity moneyEntity = this.amount;
        int hashCode = (c + (moneyEntity == null ? 0 : moneyEntity.hashCode())) * 31;
        MoneyEntity moneyEntity2 = this.secondaryAmount;
        int hashCode2 = (hashCode + (moneyEntity2 == null ? 0 : moneyEntity2.hashCode())) * 31;
        MoneyEntity moneyEntity3 = this.cashback;
        int hashCode3 = (hashCode2 + (moneyEntity3 == null ? 0 : moneyEntity3.hashCode())) * 31;
        MoneyEntity moneyEntity4 = this.plusAmount;
        int hashCode4 = (hashCode3 + (moneyEntity4 == null ? 0 : moneyEntity4.hashCode())) * 31;
        ThemedImageUrlEntity themedImageUrlEntity = this.imageUrl;
        int hashCode5 = (this.state.hashCode() + ((this.type.hashCode() + ((hashCode4 + (themedImageUrlEntity == null ? 0 : themedImageUrlEntity.hashCode())) * 31)) * 31)) * 31;
        Error error = this.error;
        int hashCode6 = (hashCode5 + (error == null ? 0 : error.hashCode())) * 31;
        String str = this.statementUrl;
        int b = unr0.b((hashCode6 + (str == null ? 0 : str.hashCode())) * 31, 31, this.status);
        String str2 = this.category;
        int hashCode7 = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mccCode;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.supportUrl;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.transactionSource;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        UsedCardInfo usedCardInfo = this.usedCardInfo;
        int hashCode11 = (hashCode10 + (usedCardInfo == null ? 0 : usedCardInfo.hashCode())) * 31;
        UsedTokenInfo usedTokenInfo = this.usedTokenInfo;
        int hashCode12 = (hashCode11 + (usedTokenInfo == null ? 0 : usedTokenInfo.hashCode())) * 31;
        MoneyEntity moneyEntity5 = this.fee;
        int c2 = unr0.c((hashCode12 + (moneyEntity5 == null ? 0 : moneyEntity5.hashCode())) * 31, 31, this.additionalFields);
        CommentEntity commentEntity = this.comment;
        return c2 + (commentEntity != null ? commentEntity.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.description;
        long j = this.timestamp;
        MoneyEntity moneyEntity = this.amount;
        MoneyEntity moneyEntity2 = this.secondaryAmount;
        MoneyEntity moneyEntity3 = this.cashback;
        MoneyEntity moneyEntity4 = this.plusAmount;
        ThemedImageUrlEntity themedImageUrlEntity = this.imageUrl;
        Type type = this.type;
        State state = this.state;
        Error error = this.error;
        String str4 = this.statementUrl;
        String str5 = this.status;
        String str6 = this.category;
        String str7 = this.mccCode;
        String str8 = this.supportUrl;
        String str9 = this.transactionSource;
        UsedCardInfo usedCardInfo = this.usedCardInfo;
        UsedTokenInfo usedTokenInfo = this.usedTokenInfo;
        MoneyEntity moneyEntity5 = this.fee;
        List<AdditionalField> list = this.additionalFields;
        CommentEntity commentEntity = this.comment;
        StringBuilder v = b64.v("TransactionEntity(id=", str, ", title=", str2, ", description=");
        ly3.y(j, str3, ", timestamp=", v);
        v.append(", amount=");
        v.append(moneyEntity);
        v.append(", secondaryAmount=");
        v.append(moneyEntity2);
        v.append(", cashback=");
        v.append(moneyEntity3);
        v.append(", plusAmount=");
        v.append(moneyEntity4);
        v.append(", imageUrl=");
        v.append(themedImageUrlEntity);
        v.append(", type=");
        v.append(type);
        v.append(", state=");
        v.append(state);
        v.append(", error=");
        v.append(error);
        g8e.D(v, ", statementUrl=", str4, ", status=", str5);
        g8e.D(v, ", category=", str6, ", mccCode=", str7);
        g8e.D(v, ", supportUrl=", str8, ", transactionSource=", str9);
        v.append(", usedCardInfo=");
        v.append(usedCardInfo);
        v.append(", usedTokenInfo=");
        v.append(usedTokenInfo);
        v.append(", fee=");
        v.append(moneyEntity5);
        v.append(", additionalFields=");
        v.append(list);
        v.append(", comment=");
        v.append(commentEntity);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeLong(this.timestamp);
        dest.writeParcelable(this.amount, flags);
        dest.writeParcelable(this.secondaryAmount, flags);
        dest.writeParcelable(this.cashback, flags);
        dest.writeParcelable(this.plusAmount, flags);
        dest.writeParcelable(this.imageUrl, flags);
        this.type.writeToParcel(dest, flags);
        dest.writeString(this.state.name());
        Error error = this.error;
        if (error == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            error.writeToParcel(dest, flags);
        }
        dest.writeString(this.statementUrl);
        dest.writeString(this.status);
        dest.writeString(this.category);
        dest.writeString(this.mccCode);
        dest.writeString(this.supportUrl);
        dest.writeString(this.transactionSource);
        UsedCardInfo usedCardInfo = this.usedCardInfo;
        if (usedCardInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            usedCardInfo.writeToParcel(dest, flags);
        }
        UsedTokenInfo usedTokenInfo = this.usedTokenInfo;
        if (usedTokenInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            usedTokenInfo.writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.fee, flags);
        Iterator t = vfc.t(dest, this.additionalFields);
        while (t.hasNext()) {
            ((AdditionalField) t.next()).writeToParcel(dest, flags);
        }
        CommentEntity commentEntity = this.comment;
        if (commentEntity == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commentEntity.writeToParcel(dest, flags);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J2\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0016¨\u0006%"}, d2 = {"Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$AdditionalField;", "Landroid/os/Parcelable;", "", "name", "value", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "image", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;)Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$AdditionalField;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getValue", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "getImage", "feature-transactions-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AdditionalField implements Parcelable {
        public static final Parcelable.Creator<AdditionalField> CREATOR = new Creator();
        private final ThemedImageUrlEntity image;
        private final String name;
        private final String value;

        public AdditionalField(String str, String str2, ThemedImageUrlEntity themedImageUrlEntity) {
            this.name = str;
            this.value = str2;
            this.image = themedImageUrlEntity;
        }

        public static /* synthetic */ AdditionalField copy$default(AdditionalField additionalField, String str, String str2, ThemedImageUrlEntity themedImageUrlEntity, int i, Object obj) {
            if ((i & 1) != 0) {
                str = additionalField.name;
            }
            if ((i & 2) != 0) {
                str2 = additionalField.value;
            }
            if ((i & 4) != 0) {
                themedImageUrlEntity = additionalField.image;
            }
            return additionalField.copy(str, str2, themedImageUrlEntity);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* renamed from: component3, reason: from getter */
        public final ThemedImageUrlEntity getImage() {
            return this.image;
        }

        public final AdditionalField copy(String name, String value, ThemedImageUrlEntity image) {
            return new AdditionalField(name, value, image);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdditionalField)) {
                return false;
            }
            AdditionalField additionalField = (AdditionalField) other;
            return jl40.l(this.name, additionalField.name) && jl40.l(this.value, additionalField.value) && jl40.l(this.image, additionalField.image);
        }

        public final ThemedImageUrlEntity getImage() {
            return this.image;
        }

        public final String getName() {
            return this.name;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.name;
            int b = unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.value);
            ThemedImageUrlEntity themedImageUrlEntity = this.image;
            return b + (themedImageUrlEntity != null ? themedImageUrlEntity.hashCode() : 0);
        }

        public String toString() {
            String str = this.name;
            String str2 = this.value;
            ThemedImageUrlEntity themedImageUrlEntity = this.image;
            StringBuilder v = b64.v("AdditionalField(name=", str, ", value=", str2, ", image=");
            v.append(themedImageUrlEntity);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.name);
            dest.writeString(this.value);
            dest.writeParcelable(this.image, flags);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AdditionalField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AdditionalField createFromParcel(Parcel parcel) {
                return new AdditionalField(parcel.readString(), parcel.readString(), (ThemedImageUrlEntity) parcel.readParcelable(AdditionalField.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AdditionalField[] newArray(int i) {
                return new AdditionalField[i];
            }
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006\""}, d2 = {"Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$CommentEntity;", "Landroid/os/Parcelable;", "", "text", "Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$CommentThemeEntity;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$CommentThemeEntity;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$CommentThemeEntity;", "copy", "(Ljava/lang/String;Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$CommentThemeEntity;)Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$CommentEntity;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$CommentThemeEntity;", "getTheme", "feature-transactions-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CommentEntity implements Parcelable {
        public static final Parcelable.Creator<CommentEntity> CREATOR = new Creator();
        private final String text;
        private final CommentThemeEntity theme;

        public CommentEntity(String str, CommentThemeEntity commentThemeEntity) {
            this.text = str;
            this.theme = commentThemeEntity;
        }

        public static /* synthetic */ CommentEntity copy$default(CommentEntity commentEntity, String str, CommentThemeEntity commentThemeEntity, int i, Object obj) {
            if ((i & 1) != 0) {
                str = commentEntity.text;
            }
            if ((i & 2) != 0) {
                commentThemeEntity = commentEntity.theme;
            }
            return commentEntity.copy(str, commentThemeEntity);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final CommentThemeEntity getTheme() {
            return this.theme;
        }

        public final CommentEntity copy(String text, CommentThemeEntity theme) {
            return new CommentEntity(text, theme);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CommentEntity)) {
                return false;
            }
            CommentEntity commentEntity = (CommentEntity) other;
            return jl40.l(this.text, commentEntity.text) && jl40.l(this.theme, commentEntity.theme);
        }

        public final String getText() {
            return this.text;
        }

        public final CommentThemeEntity getTheme() {
            return this.theme;
        }

        public int hashCode() {
            return this.theme.hashCode() + (this.text.hashCode() * 31);
        }

        public String toString() {
            return "CommentEntity(text=" + this.text + ", theme=" + this.theme + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.text);
            this.theme.writeToParcel(dest, flags);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CommentEntity> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CommentEntity createFromParcel(Parcel parcel) {
                return new CommentEntity(parcel.readString(), CommentThemeEntity.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CommentEntity[] newArray(int i) {
                return new CommentEntity[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000fJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0011¨\u0006!"}, d2 = {"Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$CommentThemeEntity;", "Landroid/os/Parcelable;", "Lcom/ybsdk/core/utils/ColorModel;", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "titleColor", "<init>", "(Lcom/ybsdk/core/utils/ColorModel;Lcom/ybsdk/core/utils/ColorModel;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/core/utils/ColorModel;", "component2", "copy", "(Lcom/ybsdk/core/utils/ColorModel;Lcom/ybsdk/core/utils/ColorModel;)Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$CommentThemeEntity;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/core/utils/ColorModel;", "getBackgroundColor", "getTitleColor", "feature-transactions-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CommentThemeEntity implements Parcelable {
        public static final Parcelable.Creator<CommentThemeEntity> CREATOR = new Creator();
        private final ColorModel backgroundColor;
        private final ColorModel titleColor;

        public CommentThemeEntity(ColorModel colorModel, ColorModel colorModel2) {
            this.backgroundColor = colorModel;
            this.titleColor = colorModel2;
        }

        public static /* synthetic */ CommentThemeEntity copy$default(CommentThemeEntity commentThemeEntity, ColorModel colorModel, ColorModel colorModel2, int i, Object obj) {
            if ((i & 1) != 0) {
                colorModel = commentThemeEntity.backgroundColor;
            }
            if ((i & 2) != 0) {
                colorModel2 = commentThemeEntity.titleColor;
            }
            return commentThemeEntity.copy(colorModel, colorModel2);
        }

        /* renamed from: component1, reason: from getter */
        public final ColorModel getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component2, reason: from getter */
        public final ColorModel getTitleColor() {
            return this.titleColor;
        }

        public final CommentThemeEntity copy(ColorModel backgroundColor, ColorModel titleColor) {
            return new CommentThemeEntity(backgroundColor, titleColor);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CommentThemeEntity)) {
                return false;
            }
            CommentThemeEntity commentThemeEntity = (CommentThemeEntity) other;
            return jl40.l(this.backgroundColor, commentThemeEntity.backgroundColor) && jl40.l(this.titleColor, commentThemeEntity.titleColor);
        }

        public final ColorModel getBackgroundColor() {
            return this.backgroundColor;
        }

        public final ColorModel getTitleColor() {
            return this.titleColor;
        }

        public int hashCode() {
            return this.titleColor.hashCode() + (this.backgroundColor.hashCode() * 31);
        }

        public String toString() {
            return "CommentThemeEntity(backgroundColor=" + this.backgroundColor + ", titleColor=" + this.titleColor + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.backgroundColor, flags);
            dest.writeParcelable(this.titleColor, flags);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CommentThemeEntity> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CommentThemeEntity createFromParcel(Parcel parcel) {
                return new CommentThemeEntity((ColorModel) parcel.readParcelable(CommentThemeEntity.class.getClassLoader()), (ColorModel) parcel.readParcelable(CommentThemeEntity.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CommentThemeEntity[] newArray(int i) {
                return new CommentThemeEntity[i];
            }
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0010¨\u0006#"}, d2 = {"Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$Error;", "Landroid/os/Parcelable;", "", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "", AuthSdkActivity.RESPONSE_TYPE_CODE, "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;I)Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$Error;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getDescription", CA20Status.STATUS_USER_I, "getCode", "feature-transactions-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Error implements Parcelable {
        public static final Parcelable.Creator<Error> CREATOR = new Creator();
        private final int code;
        private final String description;
        private final String title;

        public Error(String str, String str2, int i) {
            this.title = str;
            this.description = str2;
            this.code = i;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, String str2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = error.title;
            }
            if ((i2 & 2) != 0) {
                str2 = error.description;
            }
            if ((i2 & 4) != 0) {
                i = error.code;
            }
            return error.copy(str, str2, i);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component3, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        public final Error copy(String title, String description, int code) {
            return new Error(title, description, code);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return jl40.l(this.title, error.title) && jl40.l(this.description, error.description) && this.code == error.code;
        }

        public final int getCode() {
            return this.code;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return Integer.hashCode(this.code) + unr0.b(this.title.hashCode() * 31, 31, this.description);
        }

        public String toString() {
            return oyr.m(this.code, Extension.C_BRAKE, b64.v("Error(title=", this.title, ", description=", this.description, ", code="));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.title);
            dest.writeString(this.description);
            dest.writeInt(this.code);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Error> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                return new Error(parcel.readString(), parcel.readString(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i) {
                return new Error[i];
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u001b\b\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0006\u0010\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$Type;", "Landroid/os/Parcelable;", "", "", "icon", "", "isCredit", "<init>", "(Ljava/lang/String;IIZ)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", CA20Status.STATUS_USER_I, "getIcon", "Z", "()Z", "PURCHASE", "TRANSFER_OUT", "CASH_WITHDRAWAL", "REFUND", "TOPUP", "TRANSFER_IN", "feature-transactions-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Type implements Parcelable {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Parcelable.Creator<Type> CREATOR;
        private final int icon;
        private final boolean isCredit;
        public static final Type PURCHASE = new Type("PURCHASE", 0, lyg0.ybsdk_ic_transaction_outcome, false);
        public static final Type TRANSFER_OUT = new Type("TRANSFER_OUT", 1, lyg0.ybsdk_ic_transaction_outcome, false);
        public static final Type CASH_WITHDRAWAL = new Type("CASH_WITHDRAWAL", 2, lyg0.ybsdk_ic_transaction_outcome, false);
        public static final Type REFUND = new Type("REFUND", 3, lyg0.ybsdk_ic_transaction_income, true);
        public static final Type TOPUP = new Type("TOPUP", 4, lyg0.ybsdk_ic_transaction_income, true);
        public static final Type TRANSFER_IN = new Type("TRANSFER_IN", 5, lyg0.ybsdk_ic_transaction_income, true);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{PURCHASE, TRANSFER_OUT, CASH_WITHDRAWAL, REFUND, TOPUP, TRANSFER_IN};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
            CREATOR = new Creator();
        }

        private Type(String str, int i, int i2, boolean z) {
            this.icon = i2;
            this.isCredit = z;
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final int getIcon() {
            return this.icon;
        }

        /* renamed from: isCredit, reason: from getter */
        public final boolean getIsCredit() {
            return this.isCredit;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(name());
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Type> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Type createFromParcel(Parcel parcel) {
                return Type.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Type[] newArray(int i) {
                return new Type[i];
            }
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006\""}, d2 = {"Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$UsedCardInfo;", "Landroid/os/Parcelable;", "", "lastDigits", "Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$PaymentSystem;", "paymentSystem", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$PaymentSystem;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$PaymentSystem;", "copy", "(Ljava/lang/String;Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$PaymentSystem;)Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$UsedCardInfo;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLastDigits", "Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$PaymentSystem;", "getPaymentSystem", "feature-transactions-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UsedCardInfo implements Parcelable {
        public static final Parcelable.Creator<UsedCardInfo> CREATOR = new Creator();
        private final String lastDigits;
        private final PaymentSystem paymentSystem;

        public UsedCardInfo(String str, PaymentSystem paymentSystem) {
            this.lastDigits = str;
            this.paymentSystem = paymentSystem;
        }

        public static /* synthetic */ UsedCardInfo copy$default(UsedCardInfo usedCardInfo, String str, PaymentSystem paymentSystem, int i, Object obj) {
            if ((i & 1) != 0) {
                str = usedCardInfo.lastDigits;
            }
            if ((i & 2) != 0) {
                paymentSystem = usedCardInfo.paymentSystem;
            }
            return usedCardInfo.copy(str, paymentSystem);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLastDigits() {
            return this.lastDigits;
        }

        /* renamed from: component2, reason: from getter */
        public final PaymentSystem getPaymentSystem() {
            return this.paymentSystem;
        }

        public final UsedCardInfo copy(String lastDigits, PaymentSystem paymentSystem) {
            return new UsedCardInfo(lastDigits, paymentSystem);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UsedCardInfo)) {
                return false;
            }
            UsedCardInfo usedCardInfo = (UsedCardInfo) other;
            return jl40.l(this.lastDigits, usedCardInfo.lastDigits) && this.paymentSystem == usedCardInfo.paymentSystem;
        }

        public final String getLastDigits() {
            return this.lastDigits;
        }

        public final PaymentSystem getPaymentSystem() {
            return this.paymentSystem;
        }

        public int hashCode() {
            return this.paymentSystem.hashCode() + (this.lastDigits.hashCode() * 31);
        }

        public String toString() {
            return "UsedCardInfo(lastDigits=" + this.lastDigits + ", paymentSystem=" + this.paymentSystem + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.lastDigits);
            dest.writeString(this.paymentSystem.name());
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<UsedCardInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UsedCardInfo createFromParcel(Parcel parcel) {
                return new UsedCardInfo(parcel.readString(), PaymentSystem.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UsedCardInfo[] newArray(int i) {
                return new UsedCardInfo[i];
            }
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006\""}, d2 = {"Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$UsedTokenInfo;", "Landroid/os/Parcelable;", "", "lastDigits", "Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$TokenProvider;", "tokenProvider", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$TokenProvider;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$TokenProvider;", "copy", "(Ljava/lang/String;Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$TokenProvider;)Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$UsedTokenInfo;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLastDigits", "Lcom/ybsdk/feature/transactions/api/entities/TransactionEntity$TokenProvider;", "getTokenProvider", "feature-transactions-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UsedTokenInfo implements Parcelable {
        public static final Parcelable.Creator<UsedTokenInfo> CREATOR = new Creator();
        private final String lastDigits;
        private final TokenProvider tokenProvider;

        public UsedTokenInfo(String str, TokenProvider tokenProvider) {
            this.lastDigits = str;
            this.tokenProvider = tokenProvider;
        }

        public static /* synthetic */ UsedTokenInfo copy$default(UsedTokenInfo usedTokenInfo, String str, TokenProvider tokenProvider, int i, Object obj) {
            if ((i & 1) != 0) {
                str = usedTokenInfo.lastDigits;
            }
            if ((i & 2) != 0) {
                tokenProvider = usedTokenInfo.tokenProvider;
            }
            return usedTokenInfo.copy(str, tokenProvider);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLastDigits() {
            return this.lastDigits;
        }

        /* renamed from: component2, reason: from getter */
        public final TokenProvider getTokenProvider() {
            return this.tokenProvider;
        }

        public final UsedTokenInfo copy(String lastDigits, TokenProvider tokenProvider) {
            return new UsedTokenInfo(lastDigits, tokenProvider);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UsedTokenInfo)) {
                return false;
            }
            UsedTokenInfo usedTokenInfo = (UsedTokenInfo) other;
            return jl40.l(this.lastDigits, usedTokenInfo.lastDigits) && this.tokenProvider == usedTokenInfo.tokenProvider;
        }

        public final String getLastDigits() {
            return this.lastDigits;
        }

        public final TokenProvider getTokenProvider() {
            return this.tokenProvider;
        }

        public int hashCode() {
            return this.tokenProvider.hashCode() + (this.lastDigits.hashCode() * 31);
        }

        public String toString() {
            return "UsedTokenInfo(lastDigits=" + this.lastDigits + ", tokenProvider=" + this.tokenProvider + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.lastDigits);
            dest.writeString(this.tokenProvider.name());
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<UsedTokenInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UsedTokenInfo createFromParcel(Parcel parcel) {
                return new UsedTokenInfo(parcel.readString(), TokenProvider.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UsedTokenInfo[] newArray(int i) {
                return new UsedTokenInfo[i];
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TransactionEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionEntity createFromParcel(Parcel parcel) {
            UsedCardInfo usedCardInfo;
            UsedTokenInfo createFromParcel;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            long readLong = parcel.readLong();
            MoneyEntity moneyEntity = (MoneyEntity) parcel.readParcelable(TransactionEntity.class.getClassLoader());
            MoneyEntity moneyEntity2 = (MoneyEntity) parcel.readParcelable(TransactionEntity.class.getClassLoader());
            MoneyEntity moneyEntity3 = (MoneyEntity) parcel.readParcelable(TransactionEntity.class.getClassLoader());
            MoneyEntity moneyEntity4 = (MoneyEntity) parcel.readParcelable(TransactionEntity.class.getClassLoader());
            ThemedImageUrlEntity themedImageUrlEntity = (ThemedImageUrlEntity) parcel.readParcelable(TransactionEntity.class.getClassLoader());
            Type createFromParcel2 = Type.CREATOR.createFromParcel(parcel);
            State valueOf = State.valueOf(parcel.readString());
            Error createFromParcel3 = parcel.readInt() == 0 ? null : Error.CREATOR.createFromParcel(parcel);
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            UsedCardInfo createFromParcel4 = parcel.readInt() == 0 ? null : UsedCardInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                usedCardInfo = createFromParcel4;
                createFromParcel = null;
            } else {
                usedCardInfo = createFromParcel4;
                createFromParcel = UsedTokenInfo.CREATOR.createFromParcel(parcel);
            }
            UsedTokenInfo usedTokenInfo = createFromParcel;
            MoneyEntity moneyEntity5 = (MoneyEntity) parcel.readParcelable(TransactionEntity.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = oo31.d(AdditionalField.CREATOR, parcel, arrayList, i, 1);
                readInt = readInt;
                readLong = readLong;
            }
            return new TransactionEntity(readString, readString2, readString3, readLong, moneyEntity, moneyEntity2, moneyEntity3, moneyEntity4, themedImageUrlEntity, createFromParcel2, valueOf, createFromParcel3, readString4, readString5, readString6, readString7, readString8, readString9, usedCardInfo, usedTokenInfo, moneyEntity5, arrayList, parcel.readInt() == 0 ? null : CommentEntity.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionEntity[] newArray(int i) {
            return new TransactionEntity[i];
        }
    }

    public TransactionEntity(String str, String str2, String str3, long j, MoneyEntity moneyEntity, MoneyEntity moneyEntity2, MoneyEntity moneyEntity3, MoneyEntity moneyEntity4, ThemedImageUrlEntity themedImageUrlEntity, Type type, State state, Error error, String str4, String str5, String str6, String str7, String str8, String str9, UsedCardInfo usedCardInfo, UsedTokenInfo usedTokenInfo, MoneyEntity moneyEntity5, List<AdditionalField> list, CommentEntity commentEntity) {
        this.id = str;
        this.title = str2;
        this.description = str3;
        this.timestamp = j;
        this.amount = moneyEntity;
        this.secondaryAmount = moneyEntity2;
        this.cashback = moneyEntity3;
        this.plusAmount = moneyEntity4;
        this.imageUrl = themedImageUrlEntity;
        this.type = type;
        this.state = state;
        this.error = error;
        this.statementUrl = str4;
        this.status = str5;
        this.category = str6;
        this.mccCode = str7;
        this.supportUrl = str8;
        this.transactionSource = str9;
        this.usedCardInfo = usedCardInfo;
        this.usedTokenInfo = usedTokenInfo;
        this.fee = moneyEntity5;
        this.additionalFields = list;
        this.comment = commentEntity;
    }
}
