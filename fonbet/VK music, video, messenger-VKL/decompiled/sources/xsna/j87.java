package xsna;

import com.vk.biometrics.lock.impl.presentation.base.mvi.setup.a;
import com.vk.clips.favorites.impl.ui.folders.renaming.a;
import com.vk.ecomm.onlinebooking.impl.calendar.a;
import com.vk.fullscreenvideo.a;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import xsna.k430;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class j87 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ j87(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.invoke(a.g.b);
                break;
            case 1:
                this.c.invoke(new a.h(false));
                break;
            case 2:
                this.c.invoke(a.c.C0614a.b);
                break;
            case 3:
                this.c.invoke(k430.b.b);
                break;
            case 4:
                this.c.invoke(rr40.b);
                break;
            case 5:
                this.c.invoke(new PostingAction.Navigation.Close(false, false, false, 7, null));
                break;
            default:
                this.c.invoke(a.h.a);
                break;
        }
        return s3q0.a;
    }
}
