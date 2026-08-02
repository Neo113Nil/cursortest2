package xsna;

import ru.ok.android.externcalls.sdk.stat.supportedcodecs.SupportedCodecsStatistics;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class vk60 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;

    public /* synthetic */ vk60(int i) {
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                yk60.j.set(false);
                break;
            default:
                SupportedCodecsStatistics.tryToReport$lambda$1();
                break;
        }
    }
}
