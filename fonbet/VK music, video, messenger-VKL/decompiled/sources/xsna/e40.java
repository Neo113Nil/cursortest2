package xsna;

import android.graphics.drawable.BitmapDrawable;
import androidx.preference.Preference;
import com.vk.catalog.sandbox.SandboxCatalogFragment;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.ClipVideoFile;
import com.vk.external.miniapp.net.ad.AdvertisementConfig;
import com.vk.feed.design.view.newsfeed.reaction.FeedAnimatedView;
import com.vk.feed.settings.impl.presentation.filtered.tab.NewsfeedFilterListFragment2;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import java.util.List;
import kotlin.Pair;
import ru.ok.android.externcalls.sdk.audio.AdaptersKt;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import xsna.by1;
import xsna.ihz;
import xsna.ung;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class e40 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.functions.m, Preference.c, ihz.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    public void a(com.vk.feed.settings.impl.presentation.filtered.tab.f fVar) {
        NewsfeedFilterListFragment2 newsfeedFilterListFragment2 = (NewsfeedFilterListFragment2) this.c;
        int i = NewsfeedFilterListFragment2.X;
        newsfeedFilterListFragment2.getFeature().V(fVar);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (Pair) ((d40) obj2).invoke(obj);
            case 1:
            case 3:
            case 4:
            case 9:
            case 10:
            case 11:
            case 20:
            case 22:
            case 27:
            default:
                return (List) ((rgl0) obj2).invoke(obj);
            case 2:
                AdvertisementConfig v = ((com.vk.superapp.advertisement.b) obj2).v();
                return v == null ? AdvertisementConfig.a : v;
            case 5:
                return (Pair) ((ix2) obj2).invoke(obj);
            case 6:
                return (ClipVideoFile) ((y8) obj2).invoke(obj);
            case 7:
                return (hda) ((ung.d) obj2).invoke(obj);
            case 8:
                return (String) ((izs) obj2).invoke(obj);
            case 12:
                int i2 = FeedAnimatedView.y;
                return (io.reactivex.rxjava3.core.t) ((nm1) obj2).invoke(obj);
            case 13:
                return (BitmapDrawable) ((ops) obj2).invoke(obj);
            case 14:
                return (Boolean) ((d40) obj2).invoke(obj);
            case 15:
                return (gcw) ((p2u) obj2).invoke(obj);
            case 16:
                return (Boolean) ((nm1) obj2).invoke(obj);
            case 17:
                return (b6w) ((p2u) obj2).invoke(obj);
            case 18:
                return (io.reactivex.rxjava3.core.b0) ((rm9) obj2).invoke(obj);
            case 19:
                return (wci0) ((p2u) obj2).invoke(obj);
            case 21:
                return (da00) ((lw3) obj2).invoke(obj);
            case 23:
                return (rvc0) ((ovc0) obj2).invoke(obj);
            case 24:
                return (List) ((bq00) obj2).invoke(obj);
            case 25:
                return (it80) ((bq00) obj2).invoke(obj);
            case 26:
                return (io.reactivex.rxjava3.core.t) ((p2u) obj2).invoke(obj);
            case 28:
                return (y860) ((p2u) obj2).invoke(obj);
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 10:
                DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) obj;
                String[] strArr = DebugDevSettingsFragment.t0;
                debugDevSettingsFragment.getClass();
                new SandboxCatalogFragment.a(SandboxCatalogFragment.class, null, null).k(debugDevSettingsFragment.mo2getContext());
                break;
            default:
                SettingsGeneralFragment settingsGeneralFragment = (SettingsGeneralFragment) obj;
                androidx.appcompat.app.d[] dVarArr = new androidx.appcompat.app.d[1];
                settingsGeneralFragment.m0.b(new io.reactivex.rxjava3.internal.operators.completable.e(new o0p(settingsGeneralFragment, dVarArr)).h(new rg60(dVarArr, 4)).subscribe());
                break;
        }
        return true;
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        String str = (String) this.c;
        by1 by1Var = (by1) obj;
        by1Var.getClass();
        by1Var.U(str);
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        AdaptersKt.hasBluetoothHeadsetSingle$lambda$6((CallsAudioManager) this.c, yVar);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 4:
                return ((Boolean) ((ix2) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((d40) this.c).invoke(obj)).booleanValue();
        }
    }

    public /* synthetic */ e40(by1.a aVar, String str, long j, long j2) {
        this.b = 11;
        this.c = str;
    }
}
