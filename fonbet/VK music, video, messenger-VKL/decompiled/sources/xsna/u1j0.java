package xsna;

import android.os.Bundle;
import android.view.View;
import androidx.preference.Preference;
import com.vk.core.view.components.button.VkButton;
import com.vk.voip.VoipService;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import java.lang.ref.WeakReference;
import xsna.cwb0;
import xsna.exy0;
import xsna.r5q0;
import xsna.tfw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class u1j0 implements Preference.c, io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, pcs, i0u0, io.reactivex.rxjava3.core.s, y990, yads.l32, exy0.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u1j0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // yads.l32
    public boolean a(yads.m22 m22Var) {
        return yads.oz1.d((yads.oz1) this.c, m22Var);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 11:
            default:
                Object obj3 = VoipService.q;
                break;
            case 10:
                break;
            case 12:
                int i2 = ylw0.x1;
                break;
        }
        return (String) ((pzt0) obj2).invoke(obj);
    }

    @Override // xsna.exy0.a
    public void b() {
        phz0 phz0Var = (phz0) this.c;
        vez0 vez0Var = phz0Var.l;
        if (vez0Var != null) {
            vez0Var.d();
            vez0Var.d.destroy();
            vez0Var.e.b();
        }
        phz0Var.o();
        phz0Var.d.e(phz0Var.b);
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        SettingsGeneralFragment settingsGeneralFragment = (SettingsGeneralFragment) this.c;
        int i = SettingsGeneralFragment.z0;
        bzb0.d(new bzb0(settingsGeneralFragment.kn()), cwb0.u0.l, new gd70(settingsGeneralFragment, 28), null, null, 28);
        return true;
    }

    @Override // xsna.i0u0
    public View get() {
        return (View) new WeakReference((VkButton) this.c).get();
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        uqb uqbVar = ((r5q0.a) this.c).c;
        if (uqbVar != null) {
            uqbVar.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [xsna.ayi0, xsna.qfw0] */
    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(final io.reactivex.rxjava3.core.r rVar) {
        final tfw0 tfw0Var = (tfw0) this.c;
        tfw0.d dVar = tfw0Var.b;
        rVar.onNext(dVar.a().g());
        final ?? r2 = new ayi0() { // from class: xsna.qfw0
            @Override // xsna.ayi0
            public final void a(uxi0 uxi0Var) {
                io.reactivex.rxjava3.core.r.this.onNext(tfw0Var.b.a().g());
            }
        };
        dVar.b().f(r2);
        rVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.rfw0
            @Override // io.reactivex.rxjava3.functions.e
            public final void cancel() {
                tfw0.this.b.b().k(r2);
            }
        });
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((e750) this.c).invoke(obj)).booleanValue();
    }

    @Override // xsna.y990
    public void a(int i) {
        ((mjw0) this.c).l();
    }
}
