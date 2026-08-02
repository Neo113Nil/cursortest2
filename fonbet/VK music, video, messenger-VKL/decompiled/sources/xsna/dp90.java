package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.sticky_header.StickyHeadersLinearLayoutManager;
import com.vk.im.ui.views.avatars.a;
import com.vk.im.ui.views.online.OnlineView;
import com.vk.voip.ui.avatars.VoipAvatarViewContainer;
import com.vk.voip.ui.history.past.presentation.base.fragment.VoipPastCallsFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.mp90;
import xsna.tzp0;
import xsna.xo90;

/* compiled from: PastCallDialogDetailsView.kt */
/* loaded from: classes7.dex */
public final class dp90 {
    public final Context a;
    public final VoipPastCallsFragment b;
    public final k59<mp90.b> c;
    public final tzp0.c d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public xo90.e l;
    public dw20 m;

    /* compiled from: PastCallDialogDetailsView.kt */
    public final class a implements DialogInterface.OnDismissListener {
        public a() {
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            dp90 dp90Var = dp90.this;
            dp90Var.a().setLayoutManager(null);
            dp90Var.a().setAdapter(null);
            ((cp90) dp90Var.j.getValue()).setItems(EmptyList.b);
            dp90Var.c.a(mp90.b.d.a);
        }
    }

    /* compiled from: PastCallDialogDetailsView.kt */
    public final class b implements iz20 {
        public b() {
        }

        @Override // xsna.iz20
        public final void n(dw20 dw20Var) {
            dp90 dp90Var = dp90.this;
            dp90Var.m = dw20Var;
            dp90Var.c();
        }
    }

    public dp90(Context context, VoipPastCallsFragment voipPastCallsFragment, k59 k59Var) {
        tzp0.c a2 = tzp0.a(null, 3);
        this.a = context;
        this.b = voipPastCallsFragment;
        this.c = k59Var;
        this.d = a2;
        ubw ubwVar = new ubw(this, 20);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = msy.a(lazyThreadSafetyMode, ubwVar);
        this.f = msy.a(lazyThreadSafetyMode, new wp40(this, 10));
        this.g = msy.a(lazyThreadSafetyMode, new ye80(this, 2));
        this.h = msy.a(lazyThreadSafetyMode, new cty(this, 22));
        this.i = msy.a(lazyThreadSafetyMode, new n7w(this, 18));
        this.j = msy.a(lazyThreadSafetyMode, new xsw(this, 20));
        this.k = msy.a(lazyThreadSafetyMode, new fm20(this, 12));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final RecyclerView a() {
        return (RecyclerView) this.i.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ConstraintLayout b() {
        return (ConstraintLayout) this.e.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kotlin.Lazy] */
    public final void c() {
        xo90.e eVar = this.l;
        if (eVar != null) {
            xo90.d dVar = eVar.a;
            VoipAvatarViewContainer voipAvatarViewContainer = (VoipAvatarViewContainer) this.f.getValue();
            kr5 kr5Var = dVar.e;
            a.b bVar = dVar.a;
            Context context = this.a;
            voipAvatarViewContainer.c(kr5.a(kr5Var, new com.vk.im.ui.views.avatars.a(context, bVar, 2), null, 11));
            ((OnlineView) this.g.getValue()).setFromUsersOnlineInfo(dVar.d);
            ((TextView) this.h.getValue()).setText(dVar.c);
            RecyclerView.o layoutManager = a().getLayoutManager();
            ?? r2 = this.j;
            if (layoutManager == null || a().getAdapter() == null) {
                a().setLayoutManager(new StickyHeadersLinearLayoutManager(this.b));
                a().setAdapter((cp90) r2.getValue());
                a().setClipToOutline(true);
                a().setBackground(new d1x(cn70.a() * 10.0f, e3m.f(R.attr.vk_ui_background_secondary, context), (int) (cn70.a() * 0.7f), context));
            }
            ((cp90) r2.getValue()).setItems(eVar.c);
            ConstraintLayout b2 = b();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= b2.getChildCount()) {
                    i = -1;
                    break;
                }
                int i3 = i2 + 1;
                View childAt = b2.getChildAt(i2);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                if (childAt instanceof bp90) {
                    break;
                }
                i++;
                i2 = i3;
            }
            int i4 = 0;
            int i5 = 0;
            while (i5 < b2.getChildCount()) {
                int i6 = i5 + 1;
                View childAt2 = b2.getChildAt(i5);
                if (childAt2 == null) {
                    throw new IndexOutOfBoundsException();
                }
                if ((childAt2 instanceof bp90) && (i4 = i4 + 1) < 0) {
                    e43.s();
                    throw null;
                }
                i5 = i6;
            }
            ?? r1 = this.k;
            if (i > 0 && i4 > 0) {
                b().removeViews(i, i4);
                ((Flow) r1.getValue()).setReferencedIds(new int[0]);
            }
            ArrayList<xo90.a> arrayList = eVar.d;
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            for (xo90.a aVar : arrayList) {
                bp90 bp90Var = new bp90(context, this.c, eVar.e);
                Integer valueOf = Integer.valueOf(R.attr.vk_ui_icon_negative);
                Integer valueOf2 = Integer.valueOf(R.attr.vk_ui_icon_accent);
                boolean z = aVar instanceof xo90.a.c;
                TextView textView = bp90Var.w;
                ImageView imageView = bp90Var.v;
                if (z) {
                    bp90Var.setId(bp90.x);
                    imageView.setImageResource(R.drawable.vk_icon_phone_outline_28);
                    gpo0.f(imageView, valueOf2);
                    textView.setText(bp90Var.getContext().getString(R.string.voip_history_past_call_details_action_join_with_audio));
                    bwt0.i0(bp90Var, new tn0(22, bp90Var, (xo90.a.c) aVar));
                } else if (aVar instanceof xo90.a.d) {
                    bp90Var.setId(bp90.y);
                    imageView.setImageResource(R.drawable.vk_icon_videocam_outline_28);
                    gpo0.f(imageView, valueOf2);
                    textView.setText(bp90Var.getContext().getString(R.string.voip_history_past_call_details_action_join_with_video));
                    bwt0.i0(bp90Var, new sh3(23, bp90Var, (xo90.a.d) aVar));
                } else if (aVar instanceof xo90.a.h) {
                    bp90Var.setId(bp90.z);
                    imageView.setImageResource(R.drawable.vk_icon_share_outline_28);
                    gpo0.f(imageView, valueOf2);
                    textView.setText(bp90Var.getContext().getString(R.string.voip_history_past_call_details_action_share_join_link));
                    bwt0.i0(bp90Var, new defpackage.s(26, bp90Var, (xo90.a.h) aVar));
                } else if (aVar instanceof xo90.a.e) {
                    bp90Var.setId(bp90.A);
                    imageView.setImageResource(R.drawable.vk_icon_phone_outline_28);
                    gpo0.f(imageView, valueOf2);
                    textView.setText(bp90Var.getContext().getString(R.string.voip_action_make_call_audio));
                    bwt0.i0(bp90Var, new mm1(23, bp90Var, (xo90.a.e) aVar));
                } else if (aVar instanceof xo90.a.f) {
                    bp90Var.setId(bp90.B);
                    imageView.setImageResource(R.drawable.vk_icon_videocam_outline_28);
                    gpo0.f(imageView, valueOf2);
                    textView.setText(bp90Var.getContext().getString(R.string.voip_action_make_call_video));
                    bwt0.i0(bp90Var, new il7(13, bp90Var, (xo90.a.f) aVar));
                } else if (aVar instanceof xo90.a.i) {
                    bp90Var.setId(bp90.C);
                    imageView.setImageResource(R.drawable.vk_icon_message_outline_28);
                    gpo0.f(imageView, valueOf2);
                    textView.setText(bp90Var.getContext().getString(R.string.voip_history_past_call_details_action_write_message));
                    bwt0.i0(bp90Var, new defpackage.v(17, bp90Var, (xo90.a.i) aVar));
                } else if (aVar instanceof xo90.a.g) {
                    bp90Var.setId(bp90.E);
                    imageView.setImageResource(R.drawable.vk_icon_report_outline_24);
                    gpo0.f(imageView, valueOf);
                    textView.setText(bp90Var.getContext().getString(R.string.voip_history_past_call_details_action_report_call));
                    bwt0.i0(bp90Var, new nm1(20, bp90Var, (xo90.a.g) aVar));
                } else if (aVar instanceof xo90.a.b) {
                    bp90Var.setId(bp90.F);
                    imageView.setImageResource(R.drawable.vk_icon_delete_outline_24);
                    gpo0.f(imageView, valueOf);
                    textView.setText(bp90Var.getContext().getString(R.string.voip_delete_call));
                    bwt0.i0(bp90Var, new s53(28, bp90Var, (xo90.a.b) aVar));
                } else {
                    if (!(aVar instanceof xo90.a.C4027a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bp90Var.setId(bp90.D);
                    imageView.setImageResource(R.drawable.vk_icon_logo_max_color_56);
                    imageView.clearColorFilter();
                    textView.setText(bp90Var.getContext().getString(R.string.voip_call_in_max));
                    bwt0.i0(bp90Var, new rj60(bp90Var, 6));
                    bp90Var.t.a(mp90.b.AbstractC3366b.a.a);
                }
                arrayList2.add(bp90Var);
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                bp90 bp90Var2 = (bp90) it.next();
                b().addView(bp90Var2);
                ((Flow) r1.getValue()).g(bp90Var2);
            }
        }
    }
}
