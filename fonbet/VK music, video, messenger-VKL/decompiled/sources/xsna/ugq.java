package xsna;

import androidx.preference.ListPreference;
import com.vk.billing.GoogleStorePurchasesManagerImpl;
import com.vk.core.apps.BuildInfo;
import com.vk.log.L;
import com.vkontakte.android.R;
import com.vkontakte.android.audio.file.StorageType;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import io.appmetrica.analytics.impl.F0;
import java.util.ArrayList;
import java.util.Map;
import xsna.h7u0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class ugq implements Runnable {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ugq(GoogleStorePurchasesManagerImpl googleStorePurchasesManagerImpl, Map map, ArrayList arrayList, String str, GoogleStorePurchasesManagerImpl.b bVar) {
        this.d = map;
        this.e = arrayList;
        this.c = str;
        this.f = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.f;
        String str = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                F0.a((F0) obj3, str, (String) obj2, (String) obj);
                return;
            case 1:
                Map map = (Map) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                GoogleStorePurchasesManagerImpl.b bVar = (GoogleStorePurchasesManagerImpl.b) obj;
                if (i0q0.b() && BuildInfo.h()) {
                    throw new IllegalStateException("Can't call from main thread");
                }
                g6 g6Var = new g6(15, bVar, map);
                try {
                    o27.d.getClass();
                    o27.b(str, arrayList, g6Var);
                    return;
                } catch (Exception e) {
                    L.f("Billing : PurchasesManager", "#getGooglePlayPrices(): Error appkit_loading prices from Google Play", e);
                    return;
                }
            default:
                SettingsGeneralFragment settingsGeneralFragment = (SettingsGeneralFragment) obj3;
                int i2 = SettingsGeneralFragment.z0;
                u1u0.b((ner0) obj2);
                h7u0.a aVar = new h7u0.a(settingsGeneralFragment.getActivity());
                aVar.g0(R.string.error);
                aVar.a.f = settingsGeneralFragment.getString(R.string.error_moving_audio_cache, str);
                aVar.c0(R.string.ok, null);
                aVar.m();
                ((ListPreference) settingsGeneralFragment.findPreference("audioCacheLocation")).R(((StorageType) obj).nameForPreference);
                return;
        }
    }

    public /* synthetic */ ugq(SettingsGeneralFragment settingsGeneralFragment, ner0 ner0Var, String str, StorageType storageType) {
        this.d = settingsGeneralFragment;
        this.e = ner0Var;
        this.c = str;
        this.f = storageType;
    }

    public /* synthetic */ ugq(F0 f0, String str, String str2, String str3) {
        this.d = f0;
        this.c = str;
        this.e = str2;
        this.f = str3;
    }
}
