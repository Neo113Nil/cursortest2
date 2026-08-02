package xsna;

import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R$string;
import com.google.android.material.textfield.TextInputLayout;
import com.vk.channels.impl.list.ChannelsListFragment;
import com.vk.channels.impl.list.g;
import com.vk.common.links.LaunchContext;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.actions.ActionOpenVkApp;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.filter.ImageQuality;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.narratives.impl.highlights.HighlightChooseCoverFragment;
import com.vk.newsfeed.impl.fragments.PostViewFragment;
import com.vk.newsfeed.impl.stats.PostViewFragmentTimeSpentTracker;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeOwnerButtonAppClick;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Set;
import ru.mail.libverify.controls.VerificationController;
import ru.mail.libverify.controls.VerificationVKCListener;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class kgb implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kgb(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                int i2 = ChannelsListFragment.f0;
                ((ChannelsListFragment) obj2).mo(((g.c) ((yn50) obj)).a);
                break;
            case 1:
                d4h d4hVar = (d4h) obj;
                ExtendedUserProfile.f fVar = ((r0h) obj2).b;
                Action action = fVar.b;
                ApiApplication apiApplication = fVar.f;
                if (action == null) {
                    UserId userId = d4hVar.m;
                    String str = fVar.d;
                    Set<String> set = p0e0.a;
                    if (userId.b < 0) {
                        g2h g2hVar = new g2h(userId);
                        g2hVar.b = "server_button";
                        g2hVar.f = str;
                        g2hVar.a();
                    }
                    maz.c(d4hVar.g.f(), d4hVar.a, fVar.d, LaunchContext.A, null, null, 24);
                } else if (!(action instanceof ActionOpenVkApp) || apiApplication == null) {
                    di60.w(action, d4hVar.a, null, null, null, null, 62);
                } else {
                    gd60.J(hd60.a(), d4hVar.a, apiApplication, null, null, null, 4092);
                }
                if (action instanceof ActionOpenVkApp) {
                    long j = ((ActionOpenVkApp) action).d;
                    Set<String> set2 = p0e0.a;
                    SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new SchemeStat$TypeOwnerButtonAppClick((int) j), 2);
                    UiTracker uiTracker = UiTracker.a;
                    MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                    uzp0 uzp0Var = UiTracker.h;
                    uzp0Var.getClass();
                    new bjc(c, b, uzp0Var.a).q();
                    break;
                }
                break;
            case 2:
                com.google.android.material.datepicker.a aVar = (com.google.android.material.datepicker.a) obj2;
                TextInputLayout textInputLayout = aVar.b;
                SimpleDateFormat simpleDateFormat = aVar.d;
                Context context = textInputLayout.getContext();
                textInputLayout.setError(context.getString(R$string.mtrl_picker_invalid_format) + "\n" + String.format(context.getString(R$string.mtrl_picker_invalid_format_use), ((String) obj).replace(' ', (char) 160)) + "\n" + String.format(context.getString(R$string.mtrl_picker_invalid_format_example), simpleDateFormat.format(new Date(l2r0.d().getTimeInMillis())).replace(' ', (char) 160)));
                otj0 otj0Var = (otj0) aVar;
                otj0Var.k.getError();
                otj0Var.j.a();
                break;
            case 3:
                VideoPipStateHolder.a.getClass();
                VideoPipStateHolder.a();
                ((jql) obj2).b.startActivity((Intent) obj);
                break;
            case 4:
                StoryEntry storyEntry = ((j5v) obj).a;
                VKImageView vKImageView = ((HighlightChooseCoverFragment.d) obj2).o;
                vKImageView.load(storyEntry.Jb(vKImageView.getWidth(), ImageQuality.FIT, false));
                break;
            case 5:
                u6x u6xVar = (u6x) obj2;
                u6xVar.h("internal cancel requested by 'execute timeout passed'");
                u6xVar.b("execute timeout passed", false, new t3h((w6x) obj, 29));
                break;
            case 6:
                RecyclerView recyclerView = (RecyclerView) obj;
                String[] strArr = PostViewFragment.T0;
                PostViewFragmentTimeSpentTracker Do = ((PostViewFragment) obj2).Do();
                if (Do != null) {
                    Do.a(recyclerView);
                    break;
                }
                break;
            case 7:
                ((VerificationController) obj2).lambda$setVKCListener$40((VerificationVKCListener) obj);
                break;
            case 8:
                rzx0 rzx0Var = (rzx0) obj2;
                Lifecycle lifecycle = (Lifecycle) obj;
                if (!rzx0Var.d) {
                    rzx0Var.e = lifecycle;
                    lifecycle.addObserver(rzx0Var);
                    break;
                }
                break;
            case 9:
                idy0 idy0Var = xr50.c;
                Objects.requireNonNull(idy0Var);
                ((n8z0) obj2).f((s3z0) obj, idy0Var);
                break;
            default:
                yads.so.a((yads.so) obj2, (yads.g9) obj);
                break;
        }
    }
}
