package xsna;

import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class itd implements Runnable {
    public final /* synthetic */ int b = 0;

    public /* synthetic */ itd() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        afx0 afx0Var;
        switch (this.b) {
            case 0:
                ClipsDraftPersistentStore.b.getClass();
                ClipsDraftPersistentStore.t();
                break;
            default:
                if (com.vk.superapp.ui.a.S1().x() && (afx0Var = e370.r) != null) {
                    afx0Var.d(null, false);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ itd(com.vk.superapp.ui.a aVar) {
    }
}
