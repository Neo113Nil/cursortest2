package xsna;

import android.content.Context;
import android.graphics.RectF;
import androidx.fragment.app.FragmentActivity;

/* compiled from: IHomeFragmentTopBar.kt */
/* loaded from: classes3.dex */
public interface inv {

    /* compiled from: IHomeFragmentTopBar.kt */
    public static final class a {
        public final boolean a;
        public final boolean b;
        public final String c;
        public final gzs<s3q0> d;
        public final gzs<s3q0> e;
        public final gzs<Boolean> f;
        public final boolean g;
        public final gzs<s3q0> h;
        public final gzs<s3q0> i;
        public final wzs<Integer, Integer, s3q0> j;
        public final gzs<Boolean> k;

        public a() {
            this(0);
        }

        public static a a(a aVar, String str, boolean z, int i) {
            boolean z2 = aVar.a;
            boolean z3 = aVar.b;
            if ((i & 4) != 0) {
                str = aVar.c;
            }
            String str2 = str;
            gzs<s3q0> gzsVar = aVar.d;
            gzs<s3q0> gzsVar2 = aVar.e;
            gzs<Boolean> gzsVar3 = aVar.f;
            if ((i & 64) != 0) {
                z = aVar.g;
            }
            gzs<s3q0> gzsVar4 = aVar.h;
            gzs<s3q0> gzsVar5 = aVar.i;
            wzs<Integer, Integer, s3q0> wzsVar = aVar.j;
            gzs<Boolean> gzsVar6 = aVar.k;
            aVar.getClass();
            return new a(z2, z3, str2, gzsVar, gzsVar2, gzsVar3, z, gzsVar4, gzsVar5, wzsVar, gzsVar6);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && this.g == aVar.g && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i) && epx.f(this.j, aVar.j) && epx.f(this.k, aVar.k);
        }

        public final int hashCode() {
            int b = qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
            String str = this.c;
            int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
            gzs<s3q0> gzsVar = this.d;
            int hashCode2 = (hashCode + (gzsVar == null ? 0 : gzsVar.hashCode())) * 31;
            gzs<s3q0> gzsVar2 = this.e;
            int hashCode3 = (hashCode2 + (gzsVar2 == null ? 0 : gzsVar2.hashCode())) * 31;
            gzs<Boolean> gzsVar3 = this.f;
            int b2 = qoy.b((hashCode3 + (gzsVar3 == null ? 0 : gzsVar3.hashCode())) * 31, 31, this.g);
            gzs<s3q0> gzsVar4 = this.h;
            int hashCode4 = (b2 + (gzsVar4 == null ? 0 : gzsVar4.hashCode())) * 31;
            gzs<s3q0> gzsVar5 = this.i;
            int hashCode5 = (hashCode4 + (gzsVar5 == null ? 0 : gzsVar5.hashCode())) * 31;
            wzs<Integer, Integer, s3q0> wzsVar = this.j;
            return this.k.hashCode() + ((hashCode5 + (wzsVar != null ? wzsVar.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TopBarParams(isBackButtonVisible=");
            sb.append(this.a);
            sb.append(", isUserPhotoVisible=");
            sb.append(this.b);
            sb.append(", avatarUrl=");
            sb.append(this.c);
            sb.append(", navIconClickListener=");
            sb.append(this.d);
            sb.append(", userPhotoClickListener=");
            sb.append(this.e);
            sb.append(", userPhotoLongClickListener=");
            sb.append(this.f);
            sb.append(", isSearchVisible=");
            sb.append(this.g);
            sb.append(", notificationsClickListener=");
            sb.append(this.h);
            sb.append(", searchClickListener=");
            sb.append(this.i);
            sb.append(", postingClickListener=");
            sb.append(this.j);
            sb.append(", isTopBarHintApplicable=");
            return uf3.d(sb, this.k, ')');
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(boolean z, boolean z2, String str, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, gzs<Boolean> gzsVar3, boolean z3, gzs<s3q0> gzsVar4, gzs<s3q0> gzsVar5, wzs<? super Integer, ? super Integer, s3q0> wzsVar, gzs<Boolean> gzsVar6) {
            this.a = z;
            this.b = z2;
            this.c = str;
            this.d = gzsVar;
            this.e = gzsVar2;
            this.f = gzsVar3;
            this.g = z3;
            this.h = gzsVar4;
            this.i = gzsVar5;
            this.j = wzsVar;
            this.k = gzsVar6;
        }

        public /* synthetic */ a(int i) {
            this(false, false, null, null, null, null, false, null, null, null, new c24(0));
        }
    }

    void a(FragmentActivity fragmentActivity, f5z f5zVar, a aVar);

    void b();

    RectF c();

    default Integer d() {
        return null;
    }

    void e(Context context, v6j v6jVar);

    void f(boolean z);

    void h(String str, boolean z, xis xisVar);

    void i(int i);

    void j(int i, boolean z);
}
