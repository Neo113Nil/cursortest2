package com.yandex.go.flex.common.api.actions;

import defpackage.gsq0;
import defpackage.i2v;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ojw;
import defpackage.oyr;
import defpackage.tse0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/flex/common/api/actions/IntercityMainAction;", "Lcom/yandex/go/flex/common/api/actions/n;", "Companion", "Addresses", "$serializer", "com/yandex/go/flex/common/api/actions/x", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class IntercityMainAction extends n {
    public static final x Companion = new x();
    public final String b;
    public final Addresses c;

    public /* synthetic */ IntercityMainAction(int i, String str, Addresses addresses) {
        this.b = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.c = new Addresses(0);
        } else {
            this.c = addresses;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntercityMainAction)) {
            return false;
        }
        IntercityMainAction intercityMainAction = (IntercityMainAction) obj;
        return jl40.l(this.b, intercityMainAction.b) && jl40.l(this.c, intercityMainAction.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "IntercityMainAction(mode=" + this.b + ", addresses=" + this.c + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/flex/common/api/actions/IntercityMainAction$Addresses;", "", "Companion", "com/yandex/go/flex/common/api/actions/r", "Coordinates", "Clarification", "com/yandex/go/flex/common/api/actions/v", "com/yandex/go/flex/common/api/actions/w", "com/yandex/go/flex/common/api/actions/t", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Addresses {
        public static final t Companion = new t();
        public static final i3y[] c;
        public final r a;
        public final r b;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new i2v(19)), kotlin.a.b(lazyThreadSafetyMode, new i2v(20))};
        }

        public /* synthetic */ Addresses(int i, r rVar, r rVar2) {
            this.a = (i & 1) == 0 ? w.c : rVar;
            if ((i & 2) == 0) {
                this.b = w.c;
            } else {
                this.b = rVar2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Addresses)) {
                return false;
            }
            Addresses addresses = (Addresses) obj;
            return jl40.l(this.a, addresses.a) && jl40.l(this.b, addresses.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Addresses(pointA=" + this.a + ", pointB=" + this.b + Extension.C_BRAKE;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/common/api/actions/IntercityMainAction$Addresses$Clarification;", "Lcom/yandex/go/flex/common/api/actions/r;", "Companion", "$serializer", "com/yandex/go/flex/common/api/actions/s", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class Clarification extends r {
            public static final s Companion = new s();
            public final String c;

            public /* synthetic */ Clarification(int i, String str, String str2) {
                super(i, str);
                if ((i & 2) == 0) {
                    this.c = "";
                } else {
                    this.c = str2;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Clarification) && jl40.l(this.c, ((Clarification) obj).c);
            }

            public final int hashCode() {
                return this.c.hashCode();
            }

            public final String toString() {
                return oyr.p("Clarification(geoArea=", this.c, Extension.C_BRAKE);
            }

            public Clarification() {
                super("clarification");
                this.c = "";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/common/api/actions/IntercityMainAction$Addresses$Coordinates;", "Lcom/yandex/go/flex/common/api/actions/r;", "Companion", "$serializer", "com/yandex/go/flex/common/api/actions/u", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class Coordinates extends r {
            public static final u Companion = new u();
            public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ojw(1))};
            public final List c;

            public /* synthetic */ Coordinates(int i, String str, List list) {
                super(i, str);
                if ((i & 2) == 0) {
                    this.c = EmptyList.a;
                } else {
                    this.c = list;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Coordinates) && jl40.l(this.c, ((Coordinates) obj).c);
            }

            public final int hashCode() {
                return this.c.hashCode();
            }

            public final String toString() {
                return tse0.k("Coordinates(point=", Extension.C_BRAKE, this.c);
            }

            public Coordinates() {
                super("coordinates");
                this.c = EmptyList.a;
            }
        }

        public Addresses() {
            this(0);
        }

        public Addresses(int i) {
            w wVar = w.c;
            this.a = wVar;
            this.b = wVar;
        }
    }

    public IntercityMainAction() {
        Addresses addresses = new Addresses(0);
        this.b = "";
        this.c = addresses;
    }
}
