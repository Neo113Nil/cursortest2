package xsna;

import com.vk.dto.music.Playlist;
import com.yandex.mobile.ads.nativeads.NativeAdRequestConfiguration;
import com.yandex.mobile.ads.nativeads.NativeBulkAdLoader;
import java.util.Stack;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ph40 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ph40(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                vh40 vh40Var = (vh40) this.c;
                vh40Var.c.a((Playlist) this.d);
                break;
            default:
                w4y0 w4y0Var = (w4y0) this.c;
                String str = (String) this.d;
                e5y0 a = w4y0Var.a.a();
                if (a != null) {
                    int intValue = ((Number) w4y0Var.c.getValue()).intValue();
                    Stack<kv50> stack = a.f;
                    if (stack.size() < intValue) {
                        NativeBulkAdLoader nativeBulkAdLoader = new NativeBulkAdLoader(a.a);
                        nativeBulkAdLoader.setNativeBulkAdLoadListener(new bbu(a, nativeBulkAdLoader));
                        NativeAdRequestConfiguration build = new NativeAdRequestConfiguration.Builder(str).setShouldLoadImagesAutomatically(true).build();
                        a.e.add(nativeBulkAdLoader);
                        nativeBulkAdLoader.loadAds(build, intValue - stack.size());
                        break;
                    }
                }
                break;
        }
    }
}
