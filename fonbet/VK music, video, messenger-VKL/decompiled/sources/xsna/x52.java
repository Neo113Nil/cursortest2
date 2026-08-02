package xsna;

import android.app.Dialog;
import android.os.MemoryFile;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import com.vk.camera.ui.SuperappQrCameraActivity;
import com.vk.catalog2.common.ui.mvp.holder.friends.FriendsCatalogRootVh;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.libvideo.pip.v2.activity.VideoContainerActivity;
import com.vk.log.L;
import com.vk.newsfeed.impl.postmodal.ModalPostCommonFragment;
import com.vk.reefton.Reef;
import java.io.File;
import java.nio.ByteBuffer;
import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl;
import ru.ok.android.webrtc.protocol.screenshare.send.impl.FrameCapturerImpl;
import xsna.kds0;
import xsna.s4m;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class x52 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x52(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ByteBuffer byteBuffer;
        int i;
        MemoryFile memoryFile;
        switch (this.b) {
            case 0:
                y52 y52Var = (y52) this.c;
                Trace.beginSection("measureAndLayout");
                try {
                    y52Var.b.a(true);
                    s3q0 s3q0Var = s3q0.a;
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        y52Var.e();
                        Trace.endSection();
                        y52Var.H = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case 1:
                m8b m8bVar = (m8b) this.c;
                View view = m8bVar.g;
                if (view == null) {
                    return;
                }
                view.getLayoutParams();
                view.getHeight();
                m8bVar.o.a();
                return;
            case 2:
                vhk0.b((File) this.c);
                return;
            case 3:
                s4m s4mVar = (s4m) this.c;
                s4mVar.k.invoke();
                s4m.a.q6(s4mVar, true);
                return;
            case 4:
                ((FrameCapturerImpl) this.c).a();
                return;
            case 5:
                FriendsCatalogRootVh friendsCatalogRootVh = (FriendsCatalogRootVh) this.c;
                g3a.a(friendsCatalogRootVh.x, friendsCatalogRootVh);
                return;
            case 6:
                xlu xluVar = (xlu) this.c;
                xluVar.b = false;
                xluVar.j.setMinimumHeight(0);
                xluVar.getPresenter().c();
                return;
            case 7:
                ModalPostCommonFragment modalPostCommonFragment = (ModalPostCommonFragment) this.c;
                ModalPostCommonFragment.io(modalPostCommonFragment);
                View view2 = modalPostCommonFragment.U;
                ModalBottomSheetBehavior H = view2 != null ? ModalBottomSheetBehavior.H(view2) : null;
                if (H != null) {
                    H.E = true;
                    H.F = true;
                    return;
                }
                return;
            case 8:
                aoa0 aoa0Var = (aoa0) this.c;
                while (aoa0Var.f) {
                    synchronized (aoa0Var.a) {
                        while (aoa0Var.f && aoa0Var.g) {
                            try {
                                try {
                                    aoa0Var.a.wait();
                                } catch (InterruptedException unused) {
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        aoa0Var.g = true;
                        if (!aoa0Var.f) {
                            return;
                        }
                        pes pesVar = aoa0Var.h;
                        if ((pesVar != null ? pesVar.i() : null) != null && ((byteBuffer = aoa0Var.c) == null || byteBuffer.array().length < pesVar.i().array().length)) {
                            aoa0Var.c = ByteBuffer.allocateDirect(m8g.a(pesVar));
                        }
                        ByteBuffer i2 = aoa0Var.h.i();
                        pes pesVar2 = aoa0Var.h;
                        int i3 = pesVar2.a;
                        int i4 = pesVar2.b;
                        ByteBuffer byteBuffer2 = aoa0Var.c;
                        boolean z = aoa0Var.e;
                        if (i2 != null && byteBuffer2 != null && (i = i3 * i4) != 0) {
                            i2.rewind();
                            byteBuffer2.rewind();
                            byte[] array = i2.array();
                            byte[] array2 = byteBuffer2.array();
                            int i5 = i / 4;
                            System.arraycopy(array, 0, array2, 0, i);
                            if (z) {
                                for (int i6 = 0; i6 < i5; i6++) {
                                    int i7 = (i6 * 2) + i;
                                    array2[i + i6] = array[i7 + 1];
                                    array2[i + i5 + i6] = array[i7];
                                }
                            } else {
                                for (int i8 = 0; i8 < i5; i8++) {
                                    int i9 = (i8 * 2) + i;
                                    int i10 = i9 + 1;
                                    array2[i9] = array[i10];
                                    array2[i10] = array[i9];
                                }
                            }
                            ByteBuffer byteBuffer3 = aoa0Var.c;
                            if (byteBuffer3 != null) {
                                try {
                                    byte[] array3 = byteBuffer3.array();
                                    if (array3.length != 0) {
                                        memoryFile = new MemoryFile(null, array3.length);
                                        try {
                                            memoryFile.writeBytes(array3, 0, 0, array3.length);
                                            aoa0Var.b.add(memoryFile);
                                        } catch (Throwable unused2) {
                                            Log.e("aoa0", "can't create frame mmap");
                                            if (memoryFile != null) {
                                                memoryFile.close();
                                            }
                                            s3q0 s3q0Var2 = s3q0.a;
                                        }
                                    }
                                } catch (Throwable unused3) {
                                    memoryFile = null;
                                }
                            }
                        }
                        s3q0 s3q0Var22 = s3q0.a;
                    }
                }
                return;
            case 9:
                SessionRoomParticipantsDataProviderImpl.resolveParticipantIds$lambda$1((izs) this.c);
                return;
            case 10:
                Reef m = ((hwl0) this.c).m();
                if (m != null) {
                    m.b();
                    return;
                }
                return;
            case 11:
                ((u6m0) this.c).k();
                return;
            case 12:
                ((tcm0) this.c).b.setBottomVisible(true);
                return;
            case 13:
                View view3 = ((SuperappQrCameraActivity) this.c).f;
                (view3 != null ? view3 : null).setSystemUiVisibility(4871);
                return;
            case 14:
                VideoContainerActivity videoContainerActivity = (VideoContainerActivity) this.c;
                int i11 = VideoContainerActivity.B;
                videoContainerActivity.b2(kds0.a.a);
                return;
            case 15:
                ((grt0) this.c).s = true;
                return;
            case 16:
                try {
                    ((Dialog) this.c).dismiss();
                    return;
                } catch (Exception e) {
                    L.i(e);
                    return;
                }
            case 17:
                throw ((Throwable) this.c);
            case 18:
                ((com.vk.auth.main.h) this.c).L0("");
                return;
            default:
                yads.x02.c((yads.x02) this.c);
                return;
        }
    }

    public /* synthetic */ x52(s4m s4mVar, s4m.a aVar) {
        this.b = 3;
        this.c = s4mVar;
    }
}
