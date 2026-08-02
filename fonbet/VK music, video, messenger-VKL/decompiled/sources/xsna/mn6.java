package xsna;

import android.net.Uri;
import android.view.View;
import com.vk.music.fragment.impl.EditPlaylistFragment;
import com.vk.music.fragment.impl.b;
import com.vk.sharing.core.view.IntentAction;
import com.vk.sharing.im_engine_impl.BaseSharingExternalActivity;
import java.util.Iterator;
import xsna.h8z0;
import xsna.hjz0;
import xsna.mez0;
import xsna.rfb0;
import xsna.tq70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class mn6 implements io.reactivex.rxjava3.core.s, io.reactivex.rxjava3.core.d, b.a, tq70.b, h8z0.b, mez0.c {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mn6(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // xsna.h8z0.b
    public void a() {
        euy0 euy0Var = (euy0) this.b;
        xey0 xey0Var = (xey0) this.c;
        hjz0.a aVar = euy0Var.a;
        String str = xey0Var.F;
        yil0.d(aVar);
    }

    @Override // xsna.tq70.b
    public void accept(Object obj) {
        ((rfb0.a) obj).h((g250) this.b, ((b9b0) ((a9b0) this.c)).a, true);
    }

    @Override // xsna.mez0.c
    public void c() {
        ((fkz0) this.b).getClass();
    }

    @Override // io.reactivex.rxjava3.core.d
    public void subscribe(io.reactivex.rxjava3.core.b bVar) {
        try {
            ((mx8) this.b).a.e(((ay8) this.c).e).c.j();
            bVar.onComplete();
        } catch (Exception e) {
            bVar.onError(e);
        }
    }

    @Override // com.vk.music.fragment.impl.b.a
    public View a(com.vk.music.fragment.impl.b bVar) {
        EditPlaylistFragment editPlaylistFragment = (EditPlaylistFragment) this.b;
        mzp0 mzp0Var = (mzp0) this.c;
        int i = EditPlaylistFragment.P;
        return new f0p(editPlaylistFragment, (i0p) bVar.c[0], mzp0Var);
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        BaseSharingExternalActivity.k kVar = (BaseSharingExternalActivity.k) this.b;
        IntentAction intentAction = (IntentAction) this.c;
        Iterator it = kVar.f.iterator();
        while (it.hasNext()) {
            rVar.onNext(BaseSharingExternalActivity.Z1(BaseSharingExternalActivity.this, intentAction, (Uri) it.next()));
        }
        rVar.onComplete();
    }
}
