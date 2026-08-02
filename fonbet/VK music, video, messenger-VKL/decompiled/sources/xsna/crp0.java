package xsna;

import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class crp0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;

    public /* synthetic */ crp0(int i) {
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                cvk.u(R.string.picker_video_processing_error, false);
                break;
            default:
                break;
        }
    }
}
