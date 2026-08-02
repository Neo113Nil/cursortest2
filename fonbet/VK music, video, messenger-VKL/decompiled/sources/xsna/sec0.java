package xsna;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.concurrent.Callable;

/* compiled from: PostingDraftInteractor.kt */
/* loaded from: classes4.dex */
public final class sec0 {
    public static final bfc0 a;

    static {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        a = new bfc0(context);
    }

    public static void a(final long j) {
        final bfc0 bfc0Var = a;
        bfc0Var.getClass();
        io.reactivex.rxjava3.internal.operators.single.l h = new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.xec0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                SQLiteDatabase writableDatabase = ((SQLiteOpenHelper) bfc0.this.a.getValue()).getWritableDatabase();
                return Boolean.valueOf((writableDatabase != null ? writableDatabase.delete("draft", "draft_id = ?", new String[]{String.valueOf(j)}) : 0) > 0);
            }
        }).m(io.reactivex.rxjava3.android.schedulers.a.b()).q(asu0.a.c()), new wx00(new ha40(7), 12)).h(new uk40(new pqz(15), 11));
        int i = kwg0.a;
        h.subscribe(new iwg0(), new iwg0());
    }
}
