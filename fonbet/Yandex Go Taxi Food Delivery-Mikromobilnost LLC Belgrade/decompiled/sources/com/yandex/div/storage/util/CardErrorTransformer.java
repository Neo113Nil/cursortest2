package com.yandex.div.storage.util;

import defpackage.kju0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002\u0007\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/storage/util/CardErrorTransformer;", "", "Lcom/yandex/div/storage/util/CardErrorTransformer$CardDetailedErrorException;", "cardError", "", "a", "(Lcom/yandex/div/storage/util/CardErrorTransformer$CardDetailedErrorException;)Z", "CardDetailedErrorException", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface CardErrorTransformer {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0002\"\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/div/storage/util/CardErrorTransformer$a;", "Lcom/yandex/div/storage/util/CardErrorTransformer;", "", "transformers", "<init>", "([Lcom/yandex/div/storage/util/CardErrorTransformer;)V", "Lcom/yandex/div/storage/util/CardErrorTransformer$CardDetailedErrorException;", "cardError", "", "a", "(Lcom/yandex/div/storage/util/CardErrorTransformer$CardDetailedErrorException;)Z", "[Lcom/yandex/div/storage/util/CardErrorTransformer;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements CardErrorTransformer {

        /* renamed from: a, reason: from kotlin metadata */
        private final CardErrorTransformer[] transformers;

        public a(CardErrorTransformer... cardErrorTransformerArr) {
            this.transformers = cardErrorTransformerArr;
        }

        @Override // com.yandex.div.storage.util.CardErrorTransformer
        public final boolean a(CardDetailedErrorException cardError) {
            for (CardErrorTransformer cardErrorTransformer : this.transformers) {
                if (cardErrorTransformer.a(cardError)) {
                    return true;
                }
            }
            return false;
        }
    }

    boolean a(CardDetailedErrorException cardError);

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00060\u0001j\u0002`\u0002BY\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/yandex/div/storage/util/CardErrorTransformer$CardDetailedErrorException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "cardId", Constants.KEY_MESSAGE, "", "cause", "templateId", "", "details", "groupId", "Lorg/json/JSONObject;", kju0.j, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lorg/json/JSONObject;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "g", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "c", "Lorg/json/JSONObject;", "f", "()Lorg/json/JSONObject;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CardDetailedErrorException extends Exception {
        private final String cardId;
        private final Map<String, String> details;
        private final String groupId;
        private final JSONObject metadata;
        private final String templateId;

        public /* synthetic */ CardDetailedErrorException(String str, String str2, Throwable th, String str3, Map map, String str4, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : th, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? b.f() : map, str4, jSONObject);
        }

        /* renamed from: a, reason: from getter */
        public final String getCardId() {
            return this.cardId;
        }

        public final Map<String, String> b() {
            return this.details;
        }

        /* renamed from: c, reason: from getter */
        public final String getGroupId() {
            return this.groupId;
        }

        /* renamed from: f, reason: from getter */
        public final JSONObject getMetadata() {
            return this.metadata;
        }

        /* renamed from: g, reason: from getter */
        public final String getTemplateId() {
            return this.templateId;
        }

        public CardDetailedErrorException(String str, String str2, Throwable th, String str3, Map<String, String> map, String str4, JSONObject jSONObject) {
            super(str2, th);
            this.cardId = str;
            this.templateId = str3;
            this.details = map;
            this.groupId = str4;
            this.metadata = jSONObject;
        }
    }
}
