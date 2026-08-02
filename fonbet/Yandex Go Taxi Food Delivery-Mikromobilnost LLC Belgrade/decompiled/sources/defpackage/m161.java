package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.feature.card.internal.presentation.carddetails.CardRequisiteFieldView;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.SkeletonView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes3.dex */
public final class m161 implements zo31 {
    public final FrameLayout a;
    public final AppCompatImageView b;
    public final RecyclerView c;
    public final TextView d;
    public final ImageView e;
    public final ImageView f;
    public final TextView g;
    public final TextView h;
    public final YbDivView i;
    public final YbDivView j;
    public final ErrorView k;
    public final FrameLayout l;
    public final RecyclerView m;
    public final TextView n;
    public final CardRequisiteFieldView o;
    public final CardRequisiteFieldView p;
    public final CardRequisiteFieldView q;
    public final TextView r;
    public final RecyclerView s;
    public final wz51 t;
    public final wz51 u;
    public final wz51 v;
    public final TextView w;
    public final ImageView x;

    public m161(FrameLayout frameLayout, AppCompatImageView appCompatImageView, RecyclerView recyclerView, TextView textView, ImageView imageView, ImageView imageView2, TextView textView2, TextView textView3, YbDivView ybDivView, YbDivView ybDivView2, ErrorView errorView, FrameLayout frameLayout2, RecyclerView recyclerView2, TextView textView4, CardRequisiteFieldView cardRequisiteFieldView, CardRequisiteFieldView cardRequisiteFieldView2, CardRequisiteFieldView cardRequisiteFieldView3, TextView textView5, RecyclerView recyclerView3, wz51 wz51Var, wz51 wz51Var2, wz51 wz51Var3, TextView textView6, ImageView imageView3) {
        this.a = frameLayout;
        this.b = appCompatImageView;
        this.c = recyclerView;
        this.d = textView;
        this.e = imageView;
        this.f = imageView2;
        this.g = textView2;
        this.h = textView3;
        this.i = ybDivView;
        this.j = ybDivView2;
        this.k = errorView;
        this.l = frameLayout2;
        this.m = recyclerView2;
        this.n = textView4;
        this.o = cardRequisiteFieldView;
        this.p = cardRequisiteFieldView2;
        this.q = cardRequisiteFieldView3;
        this.r = textView5;
        this.s = recyclerView3;
        this.t = wz51Var;
        this.u = wz51Var2;
        this.v = wz51Var3;
        this.w = textView6;
        this.x = imageView3;
    }

    public static m161 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        m161 m161Var;
        View O;
        View O2;
        View inflate = layoutInflater.inflate(anh0.ybsdk_fragment_single_card, viewGroup, false);
        int i = sah0.buttonShowHideRequisites;
        AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
        if (appCompatImageView != null) {
            i = sah0.cardAdditionalSettingRecycler;
            RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
            if (recyclerView != null) {
                i = sah0.cardAdditionalTitle;
                TextView textView = (TextView) cma1.O(i, inflate);
                if (textView != null) {
                    i = sah0.cardBadgeImageView;
                    ImageView imageView = (ImageView) cma1.O(i, inflate);
                    if (imageView != null) {
                        i = sah0.cardImageView;
                        ImageView imageView2 = (ImageView) cma1.O(i, inflate);
                        if (imageView2 != null) {
                            i = sah0.cardSubtitleTextView;
                            TextView textView2 = (TextView) cma1.O(i, inflate);
                            if (textView2 != null) {
                                i = sah0.cardTitleTextView;
                                TextView textView3 = (TextView) cma1.O(i, inflate);
                                if (textView3 != null) {
                                    i = sah0.cardToolbar;
                                    if (((ToolbarView) cma1.O(i, inflate)) != null) {
                                        i = sah0.divView;
                                        YbDivView ybDivView = (YbDivView) cma1.O(i, inflate);
                                        if (ybDivView != null) {
                                            i = sah0.divViewBottom;
                                            YbDivView ybDivView2 = (YbDivView) cma1.O(i, inflate);
                                            if (ybDivView2 != null) {
                                                i = sah0.errorView;
                                                ErrorView errorView = (ErrorView) cma1.O(i, inflate);
                                                if (errorView != null) {
                                                    i = sah0.layoutContent;
                                                    FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
                                                    if (frameLayout != null) {
                                                        i = sah0.managementRecycler;
                                                        RecyclerView recyclerView2 = (RecyclerView) cma1.O(i, inflate);
                                                        if (recyclerView2 != null) {
                                                            i = sah0.managementTitle;
                                                            TextView textView4 = (TextView) cma1.O(i, inflate);
                                                            if (textView4 != null) {
                                                                i = sah0.requisiteCardCvv;
                                                                CardRequisiteFieldView cardRequisiteFieldView = (CardRequisiteFieldView) cma1.O(i, inflate);
                                                                if (cardRequisiteFieldView != null) {
                                                                    i = sah0.requisiteCardExpire;
                                                                    CardRequisiteFieldView cardRequisiteFieldView2 = (CardRequisiteFieldView) cma1.O(i, inflate);
                                                                    if (cardRequisiteFieldView2 != null) {
                                                                        i = sah0.requisiteCardNumber;
                                                                        CardRequisiteFieldView cardRequisiteFieldView3 = (CardRequisiteFieldView) cma1.O(i, inflate);
                                                                        if (cardRequisiteFieldView3 != null) {
                                                                            i = sah0.scrollContent;
                                                                            if (((NestedScrollView) cma1.O(i, inflate)) != null) {
                                                                                i = sah0.settingsTitle;
                                                                                TextView textView5 = (TextView) cma1.O(i, inflate);
                                                                                if (textView5 != null) {
                                                                                    i = sah0.settingsView;
                                                                                    RecyclerView recyclerView3 = (RecyclerView) cma1.O(i, inflate);
                                                                                    if (recyclerView3 != null && (O = cma1.O((i = sah0.shimmerLayout), inflate)) != null) {
                                                                                        int i2 = sah0.layoutProgress;
                                                                                        if (((ConstraintLayout) cma1.O(i2, O)) != null) {
                                                                                            i2 = sah0.skeletonCard;
                                                                                            if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                                                i2 = sah0.skeletonCardCvv;
                                                                                                if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                                                    i2 = sah0.skeletonCardDescription;
                                                                                                    if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                                                        i2 = sah0.skeletonCardExpire;
                                                                                                        if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                                                            i2 = sah0.skeletonCardName;
                                                                                                            if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                                                                i2 = sah0.skeletonCardNumber;
                                                                                                                if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                                                                    i2 = sah0.skeletonRequisites;
                                                                                                                    if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                                                                        i2 = sah0.skeletonSetting;
                                                                                                                        if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                                                                            i2 = sah0.skeletonSettingManagement;
                                                                                                                            if (((SkeletonView) cma1.O(i2, O)) != null && (O2 = cma1.O((i2 = sah0.skeletonSettingsList), O)) != null) {
                                                                                                                                i2 = sah0.skeletonSettingsManagementList;
                                                                                                                                View O3 = cma1.O(i2, O);
                                                                                                                                if (O3 != null) {
                                                                                                                                    m161Var = null;
                                                                                                                                    wz51 wz51Var = new wz51((ShimmerFrameLayout) O, 26);
                                                                                                                                    int i3 = sah0.shimmerLayoutForCorpCard;
                                                                                                                                    View O4 = cma1.O(i3, inflate);
                                                                                                                                    if (O4 != null) {
                                                                                                                                        int i4 = sah0.layoutProgressCorpCard;
                                                                                                                                        if (((ConstraintLayout) cma1.O(i4, O4)) != null) {
                                                                                                                                            i4 = sah0.skeletonCardAdditionalCorpCard;
                                                                                                                                            if (((SkeletonView) cma1.O(i4, O4)) != null) {
                                                                                                                                                i4 = sah0.skeletonCardAdditionalCorpCardItemImage1;
                                                                                                                                                if (((SkeletonView) cma1.O(i4, O4)) != null) {
                                                                                                                                                    i4 = sah0.skeletonCardAdditionalCorpCardItemText1;
                                                                                                                                                    if (((SkeletonView) cma1.O(i4, O4)) != null) {
                                                                                                                                                        i4 = sah0.skeletonCardCorpCard;
                                                                                                                                                        if (((SkeletonView) cma1.O(i4, O4)) != null) {
                                                                                                                                                            i4 = sah0.skeletonCardDescriptionCorpCard;
                                                                                                                                                            if (((SkeletonView) cma1.O(i4, O4)) != null) {
                                                                                                                                                                i4 = sah0.skeletonCardDescriptionCorpCard2;
                                                                                                                                                                if (((SkeletonView) cma1.O(i4, O4)) != null) {
                                                                                                                                                                    i4 = sah0.skeletonCardNameCorpCard;
                                                                                                                                                                    if (((SkeletonView) cma1.O(i4, O4)) != null) {
                                                                                                                                                                        i4 = sah0.skeletonManagementCorpCard;
                                                                                                                                                                        if (((SkeletonView) cma1.O(i4, O4)) != null) {
                                                                                                                                                                            i4 = sah0.skeletonManagementItemImage1CorpCard;
                                                                                                                                                                            if (((SkeletonView) cma1.O(i4, O4)) != null) {
                                                                                                                                                                                i4 = sah0.skeletonManagementItemImage2;
                                                                                                                                                                                if (((SkeletonView) cma1.O(i4, O4)) != null) {
                                                                                                                                                                                    i4 = sah0.skeletonManagementItemText1CorpCard;
                                                                                                                                                                                    if (((SkeletonView) cma1.O(i4, O4)) != null) {
                                                                                                                                                                                        i4 = sah0.skeletonManagementItemText2CorpCard;
                                                                                                                                                                                        if (((SkeletonView) cma1.O(i4, O4)) != null) {
                                                                                                                                                                                            i4 = sah0.skeletonSettingCorpCard;
                                                                                                                                                                                            if (((SkeletonView) cma1.O(i4, O4)) != null) {
                                                                                                                                                                                                i4 = sah0.skeletonSettingItemImage1CorpCard;
                                                                                                                                                                                                if (((SkeletonView) cma1.O(i4, O4)) != null) {
                                                                                                                                                                                                    i4 = sah0.skeletonSettingItemImage2CorpCard;
                                                                                                                                                                                                    if (((SkeletonView) cma1.O(i4, O4)) != null) {
                                                                                                                                                                                                        i4 = sah0.skeletonSettingItemText1CorpCard;
                                                                                                                                                                                                        if (((SkeletonView) cma1.O(i4, O4)) != null) {
                                                                                                                                                                                                            i4 = sah0.skeletonSettingItemText2CorpCard;
                                                                                                                                                                                                            if (((SkeletonView) cma1.O(i4, O4)) != null) {
                                                                                                                                                                                                                wz51 wz51Var2 = new wz51((ShimmerFrameLayout) O4, 27);
                                                                                                                                                                                                                i = sah0.shimmerLayoutForSplitTranasctional;
                                                                                                                                                                                                                View O5 = cma1.O(i, inflate);
                                                                                                                                                                                                                if (O5 != null) {
                                                                                                                                                                                                                    int i5 = sah0.layoutProgressSplit;
                                                                                                                                                                                                                    if (((ConstraintLayout) cma1.O(i5, O5)) != null) {
                                                                                                                                                                                                                        i5 = sah0.skeletonCardAdditionalSplit;
                                                                                                                                                                                                                        if (((SkeletonView) cma1.O(i5, O5)) != null) {
                                                                                                                                                                                                                            i5 = sah0.skeletonCardAdditionalSplitItemImage1;
                                                                                                                                                                                                                            if (((SkeletonView) cma1.O(i5, O5)) != null) {
                                                                                                                                                                                                                                i5 = sah0.skeletonCardAdditionalSplitItemText1;
                                                                                                                                                                                                                                if (((SkeletonView) cma1.O(i5, O5)) != null) {
                                                                                                                                                                                                                                    i5 = sah0.skeletonCardDescriptionSplit;
                                                                                                                                                                                                                                    if (((SkeletonView) cma1.O(i5, O5)) != null) {
                                                                                                                                                                                                                                        i5 = sah0.skeletonCardDescriptionSplit2;
                                                                                                                                                                                                                                        if (((SkeletonView) cma1.O(i5, O5)) != null) {
                                                                                                                                                                                                                                            i5 = sah0.skeletonCardNameSplit;
                                                                                                                                                                                                                                            if (((SkeletonView) cma1.O(i5, O5)) != null) {
                                                                                                                                                                                                                                                i5 = sah0.skeletonCardSplit;
                                                                                                                                                                                                                                                if (((SkeletonView) cma1.O(i5, O5)) != null) {
                                                                                                                                                                                                                                                    i5 = sah0.skeletonSettingItemImage1Split;
                                                                                                                                                                                                                                                    if (((SkeletonView) cma1.O(i5, O5)) != null) {
                                                                                                                                                                                                                                                        i5 = sah0.skeletonSettingItemImage2Split;
                                                                                                                                                                                                                                                        if (((SkeletonView) cma1.O(i5, O5)) != null) {
                                                                                                                                                                                                                                                            i5 = sah0.skeletonSettingItemText1Split;
                                                                                                                                                                                                                                                            if (((SkeletonView) cma1.O(i5, O5)) != null) {
                                                                                                                                                                                                                                                                i5 = sah0.skeletonSettingItemText2Split;
                                                                                                                                                                                                                                                                if (((SkeletonView) cma1.O(i5, O5)) != null) {
                                                                                                                                                                                                                                                                    i5 = sah0.skeletonSettingManagementItemImage1;
                                                                                                                                                                                                                                                                    if (((SkeletonView) cma1.O(i5, O5)) != null) {
                                                                                                                                                                                                                                                                        i5 = sah0.skeletonSettingManagementItemImage2;
                                                                                                                                                                                                                                                                        if (((SkeletonView) cma1.O(i5, O5)) != null) {
                                                                                                                                                                                                                                                                            i5 = sah0.skeletonSettingManagementItemImage3;
                                                                                                                                                                                                                                                                            if (((SkeletonView) cma1.O(i5, O5)) != null) {
                                                                                                                                                                                                                                                                                i5 = sah0.skeletonSettingManagementSplit;
                                                                                                                                                                                                                                                                                if (((SkeletonView) cma1.O(i5, O5)) != null) {
                                                                                                                                                                                                                                                                                    i5 = sah0.skeletonSettingManagementSubtitle1;
                                                                                                                                                                                                                                                                                    if (((SkeletonView) cma1.O(i5, O5)) != null) {
                                                                                                                                                                                                                                                                                        i5 = sah0.skeletonSettingManagementSubtitle2;
                                                                                                                                                                                                                                                                                        if (((SkeletonView) cma1.O(i5, O5)) != null) {
                                                                                                                                                                                                                                                                                            i5 = sah0.skeletonSettingManagementSubtitle3;
                                                                                                                                                                                                                                                                                            if (((SkeletonView) cma1.O(i5, O5)) != null) {
                                                                                                                                                                                                                                                                                                i5 = sah0.skeletonSettingManagementText1;
                                                                                                                                                                                                                                                                                                if (((SkeletonView) cma1.O(i5, O5)) != null) {
                                                                                                                                                                                                                                                                                                    i5 = sah0.skeletonSettingManagementText2;
                                                                                                                                                                                                                                                                                                    if (((SkeletonView) cma1.O(i5, O5)) != null) {
                                                                                                                                                                                                                                                                                                        i5 = sah0.skeletonSettingManagementText3;
                                                                                                                                                                                                                                                                                                        if (((SkeletonView) cma1.O(i5, O5)) != null) {
                                                                                                                                                                                                                                                                                                            i5 = sah0.skeletonSettingSplit;
                                                                                                                                                                                                                                                                                                            if (((SkeletonView) cma1.O(i5, O5)) != null) {
                                                                                                                                                                                                                                                                                                                wz51 wz51Var3 = new wz51((ShimmerFrameLayout) O5, 28);
                                                                                                                                                                                                                                                                                                                i3 = sah0.textCardRequisites;
                                                                                                                                                                                                                                                                                                                TextView textView6 = (TextView) cma1.O(i3, inflate);
                                                                                                                                                                                                                                                                                                                if (textView6 != null) {
                                                                                                                                                                                                                                                                                                                    i3 = sah0.titleActionButton;
                                                                                                                                                                                                                                                                                                                    ImageView imageView3 = (ImageView) cma1.O(i3, inflate);
                                                                                                                                                                                                                                                                                                                    if (imageView3 != null) {
                                                                                                                                                                                                                                                                                                                        return new m161((FrameLayout) inflate, appCompatImageView, recyclerView, textView, imageView, imageView2, textView2, textView3, ybDivView, ybDivView2, errorView, frameLayout, recyclerView2, textView4, cardRequisiteFieldView, cardRequisiteFieldView2, cardRequisiteFieldView3, textView5, recyclerView3, wz51Var, wz51Var2, wz51Var3, textView6, imageView3);
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    ny61.t("Missing required view with ID: ".concat(O5.getResources().getResourceName(i5)));
                                                                                                                                                                                                                    return null;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
                                                                                                                                                                                                                return m161Var;
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        ny61.t("Missing required view with ID: ".concat(O4.getResources().getResourceName(i4)));
                                                                                                                                        return null;
                                                                                                                                    }
                                                                                                                                    i = i3;
                                                                                                                                    ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
                                                                                                                                    return m161Var;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        ny61.t("Missing required view with ID: ".concat(O.getResources().getResourceName(i2)));
                                                                                        return null;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        m161Var = null;
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return m161Var;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
