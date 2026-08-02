package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.emoji2.widget.EmojiEditText;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.yandex.messaging.ui.createpoll.AnswerVariantViewHolder$textWatcher$1;
import com.yandex.messaging.views.TextSwitchView;

/* loaded from: classes15.dex */
public final class k7f extends RecyclerView.Adapter {
    public final t7f a;
    public RecyclerView b;
    public Integer c;
    public final gjj w = new gjj(new a10(5));

    public k7f(t7f t7fVar) {
        this.a = t7fVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.w.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        s7f s7fVar = (s7f) this.w.c.get(i);
        if (s7fVar instanceof n7f) {
            return w80.N;
        }
        if (s7fVar instanceof o7f) {
            return fl2.T;
        }
        if (s7fVar instanceof r7f) {
            return ceu.P;
        }
        if (s7fVar instanceof p7f) {
            return sye.O;
        }
        if (s7fVar instanceof q7f) {
            return x0s.R;
        }
        w511.b();
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.b = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        boolean z = x0Var instanceof fl2;
        gjj gjjVar = this.w;
        if (z) {
            s7f s7fVar = (s7f) gjjVar.c.get(i);
            if (!(s7fVar instanceof o7f)) {
                ny61.r("Check failed.");
                return;
            }
            fl2 fl2Var = (fl2) x0Var;
            o7f o7fVar = (o7f) s7fVar;
            fl2Var.W(o7fVar.b);
            EmojiEditText emojiEditText = fl2Var.P;
            AnswerVariantViewHolder$textWatcher$1 answerVariantViewHolder$textWatcher$1 = fl2Var.S;
            emojiEditText.removeTextChangedListener(answerVariantViewHolder$textWatcher$1);
            emojiEditText.setText(o7fVar.b, TextView.BufferType.EDITABLE);
            emojiEditText.addTextChangedListener(answerVariantViewHolder$textWatcher$1);
            return;
        }
        if (x0Var instanceof sye) {
            s7f s7fVar2 = (s7f) gjjVar.c.get(i);
            if (s7fVar2 instanceof p7f) {
                ((sye) x0Var).N.setText(((p7f) s7fVar2).a);
                return;
            } else {
                ny61.r("Check failed.");
                return;
            }
        }
        if (x0Var instanceof x0s) {
            s7f s7fVar3 = (s7f) gjjVar.c.get(i);
            if (!(s7fVar3 instanceof q7f)) {
                ny61.r("Check failed.");
                return;
            }
            x0s x0sVar = (x0s) x0Var;
            q7f q7fVar = (q7f) s7fVar3;
            TextSwitchView textSwitchView = x0sVar.Q;
            Boolean bool = q7fVar.d;
            x0sVar.N.setChecked(q7fVar.a);
            x0sVar.O.setChecked(q7fVar.b);
            TextSwitchView textSwitchView2 = x0sVar.P;
            Boolean bool2 = q7fVar.c;
            textSwitchView2.setChecked(bool2 != null ? bool2.booleanValue() : false);
            textSwitchView2.setVisibility(bool2 != null ? 0 : 8);
            textSwitchView.setChecked(bool != null ? bool.booleanValue() : false);
            textSwitchView.setVisibility(bool == null ? 8 : 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View f = oo31.f(viewGroup, i, viewGroup, false);
        if (f == null) {
            ny61.t("null cannot be cast to non-null type android.view.View");
            return null;
        }
        int i2 = 4;
        if (i == w80.N) {
            j7f j7fVar = new j7f(this, 7);
            w80 w80Var = new w80(f);
            f.setOnClickListener(new k5(i2, j7fVar, w80Var));
            return w80Var;
        }
        if (i == fl2.T) {
            return new fl2(f, new j7f(this, 5), new tbb(12, this), new j7f(this, 6));
        }
        if (i == ceu.P) {
            return new ceu(f, new j7f(this, 0));
        }
        if (i == sye.O) {
            return new sye(f);
        }
        if (i == x0s.R) {
            return new x0s(f, new j7f(this, 1), new j7f(this, 2), new j7f(this, 3), new j7f(this, 4));
        }
        ny61.r(qv10.g(i, "unknown view type "));
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.b = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(x0 x0Var) {
        super.onViewAttachedToWindow(x0Var);
        if (x0Var instanceof tvr) {
            int F = x0Var.F();
            Integer num = this.c;
            if (num != null && F == num.intValue()) {
                tvr tvrVar = (tvr) x0Var;
                tvrVar.s();
                EditText d = tvrVar.d();
                ((InputMethodManager) d.getContext().getSystemService("input_method")).showSoftInput(d, 1);
                this.c = null;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(x0 x0Var) {
        super.onViewRecycled(x0Var);
        ceu ceuVar = x0Var instanceof ceu ? (ceu) x0Var : null;
        if (ceuVar != null) {
            ObjectAnimator objectAnimator = ceuVar.O;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            ceuVar.O = null;
        }
    }
}
