package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.text.ClipboardManager;
import com.vkontakte.android.R;
import java.util.List;
import xsna.h7u0;

/* compiled from: SpanMenuLauncherImpl.kt */
/* loaded from: classes.dex */
public final class dik0 implements aik0 {
    public final btq a;

    public dik0(btq btqVar) {
        this.a = btqVar;
    }

    @Override // xsna.aik0
    public final void a(final Context context, final String str, final q qVar) {
        h7u0.a c;
        List l = e43.l(context.getString(R.string.span_action_open), context.getString(R.string.span_action_copy));
        int i = h7u0.p;
        c = h7u0.b.c(context);
        c.h0(str);
        c.T((CharSequence[]) l.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: xsna.bik0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                if (i2 == 0) {
                    qVar.invoke();
                } else {
                    if (i2 != 1) {
                        return;
                    }
                    mhy.a(context, str);
                    cvk.u(R.string.span_text_copied, false);
                }
            }
        });
        c.m();
    }

    @Override // xsna.aik0
    public final void b(final Context context, final String str, final bb bbVar) {
        h7u0.a c;
        List l = e43.l(context.getString(R.string.span_action_open), context.getString(R.string.span_action_copy), context.getString(R.string.span_action_add_to_fave));
        int i = h7u0.p;
        c = h7u0.b.c(context);
        c.h0(str);
        c.T((CharSequence[]) l.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: xsna.cik0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                if (i2 == 0) {
                    bb.this.invoke();
                    return;
                }
                Context context2 = context;
                String str2 = str;
                if (i2 == 1) {
                    ((ClipboardManager) context2.getSystemService("clipboard")).setText(str2);
                    cvk.u(R.string.span_text_copied, false);
                } else {
                    if (i2 != 2) {
                        return;
                    }
                    this.a.a(context2, str2);
                }
            }
        });
        c.m();
    }
}
