package xsna;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.video.impl.movies.detail.poster.MoviePosterView$MoviePosterBlockState;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.video.CatalogMovieItem;
import com.vk.catalog2.common.dto.ui.UiBlockMovie;
import java.util.List;

/* compiled from: MoviePosterStateMapper.kt */
/* loaded from: classes.dex */
public final class me30 implements n8a<MoviePosterView$MoviePosterBlockState> {
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
    
        if (r4 == null) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.n8a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MoviePosterView$MoviePosterBlockState a(CatalogBlockVariant catalogBlockVariant, UIBlock uIBlock) {
        CatalogMovieItem Pb;
        String num;
        UiBlockMovie uiBlockMovie = uIBlock instanceof UiBlockMovie ? (UiBlockMovie) uIBlock : null;
        if (uiBlockMovie == null || (Pb = uiBlockMovie.Pb()) == null) {
            return null;
        }
        BlockId.CompositeId b = com.vk.catalog.mvi.block.a.b(Pb.Cb(), uIBlock.w());
        int Cb = Pb.Cb();
        String Db = Pb.Db();
        Float Bb = Pb.Bb();
        if (Bb == null) {
            Bb = Pb.Ab();
        }
        Float valueOf = Bb != null ? Float.valueOf(i35.k(Bb.floatValue(), 1)) : null;
        String name = Pb.getName();
        String[] strArr = new String[2];
        Integer Fb = Pb.Fb();
        if (Fb != null) {
            int intValue = Fb.intValue();
            StringBuilder sb = new StringBuilder();
            Integer Eb = Pb.Eb();
            sb.append(Eb != null ? Eb.toString() : null);
            sb.append((char) 8212);
            sb.append(intValue);
            num = sb.toString();
        }
        Integer Eb2 = Pb.Eb();
        num = Eb2 != null ? Eb2.toString() : null;
        strArr[0] = num;
        strArr[1] = j5g.a0(Pb.zb());
        List I = rl3.I(strArr);
        List list = I.isEmpty() ? null : I;
        return new MoviePosterView$MoviePosterBlockState(b, catalogBlockVariant, Cb, Db, valueOf, name, list != null ? j5g.g0(list, " · ", null, null, 0, null, 62) : null);
    }
}
