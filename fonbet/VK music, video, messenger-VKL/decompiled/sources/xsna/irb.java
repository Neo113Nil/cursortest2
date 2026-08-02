package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.apps.BuildInfo;
import com.vk.core.tool.view.disableable.DisableableRelativeLayout;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.components.dialog_header.DialogHeaderController;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.im.ui.views.chat.QuickActionsListView;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import xsna.hfr;
import xsna.nyb;

/* compiled from: ChatFragmentPreviewController.kt */
/* loaded from: classes2.dex */
public final class irb {
    public final AppCompatActivity a;
    public final mxv b;
    public final zdw c;
    public final DialogExt d;
    public final Peer e;
    public View g;
    public ChatFragment h;
    public Bitmap i;
    public boolean j;
    public owt0 l;
    public final nyb m;
    public final d n;
    public final int f = iah0.a(56);
    public final a k = new a();

    /* compiled from: ChatFragmentPreviewController.kt */
    public static final class a extends ViewOutlineProvider {
        public final Rect a = new Rect();

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            int width = view.getWidth();
            int height = view.getHeight();
            Rect rect = this.a;
            rect.set(0, 0, width, height);
            outline.setRoundRect(rect, iah0.a(16));
        }
    }

    /* compiled from: ChatFragmentPreviewController.kt */
    public static final class b extends LayerDrawable {
        public final Bitmap b;
        public final Drawable c;

        public b(Context context, Bitmap bitmap) {
            super(new Drawable[]{new BitmapDrawable(context.getResources(), bitmap), new ColorDrawable(e3m.f(R.attr.vk_ui_background, context))});
            this.b = bitmap;
            this.c = getDrawable(1);
        }
    }

    /* compiled from: ChatFragmentPreviewController.kt */
    public interface c {
        void b(DialogExt dialogExt, lse0 lse0Var);
    }

    /* compiled from: ChatFragmentPreviewController.kt */
    public static final class d extends FragmentManager.m {
        public d() {
        }

        @Override // androidx.fragment.app.FragmentManager.m
        public final void b(FragmentManager fragmentManager, Fragment fragment) {
            if (fragment instanceof ChatFragment) {
                return;
            }
            irb.this.e();
        }

        @Override // androidx.fragment.app.FragmentManager.m
        public final void c(FragmentManager fragmentManager, Fragment fragment) {
            if (fragment instanceof ChatFragment) {
                irb.this.e();
            }
        }

        @Override // androidx.fragment.app.FragmentManager.m
        public final void i(Fragment fragment) {
            View view;
            Object obj;
            QuickActionsListView quickActionsListView;
            if (fragment instanceof ChatFragment) {
                ChatFragment chatFragment = (ChatFragment) fragment;
                irb irbVar = irb.this;
                AppCompatActivity appCompatActivity = irbVar.a;
                irbVar.h = chatFragment;
                View view2 = chatFragment.getView();
                Object parent = view2 != null ? view2.getParent() : null;
                View view3 = parent instanceof View ? (View) parent : null;
                if (view3 == null) {
                    return;
                }
                irbVar.g = view3;
                ChatFragment chatFragment2 = irbVar.h;
                if (chatFragment2 == null || (view = chatFragment2.getView()) == null) {
                    return;
                }
                nyb nybVar = irbVar.m;
                ViewGroup viewGroup = (ViewGroup) view;
                kkm oo = chatFragment.oo();
                nybVar.getClass();
                ViewStub viewStub = (ViewStub) viewGroup.findViewById(R.id.dialog_preview_quick_actions_stub);
                int i = 0;
                if (viewStub != null) {
                    quickActionsListView = (QuickActionsListView) viewStub.inflate();
                } else {
                    QuickActionsListView quickActionsListView2 = (QuickActionsListView) viewGroup.findViewById(R.id.dialog_preview_quick_actions_inflated);
                    if (quickActionsListView2 == null) {
                        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.bottom_panel_container);
                        if (viewGroup2 == null) {
                            throw new NullPointerException("Not find bottomPanelContainer");
                        }
                        StringBuilder sb = new StringBuilder();
                        while (i < viewGroup2.getChildCount()) {
                            int i2 = i + 1;
                            View childAt = viewGroup2.getChildAt(i);
                            try {
                                obj = childAt.getContext().getResources().getResourceName(childAt.getId());
                            } catch (Throwable unused) {
                                obj = null;
                            }
                            if (obj == null) {
                                obj = Integer.valueOf(childAt.getId());
                            }
                            sb.append(childAt.getClass().getSimpleName() + " id " + obj + ' ');
                            i = i2;
                        }
                        throw new NullPointerException("Not find view with id = 2131364713 \n in bottomPanel = \n ".concat(sb.toString()));
                    }
                    quickActionsListView = quickActionsListView2;
                }
                List<lse0> list = nybVar.i;
                quickActionsListView.getClass();
                hfr.a aVar = new hfr.a(rli0.k(new jxt0(quickActionsListView), nse0.class));
                while (aVar.hasNext()) {
                    quickActionsListView.removeView((nse0) aVar.next());
                }
                Iterator it = j5g.H0(list, 5).iterator();
                while (it.hasNext()) {
                    nse0 nse0Var = new nse0(quickActionsListView.getContext(), (lse0) it.next(), oo);
                    nse0Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
                    quickActionsListView.addView(nse0Var);
                }
                nybVar.k = quickActionsListView;
                quickActionsListView.setVisibility(0);
                viewGroup.setScaleX(0.8f);
                viewGroup.setScaleY(0.8f);
                viewGroup.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                viewGroup.setElevation(iah0.a(24));
                viewGroup.setOutlineProvider(irbVar.k);
                viewGroup.setClipToOutline(true);
                viewGroup.setBackground(new ColorDrawable(e3m.f(R.attr.vk_ui_background_content, appCompatActivity)));
                b bVar = new b(appCompatActivity, irbVar.i);
                View view4 = irbVar.g;
                if (view4 != null) {
                    view4.setBackground(bVar);
                }
                irbVar.l = awt0.t(view, new grb(irbVar, view, bVar, 0));
            }
        }
    }

    public irb(AppCompatActivity appCompatActivity, mxv mxvVar, zdw zdwVar, DialogExt dialogExt, Peer peer, List<lse0> list, c cVar) {
        this.a = appCompatActivity;
        this.b = mxvVar;
        this.c = zdwVar;
        this.d = dialogExt;
        this.e = peer;
        this.m = new nyb(list, new erb(0, cVar, this));
        d dVar = new d();
        this.n = dVar;
        appCompatActivity.getSupportFragmentManager().c0(dVar, false);
    }

    public final void a() {
        ChatFragment chatFragment = this.h;
        View view = chatFragment != null ? chatFragment.getView() : null;
        if (view == null) {
            e();
            return;
        }
        View view2 = this.g;
        Object background = view2 != null ? view2.getBackground() : null;
        b bVar = background instanceof b ? (b) background : null;
        bwt0.U(view, this.l);
        view.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).scaleX(0.8f).scaleY(0.8f).setDuration(150L).setInterpolator(new j8z()).setUpdateListener(new frb(bVar, 0)).withStartAction(new ef2(this, 4)).withEndAction(new n93(this, 2)).start();
        this.m.H0();
    }

    public final void b(float f) {
        ChatFragment chatFragment;
        View view;
        if (this.j || (chatFragment = this.h) == null || (view = chatFragment.getView()) == null) {
            return;
        }
        float abs = (Math.abs(Math.min(f / (view.getHeight() * 0.1f), 1.0f)) * 0.1f) + 0.9f;
        view.setScaleY(abs);
        view.setScaleX(abs);
    }

    public final void c(MotionEvent motionEvent) {
        nyb nybVar = this.m;
        nybVar.getClass();
        if (!mnh0.o(motionEvent)) {
            if (mnh0.q(motionEvent)) {
                nse0 X0 = nybVar.X0(motionEvent);
                if (X0 == null) {
                    nybVar.Y0();
                    return;
                }
                erb erbVar = nybVar.j;
                if (erbVar != null) {
                    ((c) erbVar.c).b(((irb) erbVar.d).d, X0.getAction());
                    return;
                }
                return;
            }
            return;
        }
        nse0 X02 = nybVar.X0(motionEvent);
        if (X02 == null) {
            nybVar.Y0();
            return;
        }
        nyb.a aVar = nybVar.l;
        if (epx.f(aVar != null ? aVar.a : null, X02.getAction())) {
            return;
        }
        nybVar.Y0();
        mse0 mse0Var = new mse0();
        if (mse0Var.a == null) {
            Context context = X02.getContext();
            lse0 action = X02.getAction();
            TextView textView = new TextView(context);
            textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            textView.setText(action.c);
            com.vk.typography.b.k(textView, FontFamily.MEDIUM, Float.valueOf(12.0f), 4);
            his0.x(textView, R.color.vk_white);
            int b2 = cn70.b(8);
            textView.setPadding(b2, b2, b2, b2);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(cn70.b(4));
            gradientDrawable.setColor(context.getColor(R.color.vk_black_alpha60));
            textView.setBackground(gradientDrawable);
            PopupWindow popupWindow = new PopupWindow(textView, -2, -2);
            popupWindow.setAnimationStyle(R.style.QuickActionPopupAnimation);
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
            View contentView = popupWindow.getContentView();
            contentView.measure(0, 0);
            int measuredWidth = contentView.getMeasuredWidth();
            int measuredHeight = contentView.getMeasuredHeight();
            float width = X02.getWidth();
            float scaleX = X02.getScaleX();
            ViewParent parent = X02.getParent();
            while (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                scaleX *= viewGroup.getScaleX();
                parent = viewGroup.getParent();
            }
            int i = (int) (((width * scaleX) / 2.0f) - (measuredWidth / 2.0f));
            int b3 = cn70.b(4);
            Rect b4 = f4m.b((View) X02.getParent());
            int centerX = b4.centerX();
            Rect b5 = f4m.b(X02);
            int centerX2 = b5.centerX();
            int i2 = b5.left + i;
            if (centerX2 <= centerX) {
                int i3 = (b4.left + b3) - i2;
                if (i3 > 0) {
                    i += i3;
                }
            } else {
                int i4 = (i2 + measuredWidth) - (b4.right - b3);
                if (i4 > 0) {
                    i -= i4;
                }
            }
            Pair pair = new Pair(Integer.valueOf(i), Integer.valueOf(-(cn70.b(8) + X02.getHeight() + measuredHeight)));
            int intValue = ((Number) pair.d()).intValue();
            int intValue2 = ((Number) pair.g()).intValue();
            X02.performHapticFeedback(0);
            popupWindow.showAsDropDown(X02, intValue, intValue2);
            mse0Var.a = popupWindow;
        }
        nybVar.l = new nyb.a(X02.getAction(), mse0Var);
    }

    public final void d() {
        View view;
        ChatFragment chatFragment = this.h;
        if (chatFragment == null || (view = chatFragment.getView()) == null) {
            return;
        }
        this.c.d.f().a(this.d.e);
        d3m.b(view, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
        bwt0.U(view, this.l);
        boolean z = false;
        view.performHapticFeedback(0, 2);
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setBackground(null);
        view.setOutlineProvider(null);
        ((View) view.getParent()).setBackground(null);
        view.animate().scaleX(1.08f).scaleY(1.08f).setDuration(100L).withStartAction(new o93(this, 2)).withEndAction(new jx8(1, this, view)).start();
        ChatFragment chatFragment2 = this.h;
        if (chatFragment2 != null) {
            chatFragment2.d0 = 0;
            View view2 = chatFragment2.Y0;
            if (view2 == null) {
                view2 = null;
            }
            bwt0.p0(view2, true);
            DialogExt dialogExt = chatFragment2.V;
            if (dialogExt == null) {
                dialogExt = null;
            }
            chatFragment2.Mo(0, dialogExt);
            ViewGroup viewGroup = chatFragment2.U0;
            if (viewGroup == null) {
                viewGroup = null;
            }
            bwt0.p0(viewGroup, true);
            chatFragment2.y = true;
            com.vk.im.ui.components.msg_list.a aVar = chatFragment2.H0;
            if (aVar == null) {
                aVar = null;
            }
            aVar.g2(true);
            com.vk.im.ui.components.msg_list.a aVar2 = chatFragment2.H0;
            if (aVar2 == null) {
                aVar2 = null;
            }
            if (!aVar2.p) {
                aVar2.p = true;
                Collection<Msg> t1 = aVar2.t1();
                if (!t1.isEmpty()) {
                    aVar2.K1((Msg) j5g.h0(t1));
                }
            }
            com.vk.im.ui.components.msg_list.a aVar3 = chatFragment2.H0;
            if (aVar3 == null) {
                aVar3 = null;
            }
            aVar3.u = true;
            vm30 vm30Var = aVar3.o;
            if (vm30Var != null) {
                vm30Var.A(true);
            }
            DialogHeaderController dialogHeaderController = chatFragment2.K0;
            if (dialogHeaderController == null) {
                dialogHeaderController = null;
            }
            FragmentActivity kn = chatFragment2.kn();
            HashSet hashSet = iah0.a;
            if (!fnj.d(kn) && chatFragment2.d0 != 2) {
                z = true;
            }
            dialogHeaderController.n(z);
            imv imvVar = chatFragment2.J0;
            if (imvVar == null) {
                imvVar = null;
            }
            imvVar.j(true);
            DisableableRelativeLayout disableableRelativeLayout = chatFragment2.T0;
            (disableableRelativeLayout != null ? disableableRelativeLayout : null).setTouchEnabled(true);
        }
        e();
    }

    public final void e() {
        Bitmap bitmap;
        View view = this.g;
        Drawable background = view != null ? view.getBackground() : null;
        b bVar = background instanceof b ? (b) background : null;
        if (bVar != null && (bitmap = bVar.b) != null) {
            bitmap.recycle();
        }
        View view2 = this.g;
        if (view2 != null) {
            view2.setBackground(null);
        }
        this.g = null;
        ChatFragment chatFragment = this.h;
        if (chatFragment != null) {
            View view3 = chatFragment.getView();
            if (view3 != null) {
                bwt0.U(view3, this.l);
                d3m.b(view3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
            }
            this.h = null;
        }
        this.m.G0();
        this.a.getSupportFragmentManager().r0(this.n);
        this.j = false;
        this.i = null;
    }

    public final void f() {
        Bitmap bitmap;
        AppCompatActivity appCompatActivity = this.a;
        View findViewById = appCompatActivity.findViewById(android.R.id.content);
        if (findViewById.getWidth() == 0 || findViewById.getHeight() == 0) {
            bitmap = null;
        } else {
            int k = BuildInfo.t() ? iah0.k(appCompatActivity) : 0;
            bitmap = Bitmap.createBitmap((int) (findViewById.getWidth() * 1.0f), (int) ((findViewById.getHeight() - k) * 1.0f), Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(bitmap);
            canvas.scale(1.0f, 1.0f);
            canvas.drawColor(e3m.f(R.attr.vk_ui_background_content, appCompatActivity));
            canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -k);
            findViewById.draw(canvas);
        }
        this.i = bitmap;
        uim f = this.c.d.f();
        DialogExt dialogExt = this.d;
        f.b(dialogExt.e);
        o0w.x(this.b.b(), this.a, Long.valueOf(this.e.b), dialogExt.e, dialogExt, null, null, false, null, null, null, null, null, null, "preview", null, null, null, false, null, null, null, null, null, 1069539312);
    }
}
