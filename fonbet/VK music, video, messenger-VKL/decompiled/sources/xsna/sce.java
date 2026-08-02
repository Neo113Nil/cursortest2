package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.ImageSize;
import com.vk.dto.shortvideo.ChallengeRule;
import com.vk.dto.shortvideo.ClipCameraParams;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.shortvideo.ClipsChallenge;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.dw20;
import xsna.ice;
import xsna.tlo0;

/* compiled from: ClipsGridDetailedInfoController.kt */
/* loaded from: classes17.dex */
public final class sce {
    public dw20 a;

    /* compiled from: ClipsGridDetailedInfoController.kt */
    public static final class a extends zoj0<ChallengeRule, ice> {

        /* compiled from: ClipsGridDetailedInfoController.kt */
        /* renamed from: xsna.sce$a$a, reason: collision with other inner class name */
        public static final class C3661a extends RecyclerView.n {
            public final int b;
            public final int c;
            public final int d;

            public C3661a(int i, int i2, int i3) {
                this.b = i;
                this.c = i2;
                this.d = i3;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.n
            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
                rect.left = this.b;
                rect.right = 0;
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                int i = this.d;
                if (childAdapterPosition == 0) {
                    rect.bottom = i;
                } else {
                    rect.top = this.c;
                    rect.bottom = i;
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
            ChallengeRule challengeRule = (ChallengeRule) this.c.c(i);
            VkCell vkCell = ((ice) e0Var).l;
            ImageSize Cb = challengeRule.b.Cb(iah0.a(28), true, false);
            vkCell.setLeft(new VkCell.Left.b(new VkCell.Left.Main.d(new ice.b(Cb != null ? Cb.d.d : null), VkCell.Left.Main.Size.Small), null));
            tlo0.a aVar = tlo0.Companion;
            String obj = drm0.p0(challengeRule.c).toString();
            aVar.getClass();
            vkCell.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(new tlo0.h(obj), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), (VkCell.Middle.d) null, (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 14));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new ice(viewGroup);
        }
    }

    /* compiled from: ClipsGridDetailedInfoController.kt */
    public static final class b extends VkMiniInfoCell.b {

        /* compiled from: ClipsGridDetailedInfoController.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[VkMiniInfoCell.Mode.values().length];
                try {
                    iArr[VkMiniInfoCell.Mode.Base.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // com.vk.core.view.components.cell.VkMiniInfoCell.b, com.vk.core.view.components.cell.VkMiniInfoCell.a
        public final int c(VkMiniInfoCell.Mode mode) {
            return a.$EnumSwitchMapping$0[mode.ordinal()] == 1 ? R.style.VkUiTypography_Subhead : super.c(mode);
        }

        @Override // com.vk.core.view.components.cell.VkMiniInfoCell.b, com.vk.core.view.components.cell.VkMiniInfoCell.a
        public final cut0 d(VkMiniInfoCell.Mode mode) {
            return a.$EnumSwitchMapping$0[mode.ordinal()] == 1 ? new x7g(R.attr.vk_ui_text_secondary) : super.d(mode);
        }
    }

    /* compiled from: View.kt */
    public static final class c implements View.OnLayoutChangeListener {
        public final /* synthetic */ NestedScrollView b;
        public final /* synthetic */ cpo c;

        public c(NestedScrollView nestedScrollView, cpo cpoVar) {
            this.b = nestedScrollView;
            this.c = cpoVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int b;
            view.removeOnLayoutChangeListener(this);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iah0.f().heightPixels, Integer.MIN_VALUE);
            int min = Math.min(View.MeasureSpec.makeMeasureSpec(iah0.f().widthPixels, 1073741824), View.MeasureSpec.makeMeasureSpec(dw20.e1, 1073741824));
            NestedScrollView nestedScrollView = this.b;
            nestedScrollView.measure(min, makeMeasureSpec);
            int measuredHeight = nestedScrollView.getMeasuredHeight();
            boolean c = g620.f().getExperiments().c();
            if (c) {
                b = iah0.a(68);
            } else {
                if (c) {
                    throw new NoWhenBranchMatchedException();
                }
                b = cn70.b(0);
            }
            this.c.e = measuredHeight + b;
        }
    }

    public static void a(VkMiniInfoCell vkMiniInfoCell) {
        vkMiniInfoCell.setMode(VkMiniInfoCell.Mode.Base);
        vkMiniInfoCell.setIcon(new VkMiniInfoCell.d(new gko(R.drawable.vk_icon_article_outline_20), null, 6));
        vkMiniInfoCell.setDecorator(new b(true));
    }

    public final void b(ClipGridParams.Data data, ClipsChallenge clipsChallenge, ClipCameraParams clipCameraParams, Context context, wzs<? super ClipGridParams.Data, ? super ClipCameraParams, s3q0> wzsVar) {
        NestedScrollView nestedScrollView;
        int b2;
        if (clipsChallenge != null) {
            NestedScrollView nestedScrollView2 = (NestedScrollView) LayoutInflater.from(context).inflate(R.layout.clip_grid_challenge_detailed_info, (ViewGroup) null, false);
            String str = clipsChallenge.b;
            if (str != null && str.length() != 0) {
                bwt0.p0(nestedScrollView2.findViewById(R.id.clip_grid_challenge_detailed_info_descr_separator), true);
                VkMiniInfoCell vkMiniInfoCell = (VkMiniInfoCell) nestedScrollView2.findViewById(R.id.clip_grid_challenge_detailed_info);
                bwt0.p0(vkMiniInfoCell, true);
                a(vkMiniInfoCell);
                tlo0.a aVar = tlo0.Companion;
                ucp ucpVar = ucp.a;
                vkMiniInfoCell.setMiddle(new VkMiniInfoCell.e(u11.f(aVar, ucp.i(str)), true, false, false, false, null, 60));
            }
            List<ChallengeRule> list = clipsChallenge.l;
            List<ChallengeRule> list2 = list;
            int i = 4;
            if (list2 != null && !list2.isEmpty()) {
                VkGroupHeader vkGroupHeader = (VkGroupHeader) nestedScrollView2.findViewById(R.id.clip_grid_challenge_detailed_info_rules_header);
                bwt0.p0(vkGroupHeader, true);
                vkGroupHeader.setShowTopDivider(true);
                vkGroupHeader.setSize(VkGroupHeader.Size.Medium);
                vkGroupHeader.setTitle(new VkGroupHeader.d(tq.h(tlo0.Companion, R.string.clips_grid_challenge_details_rules), null, null, null, 0, 510));
                RecyclerView recyclerView = (RecyclerView) nestedScrollView2.findViewById(R.id.clip_grid_challenge_detailed_info_rules_rv);
                bwt0.p0(recyclerView, true);
                a aVar2 = new a();
                recyclerView.addItemDecoration(new a.C3661a(cn70.b(-6), cn70.b(4), cn70.b(4)));
                aVar2.setItems(list);
                recyclerView.setAdapter(aVar2);
            }
            String str2 = clipsChallenge.j;
            String str3 = clipsChallenge.k;
            if (str2 != null && str3 != null) {
                VkGroupHeader vkGroupHeader2 = (VkGroupHeader) nestedScrollView2.findViewById(R.id.clip_grid_challenge_detailed_info_terms);
                bwt0.p0(vkGroupHeader2, true);
                vkGroupHeader2.setShowTopDivider(true);
                vkGroupHeader2.setSize(VkGroupHeader.Size.Medium);
                vkGroupHeader2.setTitle(new VkGroupHeader.d(tq.h(tlo0.Companion, R.string.clips_grid_challenge_details_terms), null, null, null, 0, 510));
                FrameLayout frameLayout = (FrameLayout) nestedScrollView2.findViewById(R.id.clip_grid_challenge_detailed_info_terms_link);
                bwt0.p0(frameLayout, true);
                ((VkText) frameLayout.findViewById(R.id.info_terms_title)).setText(str2);
                ((VkText) frameLayout.findViewById(R.id.info_terms_subtitle)).setText(str3);
                VkImageSimple vkImageSimple = (VkImageSimple) frameLayout.findViewById(R.id.info_terms_icon);
                dhr0.f0(R.drawable.white_oval, R.attr.vk_ui_background_secondary, vkImageSimple);
                omw.d(vkImageSimple, R.drawable.vk_icon_link_24, R.attr.vk_ui_icon_medium);
                bwt0.i0(frameLayout, new c5(frameLayout, str3, this, i));
            }
            String str4 = clipsChallenge.c;
            if (str4 != null && str4.length() != 0) {
                bwt0.p0(nestedScrollView2.findViewById(R.id.clip_grid_challenge_detailed_info_disclaimer_separator), true);
                VkText vkText = (VkText) nestedScrollView2.findViewById(R.id.clip_grid_challenge_detailed_info_disclaimer_text);
                bwt0.p0(vkText, true);
                vkText.setText(str4);
            }
            nestedScrollView2.post(new yn2(nestedScrollView2, 2));
            nestedScrollView = nestedScrollView2;
        } else {
            nestedScrollView = null;
        }
        if (nestedScrollView == null) {
            return;
        }
        cpo cpoVar = new cpo(false, 0, 7);
        dw20.b bVar = new dw20.b(context, null);
        bVar.v0(R.string.clips_grid_challenge_more_details);
        bVar.c(cpoVar);
        bVar.D0(nestedScrollView, false);
        if (g620.f().getExperiments().c()) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setBackground(new ColorDrawable(dhr0.Y(R.attr.vk_ui_background_modal, context)));
            frameLayout2.setPadding(cn70.b(16), cn70.b(12), cn70.b(16), cn70.b(12));
            VkButton vkButton = new VkButton(context, null, 6, 0);
            vkButton.setText(R.string.clips_grid_challenge_details_participate);
            vkButton.setSize(VkButton.Size.Large);
            vkButton.setMode(VkButton.Mode.Primary);
            bwt0.i0(vkButton, new n37(data, wzsVar, clipCameraParams, this, 2));
            frameLayout2.addView(vkButton);
            bVar.z(frameLayout2);
        }
        this.a = bVar.I0(null);
        if (!nestedScrollView.isLaidOut() || nestedScrollView.isLayoutRequested()) {
            nestedScrollView.addOnLayoutChangeListener(new c(nestedScrollView, cpoVar));
            return;
        }
        nestedScrollView.measure(Math.min(View.MeasureSpec.makeMeasureSpec(iah0.f().widthPixels, 1073741824), View.MeasureSpec.makeMeasureSpec(dw20.e1, 1073741824)), View.MeasureSpec.makeMeasureSpec(iah0.f().heightPixels, Integer.MIN_VALUE));
        int measuredHeight = nestedScrollView.getMeasuredHeight();
        boolean c2 = g620.f().getExperiments().c();
        if (c2) {
            b2 = iah0.a(68);
        } else {
            if (c2) {
                throw new NoWhenBranchMatchedException();
            }
            b2 = cn70.b(0);
        }
        cpoVar.e = measuredHeight + b2;
    }
}
