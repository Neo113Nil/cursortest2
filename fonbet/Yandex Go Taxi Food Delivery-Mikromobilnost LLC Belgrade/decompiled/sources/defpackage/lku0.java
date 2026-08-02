package defpackage;

import android.content.Context;
import androidx.room.j;
import ru.yandex.taxi.experiments.storage.StoredExperimentsDatabase;

/* loaded from: classes9.dex */
public final class lku0 {
    public final StoredExperimentsDatabase a;

    public lku0(Context context) {
        j l = dai0.l(context, StoredExperimentsDatabase.class, "stored_experiments.db");
        l.p = false;
        l.q = true;
        l.r = true;
        this.a = (StoredExperimentsDatabase) l.b();
    }
}
