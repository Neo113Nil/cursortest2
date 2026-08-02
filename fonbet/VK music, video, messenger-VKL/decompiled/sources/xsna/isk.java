package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.Group;
import com.vk.auth.ui.carousel.UserCarouselView;
import com.vk.core.preference.Preference;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.polls.PollOption;
import com.vk.im.engine.models.attaches.AttachWithVideo;
import com.vk.im.settings.DarkThemeTimetableFragment;
import com.vk.libvideo.ui.VideoHidePollView;
import com.vk.network.kbh.state.NetworkState;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerState;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.photos.legacy.EditAlbumFragment;
import com.vk.superapp.api.dto.auth.VkAuthCredentials;
import com.vk.superapp.core.api.models.ValidateInfo;
import xsna.as30;
import xsna.nsb0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class isk implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ isk(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                DarkThemeTimetableFragment darkThemeTimetableFragment = (DarkThemeTimetableFragment) this.c;
                nyo0 nyo0Var = darkThemeTimetableFragment.P;
                if (nyo0Var == null) {
                    nyo0Var = null;
                }
                nyo0Var.getClass();
                int m = (int) Preference.m(22L, "THEME_TIMETABLE", "HOUR_START");
                nyo0 nyo0Var2 = darkThemeTimetableFragment.P;
                (nyo0Var2 != null ? nyo0Var2 : null).getClass();
                darkThemeTimetableFragment.fo(new z77(darkThemeTimetableFragment, 3), m, (int) Preference.m(0L, "THEME_TIMETABLE", "MINUTE_START"));
                break;
            case 1:
                Context context = (Context) this.c;
                int i = EditAlbumFragment.s0;
                rwi.d().c().d(context, (PrivacySetting) view.getTag());
                break;
            case 2:
                b2q b2qVar = (b2q) this.c;
                b2qVar.An();
                UserCarouselView userCarouselView = b2qVar.t;
                if (userCarouselView == null) {
                    userCarouselView = null;
                }
                userCarouselView.setConfiguring(false);
                Group group = b2qVar.w;
                if (group == null) {
                    group = null;
                }
                group.setVisibility(0);
                View view2 = b2qVar.v;
                f4m.j(view2 != null ? view2 : null);
                break;
            case 3:
                com.vk.im.video.g gVar = (com.vk.im.video.g) this.c;
                t4w t4wVar = gVar.t;
                if (t4wVar == null) {
                    t4wVar = null;
                }
                if (!t4wVar.W0()) {
                    AttachWithVideo attachWithVideo = gVar.q;
                    if (attachWithVideo == null) {
                        attachWithVideo = null;
                    }
                    VideoFile A = attachWithVideo.A();
                    gpt0 gpt0Var = gpt0.a;
                    if (A.d8() || A.z0()) {
                        AttachWithVideo attachWithVideo2 = gVar.q;
                        if (attachWithVideo2 == null) {
                            attachWithVideo2 = null;
                        }
                        if (!attachWithVideo2.A().Ia()) {
                            Activity m2 = gVar.m();
                            if (m2 != null) {
                                if (d6q0.t != NetworkState.UNSTABLE) {
                                    fh5 fh5Var = gVar.w;
                                    uc.o(fh5Var == null ? null : fh5Var, m2, false, null, null, null, 60);
                                    s3q0 s3q0Var = s3q0.a;
                                    break;
                                } else {
                                    cvk.t();
                                    break;
                                }
                            }
                        } else {
                            as30.a aVar = gVar.s;
                            (aVar != null ? aVar : null).b();
                            break;
                        }
                    }
                }
                break;
            case 4:
                up30 up30Var = (up30) this.c;
                pk30 pk30Var = up30Var.o;
                vp30 vp30Var = up30Var.p;
                String str = vp30Var != null ? vp30Var.e : null;
                if (pk30Var != null && str != null) {
                    pk30Var.d(0, str);
                    break;
                }
                break;
            case 5:
                nsb0 nsb0Var = (nsb0) this.c;
                nsb0.a aVar2 = nsb0Var.b;
                if (aVar2 != null) {
                    PollOption pollOption = nsb0Var.h;
                    aVar2.a(pollOption != null ? pollOption.b : 0L);
                    break;
                }
                break;
            case 6:
                ((enc0) this.c).U.invoke(new PostingAction.MediaPicker.SheetTransition(MediaPickerState.SheetState.Hidden));
                break;
            case 7:
                zkn0 zkn0Var = (zkn0) this.c;
                Object obj = zkn0Var.o;
                Object obj2 = obj != null ? obj : null;
                ValidateInfo validateInfo = (ValidateInfo) zkn0Var.s.getValue();
                ((cln0) obj2).z(validateInfo, (VkAuthCredentials) zkn0Var.u.getValue());
                break;
            case 8:
                ((VideoHidePollView) this.c).v.invoke(VideoHidePollView.a.b.a);
                break;
            case 9:
                Object obj3 = ((ymu0) this.c).o;
                ((xmu0) (obj3 != null ? obj3 : null)).a();
                break;
            default:
                ((gzs) this.c).invoke();
                break;
        }
    }
}
