package xsna;

import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.repository.internal.repos.stickers.database.StickersDatabase;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import xsna.kbl0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class zge implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zge(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                HashMap<UserId, StickersDatabase> hashMap = StickersDatabase.m;
                s2q z = StickersDatabase.a.b().z();
                HashMap<UserId, kbl0> hashMap2 = kbl0.b;
                z.d(new i9l0((int) Preference.m(0L, kbl0.a.b().a, "stickers_last_config_version"), (List) obj));
                break;
            default:
                ((dun0) obj).b.a();
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ zge(List list, m9l0 m9l0Var) {
        this.b = 2;
        this.c = list;
    }
}
