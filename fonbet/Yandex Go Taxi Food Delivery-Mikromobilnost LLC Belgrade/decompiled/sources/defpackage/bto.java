package defpackage;

import android.content.Context;
import com.yandex.go.explorer.impl.data.database.ExplorerDatabase;

/* loaded from: classes15.dex */
public interface bto {
    static ExplorerDatabase a(Context context) {
        return (ExplorerDatabase) dai0.l(context.getApplicationContext(), ExplorerDatabase.class, "explorer.db").b();
    }

    static zto b(Context context) {
        return new zto(context.getApplicationContext());
    }

    static kto c(ExplorerDatabase explorerDatabase) {
        return explorerDatabase.S0();
    }

    static xuo d(Context context) {
        return new xuo(context.getApplicationContext());
    }
}
