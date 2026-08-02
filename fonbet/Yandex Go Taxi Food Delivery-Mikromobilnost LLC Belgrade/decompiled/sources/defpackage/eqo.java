package defpackage;

import com.yandex.go.flex.main_screen.shared_data.ExpectedDestinations;
import kotlin.Result;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.b;

/* loaded from: classes.dex */
public final class eqo extends fnr0 {
    public final String a;
    public final String b;

    public eqo() {
        super(0);
        this.a = "_expected_destinations";
        this.b = "ExpectedDestinationsParser";
    }

    @Override // defpackage.fnr0
    public final String getJsonKey() {
        return this.a;
    }

    @Override // defpackage.fnr0
    public final String getSharedDataParserType() {
        return this.b;
    }

    @Override // defpackage.fnr0
    public final bnr0 tryParse(sbx sbxVar, b bVar) {
        Object failure;
        if (bVar instanceof JsonNull) {
            return null;
        }
        try {
            sbxVar.getClass();
            failure = (ExpectedDestinations) sbxVar.a(ExpectedDestinations.Companion.serializer(), bVar);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            xby.t(jst.e, this.b, a, null, 10);
        }
        return (ExpectedDestinations) (failure instanceof Result.Failure ? null : failure);
    }
}
