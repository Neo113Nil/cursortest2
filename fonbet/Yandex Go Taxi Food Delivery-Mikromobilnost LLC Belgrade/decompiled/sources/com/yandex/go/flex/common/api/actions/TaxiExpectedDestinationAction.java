package com.yandex.go.flex.common.api.actions;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gjx0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.kr;
import defpackage.qje;
import defpackage.unr0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/flex/common/api/actions/TaxiExpectedDestinationAction;", "Lkr;", "Companion", "Prefetch", "ShortcutInfo", "$serializer", "com/yandex/go/flex/common/api/actions/p0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TaxiExpectedDestinationAction extends kr {
    public static final p0 Companion = new p0();
    public static final i3y[] f = {null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gjx0(6))};
    public final GeoPoint a;
    public final String b;
    public final String c;
    public final ShortcutInfo d;
    public final Prefetch e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/flex/common/api/actions/TaxiExpectedDestinationAction$Prefetch;", "", "RouteEta", "None", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Prefetch {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Prefetch[] $VALUES;
        public static final Prefetch None;
        public static final Prefetch RouteEta;

        static {
            Prefetch prefetch = new Prefetch("RouteEta", 0);
            RouteEta = prefetch;
            Prefetch prefetch2 = new Prefetch("None", 1);
            None = prefetch2;
            Prefetch[] prefetchArr = {prefetch, prefetch2};
            $VALUES = prefetchArr;
            $ENTRIES = kotlin.enums.a.a(prefetchArr);
        }

        public static Prefetch valueOf(String str) {
            return (Prefetch) Enum.valueOf(Prefetch.class, str);
        }

        public static Prefetch[] values() {
            return (Prefetch[]) $VALUES.clone();
        }
    }

    public /* synthetic */ TaxiExpectedDestinationAction(int i, GeoPoint geoPoint, String str, String str2, ShortcutInfo shortcutInfo, Prefetch prefetch) {
        if (8 != (i & 8)) {
            qje.Z(i, 8, TaxiExpectedDestinationAction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = (i & 1) == 0 ? new GeoPoint(0) : geoPoint;
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
        this.d = shortcutInfo;
        if ((i & 16) == 0) {
            this.e = Prefetch.None;
        } else {
            this.e = prefetch;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxiExpectedDestinationAction)) {
            return false;
        }
        TaxiExpectedDestinationAction taxiExpectedDestinationAction = (TaxiExpectedDestinationAction) obj;
        return jl40.l(this.a, taxiExpectedDestinationAction.a) && jl40.l(this.b, taxiExpectedDestinationAction.b) && jl40.l(this.c, taxiExpectedDestinationAction.c) && jl40.l(this.d, taxiExpectedDestinationAction.d) && this.e == taxiExpectedDestinationAction.e;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        ShortcutInfo shortcutInfo = this.d;
        return this.e.hashCode() + ((b + (shortcutInfo == null ? 0 : shortcutInfo.hashCode())) * 31);
    }

    public final String toString() {
        return "TaxiExpectedDestinationAction(position=" + this.a + ", log=" + this.b + ", uri=" + this.c + ", shortcutInfo=" + this.d + ", prefetch=" + this.e + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/common/api/actions/TaxiExpectedDestinationAction$ShortcutInfo;", "", "Companion", "$serializer", "com/yandex/go/flex/common/api/actions/q0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class ShortcutInfo {
        public static final q0 Companion = new q0();
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public /* synthetic */ ShortcutInfo(int i, String str, String str2, String str3, String str4) {
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
                this.c = null;
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = "shortcut";
            } else {
                this.d = str4;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShortcutInfo)) {
                return false;
            }
            ShortcutInfo shortcutInfo = (ShortcutInfo) obj;
            return jl40.l(this.a, shortcutInfo.a) && jl40.l(this.b, shortcutInfo.b) && jl40.l(this.c, shortcutInfo.c) && jl40.l(this.d, shortcutInfo.d);
        }

        public final int hashCode() {
            int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return this.d.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return g8e.r(b64.v("ShortcutInfo(shortcutId=", this.a, ", gridId=", this.b, ", type="), this.c, ", apiEndpoint=", this.d, Extension.C_BRAKE);
        }

        public ShortcutInfo() {
            this.a = "";
            this.b = "";
            this.c = null;
            this.d = "shortcut";
        }
    }
}
