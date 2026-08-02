package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.util.measure.ScaleType;
import com.vk.core.view.PhotoStackView;
import com.vk.core.view.TintTextView;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.attaches.miniapp.MiniAppSnippetDataAttach;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: MsgPartMiniAppActionSnippetHolder.kt */
/* loaded from: classes2.dex */
public final class cs30 extends hr30<MiniAppSnippetDataAttach, ds30> {
    public static final int o = iah0.a(16);
    public static final float p = iah0.b(0.5f);
    public static final int q = iah0.a(80);
    public static final int r = iah0.a(10);
    public FrescoImageView d;
    public TextView e;
    public TextView f;
    public TintTextView g;
    public TimeAndStatusView h;
    public PhotoStackView i;
    public TextView j;
    public View k;
    public pk30 l;
    public ds30 m;
    public final v5t n = new v5t(R.layout.vkim_msg_part_mini_app_action);

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class a implements izs<View, s3q0> {
        public a() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            cs30 cs30Var = cs30.this;
            pk30 pk30Var = cs30Var.l;
            ds30 ds30Var = cs30Var.m;
            Msg msg = ds30Var != null ? ds30Var.n : null;
            Attach attach = ds30Var != null ? ds30Var.p : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.R(attach, msg, ds30Var != null ? ds30Var.o : null);
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
            cs30 cs30Var = cs30.this;
            pk30 pk30Var = cs30Var.l;
            ds30 ds30Var = cs30Var.m;
            Boolean bool = null;
            bool = null;
            bool = null;
            Msg msg = ds30Var != null ? ds30Var.n : null;
            Attach attach = ds30Var != null ? ds30Var.p : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.X(attach, msg, ds30Var != null ? ds30Var.o : null);
                bool = Boolean.TRUE;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class c implements izs<View, s3q0> {
        public c() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            cs30 cs30Var = cs30.this;
            pk30 pk30Var = cs30Var.l;
            ds30 ds30Var = cs30Var.m;
            Msg msg = ds30Var != null ? ds30Var.n : null;
            Attach attach = ds30Var != null ? ds30Var.p : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.R(attach, msg, ds30Var != null ? ds30Var.o : null);
            }
            return s3q0.a;
        }
    }

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        int i = bubbleColors.r;
        TextView textView = this.e;
        if (textView == null) {
            textView = null;
        }
        textView.setTextColor(bubbleColors.g);
        TextView textView2 = this.f;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setTextColor(bubbleColors.f);
        TextView textView3 = this.j;
        if (textView3 == null) {
            textView3 = null;
        }
        textView3.setTextColor(bubbleColors.i);
        TimeAndStatusView timeAndStatusView = this.h;
        if (timeAndStatusView == null) {
            timeAndStatusView = null;
        }
        timeAndStatusView.setTimeTextColor(bubbleColors.h);
        TintTextView tintTextView = this.g;
        TintTextView tintTextView2 = tintTextView != null ? tintTextView : null;
        tintTextView2.setTextColor(i);
        tintTextView2.setDrawableTint(i);
        tintTextView2.setBackgroundTint(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v12, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [com.vk.core.view.PhotoStackView] */
    /* JADX WARN: Type inference failed for: r7v3 */
    @Override // xsna.hr30
    public final void p(ds30 ds30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        ?? r6;
        Image Gb;
        ds30 ds30Var2 = ds30Var;
        String str = ds30Var2.g;
        this.l = pk30Var;
        this.m = ds30Var2;
        ImageList imageList = ds30Var2.d;
        if (imageList == null || (Gb = imageList.Gb(q)) == null) {
            FrescoImageView frescoImageView = this.d;
            if (frescoImageView == null) {
                frescoImageView = null;
            }
            frescoImageView.n(null, null);
        } else {
            FrescoImageView frescoImageView2 = this.d;
            if (frescoImageView2 == null) {
                frescoImageView2 = null;
            }
            frescoImageView2.setRemoteImage(Gb);
        }
        TextView textView = this.e;
        if (textView == null) {
            textView = null;
        }
        textView.setText(ds30Var2.e);
        TextView textView2 = this.f;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setText(ds30Var2.f);
        TintTextView tintTextView = this.g;
        if (tintTextView == null) {
            tintTextView = null;
        }
        tintTextView.setText(str);
        TintTextView tintTextView2 = this.g;
        if (tintTextView2 == null) {
            tintTextView2 = null;
        }
        bwt0.p0(tintTextView2, drm0.N(str) ^ true);
        TintTextView tintTextView3 = this.g;
        if (tintTextView3 == null) {
            tintTextView3 = null;
        }
        his0.v(tintTextView3, ds30Var2.h ? R.drawable.vk_icon_game_16 : R.drawable.vk_icon_services_16, 0);
        jr30 jr30Var = ds30Var2.b;
        TimeAndStatusView timeAndStatusView = this.h;
        if (timeAndStatusView == null) {
            timeAndStatusView = null;
        }
        hr30.l(timeAndStatusView, jr30Var, false);
        List<ImageList> list = ds30Var2.i;
        if (list != null) {
            r6 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Image Gb2 = ((ImageList) it.next()).Gb(o);
                String str2 = Gb2 != null ? Gb2.d : null;
                if (str2 != null) {
                    r6.add(str2);
                }
            }
        } else {
            r6 = 0;
        }
        if (r6 == 0) {
            r6 = EmptyList.b;
        }
        String str3 = ds30Var2.j;
        View view = this.k;
        View view2 = view == null ? null : view;
        if (view == null) {
            view = null;
        }
        view2.setBackgroundColor(e3m.f(ds30Var2.k ? R.attr.vk_legacy_separator_alpha : R.attr.vk_legacy_separator_common, view.getContext()));
        PhotoStackView photoStackView = this.i;
        if (photoStackView == null) {
            photoStackView = null;
        }
        TextView textView3 = this.j;
        if (textView3 == null) {
            textView3 = null;
        }
        textView3.setText(str3);
        if (r6.isEmpty()) {
            photoStackView.setVisibility(8);
            return;
        }
        photoStackView.setVisibility(0);
        PhotoStackView photoStackView2 = this.i;
        (photoStackView2 != null ? photoStackView2 : 0).r(-1, r6);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        v5t v5tVar = this.n;
        View c2 = v5tVar.c(layoutInflater, viewGroup);
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
        this.d = (FrescoImageView) c2.findViewById(R.id.mini_app_image);
        this.e = (TextView) c2.findViewById(R.id.mini_app_title);
        this.f = (TextView) c2.findViewById(R.id.mini_app_description);
        this.g = (TintTextView) c2.findViewById(R.id.mini_app_btn);
        this.h = (TimeAndStatusView) c2.findViewById(R.id.time_and_status);
        this.i = (PhotoStackView) c2.findViewById(R.id.app_users);
        this.j = (TextView) c2.findViewById(R.id.footer_description);
        this.k = c2.findViewById(R.id.separator);
        PhotoStackView photoStackView = this.i;
        if (photoStackView == null) {
            photoStackView = null;
        }
        photoStackView.setOverlapOffset(0.7f);
        PhotoStackView photoStackView2 = this.i;
        if (photoStackView2 == null) {
            photoStackView2 = null;
        }
        photoStackView2.setMarginBetweenImages(p);
        TintTextView tintTextView = this.g;
        if (tintTextView == null) {
            tintTextView = null;
        }
        jjc.g(tintTextView, new c());
        FrescoImageView frescoImageView = this.d;
        if (frescoImageView == null) {
            frescoImageView = null;
        }
        frescoImageView.setScaleType(ScaleType.CENTER_CROP);
        FrescoImageView frescoImageView2 = this.d;
        (frescoImageView2 != null ? frescoImageView2 : null).setCornerRadius(r);
        return c2;
    }

    @Override // xsna.hr30
    public final void r() {
        this.l = null;
        this.m = null;
    }
}
