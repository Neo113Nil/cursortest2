package xsna;

import com.vk.dto.newsfeed.entries.discover.VideoDiscoverGridItem;
import com.vk.feed.core.models.discover.DiscoverGridItem;
import com.vk.feed.core.models.discover.DiscoverMediaBlock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;

/* compiled from: DiscoverMediaBlockTransformer.kt */
/* loaded from: classes4.dex */
public final class w2n implements gn60<Pair<? extends DiscoverMediaBlock, ? extends List<? extends ol60>>, wm60> {
    public int b;
    public int c;

    public final List<ol60> a(int i, Pair<DiscoverMediaBlock, ? extends List<? extends ol60>> pair, wm60 wm60Var) {
        List<? extends ol60> list;
        boolean z;
        ArrayList<DiscoverGridItem> arrayList;
        int i2;
        int i3;
        DiscoverMediaBlock d = pair.d();
        List<? extends ol60> g = pair.g();
        ArrayList<DiscoverGridItem> arrayList2 = d.j;
        int i4 = d.k;
        int i5 = d.l;
        int size = arrayList2.size();
        int[] iArr = new int[size];
        boolean z2 = false;
        for (int i6 = 0; i6 < size; i6++) {
            iArr[i6] = -1;
        }
        int size2 = arrayList2.size();
        int[] iArr2 = new int[size2];
        for (int i7 = 0; i7 < size2; i7++) {
            iArr2[i7] = -1;
        }
        int size3 = arrayList2.size();
        int[] iArr3 = new int[size3];
        for (int i8 = 0; i8 < size3; i8++) {
            iArr3[i8] = -1;
        }
        int size4 = arrayList2.size();
        int[] iArr4 = new int[size4];
        for (int i9 = 0; i9 < size4; i9++) {
            iArr4[i9] = -1;
        }
        int i10 = i4 * i5;
        int[] iArr5 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr5[i11] = -1;
        }
        this.b = 0;
        this.c = 0;
        int size5 = arrayList2.size();
        int i12 = 0;
        int i13 = -1;
        loop5: while (true) {
            if (i12 >= size5) {
                list = g;
                z = z2;
                break;
            }
            DiscoverGridItem discoverGridItem = arrayList2.get(i12);
            int i14 = discoverGridItem.e;
            arrayList = arrayList2;
            int i15 = discoverGridItem.d;
            list = g;
            int i16 = this.c;
            int i17 = this.b;
            int i18 = 0;
            while (i18 < i15) {
                int i19 = i15;
                int i20 = discoverGridItem.e;
                int i21 = i18;
                for (int i22 = 0; i22 < i20; i22++) {
                    iArr5[((i16 + i21) * i5) + i17 + i22] = i12;
                }
                i18 = i21 + 1;
                i15 = i19;
            }
            iArr[i12] = this.c;
            iArr2[i12] = this.b;
            iArr3[i12] = i15;
            iArr4[i12] = i14;
            i2 = (i13 == -1 && (discoverGridItem instanceof VideoDiscoverGridItem) && ((VideoDiscoverGridItem) discoverGridItem).j.j) ? i12 : i13;
            do {
                int i23 = this.c;
                for (int i24 = this.b; i24 < i5; i24++) {
                    this.b = i24;
                    if (iArr5[(i23 * i5) + i24] < 0) {
                        break;
                    }
                }
                z = false;
                this.b = 0;
                i3 = this.c + 1;
                this.c = i3;
            } while (i3 < i4);
            i13 = i2;
            break loop5;
            i12++;
            i13 = i2;
            arrayList2 = arrayList;
            z2 = false;
            g = list;
        }
        return Collections.singletonList(new t2n(list, (d.Gb() || d.Fb()) ? true : z, d.k, d.l, iArr, iArr2, iArr3, iArr4, i13));
    }

    @Override // xsna.gn60
    public final /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return a(0, pair, bp5Var);
    }
}
