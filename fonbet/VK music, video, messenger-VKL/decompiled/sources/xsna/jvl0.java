package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.core.concurrent.ThreadExecutorStuckException;
import com.vk.libvideo.upload.api.VideoUploadEvent;
import com.vk.log.L;
import com.vk.voip.ui.VoipStatManager;
import com.vk.voip.ui.VoipViewModelState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class jvl0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ jvl0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                break;
            case 1:
                L.i((Throwable) obj);
                break;
            case 2:
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) obj;
                io.reactivex.rxjava3.disposables.c cVar2 = v9n0.e;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
                v9n0.e = null;
                v9n0.e = cVar;
                break;
            case 3:
                break;
            case 4:
                com.vk.metrics.eventtracking.b.a.a(new ThreadExecutorStuckException((Collection) obj));
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                break;
            case 8:
                break;
            case 9:
                ArrayList<UIBlock> arrayList = ((UIBlockList) obj).y;
                if (arrayList == null || !arrayList.isEmpty()) {
                    Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (j7t0.b((UIBlock) it.next(), new wyn0(5))) {
                            break;
                        }
                    }
                }
                r1 = false;
                break;
            case 10:
                VideoUploadEvent videoUploadEvent = (VideoUploadEvent) obj;
                if (!(videoUploadEvent instanceof VideoUploadEvent.Removed) && !(videoUploadEvent instanceof VideoUploadEvent.Delete) && !(videoUploadEvent instanceof VideoUploadEvent.Cancel)) {
                    r1 = false;
                }
                break;
            case 11:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                break;
            case 12:
                fjw0 fjw0Var = (fjw0) obj;
                VoipStatManager.StatData statData = VoipStatManager.a;
                VoipViewModelState voipViewModelState = fjw0Var.a;
                VoipViewModelState voipViewModelState2 = fjw0Var.b;
                boolean z = fjw0Var.c;
                boolean z2 = fjw0Var.d;
                switch (VoipStatManager.c.$EnumSwitchMapping$0[voipViewModelState.ordinal()]) {
                    case 1:
                        if (voipViewModelState2 != VoipViewModelState.InCall) {
                            VoipStatManager.c = true;
                            VoipStatManager.b = new VoipStatManager.b();
                            VoipStatManager.StatData statData2 = new VoipStatManager.StatData(0);
                            VoipStatManager.a = statData2;
                            com.vk.voip.ui.c.b.getClass();
                            statData2.q = com.vk.voip.ui.c.w0();
                            VoipStatManager.a.j = com.vk.voip.ui.c.Y0;
                            VoipStatManager.a.k = com.vk.voip.ui.c.N;
                            r6m.a.getClass();
                            String f = r6m.f();
                            String d = r6m.d();
                            if (d.length() != 0) {
                                f = v1v.a('_', f, d);
                            }
                            VoipStatManager.a.c = f;
                            break;
                        }
                        break;
                    case 2:
                    case 3:
                        if (VoipStatManager.c) {
                            if (z) {
                                VoipStatManager.b.a(VoipStatManager.a.f.a);
                            } else if (z2) {
                                VoipStatManager.b.a(VoipStatManager.a.i.a);
                            } else {
                                VoipStatManager.b.a(VoipStatManager.a.g.a);
                            }
                            if (voipViewModelState == VoipViewModelState.DeclinedTransient) {
                                VoipStatManager.a();
                                VoipStatManager.c = false;
                                break;
                            }
                        }
                        break;
                    case 4:
                        if (VoipStatManager.c) {
                            VoipStatManager.b.a(VoipStatManager.a.c.a);
                            VoipStatManager.a();
                            VoipStatManager.c = false;
                            break;
                        }
                        break;
                    case 5:
                        if (VoipStatManager.c) {
                            VoipStatManager.a();
                            VoipStatManager.c = false;
                            break;
                        }
                        break;
                    case 6:
                        if (VoipStatManager.c) {
                            if (voipViewModelState2 != VoipViewModelState.InCall) {
                                if (voipViewModelState2 == VoipViewModelState.CallingPeer) {
                                    VoipStatManager.b.a(VoipStatManager.a.e.a);
                                    break;
                                }
                            } else {
                                VoipStatManager.b.a(VoipStatManager.a.b.a);
                                break;
                            }
                        }
                        break;
                    case 7:
                        if (VoipStatManager.c) {
                            VoipStatManager.b.a(VoipStatManager.a.C2007a.a);
                            break;
                        }
                        break;
                }
                break;
            default:
                L.j((Throwable) obj, "VoipViewModelAsrRecordDelegate.loadInitializerInfo() failed");
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ jvl0(j7t0 j7t0Var) {
        this.b = 9;
    }
}
