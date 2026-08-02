package xsna;

import android.view.View;
import androidx.preference.Preference;
import com.vk.appredirects.ui.AppRedirectsSettingsFragment;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import com.vkontakte.android.sdk.SDKInviteDialog;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class kxa0 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, Preference.c, i0u0, io.reactivex.rxjava3.functions.d, io.reactivex.rxjava3.functions.g, yads.l32, yads.kz {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kxa0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // yads.l32
    public boolean a(yads.m22 m22Var) {
        return yads.oz1.e((yads.oz1) this.c, m22Var);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (Boolean) ((tcu) obj2).invoke(obj);
            case 1:
                return (List) ((kb40) obj2).invoke(obj);
            case 2:
            case 3:
            case 6:
            case 9:
            case 10:
            case 11:
            default:
                return (io.reactivex.rxjava3.core.b0) ((mmm0) obj2).invoke(obj);
            case 4:
                return (isf0) ((hoh) obj2).invoke(obj);
            case 5:
                int i2 = SDKInviteDialog.X;
                return (io.reactivex.rxjava3.core.t) ((tcu) obj2).invoke(obj);
            case 7:
                return (List) ((tcu) obj2).invoke(obj);
            case 8:
                return (o820) ((mmm0) obj2).invoke(obj);
            case 12:
                return (List) ((mmm0) obj2).invoke(obj);
        }
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (List) ((rcm) this.c).invoke(obj, obj2, obj3);
    }

    @Override // yads.kz
    public void e() {
        yads.uw2.a((yads.km) this.c);
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        SettingsGeneralFragment settingsGeneralFragment = (SettingsGeneralFragment) this.c;
        int i = SettingsGeneralFragment.z0;
        new oz50(AppRedirectsSettingsFragment.class, null, null).k(settingsGeneralFragment.mo2getContext());
        return true;
    }

    @Override // xsna.i0u0
    public View get() {
        switch (this.b) {
            case 9:
                return (View) new WeakReference((VkButton) this.c).get();
            default:
                return (View) new WeakReference((View) this.c).get();
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 2:
                return ((Boolean) ((tcu) this.c).invoke(obj)).booleanValue();
            case 3:
                return ((Boolean) ((kb40) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((mmm0) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.d
    public boolean test(Object obj, Object obj2) {
        return ((Boolean) ((c80) this.c).invoke(obj, obj2)).booleanValue();
    }
}
