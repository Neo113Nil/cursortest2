package xsna;

import com.vk.api.generated.shortVideo.dto.ShortVideoPlaylistFullDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ClipsPlaylistsSmallFoldersState.kt */
/* loaded from: classes16.dex */
public interface fve extends km50 {

    /* compiled from: ClipsPlaylistsSmallFoldersState.kt */
    public static final class a implements fve {
        public final UserId b;
        public final boolean c;

        public a(UserId userId, boolean z) {
            this.b = userId;
            this.c = z;
        }

        @Override // xsna.fve
        public final boolean d() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (Long.hashCode(this.b.b) * 31);
        }

        @Override // xsna.fve
        public final UserId q() {
            return this.b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Empty(ownerId=");
            sb.append(this.b);
            sb.append(", isOwner=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: ClipsPlaylistsSmallFoldersState.kt */
    public static final class b implements fve {
        public final boolean b;
        public final UserId c;
        public final List<ShortVideoPlaylistFullDto> d;
        public final String e;
        public final boolean f;
        public final Integer g;
        public final int h;

        public b(boolean z, UserId userId, List<ShortVideoPlaylistFullDto> list, String str, boolean z2, Integer num, int i) {
            this.b = z;
            this.c = userId;
            this.d = list;
            this.e = str;
            this.f = z2;
            this.g = num;
            this.h = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static b a(b bVar, boolean z, ArrayList arrayList, String str, boolean z2, int i) {
            if ((i & 1) != 0) {
                z = bVar.b;
            }
            boolean z3 = z;
            UserId userId = bVar.c;
            List list = arrayList;
            if ((i & 4) != 0) {
                list = bVar.d;
            }
            List list2 = list;
            if ((i & 8) != 0) {
                str = bVar.e;
            }
            String str2 = str;
            if ((i & 16) != 0) {
                z2 = bVar.f;
            }
            Integer num = bVar.g;
            int i2 = bVar.h;
            bVar.getClass();
            return new b(z3, userId, list2, str2, z2, num, i2);
        }

        @Override // xsna.fve
        public final boolean d() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && this.f == bVar.f && epx.f(this.g, bVar.g) && this.h == bVar.h;
        }

        public final int hashCode() {
            int a = fw3.a(bh10.a(Boolean.hashCode(this.b) * 31, 31, this.c.b), 31, this.d);
            String str = this.e;
            int b = qoy.b((a + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
            Integer num = this.g;
            return Integer.hashCode(this.h) + ((b + (num != null ? num.hashCode() : 0)) * 31);
        }

        @Override // xsna.fve
        public final UserId q() {
            return this.c;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(isOwner=");
            sb.append(this.b);
            sb.append(", ownerId=");
            sb.append(this.c);
            sb.append(", items=");
            sb.append(this.d);
            sb.append(", nextFrom=");
            sb.append(this.e);
            sb.append(", hasTopPadding=");
            sb.append(this.f);
            sb.append(", playlistsLimit=");
            sb.append(this.g);
            sb.append(", playlistsRealCount=");
            return vu5.b(sb, this.h, ')');
        }
    }

    /* compiled from: ClipsPlaylistsSmallFoldersState.kt */
    public static final class c implements fve {
        public final UserId b;
        public final boolean c;

        public c(UserId userId, boolean z) {
            this.b = userId;
            this.c = z;
        }

        @Override // xsna.fve
        public final boolean d() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && this.c == cVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (Long.hashCode(this.b.b) * 31);
        }

        @Override // xsna.fve
        public final UserId q() {
            return this.b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loading(ownerId=");
            sb.append(this.b);
            sb.append(", isOwner=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    boolean d();

    UserId q();
}
