package xsna;

import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.posting.PostingVisibilityMode;
import java.util.List;

/* compiled from: PreFilledPostingParams.kt */
/* loaded from: classes4.dex */
public final class zwc0 {
    public final a a;
    public final String b;
    public final List<Attachment> c;
    public final Long d;
    public final PostingVisibilityMode e;
    public final boolean f;

    /* compiled from: PreFilledPostingParams.kt */
    public interface a {

        /* compiled from: PreFilledPostingParams.kt */
        /* renamed from: xsna.zwc0$a$a, reason: collision with other inner class name */
        public static final class C4207a implements a {
            public final UserId a;
            public final String b;
            public final boolean c;

            public /* synthetic */ C4207a(UserId userId, int i) {
                this(userId, null, false);
            }

            public final UserId a() {
                UserId userId = this.a;
                if (userId == null || !fkq0.c(userId)) {
                    return null;
                }
                return fkq0.b(userId) ? userId : fkq0.e(userId);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C4207a)) {
                    return false;
                }
                C4207a c4207a = (C4207a) obj;
                return epx.f(this.a, c4207a.a) && epx.f(this.b, c4207a.b) && this.c == c4207a.c;
            }

            public final int hashCode() {
                UserId userId = this.a;
                int hashCode = (userId == null ? 0 : Long.hashCode(userId.b)) * 31;
                String str = this.b;
                return Boolean.hashCode(this.c) + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Community(groupId=");
                sb.append(this.a);
                sb.append(", name=");
                sb.append(this.b);
                sb.append(", isFromVkAdmin=");
                return defpackage.q0.a(sb, this.c, ')');
            }

            public C4207a(UserId userId, String str, boolean z) {
                this.a = userId;
                this.b = str;
                this.c = z;
            }
        }

        /* compiled from: PreFilledPostingParams.kt */
        public static final class b implements a {
            public final UserId a;
            public final String b;

            public b(UserId userId, String str) {
                this.a = userId;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
            }

            public final int hashCode() {
                int hashCode = Long.hashCode(this.a.b) * 31;
                String str = this.b;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("User(id=");
                sb.append(this.a);
                sb.append(", fullName=");
                return ho8.a(sb, this.b, ')');
            }
        }
    }

    public zwc0() {
        this(0);
    }

    public static zwc0 a(zwc0 zwc0Var, a aVar, String str, List list, Long l, PostingVisibilityMode postingVisibilityMode, boolean z, int i) {
        if ((i & 1) != 0) {
            aVar = zwc0Var.a;
        }
        a aVar2 = aVar;
        if ((i & 2) != 0) {
            str = zwc0Var.b;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            list = zwc0Var.c;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            l = zwc0Var.d;
        }
        Long l2 = l;
        if ((i & 16) != 0) {
            postingVisibilityMode = zwc0Var.e;
        }
        PostingVisibilityMode postingVisibilityMode2 = postingVisibilityMode;
        if ((i & 32) != 0) {
            z = zwc0Var.f;
        }
        zwc0Var.getClass();
        return new zwc0(aVar2, str2, list2, l2, postingVisibilityMode2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zwc0)) {
            return false;
        }
        zwc0 zwc0Var = (zwc0) obj;
        return epx.f(this.a, zwc0Var.a) && epx.f(this.b, zwc0Var.b) && epx.f(this.c, zwc0Var.c) && epx.f(this.d, zwc0Var.d) && this.e == zwc0Var.e && this.f == zwc0Var.f;
    }

    public final int hashCode() {
        a aVar = this.a;
        int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<Attachment> list = this.c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.d;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        PostingVisibilityMode postingVisibilityMode = this.e;
        return Boolean.hashCode(this.f) + ((hashCode4 + (postingVisibilityMode != null ? postingVisibilityMode.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreFilledPostingParams(owner=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", attachments=");
        sb.append(this.c);
        sb.append(", postAtTime=");
        sb.append(this.d);
        sb.append(", visibilityMode=");
        sb.append(this.e);
        sb.append(", isSuggestedPost=");
        return defpackage.q0.a(sb, this.f, ')');
    }

    public /* synthetic */ zwc0(int i) {
        this(null, null, null, null, null, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zwc0(a aVar, String str, List<? extends Attachment> list, Long l, PostingVisibilityMode postingVisibilityMode, boolean z) {
        this.a = aVar;
        this.b = str;
        this.c = list;
        this.d = l;
        this.e = postingVisibilityMode;
        this.f = z;
    }
}
