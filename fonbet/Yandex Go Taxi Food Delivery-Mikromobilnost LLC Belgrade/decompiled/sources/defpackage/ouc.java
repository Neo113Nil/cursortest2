package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.promotions.model.Promotion;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Louc;", "", "Companion", "a", "kuc", "luc", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ouc {
    public static final luc Companion = new luc();
    public static final i3y[] c;
    public final List a;
    public final List b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new juc(0)), kotlin.a.b(lazyThreadSafetyMode, new juc(1))};
    }

    public /* synthetic */ ouc(List list, List list2, int i) {
        int i2 = i & 1;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.a = emptyList;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = emptyList;
        } else {
            this.b = list2;
        }
    }

    /* renamed from: a, reason: from getter */
    public final List getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final List getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ouc)) {
            return false;
        }
        ouc oucVar = (ouc) obj;
        return jl40.l(this.a, oucVar.a) && jl40.l(this.b, oucVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.l("CommunicationsResponse(stories=", this.a, ", itemsToDelete=", this.b, Extension.C_BRAKE);
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Louc$a;", "", "Companion", "muc", "nuc", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class a {
        public static final nuc Companion = new nuc();
        public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new juc(2))};
        public final String a;
        public final Promotion.Type b;

        public /* synthetic */ a(int i, String str, Promotion.Type type) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = type;
            }
        }

        /* renamed from: a, reason: from getter */
        public final Promotion.Type getB() {
            return this.b;
        }

        /* renamed from: b, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Promotion.Type type = this.b;
            return hashCode + (type == null ? 0 : type.hashCode());
        }

        public final String toString() {
            return "Item(id=" + this.a + ", communicationType=" + this.b + Extension.C_BRAKE;
        }

        public a() {
            this.a = "";
            this.b = null;
        }
    }

    public ouc() {
        EmptyList emptyList = EmptyList.a;
        this.a = emptyList;
        this.b = emptyList;
    }
}
