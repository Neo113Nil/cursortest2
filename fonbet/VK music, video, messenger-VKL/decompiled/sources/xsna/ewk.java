package xsna;

import android.database.sqlite.SQLiteDatabase;
import com.huawei.hms.health.aacl;
import com.huawei.hms.hihealth.data.HealthKitApiInvoker;
import com.huawei.hms.hihealth.options.UpdateOptions;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.superapp.multiaccount.api.SessionUnavailableType;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ewk implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ewk(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Void aab;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                SQLiteDatabase writableDatabase = ((fwk) obj2).getWritableDatabase();
                StringBuilder sb = new StringBuilder("uid=");
                sb.append((String) obj);
                return Boolean.valueOf(writableDatabase.delete("app_persistent_state_cache", sb.toString(), null) > 0);
            case 1:
                UserId userId = (UserId) obj;
                if (((SessionUnavailableType) obj2) == SessionUnavailableType.VALIDATION_REQUIRED) {
                    r55 r55Var = r55.a;
                    r1 = ((yui) r55.j()).b(dgn0.d(), userId);
                }
                return Boolean.valueOf(r1);
            case 2:
                fil0 fil0Var = (fil0) obj2;
                return (xpp) fil0Var.a.J0(fil0Var, new qpm((DialogsFilter) obj, Source.CACHE, 12)).await();
            default:
                aab = aacl.aab((HealthKitApiInvoker) obj2, (UpdateOptions) obj);
                return aab;
        }
    }
}
