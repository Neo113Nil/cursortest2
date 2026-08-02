package com.yandex.go.flex.common.ui;

import android.content.Context;
import android.view.View;
import defpackage.e230;
import defpackage.s1r;
import defpackage.t1w;
import defpackage.w130;
import defpackage.xng0;
import defpackage.ykr;
import defpackage.zy11;
import flex.engine.a;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/yandex/go/flex/common/ui/FlexFramingPopupModalView;", "Lcom/yandex/go/flex/common/ui/FlexPopupModalView;", "Landroid/content/Context;", "context", "Lflex/engine/a;", "engine", "Lykr;", "configuration", "<init>", "(Landroid/content/Context;Lflex/engine/a;Lykr;)V", "", "isApplyShadow", "()Z", "isArrowsPermanentlyHidden", "Le230;", "insetsType", "()Le230;", "", "getSlideableBackgroundAttrRes", "()I", "slideableBackgroundAttrRes", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FlexFramingPopupModalView extends FlexPopupModalView {
    public FlexFramingPopupModalView(Context context, a aVar, ykr ykrVar) {
        super(context, aVar, ykrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(FlexFramingPopupModalView flexFramingPopupModalView, t1w t1wVar) {
        View cardContentView = flexFramingPopupModalView.getCardContentView();
        flexFramingPopupModalView.setPadding(flexFramingPopupModalView.getPaddingLeft(), t1wVar.b, flexFramingPopupModalView.getPaddingRight(), flexFramingPopupModalView.getPaddingBottom());
        cardContentView.setPadding(cardContentView.getPaddingLeft(), cardContentView.getPaddingTop(), cardContentView.getPaddingRight(), t1wVar.g - t1wVar.d);
        return zy11.a;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getSlideableBackgroundAttrRes() {
        return xng0.bgTransparent;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new w130(1, new s1r(5, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isApplyShadow */
    public boolean getIsCollapsable() {
        return false;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isArrowsPermanentlyHidden */
    public boolean getRouteSummaryIsVisible() {
        return true;
    }
}
