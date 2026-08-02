package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.TypedConfigsDto;

/* loaded from: classes5.dex */
public final class dpc implements fpc {
    public final Object a;
    public final fo2 b;

    public dpc(Object obj, fo2 fo2Var) {
        this.a = obj;
        this.b = fo2Var;
    }

    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpc)) {
            return false;
        }
        dpc dpcVar = (dpc) obj;
        return jl40.l(this.a, dpcVar.a) && jl40.l(this.b, dpcVar.b);
    }

    @Override // defpackage.fpc
    public final fo2 getExtras() {
        return this.b;
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        fo2 fo2Var = this.b;
        return hashCode + (fo2Var != null ? fo2Var.hashCode() : 0);
    }

    public final String toString() {
        return "Success(body=" + this.a + ", extras=" + this.b + Extension.C_BRAKE;
    }

    public /* synthetic */ dpc(TypedConfigsDto typedConfigsDto) {
        this(typedConfigsDto, null);
    }
}
