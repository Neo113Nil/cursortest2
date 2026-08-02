package xsna;

import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.photo.PhotoAlbum;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AlbumPrivacyUtil.kt */
/* loaded from: classes5.dex */
public final class hk1 {
    public static boolean a(PhotoAlbum photoAlbum) {
        Object obj;
        List<PrivacySetting.PrivacyRule> list = photoAlbum.i;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((String) j5g.b0(0, ((PrivacySetting.PrivacyRule) obj).zb())) != null && (!r3.equals("all"))) {
                    break;
                }
            }
            if (((PrivacySetting.PrivacyRule) obj) != null) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(PhotoAlbum photoAlbum, Boolean bool) {
        List<PrivacySetting.PrivacyRule> list;
        Object obj;
        if (!epx.f(bool, Boolean.TRUE)) {
            if (epx.f(bool, Boolean.FALSE)) {
                return a(photoAlbum);
            }
            if (bool == null) {
                return a(photoAlbum);
            }
            throw new NoWhenBranchMatchedException();
        }
        if ((photoAlbum.b >= 0 || a(photoAlbum)) && (list = photoAlbum.i) != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((String) j5g.b0(0, ((PrivacySetting.PrivacyRule) obj).zb())) != null && (!r2.equals("friends"))) {
                    break;
                }
            }
            if (((PrivacySetting.PrivacyRule) obj) != null) {
                return true;
            }
        }
        return false;
    }
}
