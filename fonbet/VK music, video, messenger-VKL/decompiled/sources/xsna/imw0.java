package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.im.ui.views.avatars.a;
import java.util.ArrayList;

/* compiled from: VoipChangeNameViewState.kt */
/* loaded from: classes7.dex */
public final class imw0 implements ao50 {
    public final fi50 a;

    /* compiled from: VoipChangeNameViewState.kt */
    public static abstract class a {

        /* compiled from: VoipChangeNameViewState.kt */
        /* renamed from: xsna.imw0$a$a, reason: collision with other inner class name */
        public static final class C3063a {
            public final String a;
            public final boolean b;
            public final tlo0 c;
            public final String d;
            public final b e;
            public final boolean f;
            public final boolean g;

            public C3063a(String str, boolean z, tlo0 tlo0Var, String str2, b bVar, boolean z2, boolean z3) {
                this.a = str;
                this.b = z;
                this.c = tlo0Var;
                this.d = str2;
                this.e = bVar;
                this.f = z2;
                this.g = z3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3063a)) {
                    return false;
                }
                C3063a c3063a = (C3063a) obj;
                return epx.f(this.a, c3063a.a) && this.b == c3063a.b && epx.f(this.c, c3063a.c) && epx.f(this.d, c3063a.d) && epx.f(this.e, c3063a.e) && this.f == c3063a.f && this.g == c3063a.g;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.g) + qoy.b((this.e.hashCode() + urd0.a(com.vk.movika.sdk.base.model.history.b.a(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ChangeNameBlock(name=");
                sb.append(this.a);
                sb.append(", isChangeNameEnabled=");
                sb.append(this.b);
                sb.append(", hintText=");
                sb.append(this.c);
                sb.append(", changeNameBlockDescriptionName=");
                sb.append(this.d);
                sb.append(", changeNameValidationError=");
                sb.append(this.e);
                sb.append(", isSaveBtnEnabled=");
                sb.append(this.f);
                sb.append(", isChangeNameFeatureEnabled=");
                return defpackage.q0.a(sb, this.g, ')');
            }
        }

        /* compiled from: VoipChangeNameViewState.kt */
        public static abstract class b {

            /* compiled from: VoipChangeNameViewState.kt */
            /* renamed from: xsna.imw0$a$b$a, reason: collision with other inner class name */
            public static final class C3064a extends b {
                public static final C3064a a = new C3064a();
            }

            /* compiled from: VoipChangeNameViewState.kt */
            /* renamed from: xsna.imw0$a$b$b, reason: collision with other inner class name */
            public static final class C3065b extends b {
                public static final C3065b a = new C3065b();
            }
        }

        /* compiled from: VoipChangeNameViewState.kt */
        public static final class c extends a {
            public final Throwable a;

            public c(Throwable th) {
                this.a = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(throwable="), this.a, ')');
            }
        }

        /* compiled from: VoipChangeNameViewState.kt */
        public static abstract class d implements hfz {

            /* compiled from: VoipChangeNameViewState.kt */
            /* renamed from: xsna.imw0$a$d$a, reason: collision with other inner class name */
            public static final class C3066a extends d {
                public final boolean b;

                public C3066a(boolean z) {
                    this.b = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C3066a) && this.b == ((C3066a) obj).b;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.b);
                }

                @Override // xsna.imw0.a.d
                public final boolean p() {
                    return this.b;
                }

                public final String toString() {
                    return defpackage.q0.a(new StringBuilder("Anonym(isSelected="), this.b, ')');
                }
            }

            /* compiled from: VoipChangeNameViewState.kt */
            public static final class b extends d {
                public final boolean b;
                public final a.b.C1179b c;
                public final ImageList d;
                public final boolean e;
                public final String f;

                public b(ImageList imageList, a.b.C1179b c1179b, String str, boolean z, boolean z2) {
                    this.b = z;
                    this.c = c1179b;
                    this.d = imageList;
                    this.e = z2;
                    this.f = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return this.b == bVar.b && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && this.e == bVar.e && epx.f(this.f, bVar.f);
                }

                public final int hashCode() {
                    int hashCode = Boolean.hashCode(this.b) * 31;
                    a.b.C1179b c1179b = this.c;
                    return this.f.hashCode() + qoy.b(fw3.a((hashCode + (c1179b == null ? 0 : c1179b.a.hashCode())) * 31, 31, this.d.b), 31, this.e);
                }

                @Override // xsna.imw0.a.d
                public final boolean p() {
                    return this.b;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("CurrentUser(isSelected=");
                    sb.append(this.b);
                    sb.append(", placeholderSource=");
                    sb.append(this.c);
                    sb.append(", image=");
                    sb.append(this.d);
                    sb.append(", imageIsNft=");
                    sb.append(this.e);
                    sb.append(", name=");
                    return ho8.a(sb, this.f, ')');
                }
            }

            /* compiled from: VoipChangeNameViewState.kt */
            public static final class c extends d {
                public final boolean b;
                public final UserId c;
                public final ImageList d;
                public final boolean e;
                public final String f;

                public c(UserId userId, ImageList imageList, String str, boolean z, boolean z2) {
                    this.b = z;
                    this.c = userId;
                    this.d = imageList;
                    this.e = z2;
                    this.f = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return this.b == cVar.b && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && this.e == cVar.e && epx.f(this.f, cVar.f);
                }

                @Override // xsna.imw0.a.d, xsna.hfz
                public final Number getItemId() {
                    return Integer.valueOf(Long.hashCode(this.c.b));
                }

                public final int hashCode() {
                    return this.f.hashCode() + qoy.b(fw3.a(bh10.a(Boolean.hashCode(this.b) * 31, 31, this.c.b), 31, this.d.b), 31, this.e);
                }

                @Override // xsna.imw0.a.d
                public final boolean p() {
                    return this.b;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Group(isSelected=");
                    sb.append(this.b);
                    sb.append(", id=");
                    sb.append(this.c);
                    sb.append(", image=");
                    sb.append(this.d);
                    sb.append(", imageIsNft=");
                    sb.append(this.e);
                    sb.append(", name=");
                    return ho8.a(sb, this.f, ')');
                }
            }

            @Override // xsna.hfz
            public Number getItemId() {
                return 0;
            }

            public abstract boolean p();
        }

        /* compiled from: VoipChangeNameViewState.kt */
        public static final class e extends a {
            public static final e a = new e();
        }

        /* compiled from: VoipChangeNameViewState.kt */
        public static final class f extends a {
            public final ArrayList a;
            public final C3063a b;
            public final boolean c;
            public final boolean d;

            public f(ArrayList arrayList, C3063a c3063a, boolean z, boolean z2) {
                this.a = arrayList;
                this.b = c3063a;
                this.c = z;
                this.d = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return epx.f(this.a, fVar.a) && epx.f(this.b, fVar.b) && this.c == fVar.c && this.d == fVar.d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d) + qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Visible(items=");
                sb.append(this.a);
                sb.append(", changeNameBlock=");
                sb.append(this.b);
                sb.append(", isLoading=");
                sb.append(this.c);
                sb.append(", shouldShowSelectItems=");
                return defpackage.q0.a(sb, this.d, ')');
            }
        }
    }

    /* compiled from: VoipChangeNameViewState.kt */
    public static final class b implements fm50<emw0> {
        public final yzt0<a> a;

        public b(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }
    }

    public imw0(fi50 fi50Var) {
        this.a = fi50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof imw0) && this.a.equals(((imw0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return j8.b(new StringBuilder("VoipChangeNameViewState(scene="), this.a, ')');
    }
}
