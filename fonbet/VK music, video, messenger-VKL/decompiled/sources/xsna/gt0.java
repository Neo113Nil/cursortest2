package xsna;

import com.vk.dto.photo.Photo;
import xsna.l2f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class gt0 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gt0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((Photo) this.c).E = false;
                break;
            case 1:
                ((l2f.a) this.c).a(Boolean.TRUE);
                break;
            default:
                ((com.vk.music.pref.a) ((b7j) this.c).d.getValue()).u();
                break;
        }
    }
}
