package defpackage;

import com.yandex.go.personal_goals_v2.data.model.PersonalGoalAcceptResponse;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class b4b0 extends c4b0 {
    public final PersonalGoalAcceptResponse a;

    public b4b0(PersonalGoalAcceptResponse personalGoalAcceptResponse) {
        this.a = personalGoalAcceptResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b4b0) && this.a.equals(((b4b0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(response=" + this.a + Extension.C_BRAKE;
    }
}
