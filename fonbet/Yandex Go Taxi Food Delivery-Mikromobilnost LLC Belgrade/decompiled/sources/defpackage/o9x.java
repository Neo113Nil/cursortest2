package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import com.yandex.bricks.Brick;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.chat.join.a;
import com.yandex.messaging.domain.SimpleFlowUseCase$subscribe$$inlined$suspendDisposable$1$1;
import defpackage.o9x;

/* loaded from: classes15.dex */
public final class o9x extends Brick {
    public final Handler A = new Handler();
    public final a B = new Runnable() { // from class: com.yandex.messaging.chat.join.a
        @Override // java.lang.Runnable
        public final void run() {
            final o9x o9xVar = o9x.this;
            o9xVar.b.animate().translationYBy(-r0.getMeasuredHeight()).setDuration(240L).setInterpolator(new AccelerateDecelerateInterpolator()).setListener(new AnimatorListenerAdapter() { // from class: com.yandex.messaging.chat.join.JoinSuggestBrick$1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    o9x.this.a.setVisibility(8);
                }
            }).start();
        }
    };
    public Boolean C;
    public final View a;
    public final View b;
    public final Button c;
    public final h9x w;
    public final ChatRequest x;
    public final p4t y;
    public final mp11 z;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.yandex.messaging.chat.join.a] */
    public o9x(Activity activity, p4t p4tVar, mp11 mp11Var, h9x h9xVar, ChatRequest chatRequest) {
        View inflate = LayoutInflater.from(activity).inflate(olh0.msg_b_chat_join_suggest, (ViewGroup) null);
        this.a = inflate;
        this.y = p4tVar;
        this.z = mp11Var;
        this.w = h9xVar;
        this.x = chatRequest;
        this.b = inflate.findViewById(e9h0.join_suggest);
        Button button = (Button) inflate.findViewById(e9h0.join_suggest_button);
        this.c = button;
        button.setOnClickListener(new zgv(3, h9xVar));
        button.setTextColor(qke.m(ipg0.msg_text_selector, activity));
    }

    @Override // com.yandex.bricks.Brick
    public final View getView() {
        return this.a;
    }

    @Override // com.yandex.bricks.Brick
    public final void onBrickAttach(Bundle bundle) {
        super.onBrickAttach(bundle);
        tse brickScope = getBrickScope();
        k9b k9bVar = new k9b(8, this);
        p4t p4tVar = this.y;
        p4tVar.getClass();
        tje.N(brickScope, null, null, new SimpleFlowUseCase$subscribe$$inlined$suspendDisposable$1$1(null, p4tVar, this.x, k9bVar), 3);
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickDetach() {
        super.onBrickDetach();
        this.A.removeCallbacks(this.B);
        this.b.animate().cancel();
    }
}
