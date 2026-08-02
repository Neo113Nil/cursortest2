package xsna;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.vk.bridges.di.BridgeComponent;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.impl.presentation.newsfeed_backstage.NewsfeedBackstageBroadcastEventsListener$receiver$1;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.toggle.features.MoneyFeatures;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;
import xsna.c5g;
import xsna.ds60;
import xsna.ie8;
import xsna.j5g;
import xsna.jgp;
import xsna.on00;
import xsna.uc60;

/* compiled from: NewsfeedBackstageBroadcastEventsListener.kt */
/* loaded from: classes4.dex */
public final class uc60 {
    public final ie8 a;
    public final bpn0 b;
    public final bpn0 c;
    public final NewsfeedBackstageBroadcastEventsListener$receiver$1 d = new BroadcastReceiver() { // from class: com.vk.newsfeed.impl.presentation.newsfeed_backstage.NewsfeedBackstageBroadcastEventsListener$receiver$1
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Set<String> keySet;
            Object obj;
            Set<String> keySet2;
            Object obj2;
            NewsEntry a;
            Bundle extras;
            UserId userId;
            Bundle extras2;
            Image image;
            uc60 uc60Var = uc60.this;
            ie8 ie8Var = uc60Var.a;
            String action = intent != null ? intent.getAction() : null;
            if (action != null) {
                int hashCode = action.hashCode();
                Map map = jgp.b;
                switch (hashCode) {
                    case -1193807061:
                        if (action.equals("com.vkontakte.android.ACTION_AD_SAVE_SELECTED_BLS_ANSWERS")) {
                            NewsEntry a2 = uc60Var.a(intent);
                            if (a2 instanceof MyTargetNativeAdEntry) {
                                uc60Var.b().clear();
                                Bundle extras3 = intent.getExtras();
                                Bundle bundle = extras3 != null ? extras3.getBundle("ad_bls_result") : null;
                                if (bundle != null && (keySet = bundle.keySet()) != null) {
                                    Set<String> set = keySet;
                                    int e = on00.e(c5g.u(set, 10));
                                    map = new LinkedHashMap(e >= 16 ? e : 16);
                                    for (Object obj3 : set) {
                                        ArrayList<String> stringArrayList = bundle.getStringArrayList((String) obj3);
                                        if (stringArrayList == null || (obj = j5g.S0(stringArrayList)) == null) {
                                            obj = EmptySet.b;
                                        }
                                        map.put(obj3, obj);
                                    }
                                }
                                ie8Var.invoke(new ds60.b(new NewsfeedExternalAction.c.InterfaceC1439c.e((MyTargetNativeAdEntry) a2, map)));
                                return;
                            }
                            return;
                        }
                        return;
                    case -611648706:
                        if (!action.equals("com.vkontakte.android.ACTION_FRIEND_STATUS_CHANGED")) {
                            return;
                        }
                        break;
                    case -503268947:
                        if (action.equals("com.vkontakte.android.AD_HANDLE_BLS_RESULT")) {
                            NewsEntry a3 = uc60Var.a(intent);
                            if (a3 instanceof MyTargetNativeAdEntry) {
                                uc60Var.b().clear();
                                Bundle extras4 = intent.getExtras();
                                Bundle bundle2 = extras4 != null ? extras4.getBundle("ad_bls_result") : null;
                                if (bundle2 != null && (keySet2 = bundle2.keySet()) != null) {
                                    Set<String> set2 = keySet2;
                                    int e2 = on00.e(c5g.u(set2, 10));
                                    map = new LinkedHashMap(e2 >= 16 ? e2 : 16);
                                    for (Object obj4 : set2) {
                                        ArrayList<String> stringArrayList2 = bundle2.getStringArrayList((String) obj4);
                                        if (stringArrayList2 == null || (obj2 = j5g.S0(stringArrayList2)) == null) {
                                            obj2 = EmptySet.b;
                                        }
                                        map.put(obj4, obj2);
                                    }
                                }
                                ie8Var.invoke(new ds60.b(new NewsfeedExternalAction.c.InterfaceC1439c.a(a3, map)));
                                return;
                            }
                            return;
                        }
                        return;
                    case -168436264:
                        if (action.equals("com.vkontakte.android.AD_HANDLE_BLS_CLICK")) {
                            NewsEntry a4 = uc60Var.a(intent);
                            if (a4 instanceof MyTargetNativeAdEntry) {
                                uc60Var.b().clear();
                                if (context != null) {
                                    ie8Var.invoke(new ds60.b(new NewsfeedExternalAction.c.InterfaceC1439c.b(new View(context), a4)));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    case -42973149:
                        if (action.equals("com.vkontakte.android.AD_REPORT_CANCELLED") && (a = uc60Var.a(intent)) != null) {
                            uc60Var.b().clear();
                            ie8Var.invoke(new ds60.b(new NewsfeedExternalAction.c.d(a)));
                            return;
                        }
                        return;
                    case 333377586:
                        if (!action.equals("com.vkontakte.android.USER_PHOTO_CHANGED") || (extras = intent.getExtras()) == null || (userId = (UserId) extras.getParcelable("id")) == null || (extras2 = intent.getExtras()) == null || (image = (Image) extras2.getParcelable("image")) == null || !userId.equals(((BridgeComponent) uc60Var.b.getValue()).s().c())) {
                            return;
                        }
                        ie8Var.invoke(new ds60.h.b(userId, image));
                        return;
                    case 1398742544:
                        if (action.equals("com.vkontakte.android.AD_REPORTED")) {
                            Bundle extras5 = intent.getExtras();
                            String string = extras5 != null ? extras5.getString("adchoice_option_text") : null;
                            NewsEntry a5 = uc60Var.a(intent);
                            if (a5 != null) {
                                uc60Var.b().clear();
                                if (string != null) {
                                    ie8Var.invoke(new ds60.b(new NewsfeedExternalAction.c.y(string, a5)));
                                    return;
                                } else {
                                    ie8Var.invoke(new ds60.b(new NewsfeedExternalAction.c.r(a5)));
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    case 1832049201:
                        if (!action.equals("com.vkontakte.android.ACTION_GROUP_STATUS_CHANGED")) {
                            return;
                        }
                        break;
                    default:
                        return;
                }
                UserId userId2 = (UserId) intent.getParcelableExtra("id");
                if (userId2 == null) {
                    return;
                }
                Bundle extras6 = intent.getExtras();
                Integer valueOf = extras6 != null ? Integer.valueOf(extras6.getInt("status")) : null;
                if (valueOf != null) {
                    ie8Var.invoke(new ds60.h.a(userId2, valueOf.intValue()));
                }
            }
        }
    };

    /* JADX WARN: Type inference failed for: r2v3, types: [com.vk.newsfeed.impl.presentation.newsfeed_backstage.NewsfeedBackstageBroadcastEventsListener$receiver$1] */
    public uc60(ie8 ie8Var, h7m h7mVar) {
        this.a = ie8Var;
        this.b = new bpn0(new lnh(h7mVar, 1));
        this.c = new bpn0(new mnh(h7mVar, 1));
    }

    public final NewsEntry a(Intent intent) {
        MoneyFeatures moneyFeatures = MoneyFeatures.FEATURE_MONEY_AD_CHOICES_ENTRY_HASH;
        moneyFeatures.getClass();
        if (com.vk.toggle.b.A.a(moneyFeatures)) {
            Bundle extras = intent.getExtras();
            return b().c(extras != null ? Integer.valueOf(extras.getInt("ad_entry_hash")) : null);
        }
        Bundle extras2 = intent.getExtras();
        if (extras2 != null) {
            return (NewsEntry) extras2.getParcelable("ad_entry");
        }
        return null;
    }

    public final r5g0 b() {
        return (r5g0) this.c.getValue();
    }
}
