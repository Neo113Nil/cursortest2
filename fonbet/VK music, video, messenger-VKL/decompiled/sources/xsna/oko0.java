package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import com.vk.dto.stories.model.mention.SelectionChangeEditText;
import com.vk.log.L;
import com.vkontakte.android.R;
import java.util.regex.Matcher;

/* compiled from: TextPostingView.kt */
/* loaded from: classes4.dex */
public final class oko0 implements kko0, View.OnClickListener {
    public lko0 b;
    public SelectionChangeEditText c;
    public final bpn0 d = new bpn0(new nm60(this, 25));
    public final b e = new b();

    /* compiled from: TextPostingView.kt */
    public static final class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            lko0 lko0Var = oko0.this.b;
            if (lko0Var != null) {
                lko0Var.b.Zi();
            }
            return super.onSingleTapUp(motionEvent);
        }
    }

    /* compiled from: TextPostingView.kt */
    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            lko0 lko0Var = oko0.this.b;
            if (lko0Var != null) {
                ucp.i(editable);
                q420 q420Var = lko0Var.l;
                if (q420Var == null) {
                    q420Var = null;
                }
                q420Var.afterTextChanged(editable);
                Matcher matcher = hd60.a().N0().matcher(editable);
                if (!matcher.find() || editable == null) {
                    return;
                }
                editable.replace(matcher.start(), matcher.end(), matcher.group(2));
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            lko0 lko0Var = oko0.this.b;
            if (lko0Var != null) {
                q420 q420Var = lko0Var.l;
                if (q420Var == null) {
                    q420Var = null;
                }
                q420Var.getClass();
            }
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            lko0 lko0Var = oko0.this.b;
            if (lko0Var != null) {
                qdc0 qdc0Var = lko0Var.b;
                kko0 kko0Var = lko0Var.c;
                if (kko0Var.getText().length() > 100) {
                    lko0Var.Z();
                } else {
                    lko0Var.z();
                }
                if (lko0Var.e) {
                    lko0Var.e = false;
                    qdc0Var.Na();
                    return;
                }
                qdc0Var.Qk(kko0Var.getText());
                dvu dvuVar = lko0Var.m;
                if (dvuVar != null) {
                    dvuVar.onTextChanged(charSequence, i, i2, i3);
                }
                q420 q420Var = lko0Var.l;
                if (q420Var == null) {
                    q420Var = null;
                }
                q420Var.onTextChanged(charSequence, i, i2, i3);
            }
        }
    }

    @Override // xsna.kko0
    public final void Qi(float f) {
        try {
            SelectionChangeEditText selectionChangeEditText = this.c;
            if (selectionChangeEditText != null) {
                selectionChangeEditText.setTextSize(f);
            }
        } catch (Exception e) {
            L.i(e);
        }
    }

    @Override // xsna.kko0
    public final void clearFocus() {
        SelectionChangeEditText selectionChangeEditText = this.c;
        if (selectionChangeEditText != null) {
            selectionChangeEditText.clearFocus();
        }
    }

    @Override // xsna.kko0
    public final void d0() {
        mhy.d(this.c);
    }

    @Override // xsna.jk6
    @SuppressLint({"ClickableViewAccessibility"})
    public final void d3(View view) {
        final SelectionChangeEditText selectionChangeEditText = (SelectionChangeEditText) view.findViewById(R.id.posting_edit_text);
        selectionChangeEditText.addTextChangedListener(this.e);
        selectionChangeEditText.setSelectionChangeListener(this.b);
        selectionChangeEditText.setOnTouchListener(new mko0(this, 0));
        selectionChangeEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: xsna.nko0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                if (z) {
                    return;
                }
                SelectionChangeEditText selectionChangeEditText2 = SelectionChangeEditText.this;
                Editable text = selectionChangeEditText2.getText();
                int length = text != null ? text.length() : 0;
                selectionChangeEditText2.setSelection(length, length);
            }
        });
        this.c = selectionChangeEditText;
        View findViewById = view.findViewById(R.id.posting_linear_layout);
        if (findViewById != null || (findViewById = this.c) != null) {
            findViewById.setOnClickListener(this);
        }
        lko0 lko0Var = this.b;
        if (lko0Var != null) {
            lko0Var.onStart();
        }
    }

    @Override // xsna.kko0
    public final CharSequence getText() {
        Editable text;
        SelectionChangeEditText selectionChangeEditText = this.c;
        return (selectionChangeEditText == null || (text = selectionChangeEditText.getText()) == null) ? "" : text;
    }

    @Override // xsna.kko0
    public final void k() {
        mhy.j(this.c);
    }

    @Override // xsna.kko0
    public final void kj() {
        SelectionChangeEditText selectionChangeEditText;
        Editable text;
        SelectionChangeEditText selectionChangeEditText2 = this.c;
        int length = (selectionChangeEditText2 == null || (text = selectionChangeEditText2.getText()) == null) ? 0 : text.length();
        if (length == 0 || (selectionChangeEditText = this.c) == null) {
            return;
        }
        selectionChangeEditText.setSelection(length);
    }

    @Override // xsna.kko0
    public final EditText l0() {
        return this.c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        lko0 lko0Var;
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (((valueOf != null && valueOf.intValue() == R.id.posting_linear_layout) || (valueOf != null && valueOf.intValue() == R.id.posting_edit_text)) && (lko0Var = this.b) != null) {
            lko0Var.b.Zi();
        }
    }

    @Override // xsna.jk6
    public final void onDestroyView() {
        this.c = null;
    }

    @Override // xsna.kko0
    public final void q2(int i) {
        SelectionChangeEditText selectionChangeEditText;
        if (i >= 0) {
            SelectionChangeEditText selectionChangeEditText2 = this.c;
            if ((selectionChangeEditText2 != null ? selectionChangeEditText2.length() : 0) >= i && (selectionChangeEditText = this.c) != null) {
                selectionChangeEditText.setSelection(i);
            }
        }
    }

    @Override // xsna.kko0
    public final void rk(String str) {
        Editable text;
        SelectionChangeEditText selectionChangeEditText = this.c;
        int selectionStart = selectionChangeEditText != null ? selectionChangeEditText.getSelectionStart() : 0;
        int i = selectionStart != -1 ? selectionStart : 0;
        SelectionChangeEditText selectionChangeEditText2 = this.c;
        if (selectionChangeEditText2 == null || (text = selectionChangeEditText2.getText()) == null) {
            return;
        }
        text.insert(i, str);
    }

    @Override // xsna.kko0
    public final void setHintText(int i) {
        Context context;
        SelectionChangeEditText selectionChangeEditText = this.c;
        if (selectionChangeEditText != null) {
            selectionChangeEditText.setHint((selectionChangeEditText == null || (context = selectionChangeEditText.getContext()) == null) ? null : context.getString(i));
        }
    }

    @Override // xsna.kko0
    public final void setText(CharSequence charSequence) {
        SelectionChangeEditText selectionChangeEditText = this.c;
        if (selectionChangeEditText != null) {
            selectionChangeEditText.setText(charSequence);
        }
    }

    @Override // xsna.kko0
    public final void sm(Typeface typeface) {
        SelectionChangeEditText selectionChangeEditText = this.c;
        if (selectionChangeEditText != null) {
            selectionChangeEditText.setTypeface(typeface);
        }
    }

    @Override // xsna.kko0
    public final int t1() {
        SelectionChangeEditText selectionChangeEditText = this.c;
        if (selectionChangeEditText != null) {
            return selectionChangeEditText.getSelectionEnd();
        }
        return 0;
    }

    @Override // xsna.kko0
    public final void v7(boolean z) {
        SelectionChangeEditText selectionChangeEditText = this.c;
        if (selectionChangeEditText != null) {
            bwt0.p0(selectionChangeEditText, z);
        }
    }

    @Override // xsna.kko0
    public final void w() {
        SelectionChangeEditText selectionChangeEditText = this.c;
        if (selectionChangeEditText != null) {
            selectionChangeEditText.requestFocus();
        }
    }
}
