package defpackage;

import com.yandex.go.flex.main_screen.shared_data.SuperAppGrid;
import kotlin.Result;
import kotlinx.serialization.json.b;

/* loaded from: classes.dex */
public final class a0w0 extends fnr0 {
    public final String a;
    public final String b;

    public a0w0() {
        super(0);
        this.a = "SuperAppGridParser";
        this.b = "superapp_grid";
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
        try {
            sbxVar.getClass();
            failure = (SuperAppGrid) sbxVar.a(SuperAppGrid.Companion.serializer(), bVar);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            xby.t(jst.e, this.a, a, null, 10);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (SuperAppGrid) failure;
    }
}
