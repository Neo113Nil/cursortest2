package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.clips.attachments.impl.views.video.ClipsVideoAttachmentPickerFragment;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.ui.views.InfoBarView;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.ui.ad.AdvertBannerView;
import com.vk.log.L;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import java.util.Collections;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.xn50;

/* compiled from: ArticlePresenter.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class qp3 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qp3(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        l31 l31Var;
        l31 l31Var2;
        g08 g08Var;
        AdvertBannerView advertBannerView;
        AdvertBannerView advertBannerView2;
        AboutVideoItem.c.a aVar;
        l31 l31Var3;
        AboutVideoItem.c.a aVar2;
        l31 l31Var4;
        switch (this.b) {
            case 0:
                L.i((Throwable) obj);
                return s3q0.a;
            case 1:
                ClipsVideoAttachmentPickerFragment clipsVideoAttachmentPickerFragment = (ClipsVideoAttachmentPickerFragment) this.receiver;
                clipsVideoAttachmentPickerFragment.getClass();
                xn50.a.c(clipsVideoAttachmentPickerFragment, (com.vk.clips.attachments.impl.views.video.a) obj);
                return s3q0.a;
            case 2:
                L.i((Throwable) obj);
                return s3q0.a;
            case 3:
                xpp xppVar = (xpp) obj;
                xam xamVar = (xam) this.receiver;
                Dialog Cb = xamVar.t.a.Cb();
                if ((Cb != null ? Cb.zb() : null) == null) {
                    InfoBar infoBar = (InfoBar) xppVar.a();
                    if (infoBar == null) {
                        ktk0 ktk0Var = xamVar.t;
                        if (ktk0Var.g != null) {
                            ktk0Var.g = null;
                            xamVar.a1(ktk0Var.a());
                        }
                    } else {
                        xamVar.t.g = infoBar;
                        zam zamVar = xamVar.u;
                        if (zamVar != null) {
                            zamVar.c();
                            InfoBarView infoBarView = zamVar.c;
                            infoBarView.setVisibility(0);
                            infoBarView.setFromBar(infoBar);
                        }
                        xamVar.a1(infoBar);
                    }
                }
                return s3q0.a;
            case 4:
                ((eka0) this.receiver).h.setText((CharSequence) obj);
                return s3q0.a;
            case 5:
                ((wzh0) this.receiver).n((set0) obj);
                return s3q0.a;
            case 6:
                i31 i31Var = (i31) obj;
                h31 h31Var = (h31) this.receiver;
                if (!epx.f(h31Var.g, i31Var)) {
                    i31 i31Var2 = h31Var.g;
                    boolean f = epx.f((i31Var2 == null || (aVar2 = i31Var2.a) == null || (l31Var4 = aVar2.b) == null) ? null : l31Var4.b.b, (i31Var == null || (aVar = i31Var.a) == null || (l31Var3 = aVar.b) == null) ? null : l31Var3.b.b);
                    h31Var.g = i31Var;
                    int i = 2;
                    if (i31Var != null) {
                        boolean z = i31Var.c;
                        boolean z2 = h31Var.f == null;
                        boolean z3 = z2 && z;
                        VideoMinimizableState P0 = rts0.b.a().P0();
                        if (com.vk.libvideo.api.minimizable.a.k(P0) || (P0 instanceof VideoMinimizableState.FullscreenHorizontal)) {
                            int i2 = -1;
                            if (h31Var.f == null) {
                                AdvertBannerView.c cVar = AdvertBannerView.f;
                                ViewGroup viewGroup = h31Var.a;
                                Context context = viewGroup.getContext();
                                VideoMinimizableDiscoveryFragment.e eVar = h31Var.c;
                                cVar.getClass();
                                AdvertBannerView b = AdvertBannerView.c.b(context, eVar);
                                if (b != null) {
                                    h31Var.f = b;
                                    viewGroup.addView(b, new FrameLayout.LayoutParams(-1, -2));
                                    int a = iah0.a(12);
                                    f4m.s(a, b);
                                    f4m.r(a, b);
                                    f4m.q(iah0.a(34), b);
                                }
                            }
                            boolean z4 = i31Var.b;
                            AboutVideoItem.c.a aVar3 = i31Var.a;
                            boolean z5 = h31Var.d;
                            AdvertBannerView advertBannerView3 = h31Var.f;
                            if (advertBannerView3 != null) {
                                ViewGroup.LayoutParams layoutParams = advertBannerView3.getLayoutParams();
                                if (layoutParams == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                }
                                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                                if (z5) {
                                    i2 = iah0.a(500);
                                } else if (z4) {
                                    i2 = iah0.a(400);
                                }
                                layoutParams2.width = i2;
                                layoutParams2.gravity = z5 ? 81 : 80;
                                advertBannerView3.setLayoutParams(layoutParams2);
                                int a2 = (z5 || z4) ? iah0.a(48) : iah0.a(12);
                                f4m.s(a2, advertBannerView3);
                                f4m.r(a2, advertBannerView3);
                                f4m.q(iah0.a(34), advertBannerView3);
                            }
                            if (!z3 && (advertBannerView = h31Var.f) != null) {
                                AdvertBannerView.c cVar2 = AdvertBannerView.f;
                                advertBannerView.b(z, null);
                            }
                            if (z2 && aVar3 != null && (l31Var2 = aVar3.b) != null && (g08Var = l31Var2.a) != null) {
                                String str = g08Var.a;
                                AdvertBannerView advertBannerView4 = h31Var.f;
                                if (advertBannerView4 != null) {
                                    advertBannerView4.setWebViewClient(new com.vk.libvideo.ui.ad.a(advertBannerView4, AdvertBannerView.Style.FULLSCREEN, new g31(z3, h31Var, i31Var)));
                                    advertBannerView4.loadDataWithBaseURL(null, str, "text/html", C.UTF8_NAME, null);
                                }
                            }
                            if (!f && aVar3 != null && (l31Var = aVar3.b) != null) {
                                h31Var.b.a(Collections.singletonList(l31Var.b.b));
                            }
                            h31Var.e.g();
                        } else if (!z2 && (advertBannerView2 = h31Var.f) != null) {
                            advertBannerView2.b(false, new defpackage.e(h31Var, i));
                        }
                    } else {
                        AdvertBannerView advertBannerView5 = h31Var.f;
                        if (advertBannerView5 != null) {
                            advertBannerView5.b(false, new defpackage.e(h31Var, i));
                        }
                    }
                }
                return s3q0.a;
            default:
                ((xgx0) this.receiver).getClass();
                xgx0.d((Throwable) obj);
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp3(Object obj, int i) {
        super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 2:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 3:
                super(1, obj, xam.class, "showOrCloseInfoBar", "showOrCloseInfoBar(Lcom/vk/im/engine/models/EntityValue;)V", 0);
                break;
            case 7:
                super(1, obj, xgx0.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            default:
                break;
        }
    }
}
