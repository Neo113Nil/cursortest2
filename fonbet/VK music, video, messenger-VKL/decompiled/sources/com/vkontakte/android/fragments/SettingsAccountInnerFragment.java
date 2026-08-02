package com.vkontakte.android.fragments;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.ironsource.X3;
import com.vk.api.comments.CommentsOrder;
import com.vk.billing.PurchasesManagerComponent;
import com.vk.contacts.ContactsManager;
import com.vk.contacts.model.ContactsPermissionMessage;
import com.vk.dto.common.data.Subscription;
import com.vk.dto.user.UserNameType;
import com.vk.prefui.fragments.MaterialPreferenceFragment;
import com.vk.prefui.views.SummaryListPreference;
import com.vk.settings.GetAccountSettingsRequest;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsAccountInnerFragment;
import java.util.Iterator;
import java.util.List;
import xsna.a1w;
import xsna.aeg0;
import xsna.b25;
import xsna.e43;
import xsna.epx;
import xsna.f0j0;
import xsna.fsk;
import xsna.gl30;
import xsna.gs;
import xsna.gzs;
import xsna.h7u0;
import xsna.i0j0;
import xsna.izs;
import xsna.j0j0;
import xsna.j6i;
import xsna.jw80;
import xsna.jx2;
import xsna.kwg0;
import xsna.l0j0;
import xsna.m0j0;
import xsna.m6r0;
import xsna.m7m;
import xsna.n8c0;
import xsna.o0j0;
import xsna.o25;
import xsna.oge0;
import xsna.oz50;
import xsna.p0j0;
import xsna.q1w;
import xsna.q6r0;
import xsna.qv20;
import xsna.s3q0;
import xsna.s480;
import xsna.tb0;
import xsna.til0;
import xsna.vtg0;
import xsna.w8i;

/* loaded from: classes7.dex */
public class SettingsAccountInnerFragment extends MaterialPreferenceFragment implements tb0, w8i {
    public static final /* synthetic */ int r0 = 0;
    public GetAccountSettingsRequest.Result m0;
    public final a1w o0;
    public final b25 p0;
    public final ContactsManager q0;
    public final oge0 l0 = ((PurchasesManagerComponent) j6i.b(m7m.f(this), PurchasesManagerComponent.class)).J7();
    public final io.reactivex.rxjava3.disposables.b n0 = new io.reactivex.rxjava3.disposables.b();

    public class a implements Preference.c {
        public a() {
        }

        @Override // androidx.preference.Preference.c
        public final boolean eh(Preference preference) {
            Bundle bundle = new Bundle();
            SettingsAccountInnerFragment settingsAccountInnerFragment = SettingsAccountInnerFragment.this;
            bundle.putString(X3.j.D, settingsAccountInnerFragment.m0.f);
            new oz50(SettingsDomainFragment.class, null, bundle).g(103, settingsAccountInnerFragment);
            return true;
        }
    }

    public class b implements Preference.c {

        public class a implements View.OnClickListener {
            public final /* synthetic */ RadioButton b;
            public final /* synthetic */ RadioButton c;

            public a(RadioButton radioButton, RadioButton radioButton2) {
                this.b = radioButton;
                this.c = radioButton2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.b.setChecked(true);
                this.c.setChecked(false);
            }
        }

        /* renamed from: com.vkontakte.android.fragments.SettingsAccountInnerFragment$b$b, reason: collision with other inner class name */
        public class ViewOnClickListenerC2103b implements View.OnClickListener {
            public final /* synthetic */ RadioButton b;
            public final /* synthetic */ RadioButton c;

            public ViewOnClickListenerC2103b(RadioButton radioButton, RadioButton radioButton2) {
                this.b = radioButton;
                this.c = radioButton2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.b.setChecked(false);
                this.c.setChecked(true);
            }
        }

        public class c implements DialogInterface.OnClickListener {
            public final /* synthetic */ RadioButton b;

            public c(RadioButton radioButton) {
                this.b = radioButton;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SettingsAccountInnerFragment settingsAccountInnerFragment = SettingsAccountInnerFragment.this;
                boolean isChecked = this.b.isChecked();
                int i2 = SettingsAccountInnerFragment.r0;
                if (q6r0.f().e(m6r0.M) != isChecked) {
                    io.reactivex.rxjava3.disposables.b bVar = settingsAccountInnerFragment.n0;
                    gs gsVar = new gs();
                    gsVar.K("name", "community_comments");
                    gsVar.K("value", isChecked ? "1" : "0");
                    jx2 jx2Var = new jx2(gsVar, new m0j0(settingsAccountInnerFragment, settingsAccountInnerFragment.getActivity(), isChecked));
                    jx2Var.g = settingsAccountInnerFragment.getActivity();
                    bVar.b(jx2Var.a());
                }
            }
        }

        public b() {
        }

        @Override // androidx.preference.Preference.c
        public final boolean eh(Preference preference) {
            SettingsAccountInnerFragment settingsAccountInnerFragment = SettingsAccountInnerFragment.this;
            View inflate = View.inflate(settingsAccountInnerFragment.getActivity(), R.layout.settings_community_comments, null);
            boolean e = q6r0.f().e(m6r0.M);
            RadioButton radioButton = (RadioButton) inflate.findViewById(R.id.rb_community_for_all);
            radioButton.setChecked(e);
            RadioButton radioButton2 = (RadioButton) inflate.findViewById(R.id.rb_community_for_admined);
            radioButton2.setChecked(!e);
            inflate.findViewById(R.id.ll_community_for_all).setOnClickListener(new a(radioButton, radioButton2));
            inflate.findViewById(R.id.ll_community_for_admined).setOnClickListener(new ViewOnClickListenerC2103b(radioButton, radioButton2));
            h7u0.a aVar = new h7u0.a(settingsAccountInnerFragment.getActivity());
            aVar.g0(R.string.community_comments_settings_title_new_extended);
            aVar.f = inflate;
            aVar.c0(R.string.save, new c(radioButton));
            aVar.W(R.string.cancel, null);
            aVar.m();
            return true;
        }
    }

    public class c implements Preference.c {
        public c() {
        }

        @Override // androidx.preference.Preference.c
        public final boolean eh(Preference preference) {
            int i = SettingsAccountInnerFragment.r0;
            SettingsAccountInnerFragment settingsAccountInnerFragment = SettingsAccountInnerFragment.this;
            Context mo2getContext = settingsAccountInnerFragment.mo2getContext();
            if (mo2getContext == null) {
                return true;
            }
            String[] strArr = {mo2getContext.getString(R.string.wall_my_posts), mo2getContext.getString(R.string.wall_all_posts)};
            int i2 = !settingsAccountInnerFragment.m0.g ? 1 : 0;
            h7u0.a aVar = new h7u0.a(mo2getContext);
            aVar.g0(R.string.sett_posts_default);
            aVar.c = true;
            aVar.e0(strArr, i2, new j0j0(settingsAccountInnerFragment));
            aVar.W(R.string.cancel, new i0j0());
            aVar.m();
            return true;
        }
    }

    public class d implements Preference.c {
        public d() {
        }

        @Override // androidx.preference.Preference.c
        public final boolean eh(Preference preference) {
            int i = SettingsAccountInnerFragment.r0;
            final SettingsAccountInnerFragment settingsAccountInnerFragment = SettingsAccountInnerFragment.this;
            final com.vk.core.view.components.spinner.c e = qv20.e(settingsAccountInnerFragment.getActivity(), Integer.valueOf(R.string.sett_restoring_purchases));
            e.show();
            settingsAccountInnerFragment.n0.b(fsk.P(new til0(1), settingsAccountInnerFragment.mo2getContext() == null ? e43.a : settingsAccountInnerFragment.mo2getContext()).subscribe(new io.reactivex.rxjava3.functions.f() { // from class: xsna.g0j0
                @Override // io.reactivex.rxjava3.functions.f
                public final void accept(Object obj) {
                    Subscription subscription = (Subscription) obj;
                    int i2 = SettingsAccountInnerFragment.r0;
                    boolean z = subscription.s;
                    com.vk.core.view.components.spinner.c cVar = e;
                    if (z) {
                        cvk.w(cVar.getContext().getString(R.string.sett_purchases_restored, subscription.i), false);
                        qv20.b(cVar);
                    } else {
                        SettingsAccountInnerFragment settingsAccountInnerFragment2 = SettingsAccountInnerFragment.this;
                        settingsAccountInnerFragment2.l0.f(settingsAccountInnerFragment2.getActivity(), new n0j0(cVar, subscription), subscription);
                    }
                }
            }, new gl30(e, 23)));
            return true;
        }
    }

    public class e implements Preference.c {
        public e() {
        }

        @Override // androidx.preference.Preference.c
        public final boolean eh(Preference preference) {
            int i = SettingsAccountInnerFragment.r0;
            SettingsAccountInnerFragment settingsAccountInnerFragment = SettingsAccountInnerFragment.this;
            Context mo2getContext = settingsAccountInnerFragment.mo2getContext();
            if (mo2getContext == null) {
                return true;
            }
            CommentsOrder commentsOrder = settingsAccountInnerFragment.m0.i;
            List<CommentsOrder.Item> list = commentsOrder.c;
            String str = commentsOrder.b;
            String[] strArr = new String[list.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                CommentsOrder.Item item = list.get(i3);
                if (item.b.equals(str)) {
                    i2 = i3;
                }
                strArr[i3] = item.c;
            }
            h7u0.a aVar = new h7u0.a(mo2getContext);
            aVar.g0(R.string.account_settings_comment_order);
            aVar.c = true;
            aVar.W(R.string.cancel, new p0j0());
            aVar.e0(strArr, i2, new o0j0(settingsAccountInnerFragment, list, str, preference));
            aVar.m();
            return true;
        }
    }

    public class f implements Preference.b {

        public class a implements izs<List<String>, s3q0> {
            @Override // xsna.izs
            public final s3q0 invoke(List<String> list) {
                return s3q0.a;
            }
        }

        public class b implements gzs<s3q0> {
            public final /* synthetic */ SummaryListPreference b;

            public b(SummaryListPreference summaryListPreference) {
                this.b = summaryListPreference;
            }

            @Override // xsna.gzs
            public final s3q0 invoke() {
                SettingsAccountInnerFragment.ho(SettingsAccountInnerFragment.this, this.b, UserNameType.CONTACT);
                return s3q0.a;
            }
        }

        public f() {
        }

        @Override // androidx.preference.Preference.b
        public final boolean Sl(Preference preference, Object obj) {
            SummaryListPreference summaryListPreference = (SummaryListPreference) preference;
            SettingsAccountInnerFragment settingsAccountInnerFragment = SettingsAccountInnerFragment.this;
            if (settingsAccountInnerFragment.getActivity() == null) {
                return false;
            }
            if (obj.equals(UserNameType.CONTACT.h())) {
                settingsAccountInnerFragment.q0.N0(settingsAccountInnerFragment.kn(), false, ContactsPermissionMessage.DEFAULT, null, new a(), new b(summaryListPreference));
                return true;
            }
            SettingsAccountInnerFragment.ho(settingsAccountInnerFragment, summaryListPreference, UserNameType.VK);
            return true;
        }
    }

    public SettingsAccountInnerFragment() {
        a1w a1wVar = q1w.a;
        this.o0 = a1wVar == null ? null : a1wVar;
        this.p0 = o25.a();
        this.q0 = com.vk.contacts.d.a;
    }

    public static void ho(SettingsAccountInnerFragment settingsAccountInnerFragment, SummaryListPreference summaryListPreference, UserNameType userNameType) {
        String str = summaryListPreference.Y;
        io.reactivex.rxjava3.disposables.b bVar = settingsAccountInnerFragment.n0;
        String h = userNameType.h();
        gs gsVar = new gs();
        gsVar.K("name", "im_user_name_type");
        gsVar.K("value", h);
        jx2 jx2Var = new jx2(gsVar, new l0j0(settingsAccountInnerFragment, settingsAccountInnerFragment.getActivity(), userNameType, summaryListPreference, str));
        jx2Var.g = settingsAccountInnerFragment.getActivity();
        bVar.b(jx2Var.a());
    }

    public final void io() {
        findPreference("accountCommunityComments").I(q6r0.f().e(m6r0.M) ? getString(R.string.community_comments_settings_option_everywhere) : getString(R.string.community_comments_settings_option_only_in_your_communities));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 105 && i2 == -1) {
            GetAccountSettingsRequest.Result result = this.m0;
            String str = result.b;
            String str2 = result.c;
            String str3 = result.d;
            String str4 = result.e;
            String str5 = result.f;
            boolean z = result.g;
            boolean z2 = result.h;
            CommentsOrder commentsOrder = result.i;
            UserNameType userNameType = result.j;
            result.getClass();
            this.m0 = new GetAccountSettingsRequest.Result(str, str2, str3, str4, str5, z, z2, commentsOrder, userNameType);
        }
        if (i == 103 && i2 == -1) {
            GetAccountSettingsRequest.Result result2 = this.m0;
            String str6 = result2.b;
            String str7 = result2.c;
            String str8 = result2.d;
            String str9 = result2.e;
            String stringExtra = intent.getStringExtra("new_domain");
            GetAccountSettingsRequest.Result result3 = this.m0;
            boolean z3 = result3.g;
            boolean z4 = result3.h;
            CommentsOrder commentsOrder2 = result3.i;
            UserNameType userNameType2 = result3.j;
            result2.getClass();
            this.m0 = new GetAccountSettingsRequest.Result(str6, str7, str8, str9, stringExtra, z3, z4, commentsOrder2, userNameType2);
            findPreference("accountDomain").I("@" + this.m0.f);
        }
    }

    @Override // com.vk.prefui.fragments.MaterialPreferenceFragment, com.vk.prefui.fragments.PreferenceFragmentCompat, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Object obj;
        String str;
        super.onCreate(bundle);
        addPreferencesFromResource(R.xml.preferences_account_milkshake);
        this.m0 = (GetAccountSettingsRequest.Result) getArguments().getParcelable("api_result");
        getArguments().getString("pref_to_highlight");
        if (getActivity() instanceof aeg0) {
            ((aeg0) getActivity()).Li(this);
        }
        Preference findPreference = findPreference("accountDomain");
        findPreference.I("@" + this.m0.f);
        findPreference.g = new a();
        Preference findPreference2 = findPreference("accountCommunityComments");
        io();
        findPreference2.g = new b();
        findPreference("accountOnlyMyPosts").g = new c();
        Preference findPreference3 = findPreference("accountEnableComments");
        ((TwoStatePreference) findPreference3).O(!this.m0.h);
        findPreference3.f = new vtg0(this, 1);
        findPreference("accountRestorePurchases").g = new d();
        Preference findPreference4 = findPreference("accountCommentOrder");
        CommentsOrder commentsOrder = this.m0.i;
        Iterator<T> it = commentsOrder.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (epx.f(((CommentsOrder.Item) obj).b, commentsOrder.b)) {
                    break;
                }
            }
        }
        CommentsOrder.Item item = (CommentsOrder.Item) obj;
        if (item == null || (str = item.c) == null) {
            str = commentsOrder.b;
        }
        findPreference4.I(str);
        findPreference4.g = new e();
        SummaryListPreference summaryListPreference = (SummaryListPreference) findPreference("accountImUserNameType");
        summaryListPreference.K(true);
        summaryListPreference.R(this.m0.j.h());
        summaryListPreference.f = new f();
        Preference findPreference5 = findPreference("unread_counter");
        findPreference5.K(true);
        findPreference5.I("");
        findPreference5.g = new n8c0(this, 7);
        this.n0.b(this.o0.l.a().b0(s480.class).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new jw80(this, 11), kwg0.b()));
        findPreference("accountNewsfeedSettings").g = new f0j0(this, 0);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.n0.dispose();
        super.onDestroy();
    }

    @Override // com.vk.prefui.fragments.MaterialPreferenceFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Preference findPreference = findPreference("accountOnlyMyPosts");
        findPreference.I(findPreference.b.getString(this.m0.g ? R.string.wall_my_posts : R.string.wall_all_posts));
    }
}
