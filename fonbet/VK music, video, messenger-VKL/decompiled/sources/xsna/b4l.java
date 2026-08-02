package xsna;

import androidx.preference.Preference;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import xsna.a05;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class b4l implements Preference.c, io.reactivex.rxjava3.core.d {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b4l(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.b;
        lau lauVar = (lau) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        lauVar.b();
        debugDevSettingsFragment.ko();
        return true;
    }

    @Override // io.reactivex.rxjava3.core.d
    public void subscribe(io.reactivex.rxjava3.core.b bVar) {
        final a05 a05Var = new a05((a05.b) this.b, ((n7m0) this.c).z);
        bVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.l7m0
            @Override // io.reactivex.rxjava3.functions.e
            public final void cancel() {
                a05.this.d = true;
            }
        });
        a05Var.b();
    }
}
