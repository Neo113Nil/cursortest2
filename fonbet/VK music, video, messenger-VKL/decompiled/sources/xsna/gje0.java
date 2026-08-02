package xsna;

import android.content.Context;
import androidx.room.RoomDatabase;
import com.vk.core.preference.Preference;
import java.util.concurrent.Callable;

/* compiled from: PushMessageDao_Impl.java */
/* loaded from: classes5.dex */
public final class gje0 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gje0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                kje0 kje0Var = (kje0) this.c;
                oje0 oje0Var = kje0Var.d;
                zin0 a = oje0Var.a();
                RoomDatabase roomDatabase = kje0Var.a;
                roomDatabase.c();
                try {
                    a.executeUpdateDelete();
                    roomDatabase.w();
                    return s3q0.a;
                } finally {
                    roomDatabase.q();
                    oje0Var.d(a);
                }
            default:
                return Preference.h((Context) this.c, 0, "google_sdk_flags");
        }
    }
}
