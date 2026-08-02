package com.yandex.go.zone.dto.objects;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import defpackage.rm6;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.XAdES.cl_63;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/zone/dto/objects/BulletsOrderPopup;", "Lcom/yandex/go/zone/dto/objects/u2;", "Companion", "ShowPolicy", cl_63.t, "HeaderAppearance", "$serializer", "com/yandex/go/zone/dto/objects/n", "go-client-android.internal_libs:taxi_shared_dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BulletsOrderPopup extends u2 {
    public static final n Companion = new n();
    public static final i3y[] l;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final ShowPolicy f;
    public final OrderButton g;
    public final PopupUiControl h;
    public final List i;
    public final BulletsOrderImage j;
    public final HeaderAppearance k;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        l = new i3y[]{null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new rm6(9)), null, null, null, kotlin.a.b(lazyThreadSafetyMode, new rm6(10)), null, null};
    }

    public BulletsOrderPopup(int i, String str, String str2, String str3, String str4, List list, ShowPolicy showPolicy, OrderButton orderButton, PopupUiControl popupUiControl, List list2, BulletsOrderImage bulletsOrderImage, HeaderAppearance headerAppearance) {
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
        int i2 = i & 16;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.e = emptyList;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            ShowPolicy.Companion.getClass();
            this.f = ShowPolicy.e;
        } else {
            this.f = showPolicy;
        }
        if ((i & 64) == 0) {
            OrderButton.Companion.getClass();
            this.g = OrderButton.c;
        } else {
            this.g = orderButton;
        }
        if ((i & 128) == 0) {
            PopupUiControl.Companion.getClass();
            this.h = PopupUiControl.f;
        } else {
            this.h = popupUiControl;
        }
        if ((i & 256) == 0) {
            this.i = emptyList;
        } else {
            this.i = list2;
        }
        if ((i & 512) == 0) {
            BulletsOrderImage.Companion.getClass();
            this.j = BulletsOrderImage.c;
        } else {
            this.j = bulletsOrderImage;
        }
        if ((i & 1024) == 0) {
            this.k = new HeaderAppearance(0);
        } else {
            this.k = headerAppearance;
        }
    }

    /* renamed from: a, reason: from getter */
    public final ShowPolicy getF() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletsOrderPopup)) {
            return false;
        }
        BulletsOrderPopup bulletsOrderPopup = (BulletsOrderPopup) obj;
        return jl40.l(this.a, bulletsOrderPopup.a) && jl40.l(this.b, bulletsOrderPopup.b) && jl40.l(this.c, bulletsOrderPopup.c) && jl40.l(this.d, bulletsOrderPopup.d) && jl40.l(this.e, bulletsOrderPopup.e) && jl40.l(this.f, bulletsOrderPopup.f) && jl40.l(this.g, bulletsOrderPopup.g) && jl40.l(this.h, bulletsOrderPopup.h) && jl40.l(this.i, bulletsOrderPopup.i) && jl40.l(this.j, bulletsOrderPopup.j) && jl40.l(this.k, bulletsOrderPopup.k);
    }

    public final int hashCode() {
        return this.k.a.hashCode() + ((this.j.hashCode() + unr0.c((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + unr0.c(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31)) * 31)) * 31, 31, this.i)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("BulletsOrderPopup(title=", this.a, ", description=", this.b, ", buttonText=");
        g8e.D(v, this.c, ", iconTag=", this.d, ", descriptions=");
        v.append(this.e);
        v.append(", showPolicy=");
        v.append(this.f);
        v.append(", orderButton=");
        v.append(this.g);
        v.append(", popupUiControl=");
        v.append(this.h);
        v.append(", popupButtons=");
        v.append(this.i);
        v.append(", image=");
        v.append(this.j);
        v.append(", headerAppearance=");
        v.append(this.k);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/zone/dto/objects/BulletsOrderPopup$HeaderAppearance;", "", "Companion", "Type", "$serializer", "com/yandex/go/zone/dto/objects/p", "go-client-android.internal_libs:taxi_shared_dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class HeaderAppearance {
        public static final p Companion = new p();
        public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new rm6(11))};
        public final Type a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/zone/dto/objects/BulletsOrderPopup$HeaderAppearance$Type;", "", "Companion", "com/yandex/go/zone/dto/objects/q", "DEFAULT", "PROMINENT", "go-client-android.internal_libs:taxi_shared_dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class Type {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final q Companion;
            public static final Type DEFAULT;
            public static final Type PROMINENT;

            static {
                Type type = new Type("DEFAULT", 0);
                DEFAULT = type;
                Type type2 = new Type("PROMINENT", 1);
                PROMINENT = type2;
                Type[] typeArr = {type, type2};
                $VALUES = typeArr;
                $ENTRIES = kotlin.enums.a.a(typeArr);
                Companion = new q();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new rm6(12));
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public /* synthetic */ HeaderAppearance(int i, Type type) {
            if ((i & 1) == 0) {
                this.a = Type.DEFAULT;
            } else {
                this.a = type;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HeaderAppearance) && this.a == ((HeaderAppearance) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "HeaderAppearance(type=" + this.a + Extension.C_BRAKE;
        }

        public HeaderAppearance() {
            this(0);
        }

        public HeaderAppearance(int i) {
            this.a = Type.DEFAULT;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/BulletsOrderPopup$Description;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/o", "go-client-android.internal_libs:taxi_shared_dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Description {
        public static final o Companion = new o();
        public final String a;
        public final FormattedText b;
        public final FormattedText c;

        public /* synthetic */ Description(int i, String str, FormattedText formattedText, FormattedText formattedText2) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText;
            }
            if ((i & 4) == 0) {
                this.c = FormattedText.c;
            } else {
                this.c = formattedText2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Description)) {
                return false;
            }
            Description description = (Description) obj;
            return jl40.l(this.a, description.a) && jl40.l(this.b, description.b) && jl40.l(this.c, description.c);
        }

        public final int hashCode() {
            return this.c.a.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b.a);
        }

        public final String toString() {
            return tse0.m(xvz.q("Description(imageTag=", this.a, ", title=", ", subtitle=", this.b), this.c, Extension.C_BRAKE);
        }

        public Description() {
            FormattedText formattedText = FormattedText.c;
            this.a = "";
            this.b = formattedText;
            this.c = formattedText;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/BulletsOrderPopup$ShowPolicy;", "", "Companion", "com/yandex/go/zone/dto/objects/r", "$serializer", "go-client-android.internal_libs:taxi_shared_dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class ShowPolicy {
        public static final r Companion = new r();
        public static final ShowPolicy e = new ShowPolicy(0);
        public final String a;
        public final int b;
        public final boolean c;
        public final int d;

        public /* synthetic */ ShowPolicy(String str, int i, boolean z, int i2, int i3) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = 0;
            } else {
                this.b = i2;
            }
            if ((i & 4) == 0) {
                this.c = false;
            } else {
                this.c = z;
            }
            if ((i & 8) == 0) {
                this.d = 0;
            } else {
                this.d = i3;
            }
        }

        /* renamed from: a, reason: from getter */
        public final int getD() {
            return this.d;
        }

        /* renamed from: b, reason: from getter */
        public final String getA() {
            return this.a;
        }

        /* renamed from: c, reason: from getter */
        public final int getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowPolicy)) {
                return false;
            }
            ShowPolicy showPolicy = (ShowPolicy) obj;
            return jl40.l(this.a, showPolicy.a) && this.b == showPolicy.b && this.c == showPolicy.c && this.d == showPolicy.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + unr0.e(oyr.b(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        }

        public final String toString() {
            StringBuilder u = b64.u(this.b, "ShowPolicy(id=", this.a, ", maxShowCount=", ", showBeforeSettings=");
            u.append(this.c);
            u.append(", displayIntervalDays=");
            u.append(this.d);
            u.append(Extension.C_BRAKE);
            return u.toString();
        }

        public ShowPolicy(int i) {
            this.a = "";
            this.b = 0;
            this.c = false;
            this.d = 0;
        }

        public ShowPolicy() {
            this(0);
        }
    }

    public BulletsOrderPopup() {
        ShowPolicy.Companion.getClass();
        OrderButton.Companion.getClass();
        PopupUiControl.Companion.getClass();
        PopupUiControl popupUiControl = PopupUiControl.f;
        BulletsOrderImage.Companion.getClass();
        HeaderAppearance headerAppearance = new HeaderAppearance(0);
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        EmptyList emptyList = EmptyList.a;
        this.e = emptyList;
        this.f = ShowPolicy.e;
        this.g = OrderButton.c;
        this.h = popupUiControl;
        this.i = emptyList;
        this.j = BulletsOrderImage.c;
        this.k = headerAppearance;
    }
}
