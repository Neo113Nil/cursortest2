package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0006\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Ld8i;", "Ln96;", "Lc6z;", "Companion", "d", "b", "c", "a", "g8i", "a8i", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class d8i extends n96 implements c6z {
    public static final g8i Companion = new g8i();
    public static final i3y[] e;
    public static final d8i f;
    public final boolean b;
    public final Map c;
    public final List d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new n5h(15)), kotlin.a.b(lazyThreadSafetyMode, new n5h(16))};
        f = new d8i(0);
    }

    public /* synthetic */ d8i(int i, List list, Map map, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        this.c = (i & 2) == 0 ? kotlin.collections.b.f() : map;
        if ((i & 4) == 0) {
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getC() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8i)) {
            return false;
        }
        d8i d8iVar = (d8i) obj;
        return this.b == d8iVar.b && jl40.l(this.c, d8iVar.c) && jl40.l(this.d, d8iVar.d);
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getB() {
        return this.c;
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.d(Boolean.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        return ly3.s(nnm.l("DeliveryExplicitCommentCourierExperiment(enabled=", ", l10n=", ", tariffsWithExplicitCommentFlow=", this.c, this.b), this.d, Extension.C_BRAKE);
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ld8i$c;", "", "Companion", "i8i", "h8i", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class c {
        public static final i8i Companion = new i8i();
        public static final c d = new c(0);
        public final int a;
        public final int b;
        public final int c;

        public /* synthetic */ c(int i, int i2, int i3, int i4) {
            if ((i & 1) == 0) {
                this.a = 0;
            } else {
                this.a = i2;
            }
            if ((i & 2) == 0) {
                this.b = 0;
            } else {
                this.b = i3;
            }
            if ((i & 4) == 0) {
                this.c = 0;
            } else {
                this.c = i4;
            }
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
            return Integer.hashCode(this.c) + oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            return oyr.m(this.c, Extension.C_BRAKE, b64.s(this.a, this.b, "PhotoAttachments(maxPhotos=", ", maxPhotoWidth=", ", maxPhotoHeight="));
        }

        public c(int i) {
            this.a = 0;
            this.b = 0;
            this.c = 0;
        }

        public c() {
            this(0);
        }
    }

    public d8i() {
        this(0);
    }

    public d8i(int i) {
        Map f2 = kotlin.collections.b.f();
        this.b = false;
        this.c = f2;
        this.d = EmptyList.a;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ld8i$a;", "", "Companion", "c8i", "b8i", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class a {
        public static final c8i Companion = new c8i();
        public static final a h = new a(0);
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;

        public /* synthetic */ a(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str4;
            }
            if ((i & 16) == 0) {
                this.e = "";
            } else {
                this.e = str5;
            }
            if ((i & 32) == 0) {
                this.f = "";
            } else {
                this.f = str6;
            }
            if ((i & 64) == 0) {
                this.g = "";
            } else {
                this.g = str7;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c) && jl40.l(this.d, aVar.d) && jl40.l(this.e, aVar.e) && jl40.l(this.f, aVar.f) && jl40.l(this.g, aVar.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        }

        public final String toString() {
            StringBuilder v = b64.v("ChooseMessageRecipient(title=", this.a, ", firstBlockTitle=", this.b, ", firstBlockDescription=");
            g8e.D(v, this.c, ", secondBlockTitle=", this.d, ", secondBlockDescription=");
            g8e.D(v, this.e, ", buttonReceiver=", this.f, ", buttonCourier=");
            return oyr.t(v, this.g, Extension.C_BRAKE);
        }

        public a(int i) {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = "";
            this.e = "";
            this.f = "";
            this.g = "";
        }

        public a() {
            this(0);
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ld8i$b;", "", "Companion", "f8i", "e8i", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class b {
        public static final f8i Companion = new f8i();
        public static final b h = new b(0);
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final Integer f;
        public final c g;

        public b(int i, String str, String str2, String str3, String str4, String str5, Integer num, c cVar) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str4;
            }
            if ((i & 16) == 0) {
                this.e = "";
            } else {
                this.e = str5;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = num;
            }
            if ((i & 64) != 0) {
                this.g = cVar;
            } else {
                c.Companion.getClass();
                this.g = c.d;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return jl40.l(this.a, bVar.a) && jl40.l(this.b, bVar.b) && jl40.l(this.c, bVar.c) && jl40.l(this.d, bVar.d) && jl40.l(this.e, bVar.e) && jl40.l(this.f, bVar.f) && jl40.l(this.g, bVar.g);
        }

        public final int hashCode() {
            int b = unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
            Integer num = this.f;
            return this.g.hashCode() + ((b + (num == null ? 0 : num.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder v = b64.v("CommentViewCourier(titleKey=", this.a, ", descriptionKey=", this.b, ", textInputHintKey=");
            g8e.D(v, this.c, ", buttonOkTitleKey=", this.d, ", buttonDismissTitleKey=");
            vfc.w(this.f, this.e, ", commentMaxLength=", ", photoAttachments=", v);
            v.append(this.g);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        public b() {
            this(0);
        }

        public b(int i) {
            c.Companion.getClass();
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = "";
            this.e = "";
            this.f = null;
            this.g = c.d;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ld8i$d;", "", "Companion", "j8i", "k8i", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class d {
        public static final k8i Companion = new k8i();
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final b e;
        public final a f;
        public final boolean g;

        public d(int i, String str, String str2, String str3, String str4, b bVar, a aVar, boolean z) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str4;
            }
            if ((i & 16) == 0) {
                b.Companion.getClass();
                this.e = b.h;
            } else {
                this.e = bVar;
            }
            if ((i & 32) == 0) {
                a.Companion.getClass();
                this.f = a.h;
            } else {
                this.f = aVar;
            }
            if ((i & 64) == 0) {
                this.g = false;
            } else {
                this.g = z;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
        
            if (defpackage.jl40.l(r0, d8i.b.h) == false) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
        
            if (defpackage.jl40.l(r0, d8i.a.h) == false) goto L37;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final void a(d dVar, yjd yjdVar, SerialDescriptor serialDescriptor) {
            if (yjdVar.F() || !jl40.l(dVar.a, "")) {
                yjdVar.o(serialDescriptor, 0, dVar.a);
            }
            if (yjdVar.F() || !jl40.l(dVar.b, "")) {
                yjdVar.o(serialDescriptor, 1, dVar.b);
            }
            if (yjdVar.F() || !jl40.l(dVar.c, "")) {
                yjdVar.o(serialDescriptor, 2, dVar.c);
            }
            if (yjdVar.F() || !jl40.l(dVar.d, "")) {
                yjdVar.o(serialDescriptor, 3, dVar.d);
            }
            if (!yjdVar.F()) {
                b bVar = dVar.e;
                b.Companion.getClass();
            }
            yjdVar.e(serialDescriptor, 4, e8i.a, dVar.e);
            if (!yjdVar.F()) {
                a aVar = dVar.f;
                a.Companion.getClass();
            }
            yjdVar.e(serialDescriptor, 5, b8i.a, dVar.f);
            if (yjdVar.F() || dVar.g) {
                yjdVar.n(serialDescriptor, 6, dVar.g);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return jl40.l(this.a, dVar.a) && jl40.l(this.b, dVar.b) && jl40.l(this.c, dVar.c) && jl40.l(this.d, dVar.d) && jl40.l(this.e, dVar.e) && jl40.l(this.f, dVar.f) && this.g == dVar.g;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.g) + ((this.f.hashCode() + ((this.e.hashCode() + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder v = b64.v("TariffExplicitCommentItem(tariffClass=", this.a, ", buttonRequirementTitleCourierKey=", this.b, ", buttonRequirementTitleRecipientKey=");
            g8e.D(v, this.c, ", buttonRequirementSubtitleCourierKey=", this.d, ", commentViewCourier=");
            v.append(this.e);
            v.append(", chooseMessageRecipient=");
            v.append(this.f);
            v.append(", popUpped=");
            return x4e.i(v, this.g, Extension.C_BRAKE);
        }

        public d() {
            b.Companion.getClass();
            b bVar = b.h;
            a.Companion.getClass();
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = "";
            this.e = bVar;
            this.f = a.h;
            this.g = false;
        }
    }
}
