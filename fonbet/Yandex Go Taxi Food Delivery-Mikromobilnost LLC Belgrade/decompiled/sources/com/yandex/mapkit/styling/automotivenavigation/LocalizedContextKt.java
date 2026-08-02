package com.yandex.mapkit.styling.automotivenavigation;

import android.content.Context;
import android.content.res.Configuration;
import com.yandex.runtime.i18n.I18nManagerFactory;
import defpackage.evu0;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¨\u0006\u0003"}, d2 = {"localizedContext", "Landroid/content/Context;", "context", "com.yandex.mapkit.styling.automotivenavigation_internalRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LocalizedContextKt {
    public static final Context localizedContext(Context context) {
        List Y = evu0.Y(I18nManagerFactory.getLocale(), new char[]{'_'}, 0, 6);
        Locale locale = new Locale((String) Y.get(0), (String) Y.get(1));
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(locale);
        return context.createConfigurationContext(configuration);
    }
}
