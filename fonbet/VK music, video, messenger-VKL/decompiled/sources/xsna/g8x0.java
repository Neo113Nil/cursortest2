package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.voip.ui.accessibility.AccessibilityEvents;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.c8x0;

/* compiled from: WaitingRoomNotificationHolder.kt */
/* loaded from: classes7.dex */
public final class g8x0 implements tmg0, vgw0 {
    public final AccessibilityEvents b;
    public final TextView c;
    public final View d;
    public final zzz e;
    public final View f;
    public boolean g;
    public final List<View> h;
    public final EmptyList i;

    public g8x0(mjw0 mjw0Var, AccessibilityEvents accessibilityEvents) {
        this.b = accessibilityEvents;
        this.c = (TextView) mjw0Var.findViewById(R.id.voip_waiting_room_notification_title);
        View findViewById = mjw0Var.findViewById(R.id.voip_waiting_room_notification_action_hide);
        this.d = findViewById;
        com.vk.voip.ui.c.b.getClass();
        this.e = (a000) com.vk.voip.ui.c.T().a;
        View findViewById2 = mjw0Var.findViewById(R.id.voip_waiting_room_notification_root);
        this.f = findViewById2;
        jjc.g(findViewById, new aer0(this, 16));
        this.h = Collections.singletonList(findViewById2);
        this.i = EmptyList.b;
    }

    @Override // xsna.vgw0
    public final View a() {
        return this.f;
    }

    @Override // xsna.vgw0
    public final boolean b() {
        return this.g;
    }

    public final void c(c8x0.f fVar) {
        String string;
        String str = fVar.a;
        int i = fVar.b;
        boolean z = i > 0;
        this.g = z;
        int i2 = z ? 0 : 8;
        View view = this.f;
        view.setVisibility(i2);
        AccessibilityEvents accessibilityEvents = this.b;
        if (i > 1) {
            string = view.getContext().getString(R.string.voip_waiting_room_notification_title_more, str, Integer.valueOf(i - 1));
            accessibilityEvents.getClass();
            accessibilityEvents.d(new yk(0, accessibilityEvents, string));
        } else {
            string = view.getContext().getString(R.string.voip_waiting_room_notification_title, str);
            if (this.g) {
                accessibilityEvents.getClass();
                accessibilityEvents.d(new yk(0, accessibilityEvents, string));
            }
        }
        this.c.setText(string);
        if (this.g) {
            qj80.a(view, new f8x0(view, this.e.c(), this));
        }
    }

    @Override // xsna.tmg0
    public final List<View> getAnimatedViewsToRotate() {
        return this.i;
    }

    @Override // xsna.tmg0
    public final List<View> getViewsToRotate() {
        return this.h;
    }

    @Override // xsna.tmg0, xsna.j6m
    public final void v0(float f) {
        super.v0(f);
        View view = this.f;
        if (f == 90.0f) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            bVar.u = R.id.call_state_title;
            bVar.l = 0;
            bVar.i = 0;
            bVar.j = -1;
            bVar.t = -1;
            bVar.E = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            bVar.F = 0.5f;
            view.setTranslationX(view.getWidth() / 3.0f);
            view.setLayoutParams(bVar);
            return;
        }
        if (f == 270.0f) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
            bVar2.s = R.id.call_state_title;
            bVar2.i = 0;
            bVar2.l = 0;
            bVar2.j = -1;
            bVar2.v = -1;
            bVar2.E = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            bVar2.F = 0.5f;
            view.setTranslationX((-view.getWidth()) / 3.0f);
            view.setLayoutParams(bVar2);
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar3 = (ConstraintLayout.b) layoutParams3;
        bVar3.j = R.id.call_state_title;
        bVar3.t = 0;
        bVar3.v = 0;
        bVar3.i = -1;
        bVar3.l = -1;
        bVar3.s = -1;
        bVar3.u = -1;
        bVar3.E = 0.5f;
        bVar3.F = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        bVar3.setMarginStart(cn70.b(8));
        bVar3.setMarginEnd(cn70.b(8));
        view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        view.setLayoutParams(bVar3);
    }
}
