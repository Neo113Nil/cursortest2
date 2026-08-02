package xsna;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.soloader.MinElf;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryQuestionEntry;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.dto.user.UserProfile;
import com.vk.story.viewer.impl.presentation.stories.util.StoryQuestionMessageDialog;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.av20;
import xsna.h7u0;
import xsna.o0r0;
import xsna.vbl0;

/* compiled from: StickersQuestionOptionsBottomSheet.kt */
/* loaded from: classes6.dex */
public final class ubl0 implements av20.b<vbl0> {
    public final /* synthetic */ sbl0 a;

    public ubl0(sbl0 sbl0Var) {
        this.a = sbl0Var;
    }

    /* JADX WARN: Type inference failed for: r11v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v27, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.av20.b
    public final void a(View view, Object obj, int i, wmg wmgVar) {
        String f;
        vbl0 vbl0Var = (vbl0) obj;
        sbl0 sbl0Var = this.a;
        ?? r12 = sbl0Var.l;
        io.reactivex.rxjava3.disposables.b bVar = sbl0Var.g;
        Context context = sbl0Var.a;
        StoryEntry storyEntry = sbl0Var.c;
        StoryQuestionEntry storyQuestionEntry = sbl0Var.d;
        if (vbl0Var instanceof vbl0.b.a) {
            StoryQuestionMessageDialog.a aVar = new StoryQuestionMessageDialog.a(StoryQuestionMessageDialog.class, null, null);
            Bundle bundle = aVar.j;
            bundle.putParcelable("story_entry_key", storyEntry);
            bundle.putParcelable("story_question_key", storyQuestionEntry);
            dhr0.a.getClass();
            aVar.w(dhr0.u().c);
            StoryQuestionMessageDialog storyQuestionMessageDialog = (StoryQuestionMessageDialog) aVar.f();
            storyQuestionMessageDialog.V = new ai9(sbl0Var);
            ComponentCallbacks2 h = e3m.h(context);
            if (h != null) {
                if (h instanceof xbs) {
                    storyQuestionMessageDialog.Fn(((xbs) h).n(), "story_message_dialog");
                } else if (h instanceof FragmentActivity) {
                    storyQuestionMessageDialog.Td(((FragmentActivity) h).getSupportFragmentManager(), "story_message_dialog");
                }
            }
        } else if (vbl0Var instanceof vbl0.b.C3882b) {
            UserId userId = storyQuestionEntry.c;
            if (userId != null) {
                ((o0r0) sbl0Var.n.getValue()).m(context, userId, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                sbl0Var.d(StoryViewAction.QUESTION_GO_TO_AUTHOR);
            }
        } else if (vbl0Var instanceof vbl0.a.c) {
            ((spl0) sbl0Var.o.getValue()).e(sbl0Var.a, "story_question", storyQuestionEntry.b, storyEntry.d, null, null);
        } else if (vbl0Var instanceof vbl0.a.C3881a) {
            int i2 = h7u0.p;
            h7u0.a a = h7u0.b.a(context);
            if (sbl0Var.a()) {
                f = y8g0.e(R.string.story_question_option_ban_anonim_desc);
            } else {
                UserProfile userProfile = storyQuestionEntry.g;
                String string = userProfile != null ? userProfile.s.getString("name_acc") : null;
                if (string == null) {
                    string = "";
                }
                f = y8g0.f(R.string.story_quention_option_ban_desc, string);
            }
            a.a.f = f;
            a.c0(R.string.story_question_option_ban_button, new w4w(sbl0Var, 2));
            a.W(R.string.cancel, null);
            a.m();
        } else if (vbl0Var instanceof vbl0.a.d) {
            bVar.b(((jfm0) r12.getValue()).k(storyEntry.c, storyEntry.d, storyQuestionEntry.b).m(asu0.a.d()).subscribe(new cc20(new or50(sbl0Var, 24), 22), new tk40(new gib0(sbl0Var, 11), 15)));
        } else {
            if (!(vbl0Var instanceof vbl0.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar.b(((jfm0) r12.getValue()).c(storyEntry.c, storyEntry.d, storyQuestionEntry.b).m(asu0.a.d()).subscribe(new w250(new r6i0(sbl0Var, 5), 18), new a8v(new z6f0(sbl0Var, 11), 20)));
        }
        dw20 dw20Var = sbl0Var.p;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
    }
}
