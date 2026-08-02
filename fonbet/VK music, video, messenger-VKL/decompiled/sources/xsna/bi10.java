package xsna;

import com.vk.dto.masks.Mask;
import com.vk.dto.masks.MaskSection;

/* compiled from: MasksListItem.kt */
/* loaded from: classes18.dex */
public abstract class bi10 extends zif0 {

    /* compiled from: MasksListItem.kt */
    public static final class a extends bi10 {
        public static final a a = new a();

        @Override // xsna.zif0
        public final int b() {
            return 3;
        }
    }

    /* compiled from: MasksListItem.kt */
    public static final class b extends bi10 {
        public final Mask a;
        public boolean b;

        public b(Mask mask) {
            this.a = mask;
        }

        @Override // xsna.zif0
        public final int b() {
            return 2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "GrouppedMaskItem(mask=" + this.a + ')';
        }
    }

    /* compiled from: MasksListItem.kt */
    public static final class c {
        public final d a;
        public final boolean b;

        public c(d dVar, boolean z) {
            this.a = dVar;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MaskContainer(item=");
            sb.append(this.a);
            sb.append(", isSelected=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: MasksListItem.kt */
    public static final class d extends bi10 {
        public final Mask a;
        public final MaskSection b;
        public final boolean c;

        public d(Mask mask, MaskSection maskSection, boolean z) {
            this.a = mask;
            this.b = maskSection;
            this.c = z;
        }

        @Override // xsna.zif0
        public final int b() {
            return 1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && this.c == dVar.c;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            MaskSection maskSection = this.b;
            return Boolean.hashCode(this.c) + ((hashCode + (maskSection == null ? 0 : maskSection.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MaskItem(mask=");
            sb.append(this.a);
            sb.append(", sectionHeader=");
            sb.append(this.b);
            sb.append(", is3DBadgeVisible=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: MasksListItem.kt */
    public static final class e extends bi10 {
        public static final e a = new e();

        @Override // xsna.zif0
        public final int b() {
            return 4;
        }
    }

    /* compiled from: MasksListItem.kt */
    public static final class f extends bi10 {
        public static final f a = new f();

        @Override // xsna.zif0
        public final int b() {
            return 0;
        }
    }
}
