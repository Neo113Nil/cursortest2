package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.util.SparseArray;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.dto.messages.MsgIdType;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.im.engine.models.messages.Msg;
import com.vk.search.integration.followers.api.FollowersSearchState;
import com.vk.search.integration.followers.impl.presentation.SearchFollowersCatalogRootVh;
import com.vk.stickers.ContextUser;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;
import xsna.b7k0;
import xsna.dj30;
import xsna.jth0;
import xsna.lx9;
import xsna.mbo;
import xsna.rv9;
import xsna.vvh0;
import xsna.wk50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class apg implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ apg(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.izs
    public final Object invoke(final Object obj) {
        SparseArray<Msg> T;
        switch (this.b) {
            case 0:
                cpg cpgVar = (cpg) this.c;
                wk50.a aVar = (wk50.a) this.d;
                rv9.a.f fVar = (rv9.a.f) this.e;
                if (((Boolean) obj).booleanValue()) {
                    cpgVar.a.b(new lx9.l(new b7k0.b(tq.h(tlo0.Companion, R.string.ecomm_cart_on_subscribed))));
                } else {
                    cpgVar.c(aVar, fVar.b);
                }
                return s3q0.a;
            case 1:
                nbo nboVar = (nbo) this.c;
                izs izsVar = (izs) this.d;
                mbo mboVar = (mbo) this.e;
                ArrayList arrayList = nboVar.d;
                ((nvy) obj).e(arrayList.size(), null, new mbo.i(arrayList), kai.b(2039820996, new mbo.j(arrayList, izsVar, nboVar, mboVar)));
                return s3q0.a;
            case 2:
                MsgIdType msgIdType = (MsgIdType) this.c;
                Collection<Integer> collection = (Collection) this.d;
                dj30 dj30Var = (dj30) this.e;
                xgl0 xgl0Var = (xgl0) obj;
                int i = dj30.c.$EnumSwitchMapping$1[msgIdType.ordinal()];
                if (i == 1) {
                    T = xgl0Var.o().T(collection);
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    T = xgl0Var.o().I0(dj30Var.d.b, collection);
                }
                return new dj30.a(T, xgl0Var.system().d());
            case 3:
                ((dmh0) this.c).U(dmh0.V((kt0) this.d), (omh0) this.e);
                return s3q0.a;
            case 4:
                jth0 jth0Var = (jth0) this.c;
                fth0 fth0Var = (fth0) this.d;
                jth0.b bVar = (jth0.b) this.e;
                FollowersSearchState followersSearchState = (FollowersSearchState) obj;
                vvh0<SearchFollowersCatalogRootVh> vvh0Var = jth0Var.i;
                vvh0Var.a(vvh0.a.a(vvh0Var.d, false, followersSearchState == FollowersSearchState.ACTIVE_QUERY, 1));
                fth0Var.a(followersSearchState);
                VkSearchView vkSearchView = bVar.b;
                boolean z = followersSearchState != FollowersSearchState.INACTIVE;
                if (bVar.a && bVar.c != z) {
                    vkSearchView.f5(z);
                    bVar.c = z;
                }
                if (!z) {
                    mhy.d(vkSearchView);
                }
                return s3q0.a;
            case 5:
                Spanned spanned = (Spanned) this.c;
                final Layout layout = (Layout) this.d;
                final Rect rect = (Rect) this.e;
                final int spanStart = spanned.getSpanStart(obj);
                final int spanEnd = spanned.getSpanEnd(obj);
                final String obj2 = spanned.subSequence(spanStart, spanEnd).toString();
                final int lineForOffset = layout.getLineForOffset(spanStart);
                final int lineForOffset2 = layout.getLineForOffset(spanEnd);
                return new ulp0(new i5g(new k9x(lineForOffset, lineForOffset2, 1)), new izs() { // from class: xsna.qik0
                    @Override // xsna.izs
                    public final Object invoke(Object obj3) {
                        int intValue = ((Integer) obj3).intValue();
                        int i2 = lineForOffset;
                        Layout layout2 = layout;
                        int lineStart = intValue == i2 ? spanStart : layout2.getLineStart(intValue);
                        int lineEnd = intValue == lineForOffset2 ? spanEnd : layout2.getLineEnd(intValue) - 1;
                        layout2.getLineBounds(intValue, rect);
                        RectF rectF = new RectF();
                        rectF.left = layout2.getPrimaryHorizontal(lineStart) + r3.left;
                        rectF.right = layout2.getPrimaryHorizontal(lineEnd) + r3.left;
                        rectF.top = r3.top;
                        rectF.bottom = r3.bottom;
                        return new yhk0(obj, rectF, obj2);
                    }
                });
            default:
                StickerStockItem stickerStockItem = (StickerStockItem) this.c;
                l5n0 l5n0Var = (l5n0) this.d;
                n5n0 n5n0Var = (n5n0) this.e;
                stickerStockItem.O = "suggested_stickers_full";
                zal0 a = g2v.d().a();
                Context context = l5n0Var.itemView.getContext();
                ContextUser contextUser = n5n0Var.c;
                a.E(context, stickerStockItem, e43.m(contextUser != null ? contextUser.b : null), contextUser, true, null, new acc0(9));
                return s3q0.a;
        }
    }
}
