package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;
import com.vk.dto.money.CardTransferMethod;
import com.vk.dto.money.MoneyReceiverInfo;
import com.vk.dto.money.SbpTransferMethod;
import com.vk.dto.money.VkPayTransferMethod;
import com.vk.money.createtransfer.people.ReceiverType;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* compiled from: AccessibilityManagerDelegate.kt */
/* loaded from: classes7.dex */
public final class nl implements gz20, LevelPlayInterstitialAdListener, i7f0 {
    public Object b;

    public /* synthetic */ nl(Object obj, boolean z) {
        this.b = obj;
    }

    public MoneyReceiverInfo a() {
        CardTransferMethod c = c();
        Object obj = null;
        if (c == null) {
            return null;
        }
        Iterator<T> it = c.g.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((MoneyReceiverInfo) next).j == ReceiverType.Card2Card.h()) {
                obj = next;
                break;
            }
        }
        return (MoneyReceiverInfo) obj;
    }

    public MoneyReceiverInfo b() {
        CardTransferMethod c = c();
        Object obj = null;
        if (c == null) {
            return null;
        }
        Iterator<T> it = c.g.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((MoneyReceiverInfo) next).j == ReceiverType.Card2VkPay.h()) {
                obj = next;
                break;
            }
        }
        return (MoneyReceiverInfo) obj;
    }

    public CardTransferMethod c() {
        Object obj;
        Iterator it = ((List) this.b).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (obj instanceof CardTransferMethod) {
                break;
            }
        }
        return (CardTransferMethod) (obj instanceof CardTransferMethod ? obj : null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public Drawable d(Context context, String str) {
        try {
            Integer num = (Integer) this.b.get(str);
            return m33.a(num != null ? num.intValue() : 0, context);
        } catch (Exception unused) {
            return null;
        }
    }

    public io.reactivex.rxjava3.core.x e(int i) {
        return rsg0.W(new srt(i, "0"), 7);
    }

    public MoneyReceiverInfo f() {
        Object obj;
        Object obj2;
        Iterator it = ((List) this.b).iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (obj2 instanceof SbpTransferMethod) {
                break;
            }
        }
        if (!(obj2 instanceof SbpTransferMethod)) {
            obj2 = null;
        }
        SbpTransferMethod sbpTransferMethod = (SbpTransferMethod) obj2;
        if (sbpTransferMethod == null) {
            return null;
        }
        Iterator<T> it2 = sbpTransferMethod.g.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((MoneyReceiverInfo) next).j == ReceiverType.Sbp2Sbp.h()) {
                obj = next;
                break;
            }
        }
        return (MoneyReceiverInfo) obj;
    }

    public VkPayTransferMethod g() {
        Object obj;
        Iterator it = ((List) this.b).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (obj instanceof VkPayTransferMethod) {
                break;
            }
        }
        return (VkPayTransferMethod) (obj instanceof VkPayTransferMethod ? obj : null);
    }

    @Override // xsna.i7f0
    public Object getValue(Object obj, qcy qcyVar) {
        return ((WeakReference) this.b).get();
    }

    public void h(String str) {
        if (str.length() == 0) {
            return;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) ((Context) this.b).getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(16384);
            obtain.getText().add(str);
            accessibilityManager.sendAccessibilityEvent(obtain);
        }
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdClicked(LevelPlayAdInfo levelPlayAdInfo) {
        ((n2z) this.b).e();
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdClosed(LevelPlayAdInfo levelPlayAdInfo) {
        ((n2z) this.b).f();
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdDisplayFailed(LevelPlayAdError levelPlayAdError, LevelPlayAdInfo levelPlayAdInfo) {
        ((n2z) this.b).h(levelPlayAdError.getErrorCode(), levelPlayAdError.getErrorMessage());
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo) {
        n2z n2zVar = (n2z) this.b;
        n2zVar.a(levelPlayAdInfo.getAdNetwork(), String.valueOf(levelPlayAdInfo.getRevenue()));
        n2zVar.g();
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdLoadFailed(LevelPlayAdError levelPlayAdError) {
        ((n2z) this.b).c(levelPlayAdError.getErrorCode(), levelPlayAdError.getErrorMessage());
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo) {
        ((n2z) this.b).b();
    }

    @Override // xsna.gz20
    public void onCancel() {
        u76 u76Var = ((p5m0) this.b).b;
        u76Var.o5().h();
        u76Var.i4();
    }

    public nl() {
        this.b = pn00.k(new Pair("services_menu_friends", Integer.valueOf(R.drawable.vk_icon_services_menu_friends_56)), new Pair("services_menu_communities", Integer.valueOf(R.drawable.vk_icon_services_menu_communities_56)), new Pair("services_menu_music", Integer.valueOf(R.drawable.vk_icon_services_menu_music_56)), new Pair("services_menu_video", Integer.valueOf(R.drawable.vk_icon_services_menu_video_56)), new Pair("services_menu_clips", Integer.valueOf(R.drawable.vk_icon_services_menu_clips_56)), new Pair("services_menu_games", Integer.valueOf(R.drawable.vk_icon_services_menu_games_56)), new Pair("services_menu_stickers", Integer.valueOf(R.drawable.vk_icon_services_menu_stickers_56)), new Pair("services_menu_market", Integer.valueOf(R.drawable.vk_icon_services_menu_market_56)), new Pair("services_menu_steps", Integer.valueOf(R.drawable.vk_icon_services_menu_steps_56)), new Pair("services_menu_fitnes", Integer.valueOf(R.drawable.vk_icon_services_menu_fitnes_56)), new Pair("services_menu_dating", Integer.valueOf(R.drawable.vk_icon_services_menu_dating_56)), new Pair("services_menu_bookmarks", Integer.valueOf(R.drawable.vk_icon_services_menu_bookmarks_56)), new Pair("services_menu_afisha", Integer.valueOf(R.drawable.vk_icon_services_menu_afisha_56)), new Pair("services_menu_photo", Integer.valueOf(R.drawable.vk_icon_services_menu_photo_56)), new Pair("services_menu_pets", Integer.valueOf(R.drawable.vk_icon_services_menu_pets_56)), new Pair("services_menu_sport", Integer.valueOf(R.drawable.vk_icon_services_menu_sport_56)), new Pair("services_menu_run", Integer.valueOf(R.drawable.vk_icon_services_menu_run_56)), new Pair("services_menu_ads", Integer.valueOf(R.drawable.vk_icon_services_menu_ads_56)), new Pair("services_menu_calls", Integer.valueOf(R.drawable.vk_icon_services_menu_calls_56)), new Pair("services_menu_checkback", Integer.valueOf(R.drawable.vk_icon_services_menu_checkback_56)), new Pair("services_menu_deepfake", Integer.valueOf(R.drawable.vk_icon_services_menu_deepfake_56)), new Pair("services_menu_finance", Integer.valueOf(R.drawable.vk_icon_services_menu_finance_56)), new Pair("services_menu_health", Integer.valueOf(R.drawable.vk_icon_services_menu_health_56)), new Pair("services_menu_live", Integer.valueOf(R.drawable.vk_icon_services_menu_live_56)), new Pair("services_menu_mail", Integer.valueOf(R.drawable.vk_icon_services_menu_mail_56)), new Pair("services_menu_share", Integer.valueOf(R.drawable.vk_icon_services_menu_share_56)), new Pair("services_menu_superup", Integer.valueOf(R.drawable.vk_icon_services_menu_superup_56)), new Pair("services_menu_weather", Integer.valueOf(R.drawable.vk_icon_services_menu_weather_56)), new Pair("services_menu_woman_health", Integer.valueOf(R.drawable.vk_icon_services_menu_woman_health_56)), new Pair("services_menu_settings", Integer.valueOf(R.drawable.vk_icon_services_menu_settings_56)));
    }

    public nl(Object obj) {
        this.b = new WeakReference(obj);
    }
}
