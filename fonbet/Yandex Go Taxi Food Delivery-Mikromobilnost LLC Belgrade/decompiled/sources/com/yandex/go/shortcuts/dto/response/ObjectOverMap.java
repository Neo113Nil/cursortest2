package com.yandex.go.shortcuts.dto.response;

import defpackage.auu0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ij2;
import defpackage.jl40;
import defpackage.oi60;
import defpackage.qv10;
import defpackage.w7s;
import defpackage.xx;
import defpackage.yjd;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/ObjectOverMap;", "", "Companion", "ShowPolicy", "$serializer", "com/yandex/go/shortcuts/dto/response/x", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ObjectOverMap {
    public static final x Companion = new x();
    public static final i3y[] i;
    public final String a;
    public final ShowPolicy b;
    public final d c;
    public final com.yandex.go.dto.response.q1 d;
    public final FormattedText e;
    public final PositionOverMap f;
    public final String g;
    public final Map h;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        i = new i3y[]{null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new oi60(6)), null, kotlin.a.b(lazyThreadSafetyMode, new oi60(7))};
    }

    public /* synthetic */ ObjectOverMap(int i2, String str, ShowPolicy showPolicy, d dVar, com.yandex.go.dto.response.q1 q1Var, FormattedText formattedText, PositionOverMap positionOverMap, String str2, Map map) {
        this.a = (i2 & 1) == 0 ? "" : str;
        if ((i2 & 2) == 0) {
            this.b = null;
        } else {
            this.b = showPolicy;
        }
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = dVar;
        }
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = q1Var;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = formattedText;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = positionOverMap;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = str2;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = map;
        }
    }

    public static final /* synthetic */ void j(ObjectOverMap objectOverMap, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(objectOverMap.a, "")) {
            yjdVar.o(serialDescriptor, 0, objectOverMap.a);
        }
        if (yjdVar.F() || objectOverMap.b != null) {
            yjdVar.g(serialDescriptor, 1, ObjectOverMap$ShowPolicy$$serializer.INSTANCE, objectOverMap.b);
        }
        if (yjdVar.F() || objectOverMap.c != null) {
            yjdVar.g(serialDescriptor, 2, ij2.e, objectOverMap.c);
        }
        if (yjdVar.F() || objectOverMap.d != null) {
            yjdVar.g(serialDescriptor, 3, xx.f, objectOverMap.d);
        }
        if (yjdVar.F() || objectOverMap.e != null) {
            yjdVar.g(serialDescriptor, 4, w7s.a, objectOverMap.e);
        }
        boolean F = yjdVar.F();
        i3y[] i3yVarArr = i;
        if (F || objectOverMap.f != null) {
            yjdVar.g(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), objectOverMap.f);
        }
        if (yjdVar.F() || objectOverMap.g != null) {
            yjdVar.g(serialDescriptor, 6, auu0.a, objectOverMap.g);
        }
        if (!yjdVar.F() && objectOverMap.h == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 7, (KSerializer) i3yVarArr[7].getValue(), objectOverMap.h);
    }

    /* renamed from: b, reason: from getter */
    public final String getG() {
        return this.g;
    }

    /* renamed from: c, reason: from getter */
    public final com.yandex.go.dto.response.q1 getD() {
        return this.d;
    }

    /* renamed from: d, reason: from getter */
    public final Map getH() {
        return this.h;
    }

    /* renamed from: e, reason: from getter */
    public final FormattedText getE() {
        return this.e;
    }

    /* renamed from: f, reason: from getter */
    public final d getC() {
        return this.c;
    }

    /* renamed from: g, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: h, reason: from getter */
    public final PositionOverMap getF() {
        return this.f;
    }

    /* renamed from: i, reason: from getter */
    public final ShowPolicy getB() {
        return this.b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/ObjectOverMap$ShowPolicy;", "", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/y", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class ShowPolicy {
        public static final y Companion = new y();
        public final String a;
        public final int b;

        public /* synthetic */ ShowPolicy(int i, String str, int i2) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = 0;
            } else {
                this.b = i2;
            }
        }

        public static final /* synthetic */ void c(ShowPolicy showPolicy, yjd yjdVar, SerialDescriptor serialDescriptor) {
            if (yjdVar.F() || !jl40.l(showPolicy.a, "")) {
                yjdVar.o(serialDescriptor, 0, showPolicy.a);
            }
            if (!yjdVar.F() && showPolicy.b == 0) {
                return;
            }
            yjdVar.A(1, showPolicy.b, serialDescriptor);
        }

        /* renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        /* renamed from: b, reason: from getter */
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
            return jl40.l(this.a, showPolicy.a) && this.b == showPolicy.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return qv10.i(this.b, "ShowPolicy(id=", this.a, ", maxShowCount=", Extension.C_BRAKE);
        }

        public ShowPolicy(String str, int i) {
            this.a = str;
            this.b = i;
        }

        public ShowPolicy() {
            this("", 0);
        }
    }

    public ObjectOverMap(String str, ShowPolicy showPolicy, d dVar, com.yandex.go.dto.response.q1 q1Var, FormattedText formattedText, PositionOverMap positionOverMap, String str2, Map map) {
        this.a = str;
        this.b = showPolicy;
        this.c = dVar;
        this.d = q1Var;
        this.e = formattedText;
        this.f = positionOverMap;
        this.g = str2;
        this.h = map;
    }

    public ObjectOverMap() {
        this("", null, null, null, null, null, null, null);
    }
}
