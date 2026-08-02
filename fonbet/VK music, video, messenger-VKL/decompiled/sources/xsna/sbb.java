package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class sbb implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sbb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                gzs<s3q0> gzsVar = ((ubb) this.c).n;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            case 1:
                ((und) this.c).l = false;
                break;
            case 2:
                ((asm) this.c).c();
                break;
            case 3:
                ((h7b0) this.c).h = null;
                break;
            case 4:
                NewsEntry newsEntry = (NewsEntry) this.c;
                qr.d(ce60.b, 100, newsEntry);
                if (!(newsEntry instanceof Photos)) {
                    cvk.u(R.string.post_removed, false);
                    break;
                } else {
                    PhotoAttachment Mb = ((Photos) newsEntry).Mb();
                    Photo photo = Mb != null ? Mb.l : null;
                    hd60.a().p0(photo != null ? Integer.valueOf(photo.d) : null, photo != null ? Integer.valueOf(photo.c) : null);
                    cvk.u(R.string.photo_removed, false);
                    break;
                }
            case 5:
                e6f0 e6f0Var = (e6f0) this.c;
                e6f0Var.p = null;
                e6f0Var.o = false;
                break;
            case 6:
                FragmentActivity activity = ((lwv0) this.c).e.getActivity();
                if (activity != null) {
                    iah0.x(activity, false);
                    break;
                }
                break;
            case 7:
                i0q0.f(new se1((izs) this.c, 6));
                break;
            case 8:
                ((com.vk.voip.ui.hint.a) this.c).c();
                break;
            default:
                ((e1x0) this.c).c = null;
                break;
        }
    }
}
