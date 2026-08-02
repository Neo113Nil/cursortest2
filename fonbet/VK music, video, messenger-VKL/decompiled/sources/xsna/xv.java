package xsna;

import com.vk.reactions.view.ElevationImageView;
import com.vkontakte.android.R;
import xsna.l1s;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class xv implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xv(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                qv20.b((com.vk.core.view.components.spinner.c) this.c);
                break;
            case 1:
                i9b i9bVar = (i9b) this.c;
                i9bVar.i.c(i9bVar.f.getString(R.string.vkim_channel_was_shown_from_all_folder), null);
                break;
            case 2:
                ((uh3) this.c).invoke();
                break;
            case 3:
                r5p r5pVar = (r5p) this.c;
                io.reactivex.rxjava3.disposables.c cVar = r5pVar.d;
                if (cVar != null) {
                    cVar.dispose();
                }
                r5pVar.d = null;
                break;
            case 4:
                ((ElevationImageView) this.c).s = false;
                break;
            case 5:
                ((l1s.a) this.c).onDestroy();
                break;
            case 6:
                ((qd40) this.c).getClass();
                break;
            default:
                ((b2e0) this.c).a();
                break;
        }
    }
}
