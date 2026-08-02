package defpackage;

import android.animation.AnimatorInflater;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.emoji2.widget.EmojiEditText;
import androidx.recyclerview.widget.x0;
import com.yandex.messaging.domain.poll.PollMessageDraft;
import com.yandex.messaging.ui.createpoll.AnswerVariantViewHolder$textWatcher$1;
import defpackage.fl2;

/* loaded from: classes15.dex */
public final class fl2 extends x0 implements tvr {
    public static final int T = olh0.msg_vh_create_poll_answer_item;
    public final int N;
    public final int O;
    public final EmojiEditText P;
    public final View Q;
    public final TextView R;
    public final AnswerVariantViewHolder$textWatcher$1 S;

    /* JADX WARN: Type inference failed for: r2v3, types: [com.yandex.messaging.ui.createpoll.AnswerVariantViewHolder$textWatcher$1] */
    public fl2(View view, j7f j7fVar, final tbb tbbVar, final j7f j7fVar2) {
        super(view);
        Context context = view.getContext();
        this.N = fxa1.c(jng0.messagingCommonIconsSecondaryColor, context).data;
        this.O = fxa1.c(jng0.messagingCommonDestructiveTextColor, context).data;
        EmojiEditText emojiEditText = (EmojiEditText) view.findViewById(e9h0.variant_input);
        this.P = emojiEditText;
        View findViewById = view.findViewById(e9h0.remove_answer);
        this.Q = findViewById;
        this.R = (TextView) view.findViewById(e9h0.remaining_chars);
        this.S = new TextWatcher() { // from class: com.yandex.messaging.ui.createpoll.AnswerVariantViewHolder$textWatcher$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                fl2 fl2Var = fl2.this;
                String valueOf = String.valueOf(s);
                int i = fl2.T;
                fl2Var.W(valueOf);
                tbbVar.invoke(Integer.valueOf(fl2.this.F()), String.valueOf(s));
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        };
        emojiEditText.setHint(emojiEditText.getResources().getString(oyh0.messenger_create_poll_variant_hint));
        emojiEditText.setImeOptions(5);
        emojiEditText.setRawInputType(1);
        emojiEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: el2
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 5) {
                    return false;
                }
                j7f.this.invoke(Integer.valueOf(this.F()));
                return true;
            }
        });
        emojiEditText.setStateListAnimator(AnimatorInflater.loadStateListAnimator(emojiEditText.getContext(), pmg0.msg_animator_input_elevation));
        findViewById.setOnClickListener(new nl(1, this, view, j7fVar));
    }

    public final void W(String str) {
        int length = str.length();
        TextView textView = this.R;
        if (length < 70) {
            ai91.c(textView, false);
            return;
        }
        if (str.length() <= 140) {
            ai91.f(textView, false);
            textView.setTextColor(this.N);
            textView.setText(String.valueOf(PollMessageDraft.MAX_ANSWER_LENGTH - str.length()));
        } else {
            ai91.f(textView, false);
            textView.setTextColor(this.O);
            textView.setText(String.valueOf(PollMessageDraft.MAX_ANSWER_LENGTH - str.length()));
        }
    }

    @Override // defpackage.tvr
    public final EditText d() {
        return this.P;
    }
}
