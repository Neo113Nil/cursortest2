package xsna;

import com.vk.clips.sdk.shared.questionnarie.QuestionnaireDto;
import java.util.List;

/* compiled from: QuestionnairesDto.kt */
/* loaded from: classes17.dex */
public final class eqe0 {
    public final List<QuestionnaireDto> a;

    public eqe0(List<QuestionnaireDto> list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eqe0) && epx.f(this.a, ((eqe0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("QuestionnairesDto(questionnaires="), this.a);
    }
}
