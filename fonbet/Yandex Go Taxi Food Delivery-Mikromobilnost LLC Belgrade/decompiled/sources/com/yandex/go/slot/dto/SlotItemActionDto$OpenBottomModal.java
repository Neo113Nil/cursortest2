package com.yandex.go.slot.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.k4o;
import defpackage.ksq0;
import defpackage.n7v;
import defpackage.oqs0;
import defpackage.tse0;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/slot/dto/SlotItemActionDto$OpenBottomModal", "Lcom/yandex/go/slot/dto/b2;", "Companion", "Properties", "$serializer", "com/yandex/go/slot/dto/z0", "go-client-android.features.slot:dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SlotItemActionDto$OpenBottomModal extends b2 {
    public static final z0 Companion = new z0();
    public static final i3y[] g = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new oqs0(10)), null, null};
    public final n7v a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    public final Properties f;

    public SlotItemActionDto$OpenBottomModal(int i, n7v n7vVar, String str, String str2, List list, String str3, Properties properties) {
        this.a = (i & 1) == 0 ? null : n7vVar;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = new Properties(0);
        } else {
            this.f = properties;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlotItemActionDto$OpenBottomModal)) {
            return false;
        }
        SlotItemActionDto$OpenBottomModal slotItemActionDto$OpenBottomModal = (SlotItemActionDto$OpenBottomModal) obj;
        return jl40.l(this.a, slotItemActionDto$OpenBottomModal.a) && jl40.l(this.b, slotItemActionDto$OpenBottomModal.b) && jl40.l(this.c, slotItemActionDto$OpenBottomModal.c) && jl40.l(this.d, slotItemActionDto$OpenBottomModal.d) && jl40.l(this.e, slotItemActionDto$OpenBottomModal.e) && jl40.l(this.f, slotItemActionDto$OpenBottomModal.f);
    }

    public final int hashCode() {
        n7v n7vVar = this.a;
        return this.f.hashCode() + unr0.b(unr0.c(unr0.b(unr0.b((n7vVar == null ? 0 : n7vVar.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenBottomModal(icon=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", description=");
        tse0.x(this.c, ", content=", ", buttonTitle=", sb, this.d);
        sb.append(this.e);
        sb.append(", properties=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/slot/dto/SlotItemActionDto$OpenBottomModal$Properties;", "", "Companion", "NavigationButtonType", "$serializer", "com/yandex/go/slot/dto/a1", "go-client-android.features.slot:dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Properties {
        public static final a1 Companion = new a1();
        public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new oqs0(11))};
        public final boolean a;
        public final jsq0 b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/slot/dto/SlotItemActionDto$OpenBottomModal$Properties$NavigationButtonType;", "", "Companion", "com/yandex/go/slot/dto/b1", "BACK", "CLOSE", "go-client-android.features.slot:dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class NavigationButtonType {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ NavigationButtonType[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final NavigationButtonType BACK;
            public static final NavigationButtonType CLOSE;
            public static final b1 Companion;

            static {
                NavigationButtonType navigationButtonType = new NavigationButtonType("BACK", 0);
                BACK = navigationButtonType;
                NavigationButtonType navigationButtonType2 = new NavigationButtonType("CLOSE", 1);
                CLOSE = navigationButtonType2;
                NavigationButtonType[] navigationButtonTypeArr = {navigationButtonType, navigationButtonType2};
                $VALUES = navigationButtonTypeArr;
                $ENTRIES = kotlin.enums.a.a(navigationButtonTypeArr);
                Companion = new b1();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new oqs0(12));
            }

            public static NavigationButtonType valueOf(String str) {
                return (NavigationButtonType) Enum.valueOf(NavigationButtonType.class, str);
            }

            public static NavigationButtonType[] values() {
                return (NavigationButtonType[]) $VALUES.clone();
            }
        }

        public /* synthetic */ Properties(int i, boolean z, jsq0 jsq0Var) {
            this.a = (i & 1) == 0 ? false : z;
            if ((i & 2) == 0) {
                this.b = ksq0.a;
            } else {
                this.b = jsq0Var;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Properties)) {
                return false;
            }
            Properties properties = (Properties) obj;
            return this.a == properties.a && jl40.l(this.b, properties.b);
        }

        public final int hashCode() {
            return this.b.a.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "Properties(dismissible=" + this.a + ", navigationButtons=" + this.b + Extension.C_BRAKE;
        }

        public Properties() {
            this(0);
        }

        public Properties(int i) {
            jsq0 jsq0Var = ksq0.a;
            this.a = false;
            this.b = jsq0Var;
        }
    }

    public SlotItemActionDto$OpenBottomModal() {
        Properties properties = new Properties(0);
        this.a = null;
        this.b = "";
        this.c = "";
        this.d = EmptyList.a;
        this.e = "";
        this.f = properties;
    }
}
