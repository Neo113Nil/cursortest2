package xsna;

import com.vk.libvideo.live.impl.fragment.VideoLiveFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class dw8 implements io.reactivex.rxjava3.functions.e {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dw8(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.e
    public final void cancel() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((dw20) obj).hide();
                break;
            case 1:
                ((zuk) obj).close();
                break;
            default:
                int i2 = VideoLiveFragment.i0;
                o25.a().B((pss0) obj);
                break;
        }
    }
}
