package com.ybsdk.screens.notice.presentation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.widgets.common.YbButtonView;
import defpackage.cma1;
import defpackage.ei8;
import defpackage.i961;
import defpackage.jah0;
import defpackage.kp50;
import defpackage.ny61;
import defpackage.qmh0;
import defpackage.r8j0;
import defpackage.s8j0;
import defpackage.sls;
import defpackage.t8j0;
import defpackage.u8j0;
import defpackage.v4b1;
import defpackage.w511;
import defpackage.xbg0;
import defpackage.yxz0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.ui.debug.internal.providers.SessionColorProviderImpl;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/screens/notice/presentation/TopupNoticeContentDeprecatedView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lu8j0;", "Lyxz0;", "Lcom/ybsdk/screens/notice/presentation/TopupNoticeDeprecatedViewState;", ClidProvider.STATE, "Lzy11;", "render", "(Lu8j0;)V", "Lkotlin/Function0;", "action", "onPrimaryButtonClick", "(Lsls;)V", "Li961;", "binding", "Li961;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TopupNoticeContentDeprecatedView extends ConstraintLayout {
    private final i961 binding;

    public TopupNoticeContentDeprecatedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(qmh0.ybsdk_topup_notice_content_deprecated, this);
        int i2 = jah0.topupNoticeDescription;
        TextView textView = (TextView) cma1.O(i2, this);
        if (textView != null) {
            i2 = jah0.topupNoticeError;
            FrameLayout frameLayout = (FrameLayout) cma1.O(i2, this);
            if (frameLayout != null) {
                i2 = jah0.topupNoticeImage;
                AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, this);
                if (appCompatImageView != null) {
                    i2 = jah0.topupNoticeLoading;
                    FrameLayout frameLayout2 = (FrameLayout) cma1.O(i2, this);
                    if (frameLayout2 != null) {
                        i2 = jah0.topupNoticePrimaryActionButton;
                        YbButtonView ybButtonView = (YbButtonView) cma1.O(i2, this);
                        if (ybButtonView != null) {
                            i2 = jah0.topupNoticeTitle;
                            TextView textView2 = (TextView) cma1.O(i2, this);
                            if (textView2 != null) {
                                i961 i961Var = new i961(this, textView, frameLayout, appCompatImageView, frameLayout2, ybButtonView, textView2);
                                setLayoutParams(new ConstraintLayout.LayoutParams(-1, kp50.r(SessionColorProviderImpl.SHORT_SESSION_MAX_STALLED_LENGTH_MS_YELLOW_BOUND)));
                                this.binding = i961Var;
                                return;
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final YbButtonView.a render$lambda$2$lambda$1(u8j0 u8j0Var, YbButtonView.a aVar) {
        return new YbButtonView.a(((yxz0) ((r8j0) u8j0Var).a).d, null, null, null, null, null, null, false, false, null, 4094);
    }

    public final void onPrimaryButtonClick(sls action) {
        ((YbButtonView) this.binding.c.findViewById(jah0.topupNoticeErrorButton)).setOnClickListener(new xbg0(12, action));
        this.binding.f.setOnClickListener(new xbg0(13, action));
    }

    public final void render(u8j0 state) {
        i961 i961Var = this.binding;
        i961Var.e.setVisibility(8);
        FrameLayout frameLayout = i961Var.c;
        frameLayout.setVisibility(8);
        if (!(state instanceof r8j0)) {
            if (state instanceof s8j0) {
                frameLayout.setVisibility(0);
                return;
            } else if (state instanceof t8j0) {
                i961Var.e.setVisibility(0);
                return;
            } else {
                w511.b();
                return;
            }
        }
        TextView textView = i961Var.g;
        yxz0 yxz0Var = (yxz0) ((r8j0) state).a;
        textView.setText(d.a(getContext(), yxz0Var.b));
        i961Var.b.setText(d.a(getContext(), yxz0Var.c));
        v4b1.k(yxz0Var.a, i961Var.d, null, null, 6);
        i961Var.f.render(new ei8(state, 1));
    }

    public TopupNoticeContentDeprecatedView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ TopupNoticeContentDeprecatedView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public TopupNoticeContentDeprecatedView(Context context) {
        this(context, null, 0, 6, null);
    }
}
