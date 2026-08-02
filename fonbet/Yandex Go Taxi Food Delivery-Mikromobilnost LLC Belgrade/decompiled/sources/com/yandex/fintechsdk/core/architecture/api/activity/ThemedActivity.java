package com.yandex.fintechsdk.core.architecture.api.activity;

import android.content.Context;
import android.content.res.Configuration;
import androidx.appcompat.app.AppCompatActivity;
import com.yandex.fintechsdk.entities.theme.Theme;
import java.util.Locale;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/fintechsdk/core/architecture/api/activity/ThemedActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/content/Context;", "base", "applyLocaleOverride", "(Landroid/content/Context;)Landroid/content/Context;", "newBase", "Lzy11;", "attachBaseContext", "(Landroid/content/Context;)V", "context", "Lcom/yandex/fintechsdk/entities/theme/Theme;", "getThemeOverride", "(Landroid/content/Context;)Lcom/yandex/fintechsdk/entities/theme/Theme;", "Ljava/util/Locale;", "getLocaleOverride", "(Landroid/content/Context;)Ljava/util/Locale;", "api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public class ThemedActivity extends AppCompatActivity {
    private final Context applyLocaleOverride(Context base) {
        Locale localeOverride = getLocaleOverride(base);
        if (localeOverride == null) {
            return base;
        }
        Configuration configuration = new Configuration(base.getResources().getConfiguration());
        configuration.setLocale(localeOverride);
        return base.createConfigurationContext(configuration);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context newBase) {
        Theme themeOverride = getThemeOverride(newBase);
        if (themeOverride != null) {
            getDelegate().setLocalNightMode(themeOverride == Theme.NIGHT ? 2 : 1);
        }
        super.attachBaseContext(applyLocaleOverride(newBase));
    }

    public Locale getLocaleOverride(Context context) {
        return null;
    }

    public Theme getThemeOverride(Context context) {
        return null;
    }
}
