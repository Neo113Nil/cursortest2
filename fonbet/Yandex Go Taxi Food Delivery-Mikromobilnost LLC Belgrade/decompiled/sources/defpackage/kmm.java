package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class kmm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mmm b;
    public final /* synthetic */ nmm c;

    public /* synthetic */ kmm(mmm mmmVar, nmm nmmVar, int i) {
        this.a = i;
        this.b = mmmVar;
        this.c = nmmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        nmm nmmVar = this.c;
        mmm mmmVar = this.b;
        switch (i) {
            case 0:
                nmmVar.onDrmSessionReleased(mmmVar.a, mmmVar.b);
                break;
            case 1:
                nmmVar.onDrmKeysRemoved(mmmVar.a, mmmVar.b);
                break;
            case 2:
                nmmVar.onDrmKeysRestored(mmmVar.a, mmmVar.b);
                break;
            default:
                nmmVar.onDrmKeysLoaded(mmmVar.a, mmmVar.b);
                break;
        }
    }
}
