package xsna;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vkontakte.android.R;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public final class nqm0 {
    public final Resources a;
    public final String b;

    public nqm0(@NonNull Context context) {
        exc0.i(context);
        Resources resources = context.getResources();
        this.a = resources;
        this.b = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    @Nullable
    public final String a(@NonNull String str) {
        Resources resources = this.a;
        int identifier = resources.getIdentifier(str, "string", this.b);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }
}
