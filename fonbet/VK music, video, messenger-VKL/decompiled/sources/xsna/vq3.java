package xsna;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.common.util.GlUtil;
import androidx.viewpager2.widget.ViewPager2;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.fragment.gallery.PostingAttachGalleryFragment;
import com.vk.catalog2.feature.music.holders.artist.ArtistInfoNewVh;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.editor.analytics.StoryEditorEvents;
import com.vk.newsfeed.posting.mediapicker.photovk.base.BasePhotoListFragment;
import com.vk.photogallery.c;
import com.vk.photos.ui.album_list.AlbumsListFragment;
import com.vk.photos.ui.attachmentspicker.PickVKPhotoFragmentNew;
import com.vk.stories.design.view.editor.verticalization.VerticalizationBannerView;
import com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.a;
import com.vkontakte.android.R;
import java.io.File;
import java.util.concurrent.ExecutorService;
import ru.ok.android.externcalls.sdk.audio.internal.AudioFocusRequestHelper;
import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class vq3 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vq3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        dcn e;
        switch (this.b) {
            case 0:
                ArtistInfoNewVh artistInfoNewVh = (ArtistInfoNewVh) this.c;
                dcn dcnVar = artistInfoNewVh.B;
                if (dcnVar != null) {
                    dcnVar.dismiss();
                }
                View view = artistInfoNewVh.j;
                if (view == null) {
                    view = null;
                }
                Activity h = e3m.h(view.getContext());
                if (h != null) {
                    Rect rect = new Rect();
                    View view2 = artistInfoNewVh.j;
                    (view2 != null ? view2 : null).getGlobalVisibleRect(rect);
                    e = artistInfoNewVh.z.e(h, rect, "audio:artist_follow", new com.vk.movika.sdk.base.model.props.d(8));
                    artistInfoNewVh.B = e;
                    return;
                }
                return;
            case 1:
                AudioFocusRequestHelper.mute$lambda$4((AudioFocusRequestHelper) this.c);
                return;
            case 2:
                a920 a920Var = ((BasePhotoListFragment) this.c).b0;
                a920 a920Var2 = a920Var != null ? a920Var : null;
                if (a920Var2 != null) {
                    a920Var2.notifyDataSetChanged();
                    return;
                }
                return;
            case 3:
                MasksWrap masksWrap = ((CameraUIView) this.c).b0;
                if (masksWrap != null) {
                    masksWrap.j(true);
                    return;
                }
                return;
            case 4:
                jpd jpdVar = (jpd) this.c;
                jpdVar.r = false;
                jpdVar.y(false);
                return;
            case 5:
                t1s t1sVar = (t1s) this.c;
                ViewPager2 viewPager2 = t1sVar.q;
                t1sVar.T((viewPager2 != null ? viewPager2 : null).getCurrentItem());
                return;
            case 6:
                c100 c100Var = (c100) this.c;
                try {
                    synchronized (c100Var.g) {
                        try {
                            c100Var.g.wait(c100Var.f.a);
                            File file = c100Var.k;
                            if (file == null) {
                                file = null;
                            }
                            boolean f = c100Var.f(file, c100Var.h, X3.i.Z);
                            File file2 = c100Var.l;
                            if (file2 == null) {
                                file2 = null;
                            }
                            boolean f2 = c100Var.f(file2, c100Var.i, "system");
                            if ((f || f2) && c100Var.m) {
                                c100Var.h(null, new String[]{"logcat", "-c"});
                                c100Var.h.setLength(0);
                                c100Var.i.setLength(0);
                                ExecutorService executorService = c100Var.e;
                                (executorService != null ? executorService : null).execute(c100Var.j);
                            }
                            s3q0 s3q0Var = s3q0.a;
                        } finally {
                        }
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 7:
                x4u x4uVar = ((h810) this.c).b.k;
                if (x4uVar != null) {
                    x4uVar.invoke();
                    return;
                }
                return;
            case 8:
                try {
                    ((e840) this.c).c.e(GlUtil.p());
                    return;
                } catch (Exception e2) {
                    ahn.o("MultiInputVG", "Error releasing GlObjectsProvider", e2);
                    return;
                }
            case 9:
                EditText editText = ((c.b) this.c).e;
                mhy.j(editText != null ? editText : null);
                return;
            case 10:
                PickVKPhotoFragmentNew pickVKPhotoFragmentNew = (PickVKPhotoFragmentNew) this.c;
                AlbumsListFragment.a aVar = new AlbumsListFragment.a(pickVKPhotoFragmentNew.n0.f);
                aVar.j.putBoolean("select", true);
                aVar.s(true);
                aVar.h(pickVKPhotoFragmentNew.getActivity(), 101);
                return;
            case 11:
                f540 f540Var = (f540) this.c;
                int i = PostingAttachGalleryFragment.p0;
                f540Var.invoke();
                return;
            case 12:
                StereoRoomManagerImpl.grantAdmin$lambda$0$1((izs) this.c);
                return;
            case 13:
                bwt0.p0((View) this.c, false);
                return;
            case 14:
                jpr0 jpr0Var = (jpr0) this.c;
                if (jpr0Var.e() && jpr0Var.c.G2() == 1) {
                    y440 y440Var = jpr0Var.b;
                    ViewStub viewStub = jpr0Var.l;
                    if (viewStub.getParent() == null) {
                        return;
                    }
                    VerticalizationBannerView verticalizationBannerView = (VerticalizationBannerView) viewStub.inflate().findViewById(R.id.banner_container);
                    jpr0Var.m = verticalizationBannerView;
                    if (verticalizationBannerView != null) {
                        verticalizationBannerView.setCallback(new lpr0(jpr0Var));
                    }
                    VerticalizationBannerView verticalizationBannerView2 = jpr0Var.m;
                    if (verticalizationBannerView2 != null) {
                        boolean d = y440Var.getBottomControlPanel().d();
                        int bottomMargin = y440Var.getBottomControlPanel().getBottomMargin();
                        verticalizationBannerView2.g = d;
                        int i2 = u48.r + bottomMargin;
                        f4m.q(i2, verticalizationBannerView2.c);
                        if (!d) {
                            bottomMargin = i2;
                        }
                        f4m.q(bottomMargin, verticalizationBannerView2.b);
                    }
                    boolean c = ((xqj0) jpr0Var.e.getValue()).c();
                    VerticalizationBannerView verticalizationBannerView3 = jpr0Var.m;
                    if (verticalizationBannerView3 != null) {
                        int i3 = c ? R.string.story_verticalization_banner_text_first : R.string.story_verticalization_banner_text_second;
                        int i4 = c ? R.string.story_verticalization_banner_button_accept_first : R.string.story_verticalization_banner_button_accept_second;
                        verticalizationBannerView3.d.setText(i3);
                        verticalizationBannerView3.e.setText(i4);
                    }
                    VerticalizationBannerView verticalizationBannerView4 = jpr0Var.m;
                    if (verticalizationBannerView4 != null) {
                        ConstraintLayout constraintLayout = verticalizationBannerView4.c;
                        smk0 c2 = qq2.c(constraintLayout, woo.n, verticalizationBannerView4.g ? VerticalizationBannerView.h : VerticalizationBannerView.i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 100.0f);
                        smk0 c3 = qq2.c(constraintLayout, woo.t, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 100.0f);
                        c2.h();
                        c3.h();
                        cp2.c(verticalizationBannerView4.b, 0L, 0L, null, null, 15);
                    }
                    jpr0Var.c().i(StoryEditorEvents.VIEW_VERTICALIZATION_BANNER);
                    return;
                }
                return;
            case 15:
                ((a.b) this.c).a.scrollToPosition(0);
                return;
            default:
                com.vungle.ads.internal.presenter.r.d((com.vungle.ads.internal.presenter.r) this.c);
                return;
        }
    }
}
