package defpackage;

import com.yandex.go.personal_goals_v2.data.model.PersonalGoalAcceptResponse;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class a4b0 extends c4b0 {
    public final PersonalGoalAcceptResponse a;

    public a4b0(PersonalGoalAcceptResponse personalGoalAcceptResponse) {
        this.a = personalGoalAcceptResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a4b0) && jl40.l(this.a, ((a4b0) obj).a);
    }

    public final int hashCode() {
        PersonalGoalAcceptResponse personalGoalAcceptResponse = this.a;
        if (personalGoalAcceptResponse == null) {
            return 0;
        }
        return personalGoalAcceptResponse.hashCode();
    }

    public final String toString() {
        return "Error(response=" + this.a + Extension.C_BRAKE;
    }
}
