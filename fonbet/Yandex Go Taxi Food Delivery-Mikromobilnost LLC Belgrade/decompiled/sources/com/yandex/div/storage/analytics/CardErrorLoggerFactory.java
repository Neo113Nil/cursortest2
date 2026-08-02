package com.yandex.div.storage.analytics;

import com.yandex.div.storage.templates.TemplatesContainer;
import com.yandex.div.storage.util.CardErrorTransformer;
import defpackage.d7y;
import defpackage.eg90;
import defpackage.kju0;
import defpackage.sls;
import defpackage.uey0;
import defpackage.yvf0;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0010\u0018\u00002\u00020\u0001B)\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ1\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/yandex/div/storage/analytics/CardErrorLoggerFactory;", "", "Lyvf0;", "Lcom/yandex/div/storage/util/CardErrorTransformer;", "externalErrorTransformer", "Lcom/yandex/div/storage/templates/TemplatesContainer;", "templateContainer", "Leg90;", "parsingErrorLogger", "<init>", "(Lyvf0;Lcom/yandex/div/storage/templates/TemplatesContainer;Leg90;)V", "origin", "", "cardId", "groupId", "Lorg/json/JSONObject;", kju0.j, "d", "(Leg90;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Leg90;", "a", "Lcom/yandex/div/storage/templates/TemplatesContainer;", "b", "Leg90;", "c", "Lyvf0;", "errorTransformer", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public class CardErrorLoggerFactory {

    /* renamed from: a, reason: from kotlin metadata */
    private final TemplatesContainer templateContainer;

    /* renamed from: b, reason: from kotlin metadata */
    private final eg90 parsingErrorLogger;

    /* renamed from: c, reason: from kotlin metadata */
    private final yvf0 errorTransformer;

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\n\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/yandex/div/storage/analytics/CardErrorLoggerFactory$a", "Leg90;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "Lzy11;", "a", "(Ljava/lang/Exception;)V", "", "templateId", "b", "(Ljava/lang/Exception;Ljava/lang/String;)V", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements eg90 {
        final /* synthetic */ String c;
        final /* synthetic */ String d;
        final /* synthetic */ JSONObject e;
        final /* synthetic */ CardErrorLoggerFactory f;
        final /* synthetic */ eg90 g;

        public a(String str, String str2, JSONObject jSONObject, CardErrorLoggerFactory cardErrorLoggerFactory, eg90 eg90Var) {
            this.c = str;
            this.d = str2;
            this.e = jSONObject;
            this.f = cardErrorLoggerFactory;
            this.g = eg90Var;
        }

        @Override // defpackage.eg90
        public final void a(Exception e) {
            CardErrorTransformer.CardDetailedErrorException cardDetailedErrorException = new CardErrorTransformer.CardDetailedErrorException(this.c, e.getMessage(), e, null, null, this.d, this.e, 24, null);
            if (((CardErrorTransformer) this.f.errorTransformer.get()).a(cardDetailedErrorException)) {
                return;
            }
            this.g.a(cardDetailedErrorException);
        }

        @Override // defpackage.eg90
        public final void b(Exception e, String templateId) {
            CardErrorTransformer.CardDetailedErrorException cardDetailedErrorException = new CardErrorTransformer.CardDetailedErrorException(this.c, e.getMessage(), e, templateId, null, this.d, this.e, 16, null);
            if (((CardErrorTransformer) this.f.errorTransformer.get()).a(cardDetailedErrorException)) {
                return;
            }
            this.g.b(cardDetailedErrorException, templateId);
        }
    }

    public CardErrorLoggerFactory(final yvf0 yvf0Var, TemplatesContainer templatesContainer, eg90 eg90Var) {
        this.templateContainer = templatesContainer;
        this.parsingErrorLogger = eg90Var;
        this.errorTransformer = new d7y(new sls() { // from class: com.yandex.div.storage.analytics.CardErrorLoggerFactory$errorTransformer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.sls
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CardErrorTransformer invoke() {
                TemplatesContainer templatesContainer2;
                eg90 eg90Var2;
                TemplatesContainer templatesContainer3;
                eg90 eg90Var3;
                yvf0 yvf0Var2 = yvf0.this;
                if (yvf0Var2 == null) {
                    templatesContainer3 = this.templateContainer;
                    eg90Var3 = this.parsingErrorLogger;
                    return new uey0(templatesContainer3, eg90Var3);
                }
                templatesContainer2 = this.templateContainer;
                eg90Var2 = this.parsingErrorLogger;
                return new CardErrorTransformer.a(yvf0Var2.get(), new uey0(templatesContainer2, eg90Var2));
            }
        });
    }

    public final eg90 d(eg90 origin, String cardId, String groupId, JSONObject metadata) {
        return new a(cardId, groupId, metadata, this, origin);
    }
}
