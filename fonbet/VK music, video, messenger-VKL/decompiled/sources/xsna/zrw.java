package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.preference.Preference;
import com.vk.voip.ui.VoipHintsLauncher;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.i330;

/* compiled from: InCallHeaderViewsHolder.kt */
/* loaded from: classes7.dex */
public final class zrw implements tmg0, vgw0 {
    public final VoipHintsLauncher b;
    public final ViewGroup c;
    public final View d;
    public final View e;
    public final i330<b> f;
    public a g;
    public final mk5 h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public final TextView o;
    public final TextView p;
    public final View q;
    public final ImageView r;
    public final ImageView s;
    public final ImageView t;
    public final View u;
    public final ImageView v;
    public final ImageView w;
    public final EmptyList x;
    public final List<View> y;

    /* compiled from: InCallHeaderViewsHolder.kt */
    public interface a {
        void a();
    }

    /* compiled from: InCallHeaderViewsHolder.kt */
    public static final class b {
        public final Integer a;
        public final Integer b;

        public b(Integer num, Integer num2) {
            this.a = num;
            this.b = num2;
        }
    }

    public zrw(mjw0 mjw0Var, VoipHintsLauncher voipHintsLauncher) {
        this.b = voipHintsLauncher;
        ViewGroup viewGroup = (ViewGroup) mjw0Var.findViewById(R.id.in_call_header_container);
        this.c = viewGroup;
        View findViewById = viewGroup.findViewById(R.id.btn_header_join_room_title);
        this.d = findViewById;
        View findViewById2 = viewGroup.findViewById(R.id.btn_header_join_room_icon);
        this.e = findViewById2;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        byte b2 = 0;
        int i = 3;
        arrayList.add(new i330.b(asw.b, new wcg(this, 27), new pv7(b2, i)));
        arrayList.add(new i330.b(bsw.b, new zxo(this, 18), new pv7(b2, i)));
        this.f = new i330<>(arrayList, hashMap);
        mk5 mk5Var = new mk5();
        mk5Var.excludeTarget(R.id.tv_subtitle, true);
        mk5Var.excludeTarget(R.id.btn_header_open_users_screen_counter, true);
        this.h = mk5Var;
        this.k = true;
        TextView textView = (TextView) viewGroup.findViewById(R.id.btn_header_open_users_screen_counter);
        this.o = textView;
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.btn_header_open_chat_screen_counter);
        this.p = textView2;
        this.q = viewGroup.findViewById(R.id.btn_header_minimize);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.btn_header_open_chat_screen_icon);
        this.r = imageView;
        ImageView imageView2 = (ImageView) viewGroup.findViewById(R.id.btn_header_open_users_screen_icon);
        this.s = imageView2;
        ImageView imageView3 = (ImageView) viewGroup.findViewById(R.id.btn_header_switch_layout);
        this.t = imageView3;
        View findViewById3 = viewGroup.findViewById(R.id.btn_header_join_room);
        this.u = findViewById3;
        ImageView imageView4 = (ImageView) viewGroup.findViewById(R.id.btn_header_request_attention);
        this.v = imageView4;
        ImageView imageView5 = (ImageView) viewGroup.findViewById(R.id.btn_header_menu);
        this.w = imageView5;
        this.x = EmptyList.b;
        this.y = e43.l(imageView, textView2, imageView2, textView, imageView3, findViewById3, imageView4, imageView5, findViewById2, findViewById);
        viewGroup.setVisibility(8);
        findViewById3.setClipToOutline(true);
    }

    public static void c(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.i = i;
        bVar.v = i;
        bVar.t = -1;
        bVar.l = -1;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = cn70.b(8);
        bVar.setMarginEnd(cn70.b(4));
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = cn70.b(0);
        bVar.setMarginStart(cn70.b(0));
        view.setLayoutParams(bVar);
    }

    public static void d(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.t = i;
        bVar.l = i;
        bVar.v = -1;
        bVar.i = -1;
        bVar.setMarginStart(cn70.b(8));
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = cn70.b(4);
        bVar.setMarginEnd(cn70.b(0));
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = cn70.b(0);
        view.setLayoutParams(bVar);
    }

    public static void e(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.l = i;
        bVar.v = i;
        bVar.i = -1;
        bVar.t = -1;
        bVar.setMarginEnd(cn70.b(8));
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = cn70.b(4);
        bVar.setMarginStart(cn70.b(0));
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = cn70.b(0);
        view.setLayoutParams(bVar);
    }

    public static void f(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.i = i;
        bVar.t = i;
        bVar.v = -1;
        bVar.l = -1;
        bVar.setMarginStart(cn70.b(8));
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = cn70.b(4);
        bVar.setMarginEnd(cn70.b(0));
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = cn70.b(0);
        view.setLayoutParams(bVar);
    }

    @Override // xsna.vgw0
    public final View a() {
        return this.c;
    }

    @Override // xsna.vgw0
    public final boolean b() {
        return this.j;
    }

    public final void g() {
        this.k = false;
        k();
        View view = this.u;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).height = cn70.b(61);
        ((ViewGroup.MarginLayoutParams) bVar).width = cn70.b(48);
        view.setLayoutParams(bVar);
        float c = cn70.c(-8);
        view.setTranslationX(c);
        View view2 = this.e;
        view2.setTranslationX(c);
        float c2 = cn70.c(-6);
        view.setTranslationY(c2);
        view2.setTranslationY(c2);
    }

    @Override // xsna.tmg0
    public final List<View> getAnimatedViewsToRotate() {
        return this.y;
    }

    @Override // xsna.tmg0
    public final List<View> getViewsToRotate() {
        return this.x;
    }

    public final void h() {
        this.k = true;
        k();
        View view = this.u;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).height = cn70.b(68);
        ((ViewGroup.MarginLayoutParams) bVar).width = cn70.b(61);
        view.setLayoutParams(bVar);
        view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        View view2 = this.e;
        view2.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        view2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final void i(boolean z) {
        int i = 8;
        this.r.setVisibility(z ? 0 : 8);
        this.p.setVisibility(z ? 0 : 8);
        this.t.setVisibility(z ? 0 : 8);
        if (!(Preference.m(0L, "voip_prefs_shared", "slider_moved") != 0) && z) {
            i = 0;
        }
        this.w.setVisibility(i);
    }

    public final void j() {
        this.u.setVisibility(this.m && this.l ? 0 : 8);
        int i = this.m && this.l ? 0 : 8;
        View view = this.e;
        view.setVisibility(i);
        k();
        boolean z = this.n;
        rdi.B(view, z);
        rdi.B(this.d, z);
    }

    public final void k() {
        this.d.setVisibility((this.m && this.l && this.k) ? 0 : 8);
    }

    @Override // xsna.tmg0, xsna.j6m
    public final void v0(float f) {
        super.v0(f);
        TextView textView = this.p;
        TextView textView2 = this.o;
        if (f == 270.0f) {
            f(R.id.btn_header_open_users_screen_icon, textView2);
            f(R.id.btn_header_open_chat_screen_icon, textView);
            g();
        } else if (f == 180.0f) {
            d(R.id.btn_header_open_users_screen_icon, textView2);
            d(R.id.btn_header_open_chat_screen_icon, textView);
            h();
        } else if (f == 90.0f) {
            e(R.id.btn_header_open_users_screen_icon, textView2);
            e(R.id.btn_header_open_chat_screen_icon, textView);
            g();
        } else {
            c(R.id.btn_header_open_users_screen_icon, textView2);
            c(R.id.btn_header_open_chat_screen_icon, textView);
            h();
        }
    }
}
