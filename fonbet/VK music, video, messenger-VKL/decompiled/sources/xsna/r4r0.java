package xsna;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vk.api.generated.base.dto.BaseRequestParamDto;
import com.vk.api.generated.uxpolls.dto.UxpollsConfigDto;
import com.vk.api.generated.uxpolls.dto.UxpollsPollDto;
import com.vk.dto.uxpolls.ChipOption;
import com.vk.dto.uxpolls.Condition;
import com.vk.dto.uxpolls.PollQuestion;
import com.vk.dto.uxpolls.PollTranslations;
import com.vk.dto.uxpolls.UxPoll;
import com.vk.video.polls.data.ApiPollMetadataDto;
import com.vk.video.polls.data.UxPollQuestionDeserializer;
import com.vk.video.polls.data.a;
import com.vk.video.polls.data.b;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;

/* compiled from: UxPollsApiMapperImpl.kt */
/* loaded from: classes6.dex */
public final class r4r0 implements q4r0 {
    public final Context a;
    public final Gson b = new GsonBuilder().registerTypeAdapter(com.vk.video.polls.data.b.class, new UxPollQuestionDeserializer()).create();

    public r4r0(Context context) {
        this.a = context;
    }

    public static Condition b(com.vk.video.polls.data.a aVar) {
        if (aVar instanceof a.d) {
            a.d dVar = (a.d) aVar;
            return new Condition.SimpleWithId.HasAnswers(dVar.a, dVar.b);
        }
        if (aVar instanceof a.c) {
            return new Condition.SimpleWithId.AnswerIsEmpty(((a.c) aVar).a);
        }
        if (aVar instanceof a.b) {
            a.b bVar = (a.b) aVar;
            return new Condition.SimpleWithId.HasWords(bVar.a, bVar.b);
        }
        if (aVar instanceof a.C1953a) {
            ArrayList arrayList = ((a.C1953a) aVar).a;
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(b((com.vk.video.polls.data.a) it.next()));
            }
            return new Condition.And(arrayList2);
        }
        if (!(aVar instanceof a.e)) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList3 = ((a.e) aVar).a;
        ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(b((com.vk.video.polls.data.a) it2.next()));
        }
        return new Condition.Or(arrayList4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ad, code lost:
    
        if (r9 == null) goto L73;
     */
    @Override // xsna.q4r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final UxPoll a(UxpollsPollDto uxpollsPollDto, UxpollsConfigDto uxpollsConfigDto) {
        ApiPollMetadataDto apiPollMetadataDto = (ApiPollMetadataDto) this.b.fromJson(uxpollsPollDto.e(), ApiPollMetadataDto.class);
        int id = uxpollsPollDto.getId();
        List<String> f = uxpollsPollDto.f();
        List<com.vk.video.polls.data.b> c = apiPollMetadataDto.c();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = c.iterator();
        while (true) {
            PollTranslations pollTranslations = null;
            if (!it.hasNext()) {
                String b = apiPollMetadataDto.b();
                boolean a = apiPollMetadataDto.a();
                Integer d = uxpollsPollDto.d();
                int intValue = d != null ? d.intValue() : 0;
                if (uxpollsConfigDto != null) {
                    List<BaseRequestParamDto> d2 = uxpollsConfigDto.d();
                    if (d2 != null) {
                        List<BaseRequestParamDto> list = d2;
                        int e = on00.e(c5g.u(list, 10));
                        if (e < 16) {
                            e = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                        for (BaseRequestParamDto baseRequestParamDto : list) {
                            Pair pair = new Pair(baseRequestParamDto.d(), baseRequestParamDto.e());
                            linkedHashMap.put(pair.i(), pair.j());
                        }
                        String str = (String) linkedHashMap.get("uxpolls_completion_title");
                        if (str == null) {
                            str = "";
                        }
                        String str2 = (String) linkedHashMap.get("uxpolls_button_continue");
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = (String) linkedHashMap.get("uxpolls_button_send");
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str4 = (String) linkedHashMap.get("uxpolls_poll_step_caption");
                        pollTranslations = new PollTranslations(str, str2, str3, str4 != null ? str4 : "");
                    }
                }
                Context context = this.a;
                pollTranslations = new PollTranslations(context.getString(R.string.polls_video_completion_title), context.getString(R.string.continue_), context.getString(R.string.send), context.getString(R.string.polls_video_step_caption));
                return new UxPoll(id, f, arrayList, b, a, intValue, pollTranslations);
            }
            com.vk.video.polls.data.b bVar = (com.vk.video.polls.data.b) it.next();
            if (bVar instanceof b.d) {
                b.d dVar = (b.d) bVar;
                int i = dVar.a;
                String str5 = dVar.b;
                com.vk.video.polls.data.a aVar = dVar.c;
                arrayList.add(new PollQuestion.RatingStar(i, str5, aVar != null ? b(aVar) : null, dVar.d));
            } else if (bVar instanceof b.a) {
                b.a aVar2 = (b.a) bVar;
                int i2 = aVar2.a;
                ArrayList arrayList2 = aVar2.d;
                String str6 = aVar2.b;
                com.vk.video.polls.data.a aVar3 = aVar2.c;
                arrayList.add(new PollQuestion.Chips(i2, str6, aVar3 != null ? b(aVar3) : null, arrayList2));
                b.a.C1954a c1954a = aVar2.e;
                PollQuestion.Open.OpenFeedback openFeedback = c1954a != null ? new PollQuestion.Open.OpenFeedback(c1954a.a, c1954a.b, c1954a.c) : null;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    if (((ChipOption) obj).d) {
                        arrayList3.add(obj);
                    }
                }
                ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(Integer.valueOf(((ChipOption) it2.next()).b));
                }
                arrayList.add(new PollQuestion.Open(i2, str6, new Condition.SimpleWithId.HasAnswers(i2, arrayList4), openFeedback));
            } else if (bVar instanceof b.C1955b) {
                b.C1955b c1955b = (b.C1955b) bVar;
                int i3 = c1955b.a;
                String str7 = c1955b.b;
                com.vk.video.polls.data.a aVar4 = c1955b.c;
                arrayList.add(new PollQuestion.Grade(i3, str7, aVar4 != null ? b(aVar4) : null, c1955b.d, c1955b.e, c1955b.f));
            } else {
                if (!(bVar instanceof b.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                b.c cVar = (b.c) bVar;
                int i4 = cVar.a;
                String str8 = cVar.b;
                com.vk.video.polls.data.a aVar5 = cVar.c;
                arrayList.add(new PollQuestion.Open(i4, str8, aVar5 != null ? b(aVar5) : null, new PollQuestion.Open.OpenFeedback(cVar.d, false, false)));
            }
        }
    }
}
