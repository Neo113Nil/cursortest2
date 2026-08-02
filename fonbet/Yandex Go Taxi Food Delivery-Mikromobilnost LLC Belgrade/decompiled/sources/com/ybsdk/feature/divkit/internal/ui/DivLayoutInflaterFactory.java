package com.ybsdk.feature.divkit.internal.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.yandex.div.core.Div2Context;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import defpackage.jl40;
import defpackage.qoi0;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\"\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/ui/DivLayoutInflaterFactory;", "Landroid/view/LayoutInflater$Factory2;", "divContext", "Lcom/yandex/div/core/Div2Context;", "<init>", "(Lcom/yandex/div/core/Div2Context;)V", "onCreateView", "Landroid/view/View;", "parent", "name", "", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "isYbDivView", "", "viewClassName", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DivLayoutInflaterFactory implements LayoutInflater.Factory2 {
    private final Div2Context divContext;

    public DivLayoutInflaterFactory(Div2Context div2Context) {
        this.divContext = div2Context;
    }

    private final boolean isYbDivView(String viewClassName) {
        return jl40.l(qoi0.a(YbDivView.class).c(), viewClassName) || jl40.l(qoi0.a(YbDivView.class).d(), viewClassName);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        if (!isYbDivView(name)) {
            return null;
        }
        return new YbDivView(this.divContext, attrs, 0, 4, null);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        return onCreateView(name, context, attrs);
    }
}
