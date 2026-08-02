package com.yandex.go.ar.sample.impl;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import ru.yandex.taxi.widget.ModalView;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/yandex/go/ar/sample/impl/ArSample;", "Lru/yandex/taxi/widget/ModalView;", "context", "Landroid/content/Context;", "dynamicFeature", "Lcom/yandex/go/ar/sample/impl/ArSampleDynamicApi;", "<init>", "(Landroid/content/Context;Lcom/yandex/go/ar/sample/impl/ArSampleDynamicApi;)V", "contentView", "Landroid/view/View;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ArSample extends ModalView {
    private final ArSampleDynamicApi dynamicFeature;

    public ArSample(Context context, ArSampleDynamicApi arSampleDynamicApi) {
        super(context);
        this.dynamicFeature = arSampleDynamicApi;
        addView(getContent(), new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public View getContent() {
        ArSampleDynamicApi arSampleDynamicApi = this.dynamicFeature;
        getContext();
        return arSampleDynamicApi.f();
    }
}
