package xsna;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Parcelable;
import com.vk.appredirects.entity.App;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class h83 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Parcelable e;

    public /* synthetic */ h83(int i, Parcelable parcelable, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = parcelable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        e83 e83Var;
        switch (this.b) {
            case 0:
                Context context = (Context) this.c;
                App app2 = (App) this.d;
                Intent intent = (Intent) this.e;
                try {
                    Cursor query = context.getContentResolver().query(Uri.parse("content://" + app2.i() + "/deeplinks"), null, intent.toUri(0), null, null);
                    if (query != null) {
                        try {
                            if (!query.isAfterLast()) {
                                query.moveToFirst();
                                boolean z = true;
                                boolean z2 = query.getInt(query.getColumnIndex("can_handle")) == 1;
                                boolean z3 = query.getInt(query.getColumnIndex("is_priority_handler")) == 1;
                                int columnIndex = query.getColumnIndex("is_override_handler");
                                if (columnIndex == -1 || query.getInt(columnIndex) != 1) {
                                    z = false;
                                }
                                e83Var = new e83(z2, z3, z);
                                ro.e(query, null);
                                return e83Var;
                            }
                        } finally {
                        }
                    }
                    e83Var = new e83(false, false, false);
                    ro.e(query, null);
                    return e83Var;
                } catch (Exception e) {
                    L.l("AppRedirectResolver", "Exception while querying " + app2.i() + " - " + e.getMessage());
                    return new e83(false, false, false);
                }
            default:
                return ((vh40) this.c).c.e((UserId) this.d, (UserId) this.e);
        }
    }
}
