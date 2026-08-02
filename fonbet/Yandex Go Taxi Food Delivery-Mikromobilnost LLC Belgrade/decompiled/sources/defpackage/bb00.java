package defpackage;

import com.yandex.go.flex.main_screen.shared_data.MainScreenResolvedPosition;
import kotlin.Result;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.b;

/* loaded from: classes.dex */
public final class bb00 extends fnr0 {
    public final String a;
    public final String b;

    public bb00() {
        super(0);
        this.a = "_resolved_position";
        this.b = "MainScreenPositionParser";
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
            failure = (MainScreenResolvedPosition) sbxVar.a(MainScreenResolvedPosition.Companion.serializer(), bVar);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            xby.t(jst.e, this.b, a, null, 10);
        }
        return (MainScreenResolvedPosition) (failure instanceof Result.Failure ? null : failure);
    }
}
