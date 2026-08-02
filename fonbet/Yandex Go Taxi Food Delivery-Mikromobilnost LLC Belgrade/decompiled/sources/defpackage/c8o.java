package defpackage;

import com.yandex.fintechsdk.core.navigation.impl.api.router.a;

/* loaded from: classes12.dex */
public final class c8o implements b8o, sqt0 {
    public final /* synthetic */ int a;
    public final a b;

    public /* synthetic */ c8o(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.sqt0
    public void D() {
        int i = this.a;
        a aVar = this.b;
        switch (i) {
            case 1:
                mua1.f(aVar, "error", new gbr(499, null, null, "splash"), 2);
                break;
            default:
                mua1.f(aVar, "error", new gbr(403, Integer.valueOf(emg0.finsdk_fade_in), Integer.valueOf(emg0.finsdk_fade_out), "splash"), 2);
                break;
        }
    }

    @Override // defpackage.b8o
    public final void a() {
        switch (this.a) {
            case 0:
                this.b.a();
                break;
            case 1:
                D();
                break;
            default:
                this.b.a();
                break;
        }
    }

    @Override // defpackage.b8o
    public final void b() {
        int i = this.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                mua1.f(aVar, "splash", new gbr(403, Integer.valueOf(emg0.finsdk_fade_in), Integer.valueOf(emg0.finsdk_fade_out), "error"), 2);
                break;
            case 1:
                mua1.f(aVar, "webview", null, 6);
                break;
            default:
                mua1.f(aVar, "bdui", new gbr(403, Integer.valueOf(emg0.finsdk_fade_in), Integer.valueOf(emg0.finsdk_fade_out), "splash"), 2);
                break;
        }
    }
}
