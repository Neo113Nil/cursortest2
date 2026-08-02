package xsna;

import com.vk.music.playlist.display.domain.AlbumType;
import com.vk.music.ui.common.formatting.Duration;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;

/* compiled from: PlaylistMetadataFormatter.kt */
/* loaded from: classes3.dex */
public final class lbb0 {

    /* compiled from: PlaylistMetadataFormatter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AlbumType.values().length];
            try {
                iArr[AlbumType.ALBUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AlbumType.SINGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AlbumType.EP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AlbumType.COLLECTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static String a(int i, long j, androidx.compose.runtime.a aVar) {
        String str;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(480707421, i, -1, "com.vk.music.playlist.framework.presentation.PlaylistMetadataFormatter.formatDuration (PlaylistMetadataFormatter.kt:129)");
        }
        Duration duration = Duration.HOUR;
        long h = j / duration.h();
        if (h > 0) {
            aVar.K(1333979224);
            long h2 = (j - (duration.h() * h)) / Duration.MINUTE.h();
            str = d370.F(R.plurals.music_hours, (int) h, new Object[]{Long.valueOf(h)}, aVar, 0);
            if (h2 > 0) {
                aVar.K(1334213832);
                str = str + ' ' + d370.F(R.plurals.music_minutes, (int) h2, new Object[]{Long.valueOf(h2)}, aVar, 0);
                aVar.j();
            } else {
                aVar.K(-1896617432);
                aVar.j();
            }
            aVar.j();
        } else {
            aVar.K(1334439171);
            long h3 = j / Duration.MINUTE.h();
            if (h3 > 0) {
                aVar.K(1334523863);
                str = d370.F(R.plurals.music_minutes, (int) h3, new Object[]{Long.valueOf(h3)}, aVar, 0);
                aVar.j();
            } else if (j > 0) {
                aVar.K(1334655799);
                str = d370.F(R.plurals.music_seconds, (int) j, new Object[]{Long.valueOf(j)}, aVar, 0);
                aVar.j();
            } else {
                aVar.K(1334767521);
                aVar.j();
                str = "";
            }
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return str;
    }

    public static String b(int i, int i2, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(270086657, i2, -1, "com.vk.music.playlist.framework.presentation.PlaylistMetadataFormatter.formatListeningCountFull (PlaylistMetadataFormatter.kt:73)");
        }
        String F = d370.F(R.plurals.music_snippet_listenings, i <= 1000 ? i : 1000, new Object[]{xpm0.a(i)}, aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return F;
    }

    public static String c(int i, long j, androidx.compose.runtime.a aVar) {
        String F;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(661626555, i, -1, "com.vk.music.playlist.framework.presentation.PlaylistMetadataFormatter.formatUpdateTime (PlaylistMetadataFormatter.kt:82)");
        }
        if (j < 0) {
            aVar.K(911890819);
            aVar.j();
            F = "";
        } else if (Duration.MINUTE.a(j)) {
            F = zq.a(aVar, 167964947, R.string.music_snippet_uptime_now, aVar, 0);
        } else if (Duration.HOUR.a(j)) {
            aVar.K(912055276);
            int minutes = (int) TimeUnit.SECONDS.toMinutes(j);
            F = d370.F(R.plurals.music_snippet_uptime_minute, minutes, new Object[]{Integer.valueOf(minutes)}, aVar, 0);
            aVar.j();
        } else if (Duration.DAY.a(j)) {
            aVar.K(912289078);
            int hours = (int) TimeUnit.SECONDS.toHours(j);
            F = d370.F(R.plurals.music_snippet_uptime_hour, hours, new Object[]{Integer.valueOf(hours)}, aVar, 0);
            aVar.j();
        } else if (Duration.WEEK.a(j)) {
            aVar.K(912514107);
            int days = (int) TimeUnit.SECONDS.toDays(j);
            F = d370.F(R.plurals.music_snippet_uptime_day, days, new Object[]{Integer.valueOf(days)}, aVar, 0);
            aVar.j();
        } else if (Duration.MONTH.a(j)) {
            aVar.K(912735571);
            int days2 = ((int) TimeUnit.SECONDS.toDays(j)) / 7;
            F = d370.F(R.plurals.music_snippet_uptime_week, days2, new Object[]{Integer.valueOf(days2)}, aVar, 0);
            aVar.j();
        } else if (Duration.YEAR.a(j)) {
            aVar.K(912963886);
            int days3 = ((int) TimeUnit.SECONDS.toDays(j)) / 30;
            F = d370.F(R.plurals.music_snippet_uptime_month, days3, new Object[]{Integer.valueOf(days3)}, aVar, 0);
            aVar.j();
        } else {
            aVar.K(913168207);
            int days4 = ((int) TimeUnit.SECONDS.toDays(j)) / 365;
            F = d370.F(R.plurals.music_snippet_uptime_year, days4, new Object[]{Integer.valueOf(days4)}, aVar, 0);
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return F;
    }

    public static String d(String str, String str2, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1981209394, i, -1, "com.vk.music.playlist.framework.presentation.PlaylistMetadataFormatter.formatWithDelimiter (PlaylistMetadataFormatter.kt:56)");
        }
        if (str.length() == 0) {
            aVar.K(1271720541);
            aVar.j();
            str = str2;
        } else if (str2.length() == 0) {
            aVar.K(1271722108);
            aVar.j();
        } else {
            aVar.K(1271723228);
            str = d370.O(R.string.music_dot_delimiter, new Object[]{str, str2}, aVar);
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return str;
    }
}
