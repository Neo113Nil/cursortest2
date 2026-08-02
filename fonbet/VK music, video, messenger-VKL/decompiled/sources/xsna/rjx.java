package xsna;

import com.vk.clips.internal.nps.api.model.InternalNpsQuestion;
import com.vk.clips.internal.nps.api.model.InternalNpsQuestionLayout;
import com.vk.clips.internal.nps.api.model.InternalNpsQuestionTarget;
import com.vk.clips.internal.nps.api.model.InternalNpsQuestionValue;
import com.vk.clips.internal.nps.api.model.InternalNpsQuestions;
import com.vk.clips.internal.nps.api.model.QuestionType;
import com.vk.clips.sdk.shared.questionnarie.QuestionDto;
import com.vk.clips.sdk.shared.questionnarie.QuestionLayoutDto;
import com.vk.clips.sdk.shared.questionnarie.QuestionTargetDto;
import com.vk.clips.sdk.shared.questionnarie.QuestionValueDto;
import com.vk.clips.sdk.shared.questionnarie.QuestionnaireDto;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: InternalNpsMapper.kt */
/* loaded from: classes3.dex */
public final class rjx {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.util.ArrayList] */
    public static InternalNpsQuestions a(QuestionnaireDto questionnaireDto) {
        QuestionType questionType;
        ?? r7;
        String str = questionnaireDto.b;
        String str2 = questionnaireDto.c;
        List<QuestionDto> list = questionnaireDto.e;
        int e = on00.e(c5g.u(list, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (QuestionDto questionDto : list) {
            String str3 = questionDto.c;
            String str4 = questionDto.b;
            switch (str4.hashCode()) {
                case -1745765694:
                    if (!str4.equals("multi_select")) {
                        throw new IllegalArgumentException("Unsupported question type: ".concat(str4));
                    }
                    questionType = QuestionType.MULTISELECT;
                    break;
                case -906021636:
                    if (!str4.equals("select")) {
                        throw new IllegalArgumentException("Unsupported question type: ".concat(str4));
                    }
                    questionType = QuestionType.SELECT;
                    break;
                case 3556653:
                    if (!str4.equals("text")) {
                        throw new IllegalArgumentException("Unsupported question type: ".concat(str4));
                    }
                    questionType = QuestionType.TEXT;
                    break;
                case 109757537:
                    if (!str4.equals("stars")) {
                        throw new IllegalArgumentException("Unsupported question type: ".concat(str4));
                    }
                    questionType = QuestionType.STARS;
                    break;
                case 583276348:
                    if (!str4.equals("select_inline")) {
                        throw new IllegalArgumentException("Unsupported question type: ".concat(str4));
                    }
                    questionType = QuestionType.SELECT_INLINE;
                    break;
                case 1813179459:
                    if (!str4.equals("more_less")) {
                        throw new IllegalArgumentException("Unsupported question type: ".concat(str4));
                    }
                    questionType = QuestionType.MORE_LESS;
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported question type: ".concat(str4));
            }
            QuestionType questionType2 = questionType;
            String str5 = questionDto.c;
            QuestionLayoutDto questionLayoutDto = questionDto.d;
            InternalNpsQuestionLayout internalNpsQuestionLayout = new InternalNpsQuestionLayout(questionLayoutDto.b, questionLayoutDto.c, questionLayoutDto.d);
            List<QuestionValueDto> list2 = questionDto.e;
            if (list2 != null) {
                List<QuestionValueDto> list3 = list2;
                r7 = new ArrayList(c5g.u(list3, 10));
                for (QuestionValueDto questionValueDto : list3) {
                    r7.add(new InternalNpsQuestionValue(questionValueDto.b, questionValueDto.c));
                }
            } else {
                r7 = EmptyList.b;
            }
            List list4 = r7;
            List<QuestionTargetDto> list5 = questionDto.f;
            ArrayList arrayList = new ArrayList(c5g.u(list5, 10));
            for (QuestionTargetDto questionTargetDto : list5) {
                arrayList.add(new InternalNpsQuestionTarget(questionTargetDto.b, questionTargetDto.c));
            }
            Pair pair = new Pair(str3, new InternalNpsQuestion(questionType2, str5, internalNpsQuestionLayout, list4, arrayList));
            linkedHashMap.put(pair.i(), pair.j());
        }
        return new InternalNpsQuestions(str, str2, linkedHashMap);
    }
}
