package xsna;

import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.feed.core.models.MyTargetBrandLiftSurvey;
import com.vk.newsfeed.common.presentation.model.items.MyTargetInternalNativeAdBlsUiDto;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: MyTargetInternalNativeAdBlsTransformer.kt */
/* loaded from: classes4.dex */
public final class qq50 implements gn60<MyTargetNativeAdEntry, wm60> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    public final List a(MyTargetNativeAdEntry myTargetNativeAdEntry) {
        Object obj;
        ArrayList arrayList;
        gjx gjxVar = myTargetNativeAdEntry.B;
        MyTargetBrandLiftSurvey myTargetBrandLiftSurvey = myTargetNativeAdEntry.v;
        ArrayList arrayList2 = null;
        if (gjxVar != null && myTargetBrandLiftSurvey != null) {
            List<MyTargetBrandLiftSurvey.Question> list = myTargetBrandLiftSurvey.b;
            MyTargetNativeAdEntry.b bVar = myTargetNativeAdEntry.E;
            boolean z = true;
            if (bVar == null || !bVar.b) {
                List<MyTargetBrandLiftSurvey.Question> list2 = list;
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    String str = ((MyTargetBrandLiftSurvey.Question) obj).b;
                    MyTargetNativeAdEntry.b bVar2 = myTargetNativeAdEntry.E;
                    if (str.equals(bVar2 != null ? bVar2.a : null)) {
                        break;
                    }
                }
                MyTargetBrandLiftSurvey.Question question = (MyTargetBrandLiftSurvey.Question) obj;
                if (question == null) {
                    question = (MyTargetBrandLiftSurvey.Question) j5g.a0(list);
                }
                if (question != null) {
                    List<MyTargetBrandLiftSurvey.Answer> list3 = question.e;
                    arrayList2 = new ArrayList(c5g.u(list3, 10));
                    for (MyTargetBrandLiftSurvey.Answer answer : list3) {
                        String str2 = answer.b;
                        int i = answer.c;
                        arrayList2.add(new MyTargetInternalNativeAdBlsUiDto.AnswerUiDto(str2, i != 0 ? i != 1 ? i != 2 ? MyTargetInternalNativeAdBlsUiDto.AnswerUiDto.AnswerType.USER_ANSWER : MyTargetInternalNativeAdBlsUiDto.AnswerUiDto.AnswerType.NOTHING_ANSWER : MyTargetInternalNativeAdBlsUiDto.AnswerUiDto.AnswerType.OTHER_ANSWER : MyTargetInternalNativeAdBlsUiDto.AnswerUiDto.AnswerType.USER_ANSWER, answer.e, answer.d));
                    }
                }
                ArrayList arrayList3 = arrayList2;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (((MyTargetBrandLiftSurvey.Question) it2.next()).e.size() >= 7) {
                            break;
                        }
                    }
                }
                z = false;
                arrayList = (question == null || arrayList3 == null || arrayList3.isEmpty()) ? EmptyList.b : Collections.singletonList(new MyTargetInternalNativeAdBlsUiDto(gjxVar, myTargetNativeAdEntry, new MyTargetInternalNativeAdBlsUiDto.a.b(z, new MyTargetInternalNativeAdBlsUiDto.QuestionUiDto(question.b, question.d.equals("multiple_answers") ? MyTargetInternalNativeAdBlsUiDto.QuestionUiDto.QuestionType.MULTIPLE_ANSWERS : MyTargetInternalNativeAdBlsUiDto.QuestionUiDto.QuestionType.ONE_ANSWER, question.c, question.f, arrayList3))));
            } else {
                arrayList = Collections.singletonList(new MyTargetInternalNativeAdBlsUiDto(gjxVar, myTargetNativeAdEntry, MyTargetInternalNativeAdBlsUiDto.a.C1368a.a));
            }
            arrayList2 = arrayList;
        }
        return arrayList2 == null ? EmptyList.b : arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public final /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return a((MyTargetNativeAdEntry) pair);
    }
}
