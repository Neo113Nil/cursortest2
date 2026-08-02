package com.yandex.div.storage.util;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: CardErrorTransformer.kt */
/* loaded from: classes7.dex */
public interface CardErrorTransformer {

    /* compiled from: CardErrorTransformer.kt */
    public static final class CardDetailedErrorException extends Exception {
        private final String cardId;
        private final Map<String, String> details;
        private final String groupId;
        private final JSONObject metadata;
        private final String templateId;
    }

    /* compiled from: CardErrorTransformer.kt */
    public static final class Composite implements CardErrorTransformer {
        private final CardErrorTransformer[] transformers;

        public Composite(CardErrorTransformer... cardErrorTransformerArr) {
            this.transformers = cardErrorTransformerArr;
        }
    }
}
