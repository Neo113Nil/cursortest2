package xsna;

import com.vk.dto.common.id.UserId;
import java.util.Set;

/* compiled from: VoipChatInfoProvider.kt */
/* loaded from: classes7.dex */
public interface qmw0 {

    /* compiled from: VoipChatInfoProvider.kt */
    public static final class a {
        public final int a;
        public final Set<UserId> b;

        public a(int i, Set<UserId> set) {
            this.a = i;
            this.b = set;
        }
    }

    io.reactivex.rxjava3.core.q<a> a(long j);
}
