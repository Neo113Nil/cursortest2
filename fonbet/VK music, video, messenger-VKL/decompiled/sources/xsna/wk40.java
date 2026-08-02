package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import com.vk.dto.search.SearchStatsLoggingInfo;

/* compiled from: MusicFragmentLauncher.kt */
/* loaded from: classes.dex */
public interface wk40 {
    static /* synthetic */ void d(wk40 wk40Var, Context context, String str, String str2, String str3, SearchStatsLoggingInfo searchStatsLoggingInfo, int i) {
        if ((i & 8) != 0) {
            str3 = "";
        }
        String str4 = str3;
        if ((i & 16) != 0) {
            searchStatsLoggingInfo = null;
        }
        wk40Var.b(context, str, str2, str4, searchStatsLoggingInfo);
    }

    default void a(Context context, String str) {
    }

    default void c(Context context, Playlist playlist) {
    }

    default void e(Context context, UserId userId, String str) {
    }

    default void b(Context context, String str, String str2, String str3, SearchStatsLoggingInfo searchStatsLoggingInfo) {
    }

    default void f(Context context, UserId userId, String str, String str2, boolean z) {
    }
}
