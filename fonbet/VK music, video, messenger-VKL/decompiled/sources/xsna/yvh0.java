package xsna;

import com.vk.attachpicker.stickers.selection.searchmode.SearchMode;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stories.model.GifItem;
import com.vk.dto.stories.model.GifWithQueryData;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.b6l0;
import xsna.czt;

/* compiled from: SearchListBuilder.kt */
/* loaded from: classes15.dex */
public final class yvh0 {
    public final yvs a;
    public final yyt b;

    /* compiled from: SearchListBuilder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SearchMode.values().length];
            try {
                iArr[SearchMode.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchMode.GIF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public yvh0(gws gwsVar, czt cztVar, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
        this.a = new yvs(gwsVar, gzsVar);
        this.b = new yyt(cztVar, gzsVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final x820<Object> a(SearchMode searchMode) {
        List list;
        yvs yvsVar = this.a;
        gzs<s3q0> gzsVar = yvsVar.b;
        gws gwsVar = yvsVar.a;
        x820<Object> x820Var = new x820<>();
        int i = a.$EnumSwitchMapping$0[searchMode.ordinal()];
        if (i == 1) {
            GifWithQueryData gifWithQueryData = gwsVar.e;
            String str = gifWithQueryData.b;
            List<GifItem> list2 = gifWithQueryData.c;
            if (str.length() > 0) {
                if (gwsVar.f && list2.isEmpty()) {
                    vkc vkcVar = new vkc(R.string.story_gif_title, R.drawable.vk_icon_chevron_compact_right_24, null, true, gzsVar, gzsVar);
                    ArrayList arrayList = new ArrayList(6);
                    for (int i2 = 0; i2 < 6; i2++) {
                        arrayList.add(GifItem.e.getSTUB());
                    }
                    x820Var.b(vkcVar);
                    if (!ttp0.f(arrayList)) {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        x820Var.a(arrayList);
                    }
                } else if (!list2.isEmpty()) {
                    vkc vkcVar2 = new vkc(R.string.story_gif_title, R.drawable.vk_icon_chevron_compact_right_24, null, true, gzsVar, gzsVar);
                    List<Object> H0 = j5g.H0(list2, 6);
                    x820Var.b(vkcVar2);
                    if (!ttp0.f(H0)) {
                        H0 = null;
                    }
                    if (H0 != null) {
                        x820Var.a(H0);
                    }
                }
            }
            b6l0.a aVar = gwsVar.d;
            List<StickerItem> list3 = aVar != null ? aVar.b : null;
            List<StickerItem> list4 = list3;
            if (list4 != null && !list4.isEmpty()) {
                x820Var.b(new pzo0(R.string.story_stickers_title));
                if (list3 == null) {
                    list3 = null;
                }
                if (list3 != null) {
                    List<Object> R = j5g.R(list3);
                    if (!ttp0.f(R)) {
                        R = new ArrayList(R);
                    }
                    x820Var.a(R);
                }
            }
            b6l0.a aVar2 = gwsVar.d;
            List<StickerItem> list5 = aVar2 != null ? aVar2.c : null;
            boolean isEmpty = gwsVar.c.isEmpty();
            List<StickerItem> list6 = list5;
            if ((list6 != null && !list6.isEmpty()) || !isEmpty) {
                x820Var.b(new pzo0(R.string.story_stickers_title_promo));
                ArrayList arrayList2 = new ArrayList();
                if (list6 != null && !list6.isEmpty()) {
                    if (!ttp0.f(list5)) {
                        list5 = null;
                    }
                    if (list5 != null) {
                        arrayList2.addAll(list5);
                    }
                }
                if (!isEmpty) {
                    List list7 = gwsVar.c;
                    list = ttp0.f(list7) ? list7 : null;
                    if (list != null) {
                        arrayList2.addAll(list);
                    }
                }
                List<Object> R2 = j5g.R(arrayList2);
                if (!ttp0.f(R2)) {
                    R2 = new ArrayList(R2);
                }
                x820Var.a(R2);
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            yyt yytVar = this.b;
            czt cztVar = yytVar.a;
            czt.a aVar3 = cztVar.c;
            if (aVar3 == null || !aVar3.b) {
                if (cztVar.b.b.length() == 0) {
                    List<GifItem> list8 = cztVar.a;
                    if (!list8.isEmpty()) {
                        vkc vkcVar3 = new vkc(R.string.story_gif_recent, R.drawable.vk_icon_cancel_24, Integer.valueOf(R.string.story_gif_recent_icon_clear), false, yytVar.b, null);
                        List<Object> H02 = j5g.H0(list8, 6);
                        x820Var.b(vkcVar3);
                        if (!ttp0.f(H02)) {
                            H02 = null;
                        }
                        if (H02 != null) {
                            x820Var.a(H02);
                        }
                    }
                    List list9 = cztVar.b.c;
                    if (!list9.isEmpty()) {
                        x820Var.b(new pzo0(R.string.story_gif_popular));
                        list = ttp0.f(list9) ? list9 : null;
                        if (list != null) {
                            x820Var.a(list);
                            return x820Var;
                        }
                    }
                } else if (cztVar.b.b.length() > 0 && !cztVar.b.c.isEmpty()) {
                    List list10 = cztVar.b.c;
                    list = ttp0.f(list10) ? list10 : null;
                    if (list != null) {
                        x820Var.a(list);
                        return x820Var;
                    }
                }
            }
        }
        return x820Var;
    }
}
