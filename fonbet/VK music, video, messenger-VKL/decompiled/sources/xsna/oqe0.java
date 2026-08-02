package xsna;

import android.content.Context;
import com.vk.api.generated.questions.dto.QuestionsQuestionDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.profile.questions.impl.QuestionsListFragment;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import xsna.ikv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class oqe0 implements izs {
    public final /* synthetic */ com.vk.profile.questions.impl.h b;
    public final /* synthetic */ com.vk.profile.questions.impl.d c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ oqe0(com.vk.profile.questions.impl.h hVar, com.vk.profile.questions.impl.d dVar, boolean z, boolean z2) {
        this.b = hVar;
        this.c = dVar;
        this.d = z;
        this.e = z2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        com.vk.profile.questions.impl.d dVar;
        boolean z;
        com.vk.profile.questions.impl.h hVar = this.b;
        ArrayList arrayList = hVar.h;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            dVar = this.c;
            z = this.d;
            if (!hasNext) {
                break;
            }
            com.vk.profile.questions.impl.d dVar2 = (com.vk.profile.questions.impl.d) it.next();
            if (epx.f(dVar2.b().g(), dVar.b().g())) {
                com.vk.profile.questions.impl.c cVar = hVar.g;
                QuestionsQuestionDto a = QuestionsQuestionDto.a(dVar2.b(), Boolean.valueOf(z));
                UsersUserFullDto a2 = dVar2.a();
                cVar.getClass();
                dVar2 = com.vk.profile.questions.impl.c.a(a, a2);
            }
            arrayList2.add(dVar2);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        hVar.u7();
        QuestionsListFragment questionsListFragment = hVar.c;
        Context requireContext = questionsListFragment.requireContext();
        if (z) {
            boolean z2 = this.e;
            Pair pair = z2 ? new Pair(Integer.valueOf(R.string.questions_autor_blocked_many), Integer.valueOf(R.string.questions_remove_questions)) : new Pair(Integer.valueOf(R.string.questions_autor_blocked), Integer.valueOf(R.string.questions_remove_question));
            int intValue = ((Number) pair.d()).intValue();
            int intValue2 = ((Number) pair.g()).intValue();
            ikv0.a aVar = new ikv0.a(requireContext);
            aVar.u = new ikv0.d(requireContext.getString(intValue), (String) null, (ikv0.d.a) null, 6);
            aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, requireContext.getString(intValue2), new mf60(z2, questionsListFragment, dVar));
            aVar.e = 7000L;
            aVar.n();
        } else {
            ikv0.a aVar2 = new ikv0.a(requireContext);
            aVar2.u = new ikv0.d(requireContext.getString(R.string.questions_autor_unblocked), (String) null, (ikv0.d.a) null, 6);
            aVar2.n();
        }
        return s3q0.a;
    }
}
