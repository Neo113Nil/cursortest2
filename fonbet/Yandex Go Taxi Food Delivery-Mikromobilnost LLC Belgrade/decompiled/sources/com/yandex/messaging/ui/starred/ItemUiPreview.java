package com.yandex.messaging.ui.starred;

import android.content.Context;
import android.util.AttributeSet;
import com.yandex.dsl.views.idepreview.UiPreView;
import defpackage.h0u0;
import defpackage.jxi;
import defpackage.ms11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@jxi
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/yandex/messaging/ui/starred/ItemUiPreview;", "Lcom/yandex/dsl/views/idepreview/UiPreView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final class ItemUiPreview extends UiPreView {
    public ItemUiPreview(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, new a(), 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ms11 _init_$lambda$1(Context context) {
        h0u0 h0u0Var = new h0u0(context);
        h0u0Var.x.setText("Some chat with very long name that doesn't fit");
        h0u0Var.y.setText("18:10");
        h0u0Var.z.setText("A long time ago, in a far far galaxy some guys from Yandex decided to build a messenger");
        return h0u0Var;
    }

    public /* synthetic */ ItemUiPreview(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
