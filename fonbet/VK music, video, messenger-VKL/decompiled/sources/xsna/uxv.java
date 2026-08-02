package xsna;

import android.app.Activity;
import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.View;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.ui.components.common.LinkAction;
import com.vkontakte.android.R;
import xsna.cwb0;

/* compiled from: ImBridgeOnSpanLongPressListener.kt */
/* loaded from: classes2.dex */
public final class uxv implements vb80 {
    public final DialogExt b;
    public final mxv c;
    public final Activity d;
    public final Peer e;
    public bzb0 f;

    /* compiled from: ImBridgeOnSpanLongPressListener.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LinkAction.values().length];
            try {
                iArr[LinkAction.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LinkAction.COPY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LinkAction.EMAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LinkAction.CALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public uxv(DialogExt dialogExt, mxv mxvVar, Activity activity, Peer peer) {
        this.b = dialogExt;
        this.c = mxvVar;
        this.d = activity;
        this.e = peer;
    }

    public static void a(Context context, String str) {
        fvr.l(context, str);
        edw edwVar = edw.a;
        edw.i(R.string.vkim_copy_to_clipboard_done, context);
    }

    public final bzb0 b(Context context) {
        bzb0 bzb0Var = this.f;
        if (bzb0Var != null) {
            return bzb0Var;
        }
        bzb0 bzb0Var2 = new bzb0(context);
        this.f = bzb0Var2;
        return bzb0Var2;
    }

    public final void c() {
        bzb0 bzb0Var = this.f;
        if (bzb0Var != null) {
            bzb0Var.a();
        }
        this.f = null;
    }

    @Override // xsna.vb80
    public final void k(ClickableSpan clickableSpan, View view) {
        boolean z = clickableSpan instanceof j420;
        Activity activity = this.d;
        if (z) {
            this.c.k().c(activity, ((j420) clickableSpan).e);
            return;
        }
        if (clickableSpan instanceof ifq0) {
            String a2 = ((ifq0) clickableSpan).a();
            b(activity).b(new cwb0.i0(e43.l(LinkAction.OPEN, LinkAction.COPY)), new z63(this, activity, a2, 6), new kt4(0, this, uxv.class, "release", "release()V", 0, 2));
            return;
        }
        if (clickableSpan instanceof jcp) {
            String str = ((jcp) clickableSpan).e;
            b(activity).b(new cwb0.i0(e43.l(LinkAction.EMAIL, LinkAction.COPY)), new vh9(this, activity, str, 9), new vxv(0, this, uxv.class, "release", "release()V", 0, 0));
            return;
        }
        if (clickableSpan instanceof jvu) {
            String str2 = ((jvu) clickableSpan).e;
            b(activity).b(new cwb0.i0(e43.l(LinkAction.OPEN, LinkAction.COPY)), new t3b(this, activity, str2, 3), new wxv(0, this, uxv.class, "release", "release()V", 0, 0));
            return;
        }
        if (clickableSpan instanceof t3a0) {
            String str3 = ((t3a0) clickableSpan).e;
            b(activity).b(new cwb0.i0(e43.l(LinkAction.CALL, LinkAction.COPY)), new m0i(this, activity, str3, 1), new wxt(0, this, uxv.class, "release", "release()V", 0, 1));
            return;
        }
        if (!(clickableSpan instanceof y7o0)) {
            if (clickableSpan instanceof wn70) {
                a(activity, ((wn70) clickableSpan).e);
                return;
            }
            return;
        }
        y7o0 y7o0Var = (y7o0) clickableSpan;
        String str4 = y7o0Var.e;
        String str5 = y7o0Var.f;
        b(activity).b(new cwb0.i0(e43.l(LinkAction.CALL, LinkAction.COPY)), new txv(this, activity, str4, str5, 0), new rx4(0, this, uxv.class, "release", "release()V", 0, 3));
    }
}
