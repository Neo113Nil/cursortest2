package xsna;

import android.os.Bundle;
import android.view.ViewGroup;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.catalog2.common.dto.api.replacement.CatalogReplacementResponse;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.core.serialize.Serializer;
import com.vk.documents.impl.SearchDocumentsListFragment;
import com.vk.dto.common.id.UserId;
import com.vk.voip.ui.scheduled.callslist.VoipScheduledCallsFragment;
import com.vk.voip.userid.CallsUserId;
import java.util.List;
import ru.ok.android.webrtc.protocol.RtcCommand;
import ru.ok.android.webrtc.protocol.RtcCommandOnSuccessListener;
import ru.ok.android.webrtc.protocol.RtcResponse;
import ru.ok.android.webrtc.protocol.commands.ReportPerfStatCommand;
import ru.ok.android.webrtc.protocol.commands.ReportPerfStatResponse;
import ru.ok.android.webrtc.topology.server.ServerCallTopology;
import xsna.cdz;
import xsna.p7w0;
import xsna.t6k0;
import xsna.vhg;
import xsna.xn50;
import xsna.y5h0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class adz implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, cgx, SwipeDrawableRefreshLayout.g, RtcCommandOnSuccessListener, io.reactivex.rxjava3.functions.c, pcs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ adz(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (List) ((oq2) this.c).invoke(obj, obj2);
    }

    @Override // xsna.cgx
    public ViewGroup c() {
        return (lv0) this.c;
    }

    @Override // com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout.g
    public void h() {
        ((gzs) this.c).invoke();
    }

    @Override // ru.ok.android.webrtc.protocol.RtcCommandOnSuccessListener
    public void onRtcCommandSuccess(RtcCommand rtcCommand, RtcResponse rtcResponse) {
        ((ServerCallTopology) this.c).a((ReportPerfStatCommand) rtcCommand, (ReportPerfStatResponse) rtcResponse);
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        CallsUserId.VkUserId vkUserId;
        VoipScheduledCallsFragment voipScheduledCallsFragment = (VoipScheduledCallsFragment) this.c;
        int i = VoipScheduledCallsFragment.c0;
        int hashCode = str.hashCode();
        if (hashCode == -1575865695) {
            if (str.equals("EditScheduledCall")) {
                xn50.a.c(voipScheduledCallsFragment, vhg.a.b);
            }
        } else if (hashCode == -837662985 && str.equals("select_calls_from")) {
            UserId userId = (UserId) bundle.getParcelable("result_key_group_id");
            if (userId != null) {
                Serializer.c<? extends Serializer.StreamParcelable> cVar = CallsUserId.CREATOR;
                vkUserId = new CallsUserId.VkUserId(userId);
            } else {
                vkUserId = null;
            }
            xn50.a.c(voipScheduledCallsFragment, new y5h0.e(vkUserId));
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 4:
                break;
            case 14:
                break;
        }
        return ((Boolean) ((fyo0) this.c).invoke(obj)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (ddz) ((cdz.a) obj2).invoke(obj);
            case 1:
                return (me00) ((ept) obj2).invoke(obj);
            case 2:
                return (List) ((gmj) obj2).invoke(obj);
            case 3:
                return (hy30) ((gmj) obj2).invoke(obj);
            case 4:
            case 7:
            case 8:
            case 11:
            case 14:
            case 15:
            case 17:
            default:
                return (Boolean) ((fyo0) obj2).invoke(obj);
            case 5:
                return (CatalogReplacementResponse) ((vo40) obj2).invoke(obj);
            case 6:
                return (io.reactivex.rxjava3.core.b0) ((aj50) obj2).invoke(obj);
            case 9:
                return (BaseBoolIntDto) ((ept) obj2).invoke(obj);
            case 10:
                int i2 = SearchDocumentsListFragment.h0;
                return (String) ((ept) obj2).invoke(obj);
            case 12:
                return (qsm) ((aj50) obj2).invoke(obj);
            case 13:
                return (t6k0.a) ((aj50) obj2).c;
            case 16:
                return (e3t0) ((qso) obj2).invoke(obj);
            case 18:
                return (xbu0) ((ujm0) obj2).c;
            case 19:
                return (p7w0.c.b) ((x6w0) obj2).invoke(obj);
        }
    }
}
