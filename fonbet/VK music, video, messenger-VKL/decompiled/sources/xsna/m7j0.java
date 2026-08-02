package xsna;

import android.net.Uri;

/* compiled from: ShareFeature.kt */
/* loaded from: classes7.dex */
public final class m7j0 {
    public static final String a(u7j0 u7j0Var) {
        int i;
        String sb;
        boolean z = u7j0Var.f;
        String str = u7j0Var.c;
        if (!z || (i = u7j0Var.e) <= 0) {
            return str;
        }
        int i2 = i / 3600;
        int i3 = (i / 60) % 60;
        int i4 = i % 60;
        if (i2 == 0 && i3 == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i4);
            sb2.append('s');
            sb = sb2.toString();
        } else if (i2 == 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(i3);
            sb3.append('m');
            sb3.append(i4);
            sb3.append('s');
            sb = sb3.toString();
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(i2);
            sb4.append('h');
            sb4.append(i3);
            sb4.append('m');
            sb4.append(i4);
            sb4.append('s');
            sb = sb4.toString();
        }
        return Uri.parse(str).buildUpon().appendQueryParameter("t", sb).build().toString();
    }
}
