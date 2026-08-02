package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ClipsPlaylistUiPatch.kt */
/* loaded from: classes16.dex */
public interface rre extends xl50 {

    /* compiled from: ClipsPlaylistUiPatch.kt */
    public static final class a implements rre {
        public final boolean b;
        public final List<VideoFile> c;
        public final String d;
        public final String e;
        public final Integer f;

        public a() {
            this(63, null, null, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f);
        }

        public final int hashCode() {
            int a = fw3.a(qoy.b(Boolean.hashCode(this.b) * 31, 31, false), 31, this.c);
            String str = this.d;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.f;
            return hashCode2 + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ApplyNewBatch(appendToStart=");
            sb.append(this.b);
            sb.append(", isInitial=false, items=");
            sb.append(this.c);
            sb.append(", nextFrom=");
            sb.append(this.d);
            sb.append(", prevFrom=");
            sb.append(this.e);
            sb.append(", offset=");
            return uqi.b(sb, this.f, ')');
        }

        public a(int i, Integer num, String str, String str2, List list) {
            boolean z = (i & 1) == 0;
            list = (i & 4) != 0 ? EmptyList.b : list;
            str = (i & 8) != 0 ? null : str;
            str2 = (i & 16) != 0 ? null : str2;
            num = (i & 32) != 0 ? null : num;
            this.b = z;
            this.c = list;
            this.d = str;
            this.e = str2;
            this.f = num;
        }
    }

    /* compiled from: ClipsPlaylistUiPatch.kt */
    public static final class b implements rre {
        public static final b b = new b();
    }

    /* compiled from: ClipsPlaylistUiPatch.kt */
    public static final class c implements rre {
        public static final c b = new c();
    }

    /* compiled from: ClipsPlaylistUiPatch.kt */
    public static final class d implements rre {
        public final int b;
        public final int c;

        public d(int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.b == dVar.b && this.c == dVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ItemsMoved(from=");
            sb.append(this.b);
            sb.append(", to=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: ClipsPlaylistUiPatch.kt */
    public static final class e implements rre {
        public final boolean b;

        public e(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.b == ((e) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("SetError(isReloadPlaylist="), this.b, ')');
        }
    }

    /* compiled from: ClipsPlaylistUiPatch.kt */
    public static final class f implements rre {
        public final List<VideoFile> b;
        public final String c;
        public final String d;
        public final Integer e;
        public final Integer f;
        public final boolean g;

        public f() {
            this(null, null, null, null, null, false, 255);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c) && epx.f(this.d, fVar.d) && epx.f(this.e, fVar.e) && epx.f(this.f, fVar.f) && this.g == fVar.g;
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            String str = this.c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 961;
            Integer num = this.e;
            int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 961;
            Integer num2 = this.f;
            return Boolean.hashCode(this.g) + ((hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SetInitialItems(items=");
            sb.append(this.b);
            sb.append(", nextFrom=");
            sb.append(this.c);
            sb.append(", prevFrom=");
            sb.append(this.d);
            sb.append(", title=null, count=");
            sb.append(this.e);
            sb.append(", id=null, topOffset=");
            sb.append(this.f);
            sb.append(", canEdit=");
            return defpackage.q0.a(sb, this.g, ')');
        }

        public f(ArrayList arrayList, String str, String str2, Integer num, Integer num2, boolean z, int i) {
            List list = (i & 1) != 0 ? EmptyList.b : arrayList;
            str = (i & 2) != 0 ? null : str;
            str2 = (i & 4) != 0 ? null : str2;
            num = (i & 16) != 0 ? null : num;
            num2 = (i & 64) != 0 ? null : num2;
            z = (i & 128) != 0 ? false : z;
            this.b = list;
            this.c = str;
            this.d = str2;
            this.e = num;
            this.f = num2;
            this.g = z;
        }
    }

    /* compiled from: ClipsPlaylistUiPatch.kt */
    public static final class g implements rre {
        public final String b;
        public final Integer c;
        public final Integer d;
        public final String e;
        public final UserId f;

        public g() {
            this(null, null, null, null, null, 63);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return epx.f(this.b, gVar.b) && epx.f(this.c, gVar.c) && epx.f(this.d, gVar.d) && epx.f(this.e, gVar.e) && epx.f(this.f, gVar.f);
        }

        public final int hashCode() {
            String str = this.b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.c;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.d;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str2 = this.e;
            return Long.hashCode(this.f.b) + ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 961);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SetLoading(title=");
            sb.append(this.b);
            sb.append(", count=");
            sb.append(this.c);
            sb.append(", id=");
            sb.append(this.d);
            sb.append(", highlightAfterLoaded=");
            sb.append(this.e);
            sb.append(", canEdit=null, ownerId=");
            return gp.b(sb, this.f, ')');
        }

        public g(String str, Integer num, Integer num2, String str2, UserId userId, int i) {
            str = (i & 1) != 0 ? null : str;
            num = (i & 2) != 0 ? null : num;
            num2 = (i & 4) != 0 ? null : num2;
            str2 = (i & 8) != 0 ? null : str2;
            userId = (i & 32) != 0 ? UserId.d : userId;
            this.b = str;
            this.c = num;
            this.d = num2;
            this.e = str2;
            this.f = userId;
        }
    }

    /* compiled from: ClipsPlaylistUiPatch.kt */
    public static final class h implements rre {
        public final boolean b;

        public h(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.b == ((h) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("SetNewPageLoading(isTop="), this.b, ')');
        }
    }

    /* compiled from: ClipsPlaylistUiPatch.kt */
    public static final class i implements rre {
        public final boolean b;

        public i(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.b == ((i) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("SetReorderState(isReorder="), this.b, ')');
        }
    }

    /* compiled from: ClipsPlaylistUiPatch.kt */
    public static final class j implements rre {
        public static final j b = new j();
    }

    /* compiled from: ClipsPlaylistUiPatch.kt */
    public static final class k implements rre {
        public static final k b = new k();
    }
}
