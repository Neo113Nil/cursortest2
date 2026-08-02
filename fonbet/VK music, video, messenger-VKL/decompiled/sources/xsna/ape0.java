package xsna;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog.mvi.block.video.impl.video.largelisttablet.VideoLargeListTabletView;
import com.vk.catalog2.common.ui.mvp.holder.video.showcase.VideoFlatActionViewHolder;
import com.vk.clips.design.view.seek.ClipsSeekBar;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.search.RoundedSearchView;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.uxpolls.UxPoll;
import com.vk.libvideo.offline.dialogs.qualitychooser.presentation.feature.a;
import com.vk.libvideo.ui.VideoAuthorView;
import com.vk.superapp.api.dto.story.WebStoryBox;
import com.vk.video.polls.entrypoint.model.UxPollEntryPoint;
import com.vk.video.polls.entrypoint.model.UxPollEntryPointLocation;
import com.vk.video.ui.edit.fragments.VideoAlbumEditorFragment;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import xsna.gm50;
import xsna.ij20;
import xsna.m8v0;
import xsna.nov;
import xsna.qr60;
import xsna.tra0;
import xsna.ydk0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ape0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ape0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                com.vk.libvideo.offline.dialogs.qualitychooser.presentation.ui.a aVar = (com.vk.libvideo.offline.dialogs.qualitychooser.presentation.ui.a) this.c;
                int i = com.vk.libvideo.offline.dialogs.qualitychooser.presentation.ui.a.p1;
                aVar.getFeature().C(a.b.b);
                return s3q0.a;
            case 1:
                return new m210((ViewGroup) obj, ((r2g0) this.c).i, new RecyclerView.u());
            case 2:
                View view = (View) obj;
                View.OnClickListener onClickListener = ((RoundedSearchView) this.c).f;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                return s3q0.a;
            case 3:
                return Boolean.valueOf(((ClipsSeekBar) this.c).onTouchEvent((MotionEvent) obj));
            case 4:
                ((androidx.appcompat.app.d) this.c).dismiss();
                return s3q0.a;
            case 5:
                ((ij20.a) obj).l(((oyi0) this.c).d);
                return s3q0.a;
            case 6:
                ((e3j0) this.c).b.M6((Integer) obj);
                return s3q0.a;
            case 7:
                hwj0 hwj0Var = (hwj0) this.c;
                ohi0<? super s3q0> ohi0Var = hwj0Var.f;
                if (!epx.f(ohi0Var, ohi0Var)) {
                    gxc0.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                qh50<Object> qh50Var = hwj0Var.e;
                Object obj2 = hwj0Var.c;
                if (qh50Var != null) {
                    if (obj2 != null) {
                        gxc0.b("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    qh50Var.e(obj);
                } else if (obj2 == null) {
                    hwj0Var.c = obj;
                } else {
                    qh50<Object> a = k5h0.a();
                    a.e(obj2);
                    a.e(obj);
                    hwj0Var.e = a;
                    hwj0Var.c = null;
                }
                return s3q0.a;
            case 8:
                odk0 odk0Var = (odk0) this.c;
                gm50.a.a(odk0Var, ((ydk0.a) obj).a, new pf40(odk0Var, 21));
                return s3q0.a;
            case 9:
                wh50 wh50Var = (wh50) this.c;
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                wh50Var.setValue(bool);
                return s3q0.a;
            case 10:
                azl0 azl0Var = (azl0) this.c;
                com.vk.upload.impl.b bVar = (com.vk.upload.impl.b) obj;
                bVar.h.b = azl0Var;
                return new io.reactivex.rxjava3.internal.operators.observable.s0(new k3c0(azl0Var, bVar)).r0(asu0.a.c());
            case 11:
                return WebStoryBox.zb((WebStoryBox) this.c, ((File) obj).getAbsolutePath(), null, null, 243);
            case 12:
                g4m0 g4m0Var = (g4m0) this.c;
                wk2 y = ((pvf) obj).y();
                if (y == null) {
                    throw new NullPointerException("Null anim res");
                }
                g4m0 g4m0Var2 = new g4m0(y, g4m0Var.i, g4m0Var.j);
                nov.a.b(g4m0Var, g4m0Var2);
                return g4m0Var2;
            case 13:
                k9x k9xVar = (k9x) obj;
                return ((CharSequence) this.c).subSequence(k9xVar.b, k9xVar.c + 1).toString();
            case 14:
                y9n0 y9n0Var = (y9n0) this.c;
                o820 o820Var = (o820) obj;
                y9n0Var.c.a = o820Var.a;
                x9n0 x9n0Var = y9n0Var.b;
                View view2 = x9n0Var.i1;
                if (view2 != null) {
                    f4m.j(view2);
                }
                RecyclerView recyclerView = x9n0Var.h1;
                if (recyclerView != null) {
                    recyclerView.setVisibility(0);
                }
                x9n0Var.j1.setItems(o820Var.a);
                RecyclerView recyclerView2 = x9n0Var.h1;
                if (recyclerView2 != null) {
                    recyclerView2.post(new bv9(x9n0Var, 17));
                }
                return s3q0.a;
            case 15:
                mtk0 mtk0Var = (mtk0) this.c;
                tdu tduVar = (tdu) obj;
                tduVar.A(((Number) mtk0Var.getValue()).floatValue());
                tduVar.B(((Number) mtk0Var.getValue()).floatValue());
                return s3q0.a;
            case 16:
                ((tra0.a) obj).q((tra0) this.c, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            case 17:
                ((ArrayList) this.c).add((String) obj);
                return s3q0.a;
            case 18:
                return ((isq0) this.c).b.e(new awq0((qr60.a) obj));
            case 19:
                jtq0 jtq0Var = (jtq0) this.c;
                kk6 kk6Var = (kk6) obj;
                UserId userId = jtq0Var.b.a;
                dvq0 dvq0Var = jtq0Var.d;
                kk6Var.a(userId, dvq0Var.h().e, dvq0Var.a(jtq0Var.b.a));
                return kk6Var;
            case 20:
                UxPollEntryPointLocation uxPollEntryPointLocation = (UxPollEntryPointLocation) this.c;
                UxPoll uxPoll = (UxPoll) ((Map) obj).get(uxPollEntryPointLocation);
                return Optional.ofNullable(uxPoll != null ? new UxPollEntryPoint(uxPoll, uxPollEntryPointLocation, true) : null);
            case 21:
                ((v6r0) this.c).b((View) obj);
                return s3q0.a;
            case 22:
                jpr0 jpr0Var = (jpr0) this.c;
                fqr0 fqr0Var = jpr0Var.h;
                View moreButtonView = jpr0Var.b.getSideControlPanel().getMoreButtonView();
                fqr0Var.getClass();
                int i2 = m8v0.M;
                m8v0.a.a(moreButtonView, (String) obj, null, null, VkTooltip$MarkerSize.Size64, null, VkTooltip$BalloonPosition.BottomLeft, VkTooltip$BalloonTilt.Right, new t3v(22), new oan0(5), null, null, null, null, null, 0, false, null, null, false, null, false, 16776236);
                return s3q0.a;
            case 23:
                brr0 brr0Var = (brr0) this.c;
                pk30 pk30Var = brr0Var.n;
                if (pk30Var != null) {
                    List<Integer> list = brr0Var.p;
                    pk30Var.e(list != null ? list : null);
                }
                return Boolean.TRUE;
            case 24:
                String str = (String) obj;
                VkText vkText = ((VideoAlbumEditorFragment) this.c).d0;
                if (vkText != null) {
                    vkText.setText(str);
                }
                return s3q0.a;
            case 25:
                ((VideoAuthorView) this.c).e.invoke(VideoAuthorView.Action.AvatarClick);
                return s3q0.a;
            case 26:
                gas0 gas0Var = (gas0) this.c;
                r8s0 r8s0Var = gas0Var.f;
                int i3 = n0a.a;
                r8s0Var.getClass();
                gas0Var.g.getClass();
                return s3q0.a;
            case 27:
                ((ojt) obj).l = ((VideoFlatActionViewHolder) this.c).f;
                return s3q0.a;
            case 28:
                VideoLargeListTabletView.State state = (VideoLargeListTabletView.State) obj;
                return new VideoLargeListTabletView.State(state.b, state.c, state.d, (VideoFile) this.c, state.f, state.g, state.h);
            default:
                t1t0 t1t0Var = (t1t0) this.c;
                vqt vqtVar = (vqt) obj;
                t1t0Var.j.l(vqtVar.b);
                com.vk.lists.c cVar = t1t0Var.j;
                String j = cVar.j();
                if (j == null || j.length() == 0 || vqtVar.a.isEmpty()) {
                    cVar.r(false);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ ape0(gas0 gas0Var, Context context) {
        this.b = 26;
        this.c = gas0Var;
    }
}
