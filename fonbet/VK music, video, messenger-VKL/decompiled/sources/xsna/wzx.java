package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.gm50;
import xsna.yzx;

/* compiled from: JoinCallView.kt */
/* loaded from: classes7.dex */
public final class wzx implements gm50 {
    public final x9p b;
    public final s55 c;
    public final FragmentManager d;
    public final krh e;
    public final f5z f;
    public final a g;
    public final Context h;
    public final Object i = msy.a(LazyThreadSafetyMode.NONE, new qbj(this, 19));

    /* compiled from: JoinCallView.kt */
    public static final class a {
        public final Toolbar a;
        public final b b;
        public final View c;
        public final ProgressBar d;
        public final Button e;
        public final C3965a f;
        public final ProgressBar g;
        public final ViewFlipper h;

        /* compiled from: JoinCallView.kt */
        /* renamed from: xsna.wzx$a$a, reason: collision with other inner class name */
        public static final class C3965a {
            public final ViewFlipper a;
            public final ImageView b;
            public final ImageView c;
            public final FrameLayout d;

            public C3965a(ViewFlipper viewFlipper, ImageView imageView, ImageView imageView2, FrameLayout frameLayout) {
                this.a = viewFlipper;
                this.b = imageView;
                this.c = imageView2;
                this.d = frameLayout;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3965a)) {
                    return false;
                }
                C3965a c3965a = (C3965a) obj;
                return epx.f(this.a, c3965a.a) && epx.f(this.b, c3965a.b) && epx.f(this.c, c3965a.c) && epx.f(this.d, c3965a.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
            }

            public final String toString() {
                return "CameraCard(previewFlipper=" + this.a + ", cameraToggleButton=" + this.b + ", microphoneToggleButton=" + this.c + ", renderContainer=" + this.d + ')';
            }
        }

        /* compiled from: JoinCallView.kt */
        public static final class b {
            public final View a;
            public final TextView b;
            public final TextView c;
            public final AvatarView d;

            public b(View view, TextView textView, TextView textView2, AvatarView avatarView) {
                this.a = view;
                this.b = textView;
                this.c = textView2;
                this.d = avatarView;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
            }

            public final String toString() {
                return "JoinAsViews(joinAsButton=" + this.a + ", joinAsName=" + this.b + ", joinAsDescription=" + this.c + ", joinAsAvatar=" + this.d + ')';
            }
        }

        public a(Toolbar toolbar, b bVar, View view, ProgressBar progressBar, Button button, C3965a c3965a, ProgressBar progressBar2, ViewFlipper viewFlipper) {
            this.a = toolbar;
            this.b = bVar;
            this.c = view;
            this.d = progressBar;
            this.e = button;
            this.f = c3965a;
            this.g = progressBar2;
            this.h = viewFlipper;
        }
    }

    public wzx(View view, f5z f5zVar, x9p x9pVar, s55 s55Var, FragmentManager fragmentManager, krh krhVar) {
        this.b = x9pVar;
        this.c = s55Var;
        this.d = fragmentManager;
        this.e = krhVar;
        this.f = f5zVar;
        this.h = view.getContext();
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.join_call_root_toolbar);
        toolbar.setNavigationIcon(dhr0.t.b(R.drawable.vk_icon_cancel_outline_28, R.attr.vk_ui_icon_accent_themed));
        toolbar.setNavigationOnClickListener(new mo3(this, 7));
        bwt0.d(view.findViewById(R.id.voip_join_call_preview_render_container), cn70.c(30), (r4 & 2) != 0, (r4 & 4) != 0);
        View findViewById = view.findViewById(R.id.voip_join_call_join_as_btn);
        a.b bVar = new a.b(findViewById, (TextView) view.findViewById(R.id.voip_join_as_name), (TextView) view.findViewById(R.id.voip_join_as_description), (AvatarView) view.findViewById(R.id.voip_join_as_avatar));
        View findViewById2 = view.findViewById(R.id.voip_join_call_share_link_btn);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.transparent_progress_bar);
        Button button = (Button) view.findViewById(R.id.voip_join_call_btn);
        ViewFlipper viewFlipper = (ViewFlipper) view.findViewById(R.id.join_call_camera_card_view_flipper);
        ImageView imageView = (ImageView) view.findViewById(R.id.voip_join_call_camera_btn);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.voip_join_call_preview_render_container);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.voip_join_call_microphone_btn);
        a.C3965a c3965a = new a.C3965a(viewFlipper, imageView, imageView2, frameLayout);
        ProgressBar progressBar2 = (ProgressBar) view.findViewById(R.id.main_loading_progress_bar);
        ViewFlipper viewFlipper2 = (ViewFlipper) view.findViewById(R.id.join_call_main_view_flipper);
        this.g = new a(toolbar, bVar, findViewById2, progressBar, button, c3965a, progressBar2, viewFlipper2);
        bwt0.i0(findViewById, new ozh(this, 23));
        bwt0.i0(button, new x2e(this, 25));
        bwt0.i0(toolbar.findViewById(R.id.ongoing_call_scan_device_qr_code_button), new cqf(this, 27));
        bwt0.i0(findViewById2, new j9k(this, 23));
        bwt0.i0(imageView, new f1j(this, 21));
        bwt0.i0(imageView2, new g1j(this, 18));
        sp.z(viewFlipper2);
        sp.z(viewFlipper);
    }

    public final void a(fm50<? extends uzx> fm50Var) {
        a aVar = this.g;
        Toolbar toolbar = aVar.a;
        if (fm50Var instanceof yzx.c) {
            gm50.a.a(this, ((yzx.c) fm50Var).a, new n9(11, this, toolbar));
            return;
        }
        if (fm50Var instanceof yzx.b) {
            gm50.a.a(this, ((yzx.b) fm50Var).a, new l2k(this, 21));
        } else if (fm50Var instanceof yzx.a) {
            toolbar.setVisibility(0);
            b(dhr0.t.c(R.attr.vk_ui_background_content));
            sp.g(aVar.h, 2);
            gm50.a.a(this, ((yzx.a) fm50Var).a, new rmg(this, 17));
        }
    }

    public final void b(int i) {
        Window window;
        Activity h = e3m.h(this.h);
        if (h == null || (window = h.getWindow()) == null) {
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(i));
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.f;
    }
}
