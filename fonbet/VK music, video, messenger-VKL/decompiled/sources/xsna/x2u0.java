package xsna;

import com.vk.attachpicker.ImageFormatRestrictions;
import com.vk.mediastore.system.MediaStoreEntry;
import java.util.Collection;
import java.util.List;
import xsna.q3u0;

/* compiled from: ViewerImageFormatValidator.kt */
/* loaded from: classes15.dex */
public final class x2u0 implements r3u0 {
    public final ImageFormatRestrictions a;

    public x2u0(ImageFormatRestrictions imageFormatRestrictions) {
        this.a = imageFormatRestrictions;
    }

    public static boolean b(String str, List list) {
        List<String> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (String str2 : list2) {
            if (str != null && brm0.v(str, str2, true)) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.r3u0
    public final q3u0 a(MediaStoreEntry mediaStoreEntry) {
        ImageFormatRestrictions imageFormatRestrictions = this.a;
        List<String> list = imageFormatRestrictions.b;
        List<String> list2 = imageFormatRestrictions.c;
        String lastPathSegment = mediaStoreEntry.f().getLastPathSegment();
        return (list == null || b(lastPathSegment, list)) ? (list2 == null || !b(lastPathSegment, list2)) ? q3u0.b.a : w2u0.b : w2u0.b;
    }
}
