package xsna;

import androidx.room.RoomDatabase;
import java.util.Collection;
import java.util.concurrent.Callable;

/* compiled from: PushTokenDao_Impl.java */
/* loaded from: classes5.dex */
public final class gle0 implements Callable<Integer> {
    public final /* synthetic */ Collection b;
    public final /* synthetic */ ple0 c;

    public gle0(ple0 ple0Var, Collection collection) {
        this.c = ple0Var;
        this.b = collection;
    }

    @Override // java.util.concurrent.Callable
    public final Integer call() throws Exception {
        StringBuilder e = fw3.e("DELETE FROM push_token WHERE token in (");
        Collection<String> collection = this.b;
        e370.c(collection.size(), e);
        e.append(")");
        String sb = e.toString();
        RoomDatabase roomDatabase = this.c.a;
        roomDatabase.a();
        roomDatabase.b();
        zin0 compileStatement = roomDatabase.i().getWritableDatabase().compileStatement(sb);
        int i = 1;
        for (String str : collection) {
            if (str == null) {
                compileStatement.bindNull(i);
            } else {
                compileStatement.bindString(i, str);
            }
            i++;
        }
        roomDatabase.c();
        try {
            Integer valueOf = Integer.valueOf(compileStatement.executeUpdateDelete());
            roomDatabase.w();
            return valueOf;
        } finally {
            roomDatabase.q();
        }
    }
}
