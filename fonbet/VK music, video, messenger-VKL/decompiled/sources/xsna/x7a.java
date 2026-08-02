package xsna;

import com.vk.superapp.api.dto.app.catalog.CustomItem;
import com.vk.superapp.api.dto.app.catalog.SectionAppItem;
import com.vk.superapp.api.dto.app.catalog.SectionHeader;
import com.vk.superapp.api.dto.app.catalog.footer.UserStackFooter;
import com.vk.superapp.api.dto.app.catalog.section.AppCard;
import com.vk.superapp.api.dto.app.catalog.section.AppsCategory;
import com.vk.superapp.catalog.api.v2.adapter.BlockType;
import java.util.List;

/* compiled from: CatalogItem.kt */
/* loaded from: classes6.dex */
public abstract class x7a {
    public final int a;
    public boolean b;
    public BlockType c = BlockType.MIDDLE;

    /* compiled from: CatalogItem.kt */
    public static abstract class a extends x7a {

        /* compiled from: CatalogItem.kt */
        /* renamed from: xsna.x7a$a$a, reason: collision with other inner class name */
        public static final class C3978a extends a {
            public final UserStackFooter d;
            public final AppCard e;

            public C3978a(UserStackFooter userStackFooter, AppCard appCard) {
                super(10);
                this.c = BlockType.BOTTOM;
                this.d = userStackFooter;
                this.e = appCard;
            }

            @Override // xsna.x7a
            public final boolean a(x7a x7aVar) {
                if (!(x7aVar instanceof C3978a)) {
                    return false;
                }
                C3978a c3978a = (C3978a) x7aVar;
                return epx.f(c3978a.d, this.d) && epx.f(c3978a.e, this.e);
            }

            @Override // xsna.x7a
            public final boolean b(x7a x7aVar) {
                return (x7aVar instanceof C3978a) && epx.f(((C3978a) x7aVar).d, this.d);
            }
        }
    }

    /* compiled from: CatalogItem.kt */
    public static abstract class b extends x7a {
        public final int d;
        public final String e;
        public final String f;
        public final SectionHeader g;

        /* compiled from: CatalogItem.kt */
        public static final class a extends b {
            @Override // xsna.x7a.b, xsna.x7a
            public final boolean a(x7a x7aVar) {
                return (x7aVar instanceof a) && super.a(x7aVar);
            }

            @Override // xsna.x7a.b, xsna.x7a
            public final boolean b(x7a x7aVar) {
                return (x7aVar instanceof a) && super.b(x7aVar);
            }
        }

        /* compiled from: CatalogItem.kt */
        /* renamed from: xsna.x7a$b$b, reason: collision with other inner class name */
        public static final class C3979b extends b {
            @Override // xsna.x7a.b, xsna.x7a
            public final boolean a(x7a x7aVar) {
                return (x7aVar instanceof C3979b) && super.a(x7aVar);
            }

            @Override // xsna.x7a.b, xsna.x7a
            public final boolean b(x7a x7aVar) {
                return (x7aVar instanceof C3979b) && super.b(x7aVar);
            }
        }

        /* compiled from: CatalogItem.kt */
        public static final class c extends b {
            @Override // xsna.x7a.b, xsna.x7a
            public final boolean a(x7a x7aVar) {
                return (x7aVar instanceof c) && super.a(x7aVar);
            }

            @Override // xsna.x7a.b, xsna.x7a
            public final boolean b(x7a x7aVar) {
                return (x7aVar instanceof c) && super.b(x7aVar);
            }
        }

        public b(int i, String str, String str2, SectionHeader sectionHeader, int i2) {
            super(i2);
            this.d = i;
            this.e = str;
            this.f = str2;
            this.g = sectionHeader;
            this.c = BlockType.TOP;
        }

        @Override // xsna.x7a
        public boolean a(x7a x7aVar) {
            return (x7aVar instanceof b) && epx.f(((b) x7aVar).g, this.g);
        }

        @Override // xsna.x7a
        public boolean b(x7a x7aVar) {
            return (x7aVar instanceof b) && ((b) x7aVar).d == this.d;
        }
    }

    /* compiled from: CatalogItem.kt */
    public static final class c extends x7a {
        public final int d;
        public final boolean e;
        public final boolean f;
        public final boolean g;

        public /* synthetic */ c(int i) {
            this(true, i, true, false);
        }

        public static c c(c cVar, boolean z) {
            int i = cVar.d;
            boolean z2 = cVar.e;
            boolean z3 = cVar.f;
            cVar.getClass();
            return new c(z2, i, z3, z);
        }

        @Override // xsna.x7a
        public final boolean a(x7a x7aVar) {
            return (x7aVar instanceof c) && x7aVar.equals(this);
        }

        @Override // xsna.x7a
        public final boolean b(x7a x7aVar) {
            return x7aVar instanceof c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.d == cVar.d && this.e == cVar.e && this.f == cVar.f && this.g == cVar.g;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.g) + qoy.b(qoy.b(Integer.hashCode(this.d) * 31, 31, this.e), 31, this.f);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LoadingStub(rowsCount=");
            sb.append(this.d);
            sb.append(", withHeader=");
            sb.append(this.e);
            sb.append(", withIndicator=");
            sb.append(this.f);
            sb.append(", animated=");
            return defpackage.q0.a(sb, this.g, ')');
        }

        public c(boolean z, int i, boolean z2, boolean z3) {
            super(1000);
            this.d = i;
            this.e = z;
            this.f = z2;
            this.g = z3;
            this.c = BlockType.TOP;
        }
    }

    /* compiled from: CatalogItem.kt */
    public static abstract class d extends x7a {
        public final String d;

        /* compiled from: CatalogItem.kt */
        public static final class a extends d {
            public final AppCard e;

            public a(AppCard appCard, String str) {
                super(str, 6);
                this.e = appCard;
            }

            @Override // xsna.x7a
            public final boolean a(x7a x7aVar) {
                if (x7aVar instanceof a) {
                    return epx.f(((a) x7aVar).e, this.e);
                }
                return false;
            }

            @Override // xsna.x7a
            public final boolean b(x7a x7aVar) {
                return (x7aVar instanceof a) && epx.f(((a) x7aVar).e, this.e);
            }
        }

        /* compiled from: CatalogItem.kt */
        public static final class b extends d {
            public final AppsCategory e;
            public final int f;

            /* compiled from: CatalogItem.kt */
            public static final class a extends x7a {
                static {
                    new a().c = BlockType.BOTTOM;
                }

                public a() {
                    super(999);
                }

                @Override // xsna.x7a
                public final boolean a(x7a x7aVar) {
                    return x7aVar instanceof a;
                }

                @Override // xsna.x7a
                public final boolean b(x7a x7aVar) {
                    return x7aVar instanceof a;
                }
            }

            public b(AppsCategory appsCategory, int i, String str) {
                super(str, 4);
                this.e = appsCategory;
                this.f = i;
            }

            @Override // xsna.x7a
            public final boolean a(x7a x7aVar) {
                if (x7aVar instanceof b) {
                    return epx.f(((b) x7aVar).e, this.e);
                }
                return false;
            }

            @Override // xsna.x7a
            public final boolean b(x7a x7aVar) {
                return (x7aVar instanceof b) && epx.f(((b) x7aVar).e, this.e);
            }
        }

        /* compiled from: CatalogItem.kt */
        public static abstract class c extends d {

            /* compiled from: CatalogItem.kt */
            public static final class a extends c {
                public final int e;
                public final List<AppCard> f;

                public a(int i, List<AppCard> list, String str) {
                    super(str, 5);
                    this.e = i;
                    this.f = list;
                }

                @Override // xsna.x7a
                public final boolean a(x7a x7aVar) {
                    if (x7aVar instanceof a) {
                        return epx.f(((a) x7aVar).f, this.f);
                    }
                    return false;
                }

                @Override // xsna.x7a
                public final boolean b(x7a x7aVar) {
                    return (x7aVar instanceof a) && ((a) x7aVar).e == this.e;
                }
            }

            /* compiled from: CatalogItem.kt */
            public static final class b extends c {
                public final int e;
                public final List<SectionAppItem> f;

                public b(int i, List<SectionAppItem> list, String str) {
                    super(str, 7);
                    this.e = i;
                    this.f = list;
                }

                @Override // xsna.x7a
                public final boolean a(x7a x7aVar) {
                    if (x7aVar instanceof b) {
                        return epx.f(((b) x7aVar).f, this.f);
                    }
                    return false;
                }

                @Override // xsna.x7a
                public final boolean b(x7a x7aVar) {
                    return (x7aVar instanceof b) && ((b) x7aVar).e == this.e;
                }
            }

            /* compiled from: CatalogItem.kt */
            /* renamed from: xsna.x7a$d$c$c, reason: collision with other inner class name */
            public static final class C3980c extends c {
                public final int e;
                public final List<SectionAppItem> f;

                public C3980c(int i, List<SectionAppItem> list, String str) {
                    super(str, 8);
                    this.e = i;
                    this.f = list;
                }

                @Override // xsna.x7a
                public final boolean a(x7a x7aVar) {
                    if (x7aVar instanceof C3980c) {
                        return epx.f(((C3980c) x7aVar).f, this.f);
                    }
                    return false;
                }

                @Override // xsna.x7a
                public final boolean b(x7a x7aVar) {
                    return (x7aVar instanceof C3980c) && ((C3980c) x7aVar).e == this.e;
                }
            }
        }

        /* compiled from: CatalogItem.kt */
        /* renamed from: xsna.x7a$d$d, reason: collision with other inner class name */
        public static final class C3981d extends d {
            public final int e;
            public final int f;
            public final List<CustomItem> g;

            public C3981d(int i, int i2, List<CustomItem> list, String str) {
                super(str, 3);
                this.e = i;
                this.f = i2;
                this.g = list;
            }

            @Override // xsna.x7a
            public final boolean a(x7a x7aVar) {
                if (!(x7aVar instanceof C3981d)) {
                    return false;
                }
                C3981d c3981d = (C3981d) x7aVar;
                return c3981d.e == this.e && epx.f(c3981d.g, this.g) && c3981d.f == this.f;
            }

            @Override // xsna.x7a
            public final boolean b(x7a x7aVar) {
                return (x7aVar instanceof C3981d) && ((C3981d) x7aVar).e == this.e;
            }
        }

        /* compiled from: CatalogItem.kt */
        public static final class e extends d {
            public final SectionAppItem e;

            public e(SectionAppItem sectionAppItem, String str) {
                super(str, 9);
                this.e = sectionAppItem;
            }

            @Override // xsna.x7a
            public final boolean a(x7a x7aVar) {
                if (x7aVar instanceof e) {
                    return epx.f(((e) x7aVar).e, this.e);
                }
                return false;
            }

            @Override // xsna.x7a
            public final boolean b(x7a x7aVar) {
                return (x7aVar instanceof e) && epx.f(((e) x7aVar).e, this.e);
            }
        }

        public d(String str, int i) {
            super(i);
            this.d = str;
        }
    }

    public x7a(int i) {
        this.a = i;
    }

    public abstract boolean a(x7a x7aVar);

    public abstract boolean b(x7a x7aVar);
}
