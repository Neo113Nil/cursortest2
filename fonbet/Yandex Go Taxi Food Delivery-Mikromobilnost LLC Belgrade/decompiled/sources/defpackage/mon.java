package defpackage;

import com.ybsdk.feature.educations.api.domain.EducationDivkitContentPositionEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class mon {
    public final EducationDivkitContentPositionEntity a;
    public final String b;

    public mon(EducationDivkitContentPositionEntity educationDivkitContentPositionEntity, String str) {
        this.a = educationDivkitContentPositionEntity;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mon)) {
            return false;
        }
        mon monVar = (mon) obj;
        return this.a == monVar.a && jl40.l(this.b, monVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "EducationDivKitContentPositionEntity(type=" + this.a + ", viewId=" + this.b + Extension.C_BRAKE;
    }
}
