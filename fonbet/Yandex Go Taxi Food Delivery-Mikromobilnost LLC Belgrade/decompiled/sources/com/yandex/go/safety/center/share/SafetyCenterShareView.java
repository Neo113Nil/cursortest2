package com.yandex.go.safety.center.share;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.b;
import com.yandex.go.safety.center.base.BaseSafetyCenterView;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import com.yandex.go.safety.center.share.SafetyCenterShareView;
import com.yandex.go.safety.center.share.notification.ShareStatus;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.ContactsFragment;
import defpackage.ajl0;
import defpackage.bgb0;
import defpackage.i7h0;
import defpackage.rp31;
import defpackage.swe0;
import defpackage.tjh0;
import defpackage.xtl0;
import defpackage.ytl0;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.widget.buttons.IconCircleButton;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00178TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/yandex/go/safety/center/share/SafetyCenterShareView;", "Lcom/yandex/go/safety/center/base/BaseSafetyCenterView;", "Lxtl0;", "Landroid/content/Context;", "context", "Lytl0;", "presenter", "Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment;", "experiment", "<init>", "(Landroid/content/Context;Lytl0;Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment;)V", "", "Lswe0;", ContactsFragment.WEBVIEW_NAME, "Lzy11;", "showContacts", "(Ljava/util/List;)V", "", "phone", "Lcom/yandex/go/safety/center/share/notification/ShareStatus;", ACSPConstants.STATUS, "setShareStatus", "(Ljava/lang/String;Lcom/yandex/go/safety/center/share/notification/ShareStatus;)V", "", "shareTimeout", "timeFromStart", "animateProgress", "(Ljava/lang/String;II)V", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "Lytl0;", "Lru/yandex/taxi/design/ToolbarComponent;", "toolbar", "Lru/yandex/taxi/design/ToolbarComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "title", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/view/ViewGroup;", "buttonsContainer", "Landroid/view/ViewGroup;", "Lru/yandex/taxi/widget/buttons/IconCircleButton;", "shareOther", "Lru/yandex/taxi/widget/buttons/IconCircleButton;", "getCardContentViewLayoutRes", "()I", "cardContentViewLayoutRes", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SafetyCenterShareView extends BaseSafetyCenterView implements xtl0 {
    private final ViewGroup buttonsContainer;
    private final ytl0 presenter;
    private final IconCircleButton shareOther;
    private final ListItemComponent title;
    private final ToolbarComponent toolbar;

    public SafetyCenterShareView(Context context, ytl0 ytl0Var, SafetyCenterExperiment safetyCenterExperiment) {
        super(context, ytl0Var);
        int i = i7h0.safety_center_toolbar;
        WeakHashMap weakHashMap = b.a;
        ToolbarComponent toolbarComponent = (ToolbarComponent) ((View) rp31.d(this, i));
        this.toolbar = toolbarComponent;
        ListItemComponent listItemComponent = (ListItemComponent) ((View) rp31.d(this, i7h0.safety_center_title));
        this.title = listItemComponent;
        this.buttonsContainer = (ViewGroup) ((View) rp31.d(this, i7h0.safety_center_buttons));
        IconCircleButton iconCircleButton = (IconCircleButton) ((View) rp31.d(this, i7h0.safety_center_share));
        this.shareOther = iconCircleButton;
        listItemComponent.setTitle(safetyCenterExperiment.a(SafetyCenterExperiment.L10nKey.SHARE_SCREEN_TITLE));
        iconCircleButton.setTitle(safetyCenterExperiment.a(SafetyCenterExperiment.L10nKey.SHARE_SCREEN_SEND_OTHER_LINK_TITLE));
        final int i2 = 0;
        toolbarComponent.setOnNavigationClickListener(new Runnable(this) { // from class: bul0
            public final /* synthetic */ SafetyCenterShareView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                SafetyCenterShareView safetyCenterShareView = this.b;
                switch (i3) {
                    case 0:
                        SafetyCenterShareView._init_$lambda$0(safetyCenterShareView);
                        break;
                    default:
                        SafetyCenterShareView._init_$lambda$1(safetyCenterShareView);
                        break;
                }
            }
        });
        final int i3 = 1;
        iconCircleButton.setDebounceClickListener(new Runnable(this) { // from class: bul0
            public final /* synthetic */ SafetyCenterShareView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i32 = i3;
                SafetyCenterShareView safetyCenterShareView = this.b;
                switch (i32) {
                    case 0:
                        SafetyCenterShareView._init_$lambda$0(safetyCenterShareView);
                        break;
                    default:
                        SafetyCenterShareView._init_$lambda$1(safetyCenterShareView);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(SafetyCenterShareView safetyCenterShareView) {
        safetyCenterShareView.getClass();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(SafetyCenterShareView safetyCenterShareView) {
        safetyCenterShareView.getClass();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showContacts$lambda$1(SafetyCenterShareView safetyCenterShareView, swe0 swe0Var) {
        safetyCenterShareView.getClass();
        String str = swe0Var.b;
        throw null;
    }

    public void animateProgress(String phone, int shareTimeout, int timeFromStart) {
        ((ShareContactCircleButton) this.buttonsContainer.findViewWithTag(phone)).animateProgress(shareTimeout, timeFromStart);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public View getContent() {
        int i = i7h0.root;
        WeakHashMap weakHashMap = b.a;
        return (View) rp31.d(this, i);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return tjh0.safety_center_share_view;
    }

    public void setShareStatus(String phone, ShareStatus status) {
        boolean z = status == ShareStatus.PREPARING || status == ShareStatus.IN_PROGRESS;
        ShareContactCircleButton shareContactCircleButton = (ShareContactCircleButton) this.buttonsContainer.findViewWithTag(phone);
        shareContactCircleButton.setEnabled(!z);
        shareContactCircleButton.setProgressVisible(z);
    }

    public void showContacts(List<swe0> contacts) {
        for (swe0 swe0Var : contacts) {
            String str = swe0Var.a;
            String str2 = swe0Var.b;
            if (str.length() == 0) {
                str = bgb0.e(str2);
            }
            ShareContactCircleButton shareContactCircleButton = new ShareContactCircleButton(getContext(), null, 0, 6, null);
            shareContactCircleButton.setTitle(str);
            shareContactCircleButton.setTag(str2);
            shareContactCircleButton.setDebounceClickListener(new ajl0(7, this, swe0Var));
            this.buttonsContainer.addView(shareContactCircleButton, r0.getChildCount() - 1);
        }
    }
}
