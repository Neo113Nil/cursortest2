package ru.mail.libverify.k;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.TypedValue;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.c;
import com.vk.dto.common.ImageSizeKey;
import java.util.ArrayList;
import ru.mail.libverify.R;
import ru.mail.libverify.api.j;
import ru.mail.libverify.notifications.SettingsActivity;
import ru.mail.verify.core.utils.FileLog;
import xsna.d0p;
import xsna.dbg0;
import xsna.did0;
import xsna.epx;
import xsna.eu;
import xsna.qw80;
import xsna.s3q0;
import xsna.tk5;
import xsna.u9c0;
import xsna.ugm0;
import xsna.up;

/* loaded from: classes9.dex */
public final class a extends androidx.preference.b implements ru.mail.libverify.i.b {
    private String a;
    private String b;
    private boolean c;
    private String d;

    private final void b() {
        addPreferencesFromResource(R.xml.notification_settings);
        Preference findPreference = findPreference("preference_report_reuse");
        if (findPreference == null) {
            return;
        }
        Resources resources = getResources();
        int i = R.string.report_reuse_text;
        String str = this.a;
        if (str == null) {
            str = null;
        }
        findPreference.J(resources.getString(i, str));
        findPreference.g = new did0(this, 18);
        Preference findPreference2 = findPreference("preference_block_notifications");
        if (findPreference2 == null) {
            return;
        }
        findPreference2.g = new ugm0(this, 8);
        Preference findPreference3 = findPreference("preference_show_history");
        if (findPreference3 != null) {
            if (this.c) {
                findPreference3.g = new u9c0(this, 12);
                return;
            }
            PreferenceScreen preferenceScreen = getPreferenceScreen();
            synchronized (preferenceScreen) {
                try {
                    ArrayList arrayList = preferenceScreen.S;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        preferenceScreen.S((Preference) arrayList.get(0));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            androidx.preference.c cVar = preferenceScreen.J;
            if (cVar != null) {
                Handler handler = cVar.g;
                c.a aVar = cVar.h;
                handler.removeCallbacks(aVar);
                handler.post(aVar);
            }
            getPreferenceScreen().O(findPreference);
            getPreferenceScreen().O(findPreference3);
        }
    }

    private final void c() {
        FragmentActivity activity;
        if (this.b == null || (activity = getActivity()) == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getResources().getString(R.string.title_activity_settings));
        sb.append(" (");
        String str = this.b;
        if (str == null) {
            str = null;
        }
        sb.append(str);
        sb.append(')');
        activity.setTitle(sb.toString());
    }

    @Override // ru.mail.libverify.i.b
    public final void a(j.b bVar) {
        if (bVar == null || getActivity() == null || !epx.f(bVar.f, this.d)) {
            FileLog.e("SettingsFragment", "no such notification with id %s or activity has been finished", this.d);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        ru.mail.libverify.d0.a.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.UI_NOTIFICATION_SETTINGS_SHOWN, this.d));
        String str = bVar.e;
        if (str.length() > 4) {
            StringBuilder sb = new StringBuilder(str.length());
            int length = str.length() - 4;
            for (int i = 0; i < length; i++) {
                sb.append(ImageSizeKey.SIZE_KEY_BASE);
            }
            str = up.b(length, str, sb);
        }
        this.a = str;
        this.b = bVar.b;
        this.c = bVar.i;
        c();
        b();
    }

    @Override // androidx.preference.b
    public final void onCreatePreferences(Bundle bundle, String str) {
        String string = bundle != null ? bundle.getString("state_from_key") : null;
        String string2 = bundle != null ? bundle.getString("state_notificationId_key") : null;
        Boolean valueOf = bundle != null ? Boolean.valueOf(bundle.getBoolean("state_showSmsHistory_key")) : null;
        String string3 = bundle != null ? bundle.getString("state_phoneNumberHidden_key") : null;
        if (string != null && string2 != null && valueOf != null && string3 != null) {
            this.a = string3;
            this.b = string;
            this.c = valueOf.booleanValue();
            this.d = string2;
            b();
            c();
            return;
        }
        if (this.d == null) {
            Bundle arguments = getArguments();
            String string4 = arguments != null ? arguments.getString("notification_id") : null;
            this.d = string4;
            if (string4 != null && string4.length() != 0) {
                ru.mail.libverify.d0.a.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.UI_NOTIFICATION_GET_INFO, this.d, new ru.mail.libverify.i.a(this)));
                return;
            }
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        eu supportActionBar;
        super.onResume();
        c();
        FragmentActivity kn = kn();
        if ((kn instanceof AppCompatActivity) && (supportActionBar = ((AppCompatActivity) kn).getSupportActionBar()) != null) {
            supportActionBar.n(false);
        }
    }

    @Override // androidx.preference.b, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        String str = this.b;
        if (str == null) {
            str = null;
        }
        bundle.putString("state_from_key", str);
        bundle.putString("state_notificationId_key", this.d);
        String str2 = this.a;
        bundle.putString("state_phoneNumberHidden_key", str2 != null ? str2 : null);
        bundle.putBoolean("state_showSmsHistory_key", this.c);
        super.onSaveInstanceState(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(a aVar, Preference preference) {
        FragmentActivity activity = aVar.getActivity();
        if (!(activity instanceof SettingsActivity)) {
            return false;
        }
        int i = SettingsActivity.a;
        FragmentManager supportFragmentManager = ((SettingsActivity) activity).getSupportFragmentManager();
        androidx.fragment.app.a b = tk5.b(supportFragmentManager, supportFragmentManager);
        b.g(R.id.fragment_container, new b(), null);
        b.d("dialogs");
        b.k(false);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(a aVar, Preference preference) {
        s3q0 s3q0Var;
        AlertDialog a = aVar.a();
        if (a != null) {
            a.show();
            s3q0Var = s3q0.a;
        } else {
            s3q0Var = null;
        }
        return s3q0Var != null;
    }

    private final AlertDialog a() {
        Integer num;
        if (getActivity() != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            String str = this.b;
            if (str == null) {
                str = null;
            }
            AlertDialog.Builder title = builder.setTitle(str);
            Resources resources = getResources();
            int i = R.drawable.libverify_ic_sms_white;
            ThreadLocal<TypedValue> threadLocal = dbg0.a;
            Drawable drawable = resources.getDrawable(i, null);
            if (drawable != null) {
                try {
                    num = Integer.valueOf(getResources().getColor(R.color.libverify_secondary_icon_color, null));
                } catch (Resources.NotFoundException unused) {
                    num = null;
                }
                if (num != null) {
                    drawable.setTint(num.intValue());
                    AlertDialog.Builder icon = title.setIcon(drawable);
                    Resources resources2 = getResources();
                    int i2 = R.string.report_reuse_text_confirmation;
                    String str2 = this.a;
                    if (str2 == null) {
                        str2 = null;
                    }
                    icon.setMessage(resources2.getString(i2, str2)).setNegativeButton(getString(R.string.notification_event_close), (DialogInterface.OnClickListener) null).setPositiveButton(getString(R.string.notification_event_confirm), new d0p(this, 4));
                    return title.create();
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(a aVar, Preference preference) {
        preference.f = new qw80(aVar, 22);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a aVar, DialogInterface dialogInterface, int i) {
        s3q0 s3q0Var;
        FragmentActivity activity = aVar.getActivity();
        if (activity != null) {
            activity.finish();
            s3q0Var = s3q0.a;
        } else {
            s3q0Var = null;
        }
        if (s3q0Var == null) {
            return;
        }
        Toast.makeText(aVar.getActivity(), R.string.setting_saved_toast_text, 1).show();
        ru.mail.libverify.d0.a.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.UI_NOTIFICATION_SETTINGS_REPORT_REUSE, aVar.d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(a aVar, Preference preference, Object obj) {
        s3q0 s3q0Var;
        FragmentActivity activity = aVar.getActivity();
        if (activity != null) {
            activity.finish();
            s3q0Var = s3q0.a;
        } else {
            s3q0Var = null;
        }
        if (s3q0Var == null) {
            return false;
        }
        Toast.makeText(aVar.getActivity(), R.string.setting_saved_toast_text, 1).show();
        ru.mail.libverify.d0.a.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.UI_NOTIFICATION_SETTINGS_BLOCK, aVar.d, Integer.valueOf(Integer.parseInt(obj.toString()))));
        return true;
    }
}
