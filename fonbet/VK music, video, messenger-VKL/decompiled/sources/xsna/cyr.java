package xsna;

import com.vk.im.engine.models.events.OnCacheInvalidateEvent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class cyr implements izs {
    public final /* synthetic */ dyr b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ cyr(dyr dyrVar, boolean z) {
        this.b = dyrVar;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        dyr dyrVar = this.b;
        dyrVar.b.y(this.c);
        dyrVar.a.invoke().x(new OnCacheInvalidateEvent("FolderCounterSettingsInteractor", OnCacheInvalidateEvent.Reason.COMPLICATED_DB_CHANGE));
        hf8.b("com.vkontakte.android.COUNTERS_UPDATED");
        return s3q0.a;
    }
}
