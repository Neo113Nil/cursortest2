package xsna;

import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.apps.dto.AppsAppEmbeddedUrlDto;
import com.vk.api.generated.utils.dto.UtilsDomainResolvedWithDataDto;
import com.vk.clips.coauthors.list.common.mvi.ClipCoauthorListLaunchType;
import com.vk.clips.coauthors.list.common.mvi.entity.state.ClipCoauthorListState;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.ecomm.cart.impl.cart.feature.state.a;
import com.vk.navigation.NavigationDelegateActivity;
import com.vk.superapp.core.perf.BrowserPerfState;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Pair;
import xsna.a7f0;
import xsna.px9;
import xsna.rv9;
import xsna.sx9;
import xsna.wk50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class hoc implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ hoc(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Hint p;
        int i = this.b;
        String str = null;
        r2 = null;
        s3q0 s3q0Var = null;
        str = null;
        str = null;
        int i2 = 0;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ClipVideoFile clipVideoFile = (ClipVideoFile) obj4;
                h7v h7vVar = (h7v) obj3;
                ClipCoauthorListLaunchType clipCoauthorListLaunchType = (ClipCoauthorListLaunchType) obj2;
                ClipCoauthorListState clipCoauthorListState = (ClipCoauthorListState) ((gzs) obj5).invoke();
                if (clipCoauthorListState == null) {
                    HintId hintId = HintId.CLIPS_COAUTHORS_LIST_ONBOARDING;
                    boolean z = clipCoauthorListLaunchType == ClipCoauthorListLaunchType.Author;
                    if (!z && h7vVar.m(hintId) && (p = h7vVar.p(hintId.getId())) != null) {
                        str = p.c;
                    }
                    break;
                }
                break;
            case 1:
                aq80 aq80Var = (aq80) obj5;
                NavigationDelegateActivity navigationDelegateActivity = (NavigationDelegateActivity) obj4;
                BrowserPerfState browserPerfState = (BrowserPerfState) obj3;
                izs izsVar = (izs) obj2;
                UtilsDomainResolvedWithDataDto utilsDomainResolvedWithDataDto = (UtilsDomainResolvedWithDataDto) obj;
                if (epx.f(utilsDomainResolvedWithDataDto.getType(), "vk_app")) {
                    AppsAppDto d = utilsDomainResolvedWithDataDto.d();
                    AppsAppEmbeddedUrlDto e = utilsDomainResolvedWithDataDto.e();
                    if (d != null && e != null) {
                        new re3();
                        ApiApplication b = re3.b(d);
                        op20 op20Var = new op20(b, navigationDelegateActivity, new mq20(e.f(), e.d(), (String) null, (String) null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, (String) null, (String) null), new iq20(null, "link", null, browserPerfState, null, null, null, null, 245), null, 16);
                        if (epx.f(d.R1(), Boolean.TRUE)) {
                            op20Var.e.d = Boolean.valueOf(b.J);
                        }
                        izsVar.invoke(bis.d(op20Var));
                        aq80Var.onSuccess();
                        s3q0Var = s3q0.a;
                    }
                    if (s3q0Var == null) {
                        aq80Var.U();
                        s3q0 s3q0Var2 = s3q0.a;
                    }
                } else {
                    aq80Var.U();
                    s3q0 s3q0Var3 = s3q0.a;
                }
                break;
            default:
                final fid0 fid0Var = (fid0) obj5;
                LinkedHashMap linkedHashMap = fid0Var.d;
                final wk50.a aVar = (wk50.a) obj4;
                rv9.i.a aVar2 = (rv9.i.a) obj3;
                com.vk.ecomm.cart.impl.cart.feature.state.a aVar3 = (com.vk.ecomm.cart.impl.cart.feature.state.a) obj2;
                if (((Boolean) obj).booleanValue()) {
                    final a.C0919a c0919a = aVar2.b;
                    final int i3 = aVar3.e;
                    StringBuilder sb = new StringBuilder();
                    long j = c0919a.a;
                    UserId userId = c0919a.c;
                    sb.append(j);
                    sb.append(userId);
                    String sb2 = sb.toString();
                    ey9 ey9Var = fid0Var.b;
                    linkedHashMap.put(sb2, a7f0.a.f(aVar, io.reactivex.rxjava3.core.x.B(ey9Var.a(c0919a.b), rsg0.w0(yfb.x(xd10.j(ey9Var.a, Collections.singletonList("-" + userId + "\\_" + c0919a.a), 14))).l(new ca6(new com.vk.im.ui.components.viewcontrollers.dialog_header.info.a(c0919a, 13), 3)), new did0(new od1(4), i2)), new izs() { // from class: xsna.eid0
                        @Override // xsna.izs
                        public final Object invoke(Object obj6) {
                            Pair pair = (Pair) obj6;
                            adp0 adp0Var = (adp0) pair.d();
                            com.vk.ecomm.cart.impl.cart.feature.state.a aVar4 = (com.vk.ecomm.cart.impl.cart.feature.state.a) pair.g();
                            a.C0919a c0919a2 = c0919a;
                            aVar.b(new px9.b.e(c0919a2, adp0Var, aVar4));
                            f4z f4zVar = fid0Var.c;
                            UserId userId2 = c0919a2.c;
                            long j2 = c0919a2.a;
                            f4zVar.b(new sx9.c(i3, aVar4.e, j2, userId2));
                            return s3q0.a;
                        }
                    }, new f55(fid0Var, aVar, c0919a, 5), 1));
                } else {
                    fid0Var.f(aVar, aVar2.b);
                }
                a.C0919a c0919a2 = aVar2.b;
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) linkedHashMap.remove("debounce_" + c0919a2.a);
                if (cVar != null) {
                    cVar.dispose();
                }
                fid0Var.e.remove(c0919a2);
                break;
        }
        return s3q0.a;
    }
}
