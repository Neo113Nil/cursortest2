package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.button.VkButton;
import com.vk.music.stickybannerad.MusicStickyBannerReporter$MusicStickyBannerEventType;
import com.vk.music.stickyplayer.presentation.components.ParentBottomSheetState;
import com.vk.mvi.MviLazyViewContainer;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import org.chromium.net.NetError;
import xsna.gm50;
import xsna.kel0;
import xsna.mk50;
import xsna.pv40;
import xsna.tv40;
import xsna.uv40;
import xsna.ydl0;

/* compiled from: MusicPlayerAdvertisingMviView.kt */
/* loaded from: classes3.dex */
public final class rv40 extends MviLazyViewContainer<ov40, uv40, pv40> {
    public final Object g;
    public final Object h;
    public CardView i;
    public final sv40 j;

    /* compiled from: MusicPlayerAdvertisingMviView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ParentBottomSheetState.values().length];
            try {
                iArr[ParentBottomSheetState.COLLAPSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ParentBottomSheetState.EXPANDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ParentBottomSheetState.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public rv40(Context context) {
        super(context);
        s6y s6yVar = new s6y(this, 11);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.g = msy.a(lazyThreadSafetyMode, s6yVar);
        this.h = msy.a(lazyThreadSafetyMode, new gzv(this, 18));
        this.j = new sv40(tv40.b.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final p2k0 getSlotIdController() {
        return (p2k0) this.g.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final oel0 getVisibilityListener() {
        return (oel0) this.h.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static s3q0 k(rv40 rv40Var, uv40.b bVar) {
        View view;
        String str;
        VkButton vkButton;
        String str2;
        Resources resources;
        int dimensionPixelSize;
        View view2;
        ViewGroup.LayoutParams layoutParams;
        CardView cardView = rv40Var.i;
        if (cardView == null) {
            cardView = null;
        }
        cardView.removeAllViews();
        uv40.a a2 = bVar.a.a();
        if (a2 instanceof uv40.a.C3835a) {
            CardView cardView2 = rv40Var.i;
            if (cardView2 == null) {
                cardView2 = null;
            }
            uv40.a.C3835a c3835a = (uv40.a.C3835a) a2;
            boolean z = c3835a.c;
            ydl0 ydl0Var = c3835a.a;
            bwt0.p0(cardView2, z);
            rv40Var.getVisibilityListener().a.onNext(Boolean.valueOf(z));
            g850 g850Var = new g850(rv40Var.getContext());
            ydl0.b bVar2 = c3835a.b;
            if (bVar2 instanceof ydl0.b.AbstractC4094b.C4095b) {
                view = null;
            } else {
                if (!(bVar2 instanceof ydl0.b.AbstractC4094b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                kel0.a aVar = ((ydl0.b.AbstractC4094b.a) bVar2).a;
                String str3 = aVar.a;
                String str4 = aVar.b;
                String str5 = aVar.c;
                float f = aVar.k;
                String str6 = aVar.d;
                String str7 = aVar.g;
                bpn0 bpn0Var = g850Var.e;
                TextView textView = (TextView) bpn0Var.getValue();
                if (textView != null) {
                    textView.setText(str3);
                }
                String str8 = (str5 == null || str5.length() <= 0) ? (str4 == null || str4.length() <= 0) ? null : str4 : str5;
                bpn0 bpn0Var2 = g850Var.c;
                if (str8 != null) {
                    TextView textView2 = (TextView) bpn0Var2.getValue();
                    if (textView2 != null) {
                        textView2.setText(str8);
                    }
                } else {
                    TextView textView3 = (TextView) bpn0Var.getValue();
                    if (textView3 != null) {
                        textView3.setMaxLines(2);
                    }
                    TextView textView4 = (TextView) bpn0Var2.getValue();
                    if (textView4 != null) {
                        textView4.setVisibility(8);
                    }
                }
                String str9 = aVar.f;
                if (str9 == null || str9.length() == 0) {
                    str9 = null;
                }
                view = g850Var.a;
                if (str9 == null) {
                    str9 = view.getContext().getString(R.string.music_banner_advertising_label_default);
                }
                TextView textView5 = (TextView) g850Var.g.getValue();
                if (textView5 != null) {
                    textView5.setText(str9);
                }
                if (str7 != null && str7.length() > 0) {
                    bpn0 bpn0Var3 = g850Var.h;
                    TextView textView6 = (TextView) bpn0Var3.getValue();
                    if (textView6 != null) {
                        textView6.setVisibility(0);
                    }
                    TextView textView7 = (TextView) bpn0Var3.getValue();
                    if (textView7 != null) {
                        textView7.setText(str7);
                    }
                }
                boolean z2 = aVar.h;
                bpn0 bpn0Var4 = g850Var.j;
                if (z2) {
                    float f2 = aVar.i;
                    if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && aVar.j > 0) {
                        String valueOf = String.valueOf(f2);
                        View view3 = (View) bpn0Var4.getValue();
                        if (view3 != null) {
                            view3.setVisibility(0);
                        }
                        bpn0 bpn0Var5 = g850Var.i;
                        TextView textView8 = (TextView) bpn0Var5.getValue();
                        if (textView8 != null) {
                            textView8.setText(valueOf);
                        }
                        TextView textView9 = (TextView) bpn0Var5.getValue();
                        if (textView9 != null) {
                            textView9.setVisibility(0);
                        }
                        View view4 = (View) g850Var.k.getValue();
                        if (view4 != null) {
                            view4.setVisibility(0);
                        }
                        Context context = view.getContext();
                        str = aVar.e;
                        if (str != null || str.length() == 0) {
                            str = context.getString(R.string.music_banner_call_to_action_button_text);
                        }
                        vkButton = (VkButton) g850Var.b.getValue();
                        if (vkButton != null) {
                            vkButton.setContentDescription(str);
                        }
                        Context context2 = view.getContext();
                        str2 = aVar.a;
                        if (str5 == null && str5.length() > 0) {
                            str4 = str5;
                        } else if (str4 != null || str4.length() <= 0) {
                            str4 = null;
                        }
                        if (str4 != null && str4.length() != 0) {
                            str2 = fo8.a(str2, str4);
                        }
                        view.setContentDescription(context2.getString(R.string.music_banner_ad_container_accessibility, str2));
                        if (f != 1.0f && (resources = view.getContext().getResources()) != null) {
                            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.vk_music_sticky_banner_image_size_medium);
                            view2 = (View) g850Var.d.getValue();
                            if (view2 != null && (layoutParams = view2.getLayoutParams()) != null) {
                                layoutParams.width = an10.b(dimensionPixelSize * f);
                            }
                        }
                    }
                }
                if (str6 != null && str6.length() > 0) {
                    View view5 = (View) bpn0Var4.getValue();
                    if (view5 != null) {
                        view5.setVisibility(0);
                    }
                    bpn0 bpn0Var6 = g850Var.f;
                    TextView textView10 = (TextView) bpn0Var6.getValue();
                    if (textView10 != null) {
                        textView10.setVisibility(0);
                    }
                    TextView textView11 = (TextView) bpn0Var6.getValue();
                    if (textView11 != null) {
                        textView11.setText(str6);
                    }
                }
                Context context3 = view.getContext();
                str = aVar.e;
                if (str != null) {
                }
                str = context3.getString(R.string.music_banner_call_to_action_button_text);
                vkButton = (VkButton) g850Var.b.getValue();
                if (vkButton != null) {
                }
                Context context22 = view.getContext();
                str2 = aVar.a;
                if (str5 == null) {
                }
                if (str4 != null) {
                }
                str4 = null;
                if (str4 != null) {
                    str2 = fo8.a(str2, str4);
                }
                view.setContentDescription(context22.getString(R.string.music_banner_ad_container_accessibility, str2));
                if (f != 1.0f) {
                    dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.vk_music_sticky_banner_image_size_medium);
                    view2 = (View) g850Var.d.getValue();
                    if (view2 != null) {
                        layoutParams.width = an10.b(dimensionPixelSize * f);
                    }
                }
            }
            if (view != null) {
                ydl0Var.a();
                CardView cardView3 = rv40Var.i;
                if (cardView3 == null) {
                    cardView3 = null;
                }
                cardView3.addView(ydl0Var.g(view));
                CardView cardView4 = rv40Var.i;
                if (cardView4 == null) {
                    cardView4 = null;
                }
                cardView4.requestLayout();
                if (z) {
                    SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem = new SchemeStat$TypeDevNullItem(DevNullEventKey.AUDIO_PLAYER_ADS_BANNERS.h(), null, null, null, rv40Var.getSlotIdController().v0(), null, String.valueOf(rv40Var.getSlotIdController().a()), null, MusicStickyBannerReporter$MusicStickyBannerEventType.SHOW_SUCCESS.h(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, NetError.ERR_INVALID_AUTH_CREDENTIALS, 3, null);
                    l5m l5mVar = new l5m(null, null, 3);
                    l5mVar.g = schemeStat$TypeDevNullItem;
                    l5mVar.q();
                }
            }
        } else {
            CardView cardView5 = rv40Var.i;
            bwt0.p0(cardView5 != null ? cardView5 : null, false);
            rv40Var.getVisibilityListener().a.onNext(Boolean.FALSE);
        }
        return s3q0.a;
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        CardView cardView = new CardView(getContext(), null);
        cardView.setRadius(iah0.a(12));
        cardView.setForeground(cardView.getContext().getDrawable(R.drawable.advertise_banner_background));
        cardView.setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.i = cardView;
        mk50.c cVar = new mk50.c(cardView);
        int a2 = iah0.a(8);
        f4m.s(a2, this);
        f4m.r(a2, this);
        return cVar;
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        gm50.a.b(this, ((uv40) ao50Var).a, new o3w(this, 18));
    }

    public final void l(ParentBottomSheetState parentBottomSheetState) {
        boolean z;
        int i = a.$EnumSwitchMapping$0[parentBottomSheetState.ordinal()];
        if (i == 1 || i == 2) {
            z = true;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
        }
        getFeature().C(new pv40.b(z));
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getFeature().C(new pv40.a(configuration != null && configuration.orientation == 1));
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new ov40(this.j, new mo8(this), getSlotIdController());
    }
}
