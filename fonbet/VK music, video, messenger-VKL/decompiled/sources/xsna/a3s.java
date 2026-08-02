package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.stories.model.HighlightStoriesContainer;
import com.vk.dto.stories.model.PromoStoriesContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vkontakte.android.R;
import com.vkontakte.android.data.FriendsUtils;

/* compiled from: FollowStoryDelegate.java */
/* loaded from: classes6.dex */
public final class a3s {

    @NonNull
    public q7r a;

    @NonNull
    public f0q0 b;

    @NonNull
    public eza0 c;

    /* compiled from: FollowStoryDelegate.java */
    public class a implements hx2<Integer> {
        public final /* synthetic */ UserId b;
        public final /* synthetic */ StoryOwner c;
        public final /* synthetic */ izs d;
        public final /* synthetic */ Context e;
        public final /* synthetic */ a3s f;

        public a(Context context, UserId userId, StoryOwner storyOwner, a3s a3sVar, izs izsVar) {
            this.f = a3sVar;
            this.b = userId;
            this.c = storyOwner;
            this.d = izsVar;
            this.e = context;
        }

        @Override // xsna.hx2
        public final void b(Integer num) {
            int intValue = num.intValue();
            int i = 1;
            if (intValue != 1) {
                if (intValue == 2) {
                    i = 3;
                } else if (intValue != 4) {
                    i = 0;
                }
            }
            FriendsUtils.d(i, this.b);
            a3s.b(this.c, i);
            this.d.invoke(Integer.valueOf(i));
        }

        @Override // xsna.hx2
        public final void e(@NonNull VKApiExecutionException vKApiExecutionException) {
            Context context = this.e;
            if (context != null) {
                cmf0.a.c(context, this.f.a.i0.getWindow(), R.string.error);
            }
        }
    }

    /* compiled from: FollowStoryDelegate.java */
    public class b implements hx2<Integer> {
        public final /* synthetic */ StoryOwner b;
        public final /* synthetic */ izs c;
        public final /* synthetic */ Context d;

        public b(StoryOwner storyOwner, izs izsVar, Context context) {
            this.b = storyOwner;
            this.c = izsVar;
            this.d = context;
        }

        @Override // xsna.hx2
        public final void b(Integer num) {
            a3s.b(this.b, 0);
            this.c.invoke(0);
        }

        @Override // xsna.hx2
        public final void e(@NonNull VKApiExecutionException vKApiExecutionException) {
            Context context = this.d;
            if (context != null) {
                cmf0.a.c(context, a3s.this.a.i0.getWindow(), R.string.error);
            }
        }
    }

    /* compiled from: FollowStoryDelegate.java */
    public class c extends beg0 {
        public final /* synthetic */ StoryOwner d;
        public final /* synthetic */ UserId e;
        public final /* synthetic */ izs f;
        public final /* synthetic */ a3s g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, UserId userId, StoryOwner storyOwner, a3s a3sVar, izs izsVar) {
            super(context);
            this.g = a3sVar;
            this.d = storyOwner;
            this.e = userId;
            this.f = izsVar;
        }

        @Override // xsna.rpj0, xsna.q76, xsna.hx2
        public final void e(VKApiExecutionException vKApiExecutionException) {
            Context context = (Context) this.b;
            if (context != null) {
                cmf0.a.c(context, this.g.a.i0.getWindow(), R.string.error);
            }
            this.d.b = true;
        }

        @Override // xsna.beg0
        public final void r() {
            a3s.b(this.d, 0);
            xwk.e().h0().h(0, (Context) this.b, fkq0.e(this.e));
            this.f.invoke(0);
        }
    }

    public static void b(StoryOwner storyOwner, int i) {
        if (storyOwner instanceof StoryOwner.User) {
            ((StoryOwner.User) storyOwner).c.v = i;
        }
        if (storyOwner instanceof StoryOwner.Community) {
            ((StoryOwner.Community) storyOwner).c.j = i == 3;
        }
        if (storyOwner instanceof StoryOwner.Owner) {
            StoryOwner.Owner owner = (StoryOwner.Owner) storyOwner;
            if (fkq0.d(((StoryOwner.Owner) storyOwner).e)) {
                owner.c.g(4, i != 0);
            } else {
                owner.c.g(4, i != 0);
            }
        }
        storyOwner.b = true;
    }

    @SuppressLint({"CheckResult"})
    public final void a(final StoryOwner storyOwner, final Context context, String str, final izs<Integer, Void> izsVar) {
        UserId userId;
        boolean z = storyOwner instanceof StoryOwner.User;
        boolean z2 = (storyOwner instanceof StoryOwner.Community) || ((storyOwner instanceof StoryOwner.Owner) && fkq0.b(((StoryOwner.Owner) storyOwner).e));
        UserId a2 = fkq0.a(storyOwner.Fb());
        UserId c2 = o25.a().c();
        if (!this.a.i0.getDependencies().k.a(storyOwner, c2)) {
            if (this.a.i0.getDependencies().k.c(storyOwner, c2)) {
                if (!z) {
                    if (z2) {
                        xwk.e().h0().m(context, fkq0.e(a2), new gwg(a2, str, new c(context, a2, storyOwner, this, izsVar), context, 1), null);
                        return;
                    }
                    return;
                } else {
                    eos eosVar = new eos(a2, 0);
                    eosVar.H0(str);
                    jx2 jx2Var = new jx2(eosVar, new b(storyOwner, izsVar, context));
                    jx2Var.g = context;
                    jx2Var.a();
                    return;
                }
            }
            return;
        }
        if (z) {
            com.vkontakte.android.data.b.l();
            yjs yjsVar = new yjs(a2);
            yjsVar.H0(str);
            userId = a2;
            jx2 jx2Var2 = new jx2(yjsVar, new a(context, a2, storyOwner, this, izsVar));
            jx2Var2.g = context;
            jx2Var2.a();
        } else {
            userId = a2;
        }
        if (z2) {
            final UserId userId2 = userId;
            hg1.m(com.vkontakte.android.data.b.d().L(new tje(userId, str), false), context, 0L, false, 62).subscribe(new io.reactivex.rxjava3.functions.f(context, userId2, storyOwner, this, izsVar) { // from class: xsna.y2s
                public final /* synthetic */ StoryOwner b;
                public final /* synthetic */ Context c;
                public final /* synthetic */ UserId d;
                public final /* synthetic */ izs e;

                {
                    this.e = izsVar;
                }

                @Override // io.reactivex.rxjava3.functions.f
                public final void accept(Object obj) {
                    StoryOwner storyOwner2 = this.b;
                    a3s.b(storyOwner2, 3);
                    int i = 1;
                    if (storyOwner2 instanceof StoryOwner.Community) {
                        Group group = ((StoryOwner.Community) storyOwner2).c;
                        if (!group.u() && group.C != 5 && group.s <= 0) {
                            i = 4;
                        }
                    }
                    e4h h0 = xwk.e().h0();
                    UserId userId3 = this.d;
                    h0.h(i, this.c, fkq0.e(userId3));
                    t6g0 t6g0Var = t6g0.b;
                    t6g0.b().G0(userId3);
                    this.e.invoke(Integer.valueOf(i));
                }
            }, new io.reactivex.rxjava3.functions.f() { // from class: xsna.z2s
                @Override // io.reactivex.rxjava3.functions.f
                public final void accept(Object obj) {
                    Throwable th = (Throwable) obj;
                    if ((th instanceof VKApiExecutionException) && context != null) {
                        a3s a3sVar = a3s.this;
                        Context context2 = a3sVar.a.i0.getContext();
                        cmf0.d(context2, a3sVar.a.i0.getWindow(), j03.g(context2, th, R.string.error), false, iah0.a(88), true);
                    }
                    storyOwner.b = true;
                }
            });
        }
    }

    public final void c() {
        StoryEntry currentStory = this.a.i0.getCurrentStory();
        StoriesContainer storiesContainer = this.a.i0.getStoriesContainer();
        boolean z = storiesContainer instanceof PromoStoriesContainer ? ((PromoStoriesContainer) storiesContainer).o : false;
        if ((currentStory != null && (currentStory.B || !currentStory.C || currentStory.b)) || (storiesContainer instanceof HighlightStoriesContainer) || z) {
            this.a.O.setVisibility(8);
            return;
        }
        StoryOwner storyOwner = storiesContainer.b;
        Context context = this.a.i0.getContext();
        if (context == null || storyOwner == null) {
            return;
        }
        boolean d = fkq0.d(storyOwner.Fb());
        UserId c2 = o25.a().c();
        if (this.a.i0.getDependencies().k.a(storyOwner, c2)) {
            this.a.O.setVisibility(0);
            if (d) {
                this.a.O.setContentDescription(context.getString(R.string.story_accessibility_add_friends));
                this.a.O.setImageDrawable(m33.a(R.drawable.vk_icon_user_add_shadow_medium_48, context));
                return;
            } else {
                this.a.O.setContentDescription(context.getString(R.string.story_accessibility_follow));
                this.a.O.setImageDrawable(m33.a(R.drawable.vk_icon_follow_outline_shadow_medium_48, context));
                return;
            }
        }
        if (!this.a.i0.getDependencies().k.c(storyOwner, c2)) {
            this.a.O.setVisibility(8);
        } else if (d) {
            this.a.O.setContentDescription(context.getString(R.string.story_accessibility_remove_from_friends));
            this.a.O.setImageDrawable(m33.a(R.drawable.vk_icon_user_added_shadow_medium_48, context));
        } else {
            this.a.O.setContentDescription(context.getString(R.string.story_accessibility_followed));
            this.a.O.setImageDrawable(m33.a(R.drawable.vk_icon_done_shadow_medium_48, context));
        }
    }
}
