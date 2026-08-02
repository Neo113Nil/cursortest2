package defpackage;

import com.yandex.fintechsdk.core.navigation.impl.api.router.a;

/* loaded from: classes12.dex */
public final class mh5 implements lh5, b8o {
    public final /* synthetic */ int a;
    public final a b;

    public /* synthetic */ mh5(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.lh5
    public void a() {
        switch (this.a) {
            case 0:
                this.b.a();
                break;
            default:
                this.b.a();
                break;
        }
    }

    @Override // defpackage.b8o
    public void b() {
        mua1.f(this.b, "splash", new gbr(403, Integer.valueOf(emg0.finsdk_fade_in), Integer.valueOf(emg0.finsdk_fade_out), "error"), 2);
    }

    @Override // defpackage.lh5
    public void onError(Throwable th) {
        mua1.f(this.b, "webview-payment", new gbr(403, Integer.valueOf(emg0.finsdk_fade_in), Integer.valueOf(emg0.finsdk_fade_out), "bdui"), 2);
    }
}
