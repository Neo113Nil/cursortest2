package com.yandex.div2;

import defpackage.c4x;
import defpackage.ft6;
import defpackage.jl40;
import defpackage.lb7;
import defpackage.oyk;
import defpackage.qoi0;
import defpackage.wwg;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class DivLayoutProvider implements c4x {
    public final String a;
    public final String b;
    public Integer c;

    public DivLayoutProvider(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean a(DivLayoutProvider divLayoutProvider) {
        return divLayoutProvider != null && jl40.l(this.a, divLayoutProvider.a) && jl40.l(this.b, divLayoutProvider.b);
    }

    public final int b() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(DivLayoutProvider.class).hashCode();
        String str = this.a;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        String str2 = this.b;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.c = Integer.valueOf(hashCode3);
        return hashCode3;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        oyk oykVar = (oyk) ft6.b.X4.getValue();
        lb7 lb7Var = ft6.a;
        oykVar.getClass();
        JSONObject jSONObject = new JSONObject();
        wwg.Z(lb7Var, jSONObject, "height_variable_name", this.a);
        wwg.Z(lb7Var, jSONObject, "width_variable_name", this.b);
        return jSONObject;
    }

    public DivLayoutProvider() {
        this(null, null);
    }
}
