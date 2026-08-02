package xsna;

import android.net.Uri;
import com.vk.dto.common.id.UserId;
import java.io.File;

/* compiled from: UploadingState.kt */
/* loaded from: classes17.dex */
public interface ceq0 {

    /* compiled from: UploadingState.kt */
    public static abstract class a implements ceq0 {
        public final boolean a;

        /* compiled from: UploadingState.kt */
        /* renamed from: xsna.ceq0$a$a, reason: collision with other inner class name */
        public static final class C2662a extends a implements obq0 {
            public final xdd b;
            public final UserId c;
            public final String d;
            public final int e;

            public C2662a(xdd xddVar) {
                super(xddVar.j > 0);
                this.b = xddVar;
                this.c = xddVar.h;
                File file = xddVar.c.a;
                this.d = String.valueOf(file != null ? Uri.fromFile(file) : null);
                this.e = xddVar.a;
            }

            @Override // xsna.ceq0
            public final String a() {
                return this.d;
            }

            @Override // xsna.ceq0
            public final int b() {
                return this.e;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2662a) && epx.f(this.b, ((C2662a) obj).b);
            }

            @Override // xsna.obq0
            public final xdd g() {
                return this.b;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            @Override // xsna.ceq0
            public final UserId q() {
                return this.c;
            }

            public final String toString() {
                return "ClientDoneLegacy(upload=" + this.b + ')';
            }
        }

        /* compiled from: UploadingState.kt */
        public static final class b extends a implements oaq0 {
            public final int b;
            public final boolean c;
            public final UserId d;
            public final String e;
            public final boolean f;

            public b(UserId userId, boolean z, boolean z2, String str, int i) {
                super(z);
                this.b = i;
                this.c = z;
                this.d = userId;
                this.e = str;
                this.f = z2;
            }

            @Override // xsna.ceq0
            public final String a() {
                return this.e;
            }

            @Override // xsna.ceq0
            public final int b() {
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
                return this.b == bVar.b && this.c == bVar.c && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && this.f == bVar.f;
            }

            @Override // xsna.ceq0.a, xsna.ceq0
            public final boolean f() {
                return this.c;
            }

            public final int hashCode() {
                int b = qoy.b(Integer.hashCode(this.b) * 31, 31, this.c);
                UserId userId = this.d;
                int hashCode = (b + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
                String str = this.e;
                return Boolean.hashCode(this.f) + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
            }

            @Override // xsna.ceq0
            public final UserId q() {
                return this.d;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ClientDoneNew(uploadTaskId=");
                sb.append(this.b);
                sb.append(", isPublishDelayed=");
                sb.append(this.c);
                sb.append(", ownerId=");
                sb.append(this.d);
                sb.append(", previewUrl=");
                sb.append(this.e);
                sb.append(", hasMusic=");
                return defpackage.q0.a(sb, this.f, ')');
            }
        }

        public a(boolean z) {
            this.a = z;
        }

        @Override // xsna.ceq0
        public final boolean c() {
            return false;
        }

        @Override // xsna.ceq0
        public final boolean d() {
            return false;
        }

        @Override // xsna.ceq0
        public final boolean e() {
            return true;
        }

        @Override // xsna.ceq0
        public boolean f() {
            return this.a;
        }
    }

    /* compiled from: UploadingState.kt */
    public static final class b implements ceq0, oaq0 {
        public final boolean a;
        public final int b;
        public final UserId c;
        public final String d;
        public final boolean e;

        public b(UserId userId, boolean z, boolean z2, String str, int i) {
            this.a = z;
            this.b = i;
            this.c = userId;
            this.d = str;
            this.e = z2;
        }

        @Override // xsna.ceq0
        public final String a() {
            return this.d;
        }

        @Override // xsna.ceq0
        public final int b() {
            return this.b;
        }

        @Override // xsna.ceq0
        public final boolean c() {
            return false;
        }

        @Override // xsna.ceq0
        public final boolean d() {
            return false;
        }

        @Override // xsna.ceq0
        public final boolean e() {
            return true;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && this.e == bVar.e;
        }

        @Override // xsna.ceq0
        public final boolean f() {
            return this.a;
        }

        public final int hashCode() {
            int a = shy.a(this.b, Boolean.hashCode(this.a) * 31, 31);
            UserId userId = this.c;
            int hashCode = (a + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
            String str = this.d;
            return Boolean.hashCode(this.e) + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
        }

        @Override // xsna.ceq0
        public final UserId q() {
            return this.c;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CoverUploaded(isPublishDelayed=");
            sb.append(this.a);
            sb.append(", uploadTaskId=");
            sb.append(this.b);
            sb.append(", ownerId=");
            sb.append(this.c);
            sb.append(", previewUrl=");
            sb.append(this.d);
            sb.append(", hasMusic=");
            return defpackage.q0.a(sb, this.e, ')');
        }
    }

    /* compiled from: UploadingState.kt */
    public static abstract class c implements ceq0 {

        /* compiled from: UploadingState.kt */
        public static final class a extends c implements obq0 {
            public final xdd a;
            public final int b;
            public final UserId c;
            public final String d;
            public final boolean e;

            public a(xdd xddVar) {
                this.a = xddVar;
                this.b = xddVar.a;
                this.c = xddVar.h;
                File file = xddVar.c.a;
                this.d = String.valueOf(file != null ? Uri.fromFile(file) : null);
                this.e = xddVar.j > 0;
            }

            @Override // xsna.ceq0
            public final String a() {
                return this.d;
            }

            @Override // xsna.ceq0
            public final int b() {
                return this.b;
            }

            @Override // xsna.ceq0
            public final boolean e() {
                return false;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            @Override // xsna.ceq0
            public final boolean f() {
                return this.e;
            }

            @Override // xsna.obq0
            public final xdd g() {
                return this.a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            @Override // xsna.ceq0
            public final UserId q() {
                return this.c;
            }

            public final String toString() {
                return "UploadCancelledLegacy(upload=" + this.a + ')';
            }
        }

        /* compiled from: UploadingState.kt */
        public static final class b extends c implements oaq0 {
            public final int a;
            public final UserId b;
            public final String c;
            public final boolean d;
            public final boolean e;

            public b(UserId userId, boolean z, boolean z2, String str, int i) {
                this.a = i;
                this.b = userId;
                this.c = str;
                this.d = z;
                this.e = z2;
            }

            @Override // xsna.ceq0
            public final String a() {
                return this.c;
            }

            @Override // xsna.ceq0
            public final int b() {
                return this.a;
            }

            @Override // xsna.ceq0
            public final boolean e() {
                return false;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a == bVar.a && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d && this.e == bVar.e;
            }

            @Override // xsna.ceq0
            public final boolean f() {
                return this.d;
            }

            public final int hashCode() {
                int hashCode = Integer.hashCode(this.a) * 31;
                UserId userId = this.b;
                int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
                String str = this.c;
                return Boolean.hashCode(this.e) + qoy.b((hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.d);
            }

            @Override // xsna.ceq0
            public final UserId q() {
                return this.b;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("UploadCancelledNew(uploadTaskId=");
                sb.append(this.a);
                sb.append(", ownerId=");
                sb.append(this.b);
                sb.append(", previewUrl=");
                sb.append(this.c);
                sb.append(", isPublishDelayed=");
                sb.append(this.d);
                sb.append(", hasMusic=");
                return defpackage.q0.a(sb, this.e, ')');
            }
        }

        @Override // xsna.ceq0
        public final boolean c() {
            return false;
        }

        @Override // xsna.ceq0
        public final boolean d() {
            return true;
        }
    }

    /* compiled from: UploadingState.kt */
    public static final class d implements ceq0 {
        public final int a;
        public final boolean b;
        public final boolean c;

        public d(int i, boolean z, boolean z2) {
            this.a = i;
            this.b = z;
            this.c = z2;
        }

        @Override // xsna.ceq0
        public final /* bridge */ /* synthetic */ String a() {
            return null;
        }

        @Override // xsna.ceq0
        public final int b() {
            return this.a;
        }

        @Override // xsna.ceq0
        public final boolean c() {
            return false;
        }

        @Override // xsna.ceq0
        public final boolean d() {
            return false;
        }

        @Override // xsna.ceq0
        public final boolean e() {
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b && this.c == dVar.c;
        }

        @Override // xsna.ceq0
        public final boolean f() {
            return this.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(Integer.hashCode(this.a) * 31, 31, this.b);
        }

        @Override // xsna.ceq0
        public final /* bridge */ /* synthetic */ UserId q() {
            return null;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UploadDeleted(uploadTaskId=");
            sb.append(this.a);
            sb.append(", isPublishDelayed=");
            sb.append(this.b);
            sb.append(", hasMusic=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: UploadingState.kt */
    public static final class e implements ceq0 {
        public final int a;
        public final boolean b;
        public final boolean c;
        public final UserId d;
        public final String e;

        public e(UserId userId, boolean z, boolean z2, String str, int i) {
            this.a = i;
            this.b = z;
            this.c = z2;
            this.d = userId;
            this.e = str;
        }

        @Override // xsna.ceq0
        public final String a() {
            return this.e;
        }

        @Override // xsna.ceq0
        public final int b() {
            return this.a;
        }

        @Override // xsna.ceq0
        public final boolean c() {
            return false;
        }

        @Override // xsna.ceq0
        public final boolean d() {
            return false;
        }

        @Override // xsna.ceq0
        public final boolean e() {
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && this.b == eVar.b && this.c == eVar.c && epx.f(this.d, eVar.d) && epx.f(this.e, eVar.e);
        }

        @Override // xsna.ceq0
        public final boolean f() {
            return this.b;
        }

        public final int hashCode() {
            int b = qoy.b(qoy.b(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
            UserId userId = this.d;
            int hashCode = (b + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
            String str = this.e;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // xsna.ceq0
        public final UserId q() {
            return this.d;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UploadDone(uploadTaskId=");
            sb.append(this.a);
            sb.append(", isPublishDelayed=");
            sb.append(this.b);
            sb.append(", hasMusic=");
            sb.append(this.c);
            sb.append(", ownerId=");
            sb.append(this.d);
            sb.append(", previewUrl=");
            return ho8.a(sb, this.e, ')');
        }
    }

    /* compiled from: UploadingState.kt */
    public static abstract class f implements ceq0 {

        /* compiled from: UploadingState.kt */
        public static final class a extends f implements obq0 {
            public final xdd a;
            public final int b;
            public final UserId c;
            public final String d;
            public final boolean e;

            public a(xdd xddVar) {
                this.a = xddVar;
                this.b = xddVar.a;
                this.c = xddVar.h;
                File file = xddVar.c.a;
                this.d = String.valueOf(file != null ? Uri.fromFile(file) : null);
                this.e = xddVar.j > 0;
            }

            @Override // xsna.ceq0
            public final String a() {
                return this.d;
            }

            @Override // xsna.ceq0
            public final int b() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            @Override // xsna.ceq0
            public final boolean f() {
                return this.e;
            }

            @Override // xsna.obq0
            public final xdd g() {
                return this.a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            @Override // xsna.ceq0
            public final UserId q() {
                return this.c;
            }

            public final String toString() {
                return "UploadFailedLegacy(upload=" + this.a + ')';
            }
        }

        /* compiled from: UploadingState.kt */
        public static final class b extends f implements oaq0 {
            public final int a;
            public final UserId b;
            public final String c;
            public final boolean d;
            public final boolean e;

            public b(UserId userId, boolean z, boolean z2, String str, int i) {
                this.a = i;
                this.b = userId;
                this.c = str;
                this.d = z;
                this.e = z2;
            }

            @Override // xsna.ceq0
            public final String a() {
                return this.c;
            }

            @Override // xsna.ceq0
            public final int b() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a == bVar.a && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d && this.e == bVar.e;
            }

            @Override // xsna.ceq0
            public final boolean f() {
                return this.d;
            }

            public final int hashCode() {
                int hashCode = Integer.hashCode(this.a) * 31;
                UserId userId = this.b;
                int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
                String str = this.c;
                return Boolean.hashCode(this.e) + qoy.b((hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.d);
            }

            @Override // xsna.ceq0
            public final UserId q() {
                return this.b;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("UploadFailedNew(uploadTaskId=");
                sb.append(this.a);
                sb.append(", ownerId=");
                sb.append(this.b);
                sb.append(", previewUrl=");
                sb.append(this.c);
                sb.append(", isPublishDelayed=");
                sb.append(this.d);
                sb.append(", hasMusic=");
                return defpackage.q0.a(sb, this.e, ')');
            }
        }

        @Override // xsna.ceq0
        public final boolean c() {
            return false;
        }

        @Override // xsna.ceq0
        public final boolean d() {
            return true;
        }

        @Override // xsna.ceq0
        public final boolean e() {
            return false;
        }
    }

    /* compiled from: UploadingState.kt */
    public interface g extends ceq0 {

        /* compiled from: UploadingState.kt */
        public static final class a implements g, obq0 {
            public final int a;
            public final xdd b;
            public final int c;
            public final UserId d;
            public final boolean e;
            public final String f;

            public a(int i, xdd xddVar) {
                this.a = i;
                this.b = xddVar;
                this.c = xddVar.a;
                this.d = xddVar.h;
                this.e = xddVar.j > 0;
                File file = xddVar.c.a;
                this.f = String.valueOf(file != null ? Uri.fromFile(file) : null);
            }

            @Override // xsna.ceq0
            public final String a() {
                return this.f;
            }

            @Override // xsna.ceq0
            public final int b() {
                return this.c;
            }

            @Override // xsna.ceq0
            public final boolean c() {
                return true;
            }

            @Override // xsna.ceq0
            public final boolean d() {
                return false;
            }

            @Override // xsna.ceq0
            public final boolean e() {
                return false;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && epx.f(this.b, aVar.b);
            }

            @Override // xsna.ceq0
            public final boolean f() {
                return this.e;
            }

            @Override // xsna.obq0
            public final xdd g() {
                return this.b;
            }

            @Override // xsna.ceq0.g
            public final int getProgress() {
                return this.a;
            }

            public final int hashCode() {
                return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
            }

            @Override // xsna.ceq0
            public final UserId q() {
                return this.d;
            }

            public final String toString() {
                return "UploadProgressLegacy(progress=" + this.a + ", upload=" + this.b + ')';
            }
        }

        /* compiled from: UploadingState.kt */
        public static final class b implements g, oaq0 {
            public final int a;
            public final int b;
            public final UserId c;
            public final String d;
            public final boolean e;
            public final boolean f;

            public b(int i, int i2, UserId userId, String str, boolean z, boolean z2) {
                this.a = i;
                this.b = i2;
                this.c = userId;
                this.d = str;
                this.e = z;
                this.f = z2;
            }

            @Override // xsna.ceq0
            public final String a() {
                return this.d;
            }

            @Override // xsna.ceq0
            public final int b() {
                return this.b;
            }

            @Override // xsna.ceq0
            public final boolean c() {
                return true;
            }

            @Override // xsna.ceq0
            public final boolean d() {
                return false;
            }

            @Override // xsna.ceq0
            public final boolean e() {
                return false;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a == bVar.a && this.b == bVar.b && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && this.e == bVar.e && this.f == bVar.f;
            }

            @Override // xsna.ceq0
            public final boolean f() {
                return this.e;
            }

            @Override // xsna.ceq0.g
            public final int getProgress() {
                return this.a;
            }

            public final int hashCode() {
                int a = shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
                UserId userId = this.c;
                int hashCode = (a + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
                String str = this.d;
                return Boolean.hashCode(this.f) + qoy.b((hashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.e);
            }

            @Override // xsna.ceq0
            public final UserId q() {
                return this.c;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("UploadProgressNew(progress=");
                sb.append(this.a);
                sb.append(", uploadTaskId=");
                sb.append(this.b);
                sb.append(", ownerId=");
                sb.append(this.c);
                sb.append(", previewUrl=");
                sb.append(this.d);
                sb.append(", isPublishDelayed=");
                sb.append(this.e);
                sb.append(", hasMusic=");
                return defpackage.q0.a(sb, this.f, ')');
            }
        }

        int getProgress();
    }

    /* compiled from: UploadingState.kt */
    public static abstract class h implements ceq0 {
        public final String a;
        public final boolean b;
        public final UserId c;

        /* compiled from: UploadingState.kt */
        public static final class a extends h implements obq0 {
            public final xdd d;
            public final int e;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public a(xdd xddVar) {
                super(xddVar.h, String.valueOf(r0 != null ? Uri.fromFile(r0) : null), xddVar.j > 0);
                File file = xddVar.c.a;
                this.d = xddVar;
                this.e = xddVar.a;
            }

            @Override // xsna.ceq0
            public final int b() {
                return this.e;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.d, ((a) obj).d);
            }

            @Override // xsna.obq0
            public final xdd g() {
                return this.d;
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return "UploadStartedLegacy(upload=" + this.d + ')';
            }
        }

        /* compiled from: UploadingState.kt */
        public static final class b extends h implements oaq0 {
            public final int d;
            public final String e;
            public final boolean f;
            public final UserId g;
            public final boolean h;

            public b(UserId userId, boolean z, boolean z2, String str, int i) {
                super(userId, str, z);
                this.d = i;
                this.e = str;
                this.f = z;
                this.g = userId;
                this.h = z2;
            }

            @Override // xsna.ceq0.h, xsna.ceq0
            public final String a() {
                return this.e;
            }

            @Override // xsna.ceq0
            public final int b() {
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
                return this.d == bVar.d && epx.f(this.e, bVar.e) && this.f == bVar.f && epx.f(this.g, bVar.g) && this.h == bVar.h;
            }

            @Override // xsna.ceq0.h, xsna.ceq0
            public final boolean f() {
                return this.f;
            }

            public final int hashCode() {
                int hashCode = Integer.hashCode(this.d) * 31;
                String str = this.e;
                int b = qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
                UserId userId = this.g;
                return Boolean.hashCode(this.h) + ((b + (userId != null ? Long.hashCode(userId.b) : 0)) * 31);
            }

            @Override // xsna.ceq0.h, xsna.ceq0
            public final UserId q() {
                return this.g;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("UploadStartedNew(uploadTaskId=");
                sb.append(this.d);
                sb.append(", previewUrl=");
                sb.append(this.e);
                sb.append(", isPublishDelayed=");
                sb.append(this.f);
                sb.append(", ownerId=");
                sb.append(this.g);
                sb.append(", hasMusic=");
                return defpackage.q0.a(sb, this.h, ')');
            }
        }

        public h(UserId userId, String str, boolean z) {
            this.a = str;
            this.b = z;
            this.c = userId;
        }

        @Override // xsna.ceq0
        public String a() {
            return this.a;
        }

        @Override // xsna.ceq0
        public final boolean c() {
            return false;
        }

        @Override // xsna.ceq0
        public final boolean d() {
            return true;
        }

        @Override // xsna.ceq0
        public final boolean e() {
            return true;
        }

        @Override // xsna.ceq0
        public boolean f() {
            return this.b;
        }

        @Override // xsna.ceq0
        public UserId q() {
            return this.c;
        }
    }

    String a();

    int b();

    boolean c();

    boolean d();

    boolean e();

    boolean f();

    UserId q();
}
