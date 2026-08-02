package xsna;

import android.content.Context;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import com.vk.auth.api.models.AuthResult;
import xsna.tin0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class lx1 implements cb8, io.reactivex.rxjava3.functions.l, tin0.c {
    public final /* synthetic */ Object b;

    public /* synthetic */ lx1(Object obj) {
        this.b = obj;
    }

    @Override // xsna.cb8
    public void a(b5k b5kVar) {
        ox1 ox1Var = (ox1) this.b;
        synchronized (ox1Var) {
            try {
                if (ox1Var.b instanceof f0n) {
                    ox1Var.c.add(b5kVar);
                }
                ox1Var.b.a(b5kVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return (AuthResult) ((n45) this.b).invoke(obj);
    }

    @Override // xsna.tin0.c
    public tin0 create(tin0.b bVar) {
        Context context = (Context) this.b;
        String str = bVar.b;
        tin0.a aVar = bVar.c;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new FrameworkSQLiteOpenHelper(context, str, aVar, true, true);
    }
}
