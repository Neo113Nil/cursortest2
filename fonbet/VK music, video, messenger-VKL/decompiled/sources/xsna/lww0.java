package xsna;

import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.vk.voip.ui.scheduled.creation.ui.VoipScheduleCallViewState;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.pxw0;

/* compiled from: VoipScheduleCallEditTextViewHolder.kt */
/* loaded from: classes7.dex */
public final class lww0 extends vfz<VoipScheduleCallViewState.ScreenState.Item.EditText> {
    public final qxw0<pxw0> l;
    public final TextView m;
    public final TextView n;
    public final EditText o;
    public VoipScheduleCallViewState.ScreenState.Item.EditText p;
    public final a q;

    /* compiled from: VoipScheduleCallEditTextViewHolder.kt */
    public static final class a extends xsj0 {

        /* compiled from: VoipScheduleCallEditTextViewHolder.kt */
        /* renamed from: xsna.lww0$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3308a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[VoipScheduleCallViewState.ScreenState.Item.EditText.Type.values().length];
                try {
                    iArr[VoipScheduleCallViewState.ScreenState.Item.EditText.Type.NAME.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public a() {
        }

        @Override // xsna.xsj0, android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            lww0 lww0Var = lww0.this;
            VoipScheduleCallViewState.ScreenState.Item.EditText editText = lww0Var.p;
            VoipScheduleCallViewState.ScreenState.Item.EditText.Type type = editText != null ? editText.g : null;
            int i4 = type == null ? -1 : C3308a.$EnumSwitchMapping$0[type.ordinal()];
            if (i4 == -1) {
                s3q0 s3q0Var = s3q0.a;
            } else {
                if (i4 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                lww0Var.l.a(new pxw0.f(charSequence.toString()));
                s3q0 s3q0Var2 = s3q0.a;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public lww0(ViewGroup viewGroup, qxw0<? super pxw0> qxw0Var) {
        super(R.layout.voip_schedule_call_edit_text_item, viewGroup);
        this.l = qxw0Var;
        this.m = (TextView) this.itemView.findViewById(R.id.title);
        this.n = (TextView) this.itemView.findViewById(R.id.tv_bottom_caption);
        this.o = (EditText) this.itemView.findViewById(R.id.et);
        this.q = new a();
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(VoipScheduleCallViewState.ScreenState.Item.EditText editText) {
        VoipScheduleCallViewState.ScreenState.Item.EditText editText2 = editText;
        String str = editText2.i;
        boolean z = editText2.h;
        final cbt0 cbt0Var = new cbt0(this, 13);
        EditText editText3 = this.o;
        editText3.setOnFocusChangeListener(null);
        if (!z) {
            editText3.clearFocus();
        }
        editText3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: xsna.czp0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                cbt0.this.invoke(Boolean.valueOf(z2));
            }
        });
        this.m.setText(editText2.b);
        editText3.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(editText2.e)});
        dzp0.a(editText3, editText2.d, this.q);
        TextView textView = this.n;
        if (str != null) {
            editText3.setHint((CharSequence) null);
            editText3.setBackground(this.itemView.getContext().getDrawable(R.drawable.bg_voip_edittext_error));
            textView.setText(str);
            textView.setTextColor(dhr0.Y(R.attr.vk_ui_background_negative, this.itemView.getContext()));
        } else {
            editText3.setHint(editText2.c);
            editText3.setBackground(this.itemView.getContext().getDrawable(R.drawable.bg_voip_edittext));
            textView.setTextColor(dhr0.Y(R.attr.vk_ui_text_secondary, this.itemView.getContext()));
            textView.setText(editText2.f);
        }
        this.p = editText2;
    }
}
