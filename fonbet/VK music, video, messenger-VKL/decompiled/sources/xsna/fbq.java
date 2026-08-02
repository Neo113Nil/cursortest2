package xsna;

import com.vk.clips.internal.nps.api.model.InternalNpsQuestion;
import com.vk.clips.internal.nps.api.model.InternalNpsQuestionLayout;
import com.vk.clips.internal.nps.api.model.InternalNpsQuestionTarget;
import com.vk.clips.internal.nps.api.model.InternalNpsQuestionValue;
import com.vk.clips.internal.nps.api.model.InternalNpsQuestions;
import com.vk.clips.internal.nps.api.model.QuestionType;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.sdk.shared.questionnarie.QuestionDto;
import com.vk.clips.sdk.shared.questionnarie.QuestionLayoutDto;
import com.vk.clips.sdk.shared.questionnarie.QuestionTargetDto;
import com.vk.clips.sdk.shared.questionnarie.QuestionValueDto;
import com.vk.clips.sdk.shared.questionnarie.QuestionnaireDto;
import com.vk.clips.sdk.shared.questionnarie.QuestionnaireTriggerDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.cqe0;
import xsna.n0x;

/* compiled from: ExtendFeedItemsController.kt */
/* loaded from: classes17.dex */
public final class fbq implements gbq {
    public final njx a;
    public final mie b;

    public fbq(njx njxVar, mie mieVar) {
        this.a = njxVar;
        this.b = mieVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.util.List<? extends com.vk.clips.sdk.shared.feed.model.FeedItem>, java.util.List<com.vk.clips.sdk.shared.feed.model.FeedItem>] */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v8, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // xsna.gbq
    public final List<FeedItem> a(qih0 qih0Var, List<? extends FeedItem> list) {
        InternalNpsQuestion internalNpsQuestion;
        QuestionType questionType;
        Iterator it;
        ?? r8;
        eqe0 eqe0Var = qih0Var.g;
        if (eqe0Var != null) {
            List<QuestionnaireDto> list2 = eqe0Var.a;
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                QuestionnaireDto questionnaireDto = (QuestionnaireDto) it2.next();
                this.b.getClass();
                String str = questionnaireDto.b;
                String str2 = questionnaireDto.c;
                List<QuestionDto> list3 = questionnaireDto.e;
                int e = on00.e(c5g.u(list3, 10));
                if (e < 16) {
                    e = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                for (QuestionDto questionDto : list3) {
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
                    List<QuestionValueDto> list4 = questionDto.e;
                    if (list4 != null) {
                        List<QuestionValueDto> list5 = list4;
                        it = it2;
                        r8 = new ArrayList(c5g.u(list5, 10));
                        for (Iterator it3 = list5.iterator(); it3.hasNext(); it3 = it3) {
                            QuestionValueDto questionValueDto = (QuestionValueDto) it3.next();
                            r8.add(new InternalNpsQuestionValue(questionValueDto.b, questionValueDto.c));
                        }
                    } else {
                        it = it2;
                        r8 = EmptyList.b;
                    }
                    List list6 = r8;
                    List<QuestionTargetDto> list7 = questionDto.f;
                    ArrayList arrayList2 = new ArrayList(c5g.u(list7, 10));
                    for (QuestionTargetDto questionTargetDto : list7) {
                        arrayList2.add(new InternalNpsQuestionTarget(questionTargetDto.b, questionTargetDto.c));
                    }
                    Pair pair = new Pair(str3, new InternalNpsQuestion(questionType2, str5, internalNpsQuestionLayout, list6, arrayList2));
                    linkedHashMap.put(pair.i(), pair.j());
                    it2 = it;
                }
                Iterator it4 = it2;
                InternalNpsQuestions internalNpsQuestions = new InternalNpsQuestions(str, str2, linkedHashMap);
                List<QuestionnaireTriggerDto> list8 = questionnaireDto.f;
                ArrayList arrayList3 = new ArrayList();
                for (QuestionnaireTriggerDto questionnaireTriggerDto : list8) {
                    cqe0.a aVar = epx.f(questionnaireTriggerDto.b, "after_view_video") ? new cqe0.a(questionnaireTriggerDto.c, internalNpsQuestions) : null;
                    if (aVar != null) {
                        arrayList3.add(aVar);
                    }
                }
                g5g.y(arrayList3, arrayList);
                it2 = it4;
            }
            njx njxVar = this.a;
            if (njxVar.a.a()) {
                Iterator it5 = arrayList.iterator();
                ArrayList<FeedItem> arrayList4 = list;
                while (it5.hasNext()) {
                    cqe0 cqe0Var = (cqe0) it5.next();
                    if (!(cqe0Var instanceof cqe0.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h71 h71Var = njxVar.b;
                    cqe0.a aVar2 = (cqe0.a) cqe0Var;
                    ArrayList arrayList5 = new ArrayList();
                    for (FeedItem feedItem : arrayList4) {
                        if (feedItem instanceof FeedItem.d) {
                            FeedItem.d dVar = (FeedItem.d) feedItem;
                            if (aVar2.a.contains(dVar.k().a1())) {
                                InternalNpsQuestions internalNpsQuestions2 = aVar2.b;
                                Map<String, InternalNpsQuestion> map = internalNpsQuestions2.d;
                                InternalNpsQuestion internalNpsQuestion2 = (InternalNpsQuestion) j5g.Z(map.values());
                                if ((internalNpsQuestion2 != null ? internalNpsQuestion2.b : null) == QuestionType.SELECT_INLINE && (internalNpsQuestion = map.get(internalNpsQuestions2.c)) != null) {
                                    h71Var.b.a(dVar.F(), new n0x.b(internalNpsQuestions2, internalNpsQuestion));
                                    h71Var.a.c();
                                    arrayList5.add(dVar);
                                }
                            }
                        }
                        arrayList5.add(feedItem);
                    }
                    arrayList4 = arrayList5;
                }
                return arrayList4;
            }
        }
        return list;
    }
}
