package com.yandex.go.taxi.order.info.ui;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.lbm;
import defpackage.mrg0;
import defpackage.n4h0;
import defpackage.nac;
import defpackage.nfv;
import defpackage.pav;
import defpackage.tje;
import defpackage.usg0;
import defpackage.yow;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/yandex/go/taxi/order/info/ui/ListDriverComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "url", "Lpav;", "imageLoader", "Lzy11;", "showPhoto", "(Ljava/lang/String;Lpav;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "imagePadding", CA20Status.STATUS_USER_I, "imageSize", "driverPlaceholder", "", "imageIsPlaceholder", "Z", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ListDriverComponent extends ListItemComponent {
    public static final int $stable = 8;
    private final int driverPlaceholder;
    private boolean imageIsPlaceholder;
    private final int imagePadding;
    private final int imageSize;

    public ListDriverComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.imagePadding = tje.r(mrg0.go_design_m_space, context);
        this.imageSize = context.getResources().getDimensionPixelSize(usg0.list_user_component_avatar_size);
        this.driverPlaceholder = n4h0.ic_driver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showPhoto$lambda$0(ListDriverComponent listDriverComponent) {
        listDriverComponent.setLeadImage(listDriverComponent.driverPlaceholder);
        listDriverComponent.imageIsPlaceholder = true;
        return zy11.a;
    }

    @Override // ru.yandex.taxi.design.ListItemComponent, ru.yandex.taxi.design.DividerAwareComponent, com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        if (this.imageIsPlaceholder) {
            setLeadImage(this.driverPlaceholder);
        }
    }

    public final void showPhoto(String url, pav imageLoader) {
        setLeadImage(this.driverPlaceholder);
        setLeadImageSize(this.imageSize);
        setLeadImagePadding(this.imagePadding);
        setMinimumHeight(this.imageSize);
        lbm a = imageLoader.a(getLeadImageView());
        int i = this.imageSize;
        nac nacVar = (nac) a;
        nacVar.f(i, i);
        nacVar.g(nfv.a);
        nacVar.i = new yow(16, this);
        nacVar.c(url);
    }

    public ListDriverComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ListDriverComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ListDriverComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
