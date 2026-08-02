package com.vkontakte.android.fragments;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.SwitchPreferenceCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.biometrics.lock.api.di.BiometricsLockComponent;
import com.vk.cachecontrol.api.CacheComponent;
import com.vk.censoredsettings.api.di.CensoredSettingsComponent;
import com.vk.contacts.ContactsManager;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.Source;
import com.vk.dto.common.account.VideoConfig;
import com.vk.dto.menu.a;
import com.vk.dto.user.ObsceneTextFilter;
import com.vk.googleump.api.di.GoogleUMPComponent;
import com.vk.log.L;
import com.vk.metrics.eventtracking.Event;
import com.vk.prefui.fragments.MaterialPreferenceToolbarFragment;
import com.vk.prefui.views.MaterialSwitchPreference;
import com.vkontakte.android.R;
import com.vkontakte.android.audio.file.StorageType;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Regex;
import xsna.b2j0;
import xsna.b68;
import xsna.b87;
import xsna.bxx;
import xsna.c2j0;
import xsna.cew;
import xsna.cn6;
import xsna.cod0;
import xsna.czc0;
import xsna.d260;
import xsna.dev0;
import xsna.dnz;
import xsna.dy2;
import xsna.e40;
import xsna.e43;
import xsna.e630;
import xsna.el3;
import xsna.f0j0;
import xsna.fks0;
import xsna.fxc0;
import xsna.h2j0;
import xsna.hg1;
import xsna.j6i;
import xsna.k6c0;
import xsna.khc0;
import xsna.ko9;
import xsna.krw;
import xsna.kxa0;
import xsna.l23;
import xsna.lau;
import xsna.m6r0;
import xsna.m6x;
import xsna.m7m;
import xsna.mh40;
import xsna.moc;
import xsna.mpa;
import xsna.mwz;
import xsna.n8c0;
import xsna.nit;
import xsna.nst0;
import xsna.nzo;
import xsna.o25;
import xsna.o260;
import xsna.oz50;
import xsna.pv;
import xsna.q1w;
import xsna.q440;
import xsna.q6r0;
import xsna.s1j0;
import xsna.s3q0;
import xsna.sj4;
import xsna.sr10;
import xsna.t1j0;
import xsna.u1j0;
import xsna.v57;
import xsna.v5k0;
import xsna.w8i;
import xsna.x6h0;
import xsna.yqg0;
import xsna.zy60;

/* loaded from: classes7.dex */
public class SettingsGeneralFragment extends MaterialPreferenceToolbarFragment implements w8i {
    public static final /* synthetic */ int z0 = 0;
    public boolean o0;
    public StorageType l0 = StorageType.internal;
    public final io.reactivex.rxjava3.disposables.b m0 = new io.reactivex.rxjava3.disposables.b();
    public final io.reactivex.rxjava3.disposables.b n0 = new io.reactivex.rxjava3.disposables.b();
    public final nst0 p0 = new nst0();
    public final v5k0 q0 = new v5k0();
    public mpa r0 = null;
    public CacheComponent s0 = null;
    public Preference t0 = null;
    public b87 u0 = null;
    public v57 v0 = null;
    public fks0 w0 = null;
    public boolean x0 = false;
    public boolean y0 = false;

    public static class a extends oz50 {
        public a() {
            super(SettingsGeneralFragment.class, null, null);
        }
    }

    public static void ro(String str) {
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a aVar = new Event.a();
        aVar.g(str);
        bVar.k(aVar.e());
    }

    @Override // com.vk.prefui.fragments.MaterialPreferenceToolbarFragment
    public final int ho() {
        return this.o0 ? R.string.sett_manage_space : R.string.sett_general;
    }

    public final void io(SwitchPreferenceCompat switchPreferenceCompat, boolean z) {
        switchPreferenceCompat.F(!z);
        if (!z) {
            switchPreferenceCompat.I(switchPreferenceCompat.b.getString(R.string.sett_adaptive_feed_media_description));
            return;
        }
        sr10 sr10Var = dy2.a;
        if (sr10Var != null) {
            sr10Var.j(false);
            s3q0 s3q0Var = s3q0.a;
        }
        switchPreferenceCompat.I(getString(R.string.sett_autoplay_unavailable));
    }

    public final void jo() {
        ContactsManager contactsManager = com.vk.contacts.d.a;
        this.m0.b(hg1.k(q1w.a.F(this, new com.vk.im.engine.commands.contacts.a(Source.ACTUAL, true, null, false)), kn()).subscribe(new cn6(1, this, contactsManager), new pv(1, this, contactsManager)));
    }

    public final void ko() {
        Preference findPreference = findPreference("clearAllAndLogout");
        if (!this.o0 || o25.a().b()) {
            findPreference.g = new s1j0(this, 0);
        } else {
            ((PreferenceCategory) findPreference("cache")).R(findPreference);
        }
    }

    public final void lo() {
        Preference findPreference = findPreference("clearAudioCache");
        if (!this.o0 || (o25.a().b() && !q6r0.f().e(m6r0.z))) {
            findPreference.g = new x6h0(this, 1);
        } else {
            ((PreferenceCategory) findPreference("cache")).R(findPreference);
        }
    }

    public final void mo() {
        Preference findPreference = findPreference("clearCache");
        findPreference.g = new t1j0(this, findPreference);
        this.m0.b(this.s0.ve().a(this.s0.ic().a()).subscribe(new q440(findPreference, 17)));
    }

    public final void no() {
        Preference findPreference = findPreference("clearMessagesCache");
        if (!this.o0 || o25.a().b()) {
            findPreference.g = new n8c0(this, 8);
        } else {
            ((PreferenceCategory) findPreference("cache")).R(findPreference);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0263, code lost:
    
        if (r4 != null) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0282  */
    @Override // com.vk.prefui.fragments.MaterialPreferenceFragment, com.vk.prefui.fragments.PreferenceFragmentCompat, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        mwz mwzVar;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.o0 = arguments != null && arguments.getBoolean("com.vk.android.MANAGE_SPACE_MODE", false);
        this.s0 = (CacheComponent) j6i.b(m7m.f(this), CacheComponent.class);
        int i = 27;
        if (this.o0) {
            addPreferencesFromResource(R.xml.preferences_general_milkshake_manage_space_only);
            mo();
            findPreference("clearAllWithoutLogout").g = new e40(this, i);
            ko();
            no();
            lo();
        } else {
            this.r0 = ((CensoredSettingsComponent) j6i.c(m7m.f(this), CensoredSettingsComponent.class)).hf();
            this.u0 = ((BiometricsLockComponent) j6i.b(m7m.f(this), BiometricsLockComponent.class)).a();
            this.v0 = ((BiometricsLockComponent) j6i.b(m7m.f(this), BiometricsLockComponent.class)).b();
            this.w0 = fxc0.B().J();
            addPreferencesFromResource(R.xml.preferences_general_milkshake);
            SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) findPreference("mytrackerLocationCrapEnabled");
            switchPreferenceCompat.f = new ko9(this, switchPreferenceCompat);
            SwitchPreferenceCompat switchPreferenceCompat2 = (SwitchPreferenceCompat) findPreference("trackInstalledApps");
            List<String> list = m6x.a;
            if (q6r0.f().e(m6r0.v)) {
                switchPreferenceCompat2.f = new c2j0();
            } else {
                ((PreferenceCategory) findPreference(MBridgeConstans.DYNAMIC_VIEW_WX_APP)).R(switchPreferenceCompat2);
            }
            oo();
            v5k0 v5k0Var = this.q0;
            v5k0Var.a = false;
            MaterialSwitchPreference materialSwitchPreference = (MaterialSwitchPreference) findPreference("smartTab");
            Preference findPreference = findPreference(NotificationCompat.CATEGORY_NAVIGATION);
            b68 b68Var = b68.b;
            a.C0910a c0910a = b68.e().a().c;
            boolean z = c0910a != null && c0910a.c();
            a.C0910a c0910a2 = b68.e().a().c;
            a.e eVar = c0910a2 != null ? c0910a2.e : null;
            if (eVar == null) {
                findPreference.K(false);
                materialSwitchPreference.K(false);
            } else {
                findPreference.K(true);
                findPreference.J(eVar.b);
                materialSwitchPreference.K(true);
                materialSwitchPreference.J(eVar.c);
                materialSwitchPreference.I(eVar.d);
                materialSwitchPreference.O(z);
                materialSwitchPreference.f = new yqg0(this, v5k0Var);
            }
            SwitchPreferenceCompat switchPreferenceCompat3 = (SwitchPreferenceCompat) findPreference("useProxyServer");
            o260 o260Var = d260.a;
            dev0 h = (o260Var != null ? o260Var : null).h();
            switchPreferenceCompat3.O(h.isEnabled());
            switchPreferenceCompat3.f = new b2j0(this, h, switchPreferenceCompat3);
            findPreference("app_redirects").g = new kxa0(this, 6);
            SwitchPreferenceCompat switchPreferenceCompat4 = (SwitchPreferenceCompat) findPreference("video_background");
            switchPreferenceCompat4.g = new krw(this, switchPreferenceCompat4);
            SwitchPreferenceCompat switchPreferenceCompat5 = (SwitchPreferenceCompat) findPreference("music_mobile_network_download");
            switchPreferenceCompat5.f = new zy60(8);
            switchPreferenceCompat5.K(true);
            SwitchPreferenceCompat switchPreferenceCompat6 = (SwitchPreferenceCompat) findPreference("isRoamingState");
            ListPreference listPreference = (ListPreference) findPreference("video_autoplay");
            SwitchPreferenceCompat switchPreferenceCompat7 = (SwitchPreferenceCompat) findPreference("adaptive_feed_media");
            boolean z2 = switchPreferenceCompat6.Q;
            listPreference.F(!z2);
            if (z2) {
                listPreference.I(getString(R.string.sett_autoplay_unavailable));
            } else {
                listPreference.I("%s");
            }
            boolean contains = com.vk.core.preference.Preference.j().contains("adaptive_feed_media_changed_by_user");
            if (!com.vk.toggle.d.D() || com.vk.toggle.d.X.b() == null) {
                switchPreferenceCompat7.K(false);
            } else {
                if (!contains && !z2) {
                    switchPreferenceCompat7.O(true);
                }
                io(switchPreferenceCompat7, z2);
            }
            switchPreferenceCompat6.f = new moc(this, listPreference, switchPreferenceCompat7);
            switchPreferenceCompat7.f = new e630(7);
            VideoConfig videoConfig = (VideoConfig) ((bxx) q6r0.f().a(m6r0.n0));
            if (!(videoConfig != null ? videoConfig.zb() : false)) {
                listPreference.K(false);
            }
            findPreference(TtmlNode.ATTR_TTS_FONT_SIZE).f = new nit(this, 18);
            ListPreference listPreference2 = (ListPreference) findPreference("locale");
            int i2 = Build.VERSION.SDK_INT;
            boolean z3 = i2 >= 33;
            listPreference2.K(z3);
            Context context = listPreference2.b;
            if (z3) {
                listPreference2.X = context.getResources().getTextArray(R.array.locale_values);
                listPreference2.Q(context.getResources().getTextArray(R.array.locale_display_names));
                String string = getResources().getString(R.string.system_locale_value);
                if (i2 >= 33) {
                    Object l = l23.l();
                    if (l != null) {
                        mwzVar = mwz.b(l23.b.a(l));
                        if (mwzVar.a.a.isEmpty()) {
                            listPreference2.R(mwzVar.a.a.get(0).getLanguage());
                        } else {
                            listPreference2.R(string);
                        }
                        listPreference2.f = new mh40(string, 12);
                    }
                    mwzVar = mwz.b;
                    if (mwzVar.a.a.isEmpty()) {
                    }
                    listPreference2.f = new mh40(string, 12);
                } else {
                    mwzVar = l23.d;
                }
            }
            if (getResources().getConfiguration().keyboard != 2 && !com.vk.core.preference.Preference.j().getBoolean("sendByEnter", false)) {
                ((PreferenceCategory) findPreference(MBridgeConstans.DYNAMIC_VIEW_WX_APP)).R(findPreference("sendByEnter"));
            }
            mo();
            findPreference("clearAllWithoutLogout").g = new e40(this, i);
            ko();
            findPreference("doubleTapPostLike").K(true);
            SwitchPreferenceCompat switchPreferenceCompat8 = (SwitchPreferenceCompat) findPreference("stories_messenger_enabled");
            cew.b.getClass();
            switchPreferenceCompat8.O(cew.h().getBoolean("setting_stories_enabled_messenger", true));
            switchPreferenceCompat8.K(true);
            switchPreferenceCompat8.f = new com.vk.movika.sdk.android.defaultplayer.view.a(28);
            no();
            qo();
            findPreference("saveProcessedImage").K(BuildInfo.t() || BuildInfo.s());
            jo();
            int i3 = 4;
            if (q6r0.f().e(m6r0.z)) {
                String[] strArr = {"downloadAudio", "audioCacheLocation", "enableAudioCache", "clearAudioCache"};
                PreferenceCategory preferenceCategory = (PreferenceCategory) findPreference("cache");
                for (int i4 = 0; i4 < 4; i4++) {
                    Preference findPreference2 = findPreference(strArr[i4]);
                    if (findPreference2 != null) {
                        preferenceCategory.R(findPreference2);
                    }
                }
            } else {
                findPreference("downloadAudio").g = new khc0(this, 3);
                lo();
                ListPreference listPreference3 = (ListPreference) findPreference("audioCacheLocation");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                HashSet hashSet = new HashSet();
                Iterator it = nzo.c(e43.a).iterator();
                while (it.hasNext()) {
                    File file = (File) it.next();
                    if (file.canWrite()) {
                        try {
                            Regex regex = com.vk.core.files.a.a;
                            String string2 = getString(com.vk.core.files.a.A(file.getAbsolutePath()) ? R.string.file_sd_card : R.string.file_internal_storage);
                            arrayList2.add(string2);
                            hashSet.add(string2);
                            arrayList.add(StorageType.a(file.getPath()).nameForPreference);
                        } catch (Exception e) {
                            L.i(e);
                        }
                    }
                }
                listPreference3.X = (CharSequence[]) arrayList.toArray(new String[arrayList.size()]);
                listPreference3.Q((CharSequence[]) arrayList2.toArray(new String[arrayList2.size()]));
                StorageType a2 = StorageType.a(String.valueOf(listPreference3.Y));
                this.l0 = a2;
                listPreference3.R(a2.nameForPreference);
                listPreference3.f = new f0j0(this, 1);
                if (hashSet.size() <= 1) {
                    ((PreferenceCategory) findPreference("cache")).R(listPreference3);
                }
            }
            Preference findPreference3 = findPreference("app_biometrics_lock_category");
            findPreference3.K(false);
            findPreference3.K(true);
            this.t0 = findPreference("app_biometrics_lock");
            boolean a3 = this.v0.a();
            this.x0 = a3;
            Preference preference = this.t0;
            if (a3) {
                preference.I(requireContext().getString(R.string.bl_enabled));
            } else {
                preference.I(requireContext().getString(R.string.bl_disabled));
            }
            this.t0.g = new k6c0(this, i3);
            Preference findPreference4 = findPreference("ads_privacy_options");
            findPreference4.K(false);
            lau P4 = ((GoogleUMPComponent) j6i.b(m7m.f(this), GoogleUMPComponent.class)).P4();
            if (P4.a()) {
                P4.c(kn(), new h2j0(this, findPreference4));
            }
        }
        new czc0().a(this.N.g);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.m0.dispose();
        this.n0.dispose();
    }

    @Override // com.vk.prefui.fragments.MaterialPreferenceFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        v5k0 v5k0Var = this.q0;
        if (v5k0Var.a) {
            b68.e().d();
            v5k0Var.a = false;
        }
        super.onPause();
    }

    @Override // com.vk.prefui.fragments.MaterialPreferenceFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.o0) {
            return;
        }
        if (this.y0) {
            oo();
            this.y0 = false;
        }
        Preference preference = this.t0;
        if (preference != null) {
            boolean a2 = this.v0.a();
            this.x0 = a2;
            if (a2) {
                preference.I(requireContext().getString(R.string.bl_enabled));
            } else {
                preference.I(requireContext().getString(R.string.bl_disabled));
            }
        }
    }

    public final void oo() {
        Preference findPreference = findPreference("misc");
        findPreference("stickersSettings").g = new sj4(this, 29);
        Preference findPreference2 = findPreference("obsceneTextFilter");
        ObsceneTextFilter obsceneTextFilter = o25.a().i().U;
        boolean z = obsceneTextFilter == ObsceneTextFilter.UNAVAILABLE;
        findPreference2.K(!z);
        if (!z) {
            findPreference2.I(findPreference2.b.getString(obsceneTextFilter == ObsceneTextFilter.ENABLED ? R.string.sett_obscene_text_filter_on : R.string.sett_obscene_text_filter_off));
            findPreference2.g = new dnz(this, 14);
        }
        findPreference.K(true);
    }

    public final void po(boolean z, boolean z2) {
        Preference findPreference = findPreference("resetContacts");
        findPreference.K(z || z2);
        findPreference.J(findPreference.b.getString(R.string.vkim_settings_clear_contacts));
        findPreference.g = new u1j0(this, 0);
    }

    public final void qo() {
        Preference findPreference = findPreference("syncContacts");
        ContactsManager contactsManager = com.vk.contacts.d.a;
        findPreference.K(!contactsManager.H0());
        findPreference.J(findPreference.b.getString(R.string.sync_contacts_btn));
        findPreference.g = new cod0(this, contactsManager);
    }
}
