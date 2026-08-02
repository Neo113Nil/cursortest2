package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoTag;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collections;
import java.util.List;

/* compiled from: PhotosConfirmTags.kt */
/* loaded from: classes15.dex */
public final class oea0 extends xsg0 {

    /* compiled from: PhotosConfirmTags.kt */
    public static final class a {
        public final UserId a;
        public final int b;
        public final int c;

        public a(UserId userId, int i, int i2) {
            this.a = userId;
            this.b = i;
            this.c = i2;
        }
    }

    public oea0(Photo photo, List<PhotoTag> list, boolean z, String str, String str2) {
        super("photos.confirmTags");
        K("tags", j5g.g0(list, StringUtils.COMMA, null, null, 0, new xi6(photo.e, photo.c, 1), 30));
        K("track_code", str);
        K("nav_screen", str2);
        R("is_real", z);
    }

    public /* synthetic */ oea0(Photo photo, PhotoTag photoTag, boolean z, int i) {
        this(photo, photoTag, z, (String) null, (String) null);
    }

    public oea0(Photo photo, PhotoTag photoTag, boolean z, String str, String str2) {
        this(photo, (List<PhotoTag>) Collections.singletonList(photoTag), z, str, str2);
    }
}
