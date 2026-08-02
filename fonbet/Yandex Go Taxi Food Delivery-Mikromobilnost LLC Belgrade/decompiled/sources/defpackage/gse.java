package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.mapkit.directions.driving.LaneSign;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.navigation.automotive.layer.BalloonView;
import com.yandex.mapkit.navigation.automotive.layer.LaneSignBalloon;
import com.ybsdk.feature.dashboard.internal.ui.dashboard3.view.DashboardCardView;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.widgets.common.SkeletonView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes3.dex */
public final /* synthetic */ class gse implements wls {
    public final /* synthetic */ int a;

    public /* synthetic */ gse(Ref$ObjectRef ref$ObjectRef, boolean z) {
        this.a = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0118, code lost:
    
        if (defpackage.jl40.l(r0, r1 != null ? r1.i : null) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0145, code lost:
    
        if (defpackage.jl40.l(r0, r1 != null ? r1.j : null) != false) goto L65;
     */
    @Override // defpackage.wls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        View O;
        View O2;
        PolylinePosition position;
        PolylinePosition position2;
        LaneSign laneSign;
        LaneSign laneSign2;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = 0;
        switch (i) {
            case 0:
                return ((fse) obj).plus((dse) obj2);
            case 1:
                return ((fse) obj).plus((dse) obj2);
            case 2:
                fnx0 fnx0Var = (fnx0) obj;
                fnx0 fnx0Var2 = (fnx0) obj2;
                boolean a = fnx0Var.a(fnx0Var2);
                pex0 pex0Var = fnx0Var.c;
                pex0 pex0Var2 = fnx0Var2.c;
                return Boolean.valueOf(a && jl40.l(pex0Var.j0, pex0Var2.j0) && pex0Var.u == pex0Var2.u);
            case 3:
                n751 n751Var = (n751) obj2;
                u1w g = n751Var.a.g(527);
                int i3 = g.c;
                ((View) obj).setPadding(i3, g.b, i3, g.d);
                return n751Var;
            case 4:
                View inflate = ((LayoutInflater) obj).inflate(enh0.ybsdk_item_dashboard_credit_account_loading, (ViewGroup) obj2, false);
                if (inflate != null) {
                    return new wz51((ShimmerFrameLayout) inflate, 8);
                }
                ny61.t("rootView");
                return null;
            case 5:
                View view = (View) obj;
                float floatValue = ((Float) obj2).floatValue();
                view.setTranslationX(floatValue);
                view.setTranslationY(floatValue);
                return zy11Var;
            case 6:
                View view2 = (View) obj;
                float floatValue2 = ((Float) obj2).floatValue();
                view2.setTranslationX(-floatValue2);
                view2.setTranslationY(floatValue2);
                return zy11Var;
            case 7:
                ((View) obj).setTranslationX(((Float) obj2).floatValue());
                return zy11Var;
            case 8:
                ((View) obj).setTranslationY(((Float) obj2).floatValue());
                return zy11Var;
            case 9:
                View inflate2 = ((LayoutInflater) obj).inflate(enh0.ybsdk_screen_dashboard_v3_single_card_item, (ViewGroup) obj2, false);
                int i4 = wah0.amountText;
                TextView textView = (TextView) cma1.O(i4, inflate2);
                if (textView != null && (O = cma1.O((i4 = wah0.backdrop), inflate2)) != null) {
                    i4 = wah0.backdropLinearLayout;
                    LinearLayout linearLayout = (LinearLayout) cma1.O(i4, inflate2);
                    if (linearLayout != null) {
                        i4 = wah0.dashboardProductSkinSelectionImage;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i4, inflate2);
                        if (appCompatImageView != null) {
                            i4 = wah0.dashboardProductSkinSelectionImageFake;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) cma1.O(i4, inflate2);
                            if (appCompatImageView2 != null) {
                                i4 = wah0.dashboardSingleCard;
                                DashboardCardView dashboardCardView = (DashboardCardView) cma1.O(i4, inflate2);
                                if (dashboardCardView != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate2;
                                    i4 = wah0.dashboardV3CardsSkeleton;
                                    View O3 = cma1.O(i4, inflate2);
                                    if (O3 != null) {
                                        int i5 = wah0.backdropShimmer;
                                        SkeletonView skeletonView = (SkeletonView) cma1.O(i5, O3);
                                        if (skeletonView != null) {
                                            i5 = wah0.card;
                                            SkeletonView skeletonView2 = (SkeletonView) cma1.O(i5, O3);
                                            if (skeletonView2 != null) {
                                                t661 t661Var = new t661((ShimmerFrameLayout) O3, skeletonView, skeletonView2, i2);
                                                i4 = wah0.divkitBackdrop;
                                                YbDivView ybDivView = (YbDivView) cma1.O(i4, inflate2);
                                                if (ybDivView != null) {
                                                    i4 = wah0.divkitBackdropSpace;
                                                    Space space = (Space) cma1.O(i4, inflate2);
                                                    if (space != null) {
                                                        i4 = wah0.icon;
                                                        ImageView imageView = (ImageView) cma1.O(i4, inflate2);
                                                        if (imageView != null) {
                                                            i4 = wah0.leftImage;
                                                            ImageView imageView2 = (ImageView) cma1.O(i4, inflate2);
                                                            if (imageView2 != null) {
                                                                i4 = wah0.text;
                                                                TextView textView2 = (TextView) cma1.O(i4, inflate2);
                                                                if (textView2 != null) {
                                                                    return new u661(constraintLayout, textView, O, linearLayout, appCompatImageView, appCompatImageView2, dashboardCardView, t661Var, ybDivView, space, imageView, imageView2, textView2);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        ny61.t("Missing required view with ID: ".concat(O3.getResources().getResourceName(i5)));
                                        return null;
                                    }
                                }
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i4)));
                return null;
            case 10:
                View inflate3 = ((LayoutInflater) obj).inflate(enh0.ybsdk_screen_dashboard_v3_nfc_button_v2, (ViewGroup) obj2, false);
                if (inflate3 != null) {
                    return new win(3, (FrameLayout) inflate3);
                }
                ny61.t("rootView");
                return null;
            case 11:
                View inflate4 = ((LayoutInflater) obj).inflate(enh0.ybsdk_screen_dashboard_v3_toolbar_button, (ViewGroup) obj2, false);
                if (inflate4 != null) {
                    return new v661((ImageView) inflate4);
                }
                ny61.t("rootView");
                return null;
            case 12:
                View inflate5 = ((LayoutInflater) obj).inflate(enh0.ybsdk_top_button_layout, (ViewGroup) obj2, false);
                if (inflate5 != null) {
                    return new f961((AppCompatImageView) inflate5);
                }
                ny61.t("rootView");
                return null;
            case 13:
                View inflate6 = ((LayoutInflater) obj).inflate(enh0.ybsdk_screen_dashboard_v3_loading_widgets, (ViewGroup) obj2, false);
                int i6 = wah0.autotopup;
                if (((SkeletonView) cma1.O(i6, inflate6)) != null) {
                    i6 = wah0.autotopup_title;
                    if (((SkeletonView) cma1.O(i6, inflate6)) != null) {
                        i6 = wah0.banner;
                        if (((SkeletonView) cma1.O(i6, inflate6)) != null) {
                            i6 = wah0.card_1;
                            if (((SkeletonView) cma1.O(i6, inflate6)) != null) {
                                i6 = wah0.card_2;
                                if (((SkeletonView) cma1.O(i6, inflate6)) != null) {
                                    i6 = wah0.cards_title;
                                    if (((SkeletonView) cma1.O(i6, inflate6)) != null) {
                                        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate6;
                                        int i7 = wah0.recent_transactions_title;
                                        if (((SkeletonView) cma1.O(i7, inflate6)) != null && (O2 = cma1.O((i7 = wah0.round_button_1), inflate6)) != null) {
                                            i7 = wah0.round_button_2;
                                            View O4 = cma1.O(i7, inflate6);
                                            if (O4 != null) {
                                                i7 = wah0.round_button_3;
                                                View O5 = cma1.O(i7, inflate6);
                                                if (O5 != null) {
                                                    i7 = wah0.trans_item_1;
                                                    View O6 = cma1.O(i7, inflate6);
                                                    if (O6 != null) {
                                                        i7 = wah0.trans_item_2;
                                                        View O7 = cma1.O(i7, inflate6);
                                                        if (O7 != null) {
                                                            i7 = wah0.trans_item_3;
                                                            View O8 = cma1.O(i7, inflate6);
                                                            if (O8 != null) {
                                                                return new wz51(shimmerFrameLayout, 20);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        i6 = i7;
                                    }
                                }
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate6.getResources().getResourceName(i6)));
                return null;
            case 14:
                String str = (String) obj;
                ((Boolean) obj2).booleanValue();
                return str == null ? "" : str;
            case 15:
                ((Integer) obj2).getClass();
                o791.a((fid) obj, vng.O(1));
                return zy11Var;
            case 16:
                ugh ughVar = (ugh) obj2;
                return scc.g(Integer.valueOf(ughVar.k()), Float.valueOf(y6i0.c(ughVar.l(), -0.5f, 0.5f)), Integer.valueOf(ughVar.o()));
            case 17:
                return Boolean.valueOf(((fnx0) obj).a((fnx0) obj2));
            case 18:
                ((Integer) obj2).getClass();
                c991.k((fid) obj, vng.O(1));
                return zy11Var;
            case 19:
                fnx0 fnx0Var3 = (fnx0) obj;
                fnx0 fnx0Var4 = (fnx0) obj2;
                return Boolean.valueOf(fnx0Var3.a(fnx0Var4) && fnx0Var3.e.d == fnx0Var4.e.d);
            case 20:
                fnx0 fnx0Var5 = (fnx0) obj;
                fnx0 fnx0Var6 = (fnx0) obj2;
                if (fnx0Var5.a(fnx0Var6)) {
                    ati atiVar = fnx0Var5.c.Z;
                    e6i e6iVar = atiVar != null ? atiVar.j : null;
                    ati atiVar2 = fnx0Var6.c.Z;
                    break;
                }
                r4 = false;
                return Boolean.valueOf(r4);
            case 21:
                fnx0 fnx0Var7 = (fnx0) obj;
                fnx0 fnx0Var8 = (fnx0) obj2;
                if (fnx0Var7.a(fnx0Var8)) {
                    ati atiVar3 = fnx0Var7.c.Z;
                    fmi fmiVar = atiVar3 != null ? atiVar3.i : null;
                    ati atiVar4 = fnx0Var8.c.Z;
                    break;
                }
                r4 = false;
                return Boolean.valueOf(r4);
            case 22:
                return Boolean.valueOf(((fnx0) obj).a((fnx0) obj2));
            case 23:
                return Boolean.valueOf(((fnx0) obj).a((fnx0) obj2));
            case 24:
                return y161.o((LayoutInflater) obj, (ViewGroup) obj2);
            case 25:
                BalloonView balloonView = (BalloonView) obj;
                BalloonView balloonView2 = (BalloonView) obj2;
                LaneSignBalloon laneSign3 = balloonView.getBalloon().getLaneSign();
                if (laneSign3 == null || (laneSign2 = laneSign3.getLaneSign()) == null || (position = laneSign2.getPosition()) == null) {
                    position = balloonView.getBalloon().getManoeuvreWithLaneSign().getLaneSign().getPosition();
                }
                LaneSignBalloon laneSign4 = balloonView2.getBalloon().getLaneSign();
                if (laneSign4 == null || (laneSign = laneSign4.getLaneSign()) == null || (position2 = laneSign.getPosition()) == null) {
                    position2 = balloonView2.getBalloon().getManoeuvreWithLaneSign().getLaneSign().getPosition();
                }
                int q = jl40.q(position.getSegmentIndex(), position2.getSegmentIndex());
                if (q == 0) {
                    q = Double.compare(position.getSegmentPosition(), position2.getSegmentPosition());
                }
                return Integer.valueOf(q);
            case 26:
                return Boolean.TRUE;
            case 27:
                return Boolean.valueOf(jl40.l(((hqj) obj).a, ((hqj) obj2).a));
            case 28:
                return Boolean.valueOf(jl40.l((jqj) obj, (jqj) obj2));
            default:
                return Boolean.valueOf(jl40.l((hqj) obj, (hqj) obj2));
        }
    }

    public /* synthetic */ gse(int i, int i2) {
        this.a = i2;
    }

    public /* synthetic */ gse(int i) {
        this.a = i;
    }
}
