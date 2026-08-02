package xsna;

import com.vk.imageloader.view.VkImageViewTopCrop;
import com.vk.music.onboarding.impl.MusicRecommendationOnboardingContract$Presenter;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import com.vk.poll.fragments.PollViewerFragment;
import xsna.hpb0;
import xsna.i8r0;
import xsna.qr60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class j720 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j720(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((f6w) obj2).invoke(obj);
                break;
            case 1:
                ((w7u) obj2).invoke(obj);
                break;
            case 2:
                ((w7u) obj2).invoke(obj);
                break;
            case 3:
                ((MusicRecommendationOnboardingContract$Presenter.b) obj2).invoke(obj);
                break;
            case 4:
                ((gvs) obj2).invoke(obj);
                break;
            case 5:
                ((hpb0.f) obj2).invoke(obj);
                break;
            case 6:
                ((PollViewerFragment.b.a) obj2).invoke(obj);
                break;
            case 7:
                ((j4f0) obj2).e(new l4f0(new qr60.a.e(ListLoadingState.ERROR)));
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                break;
            case 8:
                ((ysd) obj2).invoke(obj);
                break;
            case 9:
                ((n7b0) obj2).invoke(obj);
                break;
            case 10:
                ((n7b0) obj2).invoke(obj);
                break;
            case 11:
                ((n7b0) obj2).invoke(obj);
                break;
            case 12:
                com.vk.core.view.components.spinner.c cVar = (com.vk.core.view.components.spinner.c) obj2;
                cVar.setCancelable(false);
                cVar.show();
                break;
            case 13:
                ((np5) obj2).invoke(obj);
                break;
            case 14:
                ((agk) obj2).invoke(obj);
                break;
            case 15:
                ((i8r0.a) obj2).invoke(obj);
                break;
            case 16:
                ((n7b0) obj2).invoke(obj);
                break;
            case 17:
                ((n7b0) obj2).invoke(obj);
                break;
            case 18:
                ((n7b0) obj2).invoke(obj);
                break;
            case 19:
                int i2 = VkImageViewTopCrop.c;
                ((n7b0) obj2).invoke(obj);
                break;
            case 20:
                ((l9v0) obj2).invoke(obj);
                break;
            default:
                ((l9v0) obj2).invoke(obj);
                break;
        }
    }
}
