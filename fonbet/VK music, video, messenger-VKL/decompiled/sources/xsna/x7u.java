package xsna;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.ComposeView;
import com.vk.api.generated.market.dto.MarketItemSkuReviewDto;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.model.communities.ReviewSourceType;
import com.vkontakte.android.R;

/* compiled from: GoodReviewItemComposeViewHolder.kt */
/* loaded from: classes18.dex */
public final class x7u extends vfz<u7u> {
    public final h780 l;
    public final gzs<s3q0> m;
    public final ComposeView n;
    public u7u o;
    public boolean p;
    public final v7u q;
    public final y7u r;

    /* compiled from: GoodReviewItemComposeViewHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MarketItemSkuReviewDto.SourceDto.values().length];
            try {
                iArr[MarketItemSkuReviewDto.SourceDto.VK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarketItemSkuReviewDto.SourceDto.OZON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [xsna.v7u] */
    public x7u(ViewGroup viewGroup, h780 h780Var, x4u x4uVar) {
        super(R.layout.good_review_item_compose_view_holder, viewGroup);
        this.l = h780Var;
        this.m = x4uVar;
        this.n = (ComposeView) this.itemView.findViewById(R.id.good_review_item_compose_view);
        this.q = new ViewTreeObserver.OnScrollChangedListener() { // from class: xsna.v7u
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                x7u x7uVar = x7u.this;
                if (x7uVar.getBindingAdapterPosition() <= 0 && !x7uVar.p) {
                    Rect rect = new Rect();
                    if (!x7uVar.itemView.getGlobalVisibleRect(rect) || rect.height() < x7uVar.itemView.getHeight()) {
                        return;
                    }
                    x7uVar.p = true;
                    x7uVar.m.invoke();
                }
            }
        };
        y7u y7uVar = new y7u(this);
        this.r = y7uVar;
        this.itemView.addOnAttachStateChangeListener(y7uVar);
    }

    @Override // xsna.vfz
    public final void W5(u7u u7uVar) {
        u7u u7uVar2 = u7uVar;
        this.o = u7uVar2;
        String str = "reviews_block_info_review_container_" + u7uVar2.b;
        ComposeView composeView = this.n;
        composeView.setTag(str);
        composeView.setContent(new jai(-502190345, new l71(this, 4), true));
    }

    @Override // xsna.vfz
    public final void a6() {
        this.itemView.removeOnAttachStateChangeListener(this.r);
    }

    public final void h6() {
        UserId userId;
        vhg0 vhg0Var;
        u7u u7uVar = this.o;
        if (u7uVar == null || (userId = u7uVar.d) == null || (vhg0Var = u7uVar.h) == null || !fkq0.c(userId) || vhg0Var.e != ReviewSourceType.Vk) {
            return;
        }
        this.l.a(userId);
    }
}
