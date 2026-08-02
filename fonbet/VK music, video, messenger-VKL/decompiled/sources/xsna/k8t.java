package xsna;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.dto.common.data.ApiApplication;
import com.vk.games.presentation.fragments.GameUnavailableFragment;

/* compiled from: Games.java */
/* loaded from: classes17.dex */
public final class k8t {
    public static void a(@NonNull Context context, @NonNull ApiApplication apiApplication, @NonNull String str) {
        if (apiApplication.zb().booleanValue()) {
            gau.c().b(context, apiApplication, apiApplication.G, str, apiApplication.B);
        } else {
            new GameUnavailableFragment.a(apiApplication).k(context);
        }
    }

    public static void b(@Nullable Context context, @Nullable String str) {
        gau.c().f(context, str);
    }
}
