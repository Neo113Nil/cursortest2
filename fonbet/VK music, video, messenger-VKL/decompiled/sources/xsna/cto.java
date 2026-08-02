package xsna;

import android.annotation.SuppressLint;
import androidx.compose.runtime.a;
import com.vk.dzenarticle.impl.domain.DzenArticle;
import com.vk.dzenarticle.impl.ui.entity.AdPosition;
import com.vk.dzenarticle.impl.ui.entity.DzenArticleState;
import com.vk.dzenarticle.impl.ui.entity.items.ArticleEmbedItem;
import com.vk.dzenarticle.impl.ui.entity.items.ArticleImageItem;
import com.vk.dzenarticle.impl.ui.entity.items.ArticleItem;
import com.vk.dzenarticle.impl.ui.entity.items.ArticleSpaceItem;
import com.vk.dzenarticle.impl.ui.entity.items.ArticleTextItem;
import com.vk.dzenarticle.impl.ui.entity.items.ArticleWebviewItem;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.cro;
import xsna.q8z;
import xsna.tlo0;
import xsna.us2;
import xsna.wso;

/* compiled from: DzenArticleViewStateMapper.kt */
/* loaded from: classes18.dex */
public final class cto implements izs<DzenArticleState, wso> {
    public final wi3 b;

    public cto(wi3 wi3Var) {
        this.b = wi3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (r2 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        r6 = r2.q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x005c, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0064, code lost:
    
        if (r2 != null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(ArrayList arrayList, xi0 xi0Var, AdPosition adPosition, Integer num) {
        Integer num2;
        kiw kiwVar;
        boolean z;
        l0n l0nVar;
        zu50 zu50Var = xi0Var.a;
        if (zu50Var == null) {
            return;
        }
        cw50 cw50Var = xi0Var.b;
        String str = null;
        if (num != null) {
            int intValue = num.intValue();
            if (j5g.b0(intValue, arrayList) instanceof tp3) {
                intValue += 2;
            } else if (j5g.b0(intValue - 1, arrayList) instanceof tp3) {
                intValue++;
            }
            num2 = Integer.valueOf(intValue);
        } else {
            num2 = null;
        }
        AdPosition adPosition2 = AdPosition.TOP;
        int i = adPosition == adPosition2 ? -3 : -4;
        fe0 fe0Var = xi0Var.c;
        String str2 = cw50Var != null ? cw50Var.g : null;
        String str3 = cw50Var != null ? cw50Var.i : null;
        String str4 = cw50Var != null ? cw50Var.o : null;
        String str5 = cw50Var != null ? cw50Var.l : null;
        if (adPosition != adPosition2) {
            if (cw50Var == null || (kiwVar = cw50Var.v) == null) {
            }
        }
        if (adPosition == AdPosition.MIDDLE) {
            if ((cw50Var != null ? cw50Var.v : null) != null) {
                z = true;
                String str6 = cw50Var == null ? cw50Var.h : null;
                if (cw50Var != null && (l0nVar = cw50Var.k) != null) {
                    str = l0nVar.c;
                }
                mm3 mm3Var = new mm3(i, zu50Var, fe0Var, str2, str3, str4, str5, kiwVar, z, str6, str, adPosition);
                if (num2 == null) {
                    arrayList.add(num2.intValue(), mm3Var);
                    return;
                } else {
                    arrayList.add(mm3Var);
                    return;
                }
            }
        }
        z = false;
        if (cw50Var == null) {
        }
        if (cw50Var != null) {
            str = l0nVar.c;
        }
        mm3 mm3Var2 = new mm3(i, zu50Var, fe0Var, str2, str3, str4, str5, kiwVar, z, str6, str, adPosition);
        if (num2 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x006b  */
    @SuppressLint({"ComposableNaming"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(final us2.b bVar, final String str, final int i, final int i2, boolean z, androidx.compose.runtime.a aVar, final int i3, final int i4) {
        boolean z2;
        int i5;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(-276559797);
        int i6 = (M.y(bVar) ? 4 : 2) | i3;
        if ((i3 & 48) == 0) {
            i6 |= M.J(str) ? 32 : 16;
        }
        int i7 = i6 | (M.o(i) ? 256 : 128) | (M.o(i2) ? 2048 : 1024);
        int i8 = i4 & 8;
        if (i8 != 0) {
            i7 |= 24576;
        } else if ((i3 & 24576) == 0) {
            z2 = z;
            i7 |= M.l(z2) ? 16384 : 8192;
            i5 = i7 | (!M.J(this) ? 131072 : 65536);
            if (M.t(i5 & 1, (74899 & i5) == 74898)) {
                M.h();
            } else {
                if (i8 != 0) {
                    z2 = true;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-276559797, i5, -1, "com.vk.dzenarticle.impl.ui.store.DzenArticleViewStateMapper.addLink (DzenArticleViewStateMapper.kt:210)");
                }
                boolean z3 = z2;
                tjo0 tjo0Var = new tjo0(new hik0(wlb0.h(M).getText().f, 0L, null, null, null, null, null, 0L, null, null, null, 0L, z3 ? pdo0.c : null, null, 61438), new hik0(wlb0.h(M).getText().f, 0L, null, null, null, null, null, 0L, null, null, null, l5g.c(14, wlb0.h(M).getBackground().b, 0.3f), null, null, 63486), new hik0(wlb0.h(M).getText().f, 0L, null, null, null, null, null, 0L, null, null, null, l5g.c(14, wlb0.h(M).getBackground().b, 0.3f), null, null, 63486), 4);
                boolean z4 = ((458752 & i5) == 131072) | ((i5 & 112) == 32);
                Object x = M.x();
                if (z4 || x == a.C0011a.a) {
                    x = new i9z() { // from class: xsna.zso
                        @Override // xsna.i9z
                        public final void a(q8z q8zVar) {
                            cto.this.b.invoke(new cro.g(str));
                        }
                    };
                    M.R(x);
                }
                bVar.b(new q8z.b(str, tjo0Var, (i9z) x), i, i2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                z2 = z3;
            }
            s = M.s();
            if (s == null) {
                final boolean z5 = z2;
                s.d = new wzs() { // from class: xsna.ato
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        cto.this.c(bVar, str, i, i2, z5, (androidx.compose.runtime.a) obj, ne7.I(i3 | 1), i4);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        z2 = z;
        i5 = i7 | (!M.J(this) ? 131072 : 65536);
        if (M.t(i5 & 1, (74899 & i5) == 74898)) {
        }
        s = M.s();
        if (s == null) {
        }
    }

    @SuppressLint({"ComposableNaming"})
    public final void d(final us2.b bVar, final ArticleTextItem articleTextItem, final int i, final int i2, androidx.compose.runtime.a aVar, final int i3) {
        long j;
        b6s b6sVar;
        androidx.compose.runtime.a M = aVar.M(-651061538);
        int i4 = i3 | (M.y(bVar) ? 4 : 2) | (M.J(articleTextItem) ? 32 : 16) | (M.o(i) ? 256 : 128) | (M.o(i2) ? 2048 : 1024);
        if (M.t(i4 & 1, (i4 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-651061538, i4, -1, "com.vk.dzenarticle.impl.ui.store.DzenArticleViewStateMapper.addStyledText (DzenArticleViewStateMapper.kt:239)");
            }
            Integer num = articleTextItem.d;
            if (num != null && num.intValue() == 1) {
                M.K(1395097286);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = wuv0Var.b.a.a.b;
                M.j();
            } else if (num != null && num.intValue() == 2) {
                M.K(1395100006);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = wuv0Var2.g.a.a.b;
                M.j();
            } else if (num != null && num.intValue() == 3) {
                M.K(1395102726);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var3 = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = wuv0Var3.l.a.a.b;
                M.j();
            } else {
                M.K(1395105190);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var4 = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = wuv0Var4.X.a.a.b;
                M.j();
            }
            long j2 = j;
            if (articleTextItem.f) {
                b6sVar = b6s.k;
            } else {
                Integer num2 = articleTextItem.d;
                b6sVar = (num2 != null && num2.intValue() == 2) ? b6s.j : b6s.h;
            }
            bVar.d(new hik0(0L, j2, b6sVar, new u5s(articleTextItem.e ? 1 : 0), null, null, null, 0L, null, null, null, 0L, articleTextItem.h ? pdo0.c : articleTextItem.g ? pdo0.d : null, null, 61425), i, i2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(bVar, articleTextItem, i, i2, i3) { // from class: xsna.yso
                public final /* synthetic */ us2.b c;
                public final /* synthetic */ ArticleTextItem d;
                public final /* synthetic */ int e;
                public final /* synthetic */ int f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(9);
                    cto.this.d(this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    @Override // xsna.izs
    public final wso invoke(DzenArticleState dzenArticleState) {
        tlo0.e eVar;
        DzenArticleState dzenArticleState2 = dzenArticleState;
        DzenArticle dzenArticle = dzenArticleState2.c;
        DzenArticleState.LoadingState loadingState = dzenArticleState2.e;
        if (loadingState == DzenArticleState.LoadingState.LOADING_INITIAL) {
            return wso.c.b;
        }
        if (loadingState == DzenArticleState.LoadingState.ERROR_INITIAL_LOAD || dzenArticle == null) {
            return wso.b.b;
        }
        boolean z = dzenArticleState2.h;
        ArrayList arrayList = new ArrayList();
        xi0 xi0Var = dzenArticleState2.f;
        if (xi0Var != null) {
            a(arrayList, xi0Var, AdPosition.TOP, null);
        }
        arrayList.add(new wp3(dzenArticle.d));
        Integer num = dzenArticle.h;
        if (num != null) {
            int intValue = num.intValue();
            tlo0.a aVar = tlo0.Companion;
            Object[] objArr = {Integer.valueOf(intValue)};
            aVar.getClass();
            eVar = tlo0.a.a(R.plurals.counter_views, intValue, objArr);
        } else {
            eVar = null;
        }
        arrayList.add(new up3(dzenArticle.f, eVar));
        int size = arrayList.size();
        vp3 vp3Var = null;
        for (ArticleItem articleItem : dzenArticle.i) {
            boolean z2 = articleItem instanceof ArticleTextItem;
            if (!z2 || brm0.B(((ArticleTextItem) articleItem).c, " \n \n", false)) {
                if (vp3Var != null) {
                    arrayList.add(vp3Var);
                }
                vp3Var = null;
            }
            if (z2) {
                ArticleTextItem articleTextItem = (ArticleTextItem) articleItem;
                Integer num2 = articleTextItem.d;
                if ((num2 != null ? num2.intValue() : 0) > 0) {
                    int i = articleTextItem.b;
                    String str = articleTextItem.c;
                    Integer num3 = articleTextItem.d;
                    arrayList.add(new qo3(i, str, num3 != null ? num3.intValue() : 0));
                }
            }
            if (z2) {
                ArticleTextItem articleTextItem2 = (ArticleTextItem) articleItem;
                vp3Var = new vp3(vp3Var != null ? vp3Var.a : articleTextItem2.b, new bto(vp3Var, articleTextItem2, this));
            } else if (articleItem instanceof ArticleSpaceItem) {
                ArticleSpaceItem articleSpaceItem = (ArticleSpaceItem) articleItem;
                yp3 yp3Var = (yp3) j5g.k0(arrayList);
                if (!(yp3Var instanceof tp3)) {
                    arrayList.add(new tp3(articleSpaceItem.b, articleSpaceItem.c));
                } else if (articleSpaceItem.c) {
                    g5g.J(arrayList);
                    arrayList.add(new tp3(((tp3) yp3Var).a, true));
                }
            } else if (articleItem instanceof ArticleImageItem) {
                ArticleImageItem articleImageItem = (ArticleImageItem) articleItem;
                int i2 = articleImageItem.b;
                String str2 = articleImageItem.c;
                String str3 = articleImageItem.d;
                arrayList.add(new po3(i2, str2, str3 != null ? drm0.p0(str3).toString() : null));
            } else if (articleItem instanceof ArticleWebviewItem) {
                ArticleWebviewItem articleWebviewItem = (ArticleWebviewItem) articleItem;
                arrayList.add(new eq3(articleWebviewItem.b, articleWebviewItem.d, articleWebviewItem.e));
            } else if (articleItem instanceof ArticleEmbedItem) {
                ArticleEmbedItem articleEmbedItem = (ArticleEmbedItem) articleItem;
                arrayList.add(new xn3(articleEmbedItem.b, new g06(3, articleEmbedItem, this)));
            }
        }
        if (vp3Var != null) {
            arrayList.add(vp3Var);
        }
        xi0 xi0Var2 = dzenArticleState2.g;
        if (xi0Var2 != null) {
            a(arrayList, xi0Var2, AdPosition.MIDDLE, Integer.valueOf(((arrayList.size() - size) / 2) + size));
        }
        return new wso.a(dzenArticle.j, dzenArticle.m, arrayList, z ? new x2(2, this, dzenArticle.e) : null);
    }
}
