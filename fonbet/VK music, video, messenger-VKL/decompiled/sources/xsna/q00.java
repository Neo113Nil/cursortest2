package xsna;

import android.content.Context;
import com.vk.core.store.entity.core.impl.EntityCacheComponentImpl;
import com.vk.core.store.entity.models.NotificationMentions;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class q00 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ q00(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                e3m.a aVar = e3m.a;
                return Integer.valueOf(context.getColor(R.color.vk_white));
            default:
                qcy<Object>[] qcyVarArr = EntityCacheComponentImpl.c;
                return new sug0(new zfz(context.getApplicationContext(), NotificationMentions.b));
        }
    }
}
