package xsna;

import com.vk.clips.interests.api.ClipsInterestsStatusProvider;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ntb implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ntb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((otb) this.c).g.compareAndSet(true, false);
                break;
            case 1:
                ((uhe) this.c).e.onNext(ClipsInterestsStatusProvider.Status.COMPLETED);
                break;
            case 2:
                io.reactivex.rxjava3.disposables.b bVar = (io.reactivex.rxjava3.disposables.b) this.c;
                if (!bVar.c) {
                    bVar.dispose();
                    break;
                }
                break;
            default:
                ((w920) this.c).q.compareAndSet(true, false);
                break;
        }
    }
}
