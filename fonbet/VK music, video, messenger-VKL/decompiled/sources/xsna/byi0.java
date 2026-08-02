package xsna;

import io.requery.android.database.sqlite.SQLiteStatementType;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.ok.android.api.json.JsonToken;

/* compiled from: SessionsSettings.kt */
@b6l(c = "com.google.firebase.sessions.settings.SessionsSettings", f = "SessionsSettings.kt", l = {JsonToken.BOOLEAN, SQLiteStatementType.STATEMENT_OTHER}, m = "updateSettings")
/* loaded from: classes.dex */
public final class byi0 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ cyi0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public byi0(cyi0 cyi0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cyi0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(this);
    }
}
