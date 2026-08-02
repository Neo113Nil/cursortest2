package xsna;

import android.animation.ObjectAnimator;
import android.content.Context;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.content.design.view.camera.ShutterButton;
import com.vk.dto.common.id.UserId;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.libvideo.ui.dialog.single.VideoDialog;
import com.vk.music.offline.impl.sync.MusicOfflineSyncServiceHelper;
import com.vk.music.offline.impl.sync.a;
import kotlin.Result;
import ru.mail.libverify.j.c;
import ru.ok.android.externcalls.sdk.settings.RemoteSettingsShared;
import ru.ok.android.webrtc.PeerConnectionClient;
import yads.Cif;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class sc2 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sc2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object failure;
        Object failure2;
        Object failure3;
        Object failure4;
        switch (this.b) {
            case 0:
                ((gzs) this.c).invoke();
                return;
            case 1:
                ((ObjectAnimator) ((bq2) this.c).c).cancel();
                return;
            case 2:
                MasksWrap masksWrap = ((CameraUIView) this.c).b0;
                if (masksWrap == null || masksWrap.getSelectedMask() == null) {
                    return;
                }
                masksWrap.H();
                return;
            case 3:
                ChatFragment chatFragment = (ChatFragment) this.c;
                sev0 h = chatFragment.r0.h();
                Context requireContext = chatFragment.requireContext();
                long j = chatFragment.no().b;
                long ho = chatFragment.ho();
                h.getClass();
                ra20 ra20Var = ra20.a;
                Long valueOf = Long.valueOf(j);
                ra20Var.getClass();
                ra20.c(requireContext, ho, valueOf);
                return;
            case 4:
                com.vk.music.offline.impl.sync.d dVar = (com.vk.music.offline.impl.sync.d) this.c;
                dVar.getClass();
                UserId c = o25.a().c();
                if (epx.f(dVar.l, c)) {
                    return;
                }
                dVar.l = c;
                dVar.m = Boolean.TRUE;
                boolean A0 = dVar.i().A0();
                boolean l0 = dVar.i().l0();
                boolean j0 = dVar.i().j0();
                if (A0 && !dVar.i().G0() && dVar.f.g()) {
                    dVar.i().J(c);
                }
                int i = 0;
                if (!A0 || !l0 || !j0) {
                    Integer e = dVar.f.e();
                    if (e == null) {
                        dVar.m = Boolean.FALSE;
                    } else if (e.intValue() == 0) {
                        dVar.i().q0(c);
                        dVar.i().K(c);
                        dVar.i().m(c);
                        dVar.m = Boolean.FALSE;
                    } else {
                        if (!A0 && dVar.f.g()) {
                            dVar.i().J(c);
                        }
                        boolean z = (A0 && j0) ? false : true;
                        try {
                            if (!A0) {
                                dVar.q(e.intValue(), c);
                            } else if (!l0) {
                                dVar.l(c, e.intValue(), null);
                                int intValue = e.intValue();
                                dq40 dq40Var = dVar.c;
                                Context context = dVar.b;
                                dq40Var.E(intValue, c, context.getCacheDir().getAbsolutePath(), context.getFilesDir().getAbsolutePath());
                                dq40Var.L(intValue, c, context.getCacheDir().getAbsolutePath(), context.getFilesDir().getAbsolutePath());
                                if (!j0) {
                                    dVar.t(e.intValue(), c);
                                }
                            } else if (!j0) {
                                dVar.t(e.intValue(), c);
                            }
                            failure = s3q0.a;
                        } catch (Throwable th) {
                            failure = new Result.Failure(th);
                        }
                        if (!(failure instanceof Result.Failure)) {
                            if (z) {
                                new a.j(!A0, !j0, dVar.i().A0(), dVar.i().j0(), e.toString(), dVar.k.get(e) != null).q();
                            }
                        }
                        Throwable a = Result.a(failure);
                        if (a != null) {
                            if (!A0 || !l0) {
                                dVar.i().q0(c);
                                dVar.i().K(c);
                                dVar.i().m(c);
                            } else if (!j0) {
                                dVar.i().m(c);
                                dVar.i().K(c);
                            }
                            new a.j(e.toString(), !A0, !j0, dVar.i().A0(), dVar.i().j0(), dVar.k.get(e) != null, a).q();
                        }
                        dVar.m = Boolean.FALSE;
                    }
                }
                dq40 dq40Var2 = dVar.c;
                MusicOfflineSyncServiceHelper musicOfflineSyncServiceHelper = dVar.f;
                boolean L0 = dVar.i().L0();
                boolean j02 = dVar.i().j0();
                boolean g0 = dVar.i().g0();
                boolean Y = dVar.i().Y();
                if (!g0) {
                    try {
                        com.vk.music.offline.impl.sync.b.a(c, dVar.h(musicOfflineSyncServiceHelper.e()), dq40Var2, new br40(dVar), dVar.i());
                    } catch (Throwable th2) {
                        failure2 = new Result.Failure(th2);
                    }
                }
                failure2 = s3q0.a;
                if (!(failure2 instanceof Result.Failure)) {
                    if (!g0) {
                        new a.h(i).q();
                    }
                }
                Throwable a2 = Result.a(failure2);
                if (a2 != null) {
                    new a.h(a2).q();
                    dVar.i().i0(c);
                }
                if (!Y) {
                    try {
                        com.vk.music.offline.impl.sync.c.a(c, dVar.h(musicOfflineSyncServiceHelper.e()), dq40Var2, new cr40(dVar), dVar.i());
                    } catch (Throwable th3) {
                        failure3 = new Result.Failure(th3);
                    }
                }
                failure3 = s3q0.a;
                if (!(failure3 instanceof Result.Failure)) {
                    if (!Y) {
                        new a.k(i).q();
                    }
                }
                Throwable a3 = Result.a(failure3);
                if (a3 != null) {
                    new a.k(a3).q();
                    dVar.i().A(c);
                }
                boolean z2 = j02 && !L0;
                if (z2) {
                    try {
                        a.q.h.q();
                        dVar.r(c);
                    } catch (Throwable th4) {
                        failure4 = new Result.Failure(th4);
                    }
                }
                failure4 = s3q0.a;
                if (!(failure4 instanceof Result.Failure)) {
                    if (z2) {
                        new a.i(i).q();
                    }
                }
                Throwable a4 = Result.a(failure4);
                if (a4 != null) {
                    new a.i(a4).q();
                }
                dVar.l = null;
                return;
            case 5:
                ((PeerConnectionClient) this.c).h();
                return;
            case 6:
                com.vk.newsfeed.posting.geo_picker.presentation.e eVar = (com.vk.newsfeed.posting.geo_picker.presentation.e) this.c;
                int i2 = com.vk.newsfeed.posting.geo_picker.presentation.e.t1;
                eVar.On(3);
                return;
            case 7:
                RemoteSettingsShared.scheduleCreateNewSettings$lambda$0$0((RemoteSettingsShared) this.c);
                return;
            case 8:
                ShutterButton shutterButton = (ShutterButton) this.c;
                float f = ShutterButton.L;
                shutterButton.c();
                shutterButton.invalidate();
                return;
            case 9:
                xan0 xan0Var = (xan0) this.c;
                if (xan0Var != null) {
                    try {
                        s3q0 s3q0Var = s3q0.a;
                        return;
                    } catch (Throwable th5) {
                        fco0.c();
                        if (th5 instanceof InterruptedException) {
                            throw th5;
                        }
                        i0q0.c(new RuntimeException("Unhandled exception during queue event processing: " + xan0Var.a.a, th5));
                        return;
                    }
                }
                return;
            case 10:
                throw ((Throwable) this.c);
            case 11:
                ((izs) this.c).invoke(5);
                return;
            case 12:
                VideoDialog videoDialog = (VideoDialog) this.c;
                int i3 = VideoDialog.P0;
                videoDialog.O.setVisibility(8);
                videoDialog.Yb();
                return;
            case 13:
                c.b.a((ru.mail.libverify.j.c) this.c);
                return;
            default:
                Cif.a((o7i) this.c);
                return;
        }
    }
}
