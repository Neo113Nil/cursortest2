package com.yandex.go.safety.center.share.notification;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.view.b;
import com.yandex.go.safety.center.analytics.SafetyCenterAnalytics$ShareNotificationButtonType;
import com.yandex.go.safety.center.api.ShareRequestParam;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import com.yandex.go.safety.center.j;
import defpackage.ekr0;
import defpackage.gkr0;
import defpackage.hkr0;
import defpackage.i7h0;
import defpackage.ikr0;
import defpackage.irl0;
import defpackage.jkr0;
import defpackage.jl40;
import defpackage.jst;
import defpackage.kyh0;
import defpackage.mdh;
import defpackage.mmp0;
import defpackage.mxp0;
import defpackage.ntl0;
import defpackage.oyr;
import defpackage.ppl0;
import defpackage.pz40;
import defpackage.q3h0;
import defpackage.rp31;
import defpackage.sjh;
import defpackage.tj60;
import defpackage.tje;
import defpackage.tjh0;
import defpackage.tse0;
import defpackage.uyj;
import defpackage.vb3;
import defpackage.w511;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NotificationItemComponent;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00018B3\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00101\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00106\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00069"}, d2 = {"Lcom/yandex/go/safety/center/share/notification/ShareNotificationView;", "Lru/yandex/taxi/design/NotificationItemComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Lekr0;", "Landroid/content/Context;", "context", "Lhkr0;", "presenter", "Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment;", "experiment", "Lcom/yandex/go/safety/center/api/ShareRequestParam;", "requestParam", "Ltj60;", "notificationStackHolder", "<init>", "(Landroid/content/Context;Lhkr0;Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment;Lcom/yandex/go/safety/center/api/ShareRequestParam;Ltj60;)V", "", "durationSeconds", "Lzy11;", "animateProgress", "(I)V", "Landroid/animation/ValueAnimator;", "animator", "updateProgress", "(Landroid/animation/ValueAnimator;)V", "show", "()V", "onAttachNotification", "", "removedManually", "onDetachNotification", "(Z)V", "Lcom/yandex/go/safety/center/share/notification/ShareStatus;", ACSPConstants.STATUS, "setStatus", "(Lcom/yandex/go/safety/center/share/notification/ShareStatus;)V", "Lhkr0;", "Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment;", "Lcom/yandex/go/safety/center/api/ShareRequestParam;", "Ltj60;", "Landroid/widget/ProgressBar;", "progressBar", "Landroid/widget/ProgressBar;", "Landroid/widget/TextView;", "counterView", "Landroid/widget/TextView;", "Landroid/widget/ImageView;", "imageView", "Landroid/widget/ImageView;", "progressAnimator", "Landroid/animation/ValueAnimator;", "", "getNotificationId", "()Ljava/lang/String;", "notificationId", "Companion", "ikr0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ShareNotificationView extends NotificationItemComponent<ListItemComponent> implements ekr0 {
    public static final ikr0 Companion = new ikr0();
    private static final String NOTIFICATION_ID_PREFIX = "ShareNotificationView";
    private final TextView counterView;
    private final SafetyCenterExperiment experiment;
    private final ImageView imageView;
    private final tj60 notificationStackHolder;
    private final hkr0 presenter;
    private ValueAnimator progressAnimator;
    private final ProgressBar progressBar;
    private final ShareRequestParam requestParam;

    public ShareNotificationView(Context context, hkr0 hkr0Var, SafetyCenterExperiment safetyCenterExperiment, ShareRequestParam shareRequestParam, tj60 tj60Var) {
        super(context, null, 0, 6, null);
        this.presenter = hkr0Var;
        this.experiment = safetyCenterExperiment;
        this.requestParam = shareRequestParam;
        this.notificationStackHolder = tj60Var;
        ListItemComponent listItemComponent = new ListItemComponent(getContext(), null, 0, 6, null);
        listItemComponent.setBackgroundColor(0);
        listItemComponent.setLeadView(LayoutInflater.from(listItemComponent.getContext()).inflate(tjh0.safety_center_share_notification_icon, (ViewGroup) listItemComponent, false));
        listItemComponent.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        listItemComponent.setTrailContainerClickListener(new mmp0(12, this));
        setChild(listItemComponent);
        int i = i7h0.circle_progress;
        WeakHashMap weakHashMap = b.a;
        this.progressBar = (ProgressBar) ((View) rp31.d(this, i));
        this.counterView = (TextView) ((View) rp31.d(this, i7h0.counter));
        this.imageView = (ImageView) ((View) rp31.d(this, i7h0.share_result_icon));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ShareNotificationView shareNotificationView) {
        int i;
        hkr0 hkr0Var = shareNotificationView.presenter;
        com.yandex.go.safety.center.analytics.a aVar = hkr0Var.B;
        j jVar = hkr0Var.x;
        ShareRequestParam shareRequestParam = hkr0Var.y;
        ntl0 ntl0Var = (ntl0) jVar.y.get(shareRequestParam);
        if (ntl0Var == null) {
            return;
        }
        r0 r0Var = (r0) ntl0Var.b;
        int i2 = gkr0.a[((ShareStatus) r0Var.getValue()).ordinal()];
        if (i2 == 1) {
            ntl0Var.a.a(null);
            r0Var.l(ShareStatus.NONE);
            ShareRequestParam.NotificationType notificationType = shareRequestParam.a;
            ppl0 ppl0Var = aVar.a;
            i = notificationType != null ? irl0.a[notificationType.ordinal()] : -1;
            if (i == 1) {
                SafetyCenterAnalytics$ShareNotificationButtonType safetyCenterAnalytics$ShareNotificationButtonType = SafetyCenterAnalytics$ShareNotificationButtonType.Cancel;
                HashMap o = tse0.o(ppl0Var);
                o.put("button_type", safetyCenterAnalytics$ShareNotificationButtonType.getEventValue());
                ppl0Var.a.a("SafetyCenter.ShareTrustedContactsNotificationButton.Tapped", o, 1, new HashMap());
                return;
            }
            if (i != 2) {
                return;
            }
            SafetyCenterAnalytics$ShareNotificationButtonType safetyCenterAnalytics$ShareNotificationButtonType2 = SafetyCenterAnalytics$ShareNotificationButtonType.Cancel;
            HashMap o2 = tse0.o(ppl0Var);
            o2.put("button_type", safetyCenterAnalytics$ShareNotificationButtonType2.getEventValue());
            ppl0Var.a.a("SafetyCenter.ShareLocationNotificationButton.Tapped", o2, 1, new HashMap());
            return;
        }
        if (i2 != 2) {
            return;
        }
        jVar.o(shareRequestParam);
        hkr0Var.z.a(shareRequestParam);
        ShareRequestParam.NotificationType notificationType2 = shareRequestParam.a;
        ppl0 ppl0Var2 = aVar.a;
        i = notificationType2 != null ? irl0.a[notificationType2.ordinal()] : -1;
        if (i == 1) {
            SafetyCenterAnalytics$ShareNotificationButtonType safetyCenterAnalytics$ShareNotificationButtonType3 = SafetyCenterAnalytics$ShareNotificationButtonType.Repeat;
            HashMap o3 = tse0.o(ppl0Var2);
            o3.put("button_type", safetyCenterAnalytics$ShareNotificationButtonType3.getEventValue());
            ppl0Var2.a.a("SafetyCenter.ShareTrustedContactsNotificationButton.Tapped", o3, 1, new HashMap());
            return;
        }
        if (i != 2) {
            return;
        }
        SafetyCenterAnalytics$ShareNotificationButtonType safetyCenterAnalytics$ShareNotificationButtonType4 = SafetyCenterAnalytics$ShareNotificationButtonType.Repeat;
        HashMap o4 = tse0.o(ppl0Var2);
        o4.put("button_type", safetyCenterAnalytics$ShareNotificationButtonType4.getEventValue());
        ppl0Var2.a.a("SafetyCenter.ShareLocationNotificationButton.Tapped", o4, 1, new HashMap());
    }

    private final void animateProgress(int durationSeconds) {
        ValueAnimator valueAnimator = this.progressAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(durationSeconds, 0.0f);
        ofFloat.setDuration(durationSeconds * 1000);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new mxp0(7, this));
        ofFloat.start();
        this.progressAnimator = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateProgress(ValueAnimator animator) {
        float animatedFraction = animator.getAnimatedFraction();
        this.progressBar.setProgress((int) (r1.getMax() * animatedFraction));
        int ceil = (int) Math.ceil(((Float) animator.getAnimatedValue()).floatValue());
        if (jl40.l(String.valueOf(ceil), this.counterView.getText().toString())) {
            return;
        }
        this.counterView.setText(String.valueOf(ceil));
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    /* renamed from: getNotificationId */
    public String getId() {
        return oyr.i(this.requestParam.hashCode(), NOTIFICATION_ID_PREFIX);
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public void onAttachNotification() {
        super.onAttachNotification();
        hkr0 hkr0Var = this.presenter;
        hkr0Var.Bg(this);
        j jVar = hkr0Var.x;
        ntl0 ntl0Var = (ntl0) jVar.y.get(hkr0Var.y);
        if (ntl0Var == null) {
            jst.e.w(new IllegalStateException("shareSession not found"));
            return;
        }
        pz40 pz40Var = ntl0Var.b;
        hkr0Var.C.getClass();
        sjh sjhVar = uyj.a;
        tje.N(hkr0Var.Jg(), null, null, new ShareNotificationPresenter$attachView$$inlined$safeCollectIn$1(e.F(pz40Var, mdh.b), com.yandex.go.coroutines.b.e(), null, hkr0Var), 3);
        hkr0Var.A.b(hkr0Var, new vb3(13, hkr0Var));
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public void onDetachNotification(boolean removedManually) {
        super.onDetachNotification(removedManually);
        this.presenter.Cg();
        ValueAnimator valueAnimator = this.progressAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ekr0
    public void setStatus(ShareStatus status) {
        ListItemComponent listItemComponent = (ListItemComponent) getChild();
        boolean z = status == ShareStatus.SUCCESS || status == ShareStatus.ERROR;
        this.imageView.setVisibility(z ? 0 : 8);
        this.progressBar.setVisibility(!z ? 0 : 8);
        this.counterView.setVisibility(status == ShareStatus.PREPARING ? 0 : 8);
        if (status == ShareStatus.IN_PROGRESS) {
            listItemComponent.startProgressAnimation();
        } else {
            listItemComponent.stopProgressAnimation();
        }
        ShareRequestParam.NotificationType notificationType = this.requestParam.a;
        int i = jkr0.a[status.ordinal()];
        if (i == 1) {
            listItemComponent.setTrailCompanionText(kyh0.common_cancel);
            animateProgress(this.experiment.l);
            ShareRequestParam.NotificationType notificationType2 = ShareRequestParam.NotificationType.SHARE_LOCATION;
            SafetyCenterExperiment safetyCenterExperiment = this.experiment;
            if (notificationType == notificationType2) {
                listItemComponent.setTitle(safetyCenterExperiment.a(SafetyCenterExperiment.L10nKey.SHARE_SCREEN_SENDING_TITLE));
                return;
            } else {
                listItemComponent.setTitle(safetyCenterExperiment.a(SafetyCenterExperiment.L10nKey.TRUSTED_CONTACTS_NOTIFY_SENDING_TITLE));
                return;
            }
        }
        if (i == 2) {
            listItemComponent.setTrailCompanionText((CharSequence) null);
            ShareRequestParam.NotificationType notificationType3 = ShareRequestParam.NotificationType.SHARE_LOCATION;
            SafetyCenterExperiment safetyCenterExperiment2 = this.experiment;
            if (notificationType == notificationType3) {
                listItemComponent.setTitle(safetyCenterExperiment2.a(SafetyCenterExperiment.L10nKey.SHARE_SCREEN_SENDING_TITLE));
                return;
            } else {
                listItemComponent.setTitle(safetyCenterExperiment2.a(SafetyCenterExperiment.L10nKey.TRUSTED_CONTACTS_NOTIFY_SENDING_TITLE));
                return;
            }
        }
        if (i == 3) {
            this.imageView.setImageResource(q3h0.ic_success_share_route);
            listItemComponent.setTrailCompanionText((CharSequence) null);
            ShareRequestParam.NotificationType notificationType4 = ShareRequestParam.NotificationType.SHARE_LOCATION;
            SafetyCenterExperiment safetyCenterExperiment3 = this.experiment;
            if (notificationType == notificationType4) {
                listItemComponent.setTitle(safetyCenterExperiment3.a(SafetyCenterExperiment.L10nKey.SHARE_SCREEN_SENDING_SUCCESS));
                return;
            } else {
                listItemComponent.setTitle(safetyCenterExperiment3.a(SafetyCenterExperiment.L10nKey.TRUSTED_CONTACTS_NOTIFY_SENDING_SUCCESS));
                return;
            }
        }
        if (i != 4) {
            if (i == 5) {
                this.notificationStackHolder.c(getId());
                return;
            } else {
                w511.b();
                return;
            }
        }
        this.imageView.setImageResource(q3h0.ic_error_share_route);
        listItemComponent.setTrailCompanionText(kyh0.common_retry);
        ShareRequestParam.NotificationType notificationType5 = ShareRequestParam.NotificationType.SHARE_LOCATION;
        SafetyCenterExperiment safetyCenterExperiment4 = this.experiment;
        if (notificationType == notificationType5) {
            listItemComponent.setTitle(safetyCenterExperiment4.a(SafetyCenterExperiment.L10nKey.SHARE_SCREEN_SENDING_ERROR));
        } else {
            listItemComponent.setTitle(safetyCenterExperiment4.a(SafetyCenterExperiment.L10nKey.TRUSTED_CONTACTS_NOTIFY_SENDING_ERROR));
        }
    }

    public final void show() {
        if (this.notificationStackHolder.a(getId()) == null) {
            this.notificationStackHolder.e(this);
        }
    }
}
