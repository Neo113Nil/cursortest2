package xsna;

import com.vk.dto.music.Playlist;
import com.vk.music.fragment.impl.model.a;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import xsna.h7u0;
import xsna.i0p;
import xsna.tq70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class o0p implements tq70.b, io.reactivex.rxjava3.core.d, yads.ng1 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o0p(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // xsna.tq70.b
    public void accept(Object obj) {
        a.C1323a c1323a = (a.C1323a) this.b;
        ((i0p.a) obj).o(com.vk.music.fragment.impl.model.a.this, (Playlist) this.c);
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        ((yads.af) obj).getClass();
    }

    @Override // io.reactivex.rxjava3.core.d
    public void subscribe(io.reactivex.rxjava3.core.b bVar) {
        SettingsGeneralFragment settingsGeneralFragment = (SettingsGeneralFragment) this.b;
        androidx.appcompat.app.d[] dVarArr = (androidx.appcompat.app.d[]) this.c;
        int i = SettingsGeneralFragment.z0;
        int i2 = h7u0.p;
        h7u0.a c = h7u0.b.c(settingsGeneralFragment.kn());
        c.g0(R.string.sett_clear_all_and_logout);
        c.U(R.string.clear_all_without_logout_desc);
        int i3 = 1;
        c.c0(R.string.ok, new rm1(settingsGeneralFragment, i3));
        c.W(R.string.cancel, new sm1(i3));
        dVarArr[0] = c.m();
    }
}
