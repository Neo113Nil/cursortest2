package xsna;

import com.vk.core.preference.Preference;
import xsna.ky6;

/* compiled from: GalleryScrollController.kt */
/* loaded from: classes15.dex */
public final class j5t {
    public static int a = -1;
    public static int b = -1;
    public static int c = -1;
    public static int d = -1;

    public static void a() {
        if (a != 0) {
            a = 0;
            ky6.a aVar = (ky6.a) Preference.j().edit();
            aVar.putInt("camera_gallery_scroll", 0);
            aVar.a();
        }
        b = 0;
        ky6.a aVar2 = (ky6.a) Preference.j().edit();
        aVar2.putInt("camera_gallery_offset", 0);
        aVar2.a();
    }

    public static void b() {
        if (c == 0) {
            return;
        }
        c = 0;
        ky6.a aVar = (ky6.a) Preference.j().edit();
        aVar.putInt("posting_gallery_scroll", 0);
        aVar.apply();
    }
}
