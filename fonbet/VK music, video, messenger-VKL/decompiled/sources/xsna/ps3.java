package xsna;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import com.vk.superapp.bridges.LogoutReason;
import com.vk.superapp.multiaccount.api.f;
import kotlin.Pair;
import xsna.egn0;
import xsna.i340;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class ps3 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ps3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        SharedPreferences sharedPreferences;
        switch (this.b) {
            case 0:
                break;
            case 1:
                i340 i340Var = (i340) this.c;
                i340.e eVar = (i340.e) ((Pair) obj).g();
                mui0 mui0Var = i340Var.a;
                for (f.c cVar : eVar.b()) {
                    if (cVar instanceof f.c.a) {
                        f.c.a aVar = (f.c.a) cVar;
                        if (!epx.f(aVar.a().c(), mui0Var.a())) {
                            wdx0 wdx0Var = e370.f;
                            egn0.a.a(wdx0Var != null ? wdx0Var : null, LogoutReason.USER_BANNED, aVar.a().c(), 4);
                        }
                    }
                    if (cVar instanceof f.c.b) {
                        f.c.b bVar = (f.c.b) cVar;
                        if (!epx.f(bVar.a().c(), mui0Var.a())) {
                            wdx0 wdx0Var2 = e370.f;
                            egn0.a.a(wdx0Var2 != null ? wdx0Var2 : null, LogoutReason.USER_DEACTIVATED, bVar.a().c(), 4);
                        }
                    }
                }
                break;
            case 2:
                io.reactivex.rxjava3.core.r rVar = (io.reactivex.rxjava3.core.r) this.c;
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                if (!rVar.h()) {
                    rVar.onNext(bool);
                }
                break;
            default:
                oqo0 oqo0Var = (oqo0) this.c;
                if (bl20.a.contains("max_threads_count_event_key")) {
                    String str = "";
                    if (!TextUtils.isEmpty("max_threads_count_event_key") && (sharedPreferences = bl20.a) != null) {
                        str = sharedPreferences.getString("max_threads_count_event_key", "");
                    }
                    SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem = (SchemeStat$TypeDevNullItem) oqo0Var.c.fromJson(str, SchemeStat$TypeDevNullItem.class);
                    l5m l5mVar = new l5m(null, null, 3);
                    l5mVar.g = schemeStat$TypeDevNullItem;
                    l5mVar.q();
                }
                break;
        }
        return s3q0.a;
    }
}
