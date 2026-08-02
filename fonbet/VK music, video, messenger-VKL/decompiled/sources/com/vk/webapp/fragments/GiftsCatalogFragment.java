package com.vk.webapp.fragments;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.vk.core.performance.device.DevicePerformanceInfo;
import com.vk.stickers.gifts.catalog.GiftsCatalogDelegate$giftSentEventReceiver$2$1;
import com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment;
import com.vk.toggle.b;
import com.vk.toggle.features.VasFeatures;
import com.vkontakte.android.ValidationActivity;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import xsna.ahn;
import xsna.anj;
import xsna.d9j;
import xsna.enj;
import xsna.hf8;
import xsna.jrh;
import xsna.mfu0;
import xsna.nzt;
import xsna.oz50;
import xsna.ozt;
import xsna.pzt;
import xsna.qjg;
import xsna.r3y;
import xsna.s3q0;
import xsna.s93;
import xsna.tr0;
import xsna.zxo;

/* compiled from: GiftsCatalogFragment.kt */
/* loaded from: classes7.dex */
public final class GiftsCatalogFragment extends VKSuperAppBrowserFragment {
    public static final /* synthetic */ int c0 = 0;
    public nzt a0;
    public boolean b0;

    /* compiled from: GiftsCatalogFragment.kt */
    public static final class a extends oz50 {
        public a(String str) {
            super(GiftsCatalogFragment.class, null, null);
            this.j.putLong("key_application_id", 53670660L);
            this.j.putString("key_url", str);
            this.j.putBoolean("can_cache", true);
        }

        public final void y() {
            com.vk.toggle.b bVar = com.vk.toggle.b.A;
            VasFeatures vasFeatures = VasFeatures.VAS_GIFT_MINIAPP_DISKOTEKA_FIX;
            b.d i = bVar.i(vasFeatures);
            Integer b = i != null ? i.b() : null;
            this.j.putBoolean("no_bottom_navigation", ((b != null && b.intValue() == 2) || (b != null && b.intValue() == 3)) && bVar.a(vasFeatures));
        }
    }

    /* compiled from: GiftsCatalogFragment.kt */
    public static final class b {
        public static void a(Context context, String str, boolean z) {
            a aVar = new a(str);
            aVar.j.putBoolean("close_on_finish", z);
            aVar.y();
            aVar.k(context);
        }

        public static void b(Context context, List list, List list2, String str, String str2, int i) {
            int i2 = GiftsCatalogFragment.c0;
            if ((i & 8) != 0) {
                str = null;
            }
            String str3 = str;
            nzt.a.C3428a c3428a = new nzt.a.C3428a(ahn.s() + "#send");
            int i3 = GiftsCatalogFragment.c0;
            a(context, nzt.a.a(c3428a, list2, str2, str3, list, true), false);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    /* compiled from: GiftsCatalogFragment.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DevicePerformanceInfo.Class.values().length];
            try {
                iArr[DevicePerformanceInfo.Class.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DevicePerformanceInfo.Class.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DevicePerformanceInfo.Class.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        nzt nztVar = new nzt(arguments != null ? arguments.getBoolean("close_on_finish") : false, new jrh(this, 12));
        this.a0 = nztVar;
        if (bundle != null) {
            nztVar.c = bundle.getBoolean("close_from_bridge", false);
            nztVar.d = bundle.getString("catalog_id");
        }
        nzt nztVar2 = this.a0;
        if (nztVar2 != null) {
            anj.d(kn(), (GiftsCatalogDelegate$giftSentEventReceiver$2$1) nztVar2.e.getValue(), new IntentFilter("com.vkontakte.android.ACTION_GIFT_SENT"), hf8.a, 4);
        }
        r3y.a("giftsCatalog.openGiftSendScreen", new zxo(this, 11));
        r3y.a("giftsCatalog.giftSent", new d9j(this, 14));
        r3y.a("giftsCatalog.isNewGiftsSendEnabled", new tr0(20));
    }

    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        r3y.c("giftsCatalog.openGiftSendScreen");
        r3y.c("giftsCatalog.giftSent");
        r3y.c("giftsCatalog.isNewGiftsSendEnabled");
        nzt nztVar = this.a0;
        if (nztVar != null) {
            enj.s(requireContext(), (GiftsCatalogDelegate$giftSentEventReceiver$2$1) nztVar.e.getValue());
        }
        super.onDestroy();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (pzt.a()) {
            Iterator<T> it = getParentFragmentManager().c.f().iterator();
            while (it.hasNext()) {
                if (qjg.a((Fragment) it.next()).equals("WebViewFragment")) {
                    this.b0 = true;
                }
            }
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (pzt.a() && ValidationActivity.I) {
            this.b0 = true;
        }
        if (pzt.a() && this.b0) {
            WebView po = po();
            if (po != null) {
                po.setLayerType(1, null);
            }
            DevicePerformanceInfo a2 = DevicePerformanceInfo.a.a();
            DevicePerformanceInfo.Class r2 = a2 != null ? a2.d : null;
            int i = r2 == null ? -1 : c.$EnumSwitchMapping$0[r2.ordinal()];
            int i2 = 10;
            if (i != -1) {
                if (i == 1) {
                    i2 = 4;
                } else if (i == 2) {
                    i2 = 8;
                } else if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            WebView po2 = po();
            if (po2 != null) {
                po2.postVisualStateCallback(0L, new ozt(this, 0, i2));
            }
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        nzt nztVar = this.a0;
        if (nztVar != null) {
            bundle.putBoolean("close_from_bridge", nztVar.c);
            String str = nztVar.d;
            if (str == null) {
                str = UUID.randomUUID().toString();
                nztVar.d = str;
            }
            bundle.putString("catalog_id", str);
        }
    }

    public final WebView po() {
        s93 state;
        mfu0 jo = jo();
        if (jo == null || (state = jo.getState()) == null) {
            return null;
        }
        return state.getView();
    }
}
