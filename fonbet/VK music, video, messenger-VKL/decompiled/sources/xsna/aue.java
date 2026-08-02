package xsna;

import com.vk.clips.playlists.ClipsPlaylistsFolderLaunchParams;
import java.util.List;
import kotlin.Pair;

/* compiled from: ClipsPlaylistsFoldersState.kt */
/* loaded from: classes16.dex */
public interface aue extends km50 {

    /* compiled from: ClipsPlaylistsFoldersState.kt */
    public static final class a implements aue {
        public final ClipsPlaylistsFolderLaunchParams.FoldersLaunchType b;
        public final kte c;

        public a(ClipsPlaylistsFolderLaunchParams.FoldersLaunchType foldersLaunchType, kte kteVar) {
            this.b = foldersLaunchType;
            this.c = kteVar;
        }

        @Override // xsna.aue
        public final kte Q2() {
            return this.c;
        }

        @Override // xsna.aue
        public final ClipsPlaylistsFolderLaunchParams.FoldersLaunchType R2() {
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
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "Error(launchType=" + this.b + ", authors=" + this.c + ')';
        }
    }

    /* compiled from: ClipsPlaylistsFoldersState.kt */
    public static final class b implements aue {
        public final ClipsPlaylistsFolderLaunchParams.FoldersLaunchType b;
        public final List<Pair<mqe, Boolean>> c;
        public final int d;
        public final kte e;
        public final String f;
        public final Integer g;
        public final boolean h;
        public final boolean i;

        public b(ClipsPlaylistsFolderLaunchParams.FoldersLaunchType foldersLaunchType, List<Pair<mqe, Boolean>> list, int i, kte kteVar, String str, Integer num, boolean z, boolean z2) {
            this.b = foldersLaunchType;
            this.c = list;
            this.d = i;
            this.e = kteVar;
            this.f = str;
            this.g = num;
            this.h = z;
            this.i = z2;
        }

        public static b a(b bVar, List list, String str, boolean z, boolean z2, int i) {
            ClipsPlaylistsFolderLaunchParams.FoldersLaunchType foldersLaunchType = bVar.b;
            if ((i & 2) != 0) {
                list = bVar.c;
            }
            List list2 = list;
            int i2 = bVar.d;
            kte kteVar = bVar.e;
            if ((i & 16) != 0) {
                str = bVar.f;
            }
            String str2 = str;
            Integer num = bVar.g;
            if ((i & 64) != 0) {
                z = bVar.h;
            }
            boolean z3 = z;
            if ((i & 128) != 0) {
                z2 = bVar.i;
            }
            bVar.getClass();
            return new b(foldersLaunchType, list2, i2, kteVar, str2, num, z3, z2);
        }

        @Override // xsna.aue
        public final kte Q2() {
            return this.e;
        }

        @Override // xsna.aue
        public final ClipsPlaylistsFolderLaunchParams.FoldersLaunchType R2() {
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
            return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g) && this.h == bVar.h && this.i == bVar.i;
        }

        public final int hashCode() {
            int hashCode = (this.e.hashCode() + shy.a(this.d, fw3.a(this.b.hashCode() * 31, 31, this.c), 31)) * 31;
            String str = this.f;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.g;
            return Boolean.hashCode(this.i) + qoy.b((hashCode2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.h);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(launchType=");
            sb.append(this.b);
            sb.append(", items=");
            sb.append(this.c);
            sb.append(", playlistsCount=");
            sb.append(this.d);
            sb.append(", authors=");
            sb.append(this.e);
            sb.append(", nextFrom=");
            sb.append(this.f);
            sb.append(", playlistsLimit=");
            sb.append(this.g);
            sb.append(", pickerExpanded=");
            sb.append(this.h);
            sb.append(", batchLoadFailed=");
            return defpackage.q0.a(sb, this.i, ')');
        }
    }

    /* compiled from: ClipsPlaylistsFoldersState.kt */
    public static final class c implements aue {
        public final ClipsPlaylistsFolderLaunchParams.FoldersLaunchType b;
        public final kte c;

        public c(ClipsPlaylistsFolderLaunchParams.FoldersLaunchType foldersLaunchType, kte kteVar) {
            this.b = foldersLaunchType;
            this.c = kteVar;
        }

        @Override // xsna.aue
        public final kte Q2() {
            return this.c;
        }

        @Override // xsna.aue
        public final ClipsPlaylistsFolderLaunchParams.FoldersLaunchType R2() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "Loading(launchType=" + this.b + ", authors=" + this.c + ')';
        }
    }

    kte Q2();

    ClipsPlaylistsFolderLaunchParams.FoldersLaunchType R2();
}
