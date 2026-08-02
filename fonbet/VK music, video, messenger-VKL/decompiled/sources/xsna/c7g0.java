package xsna;

import java.util.List;

/* compiled from: RepostParams.kt */
/* loaded from: classes6.dex */
public interface c7g0 {

    /* compiled from: RepostParams.kt */
    public static final class a implements c7g0 {
        public final p3c0 a;
        public final v5 b;
        public final w5 c;
        public final com.vk.movika.sdk.base.logic.interactor.m d;
        public final String e;

        public a() {
            throw null;
        }

        public a(p3c0 p3c0Var, v5 v5Var, w5 w5Var, String str) {
            com.vk.movika.sdk.base.logic.interactor.m mVar = new com.vk.movika.sdk.base.logic.interactor.m(25);
            this.a = p3c0Var;
            this.b = v5Var;
            this.c = w5Var;
            this.d = mVar;
            this.e = str;
        }

        @Override // xsna.c7g0
        public final gzs<s3q0> a() {
            return this.d;
        }

        @Override // xsna.c7g0
        public final izs<io.reactivex.rxjava3.disposables.c, s3q0> b() {
            return this.b;
        }

        @Override // xsna.c7g0
        public final izs<zjm0, s3q0> c() {
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
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
        }

        @Override // xsna.c7g0
        public final String getPrivacy() {
            return null;
        }

        @Override // xsna.c7g0
        public final String getRef() {
            return this.e;
        }

        public final int hashCode() {
            int hashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 961;
            String str = this.e;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChannelPostParams(message=");
            sb.append(this.a);
            sb.append(", disposableCollector=");
            sb.append(this.b);
            sb.append(", onStoryPublished=");
            sb.append(this.c);
            sb.append(", onUploadFailed=");
            sb.append(this.d);
            sb.append(", privacy=null, ref=");
            return ho8.a(sb, this.e, ')');
        }
    }

    /* compiled from: RepostParams.kt */
    public static final class b implements c7g0 {
        public final u7c0 a;
        public final List<pbm0> b;
        public final n3b0 c;
        public final d2y d;
        public final tbe0 e;
        public final String f;

        public b() {
            throw null;
        }

        public b(u7c0 u7c0Var, List list, n3b0 n3b0Var, d2y d2yVar, tbe0 tbe0Var, String str) {
            this.a = u7c0Var;
            this.b = list;
            this.c = n3b0Var;
            this.d = d2yVar;
            this.e = tbe0Var;
            this.f = str;
        }

        @Override // xsna.c7g0
        public final gzs<s3q0> a() {
            return this.e;
        }

        @Override // xsna.c7g0
        public final izs<io.reactivex.rxjava3.disposables.c, s3q0> b() {
            return this.c;
        }

        @Override // xsna.c7g0
        public final izs<zjm0, s3q0> c() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f);
        }

        @Override // xsna.c7g0
        public final String getPrivacy() {
            return this.f;
        }

        @Override // xsna.c7g0
        public final String getRef() {
            return null;
        }

        public final int hashCode() {
            int hashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + fw3.a(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31;
            String str = this.f;
            return (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FeedPostParams(stickerInfo=");
            sb.append(this.a);
            sb.append(", repostAttachments=");
            sb.append(this.b);
            sb.append(", disposableCollector=");
            sb.append(this.c);
            sb.append(", onStoryPublished=");
            sb.append(this.d);
            sb.append(", onUploadFailed=");
            sb.append(this.e);
            sb.append(", privacy=");
            return i5s.a(sb, this.f, ", ref=null)");
        }
    }

    gzs<s3q0> a();

    izs<io.reactivex.rxjava3.disposables.c, s3q0> b();

    izs<zjm0, s3q0> c();

    String getPrivacy();

    String getRef();
}
