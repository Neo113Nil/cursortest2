package xsna;

import com.vk.channels.api.Channel;
import com.vk.im.engine.models.dialogs.DialogExt;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class bl6 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ io.reactivex.rxjava3.subjects.d c;

    public /* synthetic */ bl6(int i, io.reactivex.rxjava3.subjects.d dVar) {
        this.b = i;
        this.c = dVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                this.c.onNext((DialogExt) obj);
                break;
            default:
                this.c.onNext((Channel) obj);
                break;
        }
    }
}
