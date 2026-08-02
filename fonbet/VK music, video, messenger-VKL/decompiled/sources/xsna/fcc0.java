package xsna;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Build;
import com.vk.newsfeed.impl.posting.attachments.PostingAttachLocationFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class fcc0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fcc0(Object obj, int i, Object obj2, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
        this.e = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                Location location = (Location) obj;
                int i2 = PostingAttachLocationFragment.I0;
                return rsg0.y0(new usa0(location.getLatitude(), location.getLongitude(), ((PostingAttachLocationFragment) obj3).q0, this.c, ((com.vk.lists.c) obj2).k()), null, null, 3);
            default:
                Context context = (Context) obj3;
                Intent intent = (Intent) obj2;
                gz80.a(26);
                int i3 = 167772160;
                if (Build.VERSION.SDK_INT >= 34 && nax.a(intent)) {
                    i3 = 184549376;
                }
                return PendingIntent.getService(context, this.c, intent, i3);
        }
    }
}
