package com.yandex.go.feed.global.div.custom.slide_to_confirm;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.b;
import com.yandex.div.core.view2.Div2View;
import defpackage.r3k0;
import defpackage.rvo;
import defpackage.sp31;
import defpackage.v3k;
import defpackage.vns0;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.SliderButtonView;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/go/feed/global/div/custom/slide_to_confirm/SlideToConfirmDivViewHolder;", "Landroid/widget/FrameLayout;", "Lcom/yandex/div/core/view2/Div2View;", "divView", "Lrvo;", "expressionResolver", "<init>", "(Lcom/yandex/div/core/view2/Div2View;Lrvo;)V", "Lvns0;", "resources", "Lzy11;", "bind", "(Lvns0;)V", "release", "()V", "Lcom/yandex/div/core/view2/Div2View;", "Lrvo;", "Lru/yandex/taxi/design/SliderButtonView;", "sliderView", "Lru/yandex/taxi/design/SliderButtonView;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SlideToConfirmDivViewHolder extends FrameLayout {
    private final Div2View divView;
    private final rvo expressionResolver;
    private final SliderButtonView sliderView;

    public SlideToConfirmDivViewHolder(Div2View div2View, rvo rvoVar) {
        super(div2View.getContext());
        this.divView = div2View;
        this.expressionResolver = rvoVar;
        SliderButtonView sliderButtonView = new SliderButtonView(getContext(), null, 0, 6, null);
        this.sliderView = sliderButtonView;
        addView(sliderButtonView);
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.go.feed.global.div.custom.slide_to_confirm.SlideToConfirmDivViewHolder$special$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    int paddingTop = view.getPaddingTop();
                    ViewGroup.LayoutParams layoutParams = SlideToConfirmDivViewHolder.this.sliderView.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    int i = paddingTop + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
                    int width = view.getWidth();
                    int height = view.getHeight() - view.getPaddingBottom();
                    ViewGroup.LayoutParams layoutParams2 = SlideToConfirmDivViewHolder.this.sliderView.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    List singletonList = Collections.singletonList(new Rect(0, i, width, height - (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0)));
                    WeakHashMap weakHashMap = b.a;
                    sp31.c(view, singletonList);
                }
            });
            return;
        }
        int paddingTop = getPaddingTop();
        ViewGroup.LayoutParams layoutParams = this.sliderView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i = paddingTop + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        int width = getWidth();
        int height = getHeight() - getPaddingBottom();
        ViewGroup.LayoutParams layoutParams2 = this.sliderView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        List singletonList = Collections.singletonList(new Rect(0, i, width, height - (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0)));
        WeakHashMap weakHashMap = b.a;
        sp31.c(this, singletonList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$0$0(SlideToConfirmDivViewHolder slideToConfirmDivViewHolder, v3k v3kVar, int i, long j) {
        Div2View.handleAction$default(slideToConfirmDivViewHolder.divView, v3kVar, null, slideToConfirmDivViewHolder.expressionResolver, 2, null);
    }

    public final void bind(vns0 resources) {
        SliderButtonView sliderButtonView = this.sliderView;
        v3k v3kVar = resources.a;
        sliderButtonView.setSlideFinishedListener(v3kVar != null ? new r3k0(10, this, v3kVar) : null);
        this.sliderView.setTitleIdle(resources.b);
        SliderButtonView sliderButtonView2 = this.sliderView;
        String str = resources.c;
        if (str == null) {
            str = "";
        }
        sliderButtonView2.setSubtitleIdle(str);
        this.sliderView.setTitleProgress(resources.d);
        String str2 = resources.e;
        if (str2 != null) {
            this.sliderView.setSubtitleProgress(str2);
        }
    }

    public final void release() {
        this.sliderView.setSlideFinishedListener(null);
    }
}
