package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.attaches.AttachPodcastEpisode;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.views.msg.MsgPartSnippetView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.e3m;

/* compiled from: MsgPartPodcastEpisodeHolder.kt */
/* loaded from: classes2.dex */
public final class vs30 extends hr30<AttachPodcastEpisode, ws30> {
    public MsgPartSnippetView d;
    public Context e;
    public pk30 f;
    public ws30 g;
    public boolean h;
    public boolean i;
    public final v5t j = new v5t(R.layout.vkim_msg_part_link_large);

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class a implements izs<View, s3q0> {
        public a() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            vs30 vs30Var = vs30.this;
            pk30 pk30Var = vs30Var.f;
            ws30 ws30Var = vs30Var.g;
            Msg msg = ws30Var != null ? ws30Var.l : null;
            Attach attach = ws30Var != null ? ws30Var.n : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.R(attach, msg, ws30Var != null ? ws30Var.m : null);
            }
            return s3q0.a;
        }
    }

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class b implements View.OnLongClickListener {
        public b() {
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            vs30 vs30Var = vs30.this;
            pk30 pk30Var = vs30Var.f;
            ws30 ws30Var = vs30Var.g;
            Boolean bool = null;
            bool = null;
            bool = null;
            Msg msg = ws30Var != null ? ws30Var.l : null;
            Attach attach = ws30Var != null ? ws30Var.n : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.X(attach, msg, ws30Var != null ? ws30Var.m : null);
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
        s(this.h, this.i);
    }

    @Override // xsna.hr30
    public final void p(ws30 ws30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        String string;
        String string2;
        ws30 ws30Var2 = ws30Var;
        this.f = pk30Var;
        this.g = ws30Var2;
        boolean z = ws30Var2.d;
        this.i = z;
        boolean z2 = ws30Var2.e;
        this.h = z2;
        if (z2) {
            string = ws30Var2.f;
        } else {
            Context context = this.e;
            if (context == null) {
                context = null;
            }
            string = context.getString(R.string.vkim_msg_list_playlist_button);
        }
        ArrayList arrayList = new ArrayList();
        for (ImageSize imageSize : ws30Var2.g) {
            Image image = imageSize.d;
            arrayList.add(new Image(image.b, image.c, image.d, imageSize.c7()));
        }
        MsgPartSnippetView msgPartSnippetView = this.d;
        if (msgPartSnippetView == null) {
            msgPartSnippetView = null;
        }
        ImageList imageList = new ImageList(arrayList);
        msgPartSnippetView.b.setLocalImage((Iterable<? extends fxj0>) null);
        msgPartSnippetView.b.setRemoteImage(imageList);
        MsgPartSnippetView msgPartSnippetView2 = this.d;
        if (msgPartSnippetView2 == null) {
            msgPartSnippetView2 = null;
        }
        msgPartSnippetView2.setImageOverlay(null);
        MsgPartSnippetView msgPartSnippetView3 = this.d;
        if (msgPartSnippetView3 == null) {
            msgPartSnippetView3 = null;
        }
        Context context2 = this.e;
        if (context2 == null) {
            context2 = null;
        }
        msgPartSnippetView3.setImagePlaceholder(m33.a(R.drawable.bg_podcast_36_placeholder, context2));
        MsgPartSnippetView msgPartSnippetView4 = this.d;
        if (msgPartSnippetView4 == null) {
            msgPartSnippetView4 = null;
        }
        msgPartSnippetView4.j(1, ws30Var2.i);
        if (z2) {
            string2 = ws30Var2.h;
        } else {
            Context context3 = this.e;
            if (context3 == null) {
                context3 = null;
            }
            string2 = context3.getString(R.string.vkim_msg_podcast_episode_single);
        }
        MsgPartSnippetView msgPartSnippetView5 = this.d;
        if (msgPartSnippetView5 == null) {
            msgPartSnippetView5 = null;
        }
        msgPartSnippetView5.setCaptionText(string2);
        MsgPartSnippetView msgPartSnippetView6 = this.d;
        if (msgPartSnippetView6 == null) {
            msgPartSnippetView6 = null;
        }
        msgPartSnippetView6.setButtonText(string);
        s(z2, z);
        jr30 jr30Var = ws30Var2.b;
        MsgPartSnippetView msgPartSnippetView7 = this.d;
        hr30.m(jr30Var, msgPartSnippetView7 != null ? msgPartSnippetView7 : null);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        this.e = context;
        Resources resources = context.getResources();
        v5t v5tVar = this.j;
        this.d = (MsgPartSnippetView) v5tVar.c(layoutInflater, viewGroup);
        View view = (View) v5tVar.c;
        if (view == null) {
            view = null;
        }
        jjc.g(view, new a());
        View view2 = (View) v5tVar.c;
        if (view2 == null) {
            view2 = null;
        }
        view2.setOnLongClickListener(new b());
        MsgPartSnippetView msgPartSnippetView = this.d;
        if (msgPartSnippetView == null) {
            msgPartSnippetView = null;
        }
        int color = resources.getColor(R.color.vkim_msg_part_placeholder);
        Context context2 = this.e;
        if (context2 == null) {
            context2 = null;
        }
        msgPartSnippetView.setImagePlaceholder(new wng0(color, e3m.d(R.attr.im_msg_part_corner_radius_small, context2)));
        MsgPartSnippetView msgPartSnippetView2 = this.d;
        if (msgPartSnippetView2 == null) {
            return null;
        }
        return msgPartSnippetView2;
    }

    @Override // xsna.hr30
    public final void r() {
        this.f = null;
        this.g = null;
    }

    public final void s(boolean z, boolean z2) {
        if (!z || !z2) {
            MsgPartSnippetView msgPartSnippetView = this.d;
            if (msgPartSnippetView == null) {
                msgPartSnippetView = null;
            }
            msgPartSnippetView.h(null);
            MsgPartSnippetView msgPartSnippetView2 = this.d;
            if (msgPartSnippetView2 == null) {
                msgPartSnippetView2 = null;
            }
            msgPartSnippetView2.setButtonCompoundDrawablePadding(0);
            MsgPartSnippetView msgPartSnippetView3 = this.d;
            if (msgPartSnippetView3 == null) {
                msgPartSnippetView3 = null;
            }
            msgPartSnippetView3.setButtonAllCaps(false);
            MsgPartSnippetView msgPartSnippetView4 = this.d;
            (msgPartSnippetView4 != null ? msgPartSnippetView4 : null).l.setTextSize(2, 13.0f);
            return;
        }
        MsgPartSnippetView msgPartSnippetView5 = this.d;
        if (msgPartSnippetView5 == null) {
            msgPartSnippetView5 = null;
        }
        Context context = this.e;
        if (context == null) {
            context = null;
        }
        e3m.a aVar = e3m.a;
        msgPartSnippetView5.h(m33.a(R.drawable.vk_icon_star_circle_16, context));
        MsgPartSnippetView msgPartSnippetView6 = this.d;
        if (msgPartSnippetView6 == null) {
            msgPartSnippetView6 = null;
        }
        msgPartSnippetView6.setButtonCompoundDrawablePadding(iah0.a(6));
        MsgPartSnippetView msgPartSnippetView7 = this.d;
        if (msgPartSnippetView7 == null) {
            msgPartSnippetView7 = null;
        }
        msgPartSnippetView7.setButtonAllCaps(true);
        MsgPartSnippetView msgPartSnippetView8 = this.d;
        (msgPartSnippetView8 != null ? msgPartSnippetView8 : null).l.setTextSize(2, 12.0f);
    }
}
