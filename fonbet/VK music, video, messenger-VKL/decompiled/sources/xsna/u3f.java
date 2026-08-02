package xsna;

import com.vk.clips.viewer.impl.feed.view.list.item.controls.side.shares.fast.config.ClipsFastShareConfig$Strategy;

/* compiled from: ClipsShareTargetsRequestParams.kt */
/* loaded from: classes17.dex */
public interface u3f {

    /* compiled from: ClipsShareTargetsRequestParams.kt */
    public static final class a implements u3f {
        public final int a;
        public final ClipsFastShareConfig$Strategy b;
        public final u3f c;
        public final boolean d;

        public a() {
            this(0, null, null, 15);
        }

        @Override // xsna.u3f
        public final ClipsFastShareConfig$Strategy d() {
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
            return this.a == aVar.a && this.b == aVar.b && epx.f(this.c, aVar.c) && this.d == aVar.d;
        }

        @Override // xsna.u3f
        public final int getCount() {
            return this.a;
        }

        public final int hashCode() {
            int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
            u3f u3fVar = this.c;
            return Boolean.hashCode(this.d) + ((hashCode + (u3fVar == null ? 0 : u3fVar.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Cache(count=");
            sb.append(this.a);
            sb.append(", strategy=");
            sb.append(this.b);
            sb.append(", fallback=");
            sb.append(this.c);
            sb.append(", isNeedToFetchAfterCacheReturn=");
            return defpackage.q0.a(sb, this.d, ')');
        }

        public a(int i, ClipsFastShareConfig$Strategy clipsFastShareConfig$Strategy, b bVar, int i2) {
            i = (i2 & 1) != 0 ? 5 : i;
            clipsFastShareConfig$Strategy = (i2 & 2) != 0 ? ClipsFastShareConfig$Strategy.FRIENDS : clipsFastShareConfig$Strategy;
            bVar = (i2 & 4) != 0 ? null : bVar;
            this.a = i;
            this.b = clipsFastShareConfig$Strategy;
            this.c = bVar;
            this.d = true;
        }
    }

    /* compiled from: ClipsShareTargetsRequestParams.kt */
    public static final class b implements u3f {
        public final int a;
        public final ClipsFastShareConfig$Strategy b;
        public final boolean c;

        public b() {
            this(0, null, false, 15);
        }

        @Override // xsna.u3f
        public final ClipsFastShareConfig$Strategy d() {
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
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c;
        }

        @Override // xsna.u3f
        public final int getCount() {
            return this.a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 961);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Network(count=");
            sb.append(this.a);
            sb.append(", strategy=");
            sb.append(this.b);
            sb.append(", fallback=null, awaitNetwork=");
            return defpackage.q0.a(sb, this.c, ')');
        }

        public b(int i, ClipsFastShareConfig$Strategy clipsFastShareConfig$Strategy, boolean z, int i2) {
            i = (i2 & 1) != 0 ? 5 : i;
            clipsFastShareConfig$Strategy = (i2 & 2) != 0 ? ClipsFastShareConfig$Strategy.FRIENDS : clipsFastShareConfig$Strategy;
            z = (i2 & 8) != 0 ? false : z;
            this.a = i;
            this.b = clipsFastShareConfig$Strategy;
            this.c = z;
        }
    }

    ClipsFastShareConfig$Strategy d();

    int getCount();
}
