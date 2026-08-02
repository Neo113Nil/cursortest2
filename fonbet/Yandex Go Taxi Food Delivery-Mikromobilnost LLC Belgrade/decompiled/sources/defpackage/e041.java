package defpackage;

import ru.yandex.yx_platform_api.VpnStreamHandler$callback$1;

/* loaded from: classes7.dex */
public final /* synthetic */ class e041 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f041 b;

    public /* synthetic */ e041(f041 f041Var, int i) {
        this.a = i;
        this.b = f041Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        f041 f041Var = this.b;
        switch (i) {
            case 0:
                VpnStreamHandler$callback$1.onAvailable$lambda$0(f041Var);
                break;
            default:
                VpnStreamHandler$callback$1.onLost$lambda$1(f041Var);
                break;
        }
    }
}
