package com.yandex.passport.internal.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import com.yandex.passport.R;
import defpackage.dz2;
import defpackage.rq1;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class h {
    public final e a;
    public com.yandex.passport.legacy.lx.n b;

    public h(e eVar) {
        this.a = eVar;
    }

    public final void a(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: com.yandex.passport.internal.util.DebugUiUtil$1
            private static final long CLICKS_NEEDED = 10;
            private static final long CLICK_TIMEOUT = 500;
            private long lastTimestamp = 0;
            private short clicksCounted = 0;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - this.lastTimestamp < 500) {
                    short s = (short) (this.clicksCounted + 1);
                    this.clicksCounted = s;
                    if (s == 10) {
                        h.this.b(view2.getContext());
                        this.clicksCounted = (short) 0;
                    }
                } else {
                    this.clicksCounted = (short) 0;
                }
                this.lastTimestamp = elapsedRealtime;
            }
        });
    }

    public final void b(Context context) {
        AlertDialog.a aVar = new AlertDialog.a(context);
        aVar.i(R.string.passport_debug_information_title);
        aVar.a();
        e eVar = this.a;
        PackageManager packageManager = eVar.b;
        String str = eVar.a;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = 1;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            String str2 = packageManager.getPackageInfo(str, 8).versionName;
            float f = applicationInfo.metaData.getFloat("com.yandex.auth.VERSION", -1.0f);
            int i2 = applicationInfo.metaData.getInt("com.yandex.auth.INTERNAL_VERSION", -1);
            int i3 = applicationInfo.metaData.getInt("com.yandex.auth.INTERNAL_BUILD_NUMBER", -1);
            String valueOf = i3 == Integer.MAX_VALUE ? "local build" : String.valueOf(i3);
            byte[] bArr = com.yandex.passport.internal.entities.o.c;
            com.yandex.passport.internal.entities.o r = p.r(packageManager, str);
            if (i2 != -1) {
                f = i2;
            }
            SpannableString spannableString = new SpannableString(packageManager.getApplicationLabel(applicationInfo));
            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 17);
            SpannableString spannableString2 = new SpannableString(str);
            spannableString2.setSpan(new StyleSpan(2), 0, str.length(), 17);
            spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) "\n").append((CharSequence) spannableString2).append((CharSequence) "\n").append((CharSequence) String.format(Locale.US, "Version: %s (AM %.2f [%s])%nSignature: %s%n", str2, Float.valueOf(f / 100.0f), valueOf, r.c() ? "Yandex" : r.b() ? "Development" : "Unknown"));
        } catch (PackageManager.NameNotFoundException e) {
            com.yandex.passport.legacy.a.c("Package not found", e);
            spannableStringBuilder = spannableStringBuilder.append((CharSequence) "Something went very wrong here.");
        }
        rq1 rq1Var = aVar.a;
        rq1Var.f = spannableStringBuilder;
        rq1Var.o = new f();
        aVar.setPositiveButton(R.string.passport_thank_you_button, new dz2(9)).f(R.string.passport_debug_more_information, new com.yandex.passport.internal.ui.domik.base.a(i, this, context)).create().show();
    }
}
