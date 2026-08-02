package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import defpackage.iog0;
import defpackage.n4i0;
import defpackage.ny61;
import java.lang.ref.WeakReference;

/* loaded from: classes10.dex */
public final class a {
    public Drawable B;
    public ImageView C;
    public TextView D;
    public TextView E;
    public View F;
    public ListAdapter G;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final boolean O;
    public final Handler Q;
    public final Context a;
    public final AlertDialog b;
    public final Window c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public AlertController$RecycleListView g;
    public View h;
    public int i;
    public int j;
    public int k;
    public int l;
    public Button n;
    public CharSequence o;
    public Message p;
    public Drawable q;
    public Button r;
    public CharSequence s;
    public Message t;
    public Drawable u;
    public Button v;
    public CharSequence w;
    public Message x;
    public Drawable y;
    public NestedScrollView z;
    public boolean m = false;
    public int A = 0;
    public int H = -1;
    public int P = 0;
    public final View.OnClickListener R = new View.OnClickListener() { // from class: androidx.appcompat.app.AlertController$1
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            a aVar = a.this;
            Message obtain = (view != aVar.n || (message3 = aVar.p) == null) ? (view != aVar.r || (message2 = aVar.t) == null) ? (view != aVar.v || (message = aVar.x) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            a aVar2 = a.this;
            aVar2.Q.obtainMessage(1, aVar2.b).sendToTarget();
        }
    };

    public a(Context context, final AlertDialog alertDialog, Window window) {
        this.a = context;
        this.b = alertDialog;
        this.c = window;
        this.Q = new Handler(alertDialog) { // from class: androidx.appcompat.app.AlertController$ButtonHandler
            private static final int MSG_DISMISS_DIALOG = 1;
            private WeakReference<DialogInterface> mDialog;

            {
                this.mDialog = new WeakReference<>(alertDialog);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                if (i == -3 || i == -2 || i == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick(this.mDialog.get(), message.what);
                } else {
                    if (i != 1) {
                        return;
                    }
                    ((DialogInterface) message.obj).dismiss();
                }
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, n4i0.AlertDialog, iog0.alertDialogStyle, 0);
        this.I = obtainStyledAttributes.getResourceId(n4i0.AlertDialog_android_layout, 0);
        this.J = obtainStyledAttributes.getResourceId(n4i0.AlertDialog_buttonPanelSideLayout, 0);
        this.K = obtainStyledAttributes.getResourceId(n4i0.AlertDialog_listLayout, 0);
        this.L = obtainStyledAttributes.getResourceId(n4i0.AlertDialog_multiChoiceItemLayout, 0);
        this.M = obtainStyledAttributes.getResourceId(n4i0.AlertDialog_singleChoiceItemLayout, 0);
        this.N = obtainStyledAttributes.getResourceId(n4i0.AlertDialog_listItemLayout, 0);
        this.O = obtainStyledAttributes.getBoolean(n4i0.AlertDialog_showTitle, true);
        this.d = obtainStyledAttributes.getDimensionPixelSize(n4i0.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        alertDialog.supportRequestWindowFeature(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void c(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.Q.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.w = charSequence;
            this.x = message;
            this.y = drawable;
        } else if (i == -2) {
            this.s = charSequence;
            this.t = message;
            this.u = drawable;
        } else {
            if (i != -1) {
                ny61.g("Button does not exist");
                return;
            }
            this.o = charSequence;
            this.p = message;
            this.q = drawable;
        }
    }

    public final void d(int i) {
        this.B = null;
        this.A = i;
        ImageView imageView = this.C;
        if (imageView != null) {
            if (i == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.C.setImageResource(this.A);
            }
        }
    }
}
