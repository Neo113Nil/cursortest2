package xsna;

import android.content.Context;
import androidx.preference.Preference;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipsMusicSelectorCatalogEmbeddedTabsVh;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.debug.ui.user.DebugUserSettingsFragment;
import com.vk.dto.common.Peer;
import com.vk.fcmerrorhandler.debug.FcmErrorsDebug;
import com.vk.friends.impl.followers.presentation.fragments.AbsFollowersListFragment;
import com.vk.newsfeed.common.prefetch.ClipsPrefetchHelper;
import com.vk.stickers.bridge.b;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.libverify.js.bridge.api.events.LibverifyChangeState$Response;
import com.vk.voip.ui.settings.CallParticipantsFragment;
import com.vk.voip.ui.settings.participants_view.CallParticipantsViewModel;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import java.util.Optional;
import xsna.cwb0;
import xsna.drz;
import xsna.ktt;
import xsna.mwm;
import xsna.p9k;
import xsna.s3z;
import xsna.u3s;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class l7 implements io.reactivex.rxjava3.functions.l, SwipeDrawableRefreshLayout.g, Preference.c, whp {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l7(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.whp
    public String a() {
        return ((Context) this.c).getString(R.string.catalog_search_empty_list);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (List) ((m8) obj2).invoke(obj);
            case 1:
            case 16:
            case 17:
            case 24:
            default:
                return (io.reactivex.rxjava3.core.t) ((f6w) obj2).invoke(obj);
            case 2:
                return (io.reactivex.rxjava3.core.b0) ((sa) obj2).invoke(obj);
            case 3:
                return (io.reactivex.rxjava3.core.b0) ((sa) obj2).invoke(obj);
            case 4:
                return (hda) ((sa) obj2).invoke(obj);
            case 5:
                return (io.reactivex.rxjava3.core.b0) ((wh6) obj2).invoke(obj);
            case 6:
                int i2 = CallParticipantsFragment.W;
                return (CallParticipantsViewModel) ((CallParticipantsFragment.d) obj2).invoke(obj);
            case 7:
                return (hda) ((ud8) obj2).invoke(obj);
            case 8:
                return (List) ((wh6) obj2).invoke(obj);
            case 9:
                return (io.reactivex.rxjava3.core.t) ((sa) obj2).invoke(obj);
            case 10:
                qcy<Object>[] qcyVarArr = ClipsMusicSelectorCatalogEmbeddedTabsVh.p;
                return (Optional) ((sa) obj2).invoke(obj);
            case 11:
                return (ClipsPrefetchHelper.a) ((wh6) obj2).invoke(obj);
            case 12:
                return (io.reactivex.rxjava3.core.b0) ((n6f) obj2).invoke(obj);
            case 13:
                return (b.a) ((wh6) obj2).invoke(obj);
            case 14:
                return (it80) ((wh6) obj2).invoke(obj);
            case 15:
                return (p9k.b) ((n6f) obj2).invoke(obj);
            case 18:
                return (Peer) ((izs) obj2).invoke(obj);
            case 19:
                return (mwm.a) ((n6f) obj2).invoke(obj);
            case 20:
                return (g1h0) ((ysd) obj2).invoke(obj);
            case 21:
                return (io.reactivex.rxjava3.core.t) ((n6f) obj2).invoke(obj);
            case 22:
                return (drz.a) ((n6f) obj2).invoke(obj);
            case 23:
                return (jks) ((wh6) obj2).invoke(obj);
            case 25:
                return (Boolean) ((wh6) obj2).invoke(obj);
            case 26:
                return (Boolean) ((wh6) obj2).invoke(obj);
            case 27:
                return (ktt.a) ((n6f) obj2).invoke(obj);
        }
    }

    public void b(s3z s3zVar, boolean z) {
        LibverifyChangeState$Response.Data data;
        r4y r4yVar = (r4y) this.c;
        if (s3zVar instanceof s3z.d) {
            return;
        }
        com.vk.superapp.base.js.bridge.b bVar = r4yVar.a;
        JsMethod jsMethod = new JsMethod("VKWebAppLibverifyChangeState");
        if (s3zVar.equals(s3z.f.a)) {
            data = new LibverifyChangeState$Response.Data("sms", Boolean.valueOf(z), null, null, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null);
        } else if (s3zVar instanceof s3z.a) {
            data = new LibverifyChangeState$Response.Data("call_reset", Boolean.valueOf(z), Integer.valueOf(((s3z.a) s3zVar).a), null, null, null, null, null, 120, null);
        } else if (s3zVar instanceof s3z.e) {
            data = new LibverifyChangeState$Response.Data("mobile_id", Boolean.valueOf(z), null, null, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null);
        } else if (s3zVar instanceof s3z.c) {
            data = new LibverifyChangeState$Response.Data("error", Boolean.valueOf(z), null, null, null, Integer.valueOf(((s3z.c) s3zVar).a), null, null, 92, null);
        } else {
            if (!(s3zVar instanceof s3z.b)) {
                throw new IllegalStateException("Other states can't be converted to JsBridge data!");
            }
            s3z.b bVar2 = (s3z.b) s3zVar;
            data = new LibverifyChangeState$Response.Data("completed", Boolean.valueOf(z), null, bVar2.b, bVar2.a, null, null, null, 100, null);
        }
        bVar.n(jsMethod, new LibverifyChangeState$Response(null, data, null, 1, null));
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 16:
                DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) obj;
                String[] strArr = DebugDevSettingsFragment.t0;
                if (!com.vk.toggle.d.H()) {
                    enj.r(debugDevSettingsFragment.requireContext(), "Тоггл выключен", 0);
                    break;
                } else {
                    new bzb0(debugDevSettingsFragment.kn()).b(new cwb0.n(FcmErrorsDebug.values()), new b40(15), null);
                    break;
                }
            default:
                int i2 = DebugUserSettingsFragment.l0;
                cvk.u(R.string.settings_archive_started, false);
                asu0.a.getClass();
                asu0.n().submit(new gv2((DebugUserSettingsFragment) obj, 5));
                break;
        }
        return true;
    }

    @Override // com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout.g
    public void h() {
        ((AbsFollowersListFragment) this.c).S.c(u3s.d.a);
    }
}
