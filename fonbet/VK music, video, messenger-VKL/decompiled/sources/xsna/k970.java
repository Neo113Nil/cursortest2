package xsna;

import android.content.Context;
import com.vk.dto.notifications.NotificationAction;
import com.vk.dto.notifications.NotificationItem;
import org.json.JSONObject;
import ru.ok.android.api.core.ApiUris;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class k970 implements gzs {
    public final /* synthetic */ NotificationAction b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ NotificationItem d;
    public final /* synthetic */ bj70 e;

    public /* synthetic */ k970(Context context, NotificationAction notificationAction, NotificationItem notificationItem, bj70 bj70Var) {
        this.b = notificationAction;
        this.c = context;
        this.d = notificationItem;
        this.e = bj70Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        JSONObject jSONObject = this.b.d;
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("query");
        String optString2 = jSONObject.optString("result_icon");
        boolean z = epx.f(optString2, ApiUris.SCHEME_OK) || epx.f(optString2, "done");
        String optString3 = jSONObject.optString("result_label");
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(new qns0(optString, (String) null), null, null, 3);
        Context context = this.c;
        return hg1.m(y0, context, 0L, false, 62).subscribe(new hms(new g970(this.d, z, optString3, this.e), 18), new afs(new i750(context, 4), 16));
    }
}
