package xsna;

import com.vk.dto.user.InvisibleLastSeenStatus;
import com.vk.dto.user.InvisibleStatus;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.VisibleStatus;
import com.vk.im.engine.models.contacts.Contact;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CheckExpiredStatus.kt */
/* loaded from: classes7.dex */
public final class m0c {
    public static final Contact.LastSeenStatus a = Contact.LastSeenStatus.LONG_AGO;

    public static boolean a(Contact.LastSeenStatus lastSeenStatus) {
        return lastSeenStatus == a;
    }

    public static boolean b(OnlineInfo onlineInfo) {
        if (onlineInfo instanceof VisibleStatus) {
            long j = ((VisibleStatus) onlineInfo).b;
            return j > 0 && qni0.a() - j > TimeUnit.DAYS.toMillis(30L);
        }
        if (onlineInfo instanceof InvisibleStatus) {
            return ((InvisibleStatus) onlineInfo).b == InvisibleLastSeenStatus.LONG_AGO;
        }
        throw new NoWhenBranchMatchedException();
    }
}
