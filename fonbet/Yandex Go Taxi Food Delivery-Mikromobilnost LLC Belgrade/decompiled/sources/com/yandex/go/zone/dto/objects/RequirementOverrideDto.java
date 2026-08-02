package com.yandex.go.zone.dto.objects;

import defpackage.f1b0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.vci0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/RequirementOverrideDto;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/p3", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class RequirementOverrideDto {
    public static final p3 Companion = new p3();
    public static final i3y[] g = {null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new vci0(22))};
    public final String a;
    public final Boolean b;
    public final Boolean c;
    public final String d;
    public final f1b0 e;
    public final List f;

    public /* synthetic */ RequirementOverrideDto(int i, String str, Boolean bool, Boolean bool2, String str2, f1b0 f1b0Var, List list) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = f1b0Var;
        }
        if ((i & 32) == 0) {
            this.f = EmptyList.a;
        } else {
            this.f = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequirementOverrideDto)) {
            return false;
        }
        RequirementOverrideDto requirementOverrideDto = (RequirementOverrideDto) obj;
        return jl40.l(this.a, requirementOverrideDto.a) && jl40.l(this.b, requirementOverrideDto.b) && jl40.l(this.c, requirementOverrideDto.c) && jl40.l(this.d, requirementOverrideDto.d) && jl40.l(this.e, requirementOverrideDto.e) && jl40.l(this.f, requirementOverrideDto.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.c;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        f1b0 f1b0Var = this.e;
        return this.f.hashCode() + ((hashCode4 + (f1b0Var != null ? f1b0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "RequirementOverrideDto(name=" + this.a + ", glued=" + this.b + ", gluedOptional=" + this.c + ", unsetOrderButton=" + this.d + ", persistencePolicy=" + this.e + ", restrictedToClasses=" + this.f + Extension.C_BRAKE;
    }

    public RequirementOverrideDto(String str, Boolean bool, Boolean bool2, String str2, f1b0 f1b0Var, List list) {
        this.a = str;
        this.b = bool;
        this.c = bool2;
        this.d = str2;
        this.e = f1b0Var;
        this.f = list;
    }

    public RequirementOverrideDto() {
        this("", null, null, null, null, EmptyList.a);
    }
}
