package xsna;

import com.vk.ecomm.cart.impl.checkout.feature.state.FieldKey;
import com.vk.ecomm.cart.impl.checkout.feature.state.InputField;
import com.vk.ecomm.cart.impl.checkout.ui.items.IslandPart;

/* compiled from: InputFieldItem.kt */
/* loaded from: classes18.dex */
public final class u1x implements k7r {
    public final FieldKey b;
    public final IslandPart c;
    public final boolean d;
    public final String e;
    public final b f;
    public final String g;
    public final String h;
    public final boolean i;
    public final a j;
    public final InputField.InputType k;

    /* compiled from: InputFieldItem.kt */
    public interface a {

        /* compiled from: InputFieldItem.kt */
        /* renamed from: xsna.u1x$a$a, reason: collision with other inner class name */
        public static final class C3781a implements a {
            public final String a;

            public C3781a(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3781a) && epx.f(this.a, ((C3781a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Done(caption="), this.a, ')');
            }
        }

        /* compiled from: InputFieldItem.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1161165916;
            }

            public final String toString() {
                return "None";
            }
        }
    }

    /* compiled from: InputFieldItem.kt */
    public interface b {

        /* compiled from: InputFieldItem.kt */
        public static final class a implements b {
            public final String a;

            public a(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Error(message="), this.a, ')');
            }
        }

        /* compiled from: InputFieldItem.kt */
        /* renamed from: xsna.u1x$b$b, reason: collision with other inner class name */
        public static final class C3782b implements b {
            public static final C3782b a = new C3782b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3782b);
            }

            public final int hashCode() {
                return 821584326;
            }

            public final String toString() {
                return "Normal";
            }
        }

        /* compiled from: InputFieldItem.kt */
        public static final class c implements b {
            public final String a;

            public c(String str) {
                this.a = str;
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
                return ho8.a(new StringBuilder("Valid(message="), this.a, ')');
            }
        }
    }

    public u1x(FieldKey fieldKey, IslandPart islandPart, boolean z, String str, b bVar, String str2, String str3, boolean z2, a aVar, InputField.InputType inputType, int i) {
        aVar = (i & 256) != 0 ? a.b.a : aVar;
        inputType = (i & 512) != 0 ? null : inputType;
        this.b = fieldKey;
        this.c = islandPart;
        this.d = z;
        this.e = str;
        this.f = bVar;
        this.g = str2;
        this.h = str3;
        this.i = z2;
        this.j = aVar;
        this.k = inputType;
    }

    @Override // xsna.k7r
    public final IslandPart U0() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1x)) {
            return false;
        }
        u1x u1xVar = (u1x) obj;
        return epx.f(this.b, u1xVar.b) && this.c == u1xVar.c && this.d == u1xVar.d && epx.f(this.e, u1xVar.e) && epx.f(this.f, u1xVar.f) && epx.f(this.g, u1xVar.g) && epx.f(this.h, u1xVar.h) && this.i == u1xVar.i && epx.f(this.j, u1xVar.j) && this.k == u1xVar.k;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    @Override // xsna.k7r
    public final FieldKey getKey() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + urd0.a(qoy.b((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d), 31, this.e)) * 31;
        String str = this.g;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int hashCode3 = (this.j.hashCode() + qoy.b((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.i)) * 31;
        InputField.InputType inputType = this.k;
        return hashCode3 + (inputType != null ? inputType.hashCode() : 0);
    }

    public final String toString() {
        return "InputFieldItem(key=" + this.b + ", islandPart=" + this.c + ", isRequired=" + this.d + ", subhead=" + this.e + ", state=" + this.f + ", value=" + this.g + ", placeholder=" + this.h + ", isSingleLine=" + this.i + ", editAction=" + this.j + ", inputType=" + this.k + ')';
    }
}
