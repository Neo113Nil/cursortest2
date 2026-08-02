package xsna;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.Preference;
import com.ironsource.X3;
import com.vk.auth.logout_menu.LogoutItem;
import com.vk.auth.logout_menu.b;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.im.engine.lifecycle.di.ImEngineLifecycleComponent;
import com.vk.log.L;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeVkConnectNavigationItem;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsListFragment;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import xsna.eeu0;
import xsna.h7u0;
import xsna.ky6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class c4l implements Preference.c, LogoutItem.a {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c4l(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ef, code lost:
    
        if (r8.equals("apiHost") == false) goto L20;
     */
    @Override // androidx.preference.Preference.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean eh(final Preference preference) {
        DebugDevSettingsFragment.a aVar;
        DebugDevSettingsFragment.a aVar2;
        final DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.b;
        Preference preference2 = (Preference) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        char c = 2;
        int i = 1;
        if (preference2.n.equals(X3.s)) {
            FragmentActivity kn = debugDevSettingsFragment.kn();
            o2l.a.getClass();
            String string = com.vk.core.preference.Preference.i().getString(X3.s, "5.285");
            String str = string != null ? string : "5.285";
            if (!debugDevSettingsFragment.n0) {
                h7u0.a aVar3 = new h7u0.a(kn);
                aVar3.h0(debugDevSettingsFragment.getString(R.string.debug_api_version_title, str));
                aVar3.m();
                return true;
            }
            eeu0.a.C2801a c2801a = new eeu0.a.C2801a(new h7u0.a(kn));
            c2801a.b = debugDevSettingsFragment.getString(R.string.debug_api_version_title, str);
            c2801a.h = "Default: 5.285";
            c2801a.s = new kc4(debugDevSettingsFragment, 4);
            c2801a.c(R.string.debug_api_version_button_reset, new mog(2, debugDevSettingsFragment, str), true);
            c2801a.g();
            return true;
        }
        if (preference2.n.equals("forceOverrideDomain")) {
            String string2 = com.vk.core.preference.Preference.j().getString(preference.n, "");
            eeu0.a.C2801a c2801a2 = new eeu0.a.C2801a(new h7u0.a(debugDevSettingsFragment.requireContext()));
            c2801a2.b = preference.j;
            c2801a2.s = new hue(string2, 1);
            c2801a2.c(android.R.string.ok, new wja(4, debugDevSettingsFragment, preference), true);
            c2801a2.g();
            return true;
        }
        FragmentActivity kn2 = debugDevSettingsFragment.kn();
        String str2 = preference.n;
        str2.getClass();
        switch (str2.hashCode()) {
            case -1627040545:
                if (str2.equals("oauthHost")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -896205528:
                if (str2.equals("spaUri")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -800766238:
                break;
            case -58253042:
                if (str2.equals("awayPhpDomain")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 921050683:
                if (str2.equals("vkUiHostUri")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1215312763:
                if (str2.equals("forceOverrideDomain")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                aVar = new DebugDevSettingsFragment.a(fo8.a("api.".concat(a0a.d), "/oauth"), "previous_oauth");
                aVar2 = aVar;
                String string3 = com.vk.core.preference.Preference.j().getString(preference.n, aVar2.a);
                final String str3 = aVar2.b;
                final String str4 = aVar2.a;
                h7u0.a aVar4 = new h7u0.a(kn2);
                aVar4.setTitle(preference.j);
                ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(kn2).inflate(R.layout.dialog_choose_host_edit_text, (ViewGroup) null);
                final AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) viewGroup.findViewById(R.id.auto_complete_tv);
                View findViewById = viewGroup.findViewById(R.id.show_all_iv);
                aVar4.f = viewGroup;
                d5l d5lVar = new d5l();
                ArrayList arrayList = new ArrayList();
                autoCompleteTextView.setText(string3);
                autoCompleteTextView.setSelection(string3.length());
                final com.vk.debug.ui.dev.d dVar = new com.vk.debug.ui.dev.d(kn2, arrayList, d5lVar);
                autoCompleteTextView.setThreshold(1);
                findViewById.setOnClickListener(new View.OnClickListener() { // from class: xsna.d4l
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        String[] strArr2 = DebugDevSettingsFragment.t0;
                        AutoCompleteTextView autoCompleteTextView2 = autoCompleteTextView;
                        mhy.d(autoCompleteTextView2);
                        String string4 = com.vk.core.preference.Preference.j().getString(str3, "[]");
                        String obj = autoCompleteTextView2.getText().toString();
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            JSONArray jSONArray = new JSONArray(string4);
                            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                String string5 = jSONArray.getString(i2);
                                if (!string5.equals(obj) && !TextUtils.isEmpty(string5) && !" ".equals(string5)) {
                                    arrayList2.add(string5);
                                }
                            }
                            if (arrayList2.size() > 0) {
                                boolean equals = obj.equals("");
                                com.vk.debug.ui.dev.d dVar2 = dVar;
                                if (equals) {
                                    autoCompleteTextView2.setAdapter(null);
                                    autoCompleteTextView2.setText(" ");
                                    autoCompleteTextView2.setAdapter(dVar2);
                                }
                                dVar2.clear();
                                dVar2.addAll(arrayList2);
                                dVar2.notifyDataSetChanged();
                                autoCompleteTextView2.showDropDown();
                            }
                        } catch (Throwable th) {
                            L.i(th);
                        }
                    }
                });
                autoCompleteTextView.setAdapter(dVar);
                autoCompleteTextView.setDropDownVerticalOffset(iah0.a(50));
                aVar4.f(debugDevSettingsFragment.getString(android.R.string.no).toUpperCase(), new dxa(i));
                aVar4.j(debugDevSettingsFragment.getString(android.R.string.ok).toUpperCase(), new DialogInterface.OnClickListener() { // from class: xsna.q4l
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        String[] strArr2 = DebugDevSettingsFragment.t0;
                        String obj = autoCompleteTextView.getText().toString();
                        boolean isEmpty = TextUtils.isEmpty(obj);
                        Preference preference3 = preference;
                        String str5 = str4;
                        if (isEmpty || " ".equals(obj)) {
                            ky6.a aVar5 = (ky6.a) com.vk.core.preference.Preference.j().edit();
                            aVar5.putString(preference3.n, str5);
                            aVar5.a();
                        } else {
                            ky6.a aVar6 = (ky6.a) com.vk.core.preference.Preference.j().edit();
                            aVar6.putString(preference3.n, obj);
                            aVar6.a();
                            if (!str5.equals(obj)) {
                                ky6 j = com.vk.core.preference.Preference.j();
                                String str6 = str3;
                                try {
                                    JSONArray jSONArray = new JSONArray(j.getString(str6, "[]"));
                                    ArrayList arrayList2 = new ArrayList();
                                    for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                                        String string4 = jSONArray.getString(i3);
                                        if (!TextUtils.isEmpty(string4) && !" ".equals(string4)) {
                                            arrayList2.add(string4);
                                        }
                                    }
                                    if (arrayList2.indexOf(obj) < 0) {
                                        arrayList2.add(0, obj);
                                        if (arrayList2.size() > 3) {
                                            for (int i4 = 3; i4 < arrayList2.size(); i4++) {
                                                arrayList2.remove(arrayList2.size() - 1);
                                            }
                                        }
                                    }
                                    JSONArray jSONArray2 = new JSONArray();
                                    Iterator it = arrayList2.iterator();
                                    while (it.hasNext()) {
                                        jSONArray2.put((String) it.next());
                                    }
                                    ky6.a aVar7 = (ky6.a) com.vk.core.preference.Preference.j().edit();
                                    aVar7.putString(str6, jSONArray2.toString());
                                    aVar7.a();
                                } catch (Throwable th) {
                                    L.i(th);
                                }
                            }
                        }
                        DebugDevSettingsFragment debugDevSettingsFragment2 = DebugDevSettingsFragment.this;
                        ((ImEngineLifecycleComponent) j6i.b(m7m.d(debugDevSettingsFragment2), ImEngineLifecycleComponent.class)).N().b();
                        debugDevSettingsFragment2.ko();
                    }
                });
                aVar4.m();
                mhy.j(autoCompleteTextView);
                autoCompleteTextView.postDelayed(new nf0(autoCompleteTextView, 3), 250L);
                return true;
            case 1:
                aVar2 = new DebugDevSettingsFragment.a(a0a.d.concat("/spa"), "previous_spa");
                String string32 = com.vk.core.preference.Preference.j().getString(preference.n, aVar2.a);
                final String str32 = aVar2.b;
                final String str42 = aVar2.a;
                h7u0.a aVar42 = new h7u0.a(kn2);
                aVar42.setTitle(preference.j);
                ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(kn2).inflate(R.layout.dialog_choose_host_edit_text, (ViewGroup) null);
                final AutoCompleteTextView autoCompleteTextView2 = (AutoCompleteTextView) viewGroup2.findViewById(R.id.auto_complete_tv);
                View findViewById2 = viewGroup2.findViewById(R.id.show_all_iv);
                aVar42.f = viewGroup2;
                d5l d5lVar2 = new d5l();
                ArrayList arrayList2 = new ArrayList();
                autoCompleteTextView2.setText(string32);
                autoCompleteTextView2.setSelection(string32.length());
                final com.vk.debug.ui.dev.d dVar2 = new com.vk.debug.ui.dev.d(kn2, arrayList2, d5lVar2);
                autoCompleteTextView2.setThreshold(1);
                findViewById2.setOnClickListener(new View.OnClickListener() { // from class: xsna.d4l
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        String[] strArr2 = DebugDevSettingsFragment.t0;
                        AutoCompleteTextView autoCompleteTextView22 = autoCompleteTextView2;
                        mhy.d(autoCompleteTextView22);
                        String string4 = com.vk.core.preference.Preference.j().getString(str32, "[]");
                        String obj = autoCompleteTextView22.getText().toString();
                        try {
                            ArrayList arrayList22 = new ArrayList();
                            JSONArray jSONArray = new JSONArray(string4);
                            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                String string5 = jSONArray.getString(i2);
                                if (!string5.equals(obj) && !TextUtils.isEmpty(string5) && !" ".equals(string5)) {
                                    arrayList22.add(string5);
                                }
                            }
                            if (arrayList22.size() > 0) {
                                boolean equals = obj.equals("");
                                com.vk.debug.ui.dev.d dVar22 = dVar2;
                                if (equals) {
                                    autoCompleteTextView22.setAdapter(null);
                                    autoCompleteTextView22.setText(" ");
                                    autoCompleteTextView22.setAdapter(dVar22);
                                }
                                dVar22.clear();
                                dVar22.addAll(arrayList22);
                                dVar22.notifyDataSetChanged();
                                autoCompleteTextView22.showDropDown();
                            }
                        } catch (Throwable th) {
                            L.i(th);
                        }
                    }
                });
                autoCompleteTextView2.setAdapter(dVar2);
                autoCompleteTextView2.setDropDownVerticalOffset(iah0.a(50));
                aVar42.f(debugDevSettingsFragment.getString(android.R.string.no).toUpperCase(), new dxa(i));
                aVar42.j(debugDevSettingsFragment.getString(android.R.string.ok).toUpperCase(), new DialogInterface.OnClickListener() { // from class: xsna.q4l
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        String[] strArr2 = DebugDevSettingsFragment.t0;
                        String obj = autoCompleteTextView2.getText().toString();
                        boolean isEmpty = TextUtils.isEmpty(obj);
                        Preference preference3 = preference;
                        String str5 = str42;
                        if (isEmpty || " ".equals(obj)) {
                            ky6.a aVar5 = (ky6.a) com.vk.core.preference.Preference.j().edit();
                            aVar5.putString(preference3.n, str5);
                            aVar5.a();
                        } else {
                            ky6.a aVar6 = (ky6.a) com.vk.core.preference.Preference.j().edit();
                            aVar6.putString(preference3.n, obj);
                            aVar6.a();
                            if (!str5.equals(obj)) {
                                ky6 j = com.vk.core.preference.Preference.j();
                                String str6 = str32;
                                try {
                                    JSONArray jSONArray = new JSONArray(j.getString(str6, "[]"));
                                    ArrayList arrayList22 = new ArrayList();
                                    for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                                        String string4 = jSONArray.getString(i3);
                                        if (!TextUtils.isEmpty(string4) && !" ".equals(string4)) {
                                            arrayList22.add(string4);
                                        }
                                    }
                                    if (arrayList22.indexOf(obj) < 0) {
                                        arrayList22.add(0, obj);
                                        if (arrayList22.size() > 3) {
                                            for (int i4 = 3; i4 < arrayList22.size(); i4++) {
                                                arrayList22.remove(arrayList22.size() - 1);
                                            }
                                        }
                                    }
                                    JSONArray jSONArray2 = new JSONArray();
                                    Iterator it = arrayList22.iterator();
                                    while (it.hasNext()) {
                                        jSONArray2.put((String) it.next());
                                    }
                                    ky6.a aVar7 = (ky6.a) com.vk.core.preference.Preference.j().edit();
                                    aVar7.putString(str6, jSONArray2.toString());
                                    aVar7.a();
                                } catch (Throwable th) {
                                    L.i(th);
                                }
                            }
                        }
                        DebugDevSettingsFragment debugDevSettingsFragment2 = DebugDevSettingsFragment.this;
                        ((ImEngineLifecycleComponent) j6i.b(m7m.d(debugDevSettingsFragment2), ImEngineLifecycleComponent.class)).N().b();
                        debugDevSettingsFragment2.ko();
                    }
                });
                aVar42.m();
                mhy.j(autoCompleteTextView2);
                autoCompleteTextView2.postDelayed(new nf0(autoCompleteTextView2, 3), 250L);
                return true;
            case 2:
                aVar = new DebugDevSettingsFragment.a("api.".concat(a0a.d), "previous_apiHosts");
                aVar2 = aVar;
                String string322 = com.vk.core.preference.Preference.j().getString(preference.n, aVar2.a);
                final String str322 = aVar2.b;
                final String str422 = aVar2.a;
                h7u0.a aVar422 = new h7u0.a(kn2);
                aVar422.setTitle(preference.j);
                ViewGroup viewGroup22 = (ViewGroup) LayoutInflater.from(kn2).inflate(R.layout.dialog_choose_host_edit_text, (ViewGroup) null);
                final AutoCompleteTextView autoCompleteTextView22 = (AutoCompleteTextView) viewGroup22.findViewById(R.id.auto_complete_tv);
                View findViewById22 = viewGroup22.findViewById(R.id.show_all_iv);
                aVar422.f = viewGroup22;
                d5l d5lVar22 = new d5l();
                ArrayList arrayList22 = new ArrayList();
                autoCompleteTextView22.setText(string322);
                autoCompleteTextView22.setSelection(string322.length());
                final com.vk.debug.ui.dev.d dVar22 = new com.vk.debug.ui.dev.d(kn2, arrayList22, d5lVar22);
                autoCompleteTextView22.setThreshold(1);
                findViewById22.setOnClickListener(new View.OnClickListener() { // from class: xsna.d4l
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        String[] strArr2 = DebugDevSettingsFragment.t0;
                        AutoCompleteTextView autoCompleteTextView222 = autoCompleteTextView22;
                        mhy.d(autoCompleteTextView222);
                        String string4 = com.vk.core.preference.Preference.j().getString(str322, "[]");
                        String obj = autoCompleteTextView222.getText().toString();
                        try {
                            ArrayList arrayList222 = new ArrayList();
                            JSONArray jSONArray = new JSONArray(string4);
                            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                String string5 = jSONArray.getString(i2);
                                if (!string5.equals(obj) && !TextUtils.isEmpty(string5) && !" ".equals(string5)) {
                                    arrayList222.add(string5);
                                }
                            }
                            if (arrayList222.size() > 0) {
                                boolean equals = obj.equals("");
                                com.vk.debug.ui.dev.d dVar222 = dVar22;
                                if (equals) {
                                    autoCompleteTextView222.setAdapter(null);
                                    autoCompleteTextView222.setText(" ");
                                    autoCompleteTextView222.setAdapter(dVar222);
                                }
                                dVar222.clear();
                                dVar222.addAll(arrayList222);
                                dVar222.notifyDataSetChanged();
                                autoCompleteTextView222.showDropDown();
                            }
                        } catch (Throwable th) {
                            L.i(th);
                        }
                    }
                });
                autoCompleteTextView22.setAdapter(dVar22);
                autoCompleteTextView22.setDropDownVerticalOffset(iah0.a(50));
                aVar422.f(debugDevSettingsFragment.getString(android.R.string.no).toUpperCase(), new dxa(i));
                aVar422.j(debugDevSettingsFragment.getString(android.R.string.ok).toUpperCase(), new DialogInterface.OnClickListener() { // from class: xsna.q4l
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        String[] strArr2 = DebugDevSettingsFragment.t0;
                        String obj = autoCompleteTextView22.getText().toString();
                        boolean isEmpty = TextUtils.isEmpty(obj);
                        Preference preference3 = preference;
                        String str5 = str422;
                        if (isEmpty || " ".equals(obj)) {
                            ky6.a aVar5 = (ky6.a) com.vk.core.preference.Preference.j().edit();
                            aVar5.putString(preference3.n, str5);
                            aVar5.a();
                        } else {
                            ky6.a aVar6 = (ky6.a) com.vk.core.preference.Preference.j().edit();
                            aVar6.putString(preference3.n, obj);
                            aVar6.a();
                            if (!str5.equals(obj)) {
                                ky6 j = com.vk.core.preference.Preference.j();
                                String str6 = str322;
                                try {
                                    JSONArray jSONArray = new JSONArray(j.getString(str6, "[]"));
                                    ArrayList arrayList222 = new ArrayList();
                                    for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                                        String string4 = jSONArray.getString(i3);
                                        if (!TextUtils.isEmpty(string4) && !" ".equals(string4)) {
                                            arrayList222.add(string4);
                                        }
                                    }
                                    if (arrayList222.indexOf(obj) < 0) {
                                        arrayList222.add(0, obj);
                                        if (arrayList222.size() > 3) {
                                            for (int i4 = 3; i4 < arrayList222.size(); i4++) {
                                                arrayList222.remove(arrayList222.size() - 1);
                                            }
                                        }
                                    }
                                    JSONArray jSONArray2 = new JSONArray();
                                    Iterator it = arrayList222.iterator();
                                    while (it.hasNext()) {
                                        jSONArray2.put((String) it.next());
                                    }
                                    ky6.a aVar7 = (ky6.a) com.vk.core.preference.Preference.j().edit();
                                    aVar7.putString(str6, jSONArray2.toString());
                                    aVar7.a();
                                } catch (Throwable th) {
                                    L.i(th);
                                }
                            }
                        }
                        DebugDevSettingsFragment debugDevSettingsFragment2 = DebugDevSettingsFragment.this;
                        ((ImEngineLifecycleComponent) j6i.b(m7m.d(debugDevSettingsFragment2), ImEngineLifecycleComponent.class)).N().b();
                        debugDevSettingsFragment2.ko();
                    }
                });
                aVar422.m();
                mhy.j(autoCompleteTextView22);
                autoCompleteTextView22.postDelayed(new nf0(autoCompleteTextView22, 3), 250L);
                return true;
            case 3:
                aVar2 = new DebugDevSettingsFragment.a("m.".concat(a0a.d), "previous_away_php");
                String string3222 = com.vk.core.preference.Preference.j().getString(preference.n, aVar2.a);
                final String str3222 = aVar2.b;
                final String str4222 = aVar2.a;
                h7u0.a aVar4222 = new h7u0.a(kn2);
                aVar4222.setTitle(preference.j);
                ViewGroup viewGroup222 = (ViewGroup) LayoutInflater.from(kn2).inflate(R.layout.dialog_choose_host_edit_text, (ViewGroup) null);
                final AutoCompleteTextView autoCompleteTextView222 = (AutoCompleteTextView) viewGroup222.findViewById(R.id.auto_complete_tv);
                View findViewById222 = viewGroup222.findViewById(R.id.show_all_iv);
                aVar4222.f = viewGroup222;
                d5l d5lVar222 = new d5l();
                ArrayList arrayList222 = new ArrayList();
                autoCompleteTextView222.setText(string3222);
                autoCompleteTextView222.setSelection(string3222.length());
                final com.vk.debug.ui.dev.d dVar222 = new com.vk.debug.ui.dev.d(kn2, arrayList222, d5lVar222);
                autoCompleteTextView222.setThreshold(1);
                findViewById222.setOnClickListener(new View.OnClickListener() { // from class: xsna.d4l
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        String[] strArr2 = DebugDevSettingsFragment.t0;
                        AutoCompleteTextView autoCompleteTextView2222 = autoCompleteTextView222;
                        mhy.d(autoCompleteTextView2222);
                        String string4 = com.vk.core.preference.Preference.j().getString(str3222, "[]");
                        String obj = autoCompleteTextView2222.getText().toString();
                        try {
                            ArrayList arrayList2222 = new ArrayList();
                            JSONArray jSONArray = new JSONArray(string4);
                            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                String string5 = jSONArray.getString(i2);
                                if (!string5.equals(obj) && !TextUtils.isEmpty(string5) && !" ".equals(string5)) {
                                    arrayList2222.add(string5);
                                }
                            }
                            if (arrayList2222.size() > 0) {
                                boolean equals = obj.equals("");
                                com.vk.debug.ui.dev.d dVar2222 = dVar222;
                                if (equals) {
                                    autoCompleteTextView2222.setAdapter(null);
                                    autoCompleteTextView2222.setText(" ");
                                    autoCompleteTextView2222.setAdapter(dVar2222);
                                }
                                dVar2222.clear();
                                dVar2222.addAll(arrayList2222);
                                dVar2222.notifyDataSetChanged();
                                autoCompleteTextView2222.showDropDown();
                            }
                        } catch (Throwable th) {
                            L.i(th);
                        }
                    }
                });
                autoCompleteTextView222.setAdapter(dVar222);
                autoCompleteTextView222.setDropDownVerticalOffset(iah0.a(50));
                aVar4222.f(debugDevSettingsFragment.getString(android.R.string.no).toUpperCase(), new dxa(i));
                aVar4222.j(debugDevSettingsFragment.getString(android.R.string.ok).toUpperCase(), new DialogInterface.OnClickListener() { // from class: xsna.q4l
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        String[] strArr2 = DebugDevSettingsFragment.t0;
                        String obj = autoCompleteTextView222.getText().toString();
                        boolean isEmpty = TextUtils.isEmpty(obj);
                        Preference preference3 = preference;
                        String str5 = str4222;
                        if (isEmpty || " ".equals(obj)) {
                            ky6.a aVar5 = (ky6.a) com.vk.core.preference.Preference.j().edit();
                            aVar5.putString(preference3.n, str5);
                            aVar5.a();
                        } else {
                            ky6.a aVar6 = (ky6.a) com.vk.core.preference.Preference.j().edit();
                            aVar6.putString(preference3.n, obj);
                            aVar6.a();
                            if (!str5.equals(obj)) {
                                ky6 j = com.vk.core.preference.Preference.j();
                                String str6 = str3222;
                                try {
                                    JSONArray jSONArray = new JSONArray(j.getString(str6, "[]"));
                                    ArrayList arrayList2222 = new ArrayList();
                                    for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                                        String string4 = jSONArray.getString(i3);
                                        if (!TextUtils.isEmpty(string4) && !" ".equals(string4)) {
                                            arrayList2222.add(string4);
                                        }
                                    }
                                    if (arrayList2222.indexOf(obj) < 0) {
                                        arrayList2222.add(0, obj);
                                        if (arrayList2222.size() > 3) {
                                            for (int i4 = 3; i4 < arrayList2222.size(); i4++) {
                                                arrayList2222.remove(arrayList2222.size() - 1);
                                            }
                                        }
                                    }
                                    JSONArray jSONArray2 = new JSONArray();
                                    Iterator it = arrayList2222.iterator();
                                    while (it.hasNext()) {
                                        jSONArray2.put((String) it.next());
                                    }
                                    ky6.a aVar7 = (ky6.a) com.vk.core.preference.Preference.j().edit();
                                    aVar7.putString(str6, jSONArray2.toString());
                                    aVar7.a();
                                } catch (Throwable th) {
                                    L.i(th);
                                }
                            }
                        }
                        DebugDevSettingsFragment debugDevSettingsFragment2 = DebugDevSettingsFragment.this;
                        ((ImEngineLifecycleComponent) j6i.b(m7m.d(debugDevSettingsFragment2), ImEngineLifecycleComponent.class)).N().b();
                        debugDevSettingsFragment2.ko();
                    }
                });
                aVar4222.m();
                mhy.j(autoCompleteTextView222);
                autoCompleteTextView222.postDelayed(new nf0(autoCompleteTextView222, 3), 250L);
                return true;
            case 4:
                aVar2 = new DebugDevSettingsFragment.a("static.".concat(a0a.d), "previous_vkui");
                String string32222 = com.vk.core.preference.Preference.j().getString(preference.n, aVar2.a);
                final String str32222 = aVar2.b;
                final String str42222 = aVar2.a;
                h7u0.a aVar42222 = new h7u0.a(kn2);
                aVar42222.setTitle(preference.j);
                ViewGroup viewGroup2222 = (ViewGroup) LayoutInflater.from(kn2).inflate(R.layout.dialog_choose_host_edit_text, (ViewGroup) null);
                final AutoCompleteTextView autoCompleteTextView2222 = (AutoCompleteTextView) viewGroup2222.findViewById(R.id.auto_complete_tv);
                View findViewById2222 = viewGroup2222.findViewById(R.id.show_all_iv);
                aVar42222.f = viewGroup2222;
                d5l d5lVar2222 = new d5l();
                ArrayList arrayList2222 = new ArrayList();
                autoCompleteTextView2222.setText(string32222);
                autoCompleteTextView2222.setSelection(string32222.length());
                final com.vk.debug.ui.dev.d dVar2222 = new com.vk.debug.ui.dev.d(kn2, arrayList2222, d5lVar2222);
                autoCompleteTextView2222.setThreshold(1);
                findViewById2222.setOnClickListener(new View.OnClickListener() { // from class: xsna.d4l
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        String[] strArr2 = DebugDevSettingsFragment.t0;
                        AutoCompleteTextView autoCompleteTextView22222 = autoCompleteTextView2222;
                        mhy.d(autoCompleteTextView22222);
                        String string4 = com.vk.core.preference.Preference.j().getString(str32222, "[]");
                        String obj = autoCompleteTextView22222.getText().toString();
                        try {
                            ArrayList arrayList22222 = new ArrayList();
                            JSONArray jSONArray = new JSONArray(string4);
                            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                String string5 = jSONArray.getString(i2);
                                if (!string5.equals(obj) && !TextUtils.isEmpty(string5) && !" ".equals(string5)) {
                                    arrayList22222.add(string5);
                                }
                            }
                            if (arrayList22222.size() > 0) {
                                boolean equals = obj.equals("");
                                com.vk.debug.ui.dev.d dVar22222 = dVar2222;
                                if (equals) {
                                    autoCompleteTextView22222.setAdapter(null);
                                    autoCompleteTextView22222.setText(" ");
                                    autoCompleteTextView22222.setAdapter(dVar22222);
                                }
                                dVar22222.clear();
                                dVar22222.addAll(arrayList22222);
                                dVar22222.notifyDataSetChanged();
                                autoCompleteTextView22222.showDropDown();
                            }
                        } catch (Throwable th) {
                            L.i(th);
                        }
                    }
                });
                autoCompleteTextView2222.setAdapter(dVar2222);
                autoCompleteTextView2222.setDropDownVerticalOffset(iah0.a(50));
                aVar42222.f(debugDevSettingsFragment.getString(android.R.string.no).toUpperCase(), new dxa(i));
                aVar42222.j(debugDevSettingsFragment.getString(android.R.string.ok).toUpperCase(), new DialogInterface.OnClickListener() { // from class: xsna.q4l
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        String[] strArr2 = DebugDevSettingsFragment.t0;
                        String obj = autoCompleteTextView2222.getText().toString();
                        boolean isEmpty = TextUtils.isEmpty(obj);
                        Preference preference3 = preference;
                        String str5 = str42222;
                        if (isEmpty || " ".equals(obj)) {
                            ky6.a aVar5 = (ky6.a) com.vk.core.preference.Preference.j().edit();
                            aVar5.putString(preference3.n, str5);
                            aVar5.a();
                        } else {
                            ky6.a aVar6 = (ky6.a) com.vk.core.preference.Preference.j().edit();
                            aVar6.putString(preference3.n, obj);
                            aVar6.a();
                            if (!str5.equals(obj)) {
                                ky6 j = com.vk.core.preference.Preference.j();
                                String str6 = str32222;
                                try {
                                    JSONArray jSONArray = new JSONArray(j.getString(str6, "[]"));
                                    ArrayList arrayList22222 = new ArrayList();
                                    for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                                        String string4 = jSONArray.getString(i3);
                                        if (!TextUtils.isEmpty(string4) && !" ".equals(string4)) {
                                            arrayList22222.add(string4);
                                        }
                                    }
                                    if (arrayList22222.indexOf(obj) < 0) {
                                        arrayList22222.add(0, obj);
                                        if (arrayList22222.size() > 3) {
                                            for (int i4 = 3; i4 < arrayList22222.size(); i4++) {
                                                arrayList22222.remove(arrayList22222.size() - 1);
                                            }
                                        }
                                    }
                                    JSONArray jSONArray2 = new JSONArray();
                                    Iterator it = arrayList22222.iterator();
                                    while (it.hasNext()) {
                                        jSONArray2.put((String) it.next());
                                    }
                                    ky6.a aVar7 = (ky6.a) com.vk.core.preference.Preference.j().edit();
                                    aVar7.putString(str6, jSONArray2.toString());
                                    aVar7.a();
                                } catch (Throwable th) {
                                    L.i(th);
                                }
                            }
                        }
                        DebugDevSettingsFragment debugDevSettingsFragment2 = DebugDevSettingsFragment.this;
                        ((ImEngineLifecycleComponent) j6i.b(m7m.d(debugDevSettingsFragment2), ImEngineLifecycleComponent.class)).N().b();
                        debugDevSettingsFragment2.ko();
                    }
                });
                aVar42222.m();
                mhy.j(autoCompleteTextView2222);
                autoCompleteTextView2222.postDelayed(new nf0(autoCompleteTextView2222, 3), 250L);
                return true;
            case 5:
                aVar2 = new DebugDevSettingsFragment.a("", "previous_force_override_domain");
                String string322222 = com.vk.core.preference.Preference.j().getString(preference.n, aVar2.a);
                final String str322222 = aVar2.b;
                final String str422222 = aVar2.a;
                h7u0.a aVar422222 = new h7u0.a(kn2);
                aVar422222.setTitle(preference.j);
                ViewGroup viewGroup22222 = (ViewGroup) LayoutInflater.from(kn2).inflate(R.layout.dialog_choose_host_edit_text, (ViewGroup) null);
                final AutoCompleteTextView autoCompleteTextView22222 = (AutoCompleteTextView) viewGroup22222.findViewById(R.id.auto_complete_tv);
                View findViewById22222 = viewGroup22222.findViewById(R.id.show_all_iv);
                aVar422222.f = viewGroup22222;
                d5l d5lVar22222 = new d5l();
                ArrayList arrayList22222 = new ArrayList();
                autoCompleteTextView22222.setText(string322222);
                autoCompleteTextView22222.setSelection(string322222.length());
                final com.vk.debug.ui.dev.d dVar22222 = new com.vk.debug.ui.dev.d(kn2, arrayList22222, d5lVar22222);
                autoCompleteTextView22222.setThreshold(1);
                findViewById22222.setOnClickListener(new View.OnClickListener() { // from class: xsna.d4l
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        String[] strArr2 = DebugDevSettingsFragment.t0;
                        AutoCompleteTextView autoCompleteTextView222222 = autoCompleteTextView22222;
                        mhy.d(autoCompleteTextView222222);
                        String string4 = com.vk.core.preference.Preference.j().getString(str322222, "[]");
                        String obj = autoCompleteTextView222222.getText().toString();
                        try {
                            ArrayList arrayList222222 = new ArrayList();
                            JSONArray jSONArray = new JSONArray(string4);
                            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                String string5 = jSONArray.getString(i2);
                                if (!string5.equals(obj) && !TextUtils.isEmpty(string5) && !" ".equals(string5)) {
                                    arrayList222222.add(string5);
                                }
                            }
                            if (arrayList222222.size() > 0) {
                                boolean equals = obj.equals("");
                                com.vk.debug.ui.dev.d dVar222222 = dVar22222;
                                if (equals) {
                                    autoCompleteTextView222222.setAdapter(null);
                                    autoCompleteTextView222222.setText(" ");
                                    autoCompleteTextView222222.setAdapter(dVar222222);
                                }
                                dVar222222.clear();
                                dVar222222.addAll(arrayList222222);
                                dVar222222.notifyDataSetChanged();
                                autoCompleteTextView222222.showDropDown();
                            }
                        } catch (Throwable th) {
                            L.i(th);
                        }
                    }
                });
                autoCompleteTextView22222.setAdapter(dVar22222);
                autoCompleteTextView22222.setDropDownVerticalOffset(iah0.a(50));
                aVar422222.f(debugDevSettingsFragment.getString(android.R.string.no).toUpperCase(), new dxa(i));
                aVar422222.j(debugDevSettingsFragment.getString(android.R.string.ok).toUpperCase(), new DialogInterface.OnClickListener() { // from class: xsna.q4l
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        String[] strArr2 = DebugDevSettingsFragment.t0;
                        String obj = autoCompleteTextView22222.getText().toString();
                        boolean isEmpty = TextUtils.isEmpty(obj);
                        Preference preference3 = preference;
                        String str5 = str422222;
                        if (isEmpty || " ".equals(obj)) {
                            ky6.a aVar5 = (ky6.a) com.vk.core.preference.Preference.j().edit();
                            aVar5.putString(preference3.n, str5);
                            aVar5.a();
                        } else {
                            ky6.a aVar6 = (ky6.a) com.vk.core.preference.Preference.j().edit();
                            aVar6.putString(preference3.n, obj);
                            aVar6.a();
                            if (!str5.equals(obj)) {
                                ky6 j = com.vk.core.preference.Preference.j();
                                String str6 = str322222;
                                try {
                                    JSONArray jSONArray = new JSONArray(j.getString(str6, "[]"));
                                    ArrayList arrayList222222 = new ArrayList();
                                    for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                                        String string4 = jSONArray.getString(i3);
                                        if (!TextUtils.isEmpty(string4) && !" ".equals(string4)) {
                                            arrayList222222.add(string4);
                                        }
                                    }
                                    if (arrayList222222.indexOf(obj) < 0) {
                                        arrayList222222.add(0, obj);
                                        if (arrayList222222.size() > 3) {
                                            for (int i4 = 3; i4 < arrayList222222.size(); i4++) {
                                                arrayList222222.remove(arrayList222222.size() - 1);
                                            }
                                        }
                                    }
                                    JSONArray jSONArray2 = new JSONArray();
                                    Iterator it = arrayList222222.iterator();
                                    while (it.hasNext()) {
                                        jSONArray2.put((String) it.next());
                                    }
                                    ky6.a aVar7 = (ky6.a) com.vk.core.preference.Preference.j().edit();
                                    aVar7.putString(str6, jSONArray2.toString());
                                    aVar7.a();
                                } catch (Throwable th) {
                                    L.i(th);
                                }
                            }
                        }
                        DebugDevSettingsFragment debugDevSettingsFragment2 = DebugDevSettingsFragment.this;
                        ((ImEngineLifecycleComponent) j6i.b(m7m.d(debugDevSettingsFragment2), ImEngineLifecycleComponent.class)).N().b();
                        debugDevSettingsFragment2.ko();
                    }
                });
                aVar422222.m();
                mhy.j(autoCompleteTextView22222);
                autoCompleteTextView22222.postDelayed(new nf0(autoCompleteTextView22222, 3), 250L);
                return true;
            default:
                throw new IllegalArgumentException("Pass right key for preference");
        }
    }

    @Override // com.vk.auth.logout_menu.LogoutItem.a
    public void invoke() {
        ArrayList arrayList = (ArrayList) this.b;
        SettingsListFragment settingsListFragment = (SettingsListFragment) this.c;
        int i = SettingsListFragment.X0;
        SchemeStatSak$EventScreen schemeStatSak$EventScreen = SchemeStatSak$EventScreen.SETTINGS_LOGOUT;
        SchemeStatSak$TypeVkConnectNavigationItem.EventType eventType = SchemeStatSak$TypeVkConnectNavigationItem.EventType.SWITCH_ACCOUNT;
        SchemeStatSak$EventScreen schemeStatSak$EventScreen2 = SchemeStatSak$EventScreen.MULTI_ACC_SWITCHER;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((x200) it.next()).a());
        }
        new vmu0(schemeStatSak$EventScreen, eventType, schemeStatSak$EventScreen2, arrayList2).q();
        int i2 = com.vk.auth.logout_menu.b.f1;
        b.C0401b.a(settingsListFragment.getParentFragmentManager());
        settingsListFragment.No().e(settingsListFragment, MultiAccountEntryPoint.SettingsLogout.d);
    }
}
