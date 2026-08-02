package androidx.media;

import android.os.Bundle;
import android.os.Messenger;
import android.service.media.MediaBrowserService;
import androidx.media.MediaBrowserServiceCompat;
import defpackage.cb10;
import defpackage.sa90;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class i implements cb10 {
    public final ArrayList a = new ArrayList();
    public MediaBrowserService b;
    public Messenger c;
    public final /* synthetic */ MediaBrowserServiceCompat d;

    public i(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        this.d = mediaBrowserServiceCompat;
    }

    public final void a(MediaBrowserServiceCompat.ConnectionRecord connectionRecord, String str, Bundle bundle) {
        int i;
        int i2;
        List<sa90> list = connectionRecord.subscriptions.get(str);
        if (list != null) {
            for (sa90 sa90Var : list) {
                Bundle bundle2 = (Bundle) sa90Var.b;
                int i3 = bundle == null ? -1 : bundle.getInt("android.media.browse.extra.PAGE", -1);
                int i4 = bundle2 == null ? -1 : bundle2.getInt("android.media.browse.extra.PAGE", -1);
                int i5 = bundle == null ? -1 : bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                int i6 = bundle2 == null ? -1 : bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                int i7 = Integer.MAX_VALUE;
                int i8 = 0;
                if (i3 == -1 || i5 == -1) {
                    i = Integer.MAX_VALUE;
                    i2 = 0;
                } else {
                    i2 = i3 * i5;
                    i = (i5 + i2) - 1;
                }
                if (i4 != -1 && i6 != -1) {
                    i8 = i6 * i4;
                    i7 = (i6 + i8) - 1;
                }
                if (i >= i8 && i7 >= i2) {
                    this.d.performLoadChildren(str, connectionRecord, (Bundle) sa90Var.b, bundle);
                }
            }
        }
    }
}
