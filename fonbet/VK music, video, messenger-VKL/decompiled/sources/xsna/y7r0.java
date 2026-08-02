package xsna;

import com.vkontakte.android.data.b;
import xsna.c0m;

/* compiled from: VKApplication.kt */
/* loaded from: classes11.dex */
public final class y7r0 implements b.InterfaceC2101b {
    public final zxc0 a = new zxc0();

    @Override // com.vkontakte.android.data.b.InterfaceC2101b
    public final io.reactivex.rxjava3.core.q<c0m.a> a(String str) {
        return rsg0.y0(new c0m(str), null, null, 3);
    }

    @Override // com.vkontakte.android.data.b.InterfaceC2101b
    public final void b(String str) {
        dz2 d = new tsu(this.a).d(str);
        d.k = true;
        d.p();
    }

    @Override // com.vkontakte.android.data.b.InterfaceC2101b
    public final void c() {
    }
}
