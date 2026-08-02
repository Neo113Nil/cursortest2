package xsna;

import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.util.measure.ScaleType;
import com.vk.core.view.TintTextView;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.user.UserSex;
import com.vk.im.engine.models.attaches.HistoryAttach;
import com.vk.im.engine.models.attaches.miniapp.MiniAppSnippetDataAttach;
import com.vk.im.engine.models.users.User;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.im.ui.components.attaches_history.attaches.model.simple.SimpleAttachListItem;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: AppsAttachViewTypeDelegate.kt */
/* loaded from: classes2.dex */
public final class xd3 extends p1u0<SimpleAttachListItem> {
    public static final int c = iah0.a(16);
    public static final float d = iah0.b(12.0f);
    public static final int e = iah0.a(80);
    public static final int f = iah0.a(10);
    public final com.vk.movika.sdk.base.observable.e a;
    public final ul1 b;

    /* compiled from: AppsAttachViewTypeDelegate.kt */
    public final class a extends vfz<SimpleAttachListItem> {
        public final FrescoImageView l;
        public final TextView m;
        public final TextView n;
        public final TintTextView o;
        public final VKImageView p;
        public final TextView q;
        public final View r;
        public SimpleAttachListItem s;
        public final StyleSpan t;

        public a(View view) {
            super(view);
            this.t = new StyleSpan(1);
            View view2 = this.itemView;
            FrescoImageView frescoImageView = (FrescoImageView) view2.findViewById(R.id.mini_app_image);
            this.l = frescoImageView;
            this.m = (TextView) view2.findViewById(R.id.mini_app_title);
            this.n = (TextView) view2.findViewById(R.id.mini_app_description);
            TintTextView tintTextView = (TintTextView) view2.findViewById(R.id.mini_app_btn);
            this.o = tintTextView;
            VKImageView vKImageView = (VKImageView) view2.findViewById(R.id.app_users);
            this.p = vKImageView;
            TextView textView = (TextView) view2.findViewById(R.id.footer_description);
            this.q = textView;
            this.r = view2.findViewById(R.id.separator);
            bwt0.i0(view2, new defpackage.h0(1, this, xd3.this));
            bwt0.i0(tintTextView, new wd3(0, this, xd3.this));
            frescoImageView.setScaleType(ScaleType.CENTER_CROP);
            frescoImageView.setCornerRadius(xd3.f);
            vKImageView.setRound(true);
            this.itemView.setOutlineProvider(new s0w0(xd3.d, 6));
            this.itemView.setClipToOutline(true);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setHighlightColor(-7829368);
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(SimpleAttachListItem simpleAttachListItem) {
            String string;
            Image Gb;
            ImageList imageList;
            Image Cb;
            SimpleAttachListItem simpleAttachListItem2 = simpleAttachListItem;
            this.s = simpleAttachListItem2;
            HistoryAttach historyAttach = simpleAttachListItem2.b;
            MiniAppSnippetDataAttach miniAppSnippetDataAttach = (MiniAppSnippetDataAttach) historyAttach.d;
            User user = historyAttach.e;
            String str = (user == null || (imageList = user.h) == null || (Cb = imageList.Cb(xd3.c, true)) == null) ? null : Cb.d;
            Long l = historyAttach.f;
            String i = pvo0.i(false, (int) (l != null ? l.longValue() : 0L), false, true);
            boolean z = user != null && user.b == o25.a().c().b;
            this.p.load(str);
            ImageList imageList2 = miniAppSnippetDataAttach.i;
            String str2 = miniAppSnippetDataAttach.f;
            FrescoImageView frescoImageView = this.l;
            if (imageList2 == null || (Gb = imageList2.Gb(xd3.e)) == null) {
                frescoImageView.n(null, null);
            } else {
                frescoImageView.setRemoteImage(Gb);
            }
            this.m.setText(miniAppSnippetDataAttach.c);
            this.n.setText(miniAppSnippetDataAttach.e);
            TintTextView tintTextView = this.o;
            tintTextView.setText(str2);
            bwt0.p0(tintTextView, str2 != null && (drm0.N(str2) ^ true));
            his0.v(tintTextView, miniAppSnippetDataAttach.d == MiniAppSnippetDataAttach.Type.GAME ? R.drawable.vk_icon_game_16 : R.drawable.vk_icon_services_16, 0);
            if (z) {
                string = this.itemView.getContext().getString(R.string.vk_im_integration_history_description_you, i);
            } else {
                string = (user != null ? user.g : null) == UserSex.FEMALE ? this.itemView.getContext().getString(R.string.vk_im_integration_history_description_female, user.Ab(UserNameCase.NOM), i) : user == null ? "" : this.itemView.getContext().getString(R.string.vk_im_integration_history_description_male, user.Ab(UserNameCase.NOM), i);
            }
            if (drm0.N(string)) {
                return;
            }
            List c0 = drm0.c0(string, new String[]{" "}, 0, 6);
            int length = ((String) j5g.Y(c0)).length();
            int a = k73.a(length, 1, (String) c0.get(1));
            SpannableString spannableString = new SpannableString(string);
            spannableString.setSpan(this.t, length, a, 18);
            TextView textView = this.q;
            textView.setText(spannableString);
            his0.n(textView, i, Integer.valueOf(e3m.f(R.attr.vk_legacy_accent, this.itemView.getContext())), new com.vk.movika.sdk.base.flow.binding.l(2, xd3.this, simpleAttachListItem2));
        }
    }

    public xd3(com.vk.movika.sdk.base.observable.e eVar, ul1 ul1Var) {
        this.a = eVar;
        this.b = ul1Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends SimpleAttachListItem> b(ViewGroup viewGroup) {
        return new a(bwt0.I(R.layout.vkim_history_attach_apps, viewGroup, false));
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return (hfzVar instanceof SimpleAttachListItem) && (((SimpleAttachListItem) hfzVar).b.d instanceof MiniAppSnippetDataAttach);
    }
}
