package xsna;

import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.community.tool.view.header.actionbuttons.OnMeasureCustomActionsView;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.hints.HintId;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CommunityHeaderActionButtonsHolder.kt */
/* loaded from: classes5.dex */
public final class b3h {
    public final OnMeasureCustomActionsView a;
    public final wvw b;
    public List<epg> c = EmptyList.b;
    public final be6 d = new be6(this, 2);
    public hpg e;
    public final VkButton f;
    public final VkButton g;
    public final VkButton h;
    public final VkButton i;

    /* compiled from: CommunityHeaderActionButtonsHolder.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            b3h b3hVar = (b3h) this.receiver;
            VkButton vkButton = b3hVar.f;
            VkButton vkButton2 = b3hVar.g;
            if (vkButton2.getVisibility() == 0 && (!b3h.c(vkButton) || !b3h.c(vkButton2))) {
                int[] iArr = VkButton.W;
                vkButton.a5(true, null);
                vkButton2.a5(true, null);
            }
            return s3q0.a;
        }
    }

    /* compiled from: CommunityHeaderActionButtonsHolder.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            b3h b3hVar = (b3h) this.receiver;
            VkButton vkButton = b3hVar.g;
            if (vkButton.getVisibility() == 0 && (!b3h.c(b3hVar.f) || !b3h.c(vkButton))) {
                vkButton.setVisibility(8);
                b3hVar.h.setVisibility(0);
            }
            return s3q0.a;
        }
    }

    public b3h(OnMeasureCustomActionsView onMeasureCustomActionsView, wvw wvwVar) {
        this.a = onMeasureCustomActionsView;
        this.b = wvwVar;
        this.f = (VkButton) onMeasureCustomActionsView.findViewById(R.id.community_action_button_1);
        this.g = (VkButton) onMeasureCustomActionsView.findViewById(R.id.community_action_button_2);
        this.h = (VkButton) onMeasureCustomActionsView.findViewById(R.id.community_action_button_3);
        this.i = (VkButton) onMeasureCustomActionsView.findViewById(R.id.community_action_button_4);
        onMeasureCustomActionsView.setOnMeasureCustomActions(e43.l(new a(0, this, b3h.class, "fitButtonsIfNeededStage1", "fitButtonsIfNeededStage1()V", 0), new b(0, this, b3h.class, "fitButtonsIfNeededStage2", "fitButtonsIfNeededStage2()V", 0)));
        float f = 16;
        onMeasureCustomActionsView.setPadding(iah0.a(f), onMeasureCustomActionsView.getPaddingTop(), iah0.a(f), onMeasureCustomActionsView.getPaddingBottom());
    }

    public static void b(VkButton vkButton, epg epgVar) {
        Integer valueOf = Integer.valueOf(epgVar.d.a);
        int[] iArr = VkButton.W;
        vkButton.a5(true, valueOf);
        vkButton.setIconSize(Integer.valueOf(iah0.a(20)));
        vkButton.setTag(epgVar.b);
        vkButton.setContentDescription(epgVar.a);
    }

    public static boolean c(VkButton vkButton) {
        Layout layout = ((AppCompatTextView) vkButton.findViewById(R.id.ds_internal_button_title)).getLayout();
        return layout == null || layout.getLineCount() == 0 || layout.getEllipsisCount(0) == 0;
    }

    public static void d(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        bwt0.f0(view, 0, 0, z ? 0 : iah0.a(8), 0, 11);
        view.setLayoutParams(layoutParams);
    }

    public final void a(VkButton vkButton, epg epgVar) {
        vkButton.setTag(epgVar.b);
        vkButton.setText(epgVar.a);
        dpg dpgVar = epgVar.c;
        vkButton.a5(true, dpgVar != null ? Integer.valueOf(dpgVar.a) : null);
        vkButton.setIconSize(Integer.valueOf(iah0.a(20)));
        int i = epgVar.e;
        vkButton.setCount(i > 0 ? Integer.valueOf(i) : null);
        if (epgVar.g) {
            h7v.d(this.b.b(), vkButton, HintId.ECOMM_COMMUNITY_YCLIENTS_SIGN_UP.getId(), null, new wq3(16), 20);
        }
    }
}
