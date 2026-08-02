package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ShortcutManager;
import android.os.SystemClock;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.SpecialEffectsController;
import androidx.fragment.app.b;
import com.ironsource.Ya;
import com.unity3d.mediation.LevelPlayAdError;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.sync.SyncStopCause;
import com.vk.log.L;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.ShortcutManagerWrapper;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl;
import ru.ok.android.webrtc.listeners.CallSessionRoomsListener;
import ru.ok.android.webrtc.protocol.RtcTransport;
import ru.ok.android.webrtc.protocol.impl.notifications.RtcNotificationReceiverImpl;
import xsna.hlw;
import xsna.tvw0;
import xsna.uvw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class wq8 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wq8(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:42|43|(1:45)(1:69)|46|(3:48|(1:50)(1:67)|(11:52|53|54|55|56|(5:60|61|62|(4:18|(2:20|(3:22|(2:26|27)|31)(3:32|(2:34|27)|31))(3:35|(2:37|27)|31)|28|(1:30))|(1:41)(2:39|40))|64|61|62|(0)|(0)(0)))|68|53|54|55|56|(5:60|61|62|(0)|(0)(0))|64|61|62|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x008c, code lost:
    
        r5 = new org.json.JSONObject();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        uvw0.a aVar;
        MobileOfficialAppsCallsStat$TypeVoipCallItem.Source source;
        MobileOfficialAppsCallsStat$TypeVoipCallItem.Source source2;
        JSONObject optJSONObject;
        String str;
        boolean has;
        boolean z;
        switch (this.b) {
            case 0:
                wh50 wh50Var = (wh50) this.c;
                VkButton vkButton = (VkButton) this.d;
                wh50Var.setValue(Boolean.FALSE);
                vkButton.setLoading(false);
                return;
            case 1:
                SpecialEffectsController.Operation operation = (SpecialEffectsController.Operation) this.c;
                b.g gVar = (b.g) this.d;
                if (FragmentManager.P(2)) {
                    operation.toString();
                }
                operation.c(gVar);
                return;
            case 2:
                ((s2w) this.c).g((SyncStopCause) this.d);
                return;
            case 3:
                pi20 pi20Var = (pi20) this.c;
                hlw.a aVar2 = (hlw.a) this.d;
                pi20Var.getClass();
                aVar2.d(pi20Var);
                return;
            case 4:
                ((RtcNotificationReceiverImpl) this.c).a((RtcTransport) this.d);
                return;
            case 5:
                SessionRoomListenerManagerImpl.onRoomUpdated$lambda$0((SessionRoomListenerManagerImpl) this.c, (CallSessionRoomsListener.UpdatedParams) this.d);
                return;
            case 6:
                Context context = (Context) this.c;
                ShortcutManagerWrapper.ShortcutCategory shortcutCategory = (ShortcutManagerWrapper.ShortcutCategory) this.d;
                a1w a1wVar = q1w.a;
                if (a1wVar == null) {
                    a1wVar = null;
                }
                if (a1wVar.u()) {
                    ShortcutManagerWrapper shortcutManagerWrapper = ShortcutManagerWrapper.a;
                    try {
                        final int size = bhj0.c(context).size();
                        int maxShortcutCountPerActivity = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
                        if (maxShortcutCountPerActivity <= 0) {
                            maxShortcutCountPerActivity = 5;
                        }
                        final ArrayList arrayList = new ArrayList();
                        if (!(shortcutCategory == ShortcutManagerWrapper.ShortcutCategory.VKME)) {
                            if (!BuildInfo.i()) {
                                if (BuildInfo.h()) {
                                }
                                arrayList.add(ShortcutManagerWrapper.d(context));
                                arrayList.add(ShortcutManagerWrapper.b(context, shortcutCategory));
                            }
                            o2l.a.getClass();
                            if (o2l.f()) {
                                arrayList.add(ShortcutManagerWrapper.a(context, shortcutCategory));
                            }
                            arrayList.add(ShortcutManagerWrapper.d(context));
                            arrayList.add(ShortcutManagerWrapper.b(context, shortcutCategory));
                        }
                        final ArrayList c = shortcutManagerWrapper.c(context, maxShortcutCountPerActivity - arrayList.size(), Source.ACTUAL, true, shortcutCategory);
                        arrayList.addAll(c);
                        bhj0.m(context, arrayList);
                        StringBuilder sb = new StringBuilder();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            zgj0 zgj0Var = (zgj0) it.next();
                            sb.append(zgj0Var.b + " / " + ((Object) zgj0Var.f) + '\n');
                        }
                        final String sb2 = sb.toString();
                        L.c("updateShortcuts", new gzs() { // from class: xsna.chj0
                            @Override // xsna.gzs
                            public final Object invoke() {
                                StringBuilder b = ji.b(size, "shortcuts: was ", " - added ");
                                b.append(arrayList.size());
                                b.append(" (including ");
                                b.append(c.size());
                                b.append(" for direct sharing)\n");
                                b.append(sb2);
                                return b.toString();
                            }
                        });
                    } catch (InterruptedException e) {
                        throw e;
                    } catch (Exception e2) {
                        com.vk.metrics.eventtracking.b.a.a(e2);
                    }
                }
                ShortcutManagerWrapper.d = null;
                return;
            case 7:
                uan0 uan0Var = (uan0) this.c;
                zan0 zan0Var = (zan0) this.d;
                try {
                    AtomicLong atomicLong = uan0Var.h;
                    long j = atomicLong.get();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    try {
                        Thread.sleep(j);
                        atomicLong.set(0L);
                        zan0Var.b();
                        return;
                    } catch (InterruptedException e3) {
                        atomicLong.set(Math.max(0L, j - (SystemClock.elapsedRealtime() - elapsedRealtime)));
                        throw e3;
                    }
                } catch (Throwable th) {
                    if ((th instanceof InterruptedException) || Thread.interrupted()) {
                        return;
                    }
                    com.vk.metrics.eventtracking.b.a.q(new RuntimeException("Unhandled exception during queue sync process", th));
                    return;
                }
            case 8:
                uvw0 uvw0Var = (uvw0) this.c;
                tvw0.a aVar3 = (tvw0.a) this.d;
                uvw0Var.getClass();
                JSONObject jSONObject = aVar3.a;
                MobileOfficialAppsCallsStat$TypeVoipCallItem mobileOfficialAppsCallsStat$TypeVoipCallItem = null;
                try {
                    optJSONObject = jSONObject.optJSONObject("body");
                } catch (JSONException unused) {
                }
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("call_id");
                    String str2 = optString == null ? "" : optString;
                    String D = f370.D(optJSONObject, "from_id");
                    if (D == null) {
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("caller_info");
                        D = optJSONObject2 != null ? optJSONObject2.optString("user_id") : null;
                        if (D == null) {
                            str = "";
                            has = jSONObject.has("chat_info");
                            JSONObject jSONObject2 = new JSONObject(optJSONObject.optString("payload"));
                            boolean optBoolean = jSONObject2.optBoolean("join_by_link");
                            if (!has && !optBoolean) {
                                z = false;
                                aVar = new uvw0.a(z, str2, str, f370.z(optJSONObject, "notification_id"), f370.x(optJSONObject, "notification_try_id"));
                                if (aVar != null) {
                                    String str3 = aVar3.b;
                                    int hashCode = str3.hashCode();
                                    if (hashCode == -2073575365) {
                                        if (str3.equals("longpoll")) {
                                            source = MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.LONGPOLL;
                                            source2 = source;
                                        }
                                        source2 = null;
                                    } else if (hashCode != 107944209) {
                                        if (hashCode == 236635739 && str3.equals("pushservice")) {
                                            source = MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.PUSH;
                                            source2 = source;
                                        }
                                        source2 = null;
                                    } else {
                                        if (str3.equals("queue")) {
                                            source = MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.QUEUE;
                                            source2 = source;
                                        }
                                        source2 = null;
                                    }
                                    L.e("VoipPushStatistics", "source: " + source2 + ", call info: " + aVar);
                                    if (aVar.e != null) {
                                        mobileOfficialAppsCallsStat$TypeVoipCallItem = new MobileOfficialAppsCallsStat$TypeVoipCallItem(MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.CALL_NOTIFICATION_RECEIVED, String.valueOf(System.currentTimeMillis() * 1000), aVar.b, aVar.c, "calls_v2", aVar.a, source2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, aVar.d, aVar.e, null, -128, Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE, null);
                                    }
                                }
                                if (mobileOfficialAppsCallsStat$TypeVoipCallItem == null) {
                                    return;
                                }
                                new znw0(MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, mobileOfficialAppsCallsStat$TypeVoipCallItem).q();
                                return;
                            }
                            z = true;
                            aVar = new uvw0.a(z, str2, str, f370.z(optJSONObject, "notification_id"), f370.x(optJSONObject, "notification_try_id"));
                            if (aVar != null) {
                            }
                            if (mobileOfficialAppsCallsStat$TypeVoipCallItem == null) {
                            }
                        }
                    }
                    str = D;
                    has = jSONObject.has("chat_info");
                    JSONObject jSONObject22 = new JSONObject(optJSONObject.optString("payload"));
                    boolean optBoolean2 = jSONObject22.optBoolean("join_by_link");
                    if (!has) {
                        z = false;
                        aVar = new uvw0.a(z, str2, str, f370.z(optJSONObject, "notification_id"), f370.x(optJSONObject, "notification_try_id"));
                        if (aVar != null) {
                        }
                        if (mobileOfficialAppsCallsStat$TypeVoipCallItem == null) {
                        }
                    }
                    z = true;
                    aVar = new uvw0.a(z, str2, str, f370.z(optJSONObject, "notification_id"), f370.x(optJSONObject, "notification_try_id"));
                    if (aVar != null) {
                    }
                    if (mobileOfficialAppsCallsStat$TypeVoipCallItem == null) {
                    }
                }
                aVar = null;
                if (aVar != null) {
                }
                if (mobileOfficialAppsCallsStat$TypeVoipCallItem == null) {
                }
                break;
            case 9:
                Ya.c((Ya) this.c, (LevelPlayAdError) this.d);
                return;
            case 10:
                ((yads.cl) this.c).d((Exception) this.d);
                return;
            case 11:
                yads.es2.a((yads.es2) this.c, (Activity) this.d);
                return;
            default:
                yads.wl2.a((yads.n7) this.c, (yads.wl2) this.d);
                return;
        }
    }
}
