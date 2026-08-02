package xsna;

import android.text.InputFilter;
import android.view.ViewGroup;
import android.widget.EditText;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: InputTextQuestionViewHolder.kt */
/* loaded from: classes16.dex */
public final class m3x extends vfz<k3x> {
    public final ay0 l;
    public final EditText m;
    public final VkText n;

    public m3x(ViewGroup viewGroup, ay0 ay0Var) {
        super(R.layout.internal_nps_input_text_question_item, viewGroup);
        this.l = ay0Var;
        EditText editText = (EditText) this.itemView.findViewById(R.id.internal_nps_input);
        this.m = editText;
        this.n = (VkText) this.itemView.findViewById(R.id.internal_nps_input_limit);
        editText.addTextChangedListener(new l3x(this));
        editText.setOnTouchListener(new nb6(1));
    }

    @Override // xsna.vfz
    public final void W5(k3x k3xVar) {
        InputFilter inputFilter;
        k3x k3xVar2 = k3xVar;
        int i = k3xVar2.c;
        EditText editText = this.m;
        InputFilter[] filters = editText.getFilters();
        if (filters != null) {
            int length = filters.length;
            for (int i2 = 0; i2 < length; i2++) {
                inputFilter = filters[i2];
                if (inputFilter instanceof InputFilter.LengthFilter) {
                    break;
                }
            }
        }
        inputFilter = null;
        InputFilter.LengthFilter lengthFilter = inputFilter instanceof InputFilter.LengthFilter ? (InputFilter.LengthFilter) inputFilter : null;
        if ((lengthFilter != null ? lengthFilter.getMax() : -1) != i) {
            editText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i)});
        }
        this.n.setText(tlo0.b.a(k3xVar2.b, this.itemView.getContext()));
    }
}
