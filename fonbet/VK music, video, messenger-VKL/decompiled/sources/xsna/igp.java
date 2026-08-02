package xsna;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.vk.im.ui.views.EmptyViewForList;
import com.vk.im.ui.views.msg.MsgRequestCountLabelView;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: EmptyMainVc.kt */
/* loaded from: classes2.dex */
public final class igp extends eyy {
    public final a e;
    public TextView f;
    public MsgRequestCountLabelView g;
    public boolean h;
    public int i;
    public int j;

    /* compiled from: EmptyMainVc.kt */
    public interface a {
    }

    public igp(View view, a aVar) {
        super(R.id.dialogs_empty_all, view);
        this.e = aVar;
    }

    @Override // xsna.eyy
    public final void b(View view) {
        Context context = view.getContext();
        TextView textView = (TextView) view.findViewById(R.id.business_notify_count);
        this.f = textView;
        bwt0.i0(textView, new x2e(this, 14));
        MsgRequestCountLabelView msgRequestCountLabelView = (MsgRequestCountLabelView) view.findViewById(R.id.msg_request_count);
        this.g = msgRequestCountLabelView;
        bwt0.i0(msgRequestCountLabelView, new cqf(this, 19));
        c();
        d();
        EmptyViewForList emptyViewForList = (EmptyViewForList) view.findViewById(R.id.empty);
        e3m.a aVar = e3m.a;
        emptyViewForList.a(m33.a(R.drawable.ic_message_outline_64, context), Integer.valueOf(R.attr.vk_legacy_icon_outline_secondary));
    }

    public final void c() {
        if (this.c) {
            TextView textView = this.f;
            if (textView == null) {
                textView = null;
            }
            textView.setVisibility(this.h ? 0 : 8);
            TextView textView2 = this.f;
            if (textView2 == null) {
                textView2 = null;
            }
            View view = this.d;
            Context context = (view != null ? view : null).getContext();
            int i = this.i;
            textView2.setText(i == 0 ? context.getString(R.string.vkim_business_notify_count_default) : enj.f(R.plurals.vkim_business_notify_count_many, i, context));
        }
    }

    public final void d() {
        if (this.c) {
            MsgRequestCountLabelView msgRequestCountLabelView = this.g;
            if (msgRequestCountLabelView == null) {
                msgRequestCountLabelView = null;
            }
            msgRequestCountLabelView.setVisibility(this.j > 0 ? 0 : 8);
            MsgRequestCountLabelView msgRequestCountLabelView2 = this.g;
            (msgRequestCountLabelView2 != null ? msgRequestCountLabelView2 : null).setCount(this.j);
        }
    }

    public final void e(boolean z) {
        if (z) {
            a();
            View view = this.d;
            (view != null ? view : null).setVisibility(0);
        } else if (this.c) {
            View view2 = this.d;
            f4m.j(view2 != null ? view2 : null);
        }
    }
}
