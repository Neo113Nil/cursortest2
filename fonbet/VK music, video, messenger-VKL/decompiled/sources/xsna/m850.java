package xsna;

import android.app.Activity;
import com.vk.music.offline.api.model.storage.StorageEvent;
import xsna.c63;

/* compiled from: MusicStorageTypeInteractorImpl.kt */
/* loaded from: classes3.dex */
public final class m850 extends c63.a {
    public final /* synthetic */ n850 b;

    public m850(n850 n850Var) {
        this.b = n850Var;
    }

    @Override // xsna.c63.b
    public final void x(Activity activity) {
        c63 c63Var = c63.a;
        c63.c(this);
        this.b.f(activity, StorageEvent.SD_CARD_RE_MOUNTED, StorageEvent.LOW_MEMORY);
    }
}
