package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.util.measure.ScaleType;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.attaches.AttachLink;
import com.vk.im.engine.models.attaches.ButtonIconType;
import com.vk.im.engine.models.attaches.ImageScaleType;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.views.msg.MsgPartSnippetView;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.e3m;

/* compiled from: MsgPartLinkLargeHolder.kt */
/* loaded from: classes2.dex */
public final class mr30 extends hr30<AttachLink, nr30> {
    public MsgPartSnippetView d;
    public nr30 f;
    public pk30 g;
    public final StringBuilder e = new StringBuilder();
    public final v5t h = new v5t(R.layout.vkim_msg_part_link_large);

    /* compiled from: MsgPartLinkLargeHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ImageScaleType.values().length];
            try {
                iArr[ImageScaleType.TOP_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageScaleType.BOTTOM_CROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ButtonIconType.values().length];
            try {
                iArr2[ButtonIconType.PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ButtonIconType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class b implements izs<View, s3q0> {
        public b() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            mr30 mr30Var = mr30.this;
            pk30 pk30Var = mr30Var.g;
            nr30 nr30Var = mr30Var.f;
            Msg msg = nr30Var != null ? nr30Var.o : null;
            Attach attach = nr30Var != null ? nr30Var.q : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.R(attach, msg, nr30Var != null ? nr30Var.p : null);
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
            mr30 mr30Var = mr30.this;
            pk30 pk30Var = mr30Var.g;
            nr30 nr30Var = mr30Var.f;
            Boolean bool = null;
            bool = null;
            bool = null;
            Msg msg = nr30Var != null ? nr30Var.o : null;
            Attach attach = nr30Var != null ? nr30Var.q : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.X(attach, msg, nr30Var != null ? nr30Var.p : null);
                bool = Boolean.TRUE;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        MsgPartSnippetView msgPartSnippetView = this.d;
        if (msgPartSnippetView == null) {
            msgPartSnippetView = null;
        }
        hr30.k(msgPartSnippetView, bubbleColors);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.hr30
    public final void p(nr30 nr30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        Spanned spanned;
        ScaleType scaleType;
        CharSequence i;
        Integer valueOf;
        Drawable drawable;
        nr30 nr30Var2 = nr30Var;
        String str = nr30Var2.f;
        boolean z = nr30Var2.k;
        boolean z2 = nr30Var2.j;
        this.f = nr30Var2;
        this.g = pk30Var;
        MsgPartSnippetView msgPartSnippetView = this.d;
        if (msgPartSnippetView == null) {
            msgPartSnippetView = null;
        }
        Context context = msgPartSnippetView.getContext();
        String str2 = nr30Var2.h;
        String str3 = nr30Var2.i;
        int i2 = 0;
        if (str2.length() == 0) {
            StringBuilder sb = this.e;
            sb.setLength(0);
            rwj0.a(str3, sb);
            spanned = sb;
        } else {
            spanned = Html.fromHtml(str2);
        }
        MsgPartSnippetView msgPartSnippetView2 = this.d;
        if (msgPartSnippetView2 == null) {
            msgPartSnippetView2 = null;
        }
        msgPartSnippetView2.setImageList(nr30Var2.d);
        MsgPartSnippetView msgPartSnippetView3 = this.d;
        if (msgPartSnippetView3 == null) {
            msgPartSnippetView3 = null;
        }
        int i3 = a.$EnumSwitchMapping$0[nr30Var2.l.ordinal()];
        if (i3 == 1) {
            scaleType = ScaleType.TOP_CROP;
        } else if (i3 == 2) {
            scaleType = ScaleType.CENTER_CROP;
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            scaleType = ScaleType.BOTTOM_CROP;
        }
        msgPartSnippetView3.setImageScaleType(scaleType);
        MsgPartSnippetView msgPartSnippetView4 = this.d;
        if (msgPartSnippetView4 == null) {
            msgPartSnippetView4 = null;
        }
        int i4 = R.drawable.vk_icon_deprecated_ic_longreads_amp_36;
        if (!z2 && !z) {
            i4 = 0;
        }
        msgPartSnippetView4.setImageOverlay(i4 == 0 ? null : m33.a(i4, context));
        MsgPartSnippetView msgPartSnippetView5 = this.d;
        if (msgPartSnippetView5 == null) {
            msgPartSnippetView5 = null;
        }
        if (z2) {
            i2 = iah0.a(22);
        } else if (z) {
            i2 = iah0.a(22);
        }
        msgPartSnippetView5.setImageOverlayPadding(i2);
        MsgPartSnippetView msgPartSnippetView6 = this.d;
        if (msgPartSnippetView6 == null) {
            msgPartSnippetView6 = null;
        }
        boolean e = nr30Var2.e();
        String str4 = nr30Var2.g;
        if (e) {
            i = context.getString(R.string.vkim_msg_story_single);
        } else {
            boolean N = drm0.N(str4);
            if (N) {
                i = context.getString(R.string.vkim_msg_link_single);
            } else {
                if (N) {
                    throw new NoWhenBranchMatchedException();
                }
                ucp ucpVar = ucp.a;
                i = ucp.i(str4);
            }
        }
        msgPartSnippetView6.j((!nr30Var2.e() && str.length() == 0) ? 2 : 1, i);
        MsgPartSnippetView msgPartSnippetView7 = this.d;
        if (msgPartSnippetView7 == null) {
            msgPartSnippetView7 = null;
        }
        if (nr30Var2.e()) {
            str = context.getString(R.string.vkim_attach_story_button);
        }
        msgPartSnippetView7.setButtonText(str);
        MsgPartSnippetView msgPartSnippetView8 = this.d;
        if (msgPartSnippetView8 == null) {
            msgPartSnippetView8 = null;
        }
        int i5 = a.$EnumSwitchMapping$1[nr30Var2.e.ordinal()];
        if (i5 == 1) {
            valueOf = Integer.valueOf(R.drawable.vk_icon_play_16);
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            e3m.a aVar = e3m.a;
            drawable = m33.a(intValue, context);
        } else {
            drawable = null;
        }
        msgPartSnippetView8.h(drawable);
        MsgPartSnippetView msgPartSnippetView9 = this.d;
        MsgPartSnippetView msgPartSnippetView10 = msgPartSnippetView9;
        if (msgPartSnippetView9 == null) {
            msgPartSnippetView10 = null;
        }
        msgPartSnippetView10.setCaptionText(spanned);
        MsgPartSnippetView msgPartSnippetView11 = this.d;
        MsgPartSnippetView msgPartSnippetView12 = msgPartSnippetView11;
        if (msgPartSnippetView11 == null) {
            msgPartSnippetView12 = null;
        }
        msgPartSnippetView12.setContentDescription(spanned);
        jr30 jr30Var = nr30Var2.b;
        MsgPartSnippetView msgPartSnippetView13 = this.d;
        hr30.m(jr30Var, msgPartSnippetView13 != null ? msgPartSnippetView13 : null);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        int d = e3m.d(R.attr.im_msg_part_corner_radius_small, layoutInflater.getContext());
        v5t v5tVar = this.h;
        this.d = (MsgPartSnippetView) v5tVar.c(layoutInflater, viewGroup);
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
        context.getString(R.string.vkim_msg_link_single);
        wng0 wng0Var = new wng0(context.getColor(R.color.vkim_msg_part_placeholder), d);
        MsgPartSnippetView msgPartSnippetView = this.d;
        if (msgPartSnippetView == null) {
            msgPartSnippetView = null;
        }
        msgPartSnippetView.setImagePlaceholder(wng0Var);
        MsgPartSnippetView msgPartSnippetView2 = this.d;
        if (msgPartSnippetView2 == null) {
            return null;
        }
        return msgPartSnippetView2;
    }

    @Override // xsna.hr30
    public final void r() {
        this.g = null;
        this.f = null;
    }
}
