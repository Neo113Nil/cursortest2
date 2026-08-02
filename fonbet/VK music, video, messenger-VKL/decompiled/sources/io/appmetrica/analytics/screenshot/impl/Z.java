package io.appmetrica.analytics.screenshot.impl;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import xsna.brm0;
import xsna.drm0;
import xsna.gzs;
import xsna.ro;
import xsna.s3q0;

/* loaded from: classes8.dex */
public final class Z extends ContentObserver {
    public static final String d = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString();
    public final ClientContext a;
    public final gzs b;
    public volatile C5366k c;

    public Z(ClientContext clientContext, C5373s c5373s) {
        super(clientContext.getClientExecutorProvider().getDefaultExecutor().getHandler());
        this.a = clientContext;
        this.b = c5373s;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        C5366k c5366k;
        super.onChange(z, uri);
        if (!brm0.B(String.valueOf(uri), d, false) || (c5366k = this.c) == null) {
            return;
        }
        try {
            List list = c5366k.b;
            int i = 1;
            Object[] copyOf = Arrays.copyOf(new String[]{"date_added"}, list.size() + 1);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                copyOf[i] = it.next();
                i++;
            }
            String[] strArr = (String[]) copyOf;
            Cursor query = this.a.getContext().getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, strArr, "date_added >= ?", new String[]{String.valueOf(new SystemTimeProvider().currentTimeSeconds() - c5366k.c)}, "date_added DESC");
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        for (String str : strArr) {
                        }
                        Iterator it2 = c5366k.b.iterator();
                        while (it2.hasNext()) {
                            if (drm0.D(query.getString(query.getColumnIndexOrThrow((String) it2.next())).toLowerCase(Locale.ROOT), "screenshot", false)) {
                                this.b.invoke();
                            }
                        }
                    }
                } finally {
                }
            }
            s3q0 s3q0Var = s3q0.a;
            ro.e(query, null);
        } catch (Exception unused) {
        }
    }
}
