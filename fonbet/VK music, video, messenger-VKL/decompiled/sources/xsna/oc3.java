package xsna;

import android.graphics.Rect;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.preference.Preference;
import com.vk.im.settings.appearance.AppearanceSettingsWithBackgroundsFragment;
import com.vk.im.ui.views.settings.CheckableLabelSettingsView;
import com.vk.permission.PermissionHelper;
import com.vk.stat.scheme.SchemeStat$TypeClickItem;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import xsna.r1q0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class oc3 implements Runnable {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ oc3(int i, AppearanceSettingsWithBackgroundsFragment appearanceSettingsWithBackgroundsFragment) {
        this.c = i;
        this.d = appearanceSettingsWithBackgroundsFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        int i2 = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                AppearanceSettingsWithBackgroundsFragment appearanceSettingsWithBackgroundsFragment = (AppearanceSettingsWithBackgroundsFragment) obj;
                int i3 = AppearanceSettingsWithBackgroundsFragment.b0;
                if (i2 == R.id.auto_theme_btn) {
                    FragmentActivity kn = appearanceSettingsWithBackgroundsFragment.kn();
                    CheckableLabelSettingsView checkableLabelSettingsView = appearanceSettingsWithBackgroundsFragment.Q;
                    Rect checkIconVisibleRect = (checkableLabelSettingsView != null ? checkableLabelSettingsView : null).getCheckIconVisibleRect();
                    float[] fArr = {checkIconVisibleRect.centerX(), checkIconVisibleRect.centerY()};
                    WeakReference weakReference = new WeakReference(appearanceSettingsWithBackgroundsFragment);
                    PermissionHelper permissionHelper = PermissionHelper.a;
                    permissionHelper.getClass();
                    PermissionHelper.i(permissionHelper, kn, PermissionHelper.h, PermissionHelper.i, R.string.sett_appearance_auto_permission, R.string.sett_appearance_auto_permission, new qc3(weakReference, kn, fArr, appearanceSettingsWithBackgroundsFragment, 0), new mz(weakReference, 3), null, 384);
                } else if (i2 == R.id.system_theme_btn) {
                    r1q0.a.a(SchemeStat$TypeClickItem.Subtype.THEME_SYSTEM);
                    FragmentActivity kn2 = appearanceSettingsWithBackgroundsFragment.kn();
                    CheckableLabelSettingsView checkableLabelSettingsView2 = appearanceSettingsWithBackgroundsFragment.R;
                    if (checkableLabelSettingsView2 == null) {
                        checkableLabelSettingsView2 = null;
                    }
                    Rect checkIconVisibleRect2 = checkableLabelSettingsView2.getCheckIconVisibleRect();
                    float[] fArr2 = {checkIconVisibleRect2.centerX(), checkIconVisibleRect2.centerY()};
                    dhr0 dhr0Var = dhr0.a;
                    Preference.C("vk_theme_helper", "auto_change_theme");
                    Preference.C("vk_theme_helper", "timetable_change_theme");
                    dhr0 dhr0Var2 = dhr0.a;
                    dhr0Var2.getClass();
                    boolean equals = dhr0.n(kn2).equals(dhr0.C());
                    Preference.C("vk_theme_helper", "current_theme_name");
                    if (!equals) {
                        dhr0.m.b();
                        dhr0.p0(dhr0Var2, kn2, dhr0.n(kn2), fArr2, 8);
                    }
                    CheckableLabelSettingsView checkableLabelSettingsView3 = appearanceSettingsWithBackgroundsFragment.R;
                    appearanceSettingsWithBackgroundsFragment.Z = checkableLabelSettingsView3 != null ? checkableLabelSettingsView3 : null;
                } else if (i2 == R.id.light_theme_btn) {
                    r1q0.a.a(SchemeStat$TypeClickItem.Subtype.THEME_LIGHT);
                    dhr0 dhr0Var3 = dhr0.a;
                    FragmentActivity kn3 = appearanceSettingsWithBackgroundsFragment.kn();
                    CheckableLabelSettingsView checkableLabelSettingsView4 = appearanceSettingsWithBackgroundsFragment.S;
                    if (checkableLabelSettingsView4 == null) {
                        checkableLabelSettingsView4 = null;
                    }
                    Rect checkIconVisibleRect3 = checkableLabelSettingsView4.getCheckIconVisibleRect();
                    dhr0Var3.getClass();
                    dhr0.d0(dhr0.c.a, kn3, new float[]{checkIconVisibleRect3.centerX(), checkIconVisibleRect3.centerY()});
                    CheckableLabelSettingsView checkableLabelSettingsView5 = appearanceSettingsWithBackgroundsFragment.S;
                    appearanceSettingsWithBackgroundsFragment.Z = checkableLabelSettingsView5 != null ? checkableLabelSettingsView5 : null;
                } else if (i2 == R.id.dark_theme_btn) {
                    r1q0.a.a(SchemeStat$TypeClickItem.Subtype.THEME_DARK);
                    dhr0 dhr0Var4 = dhr0.a;
                    FragmentActivity kn4 = appearanceSettingsWithBackgroundsFragment.kn();
                    CheckableLabelSettingsView checkableLabelSettingsView6 = appearanceSettingsWithBackgroundsFragment.T;
                    if (checkableLabelSettingsView6 == null) {
                        checkableLabelSettingsView6 = null;
                    }
                    Rect checkIconVisibleRect4 = checkableLabelSettingsView6.getCheckIconVisibleRect();
                    dhr0Var4.getClass();
                    dhr0.d0(dhr0.c.b, kn4, new float[]{checkIconVisibleRect4.centerX(), checkIconVisibleRect4.centerY()});
                    CheckableLabelSettingsView checkableLabelSettingsView7 = appearanceSettingsWithBackgroundsFragment.T;
                    appearanceSettingsWithBackgroundsFragment.Z = checkableLabelSettingsView7 != null ? checkableLabelSettingsView7 : null;
                }
                appearanceSettingsWithBackgroundsFragment.fo();
                appearanceSettingsWithBackgroundsFragment.eo();
                break;
            default:
                ((a4d0) obj).N.b(i2);
                break;
        }
    }

    public /* synthetic */ oc3(a4d0 a4d0Var, int i) {
        this.d = a4d0Var;
        this.c = i;
    }
}
