package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.attaches.AttachWithTranscription;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vkontakte.android.R;

/* compiled from: MsgPartMsgTranscriptHolder.kt */
/* loaded from: classes2.dex */
public final class gs30 extends hr30<AttachWithTranscription, hs30> {
    public View d;
    public TextView e;
    public Context f;
    public SpannableString g;
    public pk30 j;
    public hs30 k;
    public final SpannableStringBuilder h = new SpannableStringBuilder();
    public CharacterStyle i = new m7s(R.attr.vk_legacy_text_secondary);
    public final v5t l = new v5t(R.layout.vkim_msg_part_audio_msg_text);

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            gs30 gs30Var = gs30.this;
            pk30 pk30Var = gs30Var.j;
            hs30 hs30Var = gs30Var.k;
            Integer valueOf = hs30Var != null ? Integer.valueOf(hs30Var.b) : null;
            if (pk30Var == null || valueOf == null) {
                return;
            }
            pk30Var.g(valueOf.intValue());
        }
    }

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class b implements View.OnLongClickListener {
        public b() {
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            gs30 gs30Var = gs30.this;
            pk30 pk30Var = gs30Var.j;
            hs30 hs30Var = gs30Var.k;
            Boolean bool = null;
            Integer valueOf = hs30Var != null ? Integer.valueOf(hs30Var.b) : null;
            if (pk30Var != null && valueOf != null) {
                pk30Var.b0(valueOf.intValue());
                bool = Boolean.TRUE;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        int i = bubbleColors.i;
        View view = this.d;
        if (view == null) {
            view = null;
        }
        view.setBackgroundTintList(ColorStateList.valueOf(bubbleColors.o));
        SpannableString spannableString = this.g;
        if (spannableString == null) {
            spannableString = null;
        }
        spannableString.removeSpan(this.i);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i);
        this.i = foregroundColorSpan;
        SpannableString spannableString2 = this.g;
        SpannableString spannableString3 = spannableString2 == null ? null : spannableString2;
        if (spannableString2 == null) {
            spannableString2 = null;
        }
        spannableString3.setSpan(foregroundColorSpan, 0, spannableString2.length(), 0);
        s();
        TextView textView = this.e;
        TextView textView2 = textView != null ? textView : null;
        hs30 hs30Var = this.k;
        if (hs30Var != null && hs30Var.c) {
            i = bubbleColors.g;
        }
        textView2.setTextColor(i);
    }

    @Override // xsna.hr30
    public final void p(hs30 hs30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        this.j = pk30Var;
        this.k = hs30Var;
        s();
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        v5t v5tVar = this.l;
        View c = v5tVar.c(layoutInflater, viewGroup);
        View view = (View) v5tVar.c;
        if (view == null) {
            view = null;
        }
        view.setOnClickListener(new a());
        View view2 = (View) v5tVar.c;
        if (view2 == null) {
            view2 = null;
        }
        view2.setOnLongClickListener(new b());
        this.f = c.getContext();
        this.e = (TextView) c.findViewById(R.id.transcript_text);
        this.d = c.findViewById(R.id.vkim_fwd_divider);
        StringBuilder sb = new StringBuilder(" (");
        Context context = this.f;
        sb.append((Object) (context != null ? context : null).getText(R.string.vkim_msg_edit_mark));
        sb.append(')');
        SpannableString spannableString = new SpannableString(sb.toString());
        spannableString.setSpan(this.i, 0, spannableString.length(), 0);
        this.g = spannableString;
        return c;
    }

    @Override // xsna.hr30
    public final void r() {
        this.j = null;
        this.k = null;
    }

    public final void s() {
        CharSequence charSequence;
        hs30 hs30Var = this.k;
        TextView textView = this.e;
        TextView textView2 = textView;
        if (textView == null) {
            textView2 = null;
        }
        if (hs30Var == null) {
            charSequence = "";
        } else {
            CharSequence charSequence2 = hs30Var.f;
            if (hs30Var.d) {
                Context context = this.f;
                charSequence = (context != null ? context : null).getString(R.string.vkim_msg_transcript_progress);
            } else if (hs30Var.e) {
                if (hs30Var.h) {
                    Context context2 = this.f;
                    charSequence = (context2 != null ? context2 : null).getString(R.string.vkim_videomsg_transcript_is_failed);
                } else {
                    Context context3 = this.f;
                    charSequence = (context3 != null ? context3 : null).getString(R.string.vkim_audiomsg_transcript_is_failed);
                }
            } else if (charSequence2.length() == 0) {
                Context context4 = this.f;
                charSequence = (context4 != null ? context4 : null).getString(R.string.vkim_msg_transcript_is_empty);
            } else if (hs30Var.g) {
                SpannableStringBuilder spannableStringBuilder = this.h;
                spannableStringBuilder.clear();
                spannableStringBuilder.clearSpans();
                spannableStringBuilder.append(charSequence2);
                CharSequence charSequence3 = this.g;
                spannableStringBuilder.append(charSequence3 != null ? charSequence3 : null);
                charSequence = spannableStringBuilder;
            } else {
                charSequence = charSequence2;
            }
        }
        textView2.setText(charSequence);
    }
}
