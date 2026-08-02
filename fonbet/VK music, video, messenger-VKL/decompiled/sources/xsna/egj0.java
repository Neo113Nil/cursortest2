package xsna;

import com.vk.api.generated.shortVideo.dto.ShortVideoQuestionnaireDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoQuestionnaireQuestionDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoQuestionnaireQuestionTargetDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoQuestionnaireQuestionValuesDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoQuestionnaireTriggerDto;
import com.vk.clips.sdk.shared.questionnarie.QuestionDto;
import com.vk.clips.sdk.shared.questionnarie.QuestionLayoutDto;
import com.vk.clips.sdk.shared.questionnarie.QuestionTargetDto;
import com.vk.clips.sdk.shared.questionnarie.QuestionValueDto;
import com.vk.clips.sdk.shared.questionnarie.QuestionnaireDto;
import com.vk.clips.sdk.shared.questionnarie.QuestionnaireTriggerDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;

/* compiled from: ShortVideoQuestionnaireToQuestionnairesMapper.kt */
/* loaded from: classes17.dex */
public final class egj0 {
    public static eqe0 a(List list) {
        QuestionnaireTriggerDto questionnaireTriggerDto;
        List<ShortVideoQuestionnaireDto> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (ShortVideoQuestionnaireDto shortVideoQuestionnaireDto : list2) {
            String id = shortVideoQuestionnaireDto.getId();
            String e = shortVideoQuestionnaireDto.e();
            List<ShortVideoQuestionnaireQuestionDto> d = shortVideoQuestionnaireDto.d();
            ArrayList arrayList2 = new ArrayList(c5g.u(d, 10));
            Iterator<T> it = d.iterator();
            while (it.hasNext()) {
                arrayList2.add(b((ShortVideoQuestionnaireQuestionDto) it.next()));
            }
            List<ShortVideoQuestionnaireTriggerDto> f = shortVideoQuestionnaireDto.f();
            ArrayList arrayList3 = new ArrayList(c5g.u(f, 10));
            for (ShortVideoQuestionnaireTriggerDto shortVideoQuestionnaireTriggerDto : f) {
                if (shortVideoQuestionnaireTriggerDto instanceof ShortVideoQuestionnaireTriggerDto.ShortVideoQuestionnaireTriggerAfterItemDto) {
                    ShortVideoQuestionnaireTriggerDto.ShortVideoQuestionnaireTriggerAfterItemDto shortVideoQuestionnaireTriggerAfterItemDto = (ShortVideoQuestionnaireTriggerDto.ShortVideoQuestionnaireTriggerAfterItemDto) shortVideoQuestionnaireTriggerDto;
                    questionnaireTriggerDto = new QuestionnaireTriggerDto(shortVideoQuestionnaireTriggerAfterItemDto.e().i(), shortVideoQuestionnaireTriggerAfterItemDto.d());
                } else {
                    if (!(shortVideoQuestionnaireTriggerDto instanceof ShortVideoQuestionnaireTriggerDto.ShortVideoQuestionnaireTriggerAfterUserActionDto)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    questionnaireTriggerDto = new QuestionnaireTriggerDto(((ShortVideoQuestionnaireTriggerDto.ShortVideoQuestionnaireTriggerAfterUserActionDto) shortVideoQuestionnaireTriggerDto).d().i(), EmptyList.b);
                }
                arrayList3.add(questionnaireTriggerDto);
            }
            arrayList.add(new QuestionnaireDto(id, e, null, arrayList2, arrayList3));
        }
        return new eqe0(arrayList);
    }

    public static QuestionDto b(ShortVideoQuestionnaireQuestionDto shortVideoQuestionnaireQuestionDto) {
        if (shortVideoQuestionnaireQuestionDto instanceof ShortVideoQuestionnaireQuestionDto.ShortVideoQuestionnaireQuestionBaseDto) {
            ShortVideoQuestionnaireQuestionDto.ShortVideoQuestionnaireQuestionBaseDto shortVideoQuestionnaireQuestionBaseDto = (ShortVideoQuestionnaireQuestionDto.ShortVideoQuestionnaireQuestionBaseDto) shortVideoQuestionnaireQuestionDto;
            String i = shortVideoQuestionnaireQuestionBaseDto.g().i();
            String d = shortVideoQuestionnaireQuestionBaseDto.d();
            QuestionLayoutDto questionLayoutDto = new QuestionLayoutDto(shortVideoQuestionnaireQuestionBaseDto.e().d(), "", "");
            List<ShortVideoQuestionnaireQuestionTargetDto> f = shortVideoQuestionnaireQuestionBaseDto.f();
            ArrayList arrayList = new ArrayList(c5g.u(f, 10));
            for (ShortVideoQuestionnaireQuestionTargetDto shortVideoQuestionnaireQuestionTargetDto : f) {
                String d2 = shortVideoQuestionnaireQuestionTargetDto.d();
                List<String> e = shortVideoQuestionnaireQuestionTargetDto.e();
                if (e == null) {
                    e = EmptyList.b;
                }
                arrayList.add(new QuestionTargetDto(d2, e));
            }
            return new QuestionDto(i, d, questionLayoutDto, null, arrayList);
        }
        if (!(shortVideoQuestionnaireQuestionDto instanceof ShortVideoQuestionnaireQuestionDto.ShortVideoQuestionnaireQuestionWithValuesDto)) {
            throw new NoWhenBranchMatchedException();
        }
        ShortVideoQuestionnaireQuestionDto.ShortVideoQuestionnaireQuestionWithValuesDto shortVideoQuestionnaireQuestionWithValuesDto = (ShortVideoQuestionnaireQuestionDto.ShortVideoQuestionnaireQuestionWithValuesDto) shortVideoQuestionnaireQuestionDto;
        String i2 = shortVideoQuestionnaireQuestionWithValuesDto.g().i();
        String d3 = shortVideoQuestionnaireQuestionWithValuesDto.d();
        QuestionLayoutDto questionLayoutDto2 = new QuestionLayoutDto(shortVideoQuestionnaireQuestionWithValuesDto.e().d(), "", "");
        List<ShortVideoQuestionnaireQuestionValuesDto> i3 = shortVideoQuestionnaireQuestionWithValuesDto.i();
        ArrayList arrayList2 = new ArrayList(c5g.u(i3, 10));
        for (ShortVideoQuestionnaireQuestionValuesDto shortVideoQuestionnaireQuestionValuesDto : i3) {
            arrayList2.add(new QuestionValueDto(shortVideoQuestionnaireQuestionValuesDto.e(), shortVideoQuestionnaireQuestionValuesDto.d()));
        }
        List<ShortVideoQuestionnaireQuestionTargetDto> f2 = shortVideoQuestionnaireQuestionWithValuesDto.f();
        ArrayList arrayList3 = new ArrayList(c5g.u(f2, 10));
        for (ShortVideoQuestionnaireQuestionTargetDto shortVideoQuestionnaireQuestionTargetDto2 : f2) {
            String d4 = shortVideoQuestionnaireQuestionTargetDto2.d();
            List<String> e2 = shortVideoQuestionnaireQuestionTargetDto2.e();
            if (e2 == null) {
                e2 = EmptyList.b;
            }
            arrayList3.add(new QuestionTargetDto(d4, e2));
        }
        return new QuestionDto(i2, d3, questionLayoutDto2, arrayList2, arrayList3);
    }
}
