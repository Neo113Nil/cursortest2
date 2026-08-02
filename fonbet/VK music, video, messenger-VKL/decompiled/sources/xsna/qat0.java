package xsna;

import com.vk.ads.yandex.impl.YandexAdFeatureImpl;
import com.yandex.mobile.ads.common.InitializationListener;
import java.util.List;
import kotlin.Pair;
import xsna.lew0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class qat0 implements io.reactivex.rxjava3.functions.c, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.l, InitializationListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qat0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 2:
                return (lew0.b.a) ((g2h0) this.c).invoke(obj);
            default:
                return (Boolean) ((z7t0) this.c).invoke(obj);
        }
    }

    @Override // com.yandex.mobile.ads.common.InitializationListener
    public void onInitializationCompleted() {
        YandexAdFeatureImpl yandexAdFeatureImpl = (YandexAdFeatureImpl) this.c;
        yandexAdFeatureImpl.e = YandexAdFeatureImpl.InitializationState.INITIALIZED;
        yandexAdFeatureImpl.c.e(null, true, null, null);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 1:
                return ((Boolean) ((g2h0) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((t6c0) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return (List) ((bn7) this.c).invoke(obj, obj2);
            default:
                return (Pair) ((d69) this.c).invoke(obj, obj2);
        }
    }
}
