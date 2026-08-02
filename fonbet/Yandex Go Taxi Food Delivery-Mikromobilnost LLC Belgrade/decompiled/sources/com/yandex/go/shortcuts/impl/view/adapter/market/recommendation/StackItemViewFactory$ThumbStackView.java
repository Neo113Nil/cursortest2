package com.yandex.go.shortcuts.impl.view.adapter.market.recommendation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import defpackage.i3y;
import defpackage.j2s0;
import defpackage.tje;
import defpackage.vyt0;
import defpackage.x5s0;
import defpackage.xw31;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.widget.PlaceholderView;
import ru.yandex.taxi.widget.RoundedCornersImageView;
import ru.yandex.taxi.widget.RoundedCornersSquareImageView;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"com/yandex/go/shortcuts/impl/view/adapter/market/recommendation/StackItemViewFactory$ThumbStackView", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Lvyt0;Landroid/content/Context;)V", "", "getAvailableShortcutWidth", "()I", "Lru/yandex/taxi/widget/RoundedCornersSquareImageView;", "createSquareImageView", "(Landroid/content/Context;)Lru/yandex/taxi/widget/RoundedCornersSquareImageView;", "Lzy11;", "clear", "()V", "Lj2s0;", "shortcutsGridCalculator", "Lj2s0;", "getShortcutsGridCalculator", "()Lj2s0;", "Lru/yandex/taxi/widget/RoundedCornersImageView;", "imageView", "Lru/yandex/taxi/widget/RoundedCornersImageView;", "getImageView", "()Lru/yandex/taxi/widget/RoundedCornersImageView;", "Lru/yandex/taxi/widget/PlaceholderView;", "placeholderView", "Lru/yandex/taxi/widget/PlaceholderView;", "getPlaceholderView", "()Lru/yandex/taxi/widget/PlaceholderView;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StackItemViewFactory$ThumbStackView extends FrameLayout {
    private final RoundedCornersImageView imageView;
    private final PlaceholderView placeholderView;
    private final j2s0 shortcutsGridCalculator;
    final /* synthetic */ vyt0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackItemViewFactory$ThumbStackView(vyt0 vyt0Var, Context context) {
        super(context);
        this.this$0 = vyt0Var;
        this.shortcutsGridCalculator = new j2s0(context);
        PlaceholderView placeholderView = new PlaceholderView(context, null, 0, 6, null);
        placeholderView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        placeholderView.updateGradientWidth(tje.u(88, placeholderView.getContext()));
        placeholderView.setRectCornerRadius(((Number) ((i3y) vyt0Var.c.a).getValue()).floatValue());
        this.placeholderView = placeholderView;
        int availableShortcutWidth = getAvailableShortcutWidth();
        setLayoutParams(new FrameLayout.LayoutParams(availableShortcutWidth, availableShortcutWidth));
        setClipChildren(false);
        RoundedCornersSquareImageView createSquareImageView = createSquareImageView(context);
        this.imageView = createSquareImageView;
        addView(createSquareImageView);
        addView(placeholderView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clear$lambda$0(ArrayList arrayList, View view) {
        if ((view instanceof RoundedCornersImageView) || (view instanceof PlaceholderView)) {
            return;
        }
        arrayList.add(view);
    }

    private final RoundedCornersSquareImageView createSquareImageView(Context context) {
        RoundedCornersSquareImageView roundedCornersSquareImageView = new RoundedCornersSquareImageView(context, null, 0, 6, null);
        vyt0 vyt0Var = this.this$0;
        xw31.G(((Number) ((i3y) vyt0Var.c.b).getValue()).intValue(), roundedCornersSquareImageView);
        roundedCornersSquareImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        roundedCornersSquareImageView.setAdjustViewBounds(true);
        roundedCornersSquareImageView.setCornerRadius(((Number) ((i3y) vyt0Var.c.a).getValue()).floatValue());
        return roundedCornersSquareImageView;
    }

    private final int getAvailableShortcutWidth() {
        long a = j2s0.a(this.shortcutsGridCalculator, 6);
        return (tje.t(getContext()).widthPixels - (((((int) (a >> 32)) / 2) + ((int) (a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) * 2)) / 2;
    }

    public final void clear() {
        this.imageView.setImageDrawable(null);
        this.placeholderView.setShimmering(false);
        this.placeholderView.setVisibility(8);
        ArrayList arrayList = new ArrayList();
        xw31.q(this, new x5s0(6, arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            removeViewInLayout((View) it.next());
        }
    }

    public final RoundedCornersImageView getImageView() {
        return this.imageView;
    }

    public final PlaceholderView getPlaceholderView() {
        return this.placeholderView;
    }

    public final j2s0 getShortcutsGridCalculator() {
        return this.shortcutsGridCalculator;
    }
}
