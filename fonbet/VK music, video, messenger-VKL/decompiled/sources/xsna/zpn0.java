package xsna;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import com.vk.stat.scheme.SchemeStat$TypeAppStarts;
import java.util.Locale;

/* compiled from: SystemConcentrator.kt */
/* loaded from: classes11.dex */
public final class zpn0 implements dyp<SchemeStat$TypeAppStarts> {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0064  */
    @Override // xsna.dyp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SchemeStat$TypeAppStarts a(SchemeStat$TypeAppStarts schemeStat$TypeAppStarts) {
        boolean z;
        String str;
        int i;
        boolean z2;
        Context context;
        if (gz80.a(29)) {
            r6m.a.getClass();
            Context context2 = r6m.e;
            if (context2 == null) {
                context2 = null;
            }
            if (((context2.getResources().getConfiguration().uiMode & 48) == 32 ? "dark" : "light").equals("dark")) {
                z = true;
                r6m.a.getClass();
                str = Build.TAGS;
                if (str != null || !drm0.D(str, "test-keys", false)) {
                    String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
                    for (i = 0; i < 10; i++) {
                        if (!bd3.d(strArr[i])) {
                        }
                    }
                    z2 = false;
                    boolean L0 = com.vk.contacts.d.a.L0();
                    SchemeStat$TypeAppStarts.SystemTheme systemTheme = z ? SchemeStat$TypeAppStarts.SystemTheme.DARK : SchemeStat$TypeAppStarts.SystemTheme.LIGHT;
                    r6m.a.getClass();
                    int a = r6m.a();
                    BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                    boolean z3 = defaultAdapter == null && defaultAdapter.isEnabled();
                    e1j0.a.getClass();
                    int i2 = e1j0.d;
                    boolean l = r6m.l();
                    boolean z4 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
                    context = e43.a;
                    if (context == null) {
                        context = null;
                    }
                    String h = dy2.h(context, "unknown");
                    ply plyVar = ply.a;
                    Locale locale = hyi.a(Resources.getSystem().getConfiguration()).a.a.get(0);
                    String language = locale != null ? locale.getLanguage() : null;
                    Context context3 = r6m.e;
                    Locale locale2 = (context3 != null ? context3 : null).getResources().getConfiguration().locale;
                    return SchemeStat$TypeAppStarts.a(schemeStat$TypeAppStarts, null, null, null, null, null, null, null, null, null, null, null, null, String.valueOf(Build.VERSION.SDK_INT), language, locale2 != null ? locale2.getCountry() : "", Boolean.valueOf(z2), null, null, null, null, Boolean.valueOf(L0), null, null, systemTheme, null, null, null, Integer.valueOf(a), null, null, null, null, Boolean.valueOf(z3), Integer.valueOf(i2), null, null, null, null, null, null, Boolean.valueOf(l), null, null, null, null, Boolean.valueOf(z4), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, h, null, null, null, null, -1149747201, -1065001, 1015807);
                }
                z2 = true;
                boolean L02 = com.vk.contacts.d.a.L0();
                SchemeStat$TypeAppStarts.SystemTheme systemTheme2 = z ? SchemeStat$TypeAppStarts.SystemTheme.DARK : SchemeStat$TypeAppStarts.SystemTheme.LIGHT;
                r6m.a.getClass();
                int a2 = r6m.a();
                BluetoothAdapter defaultAdapter2 = BluetoothAdapter.getDefaultAdapter();
                if (defaultAdapter2 == null) {
                }
                e1j0.a.getClass();
                int i22 = e1j0.d;
                boolean l2 = r6m.l();
                if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                }
                context = e43.a;
                if (context == null) {
                }
                String h2 = dy2.h(context, "unknown");
                ply plyVar2 = ply.a;
                Locale locale3 = hyi.a(Resources.getSystem().getConfiguration()).a.a.get(0);
                if (locale3 != null) {
                }
                Context context32 = r6m.e;
                Locale locale22 = (context32 != null ? context32 : null).getResources().getConfiguration().locale;
                return SchemeStat$TypeAppStarts.a(schemeStat$TypeAppStarts, null, null, null, null, null, null, null, null, null, null, null, null, String.valueOf(Build.VERSION.SDK_INT), language, locale22 != null ? locale22.getCountry() : "", Boolean.valueOf(z2), null, null, null, null, Boolean.valueOf(L02), null, null, systemTheme2, null, null, null, Integer.valueOf(a2), null, null, null, null, Boolean.valueOf(z3), Integer.valueOf(i22), null, null, null, null, null, null, Boolean.valueOf(l2), null, null, null, null, Boolean.valueOf(z4), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, h2, null, null, null, null, -1149747201, -1065001, 1015807);
            }
        }
        z = false;
        r6m.a.getClass();
        str = Build.TAGS;
        if (str != null) {
        }
        String[] strArr2 = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        while (i < 10) {
        }
        z2 = false;
        boolean L022 = com.vk.contacts.d.a.L0();
        SchemeStat$TypeAppStarts.SystemTheme systemTheme22 = z ? SchemeStat$TypeAppStarts.SystemTheme.DARK : SchemeStat$TypeAppStarts.SystemTheme.LIGHT;
        r6m.a.getClass();
        int a22 = r6m.a();
        BluetoothAdapter defaultAdapter22 = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter22 == null) {
        }
        e1j0.a.getClass();
        int i222 = e1j0.d;
        boolean l22 = r6m.l();
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
        }
        context = e43.a;
        if (context == null) {
        }
        String h22 = dy2.h(context, "unknown");
        ply plyVar22 = ply.a;
        Locale locale32 = hyi.a(Resources.getSystem().getConfiguration()).a.a.get(0);
        if (locale32 != null) {
        }
        Context context322 = r6m.e;
        Locale locale222 = (context322 != null ? context322 : null).getResources().getConfiguration().locale;
        return SchemeStat$TypeAppStarts.a(schemeStat$TypeAppStarts, null, null, null, null, null, null, null, null, null, null, null, null, String.valueOf(Build.VERSION.SDK_INT), language, locale222 != null ? locale222.getCountry() : "", Boolean.valueOf(z2), null, null, null, null, Boolean.valueOf(L022), null, null, systemTheme22, null, null, null, Integer.valueOf(a22), null, null, null, null, Boolean.valueOf(z3), Integer.valueOf(i222), null, null, null, null, null, null, Boolean.valueOf(l22), null, null, null, null, Boolean.valueOf(z4), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, h22, null, null, null, null, -1149747201, -1065001, 1015807);
    }
}
