package com.yandex.go.mainscreen.superapp.impl.foundation.presentation.flex;

import android.content.Context;
import android.content.res.ColorStateList;
import defpackage.dzg0;
import defpackage.kyh0;
import defpackage.opq;
import defpackage.xng0;
import kotlin.Metadata;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.design.utils.c;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/yandex/go/mainscreen/superapp/impl/foundation/presentation/flex/FeedScrollUpButton;", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "opq", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FeedScrollUpButton extends FloatButtonIconComponent {
    private static final float BUTTON_ELEVATION = 0.3f;
    private static final opq Companion = new opq();

    public FeedScrollUpButton(Context context) {
        super(context, null, 0, 0, 14, null);
        setElevation(0.3f);
        setContentDescription(context.getString(kyh0.order_details_with_feed_collapse_button_content_description_title));
        setIcon(dzg0.ic_scroll_up);
        getIcon().setImageTintList(ColorStateList.valueOf(c.c(xng0.textMain, getIcon())));
    }
}
