package defpackage;

import com.yandex.go.morphlex.data.a;

/* loaded from: classes12.dex */
public final /* synthetic */ class o730 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mqq b;

    public /* synthetic */ o730(mqq mqqVar, int i) {
        this.a = i;
        this.b = mqqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        mqq mqqVar = this.b;
        switch (i) {
            case 0:
                ((a) ((at20) mqqVar.b).a).invoke();
                break;
            case 1:
                ((a) ((at20) mqqVar.b).b).invoke();
                break;
            default:
                ((a) ((at20) mqqVar.b).a).invoke();
                break;
        }
    }
}
