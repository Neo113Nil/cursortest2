package xsna;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.vk.api.generated.market.dto.MarketItemReviewCreateTypeHintConfigDto;
import com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BaseVideoAutoPlayHolder.java */
/* loaded from: classes4.dex */
public final class iq6 implements wfk0, izn {
    public final Object b;

    public /* synthetic */ iq6(Object obj) {
        this.b = obj;
    }

    public static ArrayList c(List list) {
        List<MarketItemReviewCreateTypeHintConfigDto> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (MarketItemReviewCreateTypeHintConfigDto marketItemReviewCreateTypeHintConfigDto : list2) {
            arrayList.add(new dak(marketItemReviewCreateTypeHintConfigDto.f(), marketItemReviewCreateTypeHintConfigDto.e(), marketItemReviewCreateTypeHintConfigDto.d(), marketItemReviewCreateTypeHintConfigDto.g()));
        }
        return arrayList;
    }

    @Override // xsna.wfk0
    public void a(dko dkoVar) {
        ImageView imageView;
        View view = ((BaseVideoAutoPlayHolder) this.b).Z;
        if (view == null || (imageView = (ImageView) view.findViewById(R.id.pds_overlay_circle_button_icon)) == null) {
            return;
        }
        imageView.setImageDrawable(dkoVar.a(view.getContext()));
    }

    @Override // xsna.wfk0
    public View b() {
        return ((BaseVideoAutoPlayHolder) this.b).Z;
    }

    public boolean d() {
        mb01 mb01Var = (mb01) this.b;
        if (!TextUtils.isEmpty(mb01Var.c)) {
            return false;
        }
        k901 k901Var = mb01Var.j;
        mb01.k(k901Var);
        return Log.isLoggable(k901Var.u(), 3);
    }

    @Override // xsna.izn
    public void e(yzs yzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1258540740);
        if ((i & 6) == 0) {
            i2 = (M.y(yzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1258540740, i2, -1, "com.vk.design.demo.presentation.screens.DonutUserStackContent.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<no name provided>.Content (DonutUserStackContent.kt:112)");
            }
            yzsVar.invoke(Integer.valueOf(((rg50) this.b).getIntValue()), M, Integer.valueOf((i2 << 3) & 112));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new h9c(this, yzsVar, i, 1);
        }
    }
}
