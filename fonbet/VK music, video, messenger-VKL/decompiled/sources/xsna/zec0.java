package xsna;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.huawei.hms.health.aacl;
import com.huawei.hms.hihealth.data.HealthKitApiInvoker;
import com.huawei.hms.hihealth.data.SampleSet;
import com.vk.dto.common.id.UserId;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class zec0 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zec0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Void aab;
        switch (this.b) {
            case 0:
                bfc0 bfc0Var = (bfc0) this.c;
                lec0 lec0Var = (lec0) this.d;
                bfc0Var.getClass();
                ContentValues b = bfc0.b(lec0Var);
                long j = lec0Var.a;
                SQLiteDatabase writableDatabase = ((SQLiteOpenHelper) bfc0Var.a.getValue()).getWritableDatabase();
                if (!((writableDatabase != null ? writableDatabase.update("draft", b, "draft_id = ?", new String[]{String.valueOf(j)}) : 0) > 0)) {
                    j = 0;
                }
                return Long.valueOf(j);
            case 1:
                ((vvn0) this.c).a.g((UserId) this.d);
                return s3q0.a;
            default:
                aab = aacl.aab((HealthKitApiInvoker) this.c, (SampleSet) this.d);
                return aab;
        }
    }
}
