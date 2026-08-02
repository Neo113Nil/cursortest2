package com.vkontakte.android.fragments;

import android.os.Bundle;
import androidx.preference.Preference;
import com.vk.prefui.fragments.MaterialPreferenceToolbarFragment;
import com.vk.prefui.views.MaterialSwitchPreference;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.a1w;
import xsna.b25;
import xsna.fl40;
import xsna.irc0;
import xsna.j5b0;
import xsna.kwg0;
import xsna.msy;
import xsna.n5j0;
import xsna.oz50;
import xsna.p350;
import xsna.q1w;
import xsna.s480;
import xsna.w8i;

/* compiled from: UnreadCounterSettingsFragment.kt */
/* loaded from: classes7.dex */
public final class UnreadCounterSettingsFragment extends MaterialPreferenceToolbarFragment implements w8i {
    public static final /* synthetic */ int n0 = 0;
    public final Object l0 = msy.a(LazyThreadSafetyMode.NONE, new irc0(this, 20));
    public final io.reactivex.rxjava3.disposables.b m0 = new io.reactivex.rxjava3.disposables.b();

    /* compiled from: UnreadCounterSettingsFragment.kt */
    public static final class a extends oz50 {
    }

    @Override // com.vk.prefui.fragments.MaterialPreferenceToolbarFragment
    public final int ho() {
        return R.string.settings_unread_messages_counter_title;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void io() {
        Preference findPreference = findPreference("unread_counter");
        MaterialSwitchPreference materialSwitchPreference = findPreference instanceof MaterialSwitchPreference ? (MaterialSwitchPreference) findPreference : null;
        ?? r1 = this.l0;
        if (materialSwitchPreference != null) {
            materialSwitchPreference.O(((b25) r1.getValue()).i().Q.b);
        }
        Preference findPreference2 = findPreference("include_channel_notifications");
        MaterialSwitchPreference materialSwitchPreference2 = findPreference2 instanceof MaterialSwitchPreference ? (MaterialSwitchPreference) findPreference2 : null;
        if (materialSwitchPreference2 != null) {
            materialSwitchPreference2.O(((b25) r1.getValue()).i().Q.d);
        }
    }

    @Override // com.vk.prefui.fragments.MaterialPreferenceFragment, com.vk.prefui.fragments.PreferenceFragmentCompat, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(R.xml.preferences_unread_counters);
        findPreference("unread_counter").f = new fl40(this, 9);
        findPreference("include_channel_notifications").f = new n5j0(this, 3);
        io.reactivex.rxjava3.disposables.b bVar = this.m0;
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        bVar.b(a1wVar.l.a().b0(s480.class).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new p350(new j5b0(this, 21), 23), kwg0.b()));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.m0.dispose();
        super.onDestroy();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (isHidden()) {
            return;
        }
        io();
    }

    @Override // com.vk.prefui.fragments.MaterialPreferenceFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        io();
    }
}
