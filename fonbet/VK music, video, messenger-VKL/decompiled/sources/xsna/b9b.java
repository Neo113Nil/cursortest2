package xsna;

import com.vkontakte.android.R;
import xsna.jv60;
import xsna.whs;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class b9b implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b9b(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                i9b i9bVar = (i9b) this.c;
                i9bVar.i.c(i9bVar.f.getString(R.string.vkim_channels_notifications_enabled), null);
                break;
            case 1:
                ((com.vk.folders.impl.configure.d) this.c).j.onDestroy();
                break;
            case 2:
                ((ha50) this.c).h = null;
                break;
            default:
                ((uj60) this.c).e(new jv60.a.e(whs.a.a));
                break;
        }
    }
}
