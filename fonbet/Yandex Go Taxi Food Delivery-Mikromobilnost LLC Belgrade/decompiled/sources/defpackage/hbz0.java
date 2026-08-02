package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.bricks.BrickSlotView;
import com.yandex.bricks.c;
import com.yandex.dsl.views.a;
import com.yandex.dsl.views.layouts.FrameLayoutBuilder;
import com.yandex.dsl.views.layouts.constraint.ConstraintSetBuilder;
import com.yandex.dsl.views.layouts.constraint.b;
import com.yandex.dsl.views.layouts.constraint.d;
import com.yandex.messaging.ui.timeline.TimelineFragmentUi$special$$inlined$brickSlot$default$1;
import com.yandex.messaging.ui.timeline.TimelineFragmentUi$special$$inlined$brickSlot$default$10;
import com.yandex.messaging.ui.timeline.TimelineFragmentUi$special$$inlined$brickSlot$default$11;
import com.yandex.messaging.ui.timeline.TimelineFragmentUi$special$$inlined$brickSlot$default$12;
import com.yandex.messaging.ui.timeline.TimelineFragmentUi$special$$inlined$brickSlot$default$13;
import com.yandex.messaging.ui.timeline.TimelineFragmentUi$special$$inlined$brickSlot$default$14;
import com.yandex.messaging.ui.timeline.TimelineFragmentUi$special$$inlined$brickSlot$default$15;
import com.yandex.messaging.ui.timeline.TimelineFragmentUi$special$$inlined$brickSlot$default$16;
import com.yandex.messaging.ui.timeline.TimelineFragmentUi$special$$inlined$brickSlot$default$17;
import com.yandex.messaging.ui.timeline.TimelineFragmentUi$special$$inlined$brickSlot$default$18;
import com.yandex.messaging.ui.timeline.TimelineFragmentUi$special$$inlined$brickSlot$default$2;
import com.yandex.messaging.ui.timeline.TimelineFragmentUi$special$$inlined$brickSlot$default$3;
import com.yandex.messaging.ui.timeline.TimelineFragmentUi$special$$inlined$brickSlot$default$4;
import com.yandex.messaging.ui.timeline.TimelineFragmentUi$special$$inlined$brickSlot$default$5;
import com.yandex.messaging.ui.timeline.TimelineFragmentUi$special$$inlined$brickSlot$default$6;
import com.yandex.messaging.ui.timeline.TimelineFragmentUi$special$$inlined$brickSlot$default$7;
import com.yandex.messaging.ui.timeline.TimelineFragmentUi$special$$inlined$brickSlot$default$8;
import com.yandex.messaging.ui.timeline.TimelineFragmentUi$special$$inlined$brickSlot$default$9;
import com.yandex.messaging.views.BadgedFloatingActionButton;
import defpackage.ny61;

/* loaded from: classes15.dex */
public final class hbz0 extends b {
    public final BadgedFloatingActionButton A;
    public final BadgedFloatingActionButton B;
    public final c C;
    public final c D;
    public final c E;
    public final c F;
    public final c G;
    public final c H;
    public final c I;
    public final c J;
    public final c K;
    public final c L;
    public final c M;
    public final c N;
    public final c O;
    public final c P;
    public final c Q;
    public final c R;
    public final FrameLayoutBuilder S;
    public final Resources w;
    public final ViewGroup x;
    public final c y;
    public final c z;

    public hbz0(Context context, final a aVar) {
        super(context);
        this.w = context.getResources();
        int generateViewId = View.generateViewId();
        View view = (View) new zls() { // from class: com.yandex.messaging.ui.timeline.TimelineFragmentUi$special$$inlined$include$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // defpackage.zls
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                ((Number) obj2).intValue();
                ((Number) obj3).intValue();
                return aVar.getRoot();
            }
        }.invoke(jh91.e(0, this.a), 0, 0);
        if (generateViewId != -1) {
            view.setId(generateViewId);
        }
        addToParent(view);
        this.x = (ViewGroup) view;
        int i = e9h0.chat_timeline_slot;
        View view2 = (View) TimelineFragmentUi$special$$inlined$brickSlot$default$1.b.invoke(jh91.e(0, this.a), 0, 0);
        if (i != -1) {
            view2.setId(i);
        }
        addToParent(view2);
        this.y = new c((BrickSlotView) view2);
        int i2 = e9h0.chat_timeline_error_slot;
        View view3 = (View) TimelineFragmentUi$special$$inlined$brickSlot$default$2.b.invoke(jh91.e(0, this.a), 0, 0);
        if (i2 != -1) {
            view3.setId(i2);
        }
        addToParent(view3);
        this.z = new c((BrickSlotView) view3);
        int i3 = e9h0.chat_scroll_to_bottom;
        final int i4 = olh0.msg_chat_scroll_to_bottom;
        View view4 = (View) new zls() { // from class: com.yandex.messaging.ui.timeline.TimelineFragmentUi$special$$inlined$xmlLayout$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // defpackage.zls
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                ((Number) obj2).intValue();
                ((Number) obj3).intValue();
                Object systemService = ((Context) obj).getSystemService("layout_inflater");
                if (systemService == null) {
                    ny61.t("null cannot be cast to non-null type android.view.LayoutInflater");
                    return null;
                }
                View inflate = ((LayoutInflater) systemService).inflate(i4, (ViewGroup) null, false);
                if (inflate != null) {
                    return inflate;
                }
                ny61.t("null cannot be cast to non-null type V of splitties.views.LayoutInflaterKt.inflate");
                return null;
            }
        }.invoke(jh91.e(0, this.a), 0, 0);
        if (i3 != -1) {
            view4.setId(i3);
        }
        addToParent(view4);
        this.A = (BadgedFloatingActionButton) view4;
        int i5 = e9h0.mentions_fab;
        final int i6 = olh0.msg_chat_mentions_fab;
        View view5 = (View) new zls() { // from class: com.yandex.messaging.ui.timeline.TimelineFragmentUi$special$$inlined$xmlLayout$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // defpackage.zls
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                ((Number) obj2).intValue();
                ((Number) obj3).intValue();
                Object systemService = ((Context) obj).getSystemService("layout_inflater");
                if (systemService == null) {
                    ny61.t("null cannot be cast to non-null type android.view.LayoutInflater");
                    return null;
                }
                View inflate = ((LayoutInflater) systemService).inflate(i6, (ViewGroup) null, false);
                if (inflate != null) {
                    return inflate;
                }
                ny61.t("null cannot be cast to non-null type V of splitties.views.LayoutInflaterKt.inflate");
                return null;
            }
        }.invoke(jh91.e(0, this.a), 0, 0);
        if (i5 != -1) {
            view5.setId(i5);
        }
        addToParent(view5);
        this.B = (BadgedFloatingActionButton) view5;
        int i7 = e9h0.chat_search_toolbar_slot;
        View view6 = (View) TimelineFragmentUi$special$$inlined$brickSlot$default$3.b.invoke(jh91.e(0, this.a), 0, 0);
        if (i7 != -1) {
            view6.setId(i7);
        }
        addToParent(view6);
        this.C = new c((BrickSlotView) view6);
        int i8 = e9h0.chat_audio_player;
        View view7 = (View) TimelineFragmentUi$special$$inlined$brickSlot$default$4.b.invoke(jh91.e(0, this.a), 0, 0);
        if (i8 != -1) {
            view7.setId(i8);
        }
        addToParent(view7);
        this.D = new c((BrickSlotView) view7);
        int i9 = e9h0.chat_metadata;
        View view8 = (View) TimelineFragmentUi$special$$inlined$brickSlot$default$5.b.invoke(jh91.e(0, this.a), 0, 0);
        if (i9 != -1) {
            view8.setId(i9);
        }
        addToParent(view8);
        this.E = new c((BrickSlotView) view8);
        int i10 = e9h0.chat_current_meeting_indication;
        View view9 = (View) TimelineFragmentUi$special$$inlined$brickSlot$default$6.b.invoke(jh91.e(0, this.a), 0, 0);
        if (i10 != -1) {
            view9.setId(i10);
        }
        addToParent(view9);
        this.F = new c((BrickSlotView) view9);
        int i11 = e9h0.chat_active_meeting_indication;
        View view10 = (View) TimelineFragmentUi$special$$inlined$brickSlot$default$7.b.invoke(jh91.e(0, this.a), 0, 0);
        if (i11 != -1) {
            view10.setId(i11);
        }
        addToParent(view10);
        this.G = new c((BrickSlotView) view10);
        int i12 = e9h0.pinned_message;
        View view11 = (View) TimelineFragmentUi$special$$inlined$brickSlot$default$8.b.invoke(jh91.e(0, this.a), 0, 0);
        if (i12 != -1) {
            view11.setId(i12);
        }
        addToParent(view11);
        this.H = new c((BrickSlotView) view11);
        int i13 = e9h0.chat_translator;
        View view12 = (View) TimelineFragmentUi$special$$inlined$brickSlot$default$9.b.invoke(jh91.e(0, this.a), 0, 0);
        if (i13 != -1) {
            view12.setId(i13);
        }
        addToParent(view12);
        this.I = new c((BrickSlotView) view12);
        int i14 = e9h0.join_suggest_slot;
        View view13 = (View) TimelineFragmentUi$special$$inlined$brickSlot$default$10.b.invoke(jh91.e(0, this.a), 0, 0);
        if (i14 != -1) {
            view13.setId(i14);
        }
        addToParent(view13);
        this.J = new c((BrickSlotView) view13);
        int i15 = e9h0.dnd_status_info_slot;
        View view14 = (View) TimelineFragmentUi$special$$inlined$brickSlot$default$11.b.invoke(jh91.e(0, this.a), 0, 0);
        if (i15 != -1) {
            view14.setId(i15);
        }
        addToParent(view14);
        this.K = new c((BrickSlotView) view14);
        int i16 = e9h0.chat_input_slot;
        View view15 = (View) TimelineFragmentUi$special$$inlined$brickSlot$default$12.b.invoke(jh91.e(0, this.a), 0, 0);
        if (i16 != -1) {
            view15.setId(i16);
        }
        addToParent(view15);
        this.L = new c((BrickSlotView) view15);
        int i17 = e9h0.mention_suggest_slot;
        View view16 = (View) TimelineFragmentUi$special$$inlined$brickSlot$default$13.b.invoke(jh91.e(0, this.a), 0, 0);
        if (i17 != -1) {
            view16.setId(i17);
        }
        addToParent(view16);
        this.M = new c((BrickSlotView) view16);
        int i18 = e9h0.text_suggest_slot;
        View view17 = (View) TimelineFragmentUi$special$$inlined$brickSlot$default$14.b.invoke(jh91.e(0, this.a), 0, 0);
        if (i18 != -1) {
            view17.setId(i18);
        }
        addToParent(view17);
        this.N = new c((BrickSlotView) view17);
        int i19 = e9h0.spam_suggest_slot;
        View view18 = (View) TimelineFragmentUi$special$$inlined$brickSlot$default$15.b.invoke(jh91.e(0, this.a), 0, 0);
        if (i19 != -1) {
            view18.setId(i19);
        }
        addToParent(view18);
        this.O = new c((BrickSlotView) view18);
        int i20 = e9h0.delete_progress_slot;
        View view19 = (View) TimelineFragmentUi$special$$inlined$brickSlot$default$16.b.invoke(jh91.e(0, this.a), 0, 0);
        if (i20 != -1) {
            view19.setId(i20);
        }
        addToParent(view19);
        this.P = new c((BrickSlotView) view19);
        int i21 = e9h0.update_organization_slot;
        View view20 = (View) TimelineFragmentUi$special$$inlined$brickSlot$default$17.b.invoke(jh91.e(0, this.a), 0, 0);
        if (i21 != -1) {
            view20.setId(i21);
        }
        addToParent(view20);
        this.Q = new c((BrickSlotView) view20);
        int i22 = e9h0.miniapp_slot;
        View view21 = (View) TimelineFragmentUi$special$$inlined$brickSlot$default$18.b.invoke(jh91.e(0, this.a), 0, 0);
        if (i22 != -1) {
            view21.setId(i22);
        }
        addToParent(view21);
        this.R = new c((BrickSlotView) view21);
        int i23 = e9h0.app_meeting_indication_slot;
        FrameLayoutBuilder frameLayoutBuilder = new FrameLayoutBuilder(jh91.e(0, this.a), 0, 0);
        if (i23 != -1) {
            frameLayoutBuilder.setId(i23);
        }
        addToParent(frameLayoutBuilder);
        this.S = frameLayoutBuilder;
    }

    @Override // com.yandex.dsl.views.layouts.constraint.b
    public final void a(ConstraintSetBuilder constraintSetBuilder) {
        d dVar = new d(this.S.getId(), constraintSetBuilder);
        dVar.e(0);
        dVar.d(-2);
        ConstraintSetBuilder.Side side = ConstraintSetBuilder.Side.TOP;
        m7e f = tse0.f(side, side, dVar, 0);
        ConstraintSetBuilder.Side side2 = ConstraintSetBuilder.Side.START;
        m7e f2 = tse0.f(side2, side2, dVar, 0);
        ConstraintSetBuilder.Side side3 = ConstraintSetBuilder.Side.END;
        m7e f3 = tse0.f(side3, side3, dVar, 0);
        int i = 3;
        int i2 = 1;
        constraintSetBuilder.z(f, f2, f3);
        constraintSetBuilder.A(new gbz0(constraintSetBuilder, this, i2), this.x);
        constraintSetBuilder.B(this.C, new gbz0(constraintSetBuilder, this, i));
        int i3 = 4;
        constraintSetBuilder.B(this.D, new gbz0(constraintSetBuilder, this, i3));
        constraintSetBuilder.B(this.I, new gbz0(constraintSetBuilder, this, 5));
        constraintSetBuilder.B(this.E, new gbz0(constraintSetBuilder, this, 6));
        constraintSetBuilder.B(this.F, new gbz0(constraintSetBuilder, this, 7));
        int i4 = 8;
        constraintSetBuilder.B(this.G, new gbz0(constraintSetBuilder, this, i4));
        constraintSetBuilder.B(this.H, new gbz0(constraintSetBuilder, this, 9));
        constraintSetBuilder.B(this.J, new gbz0(constraintSetBuilder, this, 11));
        constraintSetBuilder.B(this.y, new gbz0(constraintSetBuilder, this, 0));
        constraintSetBuilder.B(this.z, new gbz0(constraintSetBuilder, this, 10));
        constraintSetBuilder.B(this.K, new g0u0(i2, constraintSetBuilder));
        constraintSetBuilder.B(this.L, new g0u0(2, constraintSetBuilder));
        constraintSetBuilder.B(this.M, new gbz0(constraintSetBuilder, this, 12));
        constraintSetBuilder.B(this.N, new gbz0(constraintSetBuilder, this, 13));
        constraintSetBuilder.A(new g0u0(i, constraintSetBuilder), this.A);
        constraintSetBuilder.A(new gbz0(constraintSetBuilder, this, 14), this.B);
        constraintSetBuilder.B(this.O, new gbz0(constraintSetBuilder, this, 15));
        constraintSetBuilder.B(this.P, new g0u0(i3, constraintSetBuilder));
        constraintSetBuilder.B(this.Q, new f0z0(i4));
        constraintSetBuilder.B(this.R, new gbz0(this, constraintSetBuilder));
    }
}
