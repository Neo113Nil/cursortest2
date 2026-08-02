package xsna;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.dto.ui.UIBlockVideoUpload;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.upload.api.VideoUploadEvent;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.ui.change_name.VoipChangeNameConfig;
import com.vk.voip.ui.change_name.ui.result.VoipChangeNameResult;
import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduleCallTimeZone;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.a7f0;
import xsna.amw0;
import xsna.dmw0;
import xsna.emw0;
import xsna.tww0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class tot0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tot0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        io.reactivex.rxjava3.core.x oVar;
        switch (this.b) {
            case 0:
                UIBlockList uIBlockList = (UIBlockList) this.c;
                UIBlockList uIBlockList2 = (UIBlockList) this.d;
                VideoUploadEvent videoUploadEvent = (VideoUploadEvent) obj;
                if (!(videoUploadEvent instanceof VideoUploadEvent.Done)) {
                    return new UIBlockVideoUpload(uIBlockList2, videoUploadEvent);
                }
                VideoUploadEvent.Done done = (VideoUploadEvent.Done) videoUploadEvent;
                VideoFile videoFile = done.c;
                VideoFile videoFile2 = done.c;
                return new UIBlockVideo(videoFile.a1(), CatalogViewType.LIST, CatalogDataType.DATA_TYPE_VIDEO_VIDEOS, uIBlockList.f, videoFile2.I0(), uIBlockList.h, uIBlockList.Db(), uIBlockList.j, new UIBlockVideo.a(videoFile2.getTitle(), done.c, false, null, false, null, null, null, 32764), null, 512, null);
            case 1:
                vlw0 vlw0Var = (vlw0) this.c;
                emw0.a aVar = (emw0.a) this.d;
                if (((Boolean) obj).booleanValue()) {
                    vlw0Var.T(amw0.b.a.b);
                    jsa jsaVar = vlw0Var.h;
                    VoipChangeNameConfig voipChangeNameConfig = vlw0Var.f;
                    VoipChangeNameConfig.OpenedFrom openedFrom = voipChangeNameConfig.i;
                    if (openedFrom instanceof VoipChangeNameConfig.OpenedFrom.JoinScreen) {
                        qaj0.c(jsaVar.b.c(), "anonym_name", aVar.e);
                        vlw0Var.k.b(new dmw0.a(voipChangeNameConfig.c, new VoipChangeNameResult(new VoipChangeNameResult.JoinAs.Anonym(aVar.e))));
                    } else {
                        if (!(openedFrom instanceof VoipChangeNameConfig.OpenedFrom.ActiveCall)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String str = aVar.e;
                        jsaVar.getClass();
                        OKVoipEngine.b.getClass();
                        xdw0 a = OKVoipEngine.x().a();
                        if (a == null) {
                            oVar = io.reactivex.rxjava3.core.x.i(new RuntimeException("anonymous user info is null"));
                        } else {
                            io.reactivex.rxjava3.internal.operators.completable.c0 c0Var = jsaVar.c;
                            ux0 ux0Var = new ux0(new l14(str, a, jsaVar, 2), 10);
                            c0Var.getClass();
                            oVar = new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.r(c0Var, ux0Var), new lf1(new v74(4, jsaVar, str), 7));
                        }
                        io.reactivex.rxjava3.internal.operators.single.j jVar = new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(oVar, new aas0(new aiw0(vlw0Var, 2), 8)), new cpd(vlw0Var, 3));
                        asu0 asu0Var = asu0.a;
                        a7f0.a.f(vlw0Var, jVar.q(asu0Var.c()).m(asu0Var.d()), new bjm0(vlw0Var, 22), new biw0(vlw0Var, 3), 1);
                    }
                } else {
                    vlw0Var.T(amw0.b.c.b);
                }
                return s3q0.a;
            default:
                Pair pair = (Pair) obj;
                ((pww0) this.c).T(new tww0.k.d((VoipScheduleCallTimeZone) pair.d(), (List) pair.g(), (x5h0) this.d));
                return s3q0.a;
        }
    }
}
