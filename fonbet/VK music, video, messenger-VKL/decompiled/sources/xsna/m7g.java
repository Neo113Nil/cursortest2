package xsna;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.preference.DialogPreference;
import com.vk.prefui.views.ColorPreference;
import com.vk.stat.scheme.SchemeStat$TypeDialogItem;
import java.util.WeakHashMap;

/* compiled from: ColorPreferenceDialogFragment.kt */
/* loaded from: classes5.dex */
public final class m7g extends androidx.preference.a {
    public final u0q0 F = new u0q0(SchemeStat$TypeDialogItem.DialogItem.SETTINGS_COLOR_VALUE, null);

    @Override // androidx.preference.a
    public final View Gn() {
        DialogPreference Dn = Dn();
        final ColorPreference colorPreference = Dn instanceof ColorPreference ? (ColorPreference) Dn : null;
        if (colorPreference == null) {
            un(false, false);
            return null;
        }
        j7g j7gVar = new j7g(requireContext());
        j7gVar.m.add(new c380() { // from class: xsna.l7g
            @Override // xsna.c380
            public final void a(int i) {
                ColorPreference.this.Y = i | (-16777216);
            }
        });
        j7gVar.setRenderer(new jur());
        j7gVar.setInitialColor(colorPreference.X);
        WeakHashMap weakHashMap = j6r0.a;
        int a = iah0.a(16.0f);
        j7gVar.setPadding(a, a, a, a);
        FrameLayout frameLayout = new FrameLayout(requireContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(j7gVar, layoutParams);
        return frameLayout;
    }

    @Override // androidx.preference.a
    public final void Hn(boolean z) {
        int i;
        DialogPreference Dn = Dn();
        ColorPreference colorPreference = Dn instanceof ColorPreference ? (ColorPreference) Dn : null;
        if (colorPreference == null || !z || (i = colorPreference.Y) == 0) {
            return;
        }
        colorPreference.X = i;
        colorPreference.D(i);
        colorPreference.o();
    }

    @Override // androidx.preference.a, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.F.a();
    }

    @Override // androidx.preference.a, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        Dialog yn = super.yn(bundle);
        yn.setOnShowListener(new DialogInterface.OnShowListener() { // from class: xsna.k7g
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                m7g.this.F.c();
            }
        });
        return yn;
    }
}
