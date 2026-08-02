package xsna;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.card.VkCard;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.superapp.ui.widgets.tile.ImageWithAction;
import com.vk.superapp.ui.widgets.tile.TileBadgeInfo;
import com.vk.superapp.ui.widgets.tile.TileBottomContent;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.e3m;

/* compiled from: SuperAppTileBaseWidgetHolder.kt */
/* loaded from: classes6.dex */
public class fcn0 extends ucn0<men0> {
    public static final int B;
    public final u7n0 p;
    public final VkContentBadge q;
    public final LinearLayout r;
    public final TextView s;
    public final TextView t;
    public final VkButton u;
    public final ConstraintLayout v;
    public final vbn0 w;
    public final bpn0 x;
    public static final int y = iah0.a(88);
    public static final int z = iah0.a(42);
    public static final int A = iah0.a(173);

    /* compiled from: SuperAppTileBaseWidgetHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TileBadgeInfo.BadgeType.values().length];
            try {
                iArr[TileBadgeInfo.BadgeType.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TileBadgeInfo.BadgeType.DISCOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TileBadgeInfo.BadgeType.TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TileBottomContent.BottomContentType.values().length];
            try {
                iArr2[TileBottomContent.BottomContentType.TITLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TileBottomContent.BottomContentType.SUBTITLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TileBottomContent.BottomContentType.BUTTON.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[TileBottomContent.BottomContentType.USER_STACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        iah0.a(6);
        iah0.a(60);
        iah0.a(24);
        B = iah0.a(16);
    }

    public fcn0(View view, u7n0 u7n0Var) {
        super(view, null);
        this.p = u7n0Var;
        e3m.b(this.itemView.getContext());
        VkCard vkCard = (VkCard) this.itemView.findViewById(R.id.tile_root_view);
        this.q = (VkContentBadge) this.itemView.findViewById(R.id.badge_view);
        LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.bottom_content_container);
        this.r = linearLayout;
        TextView textView = (TextView) linearLayout.findViewById(R.id.title_text_view);
        this.s = textView;
        TextView textView2 = (TextView) linearLayout.findViewById(R.id.subtitle_text_view);
        this.t = textView2;
        VkButton vkButton = (VkButton) linearLayout.findViewById(R.id.action_button_view);
        this.u = vkButton;
        ConstraintLayout constraintLayout = (ConstraintLayout) linearLayout.findViewById(R.id.user_stack_view);
        this.v = constraintLayout;
        vbn0 vbn0Var = new vbn0(constraintLayout.getContext());
        this.w = vbn0Var;
        this.x = new bpn0(new zo80(8));
        this.itemView.setClipToOutline(true);
        jjc.g(this.itemView, new ap30(this, 20));
        vkCard.setForeground(this.itemView.getContext().getDrawable(R.drawable.vk_tile_ripple_foreground));
        vbn0Var.setIconSize(B);
        ((FrameLayout) constraintLayout.findViewById(R.id.avatars_container)).addView(vbn0Var);
        textView.setTextAppearance(R.style.VkUiTypography_Headline1Medium);
        textView.setTextColor(e3m.f(R.attr.vk_ui_text_primary, textView.getContext()));
        textView.setTextSize(0, textView.getResources().getDimension(R.dimen.vk_tile_widget_title_text_v6_size));
        textView.setMaxLines(2);
        textView2.setTextSize(0, this.itemView.getContext().getResources().getDimension(R.dimen.vk_tile_widget_subtitle_text_v6_size));
        vkCard.setElevation(iah0.b(0.7f));
        vkCard.setBackgroundColorAttr(R.attr.vk_ui_background_modal);
        vkCard.setBorderColorAttr(R.attr.vk_ui_separator_secondary);
        vkCard.setDrawBorder(true);
        vkCard.setCardRadius(cn70.a() * 12.0f);
        vkButton.setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        VkButton.Appearance appearance = VkButton.Appearance.Neutral;
        VkButton.Mode mode = VkButton.Mode.Secondary;
        vkButton.setAppearance(appearance);
        vkButton.setMode(mode);
    }

    @Override // xsna.hf6
    /* renamed from: g6, reason: merged with bridge method [inline-methods] */
    public void W5(men0 men0Var) {
        ArrayList arrayList;
        WebImageSize f;
        TileBadgeInfo tileBadgeInfo = men0Var.c().o.d;
        int i = 2;
        VkContentBadge vkContentBadge = this.q;
        if (tileBadgeInfo == null) {
            f4m.j(vkContentBadge);
        } else {
            String str = tileBadgeInfo.c;
            vkContentBadge.setVisibility(0);
            int i2 = a.$EnumSwitchMapping$0[tileBadgeInfo.b.ordinal()];
            if (i2 == 1) {
                vkContentBadge.setText(this.itemView.getContext().getString(R.string.vk_tile_widget_new_badge));
                vkContentBadge.setMode(VkContentBadge.Mode.Primary);
                vkContentBadge.setAppearance(VkContentBadge.Appearance.Design.Accent);
            } else if (i2 == 2) {
                vkContentBadge.setText(this.itemView.getContext().getString(R.string.vk_tile_widget_disount_badge_format, str));
                vkContentBadge.setMode(VkContentBadge.Mode.Primary);
                vkContentBadge.setAppearance(VkContentBadge.Appearance.Design.Negative);
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                vkContentBadge.setText(str);
                vkContentBadge.setAppearance(new VkContentBadge.Appearance.a(new b8g(Color.parseColor(tileBadgeInfo.d)), new b8g(Color.parseColor(tileBadgeInfo.e)), null, 12));
            }
        }
        List<TileBottomContent> list = men0Var.c().o.c;
        int i3 = 0;
        while (true) {
            LinearLayout linearLayout = this.r;
            if (i3 >= linearLayout.getChildCount()) {
                break;
            }
            linearLayout.getChildAt(i3).setVisibility(8);
            i3++;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            TextView textView = this.s;
            TextView textView2 = this.t;
            VkButton vkButton = this.u;
            if (!hasNext) {
                int size = list.size();
                boolean h = f4m.h(vkButton);
                if (!(this instanceof hcn0) && h) {
                    i = 1;
                }
                textView.setMaxLines(Math.max(4 - size, i));
                final int size2 = list.size();
                textView2.post(new Runnable() { // from class: xsna.ecn0
                    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
                    
                        if (r1 >= 2) goto L12;
                     */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        fcn0 fcn0Var = fcn0.this;
                        int lineCount = fcn0Var.s.getLineCount();
                        int i4 = 1;
                        boolean z2 = fcn0Var.v.getVisibility() == 0;
                        TextView textView3 = fcn0Var.t;
                        int i5 = size2;
                        if (i5 == 1) {
                            i4 = 4;
                        } else {
                            if (i5 != 2 || !z2) {
                                if (i5 == 2 && lineCount < 2) {
                                    i4 = 3;
                                } else if (i5 == 2) {
                                }
                            }
                            i4 = 2;
                        }
                        textView3.setMaxLines(i4);
                    }
                });
                return;
            }
            TileBottomContent tileBottomContent = (TileBottomContent) it.next();
            TileBottomContent.BottomContentType bottomContentType = tileBottomContent.b;
            String str2 = tileBottomContent.c;
            int i4 = a.$EnumSwitchMapping$1[bottomContentType.ordinal()];
            if (i4 == 1) {
                textView.setText(str2);
                textView.setVisibility(0);
            } else if (i4 == 2) {
                textView2.setText(str2);
                textView2.setVisibility(0);
            } else if (i4 == 3) {
                vkButton.setText(str2);
                jjc.g(vkButton, new dvh0(5, tileBottomContent, this));
                vkButton.setVisibility(0);
            } else {
                if (i4 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                ConstraintLayout constraintLayout = this.v;
                TextView textView3 = (TextView) constraintLayout.findViewById(R.id.user_stack_text);
                textView3.setText(str2);
                textView3.setTextAppearance(R.style.VkUiTypography_Footnote_Unscaled);
                textView3.setTextSize(0, cn70.b(13));
                List<ImageWithAction> list2 = tileBottomContent.d;
                if (list2 != null) {
                    arrayList = new ArrayList();
                    for (ImageWithAction imageWithAction : list2) {
                        WebImage webImage = imageWithAction.b;
                        Pair pair = (webImage == null || (f = webImage.f(B)) == null) ? null : new Pair(f.b, imageWithAction.c);
                        if (pair != null) {
                            arrayList.add(pair);
                        }
                    }
                } else {
                    arrayList = null;
                }
                vbn0 vbn0Var = this.w;
                if (arrayList == null || arrayList.isEmpty()) {
                    f4m.j(vbn0Var);
                } else {
                    vbn0Var.setReverseDrawingOrder(true);
                    vbn0Var.setStrokeColor(qpo0.c(R.attr.vk_ui_background_tertiary, this.itemView.getContext()));
                    vbn0Var.c(j5g.H0(arrayList, 3), 0, new w5h(this, 10));
                }
                constraintLayout.setVisibility(0);
            }
        }
    }

    public final kto0 h6() {
        return (kto0) this.x.getValue();
    }

    public final void i6(boolean z2) {
        int i = z2 ? -1 : -16777216;
        Context context = this.itemView.getContext();
        int i2 = z2 ? R.color.vk_white_alpha60 : R.color.vk_black_alpha60;
        e3m.a aVar = e3m.a;
        int color = context.getColor(i2);
        this.s.setTextColor(i);
        this.t.setTextColor(color);
        ((TextView) this.v.findViewById(R.id.user_stack_text)).setTextColor(color);
    }
}
