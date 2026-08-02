package com.yandex.go.fragment.router.external;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.bcs;
import kotlin.Metadata;
import ru.yandex.taxi.widget.ModalView;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/go/fragment/router/external/ExternalFragmentModalView;", "Lru/yandex/taxi/widget/ModalView;", "Lbcs;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "Landroid/view/ViewGroup;", "fragmentContainer", "()Landroid/view/ViewGroup;", "Landroid/widget/FrameLayout;", "_contentView", "Landroid/widget/FrameLayout;", "fragment"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class ExternalFragmentModalView extends ModalView implements bcs {
    private final FrameLayout _contentView;

    public ExternalFragmentModalView(Context context) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(View.generateViewId());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this._contentView = frameLayout;
        addView(frameLayout);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public final View getContent() {
        return this._contentView;
    }

    @Override // defpackage.bcs
    public final ViewGroup fragmentContainer() {
        return this._contentView;
    }
}
