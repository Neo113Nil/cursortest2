package xsna;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.core.view.ProgressView;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.common.DownloadState;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.views.msg.MsgPartIconTwoRowView;
import com.vkontakte.android.R;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.e3m;
import xsna.g34;

/* compiled from: MsgPartDocSimpleHolder.kt */
/* loaded from: classes2.dex */
public final class qp30 extends hr30<AttachDoc, rp30> implements g34.a {
    public Context d;
    public MsgPartIconTwoRowView e;
    public r3e0 f;
    public LayerDrawable g;
    public LayerDrawable h;
    public g34 i;
    public pk30 j;
    public rp30 k;
    public final StringBuilder l = new StringBuilder();
    public final v5t m = new v5t(R.layout.vkim_msg_part_doc_simple);

    /* compiled from: MsgPartDocSimpleHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DownloadState.values().length];
            try {
                iArr[DownloadState.DOWNLOAD_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DownloadState.DOWNLOADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DownloadState.DOWNLOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class b implements izs<View, s3q0> {
        public b() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            qp30 qp30Var = qp30.this;
            pk30 pk30Var = qp30Var.j;
            rp30 rp30Var = qp30Var.k;
            Msg msg = rp30Var != null ? rp30Var.t : null;
            Attach attach = rp30Var != null ? rp30Var.v : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.R(attach, msg, rp30Var != null ? rp30Var.u : null);
            }
            return s3q0.a;
        }
    }

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class c implements View.OnLongClickListener {
        public c() {
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            qp30 qp30Var = qp30.this;
            pk30 pk30Var = qp30Var.j;
            rp30 rp30Var = qp30Var.k;
            Boolean bool = null;
            bool = null;
            bool = null;
            Msg msg = rp30Var != null ? rp30Var.t : null;
            Attach attach = rp30Var != null ? rp30Var.v : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.X(attach, msg, rp30Var != null ? rp30Var.u : null);
                bool = Boolean.TRUE;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    @Override // xsna.g34.a
    public final void c(int i) {
        r3e0 r3e0Var = this.f;
        if (r3e0Var == null) {
            r3e0Var = null;
        }
        r3e0Var.b(i);
    }

    @Override // xsna.g34.a
    public final void e(int i, int i2, int i3) {
        r3e0 r3e0Var = this.f;
        if (r3e0Var == null) {
            r3e0Var = null;
        }
        r3e0Var.d(i, i2, i3);
        rp30 rp30Var = this.k;
        if (rp30Var == null || rp30Var.g != i || rp30Var == null || !rp30Var.h) {
            return;
        }
        s(Float.valueOf(i2 / i3));
    }

    @Override // xsna.g34.a
    public final void f(int i) {
        r3e0 r3e0Var = this.f;
        if (r3e0Var == null) {
            r3e0Var = null;
        }
        r3e0Var.c(i);
    }

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        int i = bubbleColors.c;
        MsgPartIconTwoRowView msgPartIconTwoRowView = this.e;
        if (msgPartIconTwoRowView == null) {
            msgPartIconTwoRowView = null;
        }
        msgPartIconTwoRowView.setTitleTextColor(bubbleColors.d);
        MsgPartIconTwoRowView msgPartIconTwoRowView2 = this.e;
        if (msgPartIconTwoRowView2 == null) {
            msgPartIconTwoRowView2 = null;
        }
        msgPartIconTwoRowView2.setSubtitleTextColor(bubbleColors.i);
        MsgPartIconTwoRowView msgPartIconTwoRowView3 = this.e;
        if (msgPartIconTwoRowView3 == null) {
            msgPartIconTwoRowView3 = null;
        }
        msgPartIconTwoRowView3.setTimeTextColor(bubbleColors.h);
        rp30 rp30Var = this.k;
        if (rp30Var == null) {
            return;
        }
        int e = rp30Var.f ? bubbleColors.b : rp30Var.e();
        LayerDrawable layerDrawable = this.h;
        if (layerDrawable == null) {
            layerDrawable = null;
        }
        sjo.b(layerDrawable.getDrawable(0), e, PorterDuff.Mode.SRC_IN);
        sjo.b(layerDrawable.getDrawable(1), i, PorterDuff.Mode.SRC_IN);
        LayerDrawable layerDrawable2 = this.g;
        if (layerDrawable2 == null) {
            layerDrawable2 = null;
        }
        sjo.b(layerDrawable2.getDrawable(0), i, PorterDuff.Mode.SRC_IN);
        sjo.b(layerDrawable2.getDrawable(1), e, PorterDuff.Mode.SRC_IN);
        MsgPartIconTwoRowView msgPartIconTwoRowView4 = this.e;
        if (msgPartIconTwoRowView4 == null) {
            msgPartIconTwoRowView4 = null;
        }
        msgPartIconTwoRowView4.getProgressView().setLineColor(e);
        MsgPartIconTwoRowView msgPartIconTwoRowView5 = this.e;
        if (msgPartIconTwoRowView5 == null) {
            msgPartIconTwoRowView5 = null;
        }
        msgPartIconTwoRowView5.getProgressView().setCancelIconTintColor(e);
        MsgPartIconTwoRowView msgPartIconTwoRowView6 = this.e;
        (msgPartIconTwoRowView6 != null ? msgPartIconTwoRowView6 : null).getProgressView().setLayerColor(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0048, code lost:
    
        if (r5 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004d, code lost:
    
        if (r5 == null) goto L17;
     */
    @Override // xsna.hr30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(rp30 rp30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        LayerDrawable layerDrawable;
        rp30 rp30Var2 = rp30Var;
        this.j = pk30Var;
        this.k = rp30Var2;
        g34 g34Var = rp30Var2.m;
        this.i = g34Var;
        if (g34Var != null) {
            g34Var.a(rp30Var2.g, this);
        }
        MsgPartIconTwoRowView msgPartIconTwoRowView = this.e;
        if (msgPartIconTwoRowView == null) {
            msgPartIconTwoRowView = null;
        }
        ucp ucpVar = ucp.a;
        msgPartIconTwoRowView.setTitleText(ucp.i(rp30Var2.l));
        MsgPartIconTwoRowView msgPartIconTwoRowView2 = this.e;
        if (msgPartIconTwoRowView2 == null) {
            msgPartIconTwoRowView2 = null;
        }
        ImageView iconView = msgPartIconTwoRowView2.getIconView();
        int i = a.$EnumSwitchMapping$0[rp30Var2.k.ordinal()];
        if (i != 1) {
            if (i == 2) {
                layerDrawable = this.h;
            } else if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            layerDrawable = null;
            iconView.setImageDrawable(layerDrawable);
            s(null);
            jr30 jr30Var = rp30Var2.b;
            MsgPartIconTwoRowView msgPartIconTwoRowView3 = this.e;
            if (msgPartIconTwoRowView3 == null) {
                msgPartIconTwoRowView3 = null;
            }
            hr30.m(jr30Var, msgPartIconTwoRowView3);
            Attach attach = rp30Var2.v;
            if (attach != null) {
                r3e0 r3e0Var = this.f;
                (r3e0Var != null ? r3e0Var : null).a(attach);
                return;
            }
            return;
        }
        layerDrawable = this.g;
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.d = layoutInflater.getContext();
        v5t v5tVar = this.m;
        this.e = (MsgPartIconTwoRowView) v5tVar.c(layoutInflater, viewGroup);
        View view = (View) v5tVar.c;
        if (view == null) {
            view = null;
        }
        jjc.g(view, new b());
        View view2 = (View) v5tVar.c;
        if (view2 == null) {
            view2 = null;
        }
        view2.setOnLongClickListener(new c());
        MsgPartIconTwoRowView msgPartIconTwoRowView = this.e;
        if (msgPartIconTwoRowView == null) {
            msgPartIconTwoRowView = null;
        }
        ProgressView progressView = msgPartIconTwoRowView.getProgressView();
        MsgPartIconTwoRowView msgPartIconTwoRowView2 = this.e;
        if (msgPartIconTwoRowView2 == null) {
            msgPartIconTwoRowView2 = null;
        }
        this.f = new r3e0(progressView, msgPartIconTwoRowView2.getIconView(), new rbe(this, 3));
        Context context = this.d;
        if (context == null) {
            context = null;
        }
        e3m.a aVar = e3m.a;
        this.g = (LayerDrawable) m33.a(R.drawable.vkim_ic_attach_download_required, context);
        Context context2 = this.d;
        if (context2 == null) {
            context2 = null;
        }
        this.h = (LayerDrawable) m33.a(R.drawable.vkim_ic_attach_downloaded, context2);
        MsgPartIconTwoRowView msgPartIconTwoRowView3 = this.e;
        if (msgPartIconTwoRowView3 == null) {
            return null;
        }
        return msgPartIconTwoRowView3;
    }

    @Override // xsna.hr30
    public final void r() {
        rp30 rp30Var = this.k;
        if (rp30Var != null) {
            int i = rp30Var.g;
            g34 g34Var = this.i;
            if (g34Var != null) {
                g34Var.a(i, null);
            }
        }
        this.i = null;
        r3e0 r3e0Var = this.f;
        if (r3e0Var == null) {
            r3e0Var = null;
        }
        r3e0Var.e();
        this.j = null;
        this.k = null;
    }

    public final void s(Float f) {
        StringBuilder sb = this.l;
        sb.setLength(0);
        lar larVar = lar.a;
        rp30 rp30Var = this.k;
        long j = rp30Var != null ? rp30Var.j : 0L;
        larVar.getClass();
        if (f != null) {
            lar.b((long) (f.floatValue() * j), sb);
            sb.append(" / ");
        }
        lar.b(j, sb);
        rp30 rp30Var2 = this.k;
        String str = rp30Var2 != null ? rp30Var2.i : null;
        if (str != null && !drm0.N(str)) {
            sb.append(" · ");
            sb.append(str.toUpperCase(Locale.ROOT));
        }
        MsgPartIconTwoRowView msgPartIconTwoRowView = this.e;
        (msgPartIconTwoRowView != null ? msgPartIconTwoRowView : null).setSubtitleText(sb);
    }

    @Override // xsna.hr30
    public final Collection<Integer> v(String str) {
        File i1;
        rp30 rp30Var = this.k;
        String str2 = null;
        Attach attach = rp30Var != null ? rp30Var.v : null;
        Attach attach2 = rp30Var != null ? rp30Var.v : null;
        ftx0 ftx0Var = attach2 instanceof ftx0 ? (ftx0) attach2 : null;
        if (ftx0Var != null && (i1 = ftx0Var.i1()) != null) {
            str2 = i1.getPath();
        }
        return (attach == null || str2 == null || !str2.equals(str)) ? EmptyList.b : Collections.singletonList(Integer.valueOf(attach.xb()));
    }
}
