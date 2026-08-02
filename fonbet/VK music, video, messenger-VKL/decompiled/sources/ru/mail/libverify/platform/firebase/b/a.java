package ru.mail.libverify.platform.firebase.b;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import ru.mail.libverify.platform.core.ILog;
import ru.mail.libverify.platform.gcm.IDv2ProviderService;

/* loaded from: classes9.dex */
public final class a implements IDv2ProviderService {
    public final Context a;
    public final ILog b;

    public a(Context context, ILog iLog) {
        this.a = context;
        this.b = iLog;
    }

    @Override // ru.mail.libverify.platform.gcm.IDv2ProviderService
    public final String get() {
        String str;
        try {
            ILog iLog = this.b;
            if (iLog != null) {
                iLog.d("IDV2Provider", "Try to read android_id");
            }
            Cursor query = this.a.getContentResolver().query(Uri.parse("content://com.google.android.gsf.gservices"), null, null, new String[]{"android_id"}, null);
            if (query != null && (!query.moveToFirst() || query.getColumnCount() < 2)) {
                if (!query.isClosed()) {
                    query.close();
                }
                ILog iLog2 = this.b;
                if (iLog2 != null) {
                    iLog2.e("IDV2Provider", "Failed to read android_id; Cursor is closed");
                }
                return null;
            }
            if (query == null) {
                return null;
            }
            try {
                try {
                    str = query.getString(1);
                } finally {
                }
            } catch (Exception e) {
                ILog iLog3 = this.b;
                if (iLog3 != null) {
                    iLog3.e("IDV2Provider", "Failed to read android_id", e);
                }
                str = null;
            }
            query.close();
            return str;
        } catch (Exception e2) {
            ILog iLog4 = this.b;
            if (iLog4 != null) {
                iLog4.e("IDV2Provider", "Failed to read android_id", e2);
            }
            return null;
        }
    }
}
