package com.yandex.fintechsdk.features.bdui.internal.presentation.customview.loader.snapshot;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import defpackage.czy;
import defpackage.r2t0;
import defpackage.yg5;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/loader/snapshot/SnapshotLoaderPlaceholderView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Lczy;", "params", "<init>", "(Landroid/content/Context;Lczy;)V", "Lyg5;", "expressionResolver", "Lzy11;", "applyExpressionResolver", "(Lyg5;)V", "Companion", "r2t0", "features-bdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SnapshotLoaderPlaceholderView extends View {
    private static final r2t0 Companion = new r2t0();
    private static final int PLACEHOLDER_COLOR = Color.parseColor("#8B00FF");

    public SnapshotLoaderPlaceholderView(Context context, czy czyVar) {
        super(context);
        setBackgroundColor(PLACEHOLDER_COLOR);
    }

    public final void applyExpressionResolver(yg5 expressionResolver) {
    }
}
