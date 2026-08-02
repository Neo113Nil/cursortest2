package xsna;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.DialogBackground;
import com.vk.dto.status.StatusImagePopup;
import com.vk.im.ui.components.theme_chooser.ThemeChooserState;
import com.vk.profile.user.impl.ui.f;
import com.vk.stories.design.view.editor.StoryStylePickerView;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFragment;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.items.VideoRelatedVideosAdapter;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.j;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.recycler.RelatedVideosRecyclerView;
import com.vk.video.ui.discovery.minimizable.related_videos.m;
import com.vk.voip.ui.call_by_link.feature.events.VoipCallByLinkNavigationEvent;
import com.vk.voip.ui.call_by_link.ui.VoipCallByLinkFragment;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.atq0;
import xsna.fh8;
import xsna.gh8;
import xsna.ios;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class zkj0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zkj0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        RelatedVideosRecyclerView relatedVideosRecyclerView;
        RelatedVideosRecyclerView relatedVideosRecyclerView2;
        int i = this.b;
        Object obj2 = null;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                gh8.f.a aVar = (gh8.f.a) obj3;
                ((clj0) obj4).e.invoke(new fh8.m.a(aVar.a, aVar.b, (Throwable) obj));
                return s3q0.a;
            case 1:
                dw20 dw20Var = (dw20) obj4;
                Throwable th = (Throwable) obj;
                StatusImagePopup statusImagePopup = ((nzk0) obj3).e;
                dw20Var.Qn(statusImagePopup != null ? statusImagePopup.j : true);
                com.vk.metrics.eventtracking.b.a.a(th);
                return s3q0.a;
            case 2:
                izs izsVar = (izs) obj3;
                Integer num = (Integer) obj;
                f4m.x(num.intValue() != 0 ? cn70.b(8) : 0, ((StoryStylePickerView) obj4).b.getIndicator());
                izsVar.invoke(num);
                return s3q0.a;
            case 3:
                ((com.vk.photo.editor.features.markup.text.a) obj4).H((zeo0) obj3);
                return s3q0.a;
            case 4:
                String str = (String) obj3;
                ThemeChooserState themeChooserState = (ThemeChooserState) obj;
                Iterator<T> it = ((com.vk.im.ui.components.theme_chooser.b) obj4).Z0().g.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (epx.f(((DialogBackground) next).b, str)) {
                            obj2 = next;
                        }
                    }
                }
                DialogBackground dialogBackground = (DialogBackground) obj2;
                if (dialogBackground == null) {
                    dialogBackground = DialogBackground.e;
                }
                return ThemeChooserState.a(themeChooserState, ThemeChooserState.ListKind.BACKGROUND, null, null, dialogBackground, false, null, null, null, 246);
            case 5:
                rlq0 rlq0Var = (rlq0) obj4;
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) obj3;
                Throwable th2 = (Throwable) obj;
                VKApiExecutionException vKApiExecutionException = th2 instanceof VKApiExecutionException ? (VKApiExecutionException) th2 : null;
                if (vKApiExecutionException != null && vKApiExecutionException.H(175)) {
                    rlq0Var.e(extendedUserProfile, ios.d.b.C3069b.c);
                } else if (vKApiExecutionException != null && vKApiExecutionException.H(176)) {
                    rlq0Var.e(extendedUserProfile, ios.d.b.a.c);
                } else if (vKApiExecutionException != null && vKApiExecutionException.H(9)) {
                    rlq0Var.e(extendedUserProfile, new ios.b(vKApiExecutionException));
                } else if (vKApiExecutionException == null || !vKApiExecutionException.J()) {
                    fpq0 fpq0Var = rlq0Var.k;
                    if (fpq0Var == null) {
                        fpq0Var = null;
                    }
                    fpq0Var.B(new f.h(new atq0.f(null, null, th2, 11)));
                } else {
                    rlq0Var.e(extendedUserProfile, ios.a.a);
                }
                return s3q0.a;
            case 6:
                final VideoRelatedVideosFragment videoRelatedVideosFragment = (VideoRelatedVideosFragment) obj4;
                j.a aVar2 = (j.a) obj3;
                ((Boolean) obj).getClass();
                int i2 = VideoRelatedVideosFragment.n0;
                List<mbt0> list = aVar2.f;
                com.vk.video.ui.discovery.minimizable.related_videos.m mVar = aVar2.e;
                VideoRelatedVideosFragment.b bVar = videoRelatedVideosFragment.Q;
                RecyclerView.o layoutManager = (bVar == null || (relatedVideosRecyclerView2 = bVar.b) == null) ? null : relatedVideosRecyclerView2.getLayoutManager();
                final LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    Iterator<mbt0> it2 = list.iterator();
                    final int i3 = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            mbt0 next2 = it2.next();
                            mbt0 mbt0Var = next2 instanceof mbt0 ? next2 : null;
                            if (!(mbt0Var != null ? mbt0Var.d : false)) {
                                i3++;
                            }
                        } else {
                            i3 = -1;
                        }
                    }
                    Object b0 = j5g.b0(i3, list);
                    mbt0 mbt0Var2 = b0 instanceof mbt0 ? (mbt0) b0 : null;
                    String r1 = mbt0Var2 != null ? mbt0Var2.b.r1() : null;
                    Object[] objArr = ((!epx.f(videoRelatedVideosFragment.d0, r1) && videoRelatedVideosFragment.c0 != i3) == true || videoRelatedVideosFragment.e0) && i3 != -1;
                    videoRelatedVideosFragment.e0 = false;
                    videoRelatedVideosFragment.c0 = i3;
                    videoRelatedVideosFragment.d0 = r1;
                    if (objArr != false) {
                        int v = linearLayoutManager.v();
                        int x = linearLayoutManager.x();
                        if (v == -1 && v == x) {
                            linearLayoutManager.scrollToPosition(i3);
                            VideoRelatedVideosFragment.b bVar2 = videoRelatedVideosFragment.Q;
                            if (bVar2 != null && (relatedVideosRecyclerView = bVar2.b) != null) {
                                relatedVideosRecyclerView.post(new Runnable() { // from class: xsna.wbt0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i4 = VideoRelatedVideosFragment.n0;
                                        Context mo2getContext = VideoRelatedVideosFragment.this.mo2getContext();
                                        if (mo2getContext != null) {
                                            zpa zpaVar = new zpa(mo2getContext);
                                            zpaVar.setTargetPosition(i3);
                                            linearLayoutManager.startSmoothScroll(zpaVar);
                                        }
                                    }
                                });
                            }
                        } else {
                            if (v <= i3 && i3 <= x) {
                                r2 = 1;
                            }
                            if (r2 == 0) {
                                linearLayoutManager.scrollToPosition(i3);
                            }
                            Context mo2getContext = videoRelatedVideosFragment.mo2getContext();
                            if (mo2getContext != null) {
                                zpa zpaVar = new zpa(mo2getContext);
                                zpaVar.setTargetPosition(i3);
                                linearLayoutManager.startSmoothScroll(zpaVar);
                            }
                        }
                    }
                }
                m.a aVar3 = (m.a) mVar;
                rbt0 rbt0Var = (rbt0) j5g.k0(aVar3.a.e);
                if (rbt0Var != null) {
                    if (rbt0Var.e) {
                        VideoRelatedVideosAdapter qo = videoRelatedVideosFragment.qo();
                        qo.L0(VideoRelatedVideosAdapter.State.a(qo.p, false, false, null, VideoRelatedVideosAdapter.State.FooterHeader.Error, 7));
                    } else if (rbt0Var.f) {
                        VideoRelatedVideosAdapter qo2 = videoRelatedVideosFragment.qo();
                        qo2.L0(VideoRelatedVideosAdapter.State.a(qo2.p, false, false, null, VideoRelatedVideosAdapter.State.FooterHeader.Loading, 7));
                    }
                }
                rbt0 rbt0Var2 = (rbt0) j5g.a0(aVar3.a.e);
                if (rbt0Var2 != null) {
                    if (rbt0Var2.e) {
                        VideoRelatedVideosAdapter qo3 = videoRelatedVideosFragment.qo();
                        qo3.L0(VideoRelatedVideosAdapter.State.a(qo3.p, false, false, VideoRelatedVideosAdapter.State.FooterHeader.Error, null, 11));
                    } else if (rbt0Var2.f) {
                        VideoRelatedVideosAdapter qo4 = videoRelatedVideosFragment.qo();
                        qo4.L0(VideoRelatedVideosAdapter.State.a(qo4.p, false, false, VideoRelatedVideosAdapter.State.FooterHeader.Loading, null, 11));
                    }
                }
                return s3q0.a;
            default:
                ArrayList arrayList = (ArrayList) obj4;
                VoipCallByLinkFragment voipCallByLinkFragment = (VoipCallByLinkFragment) obj3;
                VoipCallByLinkNavigationEvent voipCallByLinkNavigationEvent = (VoipCallByLinkNavigationEvent) obj;
                int i4 = VoipCallByLinkFragment.T;
                if (voipCallByLinkNavigationEvent instanceof VoipCallByLinkNavigationEvent.b) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        ((gzs) it3.next()).invoke();
                    }
                    arrayList.clear();
                } else if (voipCallByLinkNavigationEvent instanceof VoipCallByLinkNavigationEvent.a) {
                    voipCallByLinkFragment.dismiss();
                } else if (voipCallByLinkNavigationEvent instanceof VoipCallByLinkNavigationEvent.c) {
                    arrayList.add(new pk(24, voipCallByLinkNavigationEvent, voipCallByLinkFragment));
                } else {
                    if (!(voipCallByLinkNavigationEvent instanceof VoipCallByLinkNavigationEvent.ToStartCall)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    arrayList.add(new c9m0(17, voipCallByLinkFragment, voipCallByLinkNavigationEvent));
                }
                return s3q0.a;
        }
    }
}
