package xsna;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PostStickerViewState.kt */
/* loaded from: classes15.dex */
public final class b8c0 {
    public final c a;
    public final b b;
    public final f c;
    public final e d;
    public final a e;

    /* compiled from: PostStickerViewState.kt */
    public static final class a {
        public final boolean a;
        public final int b;
        public final float c;
        public final int d;
        public final int e;
        public final q7c0 f;
        public final boolean g;
        public final int h;

        public a(boolean z, int i, float f, int i2, int i3, q7c0 q7c0Var, boolean z2, int i4) {
            this.a = z;
            this.b = i;
            this.c = f;
            this.d = i2;
            this.e = i3;
            this.f = q7c0Var;
            this.g = z2;
            this.h = i4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && Float.compare(this.c, aVar.c) == 0 && this.d == aVar.d && this.e == aVar.e && epx.f(this.f, aVar.f) && this.g == aVar.g && this.h == aVar.h;
        }

        public final int hashCode() {
            int a = shy.a(this.e, shy.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, shy.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31), 31), 31);
            q7c0 q7c0Var = this.f;
            return Integer.hashCode(this.h) + qoy.b((a + (q7c0Var == null ? 0 : q7c0Var.hashCode())) * 31, 31, this.g);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AttachmentsState(isBackgroundVisible=");
            sb.append(this.a);
            sb.append(", backgroundColor=");
            sb.append(this.b);
            sb.append(", backgroundElevation=");
            sb.append(this.c);
            sb.append(", containerHorizontalPadding=");
            sb.append(this.d);
            sb.append(", containerVerticalPadding=");
            sb.append(this.e);
            sb.append(", mainAttachmentType=");
            sb.append(this.f);
            sb.append(", isAdditionalAttachmentsCountVisible=");
            sb.append(this.g);
            sb.append(", additionalAttachmentsCount=");
            return vu5.b(sb, this.h, ')');
        }
    }

    /* compiled from: PostStickerViewState.kt */
    public static final class b {
        public final boolean a;
        public final d b;
        public final List<d> c;
        public final int d;
        public final Integer e;
        public final int f;
        public final int g;
        public final int h;
        public final boolean i;

        public b(boolean z, d dVar, ArrayList arrayList, int i, Integer num, int i2, int i3, int i4, boolean z2) {
            this.a = z;
            this.b = dVar;
            this.c = arrayList;
            this.d = i;
            this.e = num;
            this.f = i2;
            this.g = i3;
            this.h = i4;
            this.i = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b.equals(bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d && epx.f(this.e, bVar.e) && this.f == bVar.f && this.g == bVar.g && this.h == bVar.h && this.i == bVar.i;
        }

        public final int hashCode() {
            int hashCode = (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31;
            List<d> list = this.c;
            int a = shy.a(this.d, (hashCode + (list == null ? 0 : list.hashCode())) * 31, 31);
            Integer num = this.e;
            return shy.a(0, shy.a(0, qoy.b(shy.a(this.h, shy.a(this.g, shy.a(0, shy.a(this.f, (a + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31), 31), 31, this.i), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AuthorState(isVisible=");
            sb.append(this.a);
            sb.append(", nameState=");
            sb.append(this.b);
            sb.append(", coauthorNameStateList=");
            sb.append(this.c);
            sb.append(", nameColor=");
            sb.append(this.d);
            sb.append(", nameStyle=");
            sb.append(this.e);
            sb.append(", nameBottomPadding=");
            sb.append(this.f);
            sb.append(", nameTopPadding=0, nameStartPadding=");
            sb.append(this.g);
            sb.append(", nameEndPadding=");
            sb.append(this.h);
            sb.append(", isIconVisible=");
            return n23.b(sb, this.i, ", iconResId=0, prefixResId=0, currentAccountName=)");
        }
    }

    /* compiled from: PostStickerViewState.kt */
    public static final class c {
        public final int a;
        public final int b;
        public final boolean c;

        public c(int i, int i2, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + qoy.b(shy.a(this.b, qoy.b(Integer.hashCode(this.a) * 31, 31, true), 31), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FullContainerState(backgroundColor=");
            sb.append(this.a);
            sb.append(", isBackgroundVisible=true, bottomSeparatorHeight=");
            sb.append(this.b);
            sb.append(", isVisible=");
            return n23.b(sb, this.c, ", isFullscreen=false)");
        }
    }

    /* compiled from: PostStickerViewState.kt */
    public static final class d {
        public final String a;
        public final Drawable b;
        public final String c;

        public d(String str, Drawable drawable, String str2) {
            this.a = str;
            this.b = drawable;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Drawable drawable = this.b;
            return this.c.hashCode() + ((hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NameState(name=");
            sb.append(this.a);
            sb.append(", verifiedDrawable=");
            sb.append(this.b);
            sb.append(", avatarIconUrl=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: PostStickerViewState.kt */
    public static final class e {
        public final boolean a;
        public final b b;
        public final f c;
        public final a d;

        public e(boolean z, b bVar, f fVar, a aVar) {
            this.a = z;
            this.b = bVar;
            this.c = fVar;
            this.d = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c) && epx.f(this.d, eVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "RepostState(isVisible=" + this.a + ", authorState=" + this.b + ", textState=" + this.c + ", attachmentsState=" + this.d + ')';
        }
    }

    /* compiled from: PostStickerViewState.kt */
    public static final class f {
        public final CharSequence a;
        public final int b;
        public final float c;
        public final int d;
        public final boolean e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final float j;
        public final boolean k;

        public f(CharSequence charSequence, int i, float f, int i2, boolean z, int i3, int i4, int i5, int i6, float f2, boolean z2) {
            this.a = charSequence;
            this.b = i;
            this.c = f;
            this.d = i2;
            this.e = z;
            this.f = i3;
            this.g = i4;
            this.h = i5;
            this.i = i6;
            this.j = f2;
            this.k = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.a, fVar.a) && this.b == fVar.b && Float.compare(this.c, fVar.c) == 0 && this.d == fVar.d && this.e == fVar.e && this.f == fVar.f && this.g == fVar.g && this.h == fVar.h && this.i == fVar.i && Float.compare(this.j, fVar.j) == 0 && this.k == fVar.k;
        }

        public final int hashCode() {
            CharSequence charSequence = this.a;
            return Boolean.hashCode(false) + qoy.b(io.reactivex.rxjava3.subjects.b.a(this.j, shy.a(this.i, shy.a(this.h, shy.a(this.g, shy.a(this.f, qoy.b(shy.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, shy.a(this.b, (charSequence == null ? 0 : charSequence.hashCode()) * 31, 31), 31), 31), 31, this.e), 31), 31), 31), 31), 31), 31, this.k);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TextState(text=");
            sb.append((Object) this.a);
            sb.append(", textColor=");
            sb.append(this.b);
            sb.append(", textSize=");
            sb.append(this.c);
            sb.append(", textMaxLines=");
            sb.append(this.d);
            sb.append(", isBackgroundVisible=");
            sb.append(this.e);
            sb.append(", backgroundColor=");
            sb.append(this.f);
            sb.append(", backgroundTopPadding=");
            sb.append(this.g);
            sb.append(", backgroundBottomPadding=");
            sb.append(this.h);
            sb.append(", backgroundHorizontalPadding=");
            sb.append(this.i);
            sb.append(", backgroundElevation=");
            sb.append(this.j);
            sb.append(", isVisible=");
            return n23.b(sb, this.k, ", isOnlyText=false)");
        }
    }

    public b8c0(c cVar, b bVar, f fVar, e eVar, a aVar) {
        this.a = cVar;
        this.b = bVar;
        this.c = fVar;
        this.d = eVar;
        this.e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8c0)) {
            return false;
        }
        b8c0 b8c0Var = (b8c0) obj;
        return epx.f(this.a, b8c0Var.a) && epx.f(this.b, b8c0Var.b) && epx.f(this.c, b8c0Var.c) && epx.f(this.d, b8c0Var.d) && epx.f(this.e, b8c0Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        e eVar = this.d;
        return this.e.hashCode() + ((hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31);
    }

    public final String toString() {
        return "PostStickerViewState(fullContainerState=" + this.a + ", authorState=" + this.b + ", textState=" + this.c + ", repostState=" + this.d + ", attachmentsState=" + this.e + ')';
    }
}
