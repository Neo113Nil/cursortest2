package com.yandex.go.beginners.presentation.services_info.views;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.bdc;
import defpackage.eja1;
import defpackage.up11;
import defpackage.uxq0;
import defpackage.xng0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000fR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/yandex/go/beginners/presentation/services_info/views/ServicesDescriptionsContainer;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "", "", "descriptions", "Luxq0;", "servicesCoordinator", "<init>", "(Landroid/content/Context;Ljava/util/List;Luxq0;)V", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Lru/yandex/taxi/widget/RobotoTextView;", "getDescriptionView", "(Ljava/lang/String;)Lru/yandex/taxi/widget/RobotoTextView;", "Luxq0;", "Landroid/view/View;", "getCurrentDescriptionView", "()Landroid/view/View;", "currentDescriptionView", "getNewDescriptionView", "newDescriptionView", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ServicesDescriptionsContainer extends FrameLayout {
    public static final int $stable = 8;
    private final uxq0 servicesCoordinator;

    public ServicesDescriptionsContainer(Context context, List<String> list, uxq0 uxq0Var) {
        super(context);
        this.servicesCoordinator = uxq0Var;
        Iterator it = a.q0(list).iterator();
        while (it.hasNext()) {
            addView(getDescriptionView((String) it.next()));
        }
    }

    private final RobotoTextView getDescriptionView(String description) {
        RobotoTextView robotoTextView = new RobotoTextView(getContext(), null, 0, 6, null);
        robotoTextView.setText(description);
        int[] iArr = up11.a;
        robotoTextView.setTypeface(eja1.w(5, 0));
        robotoTextView.setAlpha(0.0f);
        robotoTextView.setTextSize(1, 31.0f);
        robotoTextView.setTextColor(new bdc(xng0.controlMain));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388611;
        robotoTextView.setLayoutParams(layoutParams);
        return robotoTextView;
    }

    public View getCurrentDescriptionView() {
        return getChildAt(this.servicesCoordinator.a);
    }

    public View getNewDescriptionView() {
        return getChildAt(this.servicesCoordinator.a - 1);
    }
}
