package xsna;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.camera.drawing.gradient.StoryEditText;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipsMusicCatalogHeaderShowAll;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.friends.discover.UserDiscoverSmoothScroller;
import com.vk.friends.discover.UsersDiscoverFragment;
import com.vk.friends.discover.UsersDiscoverLayoutManager;
import com.vk.friends.discover.UsersDiscoverListView;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.trustedhash.di.TrustedHashComponent;
import com.vkontakte.android.R;
import ru.ok.tensorflow.tflite.InterpreterWrapper;
import xsna.nux0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class m52 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m52(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                p52 p52Var = (p52) obj;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!p52Var.j.isEmpty()) {
                    try {
                        p52Var.j.removeLast().invoke();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                s3q0 s3q0Var = s3q0.a;
                Trace.endSection();
                return;
            case 1:
                VkOnboardingHighlighter vkOnboardingHighlighter = ((ClipsMusicCatalogHeaderShowAll) obj).F;
                if (vkOnboardingHighlighter != null) {
                    VkOnboardingHighlighter.e(vkOnboardingHighlighter, false, null, false, null, 12);
                    return;
                }
                return;
            case 2:
                String[] strArr = DebugDevSettingsFragment.t0;
                ((TrustedHashComponent) obj).c().b();
                return;
            case 3:
                bmp0.a(null);
                com.vk.clips.viewer.impl.routing.transition.a Uh = ((com.vk.clips.viewer.impl.routing.transition.c) obj).m.Uh();
                if (Uh != null) {
                    Uh.a.a.C();
                    return;
                }
                return;
            case 4:
                ((InterpreterWrapper) obj).lambda$close$12();
                return;
            case 5:
                s4m0 s4m0Var = (s4m0) obj;
                cvu cvuVar = s4m0Var.d;
                StoryEditText storyEditText = s4m0Var.b.k;
                cvuVar.b((storyEditText != null ? storyEditText : null).getContext(), new dac0(s4m0Var, 12));
                return;
            case 6:
                him0 him0Var = (him0) obj;
                VkContextMenu vkContextMenu = him0Var.a;
                if (vkContextMenu != null) {
                    vkContextMenu.b();
                }
                him0Var.a = null;
                return;
            case 7:
                UsersDiscoverListView usersDiscoverListView = ((UsersDiscoverFragment) obj).U;
                if (usersDiscoverListView != null) {
                    RecyclerView.o layoutManager = usersDiscoverListView.getLayoutManager();
                    UsersDiscoverLayoutManager usersDiscoverLayoutManager = layoutManager instanceof UsersDiscoverLayoutManager ? (UsersDiscoverLayoutManager) layoutManager : null;
                    if (usersDiscoverLayoutManager == null) {
                        return;
                    }
                    UserDiscoverSmoothScroller userDiscoverSmoothScroller = new UserDiscoverSmoothScroller(UserDiscoverSmoothScroller.ScrollType.OnBoardingCancelLeft, usersDiscoverLayoutManager);
                    userDiscoverSmoothScroller.setTargetPosition(usersDiscoverLayoutManager.f.f);
                    usersDiscoverLayoutManager.startSmoothScroll(userDiscoverSmoothScroller);
                    return;
                }
                return;
            case 8:
                VideoView videoView = (VideoView) obj;
                qcy<Object>[] qcyVarArr = VideoView.T0;
                videoView.getViewBinding().d.setBackgroundColor(videoView.getContext().getColor(R.color.vk_black));
                return;
            default:
                nux0.a aVar = (nux0.a) obj;
                aVar.a.getAction();
                aVar.b.trySetResult(null);
                return;
        }
    }
}
