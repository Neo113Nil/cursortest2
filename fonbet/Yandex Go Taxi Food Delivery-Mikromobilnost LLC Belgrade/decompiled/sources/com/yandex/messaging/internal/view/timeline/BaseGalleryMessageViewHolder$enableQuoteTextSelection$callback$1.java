package com.yandex.messaging.internal.view.timeline;

import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.yandex.messaging.views.ClickableSpanHandler;
import defpackage.mw10;
import defpackage.r15;
import defpackage.s15;
import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class BaseGalleryMessageViewHolder$enableQuoteTextSelection$callback$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        b bVar = (b) this.receiver;
        TextView textView = bVar.B3;
        mw10 mw10Var = bVar.O0;
        if (mw10Var != null) {
            AppCompatTextView appCompatTextView = mw10Var.a;
            appCompatTextView.setCustomSelectionActionModeCallback(null);
            appCompatTextView.setTextIsSelectable(false);
            ClickableSpanHandler clickableSpanHandler = new ClickableSpanHandler(appCompatTextView);
            clickableSpanHandler.setClickDelegate(mw10Var.b);
            appCompatTextView.setOnTouchListener(clickableSpanHandler);
        }
        textView.setOnLongClickListener(new r15(bVar, 1));
        textView.setOnClickListener(new s15(bVar, 1));
        return zy11.a;
    }
}
