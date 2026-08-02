package xsna;

import android.view.View;
import com.huawei.hms.hihealth.data.SampleSet;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLikesDto;
import com.vk.api.generated.market.dto.MarketCommunityReviewDto;
import com.vk.api.generated.market.dto.MarketReviewCommentDto;
import com.vk.api.generated.market.dto.MarketReviewCommentsDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.ecomm.reviews.model.communities.ReviewSourceType;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;

/* compiled from: ByteArrayBinaryResource.kt */
/* loaded from: classes12.dex */
public final class nt8 implements t27, cc80, g530, f600 {
    public final Object b;

    public /* synthetic */ nt8(Object obj) {
        this.b = obj;
    }

    @Override // xsna.g530
    public void H2() {
        kai0 kai0Var = (kai0) this.b;
        int i = 0;
        for (Object obj : kai0Var.h) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            hfz hfzVar = (hfz) obj;
            if ((hfzVar instanceof lei0) && ((lei0) hfzVar).b.d.a) {
                kai0Var.notifyItemChanged(i);
            }
            i = i2;
        }
    }

    @Override // xsna.f600
    public void a(n1l0 n1l0Var) {
        sal0 sal0Var = (sal0) this.b;
        sal0Var.d.a(true);
        y4l0 y4l0Var = sal0Var.g;
        if (y4l0Var != null) {
            y4l0Var.e(n1l0Var, null, false, "longtap");
        }
    }

    @Override // xsna.f600
    public void b() {
        ((sal0) this.b).d.a(true);
    }

    @Override // xsna.f600
    public void c(int i) {
        sal0 sal0Var = (sal0) this.b;
        sal0Var.d.a(true);
        y4l0 y4l0Var = sal0Var.g;
        if (y4l0Var != null) {
            y4l0Var.i(Integer.valueOf(i), null, "longtap");
        }
    }

    @Override // xsna.f600
    public void d(n1l0 n1l0Var) {
        sal0 sal0Var = (sal0) this.b;
        sal0Var.d.a(true);
        y4l0 y4l0Var = sal0Var.g;
        if (y4l0Var != null) {
            y4l0Var.n(n1l0Var);
        }
    }

    @Override // xsna.f600
    public void e(n1l0 n1l0Var) {
        if (n1l0Var instanceof StickerItem) {
            t6g0 t6g0Var = t6g0.b;
            StickerStockItem x = t6g0.d().x(((StickerItem) n1l0Var).b);
            if (x != null) {
                sal0 sal0Var = (sal0) this.b;
                y4l0 y4l0Var = sal0Var.g;
                if (y4l0Var != null) {
                    y4l0Var.a(x.b);
                }
                sal0Var.d.a(true);
            }
        }
    }

    @Override // xsna.t27
    public InputStream f() throws IOException {
        return new ByteArrayInputStream((byte[]) this.b);
    }

    public float g(View view, String str) {
        HashMap hashMap;
        float[] fArr;
        HashMap hashMap2 = (HashMap) this.b;
        if (hashMap2.containsKey(view) && (hashMap = (HashMap) hashMap2.get(view)) != null && hashMap.containsKey(str) && (fArr = (float[]) hashMap.get(str)) != null && fArr.length > 0) {
            return fArr[0];
        }
        return Float.NaN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v8, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.ArrayList] */
    public txh h(MarketCommunityReviewDto marketCommunityReviewDto, int i, boolean z, boolean z2, MapBuilder mapBuilder) {
        ?? r4;
        List<MarketReviewCommentDto> e;
        Integer d;
        List<List<BaseImageDto>> o = marketCommunityReviewDto.o();
        ArrayList arrayList = null;
        arrayList = null;
        if (o != null) {
            List<List<BaseImageDto>> list = o;
            r4 = new ArrayList(c5g.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                List<BaseImageDto> list2 = (List) it.next();
                ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                for (BaseImageDto baseImageDto : list2) {
                    arrayList2.add(new jxh(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.getId(), baseImageDto.d()));
                }
                r4.add(arrayList2);
            }
        } else {
            r4 = 0;
        }
        if (r4 == 0) {
            r4 = EmptyList.b;
        }
        List list3 = r4;
        int id = marketCommunityReviewDto.getId();
        big0 big0Var = (big0) mapBuilder.get(marketCommunityReviewDto.p().j());
        if (big0Var == null) {
            big0Var = tci.u(marketCommunityReviewDto.p());
        }
        big0 big0Var2 = big0Var;
        int j = marketCommunityReviewDto.j();
        String g = marketCommunityReviewDto.g();
        if (g == null) {
            g = "";
        }
        String str = g;
        int l = marketCommunityReviewDto.l();
        BaseLikesDto k = marketCommunityReviewDto.k();
        boolean z3 = (k != null ? k.e() : null) == BaseBoolIntDto.YES;
        BaseLikesDto k2 = marketCommunityReviewDto.k();
        int intValue = (k2 == null || (d = k2.d()) == null) ? 0 : d.intValue();
        Boolean d2 = marketCommunityReviewDto.d();
        boolean booleanValue = d2 != null ? d2.booleanValue() : false;
        Boolean f = marketCommunityReviewDto.f();
        boolean booleanValue2 = f != null ? f.booleanValue() : false;
        Boolean u = marketCommunityReviewDto.u();
        boolean booleanValue3 = u != null ? u.booleanValue() : false;
        MarketReviewCommentsDto i2 = marketCommunityReviewDto.i();
        int count = i2 != null ? i2.getCount() : 0;
        MarketReviewCommentsDto i3 = marketCommunityReviewDto.i();
        if (i3 != null && (e = i3.e()) != null) {
            List<MarketReviewCommentDto> list4 = e;
            arrayList = new ArrayList(c5g.u(list4, 10));
            for (MarketReviewCommentDto marketReviewCommentDto : list4) {
                arrayList.add(((iid) this.b).e(marketReviewCommentDto, marketCommunityReviewDto.getId(), (big0) mapBuilder.get(new UserId(marketReviewCommentDto.e())), z, true, z2));
                id = id;
            }
        }
        int i4 = id;
        List list5 = arrayList;
        if (arrayList == null) {
            list5 = EmptyList.b;
        }
        List list6 = list5;
        Integer n = marketCommunityReviewDto.n();
        ReviewSourceType reviewSourceType = ReviewSourceType.YClients;
        int h = reviewSourceType.h();
        if (n == null || n.intValue() != h) {
            reviewSourceType = ReviewSourceType.Vk;
        }
        ReviewSourceType reviewSourceType2 = reviewSourceType;
        Boolean e2 = marketCommunityReviewDto.e();
        boolean booleanValue4 = e2 != null ? e2.booleanValue() : false;
        Boolean Q = marketCommunityReviewDto.Q();
        return new txh(i4, l, j, big0Var2, str, intValue, z3, false, list3, false, booleanValue, booleanValue2, i, booleanValue3, z, count, list6, reviewSourceType2, Q != null ? Q.booleanValue() : false, booleanValue4, false);
    }

    @Override // xsna.cc80
    public void onSuccess(Object obj) {
        ((lq9) this.b).resumeWith((SampleSet) obj);
    }

    @Override // xsna.t27
    public long size() {
        return ((byte[]) this.b).length;
    }

    public nt8(int i) {
        switch (i) {
            case 8:
                this.b = new HashMap();
                break;
            default:
                this.b = new ArrayList();
                break;
        }
    }

    public nt8(tgl0 tgl0Var) {
        this.b = tgl0Var;
        new bpn0(new l9h(this, 14));
    }

    @Override // xsna.g530
    public void g3() {
    }
}
