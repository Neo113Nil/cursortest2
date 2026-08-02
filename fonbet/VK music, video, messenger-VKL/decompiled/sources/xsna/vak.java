package xsna;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.auth.screendata.CreateVkEmailRequiredData;
import com.vk.auth.ui.VkLoadingButton;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vkontakte.android.R;

/* compiled from: CreateVkEmailFragment.kt */
/* loaded from: classes15.dex */
public final class vak extends a66<rak> implements tak {
    public final b A = new b();
    public final uak B = new View.OnFocusChangeListener() { // from class: xsna.uak
        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z) {
            Object obj = vak.this.o;
            if (obj == null) {
                obj = null;
            }
            ((rak) obj).u(z);
        }
    };
    public View s;
    public EditText t;
    public RecyclerView u;
    public TextView v;
    public TextView w;
    public View x;
    public CheckBox y;
    public yak z;

    /* compiled from: CreateVkEmailFragment.kt */
    public static final class a {
        public static Bundle a(CreateVkEmailRequiredData createVkEmailRequiredData) {
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("emailRequiredData", createVkEmailRequiredData);
            return bundle;
        }
    }

    /* compiled from: CreateVkEmailFragment.kt */
    public static final class b extends RecyclerView.n {
        public final int b = iah0.a(8);
        public final int c = iah0.a(20);

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            int i = this.b;
            int i2 = this.c;
            rect.left = childAdapterPosition == 0 ? i2 : i;
            if (childAdapterPosition == itemCount - 1) {
                i = i2;
            }
            rect.right = i;
        }
    }

    @Override // xsna.tak
    public final void Bj(String str) {
        TextView textView = this.v;
        if (textView == null) {
            textView = null;
        }
        textView.setText(str);
    }

    @Override // xsna.tak
    public final xvi Ki() {
        CheckBox checkBox = this.y;
        if (checkBox == null) {
            checkBox = null;
        }
        return new xvi(checkBox);
    }

    @Override // xsna.tak
    public final void M8() {
        yak yakVar = this.z;
        if (yakVar == null) {
            yakVar = null;
        }
        yakVar.notifyDataSetChanged();
    }

    @Override // xsna.tak
    public final void ek(boolean z) {
        View view = this.x;
        if (view == null) {
            view = null;
        }
        awt0.v(view, z);
    }

    @Override // xsna.tak
    public final qno0 j6() {
        EditText editText = this.t;
        if (editText == null) {
            editText = null;
        }
        return new qno0(editText);
    }

    @Override // xsna.tak
    public final void md() {
        bpn0 bpn0Var = t65.a;
        EditText editText = this.t;
        if (editText == null) {
            editText = null;
        }
        t65.a(editText);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return wn(R.layout.vk_create_email_fragment, layoutInflater, viewGroup);
    }

    @Override // xsna.a66, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        EditText editText = this.t;
        if (editText == null) {
            editText = null;
        }
        editText.setOnFocusChangeListener(null);
        RecyclerView recyclerView = this.u;
        (recyclerView != null ? recyclerView : null).removeItemDecoration(this.A);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.a66, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.s = view.findViewById(R.id.vk_create_email_fragment_input_container);
        this.t = (EditText) view.findViewById(R.id.vk_create_email_fragment_username);
        this.u = (RecyclerView) view.findViewById(R.id.vk_create_email_fragment_suggests);
        this.v = (TextView) view.findViewById(R.id.vk_create_email_fragment_domain);
        this.w = (TextView) view.findViewById(R.id.vk_create_email_fragment_error);
        this.x = view.findViewById(R.id.vk_create_email_fragment_ads_container);
        this.y = (CheckBox) view.findViewById(R.id.vk_create_email_fragment_ads_checkbox);
        Object obj = this.o;
        if (obj == null) {
            obj = null;
        }
        this.z = new yak((rak) obj);
        RecyclerView recyclerView = this.u;
        if (recyclerView == null) {
            recyclerView = null;
        }
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        RecyclerView recyclerView2 = this.u;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        yak yakVar = this.z;
        if (yakVar == null) {
            yakVar = null;
        }
        recyclerView2.setAdapter(yakVar);
        RecyclerView recyclerView3 = this.u;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        recyclerView3.addItemDecoration(this.A);
        EditText editText = this.t;
        if (editText == null) {
            editText = null;
        }
        editText.setOnFocusChangeListener(this.B);
        VkLoadingButton vkLoadingButton = this.k;
        if (vkLoadingButton != null) {
            jjc.g(vkLoadingButton, new iie(this, 7));
        }
        Object obj2 = this.o;
        ((rak) (obj2 != null ? obj2 : null)).y0(this);
    }

    @Override // xsna.tak
    public final void ph(String str) {
        EditText editText = this.t;
        if (editText == null) {
            editText = null;
        }
        editText.setText(str);
        EditText editText2 = this.t;
        (editText2 != null ? editText2 : null).setSelection(str.length());
    }

    @Override // xsna.tak
    public final void r3(boolean z) {
        CheckBox checkBox = this.y;
        if (checkBox == null) {
            checkBox = null;
        }
        checkBox.setChecked(z);
    }

    @Override // xsna.tak
    public final void r7(qak qakVar) {
        boolean z = qakVar.c;
        String str = qakVar.b;
        int i = str != null ? R.drawable.vk_auth_bg_edittext_error : (!qakVar.a || z) ? R.drawable.vk_auth_bg_edittext : R.drawable.vk_auth_bg_edittext_focused;
        View view = this.s;
        if (view == null) {
            view = null;
        }
        view.setBackgroundResource(i);
        TextView textView = this.w;
        if (textView == null) {
            textView = null;
        }
        ey2.i(textView, str);
        EditText editText = this.t;
        if (editText == null) {
            editText = null;
        }
        editText.setEnabled(!z);
        View view2 = this.s;
        if (view2 == null) {
            view2 = null;
        }
        view2.setEnabled(!z);
        TextView textView2 = this.v;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setEnabled(!z);
        EditText editText2 = this.t;
        if (editText2 == null) {
            editText2 = null;
        }
        editText2.setAlpha(z ? 0.4f : 1.0f);
        TextView textView3 = this.v;
        (textView3 != null ? textView3 : null).setAlpha(z ? 0.4f : 1.0f);
    }

    @Override // xsna.tak
    public final void setContinueButtonEnabled(boolean z) {
        VkLoadingButton vkLoadingButton = this.k;
        if (vkLoadingButton != null) {
            vkLoadingButton.setEnabled(z);
        }
    }

    @Override // xsna.a66
    public final rak tn(Bundle bundle) {
        return new xak(bundle, (CreateVkEmailRequiredData) requireArguments().getParcelable("emailRequiredData"));
    }

    @Override // xsna.a66, xsna.arf0
    public final SchemeStatSak$EventScreen u5() {
        return SchemeStatSak$EventScreen.VK_MAIL_CREATE;
    }

    @Override // xsna.x65
    public final void wm(boolean z) {
        View view = this.s;
        if (view == null) {
            view = null;
        }
        view.setEnabled(!z);
        VkLoadingButton vkLoadingButton = this.k;
        if (vkLoadingButton != null) {
            vkLoadingButton.setEnabled(!z);
        }
    }
}
