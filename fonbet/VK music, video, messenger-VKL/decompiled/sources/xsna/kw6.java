package xsna;

import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.C4436m6;
import com.ironsource.Ya;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.vk.billing.GoogleStorePurchasesManagerImpl;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.fullscreen.promo.core.PromoSessionInfo;
import com.vk.im.engine.models.SearchMode;
import com.vk.log.L;
import com.vk.permission.PermissionHelper;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimelineEvent;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimelineEventRenderingError;
import com.vk.voip.call_effects.beauty.BeautyFilterIntensity;
import java.util.LinkedHashSet;
import java.util.UUID;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class kw6 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kw6(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0173, code lost:
    
        if (r1 != false) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object[] objArr;
        switch (this.b) {
            case 0:
                qaj0.c(((iw6) ((ofy0) this.c).c).a(), "intensity", Integer.valueOf(((BeautyFilterIntensity) this.d).h()));
                break;
            case 1:
                x9j x9jVar = (x9j) this.c;
                PromoSessionInfo promoSessionInfo = (PromoSessionInfo) this.d;
                int i = 1;
                try {
                    x9j.b();
                    x9j.c();
                    Context context = e43.a;
                    Context context2 = context != null ? context : null;
                    ky6 j = Preference.j();
                    PermissionHelper.a.getClass();
                    int i2 = 0;
                    if (!PermissionHelper.n(context2)) {
                        if (!x9j.d && !j.getBoolean("__contact_sync_perm_modal_dismissed__", false)) {
                            if ((j.getInt("__contact_sync_cold_start_any_modal_version__", 0) >= BuildInfo.e) != false) {
                            }
                            x9jVar.c.post(new v9j(i2, x9jVar, promoSessionInfo));
                            break;
                        }
                        x9jVar.c.post(new w9j(i2, x9jVar, promoSessionInfo));
                        break;
                    } else {
                        if (!x9j.e && !j.getBoolean("__contact_sync_share_modal_dismissed__", false)) {
                            if (j.getInt("__contact_sync_cold_start_any_modal_version__", 0) < BuildInfo.e) {
                                objArr = false;
                                break;
                            } else {
                                objArr = true;
                                break;
                            }
                        }
                        x9jVar.c.post(new w9j(i2, x9jVar, promoSessionInfo));
                    }
                } catch (Exception e) {
                    L.j(e, "Error checking contact sync prompt");
                    x9jVar.c.post(new qye(i, x9jVar, promoSessionInfo));
                    return;
                }
                break;
            case 2:
                iwq iwqVar = (iwq) this.c;
                Throwable th = (Throwable) this.d;
                LinkedHashSet linkedHashSet = iwqVar.u;
                if (!linkedHashSet.contains(th)) {
                    linkedHashSet.add(th);
                    iwqVar.r.add(MobileOfficialAppsFeedStat$FeedTimelineEvent.a.a(new MobileOfficialAppsFeedStat$FeedTimelineEventRenderingError(iwqVar.u(th))));
                    break;
                }
                break;
            case 3:
                ((GoogleStorePurchasesManagerImpl.b) this.c).a.c((mge0) this.d);
                break;
            case 4:
                ((p600) this.c).b.remove((FunctionReferenceImpl) this.d);
                break;
            case 5:
                ((rw30) this.c).b1().c((SearchMode) this.d);
                break;
            case 6:
                e840 e840Var = (e840) this.c;
                Exception exc = (Exception) this.d;
                e840Var.e.a(exc instanceof VideoFrameProcessingException ? (VideoFrameProcessingException) exc : VideoFrameProcessingException.a(C.TIME_UNSET, exc));
                break;
            case 7:
                ((com.vk.core.simplescreen.a) this.c).b((em6) ((s4p) this.d));
                break;
            case 8:
                RecyclerView recyclerView = (RecyclerView) this.c;
                fdf0 fdf0Var = (fdf0) this.d;
                fdf0Var.j.postDelayed(new r0a(fdf0Var, recyclerView, (LinearLayoutManager) recyclerView.getLayoutManager(), 8), 400L);
                break;
            case 9:
                v3l0 v3l0Var = (v3l0) this.c;
                n4m0 n4m0Var = (n4m0) this.d;
                ViewGroup viewGroup = n4m0Var.j;
                v3l0Var.a(viewGroup != null ? viewGroup : null);
                s4m0 s4m0Var = n4m0Var.n;
                if (s4m0Var != null) {
                    s4m0Var.b();
                    break;
                }
                break;
            case 10:
                chv0 chv0Var = (chv0) this.c;
                Intent intent = (Intent) this.d;
                fv1 fv1Var = chv0Var.a;
                String stringExtra = intent.getStringExtra("id");
                if (stringExtra == null) {
                    stringExtra = erm0.E0(4, UUID.randomUUID().toString());
                }
                fv1Var.getClass();
                fv1.b.remove(stringExtra);
                Preference preference = Preference.a;
                Preference.K(izi0.f(Preference.u(EmptySet.b, "by_version", "allowed_intent_ids_set"), stringExtra), "by_version", "allowed_intent_ids_set");
                break;
            case 11:
                Ya.b((Ya) this.c, (LevelPlayAdError) this.d);
                break;
            case 12:
                C4436m6.a((C4436m6) this.c, (LevelPlayAdInfo) this.d);
                break;
            default:
                ((com.ironsource.sdk.controller.v) this.c).k((String) this.d);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ kw6(p600 p600Var, izs izsVar) {
        this.b = 4;
        this.c = p600Var;
        this.d = (FunctionReferenceImpl) izsVar;
    }
}
