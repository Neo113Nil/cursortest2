package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.api.generated.questions.dto.QuestionsGetByIdExtendedResponseDto;
import com.vk.api.generated.questions.dto.QuestionsQuestionDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.profile.questions.impl.d;
import com.vk.superapp.ui.views.horizontalscroll.DefaultWidthSpreaderLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class rrl implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rrl(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        switch (this.b) {
            case 0:
                View view = (View) obj;
                ((DefaultWidthSpreaderLayoutManager) this.d).getClass();
                int measuredWidth = view.getMeasuredWidth() + this.c;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = measuredWidth;
                }
                return s3q0.a;
            case 1:
                NewsEntry newsEntry = (NewsEntry) this.d;
                u1c0 u1c0Var = (u1c0) obj;
                NewsEntry newsEntry2 = u1c0Var.b;
                NewsEntry newsEntry3 = u1c0Var.a;
                NewsEntry newsEntry4 = epx.f(newsEntry2, newsEntry) ? newsEntry : u1c0Var.b;
                if (!epx.f(newsEntry3, newsEntry)) {
                    newsEntry = newsEntry3;
                }
                return lbs.b(u1c0Var, newsEntry, newsEntry4, this.c);
            default:
                com.vk.profile.questions.impl.h hVar = (com.vk.profile.questions.impl.h) this.d;
                QuestionsGetByIdExtendedResponseDto questionsGetByIdExtendedResponseDto = (QuestionsGetByIdExtendedResponseDto) obj;
                Iterator<T> it = questionsGetByIdExtendedResponseDto.d().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (epx.f(((UsersUserFullDto) obj2).s1(), questionsGetByIdExtendedResponseDto.e().g())) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                UsersUserFullDto usersUserFullDto = (UsersUserFullDto) obj2;
                if (usersUserFullDto == null) {
                    return s3q0.a;
                }
                com.vk.profile.questions.impl.c cVar = hVar.g;
                QuestionsQuestionDto e = questionsGetByIdExtendedResponseDto.e();
                cVar.getClass();
                d.c a = com.vk.profile.questions.impl.c.a(e, usersUserFullDto);
                ArrayList arrayList = hVar.h;
                Iterator it2 = arrayList.iterator();
                int i = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i = -1;
                    } else if (((com.vk.profile.questions.impl.d) it2.next()).b().getId() != this.c) {
                        i++;
                    }
                }
                if (i >= 0) {
                    arrayList.set(i, a);
                    hVar.u7();
                }
                return s3q0.a;
        }
    }
}
