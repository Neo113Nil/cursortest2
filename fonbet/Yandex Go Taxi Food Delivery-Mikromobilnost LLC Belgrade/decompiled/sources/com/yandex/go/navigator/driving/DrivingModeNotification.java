package com.yandex.go.navigator.driving;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import defpackage.bxl;
import defpackage.sls;
import defpackage.tje;
import defpackage.v2h0;
import defpackage.wd2;
import defpackage.xj60;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NotificationItemComponent;
import ru.yandex.taxi.design.NotificationTimedItemComponent;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0012\b\u0002\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J+\u0010%\u001a\u00020\u000f2\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030#2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u0013H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)J\u0019\u0010,\u001a\u00020\u00132\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000fH\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0011H\u0014¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0013H\u0016¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\u000f¢\u0006\u0004\b4\u0010/R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b6\u00107R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b8\u00107R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b9\u00107R\u001e\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010:R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010;R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010<R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010=\u001a\u0004\b>\u0010?R\u001d\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\u0012\n\u0004\b\u0018\u0010@\u0012\u0004\bC\u0010/\u001a\u0004\bA\u0010BR\u0016\u0010D\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010ER\u0016\u0010G\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010ER\u0016\u0010H\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010ER\u0016\u0010I\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010<R\u0018\u0010J\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006L"}, d2 = {"Lcom/yandex/go/navigator/driving/DrivingModeNotification;", "Lru/yandex/taxi/design/NotificationTimedItemComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "", "notificationId", "Landroid/graphics/drawable/Drawable;", "icon", "title", "subtitle", "", "Lru/yandex/taxi/design/ButtonComponent;", "buttonComponents", "Lkotlin/Function0;", "Lzy11;", "onClick", "", "duration", "", "isDismissible", "", "payload", "", "typeface", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lsls;JZLjava/lang/Object;I)V", "Landroid/view/View;", "view", "moveOutToLeft", "Landroid/animation/Animator$AnimatorListener;", "onEnd", "Landroid/animation/ValueAnimator;", "getItemOutOfScreenHorizontallyAnimator", "(Landroid/view/View;ZLandroid/animation/Animator$AnimatorListener;)Landroid/animation/ValueAnimator;", "Lru/yandex/taxi/design/NotificationItemComponent;", "moveOutToRight", "moveItemOutOfScreen", "(Lru/yandex/taxi/design/NotificationItemComponent;ZZ)V", "", "getScaledTouchSlop", "()F", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "startExpiresTimer", "()V", "provideDurationTime", "()J", "canBeDismissedBySwipe", "()Z", "cancelTimer", "Ljava/lang/String;", "getNotificationId", "()Ljava/lang/String;", "getTitle", "getSubtitle", "Lsls;", "J", "Z", "Ljava/lang/Object;", "getPayload", "()Ljava/lang/Object;", CA20Status.STATUS_USER_I, "getTypeface", "()I", "getTypeface$annotations", "startTouchY", "F", "startTouchX", "capturedViewStartY", "capturedViewStartX", "isDraggedHorizontally", "moveOutAnimator", "Landroid/animation/ValueAnimator;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DrivingModeNotification extends NotificationTimedItemComponent<ListItemComponent> {
    public static final int $stable = 8;
    private float capturedViewStartX;
    private float capturedViewStartY;
    private final long duration;
    private final boolean isDismissible;
    private boolean isDraggedHorizontally;
    private ValueAnimator moveOutAnimator;
    private final String notificationId;
    private final sls onClick;
    private final Object payload;
    private float startTouchX;
    private float startTouchY;
    private final String subtitle;
    private final String title;
    private final int typeface;

    public DrivingModeNotification(Context context, String str, Drawable drawable, String str2, String str3, List<? extends ButtonComponent> list, sls slsVar, long j, boolean z, Object obj, int i) {
        super(context, null, 0, 6, null);
        this.notificationId = str;
        this.title = str2;
        this.subtitle = str3;
        this.onClick = slsVar;
        this.duration = j;
        this.isDismissible = z;
        this.payload = obj;
        this.typeface = i;
        ListItemComponent listItemComponent = new ListItemComponent(context, null, 0, 6, null);
        listItemComponent.setClipChildren(false);
        listItemComponent.setTitle(str2);
        listItemComponent.setTitleTypeface(i);
        listItemComponent.setTitleColorAttr(xng0.textMain);
        listItemComponent.setSubtitle(str3);
        listItemComponent.setSubtitleColorAttr(xng0.textMinor);
        listItemComponent.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        if (drawable != null) {
            listItemComponent.setLeadImage(drawable);
        }
        ru.yandex.taxi.design.utils.c.D(tje.u(40, getContext()), tje.u(40, getContext()), listItemComponent.getLeadImageView());
        xw31.D(tje.u(8, getContext()), listItemComponent.getLeadImageView());
        if (list.size() == 1) {
            listItemComponent.setTrailView((View) kotlin.collections.a.R(list));
        } else {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            linearLayout.setOrientation(0);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linearLayout.addView((View) it.next());
            }
            listItemComponent.setTrailView(linearLayout);
        }
        ru.yandex.taxi.design.utils.c.z(new bxl(15, this), this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setBackgroundResource(v2h0.bg_driving_notification_background);
        setChild(listItemComponent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$2(DrivingModeNotification drivingModeNotification) {
        sls slsVar = drivingModeNotification.onClick;
        if (slsVar != null) {
        }
        return zy11.a;
    }

    private final ValueAnimator getItemOutOfScreenHorizontallyAnimator(View view, boolean moveOutToLeft, Animator.AnimatorListener onEnd) {
        ValueAnimator duration = ValueAnimator.ofFloat(getX(), moveOutToLeft ? -view.getWidth() : getWidth()).setDuration(300L);
        duration.setInterpolator(new FastOutLinearInInterpolator());
        duration.addListener(onEnd);
        duration.addUpdateListener(new wd2(view, 4));
        return duration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getItemOutOfScreenHorizontallyAnimator$lambda$0(View view, ValueAnimator valueAnimator) {
        view.setX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private final float getScaledTouchSlop() {
        return ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    public static /* synthetic */ void getTypeface$annotations() {
    }

    private final void moveItemOutOfScreen(NotificationItemComponent<?> view, boolean moveOutToLeft, boolean moveOutToRight) {
        AnimatorListenerAdapter animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: com.yandex.go.navigator.driving.DrivingModeNotification$moveItemOutOfScreen$onEnd$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ValueAnimator valueAnimator;
                xj60 internalExpiresListener;
                valueAnimator = DrivingModeNotification.this.moveOutAnimator;
                if (valueAnimator == animator) {
                    DrivingModeNotification.this.moveOutAnimator = null;
                }
                internalExpiresListener = DrivingModeNotification.this.getInternalExpiresListener();
                if (internalExpiresListener != null) {
                    internalExpiresListener.a();
                }
            }
        };
        if (moveOutToLeft || moveOutToRight) {
            this.moveOutAnimator = getItemOutOfScreenHorizontallyAnimator(view, moveOutToLeft, animatorListenerAdapter);
        }
        ValueAnimator valueAnimator = this.moveOutAnimator;
        if (valueAnimator == null || valueAnimator == null) {
            return;
        }
        valueAnimator.start();
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    /* renamed from: canBeDismissedBySwipe, reason: from getter */
    public boolean getIsDismissible() {
        return this.isDismissible;
    }

    public final void cancelTimer() {
        setExpiresListener(null);
        onExpires();
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public String getNotificationId() {
        return this.notificationId;
    }

    public final Object getPayload() {
        return this.payload;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getTypeface() {
        return this.typeface;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Integer valueOf = event != null ? Integer.valueOf(event.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.capturedViewStartX = getX();
            this.capturedViewStartY = getY();
            this.startTouchX = event.getRawX();
            this.startTouchY = event.getRawY();
        } else if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 3)) {
            boolean z = getX() + ((float) getWidth()) < (((float) getWidth()) * 2.0f) / 3.0f;
            boolean z2 = getX() > ((float) getWidth()) / 3.0f;
            if (getIsDismissible() && (z || z2)) {
                moveItemOutOfScreen(this, z, z2);
            } else if (this.isDraggedHorizontally) {
                setX(this.capturedViewStartX);
            }
            this.isDraggedHorizontally = false;
        } else if (valueOf != null && valueOf.intValue() == 2) {
            float rawX = event.getRawX() - this.startTouchX;
            float rawY = event.getRawY() - this.startTouchY;
            if (!this.isDraggedHorizontally) {
                double d = rawX;
                double d2 = rawY;
                if (Math.abs(d) > Math.abs(d2) && Math.abs(d) > getScaledTouchSlop()) {
                    this.isDraggedHorizontally = true;
                } else if (Math.abs(d2) > getScaledTouchSlop()) {
                    this.isDraggedHorizontally = false;
                }
            }
            if (this.isDraggedHorizontally) {
                setX(this.capturedViewStartX + rawX);
            }
        }
        return true;
    }

    @Override // ru.yandex.taxi.design.NotificationTimedItemComponent
    /* renamed from: provideDurationTime, reason: from getter */
    public long getDuration() {
        return this.duration;
    }

    @Override // ru.yandex.taxi.design.NotificationTimedItemComponent
    public void startExpiresTimer() {
        if (this.duration != -1) {
            super.startExpiresTimer();
        }
    }

    public /* synthetic */ DrivingModeNotification(Context context, String str, Drawable drawable, String str2, String str3, List list, sls slsVar, long j, boolean z, Object obj, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i2 & 4) != 0 ? null : drawable, str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? EmptyList.a : list, (i2 & 64) != 0 ? null : slsVar, (i2 & 128) != 0 ? 7000L : j, (i2 & 256) != 0 ? true : z, (i2 & 512) != 0 ? null : obj, (i2 & 1024) != 0 ? 0 : i);
    }
}
