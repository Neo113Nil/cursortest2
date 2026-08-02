package com.ybsdk.screens.notice.presentation;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.api.ui.skeletons.DivSkeletonsView;
import com.ybsdk.widgets.common.YbButtonView;
import defpackage.cma1;
import defpackage.eal;
import defpackage.gao;
import defpackage.h961;
import defpackage.hls0;
import defpackage.jah0;
import defpackage.ny61;
import defpackage.qmh0;
import defpackage.r8j0;
import defpackage.rm;
import defpackage.rr51;
import defpackage.s8j0;
import defpackage.sls;
import defpackage.t8j0;
import defpackage.tls;
import defpackage.u8j0;
import defpackage.uwl0;
import defpackage.uxz0;
import defpackage.v4b1;
import defpackage.w511;
import defpackage.xbg0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u000e2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/screens/notice/presentation/TopupNoticeContentView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lu8j0;", "Lrr51;", "Lcom/ybsdk/screens/notice/presentation/TopupNoticeViewState;", ClidProvider.STATE, "Lzy11;", "render", "(Lu8j0;)V", "Lkotlin/Function1;", "Landroid/net/Uri;", "", "action", "onDivAction", "(Ltls;)V", "Lkotlin/Function0;", "onErrorViewPrimaryButtonClick", "(Lsls;)V", "Lh961;", "binding", "Lh961;", "Companion", "uxz0", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TopupNoticeContentView extends ConstraintLayout {
    private static final uxz0 Companion = new uxz0();
    private static final eal divSkeletonsViewState = new eal(hls0.b, false, null, 6);
    private final h961 binding;

    public TopupNoticeContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View O;
        LayoutInflater.from(context).inflate(qmh0.ybsdk_topup_notice_content, this);
        int i2 = jah0.topupNoticeDivView;
        YbDivView ybDivView = (YbDivView) cma1.O(i2, this);
        if (ybDivView != null && (O = cma1.O((i2 = jah0.topupNoticeErrorView), this)) != null) {
            rm o = rm.o(O);
            i2 = jah0.topupNoticeErrorViewHolder;
            FrameLayout frameLayout = (FrameLayout) cma1.O(i2, this);
            if (frameLayout != null) {
                i2 = jah0.topupNoticeShimmerView;
                DivSkeletonsView divSkeletonsView = (DivSkeletonsView) cma1.O(i2, this);
                if (divSkeletonsView != null) {
                    i2 = jah0.topupNoticeShimmerViewHolder;
                    FrameLayout frameLayout2 = (FrameLayout) cma1.O(i2, this);
                    if (frameLayout2 != null) {
                        h961 h961Var = new h961(this, ybDivView, o, frameLayout, divSkeletonsView, frameLayout2);
                        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
                        this.binding = h961Var;
                        return;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onDivAction$lambda$2(tls tlsVar, Uri uri) {
        return ((Boolean) tlsVar.invoke(uri)).booleanValue();
    }

    public final void onDivAction(tls action) {
        this.binding.b.setActionHandler(new uwl0(29, action));
    }

    public final void onErrorViewPrimaryButtonClick(sls action) {
        ((YbButtonView) this.binding.c.d).setOnClickListener(new xbg0(14, action));
    }

    public final void render(u8j0 state) {
        h961 h961Var = this.binding;
        FrameLayout frameLayout = h961Var.f;
        YbDivView ybDivView = h961Var.b;
        rm rmVar = h961Var.c;
        boolean z = state instanceof t8j0;
        frameLayout.setVisibility(z ? 0 : 8);
        boolean z2 = state instanceof s8j0;
        h961Var.d.setVisibility(z2 ? 0 : 8);
        ybDivView.setVisibility(state.a() != null ? 0 : 8);
        if (state instanceof r8j0) {
            YbDivView.setData$default(ybDivView, (rr51) ((r8j0) state).a, null, null, false, 14, null);
            return;
        }
        if (z2) {
            Throwable th = ((s8j0) state).a;
            v4b1.k(gao.c(th), (ImageView) rmVar.c, null, null, 6);
            ((TextView) rmVar.e).setText(d.a(getContext(), gao.f(th, gao.a)));
            ((TextView) rmVar.f).setText(d.a(getContext(), gao.b(th, gao.b)));
            return;
        }
        if (z) {
            h961Var.e.render(divSkeletonsViewState);
        } else {
            w511.b();
        }
    }

    public TopupNoticeContentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ TopupNoticeContentView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public TopupNoticeContentView(Context context) {
        this(context, null, 0, 6, null);
    }
}
