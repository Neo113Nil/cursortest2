package xsna;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.foundation.layout.a;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.preference.Preference;
import com.vk.clips.sdk.shared.item.market_ads.events.MarketAdsItemViewEvent;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.actionlinks.ActionLinks;
import com.vk.dto.common.data.VKList;
import com.vk.dto.group.Group;
import com.vk.dto.video.VideoOwner;
import com.vk.superapp.api.dto.auth.InitPasswordCheckResponse;
import com.vk.superapp.api.dto.menu.SuperAppAnimationConfig;
import com.vk.voip.ui.asr.ui.start.AsrRecordStartFragment;
import java.util.Set;
import ru.ok.android.externcalls.sdk.analytics.ConversationAnalyticsUploadConfig;
import ru.ok.android.externcalls.sdk.analytics.UploadConfigProvider;
import xsna.bmt;
import xsna.dt1;
import xsna.eg20;
import xsna.ihz;
import xsna.jza0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class dg1 implements io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.l, a.k, io.reactivex.rxjava3.functions.h, UploadConfigProvider, Preference.b, Toolbar.h, ihz.a, io.reactivex.rxjava3.functions.g {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dg1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        String obj2 = obj.toString();
        thx a = uhx.a();
        long j = (14 & 4) != 0 ? -1L : 0L;
        if (!a.equals(uhx.a())) {
            j = a.a;
        }
        new jgr0(obj2, j, null, false, 28).k(debugDevSettingsFragment.getActivity());
        return true;
    }

    public void a(MarketAdsItemViewEvent marketAdsItemViewEvent) {
        com.vk.clips.sdk.shared.item.market_ads.b.m((com.vk.clips.sdk.shared.item.market_ads.b) this.c, marketAdsItemViewEvent);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 1:
                return (VKList) ((com.vk.movika.sdk.base.observable.u) obj2).invoke(obj);
            case 2:
            case 5:
            case 6:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 20:
            case 23:
            case 25:
            case 27:
            default:
                return (io.reactivex.rxjava3.core.t) ((qd1) obj2).invoke(obj);
            case 3:
                int i2 = AsrRecordStartFragment.U;
                return (it80) ((w8) obj2).invoke(obj);
            case 4:
                return (nd4) ((com.vk.movika.sdk.base.observable.u) obj2).invoke(obj);
            case 7:
                return (io.reactivex.rxjava3.core.t) ((qd1) obj2).invoke(obj);
            case 8:
                return (io.reactivex.rxjava3.core.t) ((com.vk.movika.sdk.base.observable.u) obj2).invoke(obj);
            case 9:
                return (vqt) ((w8) obj2).invoke(obj);
            case 10:
                return ((r2e) obj2).invoke(obj);
            case 11:
                return (io.reactivex.rxjava3.core.b0) ((w8) obj2).invoke(obj);
            case 12:
                return (Boolean) ((com.vk.movika.sdk.base.observable.u) obj2).invoke(obj);
            case 17:
                return (io.reactivex.rxjava3.core.t) ((frg) obj2).invoke(obj);
            case 19:
                return (Set) ((com.vk.movika.sdk.base.observable.u) obj2).invoke(obj);
            case 21:
                return (InitPasswordCheckResponse) ((qr0) obj2).invoke(obj);
            case 22:
                return (bmt.a) ((qd1) obj2).invoke(obj);
            case 24:
                return (io.reactivex.rxjava3.core.o) ((xcd) obj2).invoke(obj);
            case 26:
                return (SuperAppAnimationConfig) ((w620) obj2).invoke(obj);
            case 28:
                return (zp20) ((f1s) obj2).invoke(obj);
        }
    }

    @Override // androidx.compose.foundation.layout.a.k
    public int b(int i, LayoutDirection layoutDirection) {
        return ((dt1.c) this.c).a(0, i);
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (eg20.a) ((qci) this.c).invoke(obj, obj2, obj3);
    }

    @Override // io.reactivex.rxjava3.functions.h
    public Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        qh8 qh8Var = (qh8) this.c;
        vqk0 vqk0Var = (vqk0) obj;
        qh8Var.k0 = (rit0) obj3;
        qh8Var.Q = (ActionLinks) obj4;
        qh8Var.U = vqk0Var.b;
        return new VideoOwner(vqk0Var.a, qh8Var.j, (Group) obj2);
    }

    @Override // ru.ok.android.externcalls.sdk.analytics.UploadConfigProvider
    public ConversationAnalyticsUploadConfig getUploadConfig() {
        return (ConversationAnalyticsUploadConfig) this.c;
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((jza0.b) obj).N(((fwa0) this.c).i.d);
    }

    @Override // androidx.appcompat.widget.Toolbar.h
    public boolean onMenuItemClick(MenuItem menuItem) {
        ((sem) this.c).d(menuItem.getItemId());
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 0:
                return ((Boolean) ((w8) this.c).invoke(obj)).booleanValue();
            case 6:
                return ((Boolean) ((com.vk.movika.sdk.base.observable.u) this.c).invoke(obj)).booleanValue();
            case 13:
                return ((Boolean) ((w8) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((frg) this.c).invoke(obj)).booleanValue();
        }
    }
}
