package com.yandex.go.flex.common.api.actions;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/flex/common/api/actions/CityModeAction;", "Lcom/yandex/go/flex/common/api/actions/n;", "Companion", "CityModeContext", "ContinuationAction", "com/yandex/go/flex/common/api/actions/f", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CityModeAction extends n {
    public static final f Companion = new f();
    public final String b;
    public final String c;
    public final kotlinx.serialization.json.b d;
    public final CityModeContext e;

    public /* synthetic */ CityModeAction(int i, String str, String str2, kotlinx.serialization.json.b bVar, CityModeContext cityModeContext) {
        this.b = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.c = "city-mode";
        } else {
            this.c = str2;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = bVar;
        }
        if ((i & 8) == 0) {
            this.e = new CityModeContext(0);
        } else {
            this.e = cityModeContext;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CityModeAction)) {
            return false;
        }
        CityModeAction cityModeAction = (CityModeAction) obj;
        return jl40.l(this.b, cityModeAction.b) && jl40.l(this.c, cityModeAction.c) && jl40.l(this.d, cityModeAction.d) && jl40.l(this.e, cityModeAction.e);
    }

    public final int hashCode() {
        int b = unr0.b(this.b.hashCode() * 31, 31, this.c);
        kotlinx.serialization.json.b bVar = this.d;
        return this.e.hashCode() + ((b + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("CityModeAction(mode=", this.b, ", screenName=", this.c, ", layersContext=");
        v.append(this.d);
        v.append(", cityModeContext=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/common/api/actions/CityModeAction$CityModeContext;", "", "Companion", "$serializer", "com/yandex/go/flex/common/api/actions/e", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final /* data */ class CityModeContext {
        public static final e Companion = new e();
        public final ContinuationAction a;

        public /* synthetic */ CityModeContext(int i, ContinuationAction continuationAction) {
            if ((i & 1) == 0) {
                this.a = new ContinuationAction(0);
            } else {
                this.a = continuationAction;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CityModeContext) && jl40.l(this.a, ((CityModeContext) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "CityModeContext(continuationAction=" + this.a + Extension.C_BRAKE;
        }

        public CityModeContext() {
            this(0);
        }

        public CityModeContext(int i) {
            this.a = new ContinuationAction(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/common/api/actions/CityModeAction$ContinuationAction;", "", "Companion", "$serializer", "com/yandex/go/flex/common/api/actions/g", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final /* data */ class ContinuationAction {
        public static final g Companion = new g();
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ ContinuationAction(int i, String str, String str2, String str3) {
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

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContinuationAction)) {
                return false;
            }
            ContinuationAction continuationAction = (ContinuationAction) obj;
            return jl40.l(this.a, continuationAction.a) && jl40.l(this.b, continuationAction.b) && jl40.l(this.c, continuationAction.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return oyr.t(b64.v("ContinuationAction(type=", this.a, ", suggestMode=", this.b, ", tariffClass="), this.c, Extension.C_BRAKE);
        }

        public ContinuationAction(int i) {
            this.a = "";
            this.b = "";
            this.c = "";
        }

        public ContinuationAction() {
            this(0);
        }
    }

    public CityModeAction() {
        CityModeContext cityModeContext = new CityModeContext(0);
        this.b = "";
        this.c = "city-mode";
        this.d = null;
        this.e = cityModeContext;
    }
}
