package xsna;

import android.content.Context;
import android.view.View;
import com.vk.libvideo.bottomsheet.about.AuthorVideoItemsLoader$observeDonutSubscriptionPaidEvent$1$receiver$1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class dd5 implements io.reactivex.rxjava3.functions.e {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dd5(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.e
    public final void cancel() {
        switch (this.b) {
            case 0:
                ((Context) this.c).unregisterReceiver((AuthorVideoItemsLoader$observeDonutSubscriptionPaidEvent$1$receiver$1) this.d);
                break;
            default:
                ((View) this.c).removeOnLayoutChangeListener((pbs0) this.d);
                break;
        }
    }
}
