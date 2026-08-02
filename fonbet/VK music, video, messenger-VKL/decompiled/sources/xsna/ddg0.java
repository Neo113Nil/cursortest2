package xsna;

import com.vk.dto.attaches.AttachImage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.restrictions.PhotoRestriction;
import java.util.LinkedHashSet;

/* compiled from: RestrictionPhotoManagerImpl.kt */
/* loaded from: classes2.dex */
public final class ddg0 implements cdg0 {
    public static boolean b;
    public static final ddg0 a = new ddg0();
    public static final LinkedHashSet c = new LinkedHashSet();

    public static boolean d(long j, UserId userId) {
        if (b) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(userId);
        sb.append('_');
        sb.append(j);
        return c.contains(sb.toString());
    }

    @Override // xsna.cdg0
    public final void a() {
        b = true;
    }

    @Override // xsna.cdg0
    public final void b(long j, UserId userId) {
        StringBuilder sb = new StringBuilder();
        sb.append(userId);
        sb.append('_');
        sb.append(j);
        c.add(sb.toString());
    }

    public final boolean c(AttachImage attachImage) {
        PhotoRestriction photoRestriction = attachImage.v;
        if (photoRestriction == null) {
            return false;
        }
        boolean z = photoRestriction.d;
        if (z) {
            return z && !d(attachImage.e, attachImage.d);
        }
        return true;
    }
}
