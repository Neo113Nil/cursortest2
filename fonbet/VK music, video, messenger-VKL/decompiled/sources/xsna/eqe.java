package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ClipsPlaylistEventBus.kt */
/* loaded from: classes17.dex */
public interface eqe {

    /* compiled from: ClipsPlaylistEventBus.kt */
    public static final class a implements eqe {
        public final ArrayList a;
        public final String b;
        public final String c;

        public a(String str, String str2, ArrayList arrayList) {
            this.a = arrayList;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnClipsMoved(items=");
            sb.append(this.a);
            sb.append(", forwardPagingKey=");
            sb.append(this.b);
            sb.append(", backwardPagingKey=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: ClipsPlaylistEventBus.kt */
    public static final class b implements eqe {
        public final ArrayList a;
        public final String b;
        public final boolean c;

        public b(String str, ArrayList arrayList, boolean z) {
            this.a = arrayList;
            this.b = str;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return Boolean.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnPageLoaded(items=");
            sb.append(this.a);
            sb.append(", paginationKey=");
            sb.append(this.b);
            sb.append(", isForward=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: ClipsPlaylistEventBus.kt */
    public static final class c implements eqe {
        public final UserId a;

        public c(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OnPlaylistDeleted(ownerId="), this.a, ')');
        }
    }

    /* compiled from: ClipsPlaylistEventBus.kt */
    public static final class d implements eqe {
        public final int a;
        public final String b;

        public d(int i, String str) {
            this.a = i;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && epx.f(this.b, dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnPlaylistRenamed(playlistId=");
            sb.append(this.a);
            sb.append(", newName=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: ClipsPlaylistEventBus.kt */
    public static final class e implements eqe {
        public final List<SdkVideoFile> a;
        public final String b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(List<? extends SdkVideoFile> list, String str) {
            this.a = list;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnReloaded(items=");
            sb.append(this.a);
            sb.append(", paginationKey=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: ClipsPlaylistEventBus.kt */
    public static final class f implements eqe {
        public final String a;

        public f(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ScrollTo(targetVideoId="), this.a, ')');
        }
    }
}
