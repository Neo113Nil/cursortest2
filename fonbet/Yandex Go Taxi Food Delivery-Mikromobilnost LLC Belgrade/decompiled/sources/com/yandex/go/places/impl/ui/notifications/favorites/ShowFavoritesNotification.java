package com.yandex.go.places.impl.ui.notifications.favorites;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.b;
import defpackage.dug0;
import defpackage.dzg0;
import defpackage.e3h0;
import defpackage.evu0;
import defpackage.fcl0;
import defpackage.g18;
import defpackage.lbm;
import defpackage.lhc;
import defpackage.mrg0;
import defpackage.n7l0;
import defpackage.nac;
import defpackage.nfv;
import defpackage.ny61;
import defpackage.pav;
import defpackage.qje;
import defpackage.sls;
import defpackage.t6s0;
import defpackage.tje;
import defpackage.u6s0;
import defpackage.xng0;
import defpackage.zy11;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NotificationTimedItemComponent;
import ru.yandex.taxi.design.utils.c;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'BM\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/yandex/go/places/impl/ui/notifications/favorites/ShowFavoritesNotification;", "Lru/yandex/taxi/design/NotificationTimedItemComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "", "title", "buttonText", "imageUrl", "Lkotlin/Function0;", "Lzy11;", "onButtonClick", "onDismissClick", "<init>", "(Landroid/content/Context;Lpav;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lsls;Lsls;)V", "", "iconPadding", "strokeWidth", "Landroid/graphics/drawable/InsetDrawable;", "buildIconStrokeDrawable", "(Landroid/content/Context;II)Landroid/graphics/drawable/InsetDrawable;", "onClick", "Landroidx/appcompat/widget/AppCompatTextView;", "buildTrailButton", "(Landroid/content/Context;Ljava/lang/String;Lsls;)Landroidx/appcompat/widget/AppCompatTextView;", "onDetachedFromWindow", "()V", "", "provideDurationTime", "()J", "Lg18;", "imageCancellable", "Lg18;", "getNotificationId", "()Ljava/lang/String;", "notificationId", "Companion", "t6s0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ShowFavoritesNotification extends NotificationTimedItemComponent<ListItemComponent> {
    public static final int $stable = 8;
    public static final t6s0 Companion = new t6s0();
    public static final long DURATION_MS = 2000;
    private static final int ICON_STROKE_ALPHA = 26;
    public static final String NOTIFICATION_ID = "ShowFavoritesNotification";
    private g18 imageCancellable;

    public ShowFavoritesNotification(Context context, final pav pavVar, String str, String str2, final String str3, sls slsVar, sls slsVar2) {
        super(context, null, 0, 6, null);
        this.imageCancellable = g18.u1;
        setAccessibilityLiveRegion(1);
        setContentDescription(str + " " + str2);
        setBackgroundResource(e3h0.places_favorites_notification_background);
        final ListItemComponent listItemComponent = new ListItemComponent(context, null, 0, 6, null);
        int r = tje.r(mrg0.go_design_s_space, getContext());
        final int r2 = tje.r(dug0.places_favorites_notification_icon_size, getContext());
        int r3 = tje.r(dug0.places_favorites_notification_icon_stroke_width, getContext());
        listItemComponent.setTitle(str);
        listItemComponent.setLeadImageSize((r * 2) + r2);
        listItemComponent.setLeadImagePadding(r);
        listItemComponent.getLeadImageView().setBackground(buildIconStrokeDrawable(context, r, r3));
        listItemComponent.setTrailView(buildTrailButton(context, str2, slsVar));
        listItemComponent.setDebounceClickListener(new fcl0(19, slsVar2));
        if (evu0.J(str3)) {
            listItemComponent.clearLeadView();
        } else {
            WeakHashMap weakHashMap = b.a;
            if (listItemComponent.isAttachedToWindow()) {
                this.imageCancellable.cancel();
                nac nacVar = (nac) pavVar.a(listItemComponent.getLeadImageView());
                nacVar.f(r2, r2);
                nacVar.g(nfv.a);
                nacVar.i = new u6s0(0, listItemComponent);
                this.imageCancellable = nacVar.c(str3);
            } else {
                listItemComponent.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.go.places.impl.ui.notifications.favorites.ShowFavoritesNotification$_init_$lambda$0$$inlined$doOnAttach$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View view) {
                        listItemComponent.removeOnAttachStateChangeListener(this);
                        this.imageCancellable.cancel();
                        ShowFavoritesNotification showFavoritesNotification = this;
                        lbm a = pavVar.a(listItemComponent.getLeadImageView());
                        int i = r2;
                        nac nacVar2 = (nac) a;
                        nacVar2.f(i, i);
                        nacVar2.g(nfv.a);
                        nacVar2.i = new u6s0(0, listItemComponent);
                        showFavoritesNotification.imageCancellable = nacVar2.c(str3);
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View view) {
                    }
                });
            }
        }
        setChild(listItemComponent);
    }

    private final InsetDrawable buildIconStrokeDrawable(Context context, int iconPadding, int strokeWidth) {
        int f = lhc.f(qje.t(xng0.controlMinor, context), 26);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setStroke(strokeWidth, f);
        int i = iconPadding - strokeWidth;
        if (i < 0) {
            i = 0;
        }
        int i2 = i;
        return new InsetDrawable((Drawable) gradientDrawable, i2, i2, i2, i2);
    }

    private final AppCompatTextView buildTrailButton(Context context, String buttonText, sls onClick) {
        int r = tje.r(mrg0.go_design_m_space, context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(mrg0.go_design_s_space);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(mrg0.go_design_s_space);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setText(buttonText);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setGravity(17);
        appCompatTextView.setTextColor(qje.u(context.getTheme(), xng0.textMain));
        appCompatTextView.setTextSize(0, context.getResources().getDimensionPixelSize(mrg0.component_text_size_caption));
        appCompatTextView.setBackgroundResource(dzg0.bg_rounded_minor);
        appCompatTextView.setPadding(r, dimensionPixelSize, r, dimensionPixelSize);
        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 8388629));
        ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(dimensionPixelSize2);
        marginLayoutParams.setMarginEnd(dimensionPixelSize2);
        marginLayoutParams.topMargin = dimensionPixelSize2;
        marginLayoutParams.bottomMargin = dimensionPixelSize2;
        appCompatTextView.setLayoutParams(marginLayoutParams);
        c.z(new n7l0(7, onClick), appCompatTextView);
        return appCompatTextView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 buildTrailButton$lambda$0$1(sls slsVar) {
        slsVar.invoke();
        return zy11.a;
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    /* renamed from: getNotificationId */
    public String getId() {
        return NOTIFICATION_ID;
    }

    @Override // ru.yandex.taxi.design.NotificationTimedItemComponent, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.imageCancellable.cancel();
    }

    @Override // ru.yandex.taxi.design.NotificationTimedItemComponent
    /* renamed from: provideDurationTime */
    public long getDuration() {
        return 2000L;
    }
}
