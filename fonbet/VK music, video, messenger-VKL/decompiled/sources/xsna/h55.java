package xsna;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import com.huawei.hms.health.aacl;
import com.huawei.hms.hihealth.data.HealthKitApiInvoker;
import com.vk.dto.common.id.UserId;
import java.util.List;
import java.util.concurrent.Callable;
import xsna.c2r0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class h55 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h55(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        List aaba;
        switch (this.b) {
            case 0:
                c2r0 c2r0Var = (c2r0) this.c;
                Context context = (Context) this.d;
                c2r0.b bVar = (c2r0.b) this.e;
                c2r0Var.k(context, bVar);
                return bVar;
            case 1:
                bfc0 bfc0Var = (bfc0) this.c;
                lec0 lec0Var = (lec0) this.d;
                UserId userId = (UserId) this.e;
                bfc0Var.getClass();
                ContentValues b = bfc0.b(lec0Var);
                b.put("uid", Long.valueOf(userId.b));
                return Long.valueOf(((SQLiteOpenHelper) bfc0Var.a.getValue()).getWritableDatabase().insertOrThrow("draft", null, b));
            default:
                aaba = ((aacl) this.c).aaba((List) this.d, (HealthKitApiInvoker) this.e);
                return aaba;
        }
    }
}
