package xsna;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.preference.Preference;
import com.vk.api.base.VkPaginationList;
import com.vk.api.generated.calls.dto.CallsGetReactionsResponseDto;
import com.vk.clips.editor.templates.impl.player.a;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.group.AdminLeaveAction;
import com.vk.dto.group.Group;
import com.vk.friends.impl.cleanup.presentation.fragment.FriendsCleanupFragment;
import com.vk.im.ui.components.contacts.b;
import com.vk.voip.ui.asr.ui.start.AsrRecordStartFragment;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import one.video.calls.sdk.experiments.ExperimentsInterface;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.a2j;
import xsna.mms;
import xsna.n8z0;
import xsna.p810;
import xsna.xn50;
import xsna.yns;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class iw3 implements io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.l, a.g, pcs, Preference.c, Signaling.MessageInterceptor, io.reactivex.rxjava3.core.a0, n8z0.b, io.reactivex.rxjava3.functions.c {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iw3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    public void a(yns ynsVar) {
        FriendsCleanupFragment friendsCleanupFragment = (FriendsCleanupFragment) this.c;
        int i = FriendsCleanupFragment.W;
        if (ynsVar instanceof yns.c) {
            xn50.a.c(friendsCleanupFragment, mms.f.b.b);
            return;
        }
        if (ynsVar instanceof yns.d) {
            xn50.a.c(friendsCleanupFragment, mms.f.a.b);
            return;
        }
        if (ynsVar instanceof yns.b) {
            xn50.a.c(friendsCleanupFragment, mms.g.b.b);
            return;
        }
        if (ynsVar instanceof zns) {
            xn50.a.c(friendsCleanupFragment, mms.c.b);
            return;
        }
        if (ynsVar instanceof aos) {
            xn50.a.c(friendsCleanupFragment, new nms(((aos) ynsVar).a));
        } else if (ynsVar instanceof bos) {
            xn50.a.c(friendsCleanupFragment, new oms(((bos) ynsVar).a));
        } else {
            if (!ynsVar.equals(yns.a.a)) {
                throw new NoWhenBranchMatchedException();
            }
            xn50.a.c(friendsCleanupFragment, mms.a.b);
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 1:
                return (Long) ((com.vk.movika.sdk.base.observable.q) this.c).invoke(obj);
            case 2:
                return (io.reactivex.rxjava3.core.b0) ((com.vk.movika.sdk.base.observable.q) this.c).invoke(obj);
            case 3:
                return (List) ((com.vk.movika.sdk.base.observable.q) this.c).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.t) ((wh1) this.c).invoke(obj);
            case 5:
            case 6:
            case 9:
            case 10:
            case 12:
            case 13:
            case 15:
            case 16:
            case 20:
            case 25:
            default:
                return (VkPaginationList) ((ka90) this.c).invoke(obj);
            case 7:
                return (io.reactivex.rxjava3.core.e) ((a2j.b) this.c).invoke(obj);
            case 8:
                return (b.a) ((dwg) this.c).invoke(obj);
            case 11:
                return (ptk) ((dwg) this.c).invoke(obj);
            case 14:
                return (wmt) ((dwg) this.c).invoke(obj);
            case 17:
                return (io.reactivex.rxjava3.core.e) ((y5z) this.c).invoke(obj);
            case 18:
                return (p810.q) ((ku1) this.c).invoke(obj);
            case 19:
                return (it80) ((wh1) this.c).invoke(obj);
            case 21:
                return (io.reactivex.rxjava3.core.e) ((o010) this.c).invoke(obj);
            case 22:
                return (List) ((wh1) this.c).invoke(obj);
            case 23:
                return (Pair) ((wh1) this.c).invoke(obj);
            case 24:
                return (hda) ((tw4) this.c).invoke(obj);
            case 26:
                return (x960) ((o010) this.c).invoke(obj);
            case 27:
                return (io.reactivex.rxjava3.core.b0) ((av60) this.c).invoke(obj);
            case 28:
                return (Bitmap) ((o010) this.c).invoke(obj);
        }
    }

    @Override // com.vk.clips.editor.templates.impl.player.a.g
    public void b() {
        y7f.this.e.onVideoEnd();
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        debugDevSettingsFragment.getClass();
        jx2 jx2Var = new jx2(new rsg0("captcha.force"), new c4g0());
        jx2Var.g = debugDevSettingsFragment.getActivity();
        jx2Var.a();
        return true;
    }

    @Override // xsna.n8z0.b
    public void f(njz0 njz0Var, xla xlaVar) {
        j8x j8xVar = (j8x) this.c;
        lxy0 lxy0Var = (lxy0) njz0Var;
        if (lxy0Var != null) {
            ipy0 ipy0Var = lxy0Var.b;
            j8xVar.l = ipy0Var;
            if (ipy0Var != null) {
                j8xVar.j = new vcz0(ipy0Var.a);
                j8xVar.k = new vhz0(j8xVar.l.a);
                yh0 yh0Var = j8xVar.i;
                if (yh0Var != null) {
                    yh0Var.d = j8xVar;
                    return;
                }
                return;
            }
        }
        yh0 yh0Var2 = j8xVar.i;
        if (yh0Var2 != null) {
            yh0Var2.d = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    @Override // ru.ok.android.webrtc.signaling.api.Signaling.MessageInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JSONObject onMessage(JSONObject jSONObject) {
        JSONObject jSONObject2;
        int i = ExperimentsInterface.c.$EnumSwitchMapping$0[((ExperimentsInterface.EmulatedSignalingError) this.c).ordinal()];
        if (i != 1) {
            if (i == 2) {
                jSONObject2 = new JSONObject().put("error", "service-unavailable");
            } else if (i == 3) {
                jSONObject2 = new JSONObject().put("error", "participants-limit-reached").put(SignalingProtocol.KEY_LIMIT, "134");
            }
            if (jSONObject2 != null) {
                return null;
            }
            jSONObject2.put("type", "error");
            jSONObject2.put(SignalingProtocol.KEY_STAMP, 0);
            jSONObject2.put(SignalingProtocol.KEY_SEQUENCE, 0);
            return jSONObject2;
        }
        jSONObject2 = null;
        if (jSONObject2 != null) {
        }
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        Parcelable parcelable;
        Object parcelable2;
        j7h j7hVar = (j7h) this.c;
        if (j7hVar.h != null) {
            int i = u6h.m1;
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = bundle.getParcelable("selected_choice", AdminLeaveAction.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = bundle.getParcelable("selected_choice");
                if (!(parcelable3 instanceof AdminLeaveAction)) {
                    parcelable3 = null;
                }
                parcelable = (AdminLeaveAction) parcelable3;
            }
            AdminLeaveAction adminLeaveAction = (AdminLeaveAction) parcelable;
            String string = bundle.getString("source");
            String string2 = bundle.getString("track_code");
            oap<ExtendedCommunityProfile, ? extends Group> oapVar = j7hVar.h;
            j7hVar.f(oapVar != null ? oapVar : null, string, adminLeaveAction, string2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        lrt lrtVar = (lrt) this.c;
        if (!((Collection) lrtVar.d).isEmpty()) {
            yVar.onSuccess(lrtVar.d);
            return;
        }
        synchronized (lrtVar) {
            try {
                if (lrtVar.d.isEmpty()) {
                    lrtVar.b.getClass();
                    dz2 x = yfb.x(new tfx("calls.getReactions", new gr(4), new dn(5)));
                    ahn.D(x);
                    lrtVar.d = lrt.c((CallsGetReactionsResponseDto) rsg0.w0(x).c());
                    for (b69 b69Var : (Iterable) lrtVar.d) {
                        lrtVar.c.put(b69Var.a, b69Var);
                    }
                }
                yVar.onSuccess(lrtVar.d);
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                int i2 = AsrRecordStartFragment.U;
                return ((Boolean) ((wh1) obj2).invoke(obj)).booleanValue();
            case 13:
                return ((Boolean) ((cvh) obj2).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((wh1) obj2).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (oj0) ((com.vk.movika.sdk.android.defaultplayer.control.l) this.c).invoke((oj0) obj, obj2);
    }
}
