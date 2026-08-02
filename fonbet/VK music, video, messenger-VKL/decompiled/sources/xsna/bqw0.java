package xsna;

import com.vk.api.generated.users.dto.UsersOnlineInfoDto;
import com.vk.dto.common.im.ImageList;
import com.vk.voip.userid.CallsUserId;

/* compiled from: VoipHistoryFriendsViewItem.kt */
/* loaded from: classes7.dex */
public abstract class bqw0 implements hfz {

    /* compiled from: VoipHistoryFriendsViewItem.kt */
    public static final class a extends bqw0 {
        public final int b;

        public a() {
            this(0, 3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(0) + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            return h5s.c(this.b, ", marginBottom=0)", new StringBuilder("Divider(marginTop="));
        }

        public a(int i, int i2) {
            this.b = (i2 & 1) != 0 ? 0 : i;
        }
    }

    /* compiled from: VoipHistoryFriendsViewItem.kt */
    public static final class b extends bqw0 {
        public final CallsUserId.VkUserId b;
        public final String c;
        public final String d;
        public final ImageList e;
        public final UsersOnlineInfoDto f;
        public final boolean g;
        public final boolean h;
        public final kr5 i;

        public b(CallsUserId.VkUserId vkUserId, String str, String str2, ImageList imageList, UsersOnlineInfoDto usersOnlineInfoDto, boolean z, boolean z2, kr5 kr5Var) {
            this.b = vkUserId;
            this.c = str;
            this.d = str2;
            this.e = imageList;
            this.f = usersOnlineInfoDto;
            this.g = z;
            this.h = z2;
            this.i = kr5Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && this.g == bVar.g && this.h == bVar.h && epx.f(this.i, bVar.i);
        }

        @Override // xsna.bqw0, xsna.hfz
        public final Number getItemId() {
            return Integer.valueOf(this.b.hashCode());
        }

        public final int hashCode() {
            return this.i.hashCode() + qoy.b(qoy.b((this.f.hashCode() + fw3.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e.b)) * 31, 31, this.g), 31, this.h);
        }

        public final String toString() {
            return "Friend(id=" + this.b + ", firstName=" + this.c + ", lastName=" + this.d + ", image=" + this.e + ", onlineInfo=" + this.f + ", isFemale=" + this.g + ", canCall=" + this.h + ", avatar=" + this.i + ')';
        }
    }

    /* compiled from: VoipHistoryFriendsViewItem.kt */
    public static final class c extends bqw0 {
        public final Throwable b;

        public c(Throwable th) {
            this.b = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("PageLoadingError(throwable="), this.b, ')');
        }
    }

    /* compiled from: VoipHistoryFriendsViewItem.kt */
    public static final class d extends bqw0 {
        public static final d b = new d();
    }

    /* compiled from: VoipHistoryFriendsViewItem.kt */
    public static abstract class e extends bqw0 {

        /* compiled from: VoipHistoryFriendsViewItem.kt */
        public static final class a extends e {
            public final String b;

            public a(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            @Override // xsna.bqw0, xsna.hfz
            public final Number getItemId() {
                return Integer.valueOf(this.b.hashCode());
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("AllFriends(title="), this.b, ')');
            }
        }

        /* compiled from: VoipHistoryFriendsViewItem.kt */
        public static final class b extends e {
            public static final b b = new b();
        }
    }

    @Override // xsna.hfz
    public Number getItemId() {
        return 0;
    }
}
