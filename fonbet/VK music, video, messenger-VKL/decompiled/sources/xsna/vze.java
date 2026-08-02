package xsna;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.upload.vk.impl.preview.ClipsPublishViewerOverlayFragment;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.card.VkCard;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vkontakte.android.R;
import java.util.Collections;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.e290;
import xsna.e290.a;
import xsna.xn50;

/* compiled from: ClipsPublishViewerOverlayFragment.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class vze extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vze(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        float f;
        switch (this.b) {
            case 0:
                ClipsPublishViewerOverlayFragment clipsPublishViewerOverlayFragment = (ClipsPublishViewerOverlayFragment) this.receiver;
                clipsPublishViewerOverlayFragment.getClass();
                xn50.a.c(clipsPublishViewerOverlayFragment, (lze) obj);
                return s3q0.a;
            case 1:
                u6h u6hVar = (u6h) this.receiver;
                u6hVar.getClass();
                xn50.a.c(u6hVar, (t6h) obj);
                return s3q0.a;
            case 2:
                Throwable th = (Throwable) obj;
                xam xamVar = (xam) this.receiver;
                f9w f9wVar = xam.y;
                xamVar.getClass();
                xam.y.a(th);
                zam zamVar = xamVar.u;
                if (zamVar != null) {
                    zamVar.b();
                }
                if (xamVar.u != null) {
                    zk70.e(th);
                }
                return s3q0.a;
            case 3:
                Throwable th2 = (Throwable) obj;
                if (((mem) this.receiver).s != null) {
                    zk70.e(th2);
                }
                return s3q0.a;
            default:
                g290 g290Var = (g290) obj;
                e290 e290Var = (e290) this.receiver;
                if (!epx.f(e290Var.e, g290Var)) {
                    e290Var.e = g290Var;
                    if ((g290Var != null ? g290Var.a : null) != null) {
                        ViewGroup viewGroup = e290Var.a;
                        boolean z = e290Var.b;
                        AboutVideoItem.q.b bVar = g290Var.a;
                        boolean z2 = g290Var.c;
                        boolean z3 = g290Var.b;
                        if (bVar != null) {
                            zu50 zu50Var = bVar.c;
                            boolean z4 = e290Var.d == null;
                            VideoMinimizableState P0 = rts0.b.a().P0();
                            if ((P0 instanceof VideoMinimizableState.FullscreenVertical) || (P0 instanceof VideoMinimizableState.FullscreenHorizontal)) {
                                boolean z5 = z2 && e290Var.f != zu50Var;
                                if (e290Var.d == null) {
                                    View inflate = LayoutInflater.from(bwt0.u(viewGroup.getContext())).inflate(z ? R.layout.overlay_ad_banner_player_tablet : R.layout.overlay_ad_banner_player, viewGroup, false);
                                    e290Var.d = inflate;
                                    viewGroup.addView(inflate);
                                    inflate.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    inflate.setVisibility(4);
                                }
                                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                                if (layoutParams == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                }
                                layoutParams.width = (z || z3) ? -2 : -1;
                                layoutParams.height = -2;
                                viewGroup.setLayoutParams(layoutParams);
                                viewGroup.setTranslationZ(101.0f);
                                f4m.r(0, viewGroup);
                                if (z3) {
                                    f4m.q(iah0.a(32), viewGroup);
                                    if (z) {
                                        f4m.s(iah0.a(0), viewGroup);
                                        bwt0.b0(81, viewGroup);
                                    } else {
                                        f4m.s(iah0.a(36), viewGroup);
                                        bwt0.b0(8388691, viewGroup);
                                    }
                                } else {
                                    bwt0.b0(81, viewGroup);
                                    float f2 = 16;
                                    f4m.s(iah0.a(f2), viewGroup);
                                    f4m.r(iah0.a(f2), viewGroup);
                                    f4m.q(iah0.a(32), viewGroup);
                                }
                                AboutVideoItem.q.b bVar2 = g290Var.a;
                                if (bVar2 == null) {
                                    f = 1.0f;
                                } else {
                                    zu50 zu50Var2 = bVar2.c;
                                    f = 1.0f;
                                    cw50 cw50Var = bVar2.b;
                                    String g0 = j5g.g0(rl3.I(new String[]{cw50Var.o, cw50Var.l}), " ", null, null, 0, null, 62);
                                    View view = e290Var.d;
                                    if (view != null) {
                                        VkCard vkCard = (VkCard) view.findViewById(R.id.root);
                                        ViewGroup.LayoutParams layoutParams2 = vkCard.getLayoutParams();
                                        if (layoutParams2 == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                        }
                                        layoutParams2.width = (z || z3) ? -2 : -1;
                                        vkCard.setLayoutParams(layoutParams2);
                                        vkCard.setDrawBorder(true);
                                        e290Var.i = vkCard;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.container);
                                        ViewGroup.LayoutParams layoutParams3 = constraintLayout.getLayoutParams();
                                        if (layoutParams3 == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                        }
                                        layoutParams3.width = z ? iah0.a(600) : z3 ? iah0.a(420) : -1;
                                        constraintLayout.setLayoutParams(layoutParams3);
                                        e290Var.j = constraintLayout;
                                        e290Var.k = (VkImage) view.findViewById(R.id.image);
                                        e290Var.l = (VkText) view.findViewById(R.id.title);
                                        e290Var.m = (VkText) view.findViewById(R.id.subtitle);
                                        e290Var.n = (ConstraintLayout) view.findViewById(R.id.cta_and_label_container);
                                        e290Var.o = (VkButton) view.findViewById(R.id.cta_button);
                                        e290Var.p = (VkText) view.findViewById(R.id.ad_label);
                                        e290Var.q = (VkContentBadge) view.findViewById(R.id.choices_button);
                                        e290Var.t = (VkContentBadge) view.findViewById(R.id.close_button);
                                        e290Var.s = (VkImageSimple) view.findViewById(R.id.disclaimer);
                                        e290Var.r = (Guideline) view.findViewById(R.id.guideline_disclaimer);
                                        VkCard vkCard2 = e290Var.i;
                                        if (vkCard2 == null) {
                                            vkCard2 = null;
                                        }
                                        vkCard2.setBackgroundColor(0);
                                        ConstraintLayout constraintLayout2 = e290Var.j;
                                        if (constraintLayout2 == null) {
                                            constraintLayout2 = null;
                                        }
                                        constraintLayout2.setBackgroundColor(0);
                                        VkImage vkImage = e290Var.k;
                                        if (vkImage == null) {
                                            vkImage = null;
                                        }
                                        kiw kiwVar = cw50Var.v;
                                        String str = cw50Var.h;
                                        vkImage.setImageBitmap(kiwVar != null ? kiwVar.a() : null);
                                        VkText vkText = e290Var.l;
                                        if (vkText == null) {
                                            vkText = null;
                                        }
                                        vkText.setText(cw50Var.g);
                                        VkText vkText2 = e290Var.m;
                                        if (vkText2 == null) {
                                            vkText2 = null;
                                        }
                                        vkText2.setText(cw50Var.i);
                                        if (str == null || str.length() == 0) {
                                            VkButton vkButton = e290Var.o;
                                            if (vkButton == null) {
                                                vkButton = null;
                                            }
                                            vkButton.setText("");
                                            VkButton vkButton2 = e290Var.o;
                                            if (vkButton2 == null) {
                                                vkButton2 = null;
                                            }
                                            vkButton2.setVisibility(8);
                                        } else {
                                            VkButton vkButton3 = e290Var.o;
                                            if (vkButton3 == null) {
                                                vkButton3 = null;
                                            }
                                            vkButton3.setVisibility(0);
                                            VkButton vkButton4 = e290Var.o;
                                            if (vkButton4 == null) {
                                                vkButton4 = null;
                                            }
                                            vkButton4.setText(str);
                                        }
                                        VkText vkText3 = e290Var.p;
                                        if (vkText3 == null) {
                                            vkText3 = null;
                                        }
                                        vkText3.setText(g0);
                                        l0n l0nVar = cw50Var.k;
                                        Integer valueOf = l0nVar != null ? Integer.valueOf(l0nVar.a) : null;
                                        int i = 6;
                                        float f3 = ((valueOf != null && valueOf.intValue() == 6) || (valueOf != null && valueOf.intValue() == 8) || ((valueOf != null && valueOf.intValue() == 9) || (valueOf != null && valueOf.intValue() == 11))) ? 0.2f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                        Guideline guideline = e290Var.r;
                                        if (guideline == null) {
                                            guideline = null;
                                        }
                                        ViewGroup.LayoutParams layoutParams4 = guideline.getLayoutParams();
                                        ConstraintLayout.b bVar3 = layoutParams4 instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams4 : null;
                                        if (bVar3 != null) {
                                            bVar3.c = 1.0f - f3;
                                            Guideline guideline2 = e290Var.r;
                                            if (guideline2 == null) {
                                                guideline2 = null;
                                            }
                                            guideline2.setLayoutParams(bVar3);
                                        }
                                        Integer valueOf2 = ((valueOf != null && valueOf.intValue() == 6) || (valueOf != null && valueOf.intValue() == 8)) ? Integer.valueOf(R.drawable.vk_icon_illustration_disclaimer_medical_42h) : (valueOf != null && valueOf.intValue() == 11) ? Integer.valueOf(R.drawable.vk_icon_illustration_disclaimer_credits_48h) : (valueOf != null && valueOf.intValue() == 9) ? Integer.valueOf(R.drawable.vk_icon_illustration_disclaimer_bad_42h) : null;
                                        if (valueOf2 != null) {
                                            VkImageSimple vkImageSimple = e290Var.s;
                                            if (vkImageSimple == null) {
                                                vkImageSimple = null;
                                            }
                                            vkImageSimple.setImageResource(valueOf2.intValue());
                                            VkImageSimple vkImageSimple2 = e290Var.s;
                                            if (vkImageSimple2 == null) {
                                                vkImageSimple2 = null;
                                            }
                                            vkImageSimple2.setVisibility(0);
                                        } else {
                                            VkImageSimple vkImageSimple3 = e290Var.s;
                                            if (vkImageSimple3 == null) {
                                                vkImageSimple3 = null;
                                            }
                                            vkImageSimple3.setVisibility(8);
                                        }
                                        boolean z6 = valueOf2 != null;
                                        VkText vkText4 = e290Var.l;
                                        if (vkText4 == null) {
                                            vkText4 = null;
                                        }
                                        vkText4.setMaxLines(z6 ? 1 : 2);
                                        ConstraintLayout constraintLayout3 = e290Var.n;
                                        if (constraintLayout3 == null) {
                                            constraintLayout3 = null;
                                        }
                                        f4m.t(z6 ? iah0.a(8) : iah0.a(12), constraintLayout3);
                                        VkButton vkButton5 = e290Var.o;
                                        if (vkButton5 == null) {
                                            vkButton5 = null;
                                        }
                                        vkButton5.setVisibility(z6 ? 8 : 0);
                                        VkText vkText5 = e290Var.l;
                                        if (vkText5 == null) {
                                            vkText5 = null;
                                        }
                                        qj80.a(vkText5, new ug0(vkText5, e290Var, 1));
                                        zu50Var2.r = 5;
                                        VkContentBadge vkContentBadge = e290Var.q;
                                        if (vkContentBadge == null) {
                                            vkContentBadge = null;
                                        }
                                        vkContentBadge.setOnClickListener(new i1f(bVar2, 3));
                                        VkContentBadge vkContentBadge2 = e290Var.t;
                                        if (vkContentBadge2 == null) {
                                            vkContentBadge2 = null;
                                        }
                                        vkContentBadge2.setOnClickListener(new rg0(e290Var, i));
                                        e290.a aVar = e290Var.new a();
                                        VkCard vkCard3 = e290Var.i;
                                        if (vkCard3 == null) {
                                            vkCard3 = null;
                                        }
                                        zu50Var2.h(aVar, Collections.singletonList(vkCard3));
                                        bVar2.e.invoke();
                                    }
                                }
                                if (z5) {
                                    e290Var.f = zu50Var;
                                    boolean z7 = !z3;
                                    View view2 = e290Var.d;
                                    if (view2 != null) {
                                        qj80.a(view2, new f290(view2, e290Var, z7));
                                    }
                                }
                                View view3 = e290Var.d;
                                if (view3 != null) {
                                    if (!z2) {
                                        ObjectAnimator objectAnimator = e290Var.h;
                                        if (objectAnimator != null) {
                                            objectAnimator.cancel();
                                        }
                                        smk0 smk0Var = e290Var.g;
                                        if (smk0Var != null) {
                                            smk0Var.d();
                                        }
                                        view3.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                        view3.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                        view3.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                        view3.setVisibility(8);
                                    } else if (view3.getVisibility() != 0 || view3.getAlpha() != f) {
                                        ObjectAnimator objectAnimator2 = e290Var.h;
                                        if (objectAnimator2 != null) {
                                            objectAnimator2.cancel();
                                        }
                                        if (view3.getVisibility() != 0) {
                                            view3.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                        }
                                        view3.setVisibility(0);
                                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.ALPHA, view3.getAlpha(), f);
                                        ofFloat.setDuration(200L);
                                        ofFloat.start();
                                        e290Var.h = ofFloat;
                                    }
                                }
                            } else if (!z4) {
                                e290Var.a();
                            }
                        }
                    } else {
                        e290Var.a();
                    }
                }
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vze(ClipsPublishViewerOverlayFragment clipsPublishViewerOverlayFragment) {
        super(1, clipsPublishViewerOverlayFragment, ClipsPublishViewerOverlayFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0);
        this.b = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vze(Object obj, int i) {
        super(1, obj, xam.class, "onSendAddFriendError", "onSendAddFriendError(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 3:
                super(1, obj, mem.class, "onCopyToClipboardError", "onCopyToClipboardError(Ljava/lang/Throwable;)V", 0);
                break;
            default:
                break;
        }
    }
}
