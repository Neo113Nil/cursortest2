package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.tasks.OnCompleteListener;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.voip.ui.history.past.presentation.base.fragment.VoipPastCallsFragment;
import com.vk.voip.ui.scheduled.creation.ui.fragment.VoipCreateScheduleCallFragment;
import com.vk.voip.userid.CallsUserId;
import java.util.List;
import xsna.hww0;
import xsna.k6o0;
import xsna.mky0;
import xsna.onq0;
import xsna.to90;
import xsna.vwf;
import xsna.xn50;
import xsna.yow0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class uq80 implements io.reactivex.rxjava3.functions.l, k6o0.a, vwf.b, io.reactivex.rxjava3.functions.m, pcs, mky0.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uq80(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (Boolean) ((q8w) this.c).invoke(obj);
            case 1:
            case 7:
            default:
                return (yow0.b.c) ((i9u0) this.c).invoke(obj);
            case 2:
                return (nov) ((pzl0) this.c).invoke(obj);
            case 3:
                return (List) ((exi0) this.c).invoke(obj);
            case 4:
                return (c3m0) ((exi0) this.c).invoke(obj);
            case 5:
                return (List) ((exi0) this.c).invoke(obj);
            case 6:
                return ((onq0.a) this.c).invoke(obj);
            case 8:
                return (io.reactivex.rxjava3.core.e) ((fuh0) this.c).invoke(obj);
            case 9:
                return (io.reactivex.rxjava3.core.t) ((exi0) this.c).invoke(obj);
            case 10:
                return (VideoFile) ((fuh0) this.c).invoke(obj);
        }
    }

    @Override // xsna.k6o0.a
    public void b(Object obj, Object obj2) {
        xhl0<?> xhl0Var = (xhl0) this.c;
        yhl0.c.a(xhl0Var);
        ((OnCompleteListener) obj).onComplete(xhl0Var);
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        Parcelable parcelable;
        Object parcelable2;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 12:
                VoipCreateScheduleCallFragment voipCreateScheduleCallFragment = (VoipCreateScheduleCallFragment) obj;
                int i2 = VoipCreateScheduleCallFragment.S;
                if (str.hashCode() == -947749110 && str.equals("REQUEST_KEY_SCHEDULE_AS")) {
                    UserId userId = (UserId) bundle.getParcelable("result_key_group_id");
                    xn50.a.c(voipCreateScheduleCallFragment, (userId == null || userId.b <= 0) ? hww0.p.a.b : new hww0.p.b(userId));
                    break;
                }
                break;
            default:
                VoipPastCallsFragment voipPastCallsFragment = (VoipPastCallsFragment) obj;
                int i3 = VoipPastCallsFragment.a0;
                if (epx.f(str, "request_key_past_calls_filter_group_id")) {
                    CallsUserId.VkUserId vkUserId = null;
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable2 = bundle.getParcelable("result_key_group_id", UserId.class);
                        parcelable = (Parcelable) parcelable2;
                    } else {
                        Parcelable parcelable3 = bundle.getParcelable("result_key_group_id");
                        if (!(parcelable3 instanceof UserId)) {
                            parcelable3 = null;
                        }
                        parcelable = (UserId) parcelable3;
                    }
                    UserId userId2 = (UserId) parcelable;
                    if (userId2 != null) {
                        Serializer.c<? extends Serializer.StreamParcelable> cVar = CallsUserId.CREATOR;
                        vkUserId = new CallsUserId.VkUserId(fkq0.e(userId2));
                    }
                    if (vkUserId != null && com.vk.voip.userid.a.a(vkUserId)) {
                        xn50.a.c(voipPastCallsFragment, new to90.e.b(vkUserId));
                        break;
                    }
                }
                break;
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((i9u0) this.c).invoke(obj)).booleanValue();
    }

    @Override // xsna.mky0.a
    public zjy0 apply(int i) {
        mky0 mky0Var = (mky0) this.c;
        return new zjy0(i, mky0Var.e, mky0Var.b, mky0Var, mky0Var.d, mky0Var.f);
    }
}
