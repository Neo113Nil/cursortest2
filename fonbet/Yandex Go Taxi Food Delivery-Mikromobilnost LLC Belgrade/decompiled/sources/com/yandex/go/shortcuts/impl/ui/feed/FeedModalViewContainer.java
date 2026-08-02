package com.yandex.go.shortcuts.impl.ui.feed;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.ekh0;
import defpackage.ny61;
import defpackage.zoq;
import kotlin.Metadata;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/go/shortcuts/impl/ui/feed/FeedModalViewContainer;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lzoq;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lzoq;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FeedModalViewContainer extends SlideableBindingModalView<zoq> {
    public FeedModalViewContainer(Context context) {
        super(context);
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
    }

    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public zoq bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(ekh0.feed_modal_view_container, parent, false);
        if (inflate != null) {
            return new zoq((FrameLayout) inflate);
        }
        ny61.t("rootView");
        return null;
    }
}
