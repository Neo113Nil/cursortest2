package com.yandex.mapkit.styling.transportnavigation;

import android.content.Context;
import defpackage.cvu0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¨\u0006\u0005"}, d2 = {"localizeLabel", "", "context", "Landroid/content/Context;", "indoorLevelName", "com.yandex.mapkit.styling.transportnavigation_internalRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DefaultRequestPointStyleProviderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String localizeLabel(Context context, String str) {
        return cvu0.v(context.getString(R.string.mapkit_styling_transport_indoor_request_point_text), "{}", str, false);
    }
}
