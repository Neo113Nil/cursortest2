package xsna;

import android.content.Context;
import com.vk.im.engine.external.ImMsgPushSettingsProvider;
import com.vk.im.engine.models.users.User;
import com.vk.sharing.api.dto.Target;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.ikv0;

/* compiled from: SharingPushDelegate.kt */
/* loaded from: classes5.dex */
public final class ccj0 {
    public final Context a;
    public final p9w b;
    public boolean c = true;

    public ccj0(Context context, a1w a1wVar) {
        this.a = context;
        this.b = a1wVar.r().f;
    }

    public final void a(Target target, pq9 pq9Var) {
        String string;
        String str;
        if (this.b.f(ImMsgPushSettingsProvider.Type.PRIVATE_MESSAGES)) {
            return;
        }
        int size = pq9Var != null ? pq9Var.c.size() : 0;
        if (target.k && !target.h && this.c) {
            User user = (User) target.j.b.get(Long.valueOf(target.c.b));
            Context context = this.a;
            if (size == 0) {
                if (user == null || (str = user.s) == null) {
                    str = target.t;
                }
                string = context.getString(R.string.enable_push_after_sharing_one_person, str);
            } else {
                string = context.getString(R.string.enable_push_after_sharing_group_people);
            }
            ikv0.a aVar = new ikv0.a(context);
            aVar.u = new ikv0.d(new ikv0.d.c(string, 3), (ikv0.d.b) null, (ikv0.d.a) null, 6);
            aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context.getString(R.string.enable), new h630(this, 27));
            aVar.n();
            this.c = false;
        }
        if (this.c || size != 0) {
            return;
        }
        this.c = true;
    }
}
