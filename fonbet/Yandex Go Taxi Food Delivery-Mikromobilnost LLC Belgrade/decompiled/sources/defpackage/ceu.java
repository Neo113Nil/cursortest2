package defpackage;

import android.animation.ObjectAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.x0;
import com.yandex.messaging.domain.poll.PollMessageDraft;
import com.yandex.messaging.views.ExceededMaxLengthInterceptor;
import defpackage.tls;

/* loaded from: classes15.dex */
public final class ceu extends x0 implements tvr {
    public static final int P = olh0.msg_vh_create_poll_header;
    public final EditText N;
    public ObjectAnimator O;

    public ceu(View view, final j7f j7fVar) {
        super(view);
        EditText editText = (EditText) view.findViewById(e9h0.poll_question);
        this.N = editText;
        editText.setFilters(new ExceededMaxLengthInterceptor[]{new ExceededMaxLengthInterceptor(PollMessageDraft.MAX_ANSWER_LENGTH, new tzt(3, this))});
        editText.addTextChangedListener(new TextWatcher() { // from class: com.yandex.messaging.ui.createpoll.HeaderViewHolder$special$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
                tls.this.invoke(String.valueOf(text));
            }
        });
    }

    @Override // defpackage.tvr
    public final EditText d() {
        return this.N;
    }
}
