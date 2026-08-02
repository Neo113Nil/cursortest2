package com.ybsdk.widgets.common;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.tooltip.TooltipCommon$PreferredGravity;
import com.ybsdk.widgets.tooltip.TooltipCommon$PreferredPosition;
import defpackage.bgc;
import defpackage.cuz0;
import defpackage.dzh0;
import defpackage.f0z0;
import defpackage.lzz0;
import defpackage.rje;
import defpackage.ung0;
import defpackage.y7z0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/widgets/common/TraceIdErrorView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Llzz0;", ClidProvider.STATE, "Lzy11;", "render", "(Llzz0;)V", "Llzz0;", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TraceIdErrorView extends AppCompatTextView {
    private lzz0 state;

    public TraceIdErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOnClickListener(new y7z0(4, this, context));
        setMaxLines(1);
        setGravity(17);
        setEllipsize(TextUtils.TruncateAt.END);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(TraceIdErrorView traceIdErrorView, Context context, View view) {
        lzz0 lzz0Var = traceIdErrorView.state;
        if (lzz0Var != null) {
            rje.b(context, lzz0Var.a, "trace_id");
            int a = rje.a(context, ung0.ybColor_button_primaryNormal);
            int a2 = rje.a(context, ung0.ybColor_textIcon_primaryInverted);
            int i = 12;
            bgc bgcVar = new bgc(i);
            bgc bgcVar2 = new bgc(i);
            f0z0 f0z0Var = new f0z0(19);
            TooltipCommon$PreferredGravity tooltipCommon$PreferredGravity = TooltipCommon$PreferredGravity.CENTER;
            TooltipCommon$PreferredPosition tooltipCommon$PreferredPosition = TooltipCommon$PreferredPosition.AUTO;
            com.ybsdk.core.utils.text.b bVar = Text.Companion;
            int i2 = dzh0.ybsdk_common_copied;
            bVar.getClass();
            new cuz0(a, a2, 0, 0, 10, bgcVar, bgcVar2, f0z0Var, null, context, tooltipCommon$PreferredGravity, tooltipCommon$PreferredPosition, null, null, null, null, com.ybsdk.core.utils.text.d.a(context, new Text.Resource(i2)).toString(), null, true, true).f(traceIdErrorView, 0L);
        }
    }

    public final void render(lzz0 state) {
        setText(getResources().getString(dzh0.ybsdk_common_trace_id_error_code, state.a));
        this.state = state;
    }

    public TraceIdErrorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ TraceIdErrorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public TraceIdErrorView(Context context) {
        this(context, null, 0, 6, null);
    }
}
