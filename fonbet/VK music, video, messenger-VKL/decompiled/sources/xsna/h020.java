package xsna;

import android.net.Uri;
import android.provider.MediaStore;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MediaTypes.kt */
/* loaded from: classes3.dex */
public final class h020 {
    public static final List<Uri> a;
    public static final List<Uri> b;
    public static final ArrayList c;

    static {
        List<Uri> l = e43.l(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        a = l;
        List<Uri> l2 = e43.l(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, MediaStore.Video.Media.INTERNAL_CONTENT_URI);
        b = l2;
        c = j5g.u0(l2, l);
    }
}
