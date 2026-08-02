package com.yandex.go.zone.dto.objects;

import defpackage.ar;
import defpackage.gsq0;
import defpackage.hd90;
import defpackage.i3y;
import defpackage.ia1;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.tse0;
import defpackage.xvz;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/zone/dto/objects/AdjustConfig;", "Lhd90;", "Companion", "ConfigRule", "com/yandex/go/zone/dto/objects/a", "$serializer", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class AdjustConfig implements hd90 {
    public static final a Companion = new a();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ar(29))};
    public final List b;

    public /* synthetic */ AdjustConfig(int i, List list) {
        if ((i & 1) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AdjustConfig) && jl40.l(this.b, ((AdjustConfig) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return tse0.k("AdjustConfig(rules=", Extension.C_BRAKE, this.b);
    }

    public AdjustConfig() {
        this.b = EmptyList.a;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/AdjustConfig$ConfigRule;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/b", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class ConfigRule {
        public static final b Companion = new b();
        public static final i3y[] d = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ia1(0)), null, null};
        public final List a;
        public final String b;
        public final String c;

        public /* synthetic */ ConfigRule(int i, String str, String str2, List list) {
            this.a = (i & 1) == 0 ? EmptyList.a : list;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConfigRule)) {
                return false;
            }
            ConfigRule configRule = (ConfigRule) obj;
            return jl40.l(this.a, configRule.a) && jl40.l(this.b, configRule.b) && jl40.l(this.c, configRule.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return oyr.t(xvz.s("ConfigRule(tariffClasses=", this.a, ", token=", this.b, ", verticalId="), this.c, Extension.C_BRAKE);
        }

        public ConfigRule() {
            this.a = EmptyList.a;
            this.b = null;
            this.c = null;
        }
    }
}
