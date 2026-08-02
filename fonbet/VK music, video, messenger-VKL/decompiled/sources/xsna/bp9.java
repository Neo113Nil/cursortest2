package xsna;

import com.vk.api.generated.users.dto.UsersCanNotCallReasonDto;
import com.vk.dto.user.OnlineInfo;
import com.vk.im.engine.models.contacts.Contact;
import java.util.HashMap;

/* compiled from: CanCallServiceImpl.kt */
/* loaded from: classes11.dex */
public final class bp9 {
    public final u1r0 a;
    public final vg20 b;
    public final fow0 c;
    public final HashMap<String, a> d = new HashMap<>();

    /* compiled from: CanCallServiceImpl.kt */
    /* loaded from: classes7.dex */
    public static final class a {
        public final UsersCanNotCallReasonDto a;
        public final oap<OnlineInfo, Contact.LastSeenStatus> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(UsersCanNotCallReasonDto usersCanNotCallReasonDto, oap<? extends OnlineInfo, ? extends Contact.LastSeenStatus> oapVar) {
            this.a = usersCanNotCallReasonDto;
            this.b = oapVar;
        }

        public final oap<OnlineInfo, Contact.LastSeenStatus> a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            UsersCanNotCallReasonDto usersCanNotCallReasonDto = this.a;
            return this.b.hashCode() + ((usersCanNotCallReasonDto == null ? 0 : usersCanNotCallReasonDto.hashCode()) * 31);
        }

        public final String toString() {
            return "CanNotCall(privacyReason=" + this.a + ", lastSeen=" + this.b + ')';
        }
    }

    public bp9(u1r0 u1r0Var, vg20 vg20Var, fow0 fow0Var) {
        this.a = u1r0Var;
        this.b = vg20Var;
        this.c = fow0Var;
    }
}
