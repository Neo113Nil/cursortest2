package com.yandex.go.beginners.presentation.services_info.views;

import android.content.Context;
import android.graphics.Typeface;
import androidx.appcompat.widget.LinearLayoutCompat;
import defpackage.al5;
import defpackage.ftg0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.uxq0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/yandex/go/beginners/presentation/services_info/views/ServicesInfoContainer;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Landroid/content/Context;", "context", "", "Lal5;", "services", "Landroid/graphics/Typeface;", "mainInfoTypeface", "Luxq0;", "servicesCoordinator", "<init>", "(Landroid/content/Context;Ljava/util/List;Landroid/graphics/Typeface;Luxq0;)V", "Lcom/yandex/go/beginners/presentation/services_info/views/ServicesMainInfoContainer;", "mainInfoContainer", "Lcom/yandex/go/beginners/presentation/services_info/views/ServicesMainInfoContainer;", "getMainInfoContainer", "()Lcom/yandex/go/beginners/presentation/services_info/views/ServicesMainInfoContainer;", "Lcom/yandex/go/beginners/presentation/services_info/views/ServicesDescriptionsContainer;", "descriptionsContainer", "Lcom/yandex/go/beginners/presentation/services_info/views/ServicesDescriptionsContainer;", "getDescriptionsContainer", "()Lcom/yandex/go/beginners/presentation/services_info/views/ServicesDescriptionsContainer;", "Lcom/yandex/go/beginners/presentation/services_info/views/ContainerWithShadowEnd;", "containerWithShadowEnd", "Lcom/yandex/go/beginners/presentation/services_info/views/ContainerWithShadowEnd;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ServicesInfoContainer extends LinearLayoutCompat {
    public static final int $stable = 8;
    private final ContainerWithShadowEnd containerWithShadowEnd;
    private final ServicesDescriptionsContainer descriptionsContainer;
    private final ServicesMainInfoContainer mainInfoContainer;

    public ServicesInfoContainer(Context context, List<al5> list, Typeface typeface, uxq0 uxq0Var) {
        super(context);
        setOrientation(1);
        setClipToPadding(false);
        setClipChildren(false);
        int r = tje.r(ftg0.text_padding, getContext());
        setPadding(r, 0, r, 0);
        ServicesMainInfoContainer servicesMainInfoContainer = new ServicesMainInfoContainer(context, list, typeface, uxq0Var);
        this.mainInfoContainer = servicesMainInfoContainer;
        ContainerWithShadowEnd containerWithShadowEnd = new ContainerWithShadowEnd(context, servicesMainInfoContainer);
        LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(-1, -2);
        layoutParams.setMarginEnd(-r);
        containerWithShadowEnd.setLayoutParams(layoutParams);
        this.containerWithShadowEnd = containerWithShadowEnd;
        addView(containerWithShadowEnd);
        List<al5> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((al5) it.next()).b);
        }
        ServicesDescriptionsContainer servicesDescriptionsContainer = new ServicesDescriptionsContainer(context, arrayList, uxq0Var);
        this.descriptionsContainer = servicesDescriptionsContainer;
        addView(servicesDescriptionsContainer);
    }

    public final ServicesDescriptionsContainer getDescriptionsContainer() {
        return this.descriptionsContainer;
    }

    public final ServicesMainInfoContainer getMainInfoContainer() {
        return this.mainInfoContainer;
    }
}
