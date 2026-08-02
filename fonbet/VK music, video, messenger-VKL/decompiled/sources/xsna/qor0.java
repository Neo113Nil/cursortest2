package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.vk.clips.entrypoints.di.ClipsEntryPointsComponent;
import com.vk.clips.entrypoints.params.ClipsEntryPointsParams;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vk.imageloader.ImageScreenSize;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;

/* compiled from: VerticalFeedEndPresenter.kt */
/* loaded from: classes3.dex */
public final class qor0 implements oor0 {
    public final VideoFile b;
    public final UserProfile c;
    public final Group d;
    public final wmf e;
    public final por0 f;

    public qor0(VideoFile videoFile, UserProfile userProfile, Group group, wmf wmfVar, por0 por0Var) {
        this.b = videoFile;
        this.c = userProfile;
        this.d = group;
        this.e = wmfVar;
        this.f = por0Var;
    }

    @Override // xsna.oor0
    public final void S() {
        this.e.Cb(this.b);
    }

    @Override // xsna.oor0
    public final void f0() {
        this.e.Me().s5();
    }

    @Override // xsna.pk6
    public final void start() {
        VideoFile videoFile = this.b;
        ImageSize Cb = videoFile.e1().Cb(ImageScreenSize.SMALL.h(), true, false);
        String str = Cb != null ? Cb.d.d : null;
        boolean b = fkq0.b(videoFile.I0());
        por0 por0Var = this.f;
        if (b) {
            Group group = this.d;
            if (group != null) {
                por0Var.p(group.d, group.e, str, false, true);
                return;
            }
            return;
        }
        UserProfile userProfile = this.c;
        if (userProfile != null) {
            por0Var.p(userProfile.e, userProfile.h, str, userProfile.K().booleanValue(), false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.oor0
    public final void t2() {
        FragmentActivity activity;
        ClipFeedListFragment Me = this.e.Me();
        Context mo2getContext = Me.mo2getContext();
        if (mo2getContext == null || j8.d(mo2getContext) || (activity = Me.getActivity()) == null) {
            return;
        }
        ((ClipsEntryPointsComponent) Me.g0.getValue()).e().a(activity, new ClipsEntryPointsParams(MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.CLIPS_VIEWER, null, null, false, false, null, false, null, 254, null));
    }

    @Override // xsna.oor0
    public final void v1() {
        this.e.Me().Ih();
    }

    @Override // xsna.pk6
    public final void pause() {
    }

    @Override // xsna.pk6
    public final void release() {
    }

    @Override // xsna.pk6
    public final void resume() {
    }
}
