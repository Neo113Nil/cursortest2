package xsna;

import android.content.Context;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.foundation.text.Handle;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListSmallVh;
import com.vk.clips.attachments.impl.views.video.ClipsVideoAttachmentPickerFragment;
import com.vk.clips.attachments.impl.views.video.a;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.superapp.browser.internal.commands.controller.VkUiCommand;
import com.vk.superapp.pip.impl.overlay.a;
import com.vkontakte.android.R;
import java.text.SimpleDateFormat;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.jvm.internal.Ref$ObjectRef;
import one.video.view.OneVideoPlayerView;
import xsna.ds60;
import xsna.f3u0;
import xsna.fis;
import xsna.jho0;
import xsna.v14;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class u14 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u14(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        ovv0 J;
        dvv0 a;
        s3q0 showClicked$lambda$7;
        View textureView;
        long j;
        mjo0 d;
        j1z j1zVar;
        us2 us2Var;
        int i = this.b;
        int i2 = 8;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((v14.a) obj2).e.invoke();
                ((dw20) ((Ref$ObjectRef) obj).element).dismiss();
                return s3q0.a;
            case 1:
                StringBuilder a2 = t33.a("UPLOAD_TRACE getOriginalVideoFileInfoFromAttach: filePath=", (String) obj2, ", attach=");
                a2.append(((qr6) obj).c);
                return a2.toString();
            case 2:
                ((hoa) obj2).c.invoke();
                ((etv0) obj).b(false);
                return s3q0.a;
            case 3:
                return new f2d((x6d) ((e2d) obj2).a.getValue(), (i3i0) obj);
            case 4:
                View[] viewArr = (View[]) obj2;
                izs izsVar = (izs) obj;
                if (viewArr != null) {
                    for (View view : viewArr) {
                        if (view != null) {
                            f4m.j(view);
                        }
                    }
                }
                izsVar.invoke(Boolean.FALSE);
                return s3q0.a;
            case 5:
                q2s0 q2s0Var = (q2s0) obj;
                int i3 = ClipsVideoAttachmentPickerFragment.W;
                xn50.a.c((ClipsVideoAttachmentPickerFragment) obj2, new a.h(q2s0Var.a, q2s0Var.b));
                return s3q0.a;
            case 6:
                ((d3h) obj2).h((String) obj, true);
                return s3q0.a;
            case 7:
                hgm hgmVar = (hgm) obj2;
                VkImageSimple vkImageSimple = new VkImageSimple(hgmVar.d, null, 6, 0);
                Pair pair = new Pair(Integer.valueOf(R.drawable.vk_icon_ghost_16), Integer.valueOf(R.attr.vk_ui_icon_tertiary));
                int intValue = ((Number) pair.d()).intValue();
                int intValue2 = ((Number) pair.g()).intValue();
                vkImageSimple.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                omw.d(vkImageSimple, intValue, intValue2);
                vkImageSimple.setContentDescription(null);
                int i4 = hgmVar.p0;
                vkImageSimple.setLayoutParams(egm.W(hgmVar, i4, i4, hgmVar.g0, 0, 0, hgmVar.v0, 24));
                ((ViewGroup) obj).addView(vkImageSimple);
                return vkImageSimple;
            case 8:
                asm asmVar = (asm) obj2;
                DialogExt dialogExt = (DialogExt) obj;
                Peer.Type type = Peer.Type.GROUP;
                Peer peer = dialogExt.f;
                if (peer.c == type) {
                    io.reactivex.rxjava3.internal.operators.single.j jVar = new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(asmVar.b.F(asmVar, new lpu(peer)), new ew(new n9(i2, asmVar, dialogExt), 18)), new uu4(asmVar, 4));
                    int i5 = kwg0.a;
                    asmVar.h.b(jVar.subscribe(new iwg0(), new cp0(new dj1(27), 21)));
                }
                return s3q0.a;
            case 9:
                ((Ref$ObjectRef) obj).element = ovi.a((nxr) obj2, goa0.a);
                return s3q0.a;
            case 10:
                ((izs) obj2).invoke(new fis.a((jis) obj));
                return s3q0.a;
            case 11:
                String str = (String) obj;
                fvv0 M = ((r6y) obj2).M();
                if (M != null && (J = M.J()) != null && (a = J.a(VkUiCommand.COPY_TEXT)) != null) {
                    a.a(str);
                }
                return s3q0.a;
            case 12:
                showClicked$lambda$7 = LegacyShowUseCase.showClicked$lambda$7((Listeners) obj2, (String) obj);
                return showClicked$lambda$7;
            case 13:
                ((com.vk.superapp.pip.impl.overlay.a) obj2).a((a.C1902a) obj);
                return s3q0.a;
            case 14:
                return new SimpleDateFormat(((Context) obj2).getString(R.string.vkim_media_viewer_time_today), ((dn30) obj).e);
            case 15:
                gs60 gs60Var = (gs60) obj2;
                ds60.h.b bVar = (ds60.h.b) obj;
                return new Result(gs60Var.f.f(new glq0(bVar.b, bVar.c, gs60Var.g)));
            case 16:
                OneVideoPlayerView oneVideoPlayerView = (OneVideoPlayerView) obj2;
                Context context = (Context) obj;
                int i6 = OneVideoPlayerView.j;
                int i7 = OneVideoPlayerView.a.$EnumSwitchMapping$0[oneVideoPlayerView.getRenderType().ordinal()];
                if (i7 == 1) {
                    textureView = new TextureView(context);
                } else {
                    if (i7 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textureView = new SurfaceView(context);
                }
                textureView.setVisibility(8);
                oneVideoPlayerView.addView(textureView, 0, new FrameLayout.LayoutParams(-1, -1, 17));
                return textureView;
            case 17:
                ((gzs) obj2).invoke();
                ((wh50) obj).setValue(Boolean.TRUE);
                return s3q0.a;
            case 18:
                g440 g440Var = (g440) obj2;
                e8j0 e8j0Var = (e8j0) obj;
                g440Var.im();
                g440Var.n7(1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                g440Var.setDecorationVisibility(true);
                ((FrameLayout) g440Var.b()).removeView(e8j0Var.z1);
                e8j0Var.hide();
                return s3q0.a;
            case 19:
                gho0 gho0Var = (gho0) obj2;
                long j2 = ((q9x) ((wh50) obj).getValue()).a;
                ov70 k = gho0Var.k();
                long j3 = 9205357640488583168L;
                if (k != null) {
                    long j4 = k.a;
                    us2 o = gho0Var.o();
                    if (o != null && o.c.length() != 0) {
                        Handle handle = (Handle) ((zak0) gho0Var.s).getValue();
                        int i8 = handle == null ? -1 : jho0.c.$EnumSwitchMapping$0[handle.ordinal()];
                        if (i8 != -1) {
                            if (i8 == 1 || i8 == 2) {
                                long j5 = gho0Var.p().b;
                                int i9 = qko0.c;
                                j = j5 >> 32;
                            } else {
                                if (i8 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                long j6 = gho0Var.p().b;
                                int i10 = qko0.c;
                                j = j6 & 4294967295L;
                            }
                            int i11 = (int) j;
                            j1z j1zVar2 = gho0Var.d;
                            if (j1zVar2 != null && (d = j1zVar2.d()) != null && (j1zVar = gho0Var.d) != null && (us2Var = j1zVar.a.a) != null) {
                                int g = swe0.g(gho0Var.b.b(i11), 0, us2Var.c.length());
                                float intBitsToFloat = Float.intBitsToFloat((int) (d.d(j4) >> 32));
                                ljo0 ljo0Var = d.a;
                                m540 m540Var = ljo0Var.b;
                                int d2 = m540Var.d(g);
                                float h = ljo0Var.h(d2);
                                float i12 = ljo0Var.i(d2);
                                float f = swe0.f(intBitsToFloat, Math.min(h, i12), Math.max(h, i12));
                                if (q9x.b(j2, 0L) || Math.abs(intBitsToFloat - f) <= ((int) (j2 >> 32)) / 2) {
                                    float g2 = m540Var.g(d2);
                                    j3 = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(((m540Var.b(d2) - g2) / 2) + g2) & 4294967295L);
                                }
                            }
                        }
                    }
                }
                return new ov70(j3);
            case 20:
                ((qvm0) obj2).invoke((f3u0.c) obj);
                return s3q0.a;
            default:
                ((VideoItemListSmallVh) obj2).n.d((VideoFile) obj);
                return s3q0.a;
        }
    }

    public /* synthetic */ u14(Ref$ObjectRef ref$ObjectRef, nxr nxrVar) {
        this.b = 9;
        this.d = ref$ObjectRef;
        this.c = nxrVar;
    }
}
