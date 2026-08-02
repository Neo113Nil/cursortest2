package xsna;

import android.content.Context;
import android.util.Size;
import android.view.Window;
import androidx.annotation.NonNull;
import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.dto.user.UserProfile;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stories.design.view.viewer.StoryBottomViewGroup;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.ConcurrentHashMap;
import xsna.ikv0;

/* compiled from: ActionButtonStoryViewDelegate.java */
/* loaded from: classes6.dex */
public final class fw {

    @NonNull
    public q7r a;

    @NonNull
    public jz50 b;

    @NonNull
    public f0q0 c;

    @NonNull
    public eza0 d;

    @NonNull
    public q50 e;

    @NonNull
    public kl20 f;
    public final ConcurrentHashMap<String, String> g = new ConcurrentHashMap<>();

    public final void a(StoryViewAction storyViewAction) {
        StoryEntry currentStory = this.a.i0.getCurrentStory();
        if (currentStory == null) {
            return;
        }
        q7r q7rVar = this.a;
        gta gtaVar = q7rVar.p0;
        mkm0 mkm0Var = q7rVar.i0;
        StoryBottomViewGroup storyBottomViewGroup = q7rVar.G;
        gtaVar.b = mkm0Var;
        gtaVar.c = storyBottomViewGroup;
        if (mkm0Var == null) {
            return;
        }
        StoryPrivacyType storyPrivacyType = null;
        mkm0Var.f1(storyViewAction, null);
        kam0 kam0Var = new kam0(mkm0Var, new com.vk.movika.sdk.base.observable.m(mkm0Var, 18), new gd0(5, gtaVar, mkm0Var), new bta(0, gtaVar, mkm0Var), new qb(8));
        StoryPrivacyType[] values = StoryPrivacyType.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            StoryPrivacyType storyPrivacyType2 = values[i];
            if (epx.f(storyPrivacyType2.j(), currentStory.x0)) {
                storyPrivacyType = storyPrivacyType2;
                break;
            }
            i++;
        }
        gtaVar.d().f(kam0Var);
        gtaVar.d().n(new cta(gtaVar, currentStory, mkm0Var, 0));
        gtaVar.a();
        gtaVar.d().p(true, true, mkm0Var.getContext(), new dta(gtaVar, currentStory, mkm0Var, storyPrivacyType, 0));
    }

    public final void b() {
        Window window = this.a.i0.getWindow();
        if (window != null) {
            l7s u = bwt0.u(this.a.i0.getContext());
            ikv0.a aVar = new ikv0.a(u);
            aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_positive), (Size) null);
            aVar.u = new ikv0.d(u.getString(R.string.story_ad_marker_copied), (String) null, (ikv0.d.a) null);
            aVar.o = Integer.valueOf(iah0.a(88));
            aVar.p(window);
            this.a.i0.getDependencies().f.k(MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER, this.a.i0.getViewEntryPoint(), this.a.i0.getCurrentStory(), this.a.i0.P0());
        }
    }

    public final void c() {
        this.a.i0.getDependencies().f.b(MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER, this.a.i0.getViewEntryPoint(), this.a.i0.getCurrentStory(), this.a.i0.P0());
    }

    public final void d(boolean z) {
        cmf0.a.c(this.a.i0.getContext(), this.a.i0.getWindow(), R.string.story_thanks);
        if (!z || this.a.i0.getCurrentStory() == null) {
            return;
        }
        this.a.i0.getDependencies().f.m(this.a.i0.getCurrentStory(), this.a.i0.getViewEntryPoint(), this.a.i0.P0());
    }

    public final void e(boolean z) {
        StoryOwner storyOwner;
        StoryEntry currentStory = this.a.i0.getCurrentStory();
        if (currentStory == null || (storyOwner = currentStory.l0) == null || !(storyOwner instanceof StoryOwner.User)) {
            return;
        }
        final StoryOwner.User user = (StoryOwner.User) storyOwner;
        final boolean z2 = !user.c.V;
        kl20 kl20Var = this.f;
        kl20Var.a.i0.getDependencies().f.A(z2, z, MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER, kl20Var.a.i0.getViewEntryPoint());
        io.reactivex.rxjava3.internal.operators.single.o h = qxi.a().h(currentStory.d, currentStory.u, z2);
        asu0 asu0Var = asu0.a;
        this.a.i0.a(h.q(asu0Var.c()).m(asu0Var.d()).subscribe(new io.reactivex.rxjava3.functions.f() { // from class: xsna.iv
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                UserProfile userProfile;
                UserProfile userProfile2;
                UserProfile userProfile3 = user.c;
                userProfile3.V = z2;
                userProfile3.U = true;
                fw fwVar = fw.this;
                mkm0 mkm0Var = fwVar.c.a.i0;
                StoryEntry currentStory2 = mkm0Var.getCurrentStory();
                if ((currentStory2 != null ? currentStory2.l0 : null) != null) {
                    StoryOwner storyOwner2 = currentStory2.l0;
                    if (storyOwner2 instanceof StoryOwner.User) {
                        StoryOwner.User user2 = (StoryOwner.User) storyOwner2;
                        String n = (user2 == null || (userProfile2 = user2.c) == null) ? null : userProfile2.n();
                        Context context = mkm0Var.getContext();
                        ikv0.a aVar = new ikv0.a(context);
                        aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context.getString(R.string.cancel), new kvm0(fwVar, 6));
                        if (user2 == null || (userProfile = user2.c) == null || !userProfile.V) {
                            aVar.u = new ikv0.d(mkm0Var.getResources().getString(R.string.unsubscribe_from_stories_message_snackbar, n), (String) null, (ikv0.d.a) null, 6);
                        } else {
                            aVar.u = new ikv0.d(mkm0Var.getResources().getString(R.string.subscribe_from_stories_message_snackbar, n), (String) null, (ikv0.d.a) null, 6);
                            aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_filled_blue_24, (Integer) null, (Size) null, 14);
                        }
                        Window window = mkm0Var.getWindow();
                        if (window != null) {
                            aVar.p(window);
                        }
                    }
                }
            }
        }, new jv(this, 0)));
    }
}
