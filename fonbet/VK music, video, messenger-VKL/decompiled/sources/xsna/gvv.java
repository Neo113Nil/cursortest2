package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.lists.ListDataSet;
import com.vk.superapp.api.dto.identity.WebIdentityLabel;
import com.vkontakte.android.R;
import java.util.ArrayList;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.bt9;

/* compiled from: IdentityEditAdapter.kt */
/* loaded from: classes6.dex */
public final class gvv extends zoj0<vuv, RecyclerView.e0> implements mf7, bt9.a {
    public static final int h = iah0.a(14);
    public static final int i = iah0.a(6);
    public final c0v0 e;
    public zuv f;
    public final bt9 g = new bt9(this);

    /* compiled from: IdentityEditAdapter.kt */
    public final class a extends RecyclerView.e0 {
    }

    /* compiled from: IdentityEditAdapter.kt */
    public final class c extends RecyclerView.e0 {
        public final TextView l;
        public final TextView m;

        public c(View view) {
            super(view);
            this.l = (TextView) view.findViewById(R.id.title);
            TextView textView = (TextView) view.findViewById(R.id.selected_item);
            this.m = textView;
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, krv0.f(R.drawable.vk_icon_dropdown_24, R.attr.vk_ui_icon_secondary, textView.getContext()), (Drawable) null);
            int i = gvv.h;
            view.setPadding(i, i, i, gvv.i);
            jjc.g(view, new com.vk.movika.sdk.base.logic.interactor.i(15, gvv.this, this));
        }
    }

    public gvv(c0v0 c0v0Var) {
        this.e = c0v0Var;
    }

    @Override // xsna.bt9.a
    public final boolean F(int i2) {
        return getItemViewType(i2) == 0;
    }

    public final void K0(Context context) {
        WebIdentityLabel webIdentityLabel = this.e.m;
        if (this.f == null) {
            this.f = new zuv("custom_label", context.getString(R.string.vk_identity_label_name), R.layout.vk_identity_textfield);
        }
        if (webIdentityLabel != null) {
            int v = ((ListDataSet) this.c).v(this.f);
            if (webIdentityLabel.zb() && v == -1) {
                z0(2, this.f);
            } else if (!webIdentityLabel.zb() && v != -1) {
                B0(this.f);
            } else if (((zuv) ((ArrayList) y0()).get(2)).b.equals("custom_label")) {
                notifyItemChanged(2);
            }
        }
        notifyItemChanged(1);
    }

    @Override // xsna.mf7
    public final int e0(int i2) {
        return this.g.e0(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i2) {
        return ((vuv) ((ArrayList) y0()).get(i2)).a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i2) {
        String string;
        vuv vuvVar = (vuv) ((ListDataSet) this.c).d.get(i2);
        if (e0Var instanceof c) {
            c cVar = (c) e0Var;
            zuv zuvVar = (zuv) vuvVar;
            c0v0 c0v0Var = gvv.this.e;
            TextView textView = cVar.m;
            TextView textView2 = cVar.l;
            String str = zuvVar.c;
            textView2.setText(str);
            String str2 = zuvVar.b;
            if (!str2.equals("label") && !str2.equals("custom_label")) {
                String b2 = c0v0Var.b(str2);
                if (drm0.N(b2)) {
                    textView.setText(str);
                    TypedValue typedValue = krv0.a;
                    krv0.q(textView, R.attr.vk_ui_text_secondary);
                    return;
                } else {
                    textView.setText(b2);
                    TypedValue typedValue2 = krv0.a;
                    krv0.q(textView, R.attr.vk_ui_text_primary);
                    return;
                }
            }
            WebIdentityLabel webIdentityLabel = c0v0Var.m;
            if (webIdentityLabel == null) {
                textView.setText(str);
                TypedValue typedValue3 = krv0.a;
                krv0.q(textView, R.attr.vk_ui_text_secondary);
                return;
            } else if (webIdentityLabel.zb()) {
                textView.setText(textView.getContext().getString(R.string.vk_identity_custom_label));
                TypedValue typedValue4 = krv0.a;
                krv0.q(textView, R.attr.vk_ui_text_secondary);
                return;
            } else {
                textView.setText(webIdentityLabel.c);
                TypedValue typedValue5 = krv0.a;
                krv0.q(textView, R.attr.vk_ui_text_primary);
                return;
            }
        }
        if (e0Var instanceof a) {
            a aVar = (a) e0Var;
            String str3 = this.e.w;
            if (str3 == null) {
                str3 = null;
            }
            View view = aVar.itemView;
            TextView textView3 = (TextView) view;
            Context context = view.getContext();
            int hashCode = str3.hashCode();
            if (hashCode == -1147692044) {
                if (str3.equals(RTCStatsConstants.KEY_ADDRESS)) {
                    string = context.getString(R.string.vk_identity_remove_address);
                    textView3.setText(string);
                    return;
                }
                throw new IllegalStateException(str3.concat(" not supported"));
            }
            if (hashCode == 96619420) {
                if (str3.equals("email")) {
                    string = context.getString(R.string.vk_identity_remove_email);
                    textView3.setText(string);
                    return;
                }
                throw new IllegalStateException(str3.concat(" not supported"));
            }
            if (hashCode == 106642798 && str3.equals("phone")) {
                string = context.getString(R.string.vk_identity_remove_phone);
                textView3.setText(string);
                return;
            }
            throw new IllegalStateException(str3.concat(" not supported"));
        }
        if (e0Var instanceof b) {
            b bVar = (b) e0Var;
            zuv zuvVar2 = (zuv) vuvVar;
            EditText editText = bVar.m;
            TextView textView4 = bVar.l;
            String str4 = zuvVar2.c;
            textView4.setText(str4);
            c0v0 c0v0Var2 = gvv.this.e;
            String str5 = zuvVar2.b;
            String b3 = c0v0Var2.b(str5);
            if (drm0.N(b3)) {
                editText.setHint(str4);
                editText.setText("");
            } else {
                editText.setHint("");
                editText.setText(b3);
            }
            switch (str5.hashCode()) {
                case -1147692044:
                    if (str5.equals(RTCStatsConstants.KEY_ADDRESS)) {
                        editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
                        return;
                    }
                    break;
                case -612351174:
                    if (str5.equals("phone_number")) {
                        editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(22)});
                        editText.setInputType(3);
                        return;
                    }
                    break;
                case 96619420:
                    if (str5.equals("email")) {
                        editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(70)});
                        editText.setInputType(33);
                        return;
                    }
                    break;
                case 723408038:
                    if (str5.equals("custom_label")) {
                        editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(30)});
                        return;
                    }
                    break;
                case 757462669:
                    if (str5.equals("postcode")) {
                        editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(20)});
                        return;
                    }
                    break;
            }
            editText.setFilters(new InputFilter[0]);
            editText.setInputType(1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i2) {
        if (i2 == 0 || i2 == 2) {
            int i3 = iop0.b;
            return new hop0(new iop0(viewGroup.getContext()));
        }
        View b2 = tf3.b(viewGroup, i2, viewGroup, false);
        if (i2 == R.layout.vk_identity_card_item) {
            return new c(b2);
        }
        if (i2 == R.layout.vk_identity_textfield) {
            return new b(b2);
        }
        if (i2 != R.layout.vk_material_list_button_red) {
            throw new IllegalStateException("unsupported this viewType");
        }
        a aVar = new a(b2);
        jjc.g(b2, new dxh(this, 18));
        return aVar;
    }

    /* compiled from: IdentityEditAdapter.kt */
    public final class b extends RecyclerView.e0 implements TextWatcher, TextView.OnEditorActionListener {
        public final TextView l;
        public final EditText m;

        public b(View view) {
            super(view);
            this.l = (TextView) view.findViewById(R.id.title);
            EditText editText = (EditText) view.findViewById(R.id.text);
            this.m = editText;
            int i = gvv.h;
            view.setPadding(i, i, i, gvv.i);
            editText.addTextChangedListener(this);
            editText.setOnEditorActionListener(this);
            TypedValue typedValue = krv0.a;
            krv0.q(editText, R.attr.vk_ui_text_primary);
            editText.setHintTextColor(krv0.m(R.attr.vk_ui_text_secondary, editText.getContext()));
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            return false;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (i2 == 0 && i3 == 0) {
                return;
            }
            gvv gvvVar = gvv.this;
            c0v0 c0v0Var = gvvVar.e;
            String str = ((zuv) ((ArrayList) gvvVar.y0()).get(getAdapterPosition())).b;
            String valueOf = String.valueOf(charSequence);
            c0v0Var.getClass();
            switch (str.hashCode()) {
                case -1147692044:
                    if (str.equals(RTCStatsConstants.KEY_ADDRESS)) {
                        c0v0Var.q = valueOf;
                        c0v0Var.c();
                        return;
                    }
                    throw new IllegalStateException(zr.a("Not found ", str, " in fields"));
                case -612351174:
                    if (str.equals("phone_number")) {
                        c0v0Var.s = valueOf;
                        c0v0Var.c();
                        return;
                    }
                    throw new IllegalStateException(zr.a("Not found ", str, " in fields"));
                case 96619420:
                    if (str.equals("email")) {
                        c0v0Var.r = valueOf;
                        c0v0Var.c();
                        return;
                    }
                    throw new IllegalStateException(zr.a("Not found ", str, " in fields"));
                case 723408038:
                    if (str.equals("custom_label")) {
                        c0v0Var.m = new WebIdentityLabel(0, valueOf);
                        c0v0Var.c();
                        return;
                    }
                    throw new IllegalStateException(zr.a("Not found ", str, " in fields"));
                case 757462669:
                    if (str.equals("postcode")) {
                        c0v0Var.p = valueOf;
                        c0v0Var.c();
                        return;
                    }
                    throw new IllegalStateException(zr.a("Not found ", str, " in fields"));
                default:
                    throw new IllegalStateException(zr.a("Not found ", str, " in fields"));
            }
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
