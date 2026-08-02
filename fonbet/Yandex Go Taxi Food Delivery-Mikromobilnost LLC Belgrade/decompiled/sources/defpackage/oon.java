package defpackage;

import com.ybsdk.feature.educations.api.domain.EducationScrollScreenEdgeEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class oon implements ron {
    public final EducationScrollScreenEdgeEntity a;

    public oon(EducationScrollScreenEdgeEntity educationScrollScreenEdgeEntity) {
        this.a = educationScrollScreenEdgeEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oon) && this.a == ((oon) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "EducationScrollToScreenEdgeEntity(screenEdge=" + this.a + Extension.C_BRAKE;
    }
}
