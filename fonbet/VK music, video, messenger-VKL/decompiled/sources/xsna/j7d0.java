package xsna;

import androidx.compose.runtime.a;

/* compiled from: PrimaryBlock.kt */
/* loaded from: classes17.dex */
public interface j7d0 {

    /* compiled from: PrimaryBlock.kt */
    public static final class a {
        public static fdh a(b bVar, c cVar, androidx.compose.runtime.a aVar) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2092264017, 3072, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlock.Header.Companion.invoke (PrimaryBlock.kt:131)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(82059072, 6, -1, "com.vk.community.design.compose.primaryblock.remember (CommunityPrimaryBlockHeaderImpl.kt:52)");
            }
            Object x = aVar.x();
            if (x == a.C0011a.a) {
                x = new fdh(bVar, cVar);
                aVar.R(x);
            }
            fdh fdhVar = (fdh) x;
            ((zak0) fdhVar.a).setValue(bVar);
            ((zak0) fdhVar.b).setValue(cVar);
            ((zak0) fdhVar.c).setValue(null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return fdhVar;
        }
    }

    /* compiled from: PrimaryBlock.kt */
    public interface b extends j7d0 {

        /* compiled from: PrimaryBlock.kt */
        public static abstract class a implements b {
        }

        /* compiled from: PrimaryBlock.kt */
        /* renamed from: xsna.j7d0$b$b, reason: collision with other inner class name */
        public static abstract class AbstractC3109b implements b {
        }
    }

    /* compiled from: PrimaryBlock.kt */
    public interface c extends j7d0 {

        /* compiled from: PrimaryBlock.kt */
        public static abstract class a implements c {
        }

        /* compiled from: PrimaryBlock.kt */
        public static abstract class b implements c {

            /* compiled from: PrimaryBlock.kt */
            public static final class a {
                public final boolean a;
                public final boolean b;
                public final boolean c;

                public a() {
                    this(false, false, false);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("ViewSettingsItems(isShowAddItemBtn=");
                    sb.append(this.a);
                    sb.append(", isShowAddAlbumBtn=");
                    sb.append(this.b);
                    sb.append(", isShowViewSettingsBtn=");
                    return defpackage.q0.a(sb, this.c, ')');
                }

                public a(boolean z, boolean z2, boolean z3) {
                    this.a = z;
                    this.b = z2;
                    this.c = z3;
                }
            }
        }
    }

    void a(q630 q630Var, androidx.compose.runtime.a aVar, int i);
}
