package xsna;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.video.impl.movies.detail.info.MovieInfoView$MovieInfoBlockState;
import com.vkontakte.android.R;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import xsna.ee30;
import xsna.mno0;

/* compiled from: MovieInfoViewStateMapper.kt */
/* loaded from: classes.dex */
public final class je30 implements s2a<MovieInfoView$MovieInfoBlockState, ee30> {
    public static ee30.a b(mno0 mno0Var, String str) {
        mno0.i e = str != null ? nno0.e(str) : null;
        if (e == null) {
            return null;
        }
        return new ee30.a(mno0Var, e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e5, code lost:
    
        if (r1.size() == 1) goto L95;
     */
    @Override // xsna.s2a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ee30 a(MovieInfoView$MovieInfoBlockState movieInfoView$MovieInfoBlockState) {
        String str;
        mno0.h hVar;
        String str2;
        MovieInfoView$MovieInfoBlockState movieInfoView$MovieInfoBlockState2 = movieInfoView$MovieInfoBlockState;
        List<String> list = movieInfoView$MovieInfoBlockState2.n;
        List<String> list2 = movieInfoView$MovieInfoBlockState2.m;
        List<String> list3 = movieInfoView$MovieInfoBlockState2.l;
        List<String> list4 = movieInfoView$MovieInfoBlockState2.i;
        List<String> list5 = movieInfoView$MovieInfoBlockState2.e;
        boolean z = movieInfoView$MovieInfoBlockState2.o;
        BlockId blockId = movieInfoView$MovieInfoBlockState2.b;
        List<String> list6 = movieInfoView$MovieInfoBlockState2.d;
        ee30.a b = b(mno0.b.c(R.plurals.movie_info_genres, (list6 == null || list6.size() != 1) ? 2 : 1), list6 != null ? j5g.g0(list6, null, null, null, 0, null, 63) : null);
        ee30.a b2 = b(mno0.b.c(R.plurals.movie_info_countries, (list5 == null || list5.size() != 1) ? 2 : 1), list5 != null ? j5g.g0(list5, null, null, null, 0, null, 63) : null);
        mno0.g b3 = nno0.b(R.string.movie_info_release_year);
        Integer num = movieInfoView$MovieInfoBlockState2.f;
        if (num != null) {
            int intValue = num.intValue();
            if (z) {
                str = String.valueOf(intValue);
            } else {
                Integer num2 = movieInfoView$MovieInfoBlockState2.g;
                if (num2 == null || (str2 = num2.toString()) == null) {
                    str2 = "...";
                }
                str = intValue + (char) 8212 + str2;
            }
        } else {
            str = null;
        }
        ee30.a b4 = b(b3, str);
        mno0.g b5 = z ? nno0.b(R.string.movie_info_duration) : nno0.b(R.string.movie_info_episode_duration);
        Integer num3 = movieInfoView$MovieInfoBlockState2.h;
        if (num3 != null) {
            int intValue2 = num3.intValue();
            int i = intValue2 / 60;
            int i2 = intValue2 % 60;
            hVar = i > 0 ? nno0.c(R.string.movie_duration, e43.l(Integer.valueOf(i), Integer.valueOf(i2))) : nno0.c(R.string.movie_duration_minutes, Collections.singletonList(Integer.valueOf(i2)));
        } else {
            hVar = null;
        }
        ee30.a aVar = hVar == null ? null : new ee30.a(b5, hVar);
        ee30.a b6 = b(mno0.b.c(R.plurals.movie_info_directors, (list4 == null || list4.size() != 1) ? 2 : 1), list4 != null ? j5g.g0(list4, null, null, null, 0, null, 63) : null);
        mno0.g b7 = nno0.b(R.string.movie_info_premiere_world);
        String str3 = movieInfoView$MovieInfoBlockState2.j;
        if (str3 != null) {
            try {
                str3 = new SimpleDateFormat("d MMMM yyyy", Locale.getDefault()).format(new SimpleDateFormat("yyyy-MM-dd", Locale.US).parse(str3));
            } catch (Exception unused) {
            }
        } else {
            str3 = null;
        }
        ee30.a b8 = b(b7, str3);
        mno0.g b9 = nno0.b(R.string.movie_info_premiere_ru);
        String str4 = movieInfoView$MovieInfoBlockState2.k;
        if (str4 != null) {
            try {
                str4 = new SimpleDateFormat("d MMMM yyyy", Locale.getDefault()).format(new SimpleDateFormat("yyyy-MM-dd", Locale.US).parse(str4));
            } catch (Exception unused2) {
            }
        } else {
            str4 = null;
        }
        ee30.a b10 = b(b9, str4);
        ee30.a b11 = b(mno0.b.c(R.plurals.movie_info_screen_writers, (list3 == null || list3.size() != 1) ? 2 : 1), list3 != null ? j5g.g0(list3, null, null, null, 0, null, 63) : null);
        ee30.a b12 = b(mno0.b.c(R.plurals.movie_info_composers, (list2 == null || list2.size() != 1) ? 2 : 1), list2 != null ? j5g.g0(list2, null, null, null, 0, null, 63) : null);
        int i3 = list != null ? 1 : 2;
        return new ee30(blockId, nno0.b(z ? R.string.movie_info_movie_header : R.string.movie_info_series_header), rl3.I(new ee30.a[]{b, b2, b4, aVar, b6, b8, b10, b11, b12, b(mno0.b.c(R.plurals.movie_info_operators, i3), list != null ? j5g.g0(list, null, null, null, 0, null, 63) : null)}), movieInfoView$MovieInfoBlockState2.p, movieInfoView$MovieInfoBlockState2.q);
    }
}
