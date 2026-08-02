package com.yandex.go.shortcuts.impl.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.b;
import com.yandex.go.shortcuts.impl.view.MarketRatingView;
import defpackage.d6w;
import defpackage.ekh0;
import defpackage.i3y;
import defpackage.rp31;
import defpackage.scc;
import defpackage.sls;
import defpackage.u7h0;
import defpackage.y3h0;
import defpackage.y6i0;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010!\u001a\u0004\u0018\u00010\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001dR\u001d\u0010$\u001a\u0004\u0018\u00010\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001d¨\u0006%"}, d2 = {"Lcom/yandex/go/shortcuts/impl/view/MarketRatingView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "text", "Lzy11;", "setMetaText", "(Ljava/lang/CharSequence;)V", "setDetailsText", "setDetailsContentDescription", "", "ratingValue", "setRating", "(I)V", "Lru/yandex/taxi/widget/RobotoTextView;", "metaText", "Lru/yandex/taxi/widget/RobotoTextView;", "detailsText", "", "Landroid/widget/ImageView;", "stars", "Ljava/util/List;", "Landroid/graphics/drawable/Drawable;", "filledStar$delegate", "Li3y;", "getFilledStar", "()Landroid/graphics/drawable/Drawable;", "filledStar", "halfStar$delegate", "getHalfStar", "halfStar", "emptyStar$delegate", "getEmptyStar", "emptyStar", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MarketRatingView extends ConstraintLayout {
    private final RobotoTextView detailsText;

    /* renamed from: emptyStar$delegate, reason: from kotlin metadata */
    private final i3y emptyStar;

    /* renamed from: filledStar$delegate, reason: from kotlin metadata */
    private final i3y filledStar;

    /* renamed from: halfStar$delegate, reason: from kotlin metadata */
    private final i3y halfStar;
    private final RobotoTextView metaText;
    private final List<ImageView> stars;

    /* JADX WARN: Multi-variable type inference failed */
    public MarketRatingView(Context context) {
        super(context);
        final int i = 1;
        c.q(this, ekh0.market_rating_view, true);
        int i2 = u7h0.meta_text;
        WeakHashMap weakHashMap = b.a;
        this.metaText = (RobotoTextView) ((View) rp31.d(this, i2));
        this.detailsText = (RobotoTextView) ((View) rp31.d(this, u7h0.details_text));
        final int i3 = 0;
        final int i4 = 2;
        this.stars = scc.g((View) rp31.d(this, u7h0.star_one), (View) rp31.d(this, u7h0.star_two), (View) rp31.d(this, u7h0.star_three), (View) rp31.d(this, u7h0.star_four), (View) rp31.d(this, u7h0.star_five));
        this.filledStar = kotlin.a.a(new sls(this) { // from class: dx00
            public final /* synthetic */ MarketRatingView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                Drawable filledStar_delegate$lambda$0;
                Drawable halfStar_delegate$lambda$0;
                Drawable emptyStar_delegate$lambda$0;
                int i5 = i3;
                MarketRatingView marketRatingView = this.b;
                switch (i5) {
                    case 0:
                        filledStar_delegate$lambda$0 = MarketRatingView.filledStar_delegate$lambda$0(marketRatingView);
                        return filledStar_delegate$lambda$0;
                    case 1:
                        halfStar_delegate$lambda$0 = MarketRatingView.halfStar_delegate$lambda$0(marketRatingView);
                        return halfStar_delegate$lambda$0;
                    default:
                        emptyStar_delegate$lambda$0 = MarketRatingView.emptyStar_delegate$lambda$0(marketRatingView);
                        return emptyStar_delegate$lambda$0;
                }
            }
        });
        this.halfStar = kotlin.a.a(new sls(this) { // from class: dx00
            public final /* synthetic */ MarketRatingView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                Drawable filledStar_delegate$lambda$0;
                Drawable halfStar_delegate$lambda$0;
                Drawable emptyStar_delegate$lambda$0;
                int i5 = i;
                MarketRatingView marketRatingView = this.b;
                switch (i5) {
                    case 0:
                        filledStar_delegate$lambda$0 = MarketRatingView.filledStar_delegate$lambda$0(marketRatingView);
                        return filledStar_delegate$lambda$0;
                    case 1:
                        halfStar_delegate$lambda$0 = MarketRatingView.halfStar_delegate$lambda$0(marketRatingView);
                        return halfStar_delegate$lambda$0;
                    default:
                        emptyStar_delegate$lambda$0 = MarketRatingView.emptyStar_delegate$lambda$0(marketRatingView);
                        return emptyStar_delegate$lambda$0;
                }
            }
        });
        this.emptyStar = kotlin.a.a(new sls(this) { // from class: dx00
            public final /* synthetic */ MarketRatingView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                Drawable filledStar_delegate$lambda$0;
                Drawable halfStar_delegate$lambda$0;
                Drawable emptyStar_delegate$lambda$0;
                int i5 = i4;
                MarketRatingView marketRatingView = this.b;
                switch (i5) {
                    case 0:
                        filledStar_delegate$lambda$0 = MarketRatingView.filledStar_delegate$lambda$0(marketRatingView);
                        return filledStar_delegate$lambda$0;
                    case 1:
                        halfStar_delegate$lambda$0 = MarketRatingView.halfStar_delegate$lambda$0(marketRatingView);
                        return halfStar_delegate$lambda$0;
                    default:
                        emptyStar_delegate$lambda$0 = MarketRatingView.emptyStar_delegate$lambda$0(marketRatingView);
                        return emptyStar_delegate$lambda$0;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable emptyStar_delegate$lambda$0(MarketRatingView marketRatingView) {
        return c.k(y3h0.ic_rating_star_empty, marketRatingView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable filledStar_delegate$lambda$0(MarketRatingView marketRatingView) {
        return c.k(y3h0.ic_rating_star_full, marketRatingView);
    }

    private final Drawable getEmptyStar() {
        return (Drawable) this.emptyStar.getValue();
    }

    private final Drawable getFilledStar() {
        return (Drawable) this.filledStar.getValue();
    }

    private final Drawable getHalfStar() {
        return (Drawable) this.halfStar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable halfStar_delegate$lambda$0(MarketRatingView marketRatingView) {
        return c.k(y3h0.ic_rating_star_half, marketRatingView);
    }

    public final void setDetailsContentDescription(CharSequence text) {
        this.detailsText.setContentDescription(text);
    }

    public final void setDetailsText(CharSequence text) {
        this.detailsText.setVisibility(text == null || text.length() == 0 ? 8 : 0);
        this.detailsText.setText(text);
    }

    public final void setMetaText(CharSequence text) {
        this.metaText.setVisibility(text == null || text.length() == 0 ? 8 : 0);
        this.metaText.setText(text);
    }

    public final void setRating(int ratingValue) {
        int i = 0;
        int e = y6i0.e(ratingValue, new d6w(0, 10, 1));
        int i2 = e / 2;
        boolean z = e % 2 != 0;
        for (Object obj : this.stars) {
            int i3 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            ((ImageView) obj).setImageDrawable(i < i2 ? getFilledStar() : (i == i2 && z) ? getHalfStar() : getEmptyStar());
            i = i3;
        }
    }
}
