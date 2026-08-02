package xsna;

import com.vk.dto.common.Source;
import xsna.drz;

/* compiled from: FolderPeersSearchLoaderImpl.kt */
/* loaded from: classes18.dex */
public final class kzr {
    public final a1w a;
    public final io.reactivex.rxjava3.subjects.d<drz.a<xrm>> b = io.reactivex.rxjava3.subjects.d.O0(new drz.a(new xrm(null, null, null, null, 15), true));
    public final io.reactivex.rxjava3.core.w c = asu0.a.c();
    public final io.reactivex.rxjava3.disposables.b d = new io.reactivex.rxjava3.disposables.b();
    public CharSequence e;

    public kzr(a1w a1wVar) {
        this.a = a1wVar;
    }

    public final void a(CharSequence charSequence) {
        io.reactivex.rxjava3.subjects.d<drz.a<xrm>> dVar = this.b;
        dVar.onNext(new drz.a<>(dVar.P0().a, true));
        io.reactivex.rxjava3.disposables.b bVar = this.d;
        bVar.e();
        bVar.b(io.reactivex.rxjava3.kotlin.c.e(this.a.C(this, new kx30(charSequence.toString(), Source.ACTUAL, null, 0, 0, null, null, false, false, null, null, 3580)).q(this.c), new hn0(12, this, charSequence), new lh(14, this, charSequence)));
    }
}
