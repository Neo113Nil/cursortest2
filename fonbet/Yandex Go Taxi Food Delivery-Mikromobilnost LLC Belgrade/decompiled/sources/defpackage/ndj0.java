package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.requirements.models.domain.RequirementBubbleAction;

/* loaded from: classes6.dex */
public final class ndj0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final zqb e;
    public final RequirementBubbleAction f;
    public final RequirementBubbleAction g;
    public final String h;

    public ndj0(String str, String str2, boolean z, int i, zqb zqbVar, RequirementBubbleAction requirementBubbleAction, RequirementBubbleAction requirementBubbleAction2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = zqbVar;
        this.f = requirementBubbleAction;
        this.g = requirementBubbleAction2;
        this.h = z ? g8e.p(str, "_", str2) : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ndj0)) {
            return false;
        }
        ndj0 ndj0Var = (ndj0) obj;
        return jl40.l(this.a, ndj0Var.a) && jl40.l(this.b, ndj0Var.b) && this.c == ndj0Var.c && this.d == ndj0Var.d && jl40.l(this.e, ndj0Var.e) && this.f == ndj0Var.f && this.g == ndj0Var.g;
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + ((this.e.hashCode() + oyr.b(this.d, unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31)) * 31)) * 31;
        RequirementBubbleAction requirementBubbleAction = this.g;
        return hashCode + (requirementBubbleAction == null ? 0 : requirementBubbleAction.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("RequirementBubbleModel(requirementName=", this.a, ", optionName=", this.b, ", isMultiselect=");
        v.append(this.c);
        v.append(", optionIndex=");
        v.append(this.d);
        v.append(", chipsInfo=");
        v.append(this.e);
        v.append(", mainAction=");
        v.append(this.f);
        v.append(", secondaryAction=");
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public /* synthetic */ ndj0(String str, String str2, int i, zqb zqbVar, RequirementBubbleAction requirementBubbleAction) {
        this(str, str2, false, i, zqbVar, requirementBubbleAction, null);
    }
}
