package xsna;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.sdk.shared.item.clip.overlay.api.TooltipType;
import com.vk.core.tips.Tooltip;
import com.vk.core.ui.themes.NavigationBarStyle;
import com.vk.core.view.components.text.VkText;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: TooltipHelper.kt */
/* loaded from: classes17.dex */
public final class m5p0 {
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public final e1d a;
    public final u6d b;
    public View c;
    public TooltipType d;

    /* compiled from: TooltipHelper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TooltipType.values().length];
            try {
                iArr[TooltipType.UNAVAILABLE_SOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TooltipType.SOUND_MODERATION_NOT_PASSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: View.kt */
    public static final class b implements Runnable {
        public final /* synthetic */ View b;
        public final /* synthetic */ View c;

        public b(View view, View view2) {
            this.b = view;
            this.c = view2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            View view = this.c;
            ((q1i0) view.getBackground()).c(-((view.getMeasuredWidth() / 2) - m5p0.f));
            view.setTranslationX(-m5p0.g);
            view.setTranslationY(m5p0.h);
        }
    }

    static {
        iah0.a(32);
        e = iah0.a(232);
        f = iah0.a(36);
        g = iah0.a(12);
        h = iah0.a(4);
    }

    public m5p0(e1d e1dVar, u6d u6dVar) {
        this.a = e1dVar;
        this.b = u6dVar;
    }

    public final View a(int i) {
        float f2 = 12;
        int a2 = iah0.a(f2);
        int a3 = iah0.a(f2);
        e1d e1dVar = this.a;
        Context context = e1dVar.b.getContext();
        VkText vkText = new VkText(context, null, 6, 0);
        vkText.setId(R.id.title);
        vkText.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        f4m.q(iah0.a(4), vkText);
        vkText.setMaxWidth(e);
        vkText.setTextColor(-16777216);
        com.vk.typography.b.k(vkText, FontFamily.REGULAR, Float.valueOf(14.0f), 4);
        vkText.setGravity(8388611);
        int a4 = iah0.a(f2);
        vkText.setPadding(a4, a2, a4, a3);
        String string = context.getString(i);
        NavigationBarStyle navigationBarStyle = NavigationBarStyle.DARK;
        e3m.a aVar = e3m.a;
        View c = new Tooltip(context, string, null, null, null, null, null, -1, context.getColor(R.color.vk_black), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48, 0, false, navigationBarStyle, 0, true, new eb(vkText, 14), null, null, null, null, null, null, 3000L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, 0, null, null, null, null, -17000840, 15).c(context, new RectF());
        c.setId(View.generateViewId());
        f4m.j(c);
        ConstraintLayout constraintLayout = e1dVar.b;
        RecyclerView recyclerView = e1dVar.f;
        constraintLayout.addView(c);
        qj80.a(c, new b(c, c));
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.i(constraintLayout);
        bVar.l(c.getId(), 4, recyclerView.getId(), 3, 0);
        bVar.l(c.getId(), 1, recyclerView.getId(), 1, 0);
        bVar.b(constraintLayout);
        c.setOnClickListener(new tkc(this, 7));
        return c;
    }
}
