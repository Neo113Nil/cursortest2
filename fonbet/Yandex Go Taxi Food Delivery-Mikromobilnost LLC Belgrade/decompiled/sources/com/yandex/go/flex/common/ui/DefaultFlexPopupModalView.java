package com.yandex.go.flex.common.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.c230;
import defpackage.e230;
import defpackage.ubh;
import defpackage.ykr;
import flex.engine.a;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001cB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u00060\u001cR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/yandex/go/flex/common/ui/DefaultFlexPopupModalView;", "Lcom/yandex/go/flex/common/ui/FlexPopupModalView;", "Landroid/content/Context;", "context", "Lflex/engine/a;", "engine", "Lykr;", "configuration", "<init>", "(Landroid/content/Context;Lflex/engine/a;Lykr;)V", "", "itemHeight", "Lzy11;", "calculateHeight", "(I)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Le230;", "insetsType", "()Le230;", "Lflex/engine/a;", "Lykr;", "itemsHeight", CA20Status.STATUS_USER_I, "Landroidx/recyclerview/widget/RecyclerView;", "recycler", "Landroidx/recyclerview/widget/RecyclerView;", "Lubh;", "tracker", "Lubh;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DefaultFlexPopupModalView extends FlexPopupModalView {
    private final ykr configuration;
    private final a engine;
    private int itemsHeight;
    private RecyclerView recycler;
    private final ubh tracker;

    public DefaultFlexPopupModalView(Context context, a aVar, ykr ykrVar) {
        super(context, aVar, ykrVar);
        this.engine = aVar;
        this.configuration = ykrVar;
        this.tracker = new ubh(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void calculateHeight(int itemHeight) {
        this.itemsHeight += itemHeight;
        int measuredHeight = getMeasuredHeight();
        if (measuredHeight > this.itemsHeight) {
            setBehaviorAnchorHeight(Integer.valueOf(itemHeight));
        } else {
            setBehaviorAnchorHeight(Integer.valueOf(measuredHeight));
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new c230(true);
    }

    @Override // com.yandex.go.flex.common.ui.FlexPopupModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.engine.c(this.tracker);
    }

    @Override // com.yandex.go.flex.common.ui.FlexPopupModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        RecyclerView recyclerView = this.recycler;
        if (recyclerView != null) {
            recyclerView.clearOnChildAttachStateChangeListeners();
        }
        this.recycler = null;
        this.engine.x(this.tracker);
        super.onDetachedFromWindow();
    }
}
