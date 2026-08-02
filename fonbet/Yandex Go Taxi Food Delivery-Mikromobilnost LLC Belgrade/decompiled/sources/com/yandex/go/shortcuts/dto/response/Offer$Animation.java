package com.yandex.go.shortcuts.dto.response;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oi60;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.yjd;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"com/yandex/go/shortcuts/dto/response/Offer$Animation", "", "Companion", "Type", "ImageTags", "ShowPolicy", "com/yandex/go/shortcuts/dto/response/z", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Offer$Animation {
    public static final z Companion = new z();
    public static final i3y[] f;
    public static final Offer$Animation g;
    public final Type a;
    public final List b;
    public final TextStyleDto c;
    public final ImageTags d;
    public final ShowPolicy e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/Offer$Animation$Type;", "", "Companion", "com/yandex/go/shortcuts/dto/response/c0", "SLIDING_IMAGE", JCP.RAW_PREFIX, "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes6.dex */
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final c0 Companion;
        public static final Type NONE;
        public static final Type SLIDING_IMAGE;

        static {
            Type type = new Type("SLIDING_IMAGE", 0);
            SLIDING_IMAGE = type;
            Type type2 = new Type(JCP.RAW_PREFIX, 1);
            NONE = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = kotlin.enums.a.a(typeArr);
            Companion = new c0();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new oi60(13));
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new oi60(11)), kotlin.a.b(lazyThreadSafetyMode, new oi60(12)), null, null, null};
        g = new Offer$Animation(Type.NONE, 30);
    }

    public /* synthetic */ Offer$Animation(int i, Type type, List list, TextStyleDto textStyleDto, ImageTags imageTags, ShowPolicy showPolicy) {
        this.a = (i & 1) == 0 ? Type.NONE : type;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = textStyleDto;
        }
        if ((i & 8) == 0) {
            this.d = new ImageTags(0);
        } else {
            this.d = imageTags;
        }
        if ((i & 16) == 0) {
            this.e = new ShowPolicy(0);
        } else {
            this.e = showPolicy;
        }
    }

    public static final /* synthetic */ void b(Offer$Animation offer$Animation, yjd yjdVar, SerialDescriptor serialDescriptor) {
        boolean F = yjdVar.F();
        i3y[] i3yVarArr = f;
        if (F || offer$Animation.a != Type.NONE) {
            yjdVar.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), offer$Animation.a);
        }
        if (yjdVar.F() || !jl40.l(offer$Animation.b, EmptyList.a)) {
            yjdVar.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), offer$Animation.b);
        }
        if (yjdVar.F() || offer$Animation.c != null) {
            yjdVar.g(serialDescriptor, 2, TextStyleDto$$serializer.INSTANCE, offer$Animation.c);
        }
        if (yjdVar.F() || !jl40.l(offer$Animation.d, new ImageTags(0))) {
            yjdVar.e(serialDescriptor, 3, Offer$Animation$ImageTags$$serializer.INSTANCE, offer$Animation.d);
        }
        if (!yjdVar.F() && jl40.l(offer$Animation.e, new ShowPolicy(0))) {
            return;
        }
        yjdVar.e(serialDescriptor, 4, Offer$Animation$ShowPolicy$$serializer.INSTANCE, offer$Animation.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Offer$Animation)) {
            return false;
        }
        Offer$Animation offer$Animation = (Offer$Animation) obj;
        return this.a == offer$Animation.a && jl40.l(this.b, offer$Animation.b) && jl40.l(this.c, offer$Animation.c) && jl40.l(this.d, offer$Animation.d) && jl40.l(this.e, offer$Animation.e);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
        TextStyleDto textStyleDto = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((c + (textStyleDto == null ? 0 : textStyleDto.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "Animation(type=" + this.a + ", texts=" + this.b + ", textStyle=" + this.c + ", imageTags=" + this.d + ", showPolicy=" + this.e + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/Offer$Animation$ShowPolicy;", "", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/b0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class ShowPolicy {
        public static final b0 Companion = new b0();
        public final String a;
        public final int b;
        public final int c;

        public /* synthetic */ ShowPolicy(int i, int i2, int i3, String str) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = 0;
            } else {
                this.b = i2;
            }
            if ((i & 4) == 0) {
                this.c = 0;
            } else {
                this.c = i3;
            }
        }

        public static final /* synthetic */ void a(ShowPolicy showPolicy, yjd yjdVar, SerialDescriptor serialDescriptor) {
            if (yjdVar.F() || !jl40.l(showPolicy.a, "")) {
                yjdVar.o(serialDescriptor, 0, showPolicy.a);
            }
            if (yjdVar.F() || showPolicy.b != 0) {
                yjdVar.A(1, showPolicy.b, serialDescriptor);
            }
            if (!yjdVar.F() && showPolicy.c == 0) {
                return;
            }
            yjdVar.A(2, showPolicy.c, serialDescriptor);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowPolicy)) {
                return false;
            }
            ShowPolicy showPolicy = (ShowPolicy) obj;
            return jl40.l(this.a, showPolicy.a) && this.b == showPolicy.b && this.c == showPolicy.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + oyr.b(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            return oyr.m(this.c, Extension.C_BRAKE, b64.u(this.b, "ShowPolicy(id=", this.a, ", maxShowCount=", ", minShowDelaySec="));
        }

        public ShowPolicy(int i) {
            this.a = "";
            this.b = 0;
            this.c = 0;
        }

        public ShowPolicy() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/Offer$Animation$ImageTags;", "", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/a0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class ImageTags {
        public static final a0 Companion = new a0();
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ ImageTags(int i, String str, String str2, String str3) {
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
        }

        public static final /* synthetic */ void a(ImageTags imageTags, yjd yjdVar, SerialDescriptor serialDescriptor) {
            if (yjdVar.F() || !jl40.l(imageTags.a, "")) {
                yjdVar.o(serialDescriptor, 0, imageTags.a);
            }
            if (yjdVar.F() || !jl40.l(imageTags.b, "")) {
                yjdVar.o(serialDescriptor, 1, imageTags.b);
            }
            if (!yjdVar.F() && jl40.l(imageTags.c, "")) {
                return;
            }
            yjdVar.o(serialDescriptor, 2, imageTags.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageTags)) {
                return false;
            }
            ImageTags imageTags = (ImageTags) obj;
            return jl40.l(this.a, imageTags.a) && jl40.l(this.b, imageTags.b) && jl40.l(this.c, imageTags.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return oyr.t(b64.v("ImageTags(sliding=", this.a, ", initLead=", this.b, ", initTrail="), this.c, Extension.C_BRAKE);
        }

        public ImageTags(int i) {
            this.a = "";
            this.b = "";
            this.c = "";
        }

        public ImageTags() {
            this(0);
        }
    }

    public Offer$Animation() {
        this(null, 31);
    }

    public Offer$Animation(Type type, int i) {
        type = (i & 1) != 0 ? Type.NONE : type;
        ImageTags imageTags = new ImageTags(0);
        ShowPolicy showPolicy = new ShowPolicy(0);
        this.a = type;
        this.b = EmptyList.a;
        this.c = null;
        this.d = imageTags;
        this.e = showPolicy;
    }
}
