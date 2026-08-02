package xsna;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.video.impl.movies.detail.header.entities.MovieHeaderBlockState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.mno0;

/* compiled from: MovieHeaderViewStateMapper.kt */
/* loaded from: classes.dex */
public final class zd30 implements s2a<MovieHeaderBlockState, yd30> {
    public static mno0 b(zd30 zd30Var, List list, mno0.i iVar, int i) {
        if ((i & 1) != 0) {
            iVar = nno0.e(", ");
        }
        mno0 a = mno0.b.a();
        mno0.d a2 = mno0.b.a();
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            mno0 mno0Var = (mno0) it.next();
            i2++;
            if (i2 > 1) {
                a = a.b(iVar);
            }
            a = a.b(mno0Var);
        }
        return a.b(a2);
    }

    @Override // xsna.s2a
    public final yd30 a(MovieHeaderBlockState movieHeaderBlockState) {
        String g0;
        String num;
        MovieHeaderBlockState movieHeaderBlockState2 = movieHeaderBlockState;
        BlockId blockId = movieHeaderBlockState2.b;
        mno0.i e = nno0.e(movieHeaderBlockState2.d);
        String str = movieHeaderBlockState2.e;
        Integer num2 = movieHeaderBlockState2.i;
        Integer num3 = movieHeaderBlockState2.j;
        mno0.i e2 = str != null ? nno0.e(str) : null;
        Integer num4 = movieHeaderBlockState2.f;
        List x = rdi.x(rl3.I(new mno0[]{e2, (num4 == null || (num = num4.toString()) == null) ? null : nno0.e(num)}));
        mno0 b = x != null ? b(this, x, null, 63) : null;
        List<String> list = movieHeaderBlockState2.g;
        mno0.i e3 = (list == null || (g0 = j5g.g0(list, null, null, null, 0, null, 63)) == null) ? null : nno0.e(g0);
        List<String> list2 = movieHeaderBlockState2.h;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(mno0.b.e((String) it.next()));
        }
        String str2 = movieHeaderBlockState2.k;
        mno0.i e4 = str2 != null ? nno0.e(str2) : null;
        rmk0 rmk0Var = new rmk0(2);
        rmk0Var.b(arrayList.toArray(new mno0[0]));
        Object a = num3 != null ? nno0.a(R.plurals.movie_seasons_count, num3.intValue(), Collections.singletonList(num3)) : null;
        if (a == null) {
            a = num2 != null ? nno0.c(R.string.movie_duration, e43.l(Integer.valueOf(num2.intValue() / 60), Integer.valueOf(num2.intValue() % 60))) : null;
        }
        rmk0Var.a(a);
        ArrayList<Object> arrayList2 = rmk0Var.a;
        List x2 = rdi.x(rl3.I(arrayList2.toArray(new mno0[arrayList2.size()])));
        List x3 = rdi.x(rl3.I(new mno0[]{x2 != null ? b(this, x2, null, 63) : null, e4}));
        return new yd30(blockId, e, b(this, rl3.I(new mno0[]{b, e3, x3 != null ? b(this, x3, nno0.e(", "), 62) : null}), nno0.e("  ·  "), 62));
    }
}
