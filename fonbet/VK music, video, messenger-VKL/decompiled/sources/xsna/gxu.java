package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.voip.ui.groupcalls.list.primary.tab.PrimaryTabsView;
import com.vk.voip.ui.sessionrooms.f;
import com.vk.voip.ui.sessionrooms.view.SessionRoomIndicatorView;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.wwi0;

/* compiled from: HeaderIndicatorsHolder.kt */
/* loaded from: classes7.dex */
public final class gxu implements vgw0, tmg0 {
    public final mjw0 b;
    public final g3m c;
    public final mcc0 d;
    public final io.reactivex.rxjava3.disposables.b e;
    public final ViewGroup f;
    public boolean g;
    public final zzz h;
    public final PrimaryTabsView i;
    public final boo j;
    public final tla0 k;
    public final kvi0 l;
    public final EmptyList m;
    public final List<View> n;

    public gxu(mjw0 mjw0Var, g3m g3mVar, mcc0 mcc0Var) {
        this.b = mjw0Var;
        this.c = g3mVar;
        this.d = mcc0Var;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.e = bVar;
        ViewGroup viewGroup = (ViewGroup) mjw0Var.findViewById(R.id.voip_indicators_container);
        this.f = viewGroup;
        com.vk.voip.ui.c.b.getClass();
        this.h = (a000) com.vk.voip.ui.c.T().a;
        TextView textView = (TextView) viewGroup.findViewById(R.id.header_duration_text);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.voip_pin_status_image_view);
        this.i = (PrimaryTabsView) viewGroup.findViewById(R.id.primary_tabs_view);
        SessionRoomIndicatorView sessionRoomIndicatorView = (SessionRoomIndicatorView) viewGroup.findViewById(R.id.session_room_indicator);
        this.j = new boo(textView);
        this.k = new tla0(imageView);
        this.l = new kvi0(sessionRoomIndicatorView, null);
        this.m = EmptyList.b;
        this.n = Collections.singletonList(viewGroup);
        bwt0.R(viewGroup, new coj(this, 2));
        sessionRoomIndicatorView.setRoomLeaveButtonListener(new wqf(this, 26));
        bVar.b(g3mVar.a().subscribe(new az(new yhu(this, 1), 29)));
    }

    @Override // xsna.vgw0
    public final View a() {
        return this.f;
    }

    @Override // xsna.vgw0
    public final boolean b() {
        return this.g;
    }

    public final void c(View view) {
        float c = this.h.c();
        g3m g3mVar = this.c;
        mjw0 mjw0Var = this.b;
        if (c == 90.0f) {
            view.setTranslationX((mjw0Var.getWidth() - view.getHeight()) / 2.0f);
            view.setTranslationY(((view.getWidth() - view.getHeight()) / 2.0f) + (g3mVar.c() - view.getTop()));
            return;
        }
        if (c != 270.0f) {
            view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            view.setTranslationX(-((mjw0Var.getWidth() - view.getHeight()) / 2.0f));
            view.setTranslationY(((view.getWidth() - view.getHeight()) / 2.0f) + (g3mVar.c() - view.getTop()));
        }
    }

    public final void d(wwi0.a aVar) {
        this.l.b(aVar);
        v0(this.h.c());
    }

    public final void e(f.a aVar) {
        this.l.d(aVar);
        v0(this.h.c());
    }

    @Override // xsna.tmg0
    public final List<View> getAnimatedViewsToRotate() {
        return this.n;
    }

    @Override // xsna.tmg0
    public final List<View> getViewsToRotate() {
        return this.m;
    }

    @Override // xsna.tmg0, xsna.j6m
    public final void v0(float f) {
        super.v0(f);
        mjw0 mjw0Var = this.b;
        g3m g3mVar = this.c;
        View view = this.f;
        if (f == 90.0f) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            ((ViewGroup.MarginLayoutParams) bVar).width = (mjw0Var.getHeight() - g3mVar.c()) - g3mVar.b();
            view.setLayoutParams(bVar);
            f4m.y(g3m.k, view);
        } else if (f == 270.0f) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
            ((ViewGroup.MarginLayoutParams) bVar2).width = (mjw0Var.getHeight() - g3mVar.c()) - g3mVar.b();
            view.setLayoutParams(bVar2);
            f4m.y(g3m.k, view);
        } else {
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar3 = (ConstraintLayout.b) layoutParams3;
            ((ViewGroup.MarginLayoutParams) bVar3).width = -1;
            view.setLayoutParams(bVar3);
            f4m.y(0, view);
        }
        c(view);
    }
}
