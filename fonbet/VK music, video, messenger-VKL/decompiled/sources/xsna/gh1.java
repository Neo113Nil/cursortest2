package xsna;

import android.content.Intent;
import android.os.Build;
import com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh;
import com.vk.core.view.mediapicker.VkMediaPicker;
import com.vk.media.player.video.view.SimpleVideoView;
import com.vk.photos.root.presentation.PhotosRootFragment;
import com.vk.photos.root.presentation.a;
import com.vk.stories.design.view.archive.StoryArchiveFastScrollView;
import com.vk.story.archive.impl.presentation.StoryArchiveFragment;
import com.vk.story.archive.impl.presentation.StoryArchiveFragment.d;
import com.vk.video.profile.presentation.catalog.pager.VideoLargeSliderHorizontalPagerVh;
import io.appmetrica.analytics.impl.C5208u1;
import ru.mail.libverify.controls.VerificationController;
import ru.ok.gl.tf.Tensorflow;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class gh1 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gh1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((q) obj).invoke();
                break;
            case 1:
                ((gzs) obj).invoke();
                break;
            case 2:
                jc3 jc3Var = (jc3) obj;
                jc3.a(jc3Var, jc3Var.a);
                break;
            case 3:
                Intent intent = (Intent) obj;
                try {
                    if (nax.a(intent) && !nax.c(intent) && Build.VERSION.SDK_INT >= 34) {
                        intent.setPackage(e43.a.getPackageName());
                    }
                    e43.a.sendBroadcast(intent, hf8.a);
                    break;
                } catch (Exception e) {
                    com.vk.metrics.eventtracking.b.a.q(e);
                    return;
                }
                break;
            case 4:
                MusicCatalogRootVh musicCatalogRootVh = (MusicCatalogRootVh) obj;
                mzp0 mzp0Var = musicCatalogRootVh.U;
                if (mzp0Var != null) {
                    mzp0Var.a();
                }
                g3a.a(musicCatalogRootVh.D, musicCatalogRootVh);
                break;
            case 5:
                PhotosRootFragment photosRootFragment = (PhotosRootFragment) obj;
                int i2 = PhotosRootFragment.X;
                a.d dVar = a.d.b;
                photosRootFragment.getClass();
                xn50.a.c(photosRootFragment, dVar);
                break;
            case 6:
                SimpleVideoView.d((SimpleVideoView) obj);
                break;
            case 7:
                StoryArchiveFastScrollView.a aVar = ((StoryArchiveFastScrollView) obj).b;
                if (aVar != null) {
                    StoryArchiveFragment storyArchiveFragment = (StoryArchiveFragment) ((bx80) aVar).c;
                    storyArchiveFragment.g0.b = 0;
                    storyArchiveFragment.c0.postDelayed(storyArchiveFragment.new d(), 1000L);
                    break;
                }
                break;
            case 8:
                ((Tensorflow) obj).lambda$handlePrepare$8();
                break;
            case 9:
                ((VerificationController) obj).complete();
                break;
            case 10:
                VideoLargeSliderHorizontalPagerVh videoLargeSliderHorizontalPagerVh = (VideoLargeSliderHorizontalPagerVh) obj;
                videoLargeSliderHorizontalPagerVh.w();
                hbt0 hbt0Var = videoLargeSliderHorizontalPagerVh.A;
                if (hbt0Var != null) {
                    hbt0Var.n();
                    break;
                }
                break;
            case 11:
                ((VkMediaPicker) obj).e();
                break;
            default:
                C5208u1.a((Object[]) obj);
                break;
        }
    }
}
