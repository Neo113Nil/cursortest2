package com.yandex.messaging.ui.timeline;

import android.content.Context;
import android.util.AttributeSet;
import com.yandex.dsl.views.idepreview.UiPreView;
import defpackage.hbz0;
import defpackage.jum;
import defpackage.jxi;
import defpackage.ms11;
import defpackage.zj6;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@jxi
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/yandex/messaging/ui/timeline/Preview;", "Lcom/yandex/dsl/views/idepreview/UiPreView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final class Preview extends UiPreView {
    public Preview(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, new c(), 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ms11 _init_$lambda$8(Context context) {
        hbz0 hbz0Var = new hbz0(context, new zj6(context, 1));
        hbz0Var.y.a(new jum(new zj6(context, 2)));
        return hbz0Var;
    }

    public /* synthetic */ Preview(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
