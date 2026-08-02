package xsna;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.google.zxing.pdf417.PDF417Common;
import com.vk.api.generated.users.dto.UsersCanNotCallReasonDto;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.messages.Msg;
import com.vk.voip.api.id.CallId;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.ok.android.externcalls.sdk.ConversationFactory;
import xsna.ap9;
import xsna.aw9;
import xsna.e49;
import xsna.fp9;
import xsna.gv30;
import xsna.khw0;
import xsna.kvp0;
import xsna.l1x0;
import xsna.l310;
import xsna.p410;
import xsna.t310;
import xsna.tdd0;
import xsna.wk50;
import xsna.zew0;
import xsna.zo9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class cp9 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ cp9(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0299  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i;
        Pair pair;
        Pair pair2;
        Dialog dialog;
        int i2 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i2) {
            case 0:
                yq1 yq1Var = (yq1) obj4;
                dp9 dp9Var = (dp9) obj3;
                khw0.a aVar = (khw0.a) obj2;
                ap9 ap9Var = (ap9) obj;
                if (epx.f(ap9Var, ap9.a.a)) {
                    yq1Var.invoke();
                } else {
                    if (!(ap9Var instanceof ap9.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ap9.b bVar = (ap9.b) ap9Var;
                    CallId callId = new CallId(ConversationFactory.generateConversationId());
                    c63 c63Var = c63.a;
                    Activity b = c63.b();
                    if (b instanceof AppCompatActivity) {
                        AppCompatActivity appCompatActivity = (AppCompatActivity) b;
                        gp9 gp9Var = bVar.a;
                        UsersCanNotCallReasonDto usersCanNotCallReasonDto = gp9Var.e;
                        Peer peer = gp9Var.a;
                        boolean a = appCompatActivity.getLifecycle().getCurrentState().a(Lifecycle.State.RESUMED);
                        Fragment H = appCompatActivity.getSupportFragmentManager().H("CanNotCallErrorDialog");
                        androidx.fragment.app.d dVar = H instanceof androidx.fragment.app.d ? (androidx.fragment.app.d) H : null;
                        boolean z = (dVar == null || (dialog = dVar.s) == null || !dialog.isShowing() || dVar.isRemoving()) ? false : true;
                        if (a || !z) {
                            int[] iArr = fp9.a.$EnumSwitchMapping$0;
                            if (iArr[usersCanNotCallReasonDto.ordinal()] == 1) {
                                boolean z2 = aVar.a.s;
                                int i3 = l1x0.k1;
                                new l1x0.a(appCompatActivity, peer, z2).I0("CanNotCallErrorDialog");
                            } else {
                                zew0.a aVar2 = zew0.k1;
                                String str = gp9Var.b;
                                int i4 = iArr[usersCanNotCallReasonDto.ordinal()];
                                int i5 = R.string.voip_error_privacy_title;
                                switch (i4) {
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                        String string = appCompatActivity.getString(i5, str);
                                        String str2 = gp9Var.c;
                                        boolean z3 = gp9Var.d;
                                        switch (iArr[usersCanNotCallReasonDto.ordinal()]) {
                                            case 1:
                                                pair = new Pair(Integer.valueOf(z3 ? R.string.voip_error_privacy_subtitle_f : R.string.voip_error_privacy_subtitle), str2);
                                                pair2 = pair;
                                                zew0.a.b(aVar2, appCompatActivity, R.drawable.vk_icon_phone_down_outline_56, R.attr.vk_ui_icon_secondary, string, appCompatActivity.getString(((Number) pair2.d()).intValue(), (String) pair2.g()), null, zew0.a.a(peer.b), null, false, 160).Td(appCompatActivity.getSupportFragmentManager(), "CanNotCallErrorDialog");
                                                break;
                                            case 2:
                                                pair2 = new Pair(Integer.valueOf(R.string.voip_error_dialog_call_yourself_subtitle), null);
                                                zew0.a.b(aVar2, appCompatActivity, R.drawable.vk_icon_phone_down_outline_56, R.attr.vk_ui_icon_secondary, string, appCompatActivity.getString(((Number) pair2.d()).intValue(), (String) pair2.g()), null, zew0.a.a(peer.b), null, false, 160).Td(appCompatActivity.getSupportFragmentManager(), "CanNotCallErrorDialog");
                                                break;
                                            case 3:
                                                pair = new Pair(Integer.valueOf(R.string.voip_error_dialog_call_self_service_subtitle), str2);
                                                pair2 = pair;
                                                zew0.a.b(aVar2, appCompatActivity, R.drawable.vk_icon_phone_down_outline_56, R.attr.vk_ui_icon_secondary, string, appCompatActivity.getString(((Number) pair2.d()).intValue(), (String) pair2.g()), null, zew0.a.a(peer.b), null, false, 160).Td(appCompatActivity.getSupportFragmentManager(), "CanNotCallErrorDialog");
                                                break;
                                            case 4:
                                                pair2 = new Pair(Integer.valueOf(R.string.voip_error_dialog_call_dead_user_subtitle), null);
                                                zew0.a.b(aVar2, appCompatActivity, R.drawable.vk_icon_phone_down_outline_56, R.attr.vk_ui_icon_secondary, string, appCompatActivity.getString(((Number) pair2.d()).intValue(), (String) pair2.g()), null, zew0.a.a(peer.b), null, false, 160).Td(appCompatActivity.getSupportFragmentManager(), "CanNotCallErrorDialog");
                                                break;
                                            case 5:
                                                pair2 = new Pair(Integer.valueOf(z3 ? R.string.voip_error_dialog_call_banned_user_subtitle_female : R.string.voip_error_dialog_call_banned_user_subtitle_male), str);
                                                zew0.a.b(aVar2, appCompatActivity, R.drawable.vk_icon_phone_down_outline_56, R.attr.vk_ui_icon_secondary, string, appCompatActivity.getString(((Number) pair2.d()).intValue(), (String) pair2.g()), null, zew0.a.a(peer.b), null, false, 160).Td(appCompatActivity.getSupportFragmentManager(), "CanNotCallErrorDialog");
                                                break;
                                            case 6:
                                                pair2 = new Pair(Integer.valueOf(z3 ? R.string.voip_error_dialog_call_deactivated_user_subtitle_female : R.string.voip_error_dialog_call_deactivated_user_subtitle_male), str);
                                                zew0.a.b(aVar2, appCompatActivity, R.drawable.vk_icon_phone_down_outline_56, R.attr.vk_ui_icon_secondary, string, appCompatActivity.getString(((Number) pair2.d()).intValue(), (String) pair2.g()), null, zew0.a.a(peer.b), null, false, 160).Td(appCompatActivity.getSupportFragmentManager(), "CanNotCallErrorDialog");
                                                break;
                                            case 7:
                                                pair2 = new Pair(Integer.valueOf(z3 ? R.string.voip_error_dialog_call_deleted_user_subtitle_female : R.string.voip_error_dialog_call_deleted_user_subtitle_male), str);
                                                zew0.a.b(aVar2, appCompatActivity, R.drawable.vk_icon_phone_down_outline_56, R.attr.vk_ui_icon_secondary, string, appCompatActivity.getString(((Number) pair2.d()).intValue(), (String) pair2.g()), null, zew0.a.a(peer.b), null, false, 160).Td(appCompatActivity.getSupportFragmentManager(), "CanNotCallErrorDialog");
                                                break;
                                            default:
                                                throw new NoWhenBranchMatchedException();
                                        }
                                    case 5:
                                        i5 = R.string.voip_error_can_not_call_reason_banned;
                                        String string2 = appCompatActivity.getString(i5, str);
                                        String str22 = gp9Var.c;
                                        boolean z32 = gp9Var.d;
                                        switch (iArr[usersCanNotCallReasonDto.ordinal()]) {
                                        }
                                    case 6:
                                        i5 = R.string.voip_error_can_not_call_reason_deactivated;
                                        String string22 = appCompatActivity.getString(i5, str);
                                        String str222 = gp9Var.c;
                                        boolean z322 = gp9Var.d;
                                        switch (iArr[usersCanNotCallReasonDto.ordinal()]) {
                                        }
                                    case 7:
                                        i5 = R.string.voip_error_can_not_call_reason_deleted;
                                        String string222 = appCompatActivity.getString(i5, str);
                                        String str2222 = gp9Var.c;
                                        boolean z3222 = gp9Var.d;
                                        switch (iArr[usersCanNotCallReasonDto.ordinal()]) {
                                        }
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                            }
                        }
                    }
                    UsersCanNotCallReasonDto usersCanNotCallReasonDto2 = bVar.a.e;
                    zo9 zo9Var = dp9Var.f;
                    zqk0 zqk0Var = aVar.a;
                    String valueOf = zqk0Var.i ? null : String.valueOf(zqk0Var.b);
                    pvw0 pvw0Var = dp9Var.b;
                    pvw0Var.h(new e49.n(zqk0Var.s, zqk0Var.i, Integer.valueOf(zqk0Var.h.size()), callId, aVar.b, valueOf));
                    zo9Var.getClass();
                    switch (zo9.a.$EnumSwitchMapping$0[usersCanNotCallReasonDto2.ordinal()]) {
                        case 1:
                            i = PDF417Common.MAX_CODEWORDS_IN_BARCODE;
                            break;
                        case 2:
                            i = -6;
                            break;
                        case 3:
                            i = -7;
                            break;
                        case 4:
                            i = -8;
                            break;
                        case 5:
                            i = -9;
                            break;
                        case 6:
                            i = -10;
                            break;
                        case 7:
                            i = -11;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    pvw0Var.D0(new e49.l(i, go9.b("vk_api:can_not_call:", usersCanNotCallReasonDto2.i()), zqk0Var.i, callId, aVar.b, valueOf));
                    if (bVar.a.e == UsersCanNotCallReasonDto.PRIVACY_SETTINGS) {
                        rd9 rd9Var = dp9Var.c;
                        String valueOf2 = String.valueOf(aVar.a.b);
                        rd9Var.getClass();
                        tfx tfxVar = new tfx("calls.callAttempt", new kr(9), new lr(8));
                        tfx.o(tfxVar, "callee_id", valueOf2, 0, 0, 12);
                        String str3 = callId.b;
                        if (str3 != null) {
                            tfx.o(tfxVar, "call_id", str3, 0, 0, 12);
                        }
                        dp9Var.e.b(io.reactivex.rxjava3.kotlin.c.f(4, rsg0.y0(yfb.x(tfxVar), null, null, 3), new y84(2), new la2(6), null));
                    }
                }
                return s3q0.a;
            case 1:
                z4c z4cVar = (z4c) obj4;
                z4cVar.T(new aw9.b((com.vk.ecomm.cart.impl.checkout.feature.state.f) obj3, false));
                z4cVar.c0((Throwable) obj, (r2c) obj2);
                return s3q0.a;
            case 2:
                byf byfVar = (byf) obj4;
                Msg msg = (Msg) obj3;
                com.vk.im.engine.models.dialogs.a aVar3 = (com.vk.im.engine.models.dialogs.a) obj2;
                xgl0 xgl0Var = (xgl0) obj;
                Peer peer2 = byfVar.d;
                w2w w2wVar = byfVar.c;
                int i6 = byfVar.e;
                d040 o = xgl0Var.o();
                lj30 y = o.y(i6, peer2);
                if (y == null) {
                    y = (lj30) o.e(i6, peer2.b).b;
                }
                if (y != null) {
                    xgl0Var.o().X(y.c, true);
                }
                if (msg == null) {
                    long j = peer2.b;
                    gv30.a aVar4 = new gv30.a();
                    aVar4.a = j;
                    aVar4.a();
                    aVar4.b();
                    aVar4.d = gkx0.d;
                    aVar4.a();
                    aVar4.c();
                    aVar4.f = gkx0.e;
                    new zd20(new gv30(aVar4), new utb(w2wVar.I0(), w2wVar.getExperiments()), false, false).a(w2wVar);
                } else {
                    new com.vk.im.engine.internal.merge.messages.b(byfVar.d, msg, false, true, 48).o(w2wVar);
                }
                new wfm(aVar3, null).o(w2wVar);
                return s3q0.a;
            case 3:
                wj50<t310> wj50Var = ((r210) obj4).b;
                wk50.a aVar5 = (wk50.a) obj3;
                x410 x410Var = (x410) obj2;
                String str4 = ((b4g0) obj).b;
                if (drm0.N(str4)) {
                    aVar5.b(p410.h.a.b);
                    wj50Var.b(new t310.d(EmptyList.b));
                    aVar5.a(l310.p.b);
                } else {
                    r210.e(aVar5, false, x410Var);
                    wj50Var.b(new t310.e(oq.d(tlo0.Companion, str4)));
                }
                return s3q0.a;
            case 4:
                nvy nvyVar = (nvy) obj;
                nvy.g(nvyVar, null, null, uji.a, 3);
                List list = (List) ((mtk0) obj4).getValue();
                nvyVar.e(list.size(), null, new tdd0.c(list), new jai(802480018, new tdd0.d(list, (izs) obj3, (mtk0) obj2), true));
                return s3q0.a;
            case 5:
                fah0 fah0Var = (fah0) obj4;
                WeakReference weakReference = (WeakReference) obj3;
                List<String> list2 = (List) obj2;
                Map map = (Map) obj;
                HashMap hashMap = fah0.e;
                czi cziVar = fah0Var.c;
                if (hashMap.get(cziVar.k()) == null) {
                    hashMap.put(cziVar.k(), map);
                }
                Context context = (Context) weakReference.get();
                if (context != null) {
                    fah0Var.d(context, (Map) hashMap.get(cziVar.k()), list2);
                }
                return s3q0.a;
            default:
                ((Map) obj4).put((String) obj3, (kvp0.a) obj);
                ((wh50) obj2).setValue(null);
                return s3q0.a;
        }
    }
}
