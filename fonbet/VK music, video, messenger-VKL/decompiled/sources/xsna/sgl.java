package xsna;

import com.vk.music.offline.impl.di.OfflineAudioComponentImpl;

/* compiled from: DefaultIntentPlayerHelperFactory.kt */
/* loaded from: classes.dex */
public final class sgl implements t9v {
    public final Object a;

    public /* synthetic */ sgl(Object obj) {
        this.a = obj;
    }

    public tib a() {
        return new tib((Class) this.a);
    }

    @Override // xsna.t9v
    public void b(String str, String str2, String str3) {
        ((OfflineAudioComponentImpl) this.a).x0().b(str, str2, str3);
    }

    @Override // xsna.t9v
    public void c(String str, float f, long j) {
        ((OfflineAudioComponentImpl) this.a).x0().c(str, f, j);
    }
}
