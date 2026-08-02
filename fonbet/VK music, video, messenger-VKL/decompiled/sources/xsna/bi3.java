package xsna;

import com.vk.mediastore.system.MediaStoreEntry;
import xsna.l2f;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class bi3 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bi3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((reb) this.c).destroy();
                break;
            case 1:
                ((l2f.a) this.c).a(null);
                break;
            case 2:
                ((com.vk.music.pref.a) ((c7j) this.c).e.getValue()).v(r0.c);
                break;
            case 3:
                ((bq60) this.c).a(yo60.e.a.a);
                break;
            case 4:
                ((v860) this.c).f();
                break;
            case 5:
                ((e6e0) this.c).b.b(null);
                break;
            default:
                MediaStoreEntry mediaStoreEntry = (MediaStoreEntry) this.c;
                if (mediaStoreEntry != null) {
                    mediaStoreEntry.i = false;
                    break;
                }
                break;
        }
    }
}
