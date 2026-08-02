package xsna;

import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.Preference;
import com.vk.api.photos.PhotosGetAlbums;
import com.vk.clips.favorites.impl.ui.folders.picker.ClipsFavoritesFoldersPickerFragment;
import com.vk.clips.favorites.impl.ui.folders.picker.a;
import com.vk.core.native_loader.NativeLibLoader;
import com.vk.core.ui.themes.VKTheme;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.data.VKList;
import com.vk.ecomm.cart.impl.checkout.fragment.CheckoutFragment;
import com.vk.im.settings.appearance.AppearanceSettingsWithBackgroundsFragment;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.im.ui.views.settings.MaterialSwitchSettingsView;
import com.vk.im.ui.views.settings.SwitchSettingsView;
import com.vk.stat.scheme.SchemeStat$TypeClickItem;
import java.util.List;
import kotlin.Pair;
import xsna.bzp0;
import xsna.c610;
import xsna.ihz;
import xsna.jza0;
import xsna.ky6;
import xsna.ngl;
import xsna.p810;
import xsna.r1q0;
import xsna.wv30;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class nz implements io.reactivex.rxjava3.functions.l, SwitchSettingsView.b, MaterialSwitchSettingsView.a, pcs, Preference.b, io.reactivex.rxjava3.functions.m, ngl.a, ihz.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nz(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        if (((Boolean) obj).booleanValue()) {
            NativeLibLoader.a.getClass();
            NativeLibLoader.n(false);
        } else {
            NativeLibLoader nativeLibLoader = NativeLibLoader.a;
            if (NativeLibLoader.m) {
                nativeLibLoader.getClass();
                if (com.vk.core.preference.Preference.j().getBoolean("had_problems_with_system_load", false)) {
                    ky6.a aVar = (ky6.a) com.vk.core.preference.Preference.j().edit();
                    aVar.putBoolean("had_problems_with_system_load", false);
                    aVar.a();
                }
            } else {
                nativeLibLoader.getClass();
            }
        }
        debugDevSettingsFragment.ko();
        return true;
    }

    public void a(r2c r2cVar) {
        CheckoutFragment checkoutFragment = (CheckoutFragment) this.c;
        int i = CheckoutFragment.T;
        checkoutFragment.getClass();
        xn50.a.c(checkoutFragment, r2cVar);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (xgj0) ((mz) obj2).invoke(obj);
            case 1:
                return (PhotosGetAlbums.a) ((u8) obj2).invoke(obj);
            case 2:
                return (String) ((p60) obj2).invoke(obj);
            case 3:
            case 9:
            case 10:
            case 12:
            case 15:
            case 16:
            case 17:
            case 18:
            case 27:
            default:
                return (tt70) ((q520) obj2).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.e) ((mz) obj2).invoke(obj);
            case 5:
                return (io.reactivex.rxjava3.core.e) ((f55) obj2).invoke(obj);
            case 6:
                return (String) ((p60) obj2).invoke(obj);
            case 7:
                return (List) ((oh3) obj2).invoke(obj);
            case 8:
                ChatFragment.d dVar = ChatFragment.w1;
                return (io.reactivex.rxjava3.core.b0) ((xqb) obj2).invoke(obj);
            case 11:
                return (hda) ((p60) obj2).invoke(obj);
            case 13:
                return (VKList) ((mre) obj2).invoke(obj);
            case 14:
                return (VerifyInfo) ((izs) obj2).invoke(obj);
            case 19:
                return (io.reactivex.rxjava3.core.t) ((mre) obj2).invoke(obj);
            case 20:
                return (ts) ((p60) obj2).invoke(obj);
            case 21:
                return (Bitmap) ((mre) obj2).invoke(obj);
            case 22:
                return (io.reactivex.rxjava3.core.t) ((oh3) obj2).invoke(obj);
            case 23:
                return (Pair) ((mre) obj2).invoke(obj);
            case 24:
                return (hda) ((ptb) obj2).invoke(obj);
            case 25:
                return (c610.c) ((d410) obj2).invoke(obj);
            case 26:
                return (p810.k) ((k8) obj2).invoke(obj);
            case 28:
                return (wv30.a) ((yj2) obj2).invoke(obj);
        }
    }

    @Override // com.vk.im.ui.views.settings.MaterialSwitchSettingsView.a
    public void b(boolean z) {
        ((usb) this.c).a.e(z);
    }

    @Override // com.vk.im.ui.views.settings.SwitchSettingsView.b
    public void c(boolean z, boolean z2) {
        AppearanceSettingsWithBackgroundsFragment appearanceSettingsWithBackgroundsFragment = (AppearanceSettingsWithBackgroundsFragment) this.c;
        int i = AppearanceSettingsWithBackgroundsFragment.b0;
        if (z2) {
            r1q0.a.a(SchemeStat$TypeClickItem.Subtype.THEME_TIMETABLE);
            FragmentActivity kn = appearanceSettingsWithBackgroundsFragment.kn();
            VKTheme C = dhr0.C();
            if (z) {
                com.vk.core.preference.Preference.I("vk_theme_helper", "timetable_change_theme", true);
            } else {
                com.vk.core.preference.Preference.C("vk_theme_helper", "timetable_change_theme");
            }
            com.vk.core.preference.Preference.C("vk_theme_helper", "current_theme_name");
            com.vk.core.preference.Preference.C("vk_theme_helper", "auto_change_theme");
            dhr0 dhr0Var = dhr0.a;
            dhr0Var.getClass();
            if (!C.equals(dhr0.n(kn)) || !dhr0.n(kn).equals((VKTheme) dhr0.m.a())) {
                dhr0.m.b();
                dhr0.p0(dhr0Var, kn, dhr0.n(kn), null, 12);
            }
            appearanceSettingsWithBackgroundsFragment.fo();
            appearanceSettingsWithBackgroundsFragment.eo();
            appearanceSettingsWithBackgroundsFragment.go();
        }
    }

    @Override // xsna.ngl.a
    public void e(bzp0.c cVar) {
        cop copVar = (cop) ((vop) this.c).a;
        if (copVar != null) {
            copVar.m2(cVar.a);
        }
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((jza0.b) obj).onPlayerError(((fwa0) this.c).f);
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        ClipsFavoritesFoldersPickerFragment clipsFavoritesFoldersPickerFragment = (ClipsFavoritesFoldersPickerFragment) this.c;
        ClipsFavoritesFoldersPickerFragment.a aVar = ClipsFavoritesFoldersPickerFragment.V;
        clipsFavoritesFoldersPickerFragment.getClass();
        xn50.a.c(clipsFavoritesFoldersPickerFragment, a.c.b);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((tc) this.c).invoke(obj)).booleanValue();
    }
}
