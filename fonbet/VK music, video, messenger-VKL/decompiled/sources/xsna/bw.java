package xsna;

import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.channels.impl.channel_screen.AppChannelFragment;
import com.vk.feed.design.view.newsfeed.reaction.FeedAnimatedView;
import com.vk.newsfeed.posting.mediapicker.photovk.base.BasePhotoListFragment;
import com.vk.photos.root.albums.presentation.b;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class bw implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bw(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                fw fwVar = (fw) obj2;
                cmf0.e(fwVar.a.i0.getContext(), fwVar.a.i0.getWindow(), fwVar.a.i0.getContext().getResources().getString(R.string.story_all_replies_are_hidden, fwVar.a.i0.getDependencies().k.b(fwVar.a.i0.getStoriesContainer().b)), 48);
                fwVar.e.c(-1);
                break;
            case 1:
                ((v5) obj2).invoke(obj);
                break;
            case 2:
                ((m41) obj2).invoke(obj);
                break;
            case 3:
                ((b.a) obj2).invoke(obj);
                break;
            case 4:
                int i2 = AppChannelFragment.l1;
                ((v5) obj2).invoke(obj);
                break;
            case 5:
                ((w53) obj2).invoke(obj);
                break;
            case 6:
                ((v5) obj2).invoke(obj);
                break;
            case 7:
                ((h1) obj2).invoke(obj);
                break;
            case 8:
                int i3 = BasePhotoListFragment.l0;
                ((k9) obj2).invoke(obj);
                break;
            case 9:
                ((io.reactivex.rxjava3.subjects.d) ((rul) obj2).s.getValue()).onNext((xxd0) obj);
                break;
            case 10:
                ((rl7) obj2).invoke(obj);
                break;
            case 11:
                ((l68) obj2).invoke(obj);
                break;
            case 12:
                ((v5) obj2).invoke(obj);
                break;
            case 13:
                ((v5) obj2).invoke(obj);
                break;
            case 14:
                ((v5) obj2).invoke(obj);
                break;
            case 15:
                ((c95) obj2).invoke(obj);
                break;
            case 16:
                ((def) obj2).invoke(obj);
                break;
            case 17:
                ((h1) obj2).invoke(obj);
                break;
            case 18:
                ((h1) obj2).invoke(obj);
                break;
            case 19:
                ((h1) obj2).invoke(obj);
                break;
            case 20:
                ((y89) obj2).invoke(obj);
                break;
            case 21:
                ((xr0) obj2).invoke(obj);
                break;
            case 22:
                int i4 = DiscoverSearchFragment.s0;
                ((qqe) obj2).invoke(obj);
                break;
            case 23:
                ((ifg) obj2).invoke(obj);
                break;
            case 24:
                int i5 = FeedAnimatedView.y;
                ((defpackage.s) obj2).invoke(obj);
                break;
            case 25:
                ((r3h) obj2).invoke(obj);
                break;
            case 26:
                ((h1) obj2).invoke(obj);
                break;
            case 27:
                ((dws) obj2).invoke(obj);
                break;
            case 28:
                int i6 = GalleryFragmentImpl.R0;
                ((h1) obj2).invoke(obj);
                break;
            default:
                ((r3h) obj2).invoke(obj);
                break;
        }
    }
}
