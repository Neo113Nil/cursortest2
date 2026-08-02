package xsna;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import xsna.z8r;

/* compiled from: NoPermissionMediaPickerHelper.kt */
/* loaded from: classes15.dex */
public final class b470 {
    public static final boolean c;
    public final ArrayList a = new ArrayList();
    public t4t b = t4t.J;

    static {
        c = Build.VERSION.SDK_INT >= 30;
    }

    public b470(int i) {
    }

    public final void a(Object obj) {
        ArrayList arrayList = this.a;
        arrayList.clear();
        if (obj instanceof Uri) {
            arrayList.add(obj);
            return;
        }
        ArrayList arrayList2 = null;
        List list = obj instanceof List ? (List) obj : null;
        if (list != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof Uri) {
                    arrayList3.add(obj2);
                }
            }
            if (arrayList3.size() == list.size()) {
                arrayList2 = arrayList3;
            }
        }
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
    }

    public final Intent b(Context context) {
        boolean z;
        Intent intent = new Intent();
        ArrayList arrayList = this.a;
        boolean[] zArr = new boolean[arrayList.size()];
        boolean[] zArr2 = new boolean[arrayList.size()];
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            Uri uri = (Uri) obj;
            String type = context.getContentResolver().getType(uri);
            boolean B = type != null ? brm0.B(type, "video", false) : false;
            zArr[i] = B;
            if (!B) {
                z8r.a a = z8r.a(context, uri);
                if (a.a + a.b > 24000) {
                    z = true;
                    zArr2[i] = z;
                    context.getContentResolver().takePersistableUriPermission(uri, 1);
                    i = i2;
                }
            }
            z = false;
            zArr2[i] = z;
            context.getContentResolver().takePersistableUriPermission(uri, 1);
            i = i2;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("result_files", p4g.q(arrayList));
        bundle.putBooleanArray("result_video_flags", zArr);
        bundle.putBooleanArray("result_send_as_file_flags", zArr2);
        intent.putExtra("result_attachments", bundle);
        return intent;
    }
}
