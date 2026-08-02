package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ClipsGridBlockInteractor.kt */
/* loaded from: classes17.dex */
public final class jbe {
    public final wbe a;
    public final io.reactivex.rxjava3.subjects.d<a> b = io.reactivex.rxjava3.subjects.d.O0(new a(null, 7));

    /* compiled from: ClipsGridBlockInteractor.kt */
    public static final class a {
        public final List<SdkClipVideoFile> a;
        public final String b;
        public final boolean c;

        public a() {
            this(null, 7);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return Boolean.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CacheState(clips=");
            sb.append(this.a);
            sb.append(", currentPageAnchor=");
            sb.append(this.b);
            sb.append(", isEndReached=");
            return defpackage.q0.a(sb, this.c, ')');
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends SdkClipVideoFile> list, String str, boolean z) {
            this.a = list;
            this.b = str;
            this.c = z;
        }

        public a(String str, int i) {
            this(EmptyList.b, (i & 2) != 0 ? null : str, false);
        }
    }

    public jbe(wbe wbeVar) {
        this.a = wbeVar;
    }

    public final io.reactivex.rxjava3.internal.operators.single.r a(int i) {
        return new io.reactivex.rxjava3.internal.operators.single.r(this.b.K(), new x34(new hbe(this, i, 0), 8));
    }
}
