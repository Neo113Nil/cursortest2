package xsna;

import androidx.recyclerview.widget.m;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoryQuestionEntry;
import com.vk.dto.user.UserProfile;
import com.vk.stories.design.view.stats.tabs.stickers.question.QuestionPayload;
import java.util.ArrayList;

/* compiled from: StickersQuestionDiffUtilCallback.kt */
/* loaded from: classes6.dex */
public final class rbl0 extends m.e<val0> {
    public static boolean a(val0 val0Var, val0 val0Var2) {
        boolean c = c(val0Var, val0Var2);
        StoryQuestionEntry storyQuestionEntry = val0Var.b;
        StoryQuestionEntry storyQuestionEntry2 = val0Var2.b;
        return c && b(val0Var, val0Var2) && storyQuestionEntry.j == storyQuestionEntry2.j && epx.f(storyQuestionEntry.d, storyQuestionEntry2.d) && storyQuestionEntry.h == storyQuestionEntry2.h && d(val0Var, val0Var2) && epx.f(val0Var.c, val0Var2.c);
    }

    public static boolean b(val0 val0Var, val0 val0Var2) {
        StoryQuestionEntry storyQuestionEntry = val0Var.b;
        boolean z = storyQuestionEntry.e;
        StoryQuestionEntry storyQuestionEntry2 = val0Var2.b;
        if (z != storyQuestionEntry2.e || !epx.f(storyQuestionEntry.g, storyQuestionEntry2.g)) {
            return false;
        }
        UserProfile userProfile = storyQuestionEntry.g;
        Image image = userProfile != null ? userProfile.O : null;
        UserProfile userProfile2 = storyQuestionEntry2.g;
        if (!epx.f(image, userProfile2 != null ? userProfile2.O : null)) {
            return false;
        }
        UserProfile userProfile3 = storyQuestionEntry.g;
        String str = userProfile3 != null ? userProfile3.h : null;
        UserProfile userProfile4 = storyQuestionEntry2.g;
        return epx.f(str, userProfile4 != null ? userProfile4.h : null);
    }

    public static boolean c(val0 val0Var, val0 val0Var2) {
        StoryQuestionEntry storyQuestionEntry = val0Var.b;
        boolean z = storyQuestionEntry.e;
        StoryQuestionEntry storyQuestionEntry2 = val0Var2.b;
        if (z != storyQuestionEntry2.e || !epx.f(storyQuestionEntry.g, storyQuestionEntry2.g)) {
            return false;
        }
        UserProfile userProfile = val0Var.b.g;
        String str = userProfile != null ? userProfile.d : null;
        UserProfile userProfile2 = val0Var2.b.g;
        return epx.f(str, userProfile2 != null ? userProfile2.d : null);
    }

    public static boolean d(val0 val0Var, val0 val0Var2) {
        StoryQuestionEntry storyQuestionEntry = val0Var.b;
        UserId userId = storyQuestionEntry.c;
        StoryQuestionEntry storyQuestionEntry2 = val0Var2.b;
        if (!epx.f(userId, storyQuestionEntry2.c)) {
            return false;
        }
        boolean z = storyQuestionEntry.f;
        UserProfile userProfile = storyQuestionEntry.g;
        boolean z2 = storyQuestionEntry2.f;
        UserProfile userProfile2 = storyQuestionEntry2.g;
        if (z != z2) {
            return false;
        }
        if (epx.f(userProfile != null ? userProfile.n() : null, userProfile2 != null ? userProfile2.n() : null)) {
            return epx.f(userProfile != null ? userProfile.s.getString("name_acc") : null, userProfile2 != null ? userProfile2.s.getString("name_acc") : null);
        }
        return false;
    }

    public static ArrayList e(val0 val0Var, val0 val0Var2) {
        ArrayList arrayList = new ArrayList();
        boolean c = c(val0Var, val0Var2);
        StoryQuestionEntry storyQuestionEntry = val0Var.b;
        StoryQuestionEntry storyQuestionEntry2 = val0Var2.b;
        if (!c) {
            arrayList.add(QuestionPayload.FULL_NAME);
        }
        if (!b(val0Var, val0Var2)) {
            arrayList.add(QuestionPayload.AVATAR);
        }
        if (storyQuestionEntry.j != storyQuestionEntry2.j) {
            arrayList.add(QuestionPayload.DATE);
        }
        if (!epx.f(storyQuestionEntry.d, storyQuestionEntry2.d)) {
            arrayList.add(QuestionPayload.TEXT);
        }
        if (storyQuestionEntry.h != storyQuestionEntry2.h) {
            arrayList.add(QuestionPayload.BUTTON);
        }
        if (!d(val0Var, val0Var2)) {
            arrayList.add(QuestionPayload.OPTIONS);
        }
        if (!epx.f(val0Var.c, val0Var2.c)) {
            arrayList.add(QuestionPayload.SELECTION);
        }
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.m.e
    public final /* bridge */ /* synthetic */ boolean areContentsTheSame(val0 val0Var, val0 val0Var2) {
        return a(val0Var, val0Var2);
    }

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areItemsTheSame(val0 val0Var, val0 val0Var2) {
        return val0Var.b.b == val0Var2.b.b;
    }

    @Override // androidx.recyclerview.widget.m.e
    public final /* bridge */ /* synthetic */ Object getChangePayload(val0 val0Var, val0 val0Var2) {
        return e(val0Var, val0Var2);
    }
}
