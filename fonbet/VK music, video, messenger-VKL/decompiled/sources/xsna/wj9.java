package xsna;

import android.graphics.Bitmap;
import com.vk.camera.editor.stories.impl.multi.CameraPhotoDelegate;
import com.vk.dto.common.Direction;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.media.model.CameraVideoEncoderParameters;
import com.vk.stories.d;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import xsna.mat;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class wj9 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wj9(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    @Override // xsna.gzs
    public final Object invoke() {
        lj30 lj30Var;
        switch (this.b) {
            case 0:
                CameraPhotoDelegate cameraPhotoDelegate = (CameraPhotoDelegate) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                CameraVideoEncoderParameters cameraVideoEncoderParameters = (CameraVideoEncoderParameters) this.e;
                gi9 gi9Var = new gi9(((g440) cameraPhotoDelegate.a.c).getRequireContext());
                com.vk.stories.b.a.getClass();
                q5s0 q5s0Var = cameraVideoEncoderParameters.Gb() ? new q5s0(cameraVideoEncoderParameters.t - cameraVideoEncoderParameters.s) : new q5s0(4000);
                if (bitmap == null) {
                    L.l("encodeImageOverlay", "received image = null");
                } else {
                    cameraVideoEncoderParameters.w = q5s0Var.a;
                    gi9Var.a.setOnCancelListener(new fi9(com.vk.stories.b.a(new d.a.C1804a(bitmap), cameraVideoEncoderParameters, gi9Var)));
                }
                return s3q0.a;
            case 1:
                yg20 yg20Var = (yg20) this.c;
                Peer peer = (Peer) this.d;
                gkx0 gkx0Var = (gkx0) this.e;
                int intValue = ((Number) yg20Var.b.invoke()).intValue();
                List<lj30> invoke = yg20Var.c.invoke(peer, gkx0Var, Direction.BEFORE, 2);
                boolean z = false;
                lj30 lj30Var2 = null;
                if (invoke.isEmpty()) {
                    lj30Var = null;
                } else {
                    lj30 lj30Var3 = (lj30) j5g.Y(invoke);
                    if (lj30Var3.h.equals(gkx0Var)) {
                        lj30Var = (lj30) j5g.b0(1, invoke);
                        lj30Var2 = lj30Var3;
                    } else {
                        lj30Var = (lj30) j5g.b0(0, invoke);
                    }
                }
                if (lj30Var2 == null ? !(lj30Var == null ? yg20Var.d(intValue, peer) : !lj30Var.j && lj30Var.l == intValue) : !(!lj30Var2.i && lj30Var2.l == intValue)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                izs izsVar = (izs) this.c;
                ko50 ko50Var = (ko50) this.d;
                wh50 wh50Var = (wh50) this.e;
                izsVar.invoke(new mat.d(ko50Var.a.a.b));
                wh50Var.setValue(Boolean.FALSE);
                return s3q0.a;
            default:
                ubb0 ubb0Var = (ubb0) this.c;
                UserId userId = (UserId) this.d;
                String str = (String) this.e;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", "uid=" + userId.b + " mid=" + str});
                }
                List<uab0> h = ubb0Var.c.h(String.valueOf(userId.b), str);
                ArrayList arrayList = new ArrayList(c5g.u(h, 10));
                for (uab0 uab0Var : h) {
                    Playlist playlist = new Playlist(new JSONObject(uab0Var.e));
                    playlist.H = uab0Var.d;
                    arrayList.add(playlist);
                }
                return arrayList;
        }
    }
}
