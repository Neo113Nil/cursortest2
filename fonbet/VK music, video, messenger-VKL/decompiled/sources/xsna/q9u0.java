package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.im.ui.views.MentionCounterView;
import com.vk.im.ui.views.dialogs.DialogsGroupItemView;
import com.vk.imageloader.view.VKImageView;
import com.vk.pullfromtopofrecycler.PullFromTopMode;
import com.vk.pullfromtopofrecycler.coordinator.PullFromTopLinearLayout;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.owm;
import xsna.snx;

/* compiled from: VkAppDialogsToolbarViewController.kt */
/* loaded from: classes18.dex */
public final class q9u0 extends fi6<pwm, owm> {
    public final fwm f;
    public final mbs g;
    public final boolean h;
    public final n9u0 i;
    public VkTopBar j;
    public ViewGroup k;
    public VKImageView l;
    public TextView m;
    public View n;
    public View o;
    public MentionCounterView p;
    public ImageView q;
    public DialogsGroupItemView r;
    public PullFromTopLinearLayout s;
    public PullFromTopLinearLayout t;
    public PullFromTopLinearLayout u;
    public View v;
    public boolean w;
    public final myd0 x;
    public final r9u0 y;

    /* compiled from: VkAppDialogsToolbarViewController.kt */
    public static final class a {
        public final int a;
        public final owm b;

        public a(int i, owm owmVar) {
            this.a = i;
            this.b = owmVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return Boolean.hashCode(true) + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
        }

        public final String toString() {
            return "BarAction(id=" + this.a + ", action=" + this.b + ", isEnabled=true)";
        }
    }

    /* compiled from: VkAppDialogsToolbarViewController.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PullFromTopMode.values().length];
            try {
                iArr[PullFromTopMode.ALWAYS_HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PullFromTopMode.ALWAYS_VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PullFromTopMode.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public q9u0(int i, fwm fwmVar, mbs mbsVar, boolean z, n9u0 n9u0Var) {
        super(i, new my3(R.id.dialogs_toolbar_container, Integer.valueOf(R.layout.vk_app_dialogs_toolbar_stub)));
        this.f = fwmVar;
        this.g = mbsVar;
        this.h = z;
        this.i = n9u0Var;
        this.x = new myd0(this, 25);
        this.y = new r9u0(this);
    }

    @Override // xsna.fi6
    public final void P(View view, View view2) {
        view2.setLayoutParams(new CoordinatorLayout.f(view.getLayoutParams()));
    }

    @Override // xsna.fi6
    public final void Q(View view) {
        if (this.h) {
            VkTopBar vkTopBar = (VkTopBar) view.findViewById(R.id.dialogs_toolbar);
            this.j = vkTopBar;
            vkTopBar.setViewCompositionStrategy(sv1.g(vkTopBar.getContext()));
        } else {
            this.k = (ViewGroup) view.findViewById(R.id.dialogs_toolbar);
            this.m = (TextView) view.findViewById(R.id.title);
            ((ImageView) view.findViewById(R.id.search_icon)).setOnClickListener(new uzb(this, 12));
            VKImageView vKImageView = (VKImageView) view.findViewById(R.id.icon_avatar);
            this.l = vKImageView;
            bwt0.i0(vKImageView, new bjm0(this, 14));
            VKImageView vKImageView2 = this.l;
            if (vKImageView2 == null) {
                vKImageView2 = null;
            }
            bwt0.k0(vKImageView2, new olt0(this, 2));
            View findViewById = view.findViewById(R.id.tags_icon);
            this.o = findViewById;
            bwt0.i0(findViewById, new lyl0(this, 17));
            this.n = view.findViewById(R.id.vkim_archive_group_icon);
            MentionCounterView mentionCounterView = (MentionCounterView) view.findViewById(R.id.vkim_archive_counter);
            this.p = mentionCounterView;
            mentionCounterView.setMuted(true);
            View view2 = this.n;
            if (view2 == null) {
                view2 = null;
            }
            bwt0.i0(view2, new xka0(this, 27));
            ImageView imageView = (ImageView) view.findViewById(R.id.new_call_icon);
            this.q = imageView;
            bwt0.i0(imageView, new hij0(this, 20));
            ImageView imageView2 = this.q;
            if (imageView2 == null) {
                imageView2 = null;
            }
            Drawable e = enj.e(R.drawable.vk_icon_phone_outline_28, R.attr.vk_ui_text_accent_themed, imageView2.getContext());
            ImageView imageView3 = this.q;
            (imageView3 != null ? imageView3 : null).setImageDrawable(e);
        }
        PullFromTopLinearLayout pullFromTopLinearLayout = (PullFromTopLinearLayout) view.findViewById(R.id.business_pull_from_top_layout);
        this.s = pullFromTopLinearLayout;
        PullFromTopMode pullFromTopMode = PullFromTopMode.ALWAYS_HIDDEN;
        pullFromTopLinearLayout.setMode(pullFromTopMode);
        DialogsGroupItemView dialogsGroupItemView = (DialogsGroupItemView) view.findViewById(R.id.business_notification_plate);
        this.r = dialogsGroupItemView;
        bwt0.i0(dialogsGroupItemView, new vgs0(this, 5));
        this.t = (PullFromTopLinearLayout) view.findViewById(R.id.pull_divider_top);
        this.u = (PullFromTopLinearLayout) view.findViewById(R.id.pull_divider_bottom);
        T(pullFromTopMode, false);
        mbs mbsVar = this.g;
        if (mbsVar != null) {
            mbsVar.a(this.y);
        }
        U();
    }

    public final VkTopBar.a.b.C0877b R(a aVar) {
        return new VkTopBar.a.b.C0877b(new gko(aVar.a), null, new a94(20, this, aVar), null, null, com.vk.core.compose.component.semantics.b.a(null, new wfl0(6), 3), 26);
    }

    public final ViewGroup S() {
        View view;
        if (!this.h ? (view = this.k) == null : (view = this.j) == null) {
            view = null;
        }
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof CoordinatorLayout)) {
            parent = parent.getParent();
        }
        if (parent != null) {
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                return viewGroup;
            }
        }
        VkTopBar vkTopBar = this.j;
        return (ViewGroup) (vkTopBar != null ? vkTopBar : null).getParent();
    }

    public final void T(PullFromTopMode pullFromTopMode, boolean z) {
        if (!z) {
            PullFromTopLinearLayout pullFromTopLinearLayout = this.t;
            if (pullFromTopLinearLayout == null) {
                pullFromTopLinearLayout = null;
            }
            pullFromTopLinearLayout.setVisibility(8);
            PullFromTopLinearLayout pullFromTopLinearLayout2 = this.u;
            if (pullFromTopLinearLayout2 == null) {
                pullFromTopLinearLayout2 = null;
            }
            pullFromTopLinearLayout2.setVisibility(8);
        }
        PullFromTopLinearLayout pullFromTopLinearLayout3 = this.t;
        if (pullFromTopLinearLayout3 == null) {
            pullFromTopLinearLayout3 = null;
        }
        pullFromTopLinearLayout3.setMode(pullFromTopMode);
        PullFromTopLinearLayout pullFromTopLinearLayout4 = this.u;
        (pullFromTopLinearLayout4 != null ? pullFromTopLinearLayout4 : null).setMode(pullFromTopMode);
    }

    public final void U() {
        boolean z = this.h;
        myd0 myd0Var = this.x;
        fwm fwmVar = this.f;
        if (!z) {
            ImageView imageView = this.q;
            if (imageView != null) {
                q7v0 q7v0Var = fwmVar.a;
                q7v0Var.init();
                q7v0Var.c(new k14(fwmVar, imageView, myd0Var, 5));
                return;
            }
            return;
        }
        VkTopBar vkTopBar = this.j;
        if (vkTopBar != null) {
            x9l0 x9l0Var = new x9l0(this, 18);
            q7v0 q7v0Var2 = fwmVar.a;
            q7v0Var2.init();
            q7v0Var2.c(new dwm(fwmVar, vkTopBar, x9l0Var, myd0Var, 0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0294, code lost:
    
        if (r2.getVisibility() == 0) goto L141;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a2  */
    @Override // xsna.wn50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(ao50 ao50Var) {
        boolean z;
        PullFromTopLinearLayout pullFromTopLinearLayout;
        DialogsGroupItemView dialogsGroupItemView;
        PullFromTopLinearLayout pullFromTopLinearLayout2;
        int i;
        View view;
        String string;
        boolean z2;
        VkTopBar.c.a aVar;
        VkTopBar.l lVar;
        VkTopBar.l cVar;
        VkTopBar vkTopBar;
        pwm pwmVar = (pwm) ao50Var;
        int i2 = pwmVar.i;
        int i3 = pwmVar.e;
        boolean z3 = pwmVar.d;
        boolean z4 = pwmVar.f;
        boolean z5 = pwmVar.a;
        sr5 sr5Var = pwmVar.m;
        boolean z6 = pwmVar.c;
        ezo0 ezo0Var = pwmVar.g;
        View view2 = null;
        boolean z7 = this.h;
        if (z7) {
            VkTopBar vkTopBar2 = this.j;
            if (vkTopBar2 == null) {
                vkTopBar2 = null;
            }
            Context context = vkTopBar2.getContext();
            if (ezo0Var instanceof tzo0) {
                string = context.getString(((tzo0) ezo0Var).a);
            } else if (ezo0Var instanceof vzo0) {
                string = ((vzo0) ezo0Var).a;
            } else {
                if (!(ezo0Var instanceof l4j0)) {
                    throw new IllegalArgumentException("Unsupported type " + ezo0Var);
                }
                string = context.getString(R.string.vkim_edu_dialogs_title);
            }
            String str = string;
            VkTopBar vkTopBar3 = this.j;
            if (vkTopBar3 == null) {
                vkTopBar3 = null;
            }
            vkTopBar3.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(str, (e4) null, (VkTopBar.Middle.Text.Title.a) null, (VkTopBar.Middle.Text.Title.Size) null, 14), null, null, null, 14));
            VkTopBar vkTopBar4 = this.j;
            if (vkTopBar4 == null) {
                vkTopBar4 = null;
            }
            if (sr5Var == null) {
                z2 = z4;
                aVar = null;
            } else {
                String str2 = sr5Var.b;
                if (str2 == null) {
                    str2 = "";
                }
                z2 = z4;
                aVar = new VkTopBar.c.a(new snx(new snx.b.c(new vlw(str2, null), null, null, 14)), new d8t0(this, 4), null, new iml0(this, 23), com.vk.core.compose.component.semantics.b.a(null, new oan0(10), 3), 4);
            }
            vkTopBar4.setBefore(aVar);
            VkTopBar vkTopBar5 = this.j;
            if (vkTopBar5 == null) {
                vkTopBar5 = null;
            }
            vkTopBar5.setBack(pwmVar.b ? new VkTopBar.b(new rrn0(this, 25), tq.h(tlo0.Companion, R.string.talkback_ic_back), null, null, null, 28) : null);
            a aVar2 = z6 ? new a(R.drawable.vk_icon_hashtag_outline_24, owm.j.b) : new a(R.drawable.vk_icon_search_outline_28, owm.i.b);
            VkTopBar.a.c.f fVar = new VkTopBar.a.c.f(new gko(aVar2.a), null, new dsp0(3, this, aVar2), null, null, com.vk.core.compose.component.semantics.b.a(null, new bws(26), 3), 26);
            VkTopBar.a.b.C0877b R = z6 ? R(new a(R.drawable.vk_icon_search_outline_28, owm.i.b)) : z5 ? R(new a(R.drawable.vk_icon_phone_outline_24, owm.g.b)) : null;
            if (z2) {
                cVar = new VkTopBar.l.b(VkContentBadge.Appearance.Design.Neutral, new gko(R.drawable.vk_icon_mention_16));
            } else if (i3 > 0) {
                cVar = new VkTopBar.l.c(i3, VkCounter.CounterAppearance.Appearance.Neutral, VkCounter.Mode.Primary, 8);
            } else {
                lVar = null;
                VkTopBar.a.b.C0877b c0877b = !z3 ? new VkTopBar.a.b.C0877b(new gko(R.drawable.vk_icon_archive_outline_28), null, new pyr0(this, 11), lVar, null, com.vk.core.compose.component.semantics.b.a(SemanticsConfiguration.Mode.Merge, new oqt0(2), 2), 18) : null;
                vkTopBar = this.j;
                if (vkTopBar == null) {
                    vkTopBar = null;
                }
                vkTopBar.setAfter(new VkTopBar.a.d(fVar, R, c0877b));
            }
            lVar = cVar;
            if (!z3) {
            }
            vkTopBar = this.j;
            if (vkTopBar == null) {
            }
            vkTopBar.setAfter(new VkTopBar.a.d(fVar, R, c0877b));
        } else {
            if (ezo0Var instanceof tzo0) {
                TextView textView = this.m;
                if (textView == null) {
                    textView = null;
                }
                textView.setText(((tzo0) ezo0Var).a);
            } else if (ezo0Var instanceof vzo0) {
                TextView textView2 = this.m;
                if (textView2 == null) {
                    textView2 = null;
                }
                textView2.setText(((vzo0) ezo0Var).a);
            } else if (ezo0Var instanceof l4j0) {
                TextView textView3 = this.m;
                if (textView3 == null) {
                    textView3 = null;
                }
                ((l4j0) ezo0Var).getClass();
                textView3.setText(R.string.vkim_edu_dialogs_title);
            }
            if (z4) {
                MentionCounterView mentionCounterView = this.p;
                if (mentionCounterView == null) {
                    mentionCounterView = null;
                }
                mentionCounterView.i();
            } else {
                MentionCounterView mentionCounterView2 = this.p;
                if (mentionCounterView2 == null) {
                    mentionCounterView2 = null;
                }
                mentionCounterView2.setCounter(i3);
            }
            MentionCounterView mentionCounterView3 = this.p;
            if (mentionCounterView3 == null) {
                mentionCounterView3 = null;
            }
            mentionCounterView3.setVisibility((z4 || i3 > 0) ? 0 : 8);
            View view3 = this.n;
            if (view3 == null) {
                view3 = null;
            }
            awt0.v(view3, z3);
            ImageView imageView = this.q;
            if (imageView == null) {
                imageView = null;
            }
            awt0.v(imageView, z5);
            View view4 = this.o;
            if (view4 == null) {
                view4 = null;
            }
            awt0.v(view4, z6);
            if (sr5Var != null) {
                VKImageView vKImageView = this.l;
                if (vKImageView == null) {
                    vKImageView = null;
                }
                z = false;
                vKImageView.setVisibility(0);
                VKImageView vKImageView2 = this.l;
                if (vKImageView2 == null) {
                    vKImageView2 = null;
                }
                vKImageView2.load(sr5Var.b);
                PullFromTopMode pullFromTopMode = pwmVar.h ? PullFromTopMode.ALWAYS_HIDDEN : i2 > 0 ? PullFromTopMode.ALWAYS_VISIBLE : PullFromTopMode.DEFAULT;
                pullFromTopLinearLayout = this.s;
                if (pullFromTopLinearLayout == null) {
                    pullFromTopLinearLayout = null;
                }
                pullFromTopLinearLayout.setMode(pullFromTopMode);
                dialogsGroupItemView = this.r;
                if (dialogsGroupItemView == null) {
                    dialogsGroupItemView = null;
                }
                dialogsGroupItemView.setCounter(i2);
                pullFromTopLinearLayout2 = this.s;
                if (pullFromTopLinearLayout2 == null) {
                    pullFromTopLinearLayout2 = null;
                }
                i = b.$EnumSwitchMapping$0[pullFromTopLinearLayout2.getMode().ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    z = true;
                }
                T(pullFromTopMode, z);
                if (pwmVar.o) {
                    View view5 = this.v;
                    if (view5 != null) {
                        S().removeView(view5);
                    }
                    this.v = null;
                    return;
                }
                if (this.v != null) {
                    return;
                }
                if (!z7 ? (view = this.k) != null : (view = this.j) != null) {
                    view2 = view;
                }
                View view6 = (View) this.i.invoke(Integer.valueOf(view2.getWidth() - cn70.b(8)), Integer.valueOf(view2.getHeight()), new s9u0(this));
                S().addView(view6);
                this.v = view6;
                return;
            }
            VKImageView vKImageView3 = this.l;
            if (vKImageView3 == null) {
                vKImageView3 = null;
            }
            vKImageView3.setVisibility(8);
        }
        z = false;
        if (pwmVar.h) {
        }
        pullFromTopLinearLayout = this.s;
        if (pullFromTopLinearLayout == null) {
        }
        pullFromTopLinearLayout.setMode(pullFromTopMode);
        dialogsGroupItemView = this.r;
        if (dialogsGroupItemView == null) {
        }
        dialogsGroupItemView.setCounter(i2);
        pullFromTopLinearLayout2 = this.s;
        if (pullFromTopLinearLayout2 == null) {
        }
        i = b.$EnumSwitchMapping$0[pullFromTopLinearLayout2.getMode().ordinal()];
        if (i != 1) {
        }
        T(pullFromTopMode, z);
        if (pwmVar.o) {
        }
    }

    @Override // xsna.fi6, xsna.wn50
    public final void onDestroyView() {
        super.onDestroyView();
        View view = this.v;
        if (view != null) {
            S().removeView(view);
        }
        this.v = null;
        mbs mbsVar = this.g;
        if (mbsVar != null) {
            mbsVar.d(this.y);
        }
    }
}
