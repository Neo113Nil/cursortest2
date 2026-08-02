package xsna;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import com.vk.dto.music.MusicTrack;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class d700 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d700(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) obj2;
                String str = (String) obj;
                if (!lottieAnimationView.k) {
                    return q700.c(lottieAnimationView.getContext(), str, null);
                }
                Context context = lottieAnimationView.getContext();
                HashMap hashMap = q700.a;
                return q700.c(context, str, "asset_" + str);
            default:
                return ((vh40) obj2).b.x(o25.a().c(), (MusicTrack) obj);
        }
    }
}
