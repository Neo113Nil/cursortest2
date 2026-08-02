package com.yandex.passport.internal.ui.social.factory;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.google.ar.core.ImageMetadata;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.SocialConfiguration;
import com.yandex.passport.internal.social.NativeSocialHelper;
import com.yandex.passport.internal.ui.social.authenticators.f;
import defpackage.vg10;
import defpackage.w511;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class c {
    public final SocialConfiguration a;
    public final Context b;
    public final boolean c;
    public final ModernAccount d;

    public c(SocialConfiguration socialConfiguration, Context context, boolean z, ModernAccount modernAccount) {
        this.a = socialConfiguration;
        this.b = context;
        this.c = z;
        this.d = modernAccount;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f a() {
        Intent intent;
        boolean z = this.c;
        SocialConfiguration socialConfiguration = this.a;
        if (z) {
            ModernAccount modernAccount = this.d;
            String displayLogin = (modernAccount != null && modernAccount.getPrimaryAliasType() == 12) ? modernAccount.getDisplayLogin() : null;
            String str = (String) NativeSocialHelper.a.get(socialConfiguration.getId());
            if (str != null) {
                intent = new Intent(str);
                Context context = this.b;
                intent.setPackage(context.getPackageName());
                List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, ImageMetadata.EDGE_MODE);
                if (!queryIntentActivities.isEmpty()) {
                    ActivityInfo activityInfo = queryIntentActivities.get(0).activityInfo;
                    intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                    intent.putExtra("account-name", displayLogin);
                    if (intent != null) {
                        int i = b.a[socialConfiguration.getType().ordinal()];
                        if (i == 1) {
                            return f(intent);
                        }
                        if (i == 2) {
                            return d(intent);
                        }
                        vg10.s("Native auth for type ", socialConfiguration.getType(), " not supported");
                        return null;
                    }
                }
            }
            intent = null;
            if (intent != null) {
            }
        }
        int i2 = b.a[socialConfiguration.getType().ordinal()];
        if (i2 == 1) {
            return socialConfiguration.isBrowserRequired() ? c() : h();
        }
        if (i2 == 2) {
            return socialConfiguration.isBrowserRequired() ? b() : g();
        }
        if (i2 == 3) {
            return e();
        }
        w511.b();
        return null;
    }

    public abstract f b();

    public abstract f c();

    public abstract f d(Intent intent);

    public abstract f e();

    public abstract f f(Intent intent);

    public abstract f g();

    public abstract f h();
}
