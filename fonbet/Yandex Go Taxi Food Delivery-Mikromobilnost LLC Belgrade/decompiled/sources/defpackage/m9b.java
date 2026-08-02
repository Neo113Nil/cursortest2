package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import com.yandex.bricks.Brick;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.domain.SimpleFlowUseCase$subscribe$$inlined$suspendDisposable$1$1;
import com.yandex.messaging.internal.view.chat.ChatInputHeightState;
import com.yandex.messaging.ui.timeline.b;
import java.util.Objects;

/* loaded from: classes15.dex */
public final class m9b extends Brick implements n9b {
    public final p4t A;
    public final View B;
    public final TextView C;
    public final View D;
    public final View E;
    public final View F;
    public pf4 H;
    public xcz0 I;
    public o3 J;
    public Bundle K;
    public final b a;
    public final ChatInputHeightState c;
    public final ChatRequest w;
    public final cwp0 x;
    public final Resources y;
    public final o9b z;
    public final Handler b = new Handler();
    public int G = oyh0.messaging_chat_search_in_progress;

    public m9b(Activity activity, pu31 pu31Var, ChatInputHeightState chatInputHeightState, ChatRequest chatRequest, cwp0 cwp0Var, o9b o9bVar, p4t p4tVar, b bVar) {
        tje.e();
        View inflate = inflate(activity, olh0.msg_b_chat_search_navigation);
        this.B = inflate;
        this.c = chatInputHeightState;
        this.w = chatRequest;
        this.x = cwp0Var;
        this.y = activity.getResources();
        this.z = o9bVar;
        this.A = p4tVar;
        this.a = bVar;
        this.C = (TextView) g8a1.e(e9h0.chat_search_description, inflate);
        this.D = g8a1.e(e9h0.chat_search_progress_bar, inflate);
        View e = g8a1.e(e9h0.chat_search_to_next_result_button, inflate);
        this.E = e;
        View e2 = g8a1.e(e9h0.chat_search_to_previous_result_button, inflate);
        this.F = e2;
        final int i = 0;
        e.setOnClickListener(new View.OnClickListener(this) { // from class: l9b
            public final /* synthetic */ m9b b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                m9b m9bVar = this.b;
                switch (i2) {
                    case 0:
                        o3 o3Var = m9bVar.J;
                        Objects.requireNonNull(o3Var);
                        int i3 = o3Var.b;
                        if (i3 >= 0) {
                            long[] jArr = (long[]) o3Var.w;
                            if (i3 < jArr.length - 1) {
                                int i4 = i3 + 1;
                                o3Var.b = i4;
                                b bVar2 = ((m9b) o3Var.c).a;
                                long j = jArr[i4];
                                bVar2.getClass();
                                bVar2.c(new mxu(bVar2, j, i4));
                                o3Var.B(true);
                                break;
                            }
                        }
                        ny61.k();
                        break;
                    default:
                        o3 o3Var2 = m9bVar.J;
                        Objects.requireNonNull(o3Var2);
                        int i5 = o3Var2.b;
                        if (i5 > 0) {
                            long[] jArr2 = (long[]) o3Var2.w;
                            if (i5 < jArr2.length) {
                                int i6 = i5 - 1;
                                o3Var2.b = i6;
                                b bVar3 = ((m9b) o3Var2.c).a;
                                long j2 = jArr2[i6];
                                bVar3.getClass();
                                bVar3.c(new mxu(bVar3, j2, i6));
                                o3Var2.B(true);
                                break;
                            }
                        }
                        ny61.k();
                        break;
                }
            }
        });
        final int i2 = 1;
        e2.setOnClickListener(new View.OnClickListener(this) { // from class: l9b
            public final /* synthetic */ m9b b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                m9b m9bVar = this.b;
                switch (i22) {
                    case 0:
                        o3 o3Var = m9bVar.J;
                        Objects.requireNonNull(o3Var);
                        int i3 = o3Var.b;
                        if (i3 >= 0) {
                            long[] jArr = (long[]) o3Var.w;
                            if (i3 < jArr.length - 1) {
                                int i4 = i3 + 1;
                                o3Var.b = i4;
                                b bVar2 = ((m9b) o3Var.c).a;
                                long j = jArr[i4];
                                bVar2.getClass();
                                bVar2.c(new mxu(bVar2, j, i4));
                                o3Var.B(true);
                                break;
                            }
                        }
                        ny61.k();
                        break;
                    default:
                        o3 o3Var2 = m9bVar.J;
                        Objects.requireNonNull(o3Var2);
                        int i5 = o3Var2.b;
                        if (i5 > 0) {
                            long[] jArr2 = (long[]) o3Var2.w;
                            if (i5 < jArr2.length) {
                                int i6 = i5 - 1;
                                o3Var2.b = i6;
                                b bVar3 = ((m9b) o3Var2.c).a;
                                long j2 = jArr2[i6];
                                bVar3.getClass();
                                bVar3.c(new mxu(bVar3, j2, i6));
                                o3Var2.B(true);
                                break;
                            }
                        }
                        ny61.k();
                        break;
                }
            }
        });
        pu31Var.a(inflate, "search_navigation", null);
    }

    @Override // com.yandex.bricks.Brick
    public final View getView() {
        return this.B;
    }

    @Override // com.yandex.bricks.Brick
    public final void onBrickAttach(Bundle bundle) {
        super.onBrickAttach(bundle);
        this.c.a(this.y.getDimensionPixelSize(gvg0.chat_input_height));
        cwp0 cwp0Var = this.x;
        q(cwp0Var.b);
        cwp0Var.a.b(this);
        this.K = bundle;
        tse brickScope = getBrickScope();
        k9b k9bVar = new k9b(0, this);
        p4t p4tVar = this.A;
        p4tVar.getClass();
        tje.N(brickScope, null, null, new SimpleFlowUseCase$subscribe$$inlined$suspendDisposable$1$1(null, p4tVar, this.w, k9bVar), 3);
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickDetach() {
        super.onBrickDetach();
        this.x.a.d(this);
        this.b.removeCallbacksAndMessages(null);
        pf4 pf4Var = this.H;
        if (pf4Var != null) {
            pf4Var.close();
            this.H = null;
        }
    }

    @Override // com.yandex.bricks.Brick
    public final void onSaveInstanceState(Bundle bundle) {
        int i;
        super.onSaveInstanceState(bundle);
        o3 o3Var = this.J;
        if (o3Var == null || (i = o3Var.b) == -1) {
            return;
        }
        bundle.putInt("search_position", i);
    }

    public final void q(String str) {
        pf4 pf4Var = this.H;
        if (pf4Var != null) {
            pf4Var.close();
            this.H = null;
        }
        Handler handler = this.b;
        handler.removeCallbacksAndMessages(null);
        if (!"".equals(str)) {
            handler.postDelayed(new l7a(5, this, str), 300L);
            return;
        }
        this.D.setVisibility(8);
        this.C.setText((CharSequence) null);
        this.E.setEnabled(false);
        this.F.setEnabled(false);
        b bVar = this.a;
        bVar.getClass();
        bVar.c(new e8b(bVar, 0, 0));
    }
}
