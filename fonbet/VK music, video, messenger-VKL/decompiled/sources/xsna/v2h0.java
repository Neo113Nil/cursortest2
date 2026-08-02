package xsna;

import android.net.Uri;
import java.util.List;

/* compiled from: SbpAppsProvider.kt */
/* loaded from: classes4.dex */
public interface v2h0 {
    default List<p2h0> a(String str) {
        return b(Uri.parse(str));
    }

    List<p2h0> b(Uri uri);
}
