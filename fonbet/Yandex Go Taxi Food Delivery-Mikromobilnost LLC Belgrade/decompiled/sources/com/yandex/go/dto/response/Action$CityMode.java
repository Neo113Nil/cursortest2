package com.yandex.go.dto.response;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"com/yandex/go/dto/response/Action$CityMode", "Lcom/yandex/go/dto/response/q1;", "Companion", "Context", "com/yandex/go/dto/response/p", "zo", "$serializer", "com/yandex/go/dto/response/l", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Action$CityMode extends q1 {
    public static final l Companion = new l();
    public final String a;
    public final String b;
    public final kotlinx.serialization.json.b c;
    public final Context d;

    public Action$CityMode(int i, String str, String str2, kotlinx.serialization.json.b bVar, Context context) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = "city-mode";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bVar;
        }
        if ((i & 8) == 0) {
            this.d = Context.b;
        } else {
            this.d = context;
        }
    }

    @Override // com.yandex.go.dto.response.q1
    public final ActionType a() {
        return ActionType.CITY_MODE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action$CityMode)) {
            return false;
        }
        Action$CityMode action$CityMode = (Action$CityMode) obj;
        return jl40.l(this.a, action$CityMode.a) && jl40.l(this.b, action$CityMode.b) && jl40.l(this.c, action$CityMode.c) && jl40.l(this.d, action$CityMode.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        kotlinx.serialization.json.b bVar = this.c;
        return this.d.hashCode() + ((b + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("CityMode(mode=", this.a, ", screenName=", this.b, ", layersContext=");
        v.append(this.c);
        v.append(", context=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/dto/response/Action$CityMode$Context;", "", "Companion", "com/yandex/go/dto/response/m", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final /* data */ class Context {
        public static final m Companion = new m();
        public static final Context b = new Context(0);
        public final p a;

        public /* synthetic */ Context(int i, p pVar) {
            if ((i & 1) == 0) {
                this.a = n.INSTANCE;
            } else {
                this.a = pVar;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Context) && jl40.l(this.a, ((Context) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Context(continuationAction=" + this.a + Extension.C_BRAKE;
        }

        public Context() {
            this(0);
        }

        public Context(p pVar) {
            this.a = pVar;
        }

        public /* synthetic */ Context(int i) {
            this(n.INSTANCE);
        }
    }

    public Action$CityMode() {
        this(15, null, null, null);
    }

    public Action$CityMode(int i, String str, String str2, kotlinx.serialization.json.b bVar) {
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? "city-mode" : str2;
        bVar = (i & 4) != 0 ? null : bVar;
        Context context = Context.b;
        this.a = str;
        this.b = str2;
        this.c = bVar;
        this.d = context;
    }
}
