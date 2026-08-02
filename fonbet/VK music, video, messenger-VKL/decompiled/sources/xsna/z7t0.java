package xsna;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.messages.dto.MessagesGetGroupsForCallResponseDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.libvideo.api.ui.VideoResizer;
import com.vk.superapp.api.dto.story.WebClickablePoint;
import com.vk.toggle.Features;
import com.vk.video.profile.presentation.h;
import com.vk.voip.api.id.CallId;
import com.vk.voip.ui.call_by_link.feature.c;
import com.vk.voip.ui.prodstat.analytics.base.screen.VoipAnalyticsEventScreen;
import com.vk.voip.ui.qr.ui.VoipQrCodeScannerFragment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.dd9;
import xsna.jne0;
import xsna.lne0;
import xsna.nmw0;
import xsna.pxw0;
import xsna.zhg;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class z7t0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z7t0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        Parcelable parcelable;
        Object parcelable2;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                f4z<com.vk.video.profile.presentation.h> f4zVar = ((com.vk.video.profile.presentation.c) obj2).A;
                y4a y4aVar = (y4a) obj;
                if (y4aVar instanceof enn0) {
                    String str2 = ((enn0) y4aVar).b;
                    if (str2 != null) {
                        Features.Type type = Features.Type.FEATURE_VIDEO_CATALOG_NEW_FILTER_SWITCH;
                        type.getClass();
                        if (com.vk.toggle.b.A.a(type)) {
                            f4zVar.b(new h.q(new ber(str2), false));
                        }
                    }
                } else if (y4aVar instanceof rnn0) {
                    f4zVar.b(new h.q(new snn0(((rnn0) y4aVar).b), true));
                }
                return s3q0.a;
            case 1:
                xnt0 xnt0Var = (xnt0) obj2;
                Rect rect = (Rect) obj;
                Iterator it = xnt0Var.l.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    io.reactivex.rxjava3.subjects.d dVar = (io.reactivex.rxjava3.subjects.d) pair.d();
                    tn10 tn10Var = (tn10) pair.g();
                    rn10 rn10Var = (rn10) dVar.P0();
                    if (rn10Var != null) {
                        rn10Var.b();
                    }
                    View view = xnt0Var.a;
                    VideoResizer.VideoFitType videoFitType = tn10Var instanceof com.vk.libvideo.api.ui.c ? ((com.vk.libvideo.api.ui.c) tn10Var).c : VideoResizer.VideoFitType.FIT;
                    Rect b = f4m.b(tn10Var.b());
                    Rect rect2 = new Rect(rect);
                    if (fxc0.B().J().d(view.getContext()) && iah0.r(view.getContext())) {
                        rect2.top = b.top;
                        rect2.bottom = b.bottom;
                    }
                    dVar.onNext(new rn10(rect2, null, videoFitType, 0, b, videoFitType, 0, tn10Var));
                }
                return s3q0.a;
            case 2:
                kw8 kw8Var = (kw8) obj;
                return kw8Var.e(new ehu0(((r5j0) obj2).a(kw8Var.b.d(), kw8Var.b.getLayoutDirection(), kw8Var)));
            case 3:
                Drawable drawable = (Drawable) obj2;
                ojt ojtVar = (ojt) obj;
                ojtVar.d = drawable;
                ojtVar.h = drawable;
                return s3q0.a;
            case 4:
                ArrayList arrayList = ((qbv0) obj2).l;
                arrayList.clear();
                arrayList.addAll((List) obj);
                return s3q0.a;
            case 5:
                com.vk.voip.ui.call_by_link.feature.b bVar = (com.vk.voip.ui.call_by_link.feature.b) obj2;
                List<GroupsGroupFullDto> d = ((MessagesGetGroupsForCallResponseDto) obj).d();
                ArrayList arrayList2 = new ArrayList(c5g.u(d, 10));
                for (GroupsGroupFullDto groupsGroupFullDto : d) {
                    UserId P0 = groupsGroupFullDto.P0();
                    if (P0 == null) {
                        throw new IllegalStateException("Group without id: " + groupsGroupFullDto);
                    }
                    UserId e = fkq0.e(P0);
                    String y1 = groupsGroupFullDto.y1();
                    if (y1 == null) {
                        y1 = "";
                    }
                    Serializer.c<ImageList> cVar = ImageList.CREATOR;
                    arrayList2.add(new cgw0(e, y1, ImageList.a.a(groupsGroupFullDto.V1()), epx.f(groupsGroupFullDto.N3(), Boolean.TRUE)));
                }
                bVar.T(new c.e.C2026c(arrayList2));
                return s3q0.a;
            case 6:
                pmw0 pmw0Var = (pmw0) obj2;
                dd9.a aVar = (dd9.a) obj;
                if (aVar instanceof dd9.a.c) {
                    nmw0.c cVar2 = pmw0Var.d;
                    dd9.a.c cVar3 = (dd9.a.c) aVar;
                    CallId callId = cVar3.b;
                    jvi0 jvi0Var = cVar3.c;
                    cVar2.invoke(callId, jvi0Var.a ? SessionRoomId.MainCall.INSTANCE : new SessionRoomId.Room(jvi0Var.b));
                }
                return s3q0.a;
            case 7:
                eow0 eow0Var = (eow0) obj2;
                int i2 = eow0.f1;
                com.vk.voip.ui.c cVar4 = com.vk.voip.ui.c.b;
                Bundle arguments = eow0Var.getArguments();
                if (arguments != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable2 = arguments.getParcelable("screen", VoipAnalyticsEventScreen.class);
                        parcelable = (Parcelable) parcelable2;
                    } else {
                        Parcelable parcelable3 = arguments.getParcelable("screen");
                        if (!(parcelable3 instanceof VoipAnalyticsEventScreen)) {
                            parcelable3 = null;
                        }
                        parcelable = (VoipAnalyticsEventScreen) parcelable3;
                    }
                    VoipAnalyticsEventScreen voipAnalyticsEventScreen = (VoipAnalyticsEventScreen) parcelable;
                    String str3 = voipAnalyticsEventScreen != null ? voipAnalyticsEventScreen.b : null;
                    if (str3 != null) {
                        str = str3;
                        com.vk.voip.ui.c.C(cVar4, str, 0L, true, false, true, null, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE);
                        eow0Var.dismiss();
                        return s3q0.a;
                    }
                }
                str = "";
                com.vk.voip.ui.c.C(cVar4, str, 0L, true, false, true, null, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE);
                eow0Var.dismiss();
                return s3q0.a;
            case 8:
                ((qrw0) obj2).d.b.invoke().tn();
                return s3q0.a;
            case 9:
                ((puw0) obj2).l.b(new zhg.a((Throwable) obj));
                return s3q0.a;
            case 10:
                VoipQrCodeScannerFragment voipQrCodeScannerFragment = (VoipQrCodeScannerFragment) obj2;
                lne0 lne0Var = (lne0) obj;
                int i3 = VoipQrCodeScannerFragment.W;
                if (lne0Var instanceof lne0.a) {
                    voipQrCodeScannerFragment.o5(false);
                } else if (lne0Var instanceof lne0.b) {
                    voipQrCodeScannerFragment.getFeature().C(new jne0.e(((lne0.b) lne0Var).a));
                } else {
                    if (!(lne0Var instanceof lne0.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    voipQrCodeScannerFragment.getFeature().C(jne0.f.b);
                }
                return s3q0.a;
            case 11:
                ((qxw0) obj2).a(new pxw0.e(((Date) obj).getTime()));
                return s3q0.a;
            case 12:
                return Boolean.valueOf(((u4x0) obj2).e());
            default:
                float[] fArr = (float[]) obj2;
                int intValue = ((Integer) obj).intValue() * 2;
                return new WebClickablePoint(an10.b(fArr[intValue]), an10.b(fArr[intValue + 1]));
        }
    }
}
