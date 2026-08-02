package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import xsna.sq1;
import xsna.tlo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class lm1 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lm1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                com.vk.photos.root.albums.presentation.b bVar = (com.vk.photos.root.albums.presentation.b) this.c;
                tlo0.f h = tq.h(tlo0.Companion, R.string.album_details_delete_album_success);
                f4z<sq1> f4zVar = bVar.l;
                f4zVar.b(new sq1.g(new j7k0(h, Integer.valueOf(R.drawable.vk_icon_check_circle_outline_28), Integer.valueOf(R.attr.vk_ui_icon_positive), null, null, null, 32)));
                f4zVar.b(sq1.d.a);
                break;
            case 1:
                i9b i9bVar = (i9b) this.c;
                i9bVar.i.c(i9bVar.f.getString(R.string.vkim_channels_archived), new d7k0(R.string.vkim_channels_profile_cancel, new n40(i9bVar, 16)));
                break;
            case 2:
                ftb ftbVar = (ftb) this.c;
                ftbVar.i = null;
                ftbVar.e.n0();
                break;
            case 3:
                ((ha50) this.c).h = null;
                break;
            case 4:
                qr.d(ce60.b, 100, (NewsEntry) this.c);
                break;
            default:
                ((yq1) this.c).invoke();
                break;
        }
    }
}
