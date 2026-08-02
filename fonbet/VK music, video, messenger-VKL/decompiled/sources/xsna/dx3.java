package xsna;

import android.net.Uri;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vkontakte.android.R;
import java.util.concurrent.Callable;
import xsna.svm;
import xsna.uxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class dx3 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dx3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                final Image image = (Image) this.c;
                final int i = ix3.c;
                new io.reactivex.rxjava3.internal.operators.completable.m(new Callable() { // from class: xsna.fx3
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ImageSize Cb = image.Cb(i, true, false);
                        if (Cb != null) {
                            return mcr0.q(Uri.parse(Cb.d.d));
                        }
                        return null;
                    }
                });
                break;
            case 1:
                ((r46) this.c).k(uxd0.c.a);
                break;
            case 2:
                i9b i9bVar = (i9b) this.c;
                i9bVar.i.c(i9bVar.f.getString(R.string.vkim_channels_notifications_disabled), null);
                break;
            case 3:
                ((uh3) this.c).invoke();
                break;
            case 4:
                ((Runnable) this.c).run();
                break;
            case 5:
                ((akl) this.c).m = false;
                break;
            case 6:
                ((nvm) this.c).n(svm.b.a);
                break;
            case 7:
                ((rw30) this.c).s = null;
                break;
            case 8:
                ((bzb0) this.c).a();
                break;
            default:
                w1s0.c.remove(((VideoFile) this.c).a1());
                break;
        }
    }

    public /* synthetic */ dx3(ix3 ix3Var, Image image) {
        this.b = 0;
        this.c = image;
    }
}
