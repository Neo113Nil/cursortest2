package com.vkontakte.android.fragments;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.ironsource.X3;
import com.vkontakte.android.R;
import java.util.List;
import me.grishka.appkit.fragments.VKToolbarFragment;
import xsna.a0a;
import xsna.baf0;
import xsna.bi5;
import xsna.cvk;
import xsna.dhr0;
import xsna.jx2;
import xsna.mhy;
import xsna.n3r0;
import xsna.o1j0;
import xsna.p1j0;
import xsna.pj8;
import xsna.zp;

/* loaded from: classes7.dex */
public class SettingsDomainFragment extends VKToolbarFragment {
    public static final /* synthetic */ int j0 = 0;
    public EditText b0;
    public TextView c0;
    public TextView d0;
    public TextView e0;
    public c f0;
    public io.reactivex.rxjava3.disposables.c g0;
    public boolean h0 = false;
    public final a i0 = new a();

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SettingsDomainFragment settingsDomainFragment = SettingsDomainFragment.this;
            settingsDomainFragment.f0 = null;
            String obj = settingsDomainFragment.b0.getText().toString();
            n3r0 n3r0Var = new n3r0("utils.checkScreenName");
            n3r0Var.K("screen_name", obj);
            n3r0Var.C(1, "suggestions");
            settingsDomainFragment.g0 = new jx2(n3r0Var, new o1j0(settingsDomainFragment)).a();
        }
    }

    @Override // me.grishka.appkit.fragments.ToolbarFragment
    public final View no(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.settings_domain, (ViewGroup) null);
        this.b0 = (EditText) inflate.findViewById(R.id.domain_input);
        this.c0 = (TextView) inflate.findViewById(R.id.domain_status);
        this.d0 = (TextView) inflate.findViewById(R.id.domain_current_link);
        TextView textView = (TextView) inflate.findViewById(R.id.domain_explain);
        this.e0 = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString(X3.j.D, "") : "";
        this.b0.setText(string);
        EditText editText = this.b0;
        editText.setSelection(editText.length());
        if (TextUtils.isEmpty(string)) {
            this.b0.postDelayed(new bi5(this, 6), 100L);
        }
        TextView textView2 = this.d0;
        StringBuilder sb = new StringBuilder("https://");
        sb.append(a0a.d);
        sb.append(DomExceptionUtils.SEPARATOR);
        Bundle arguments2 = getArguments();
        sb.append(arguments2 != null ? arguments2.getString(X3.j.D, "") : "");
        textView2.setText(sb.toString());
        this.d0.setOnClickListener(new pj8(this, 8));
        qo();
        oo(0);
        po(null, true);
        this.b0.addTextChangedListener(new b());
        return inflate;
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        setTitle(R.string.page_address);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        baf0 b2 = dhr0.t.b(R.drawable.vk_icon_done_24, R.attr.vk_ui_icon_accent_themed);
        MenuItem add = menu.add(0, R.id.save, 0, R.string.save);
        add.setIcon(b2.mutate());
        add.setShowAsAction(2);
        add.setEnabled(this.h0);
        add.getIcon().setAlpha(this.h0 ? 255 : 100);
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.save) {
            return false;
        }
        String obj = this.b0.getText().toString();
        zp zpVar = new zp("account.saveProfileInfo");
        zpVar.K("screen_name", obj);
        jx2 jx2Var = new jx2(zpVar, new p1j0(this, getActivity(), obj));
        jx2Var.g = getActivity();
        jx2Var.a();
        return true;
    }

    public final void oo(int i) {
        int c2 = i != 1 ? i != 2 ? dhr0.t.c(R.attr.vk_ui_text_accent) : dhr0.t.c(R.attr.vk_ui_text_positive) : dhr0.t.c(R.attr.vk_ui_text_negative);
        this.b0.getBackground().setColorFilter(c2, PorterDuff.Mode.SRC_OVER);
        this.c0.setTextColor(c2);
    }

    public final void po(List list, boolean z) {
        String obj = this.b0.getText().toString();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
        if (list != null) {
            spannableStringBuilder.append((CharSequence) getString(R.string.sett_domain_options));
            spannableStringBuilder.append('\n');
            SpannableString spannableString = new SpannableString(TextUtils.join(", ", list));
            spannableString.setSpan(new TypefaceSpan("sans-serif-medium"), 0, spannableString.length(), 0);
            spannableStringBuilder.append((CharSequence) spannableString);
            spannableStringBuilder.append((CharSequence) "\n\n");
        }
        if (z) {
            String string = getString(R.string.domain_explain);
            int indexOf = string.indexOf("%s");
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) string, 0, indexOf);
            spannableStringBuilder2.append((CharSequence) "@");
            spannableStringBuilder2.append((CharSequence) obj);
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) string, indexOf + 2, string.length());
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(dhr0.t.c(R.attr.vk_ui_text_link)), indexOf, length, 33);
            spannableStringBuilder2.setSpan(this.i0, indexOf, length, 33);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
            this.d0.setVisibility(0);
            this.d0.setText("https://" + a0a.d + DomExceptionUtils.SEPARATOR + obj);
        } else {
            spannableStringBuilder.append((CharSequence) getString(R.string.domain_explain_invalid));
            this.d0.setVisibility(8);
        }
        this.e0.setText(spannableStringBuilder);
    }

    public final boolean qo() {
        String obj = this.b0.getText().toString();
        Bundle arguments = getArguments();
        if (!obj.equals(arguments != null ? arguments.getString(X3.j.D, "") : "") && obj.length() != 0) {
            this.c0.setVisibility(0);
            return true;
        }
        this.c0.setVisibility(8);
        po(null, true);
        return false;
    }

    public class a extends ClickableSpan {
        public a() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(@NonNull View view) {
            SettingsDomainFragment settingsDomainFragment = SettingsDomainFragment.this;
            try {
                mhy.a(settingsDomainFragment.requireContext(), "@" + ((Object) settingsDomainFragment.b0.getText()));
                cvk.u(R.string.link_copied, false);
            } catch (Exception e) {
                com.vk.metrics.eventtracking.b.a.a(e);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(@NonNull TextPaint textPaint) {
        }
    }

    public class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            int i = SettingsDomainFragment.j0;
            SettingsDomainFragment settingsDomainFragment = SettingsDomainFragment.this;
            boolean qo = settingsDomainFragment.qo();
            c cVar = settingsDomainFragment.f0;
            if (cVar != null) {
                settingsDomainFragment.b0.removeCallbacks(cVar);
                if (!qo) {
                    settingsDomainFragment.f0 = null;
                }
            } else if (qo) {
                settingsDomainFragment.f0 = settingsDomainFragment.new c();
            }
            io.reactivex.rxjava3.disposables.c cVar2 = settingsDomainFragment.g0;
            if (cVar2 != null) {
                cVar2.dispose();
                settingsDomainFragment.g0 = null;
            }
            if (qo) {
                settingsDomainFragment.b0.postDelayed(settingsDomainFragment.f0, 250L);
            }
            settingsDomainFragment.h0 = false;
            settingsDomainFragment.invalidateOptionsMenu();
            settingsDomainFragment.oo(0);
            settingsDomainFragment.c0.setText(R.string.domain_checking);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
