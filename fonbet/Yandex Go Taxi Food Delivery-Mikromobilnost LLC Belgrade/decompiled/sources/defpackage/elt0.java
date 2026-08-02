package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetDialog;

/* loaded from: classes15.dex */
public final class elt0 {
    public final h3y a;
    public final View b;
    public final Activity c;

    public elt0(Activity activity, h3y h3yVar) {
        this.c = activity;
        this.a = h3yVar;
        View inflate = LayoutInflater.from(activity).inflate(olh0.msg_v_spam_suggest, (ViewGroup) null);
        this.b = inflate;
        View findViewById = inflate.findViewById(e9h0.spam_suggest_close_button);
        View findViewById2 = inflate.findViewById(e9h0.spam_suggest_report_button);
        View findViewById3 = inflate.findViewById(e9h0.spam_suggest_block_button);
        findViewById.setOnClickListener(new eaj0(23, h3yVar));
        final int i = 0;
        findViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: clt0
            public final /* synthetic */ elt0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                final elt0 elt0Var = this.b;
                switch (i2) {
                    case 0:
                        Activity activity2 = elt0Var.c;
                        j4n j4nVar = new j4n(activity2);
                        int i3 = oyh0.messaging_sends_spam;
                        final int i4 = 0;
                        Runnable runnable = new Runnable() { // from class: dlt0
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i5 = i4;
                                elt0 elt0Var2 = elt0Var;
                                switch (i5) {
                                    case 0:
                                        blt0 blt0Var = (blt0) elt0Var2.a.get();
                                        b00 b00Var = blt0Var.w;
                                        ((Handler) b00Var.a.get()).post(new xz(b00Var, blt0Var.c, 0, 0));
                                        break;
                                    case 1:
                                        blt0 blt0Var2 = (blt0) elt0Var2.a.get();
                                        b00 b00Var2 = blt0Var2.w;
                                        ((Handler) b00Var2.a.get()).post(new xz(b00Var2, blt0Var2.c, 1, 0));
                                        break;
                                    default:
                                        blt0 blt0Var3 = (blt0) elt0Var2.a.get();
                                        b00 b00Var3 = blt0Var3.w;
                                        ((Handler) b00Var3.a.get()).post(new xz(b00Var3, blt0Var3.c, 2, 0));
                                        break;
                                }
                            }
                        };
                        TextView textView = (TextView) j4nVar.x;
                        textView.setVisibility(0);
                        textView.setText(i3);
                        textView.setOnClickListener(new ywc(j4nVar, runnable, 0 == true ? 1 : 0));
                        int i5 = oyh0.messaging_sends_inappropriate_content;
                        final int i6 = 1;
                        Runnable runnable2 = new Runnable() { // from class: dlt0
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i52 = i6;
                                elt0 elt0Var2 = elt0Var;
                                switch (i52) {
                                    case 0:
                                        blt0 blt0Var = (blt0) elt0Var2.a.get();
                                        b00 b00Var = blt0Var.w;
                                        ((Handler) b00Var.a.get()).post(new xz(b00Var, blt0Var.c, 0, 0));
                                        break;
                                    case 1:
                                        blt0 blt0Var2 = (blt0) elt0Var2.a.get();
                                        b00 b00Var2 = blt0Var2.w;
                                        ((Handler) b00Var2.a.get()).post(new xz(b00Var2, blt0Var2.c, 1, 0));
                                        break;
                                    default:
                                        blt0 blt0Var3 = (blt0) elt0Var2.a.get();
                                        b00 b00Var3 = blt0Var3.w;
                                        ((Handler) b00Var3.a.get()).post(new xz(b00Var3, blt0Var3.c, 2, 0));
                                        break;
                                }
                            }
                        };
                        TextView textView2 = (TextView) j4nVar.c;
                        textView2.setVisibility(0);
                        textView2.setText(i5);
                        textView2.setOnClickListener(new ywc(j4nVar, runnable2, i6));
                        int i7 = oyh0.messaging_abusive_behavior;
                        final int i8 = 2;
                        Runnable runnable3 = new Runnable() { // from class: dlt0
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i52 = i8;
                                elt0 elt0Var2 = elt0Var;
                                switch (i52) {
                                    case 0:
                                        blt0 blt0Var = (blt0) elt0Var2.a.get();
                                        b00 b00Var = blt0Var.w;
                                        ((Handler) b00Var.a.get()).post(new xz(b00Var, blt0Var.c, 0, 0));
                                        break;
                                    case 1:
                                        blt0 blt0Var2 = (blt0) elt0Var2.a.get();
                                        b00 b00Var2 = blt0Var2.w;
                                        ((Handler) b00Var2.a.get()).post(new xz(b00Var2, blt0Var2.c, 1, 0));
                                        break;
                                    default:
                                        blt0 blt0Var3 = (blt0) elt0Var2.a.get();
                                        b00 b00Var3 = blt0Var3.w;
                                        ((Handler) b00Var3.a.get()).post(new xz(b00Var3, blt0Var3.c, 2, 0));
                                        break;
                                }
                            }
                        };
                        TextView textView3 = (TextView) j4nVar.y;
                        textView3.setVisibility(0);
                        textView3.setText(i7);
                        textView3.setOnClickListener(new zwc(j4nVar, 0 == true ? 1 : 0, runnable3, 0 == true ? 1 : 0));
                        j4nVar.w = activity2.getResources().getString(oyh0.messaging_user_report_sent);
                        ((BottomSheetDialog) j4nVar.b).show();
                        break;
                    default:
                        new AlertDialog.Builder(elt0Var.c, w0i0.Messaging_AlertDialog).setTitle(oyh0.spam_suggest_block_title).setMessage(oyh0.spam_suggest_block_text).setNegativeButton(oyh0.button_cancel, (DialogInterface.OnClickListener) null).setPositiveButton(oyh0.spam_suggest_block, new p97(8, elt0Var)).show();
                        break;
                }
            }
        });
        final int i2 = 1;
        findViewById3.setOnClickListener(new View.OnClickListener(this) { // from class: clt0
            public final /* synthetic */ elt0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                final elt0 elt0Var = this.b;
                switch (i22) {
                    case 0:
                        Activity activity2 = elt0Var.c;
                        j4n j4nVar = new j4n(activity2);
                        int i3 = oyh0.messaging_sends_spam;
                        final int i4 = 0;
                        Runnable runnable = new Runnable() { // from class: dlt0
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i52 = i4;
                                elt0 elt0Var2 = elt0Var;
                                switch (i52) {
                                    case 0:
                                        blt0 blt0Var = (blt0) elt0Var2.a.get();
                                        b00 b00Var = blt0Var.w;
                                        ((Handler) b00Var.a.get()).post(new xz(b00Var, blt0Var.c, 0, 0));
                                        break;
                                    case 1:
                                        blt0 blt0Var2 = (blt0) elt0Var2.a.get();
                                        b00 b00Var2 = blt0Var2.w;
                                        ((Handler) b00Var2.a.get()).post(new xz(b00Var2, blt0Var2.c, 1, 0));
                                        break;
                                    default:
                                        blt0 blt0Var3 = (blt0) elt0Var2.a.get();
                                        b00 b00Var3 = blt0Var3.w;
                                        ((Handler) b00Var3.a.get()).post(new xz(b00Var3, blt0Var3.c, 2, 0));
                                        break;
                                }
                            }
                        };
                        TextView textView = (TextView) j4nVar.x;
                        textView.setVisibility(0);
                        textView.setText(i3);
                        textView.setOnClickListener(new ywc(j4nVar, runnable, 0 == true ? 1 : 0));
                        int i5 = oyh0.messaging_sends_inappropriate_content;
                        final int i6 = 1;
                        Runnable runnable2 = new Runnable() { // from class: dlt0
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i52 = i6;
                                elt0 elt0Var2 = elt0Var;
                                switch (i52) {
                                    case 0:
                                        blt0 blt0Var = (blt0) elt0Var2.a.get();
                                        b00 b00Var = blt0Var.w;
                                        ((Handler) b00Var.a.get()).post(new xz(b00Var, blt0Var.c, 0, 0));
                                        break;
                                    case 1:
                                        blt0 blt0Var2 = (blt0) elt0Var2.a.get();
                                        b00 b00Var2 = blt0Var2.w;
                                        ((Handler) b00Var2.a.get()).post(new xz(b00Var2, blt0Var2.c, 1, 0));
                                        break;
                                    default:
                                        blt0 blt0Var3 = (blt0) elt0Var2.a.get();
                                        b00 b00Var3 = blt0Var3.w;
                                        ((Handler) b00Var3.a.get()).post(new xz(b00Var3, blt0Var3.c, 2, 0));
                                        break;
                                }
                            }
                        };
                        TextView textView2 = (TextView) j4nVar.c;
                        textView2.setVisibility(0);
                        textView2.setText(i5);
                        textView2.setOnClickListener(new ywc(j4nVar, runnable2, i6));
                        int i7 = oyh0.messaging_abusive_behavior;
                        final int i8 = 2;
                        Runnable runnable3 = new Runnable() { // from class: dlt0
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i52 = i8;
                                elt0 elt0Var2 = elt0Var;
                                switch (i52) {
                                    case 0:
                                        blt0 blt0Var = (blt0) elt0Var2.a.get();
                                        b00 b00Var = blt0Var.w;
                                        ((Handler) b00Var.a.get()).post(new xz(b00Var, blt0Var.c, 0, 0));
                                        break;
                                    case 1:
                                        blt0 blt0Var2 = (blt0) elt0Var2.a.get();
                                        b00 b00Var2 = blt0Var2.w;
                                        ((Handler) b00Var2.a.get()).post(new xz(b00Var2, blt0Var2.c, 1, 0));
                                        break;
                                    default:
                                        blt0 blt0Var3 = (blt0) elt0Var2.a.get();
                                        b00 b00Var3 = blt0Var3.w;
                                        ((Handler) b00Var3.a.get()).post(new xz(b00Var3, blt0Var3.c, 2, 0));
                                        break;
                                }
                            }
                        };
                        TextView textView3 = (TextView) j4nVar.y;
                        textView3.setVisibility(0);
                        textView3.setText(i7);
                        textView3.setOnClickListener(new zwc(j4nVar, 0 == true ? 1 : 0, runnable3, 0 == true ? 1 : 0));
                        j4nVar.w = activity2.getResources().getString(oyh0.messaging_user_report_sent);
                        ((BottomSheetDialog) j4nVar.b).show();
                        break;
                    default:
                        new AlertDialog.Builder(elt0Var.c, w0i0.Messaging_AlertDialog).setTitle(oyh0.spam_suggest_block_title).setMessage(oyh0.spam_suggest_block_text).setNegativeButton(oyh0.button_cancel, (DialogInterface.OnClickListener) null).setPositiveButton(oyh0.spam_suggest_block, new p97(8, elt0Var)).show();
                        break;
                }
            }
        });
    }
}
