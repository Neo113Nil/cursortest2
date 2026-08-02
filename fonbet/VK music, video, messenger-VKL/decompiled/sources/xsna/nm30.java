package xsna;

import android.util.Size;
import androidx.fragment.app.FragmentActivity;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.log.L;
import com.vk.profile.core.content.ContentTab;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.protocol.RtcCommandExecutor;
import ru.ok.android.webrtc.protocol.RtcFormat;
import xsna.atq0;
import xsna.h7u0;
import xsna.ikv0;
import xsna.tlo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class nm30 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ nm30(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0139, code lost:
    
        if (r3 != 24) goto L68;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        Integer num;
        switch (this.b) {
            case 0:
                ((vm30) this.c).B((MsgFromUser) this.d, (fm20) this.e);
                return;
            case 1:
                atq0 atq0Var = (atq0) this.c;
                btq0 btq0Var = (btq0) this.d;
                FragmentActivity fragmentActivity = (FragmentActivity) this.e;
                if (epx.f(atq0Var, atq0.c.b.a)) {
                    cvk.u(R.string.user_profile_add_friend_accepted, false);
                    return;
                }
                if (epx.f(atq0Var, atq0.c.C2572c.a)) {
                    cvk.u(R.string.user_profile_add_friend_already_sent, false);
                    return;
                }
                if (epx.f(atq0Var, atq0.c.d.a)) {
                    zvm0.k(btq0Var.a.T(), fragmentActivity, null, false, false, 12);
                    return;
                }
                if (epx.f(atq0Var, atq0.c.e.a)) {
                    btq0.b(fragmentActivity, fragmentActivity.getString(R.string.user_profile_started_following));
                    return;
                }
                if (epx.f(atq0Var, atq0.c.a.a)) {
                    cvk.u(R.string.user_profile_friendship_success, false);
                    return;
                }
                if (atq0Var instanceof atq0.f) {
                    atq0.f fVar = (atq0.f) atq0Var;
                    String str = fVar.b;
                    boolean z = fVar.d;
                    if (str != null) {
                        cvk.w(str, z);
                    }
                    Integer num2 = fVar.a;
                    if (num2 != null) {
                        cvk.u(num2.intValue(), z);
                    }
                    Throwable th = fVar.c;
                    if (th != null) {
                        h03.b(th);
                        return;
                    }
                    return;
                }
                if (atq0Var instanceof atq0.b) {
                    Throwable th2 = ((atq0.b) atq0Var).a;
                    String g = j03.g(fragmentActivity, th2, R.string.error);
                    if (th2 instanceof VKApiExecutionException) {
                        List<VKApiExecutionException> v = ((VKApiExecutionException) th2).v();
                        int s = ((VKApiExecutionException) ((v == null || v.isEmpty()) ? th2 : v.get(0))).s();
                        if (s != 14) {
                            if (s == 15) {
                                g = fragmentActivity.getString(R.string.user_profile_page_blacklist);
                            } else if (s != 17) {
                                break;
                            }
                        }
                        L.i(th2);
                        return;
                    }
                    h7u0.a aVar = new h7u0.a(fragmentActivity);
                    aVar.g0(R.string.error);
                    aVar.a.f = g;
                    aVar.c0(R.string.vk_ok, null);
                    aVar.m();
                    return;
                }
                if (!(atq0Var instanceof atq0.d)) {
                    if (!(atq0Var instanceof atq0.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    atq0.e eVar = (atq0.e) atq0Var;
                    ContentTab contentTab = eVar.b;
                    boolean z2 = eVar.d;
                    boolean z3 = eVar.c;
                    if (contentTab.d() == null) {
                        return;
                    }
                    String string = fragmentActivity.getString(eVar.b.d().intValue());
                    if (eVar.a) {
                        num = (z3 && z2) ? Integer.valueOf(R.string.user_profile_tab_pinned_privacy_mobile_subtitle) : z3 ? Integer.valueOf(R.string.user_profile_tab_pinned_privacy_subtitle) : z2 ? Integer.valueOf(R.string.user_profile_tab_pinned_mobile) : null;
                        i = z3 ? R.string.user_profile_tab_pinned_privacy : R.string.user_profile_tab_pinned;
                    } else {
                        i = R.string.user_profile_tab_un_pinned;
                        num = null;
                    }
                    if (num == null) {
                        btq0.b(fragmentActivity, fragmentActivity.getString(i, string));
                        return;
                    }
                    String string2 = fragmentActivity.getString(i, string);
                    String string3 = fragmentActivity.getString(num.intValue());
                    ikv0.a aVar2 = new ikv0.a(fragmentActivity);
                    aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_on_24, Integer.valueOf(R.attr.vk_ui_icon_accent), (Size) null, 12);
                    aVar2.u = new ikv0.d(string2, string3, (ikv0.d.a) null, 4);
                    aVar2.n();
                    return;
                }
                atq0.d dVar = (atq0.d) atq0Var;
                ikv0.a aVar3 = new ikv0.a(fragmentActivity);
                Integer num3 = dVar.d;
                if (num3 != null) {
                    aVar3.t = new ikv0.c.C3058c(num3.intValue(), Integer.valueOf(dVar.e), (Size) null, 12);
                }
                String str2 = dVar.b;
                if (str2 != null) {
                    aVar3.u = new ikv0.d(str2, (String) null, (ikv0.d.a) null, 6);
                }
                Integer num4 = dVar.a;
                if (num4 != null) {
                    aVar3.u = new ikv0.d(fragmentActivity.getString(num4.intValue()), (String) null, (ikv0.d.a) null, 6);
                }
                tlo0 tlo0Var = dVar.c;
                if (tlo0Var != null) {
                    CharSequence a = tlo0Var.a(fragmentActivity);
                    aVar3.u = new ikv0.d(a != null ? a.toString() : null, (String) null, (ikv0.d.a) null, 6);
                }
                atq0.a aVar4 = dVar.h;
                if (aVar4 != null) {
                    aVar3.u = new ikv0.d(tlo0.b.a(aVar4.a, fragmentActivity).toString(), (String) null, new ikv0.d.a(tlo0.b.a(aVar4.b, fragmentActivity).toString(), null, new r5i0(7, btq0Var, aVar4), Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), 2);
                }
                Integer num5 = dVar.f;
                izs<ikv0, s3q0> izsVar = dVar.g;
                if (num5 != null && izsVar != null) {
                    aVar3.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, fragmentActivity.getString(num5.intValue()), izsVar);
                }
                btq0Var.d = new WeakReference<>(aVar3.n());
                return;
            case 2:
                zwy0 zwy0Var = (zwy0) this.c;
                byte[] bArr = (byte[]) this.d;
                RtcFormat rtcFormat = (RtcFormat) this.e;
                Iterator it = zwy0Var.b.iterator();
                while (it.hasNext()) {
                    try {
                        ((RtcCommandExecutor.Listener) it.next()).onRtcDataReceived(bArr, rtcFormat);
                    } catch (Throwable th3) {
                        zwy0Var.a.reportException("CallsListeners", "rtc.command.handle.listeners.ondatareceive", th3);
                    }
                }
                return;
            default:
                try {
                    if (new cgz0().d((String) this.e, r4z0.a((String) this.c, (ArrayList) this.d).toString(), null).a) {
                        gu8.c(null, "InternalNativeAdSurveyUtils: Survey's result has been sent");
                    } else {
                        gu8.e(null, "InternalNativeAdSurveyUtils: Survey's result hasn't been sent");
                    }
                    return;
                } catch (Throwable unused) {
                    gu8.e(null, "InternalNativeAdSurveyUtils: can't create json for the survey");
                    return;
                }
        }
    }
}
