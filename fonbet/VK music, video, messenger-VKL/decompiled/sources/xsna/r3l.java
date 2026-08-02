package xsna;

import android.content.DialogInterface;
import androidx.preference.Preference;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import java.io.File;
import xsna.h7u0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class r3l implements Preference.b, Preference.c {
    public final /* synthetic */ DebugDevSettingsFragment b;

    public /* synthetic */ r3l(DebugDevSettingsFragment debugDevSettingsFragment) {
        this.b = debugDevSettingsFragment;
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        String[] strArr = DebugDevSettingsFragment.t0;
        i0q0.d(500L, new gv2(this.b, 4));
        return true;
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        String[] strArr = DebugDevSettingsFragment.t0;
        final ky6 j = com.vk.core.preference.Preference.j();
        wjy.a.getClass();
        final uek b = wjy.b();
        final File file = b.e;
        final DebugDevSettingsFragment debugDevSettingsFragment = this.b;
        h7u0.a aVar = new h7u0.a(debugDevSettingsFragment.mo2getContext());
        aVar.h0("Удалить все данные NetLog?");
        aVar.d0("Удалить", new DialogInterface.OnClickListener() { // from class: xsna.o3l
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                String[] strArr2 = DebugDevSettingsFragment.t0;
                asu0.a.getClass();
                asu0.n().submit(new z3l(DebugDevSettingsFragment.this, b, file, j, 0));
            }
        });
        aVar.X("Отмена", null);
        aVar.m();
        return true;
    }
}
