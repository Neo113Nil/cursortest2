package xsna;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import com.vk.dto.music.Artist;
import com.vk.dto.music.Genre;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistOwner;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.R;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

/* compiled from: PlaylistFormatter.kt */
/* loaded from: classes3.dex */
public final class c9b0 {
    public static String a(int i, Context context, List list) {
        if (list != null && !list.isEmpty()) {
            LinkedList linkedList = new LinkedList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = ((Genre) it.next()).c;
                if (!TextUtils.isEmpty(str) && !j5g.P(linkedList, str)) {
                    if (str == null) {
                        str = "";
                    }
                    linkedList.add(str);
                    if (linkedList.size() >= 3) {
                        break;
                    }
                }
            }
            String join = TextUtils.join(", ", linkedList);
            boolean isEmpty = TextUtils.isEmpty(join);
            boolean z = i != 0;
            if (!isEmpty && z) {
                return context.getString(R.string.music_dot_delimiter, join, Integer.valueOf(i));
            }
            if (!isEmpty) {
                return join;
            }
            if (z) {
                return String.valueOf(i);
            }
        }
        return "";
    }

    public static String b(Context context, Float f) {
        return f == null ? "" : context.getString(R.string.music_recommended_playlist_percentage, Integer.valueOf((int) (f.floatValue() * 100)));
    }

    public static String c(Context context, String str) {
        return context.getString(R.string.music_recommended_playlist_percentage_title, str);
    }

    public static CharSequence d(Context context, Playlist playlist) {
        String str = playlist.i;
        boolean z = playlist.C;
        if (z) {
            str = go9.b("• ", str);
        }
        if (str == null || drm0.N(str)) {
            return "";
        }
        if (!z) {
            return str;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(e3m.f(R.attr.vk_ui_accent_blue, context)), 0, 1, 33);
        spannableString.setSpan(new AbsoluteSizeSpan(18, true), 0, 1, 33);
        Typeface a = cqi.a(Font.Companion, FontFamily.BOLD, 13.0f, context);
        TextSizeUnit textSizeUnit = TextSizeUnit.SP;
        spannableString.setSpan(new qup0(a), 0, 1, 33);
        spannableString.setSpan(new aqa(), 1, str.length(), 33);
        return spannableString;
    }

    public static final String e(Context context) {
        Calendar d = pvo0.d();
        return context.getString(R.string.music_playlist) + ' ' + String.format(Locale.getDefault(), "%02d.%02d.%d %02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(d.get(5)), Integer.valueOf(d.get(2) + 1), Integer.valueOf(d.get(1)), Integer.valueOf(d.get(11)), Integer.valueOf(d.get(12))}, 5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
    
        if (r0.equals("main_feat") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
    
        r0 = xsna.drm0.p0(xsna.s490.i(r1) + ' ' + xsna.s490.c(r5.s)).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003d, code lost:
    
        if (r0.equals("collection") == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String f(Playlist playlist) {
        String obj;
        boolean Eb = playlist.Eb();
        List<Artist> list = playlist.r;
        if (!Eb) {
            throw new IllegalArgumentException("Only albums allowed");
        }
        String str = playlist.e;
        int hashCode = str.hashCode();
        if (hashCode != -1741312354) {
            if (hashCode != -251444232) {
                if (hashCode == -251167118 && str.equals("main_only")) {
                    obj = s490.i(list);
                }
            }
            obj = "";
        }
        if (obj.length() != 0) {
            return obj;
        }
        String str2 = playlist.o;
        return str2 == null ? "" : str2;
    }

    public static String g(Context context, Playlist playlist) {
        if (playlist.Eb()) {
            return f(playlist);
        }
        if (o25.a().a(playlist.Bb(o25.a().c()).c)) {
            return context.getString(R.string.music_my_playlist);
        }
        PlaylistOwner playlistOwner = playlist.q;
        if (playlistOwner != null) {
            if (playlistOwner.b.b < 0) {
                return playlistOwner.c;
            }
            String str = playlistOwner.e;
            if (str != null) {
                return str;
            }
        }
        return "";
    }
}
