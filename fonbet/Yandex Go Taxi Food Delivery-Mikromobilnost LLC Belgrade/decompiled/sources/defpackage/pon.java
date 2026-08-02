package defpackage;

import com.ybsdk.feature.educations.api.domain.EducationScrollSnapPreferenceEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class pon implements ron {
    public final String a;
    public final EducationScrollSnapPreferenceEntity b;
    public final Integer c;

    public pon(String str, EducationScrollSnapPreferenceEntity educationScrollSnapPreferenceEntity, Integer num) {
        this.a = str;
        this.b = educationScrollSnapPreferenceEntity;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pon)) {
            return false;
        }
        pon ponVar = (pon) obj;
        return jl40.l(this.a, ponVar.a) && this.b == ponVar.b && jl40.l(this.c, ponVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Integer num = this.c;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EducationScrollToScreenItemEntity(itemId=");
        sb.append(this.a);
        sb.append(", snapPreference=");
        sb.append(this.b);
        sb.append(", offset=");
        return oo31.j(sb, this.c, Extension.C_BRAKE);
    }
}
