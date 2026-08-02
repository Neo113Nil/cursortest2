package xsna;

import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.g;
import com.vkontakte.android.R;
import xsna.bmt;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class x97 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x97(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((n47) this.c).Bb();
                break;
            case 1:
                i9b i9bVar = (i9b) this.c;
                i9bVar.i.c(i9bVar.f.getString(R.string.vkim_channels_pinned), new d7k0(R.string.vkim_channels_unpin, new p40(i9bVar, 22)));
                break;
            case 2:
                com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.b bVar = (com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.b) this.c;
                bVar.l.b(g.b.a);
                break;
            default:
                ((bmt.b) this.c).a();
                break;
        }
    }
}
