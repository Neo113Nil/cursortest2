package xsna;

import com.vk.im.engine.external.ImMsgPushSettingsProvider;
import java.util.concurrent.ExecutorService;

/* compiled from: MsgPushEnabledSyncManager.kt */
/* loaded from: classes.dex */
public final class cv30 {
    public final w2w a;
    public final ExecutorService b;
    public boolean c;
    public final a d = new a();
    public final ImMsgPushSettingsProvider e;

    /* compiled from: MsgPushEnabledSyncManager.kt */
    public final class a implements ImMsgPushSettingsProvider.OnEnabledUpdateListener {
        public a() {
        }

        @Override // com.vk.im.engine.external.ImMsgPushSettingsProvider.OnEnabledUpdateListener
        public final void a() {
            cv30.this.a.S0().B(this, true);
        }
    }

    public cv30(w2w w2wVar, ExecutorService executorService) {
        this.a = w2wVar;
        this.b = executorService;
        this.e = w2wVar.getConfig().f;
    }
}
