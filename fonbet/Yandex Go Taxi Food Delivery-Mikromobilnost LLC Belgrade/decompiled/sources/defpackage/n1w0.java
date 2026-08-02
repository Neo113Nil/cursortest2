package defpackage;

import com.yandex.go.flex.main_screen.shared_data.SuperAppMainScreenFeatures;
import kotlin.Result;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.b;

/* loaded from: classes.dex */
public final class n1w0 extends fnr0 {
    public final String a;
    public final String b;

    public n1w0() {
        super(0);
        this.a = "SuperAppMainScreenFeaturesParser";
        this.b = "__document_features";
    }

    @Override // defpackage.fnr0
    public final String getJsonKey() {
        return this.b;
    }

    @Override // defpackage.fnr0
    public final String getSharedDataParserType() {
        return this.a;
    }

    @Override // defpackage.fnr0
    public final bnr0 tryParse(sbx sbxVar, b bVar) {
        Object failure;
        if (bVar instanceof JsonNull) {
            return null;
        }
        try {
            sbxVar.getClass();
            failure = (SuperAppMainScreenFeatures) sbxVar.a(SuperAppMainScreenFeatures.Companion.serializer(), bVar);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            xby.t(jst.e, this.a, a, null, 10);
        }
        return (SuperAppMainScreenFeatures) (failure instanceof Result.Failure ? null : failure);
    }
}
