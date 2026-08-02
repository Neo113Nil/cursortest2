package xsna;

import android.os.Bundle;
import androidx.preference.Preference;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;
import com.vk.api.base.VkPaginationList;
import com.vk.api.generated.market.dto.MarketMarketItemFullDto;
import com.vk.core.view.components.p003switch.VkSwitchItem;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.documents.impl.ui.fragments.AttachDocumentsFragment;
import com.vk.friends.impl.followers.presentation.fragments.AbsFollowersListFragment;
import com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment.GeoPostsFragment;
import com.vk.stickers.bridge.b;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vk.voip.ui.settings.CallParticipantsFragment;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.face.entity.FaceMorphingFigure;
import ru.ok.face.pipeline_frugal.FaceMorphingPipeline;
import ru.ok.tensorflow.util.Predicate;
import xsna.bld;
import xsna.c99;
import xsna.e3s;
import xsna.fih;
import xsna.gs9;
import xsna.gss;
import xsna.ntl;
import xsna.ttf;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class qa implements kss, io.reactivex.rxjava3.functions.l, PurchasesResponseListener, pcs, io.reactivex.rxjava3.functions.d, VkSwitchItem.a, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.c, Preference.c, Predicate, ptk0, h9l {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qa(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.ptk0
    public void a(lm50 lm50Var) {
        ((GeoPostsFragment) this.c).T.a(s3q0.a, (xmt) lm50Var);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Boolean apply(Object obj) {
        Boolean lambda$process$7;
        lambda$process$7 = ((FaceMorphingPipeline) this.c).lambda$process$7((FaceMorphingFigure) obj);
        return lambda$process$7;
    }

    @Override // com.vk.core.view.components.switch.VkSwitchItem.a
    public void b(boolean z) {
        dld dldVar = new dld(1, ((bld) this.c).d, bld.a.class, "onCameraGridSwitched", "onCameraGridSwitched(Z)V", 0);
        com.vk.core.preference.Preference.f("clips_camera_settings").edit().putBoolean("camera_grid", z).apply();
        dldVar.invoke(Boolean.valueOf(z));
        nf9.f();
    }

    @Override // xsna.kss
    public void c(gss gssVar) {
        AbsFollowersListFragment absFollowersListFragment = (AbsFollowersListFragment) this.c;
        int i = AbsFollowersListFragment.Y;
        if (gssVar instanceof gss.b) {
            xn50.a.c(absFollowersListFragment, new e3s.a.C2775a(false, ((gss.b) gssVar).a, false));
            return;
        }
        if (gssVar instanceof gss.d) {
            xn50.a.c(absFollowersListFragment, new e3s.a.d(false, ((gss.d) gssVar).a, false));
        } else if (gssVar instanceof gss.a) {
            xn50.a.c(absFollowersListFragment, new e3s.a.b(false, ((gss.a) gssVar).a, false));
        } else {
            if (!(gssVar instanceof gss.c)) {
                throw new NoWhenBranchMatchedException();
            }
            xn50.a.c(absFollowersListFragment, new e3s.a.c(((gss.c) gssVar).a));
        }
    }

    public void d() {
        gs9 gs9Var = (gs9) this.c;
        synchronized (gs9Var.a) {
            try {
                if (gs9Var.l == gs9.d.OPENED) {
                    gs9Var.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        ((ntl) new bzb0(debugDevSettingsFragment.requireContext()).b.getValue()).a(new ntl.a(10, "{\"channel\":{\"label\":\"big_channel\",\"queue\":\"-227425444\"},\"error\":{\"code\":2001,\"message\":\"Offset is too old\",\"data\":{\"new offset\":\"581\"}},\"id\":null}", null, "", ""), new xcd(debugDevSettingsFragment, 14));
        return true;
    }

    @Override // com.android.billingclient.api.PurchasesResponseListener
    public void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        ((izs) this.c).invoke(new l27(billingResult, list));
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        m99 m99Var;
        CallParticipantsFragment callParticipantsFragment = (CallParticipantsFragment) this.c;
        int i = CallParticipantsFragment.W;
        if (str.hashCode() == 853979510 && str.equals("result_participant_add_user_options")) {
            if (bundle.getBoolean("key_on_click_share_link")) {
                m99 m99Var2 = callParticipantsFragment.R;
                if (m99Var2 != null) {
                    m99Var2.b(c99.l0.a);
                    return;
                }
                return;
            }
            if (!bundle.getBoolean("key_on_click_add_by_qr") || (m99Var = callParticipantsFragment.R) == null) {
                return;
            }
            m99Var.b(new c99.m0(true));
        }
    }

    @Override // xsna.h9l
    public g9l provide() {
        return new k4m0((StoryViewerRouter) this.c);
    }

    @Override // io.reactivex.rxjava3.functions.d
    public boolean test(Object obj, Object obj2) {
        return ((Boolean) ((e69) this.c).invoke(obj, obj2)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 1:
                int i2 = AttachDocumentsFragment.R0;
                return (VkPaginationList) ((ng3) obj2).invoke(obj);
            case 2:
                return (io.reactivex.rxjava3.core.t) ((com.vk.movika.sdk.base.utils.b) obj2).invoke(obj);
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 10:
            case 14:
            case 17:
            case 20:
            case 23:
            case 25:
            case 26:
            default:
                return (Boolean) ((vam) obj2).invoke(obj);
            case 6:
                return (Boolean) ((com.vk.movika.sdk.base.utils.b) obj2).invoke(obj);
            case 9:
                return (List) ((com.vk.movika.sdk.base.utils.b) obj2).invoke(obj);
            case 11:
                return (io.reactivex.rxjava3.core.b0) ((ng3) obj2).invoke(obj);
            case 12:
                return (io.reactivex.rxjava3.core.b0) ((ng3) obj2).invoke(obj);
            case 13:
                return (ttf.j.b) ((com.vk.movika.sdk.base.utils.b) obj2).invoke(obj);
            case 15:
                return (it80) ((com.vk.movika.sdk.base.utils.b) obj2).invoke(obj);
            case 16:
                return ((fih.d) obj2).invoke(obj);
            case 18:
                return (j170) ((vam) obj2).invoke(obj);
            case 19:
                return (xr90) ((vam) obj2).invoke(obj);
            case 21:
                return (String) ((ci7) obj2).invoke(obj);
            case 22:
                return (Boolean) ((com.vk.movika.sdk.base.utils.b) obj2).invoke(obj);
            case 24:
                return (List) ((oqu) obj2).invoke(obj);
            case 27:
                return (MarketMarketItemFullDto) ((oqu) obj2).invoke(obj);
            case 28:
                return (Boolean) ((oqu) obj2).invoke(obj);
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 10:
                return ((Boolean) ((com.vk.movika.sdk.base.utils.b) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((vam) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (b.a) ((wmg) this.c).invoke(obj, obj2);
    }
}
