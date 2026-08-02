package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.state.TransferRequisiteFormItemType$HcsFormItemType;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class oq01 extends tq01 {
    public static final nq01 c = new nq01();
    public final boolean a;
    public final Map b;

    public oq01(boolean z, Map map) {
        this.a = z;
        this.b = map;
    }

    @Override // defpackage.tq01
    public final tq01 a(Map map, boolean z) {
        return new oq01(z, map);
    }

    @Override // defpackage.tq01
    public final Map b() {
        return this.b;
    }

    @Override // defpackage.tq01
    public final boolean d() {
        return this.a;
    }

    @Override // defpackage.tq01
    public final tq01 e(rqj0[] rqj0VarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.b);
        for (rqj0 rqj0Var : rqj0VarArr) {
            if (rqj0Var.b() instanceof TransferRequisiteFormItemType$HcsFormItemType) {
                linkedHashMap.put(rqj0Var.b().getItemType(), rqj0Var);
            }
        }
        return new oq01(this.a, linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oq01)) {
            return false;
        }
        oq01 oq01Var = (oq01) obj;
        return this.a == oq01Var.a && jl40.l(this.b, oq01Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "HcsFormState(isSelected=" + this.a + ", allItems=" + this.b + Extension.C_BRAKE;
    }
}
