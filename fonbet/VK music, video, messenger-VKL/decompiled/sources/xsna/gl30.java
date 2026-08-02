package xsna;

import com.vk.badges.fragments.OneTimeDonutFragment;
import com.vk.catalog2.feature.music.holders.MusicTrackCellVh;
import com.vk.core.serialize.Serializer;
import com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment;
import com.vk.newsfeed.impl.discover.repository.TemporaryCache;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsAccountInnerFragment;
import java.util.Set;
import xsna.kkl0;
import xsna.mha0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class gl30 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gl30(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((u6k) obj2).invoke(obj);
                break;
            case 1:
                ((u6k) obj2).invoke(obj);
                break;
            case 2:
                ((v4v) obj2).invoke(obj);
                break;
            case 3:
                ((u6k) obj2).invoke(obj);
                break;
            case 4:
                ((g84) obj2).invoke(obj);
                break;
            case 5:
                Set<String> set = MusicTrackCellVh.A;
                ((u6k) obj2).invoke(obj);
                break;
            case 6:
                int i2 = e860.z1;
                ((xc50) obj2).invoke(obj);
                break;
            case 7:
                ((xpt) obj2).invoke(obj);
                break;
            case 8:
                ((com.vk.pushes.receivers.a) obj2).invoke(obj);
                break;
            case 9:
                int i3 = OneTimeDonutFragment.V;
                ((OneTimeDonutFragment.b) obj2).invoke(obj);
                break;
            case 10:
                ((xc50) obj2).invoke(obj);
                break;
            case 11:
                ((mha0.a) obj2).invoke(obj);
                break;
            case 12:
                int i4 = PodcastEpisodeFragment.u0;
                ((izs) obj2).invoke(obj);
                break;
            case 13:
                ((e4c0) obj2).invoke(obj);
                break;
            case 14:
                ((ii3) obj2).invoke(obj);
                break;
            case 15:
                ((isc0) obj2).e((lsc0) obj);
                break;
            case 16:
                ((xc50) obj2).invoke(obj);
                break;
            case 17:
                ((ii3) obj2).invoke(obj);
                break;
            case 18:
                ((xpt) obj2).invoke(obj);
                break;
            case 19:
                ((xpt) obj2).invoke(obj);
                break;
            case 20:
                ((g84) obj2).invoke(obj);
                break;
            case 21:
                ((ut6) obj2).invoke(obj);
                break;
            case 22:
                ((xc50) obj2).invoke(obj);
                break;
            case 23:
                int i5 = SettingsAccountInnerFragment.r0;
                cvk.u(R.string.common_network_error, false);
                qv20.b((com.vk.core.view.components.spinner.c) obj2);
                break;
            case 24:
                ((xc50) obj2).invoke(obj);
                break;
            case 25:
                ((xc50) obj2).invoke(obj);
                break;
            case 26:
                gpl0 gpl0Var = (gpl0) obj2;
                kkl0.b bVar = (kkl0.b) obj;
                mzp0 mzp0Var = gpl0Var.g;
                if (mzp0Var != null) {
                    mzp0Var.c(false);
                }
                gpl0Var.e(bVar);
                break;
            case 27:
                ((ii3) obj2).invoke(obj);
                break;
            case 28:
                ((xc50) obj2).invoke(obj);
                break;
            default:
                Serializer.c<TemporaryCache> cVar = TemporaryCache.CREATOR;
                ((xc50) obj2).invoke(obj);
                break;
        }
    }
}
