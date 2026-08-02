package xsna;

import android.content.Context;
import android.graphics.ColorMatrixColorFilter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.media.ok.utils.DuetAction;
import com.vkontakte.android.R;

/* compiled from: ClipsDuetController.kt */
/* loaded from: classes14.dex */
public final class uud {
    public static final int e;
    public static final int f;
    public static final int g;
    public static final float h;
    public static final int i;
    public static final int j;
    public static final int k;
    public final CameraUIView.e a;
    public final LinearLayout b;
    public int c;
    public final ColorMatrixColorFilter d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsDuetController.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a CLOSE_BUTTON;
        public static final a FULL_HORIZONTAL_MODE;
        public static final a FULL_VERTICAL_MODE;
        public static final a NESTED_MODE;
        public static final a VERTICAL_MODE;
        private final int contentDescriptionRes;
        private final int drawableRes;

        static {
            a aVar = new a("VERTICAL_MODE", 0, R.drawable.duets_second_item, R.string.camera_content_description_vertical_mode);
            VERTICAL_MODE = aVar;
            a aVar2 = new a("NESTED_MODE", 1, R.drawable.vk_icon_devices_outline_28, R.string.camera_content_description_nested_mode);
            NESTED_MODE = aVar2;
            a aVar3 = new a("FULL_VERTICAL_MODE", 2, R.drawable.duets_third_item, R.string.camera_content_description_full_vertical_mode);
            FULL_VERTICAL_MODE = aVar3;
            a aVar4 = new a("FULL_HORIZONTAL_MODE", 3, R.drawable.duets_fourth_item, R.string.camera_content_description_full_horizontal_mode);
            FULL_HORIZONTAL_MODE = aVar4;
            a aVar5 = new a("CLOSE_BUTTON", 4, R.drawable.vk_icon_cancel_outline_28, R.string.camera_content_description_close_button);
            CLOSE_BUTTON = aVar5;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a(String str, int i, int i2, int i3) {
            this.drawableRes = i2;
            this.contentDescriptionRes = i3;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final int h() {
            return this.contentDescriptionRes;
        }

        public final int i() {
            return this.drawableRes;
        }
    }

    static {
        int a2 = iah0.a(44);
        e = a2;
        float f2 = 8;
        f = iah0.a(f2);
        g = iah0.a(2);
        h = a2 / 2.0f;
        i = iah0.a(PsExtractor.VIDEO_STREAM_MASK);
        j = iah0.a(48);
        k = iah0.a(f2);
    }

    public uud(Context context, CameraUIView.e eVar, DuetAction duetAction) {
        this.a = eVar;
        this.b = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, j);
        layoutParams.gravity = 81;
        LinearLayout linearLayout = this.b;
        (linearLayout == null ? null : linearLayout).setLayoutParams(layoutParams);
        LinearLayout linearLayout2 = this.b;
        (linearLayout2 == null ? null : linearLayout2).setBackgroundResource(R.drawable.group_effect_placeholder);
        int i2 = 0;
        for (a aVar : a.values()) {
            LinearLayout linearLayout3 = this.b;
            VkImageSimple vkImageSimple = new VkImageSimple((linearLayout3 == null ? null : linearLayout3).getContext(), null, 6, 0);
            vkImageSimple.setImageResource(aVar.i());
            Context context2 = vkImageSimple.getContext();
            vkImageSimple.setContentDescription(context2 != null ? context2.getString(aVar.h()) : null);
            int i3 = f;
            vkImageSimple.setPadding(i3, i3, i3, i3);
            bwt0.i0(vkImageSimple, new vud(1, this, uud.class, "clickListener", "clickListener(Landroid/view/View;)V", 0));
            bwt0.d(vkImageSimple, h, (r4 & 2) != 0, (r4 & 4) != 0);
            bwt0.o0(vkImageSimple, -1);
            int i4 = e;
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i4, i4);
            int i5 = g;
            layoutParams2.setMargins(i5, i5, i5, i5);
            LinearLayout linearLayout4 = this.b;
            if (linearLayout4 == null) {
                linearLayout4 = null;
            }
            linearLayout4.addView(vkImageSimple, layoutParams2);
        }
        ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT});
        this.d = colorMatrixColorFilter;
        if (duetAction != null) {
            int h2 = duetAction.h();
            i2 = h2 != -1 ? h2 - 1 : 4;
        }
        this.c = i2;
        LinearLayout linearLayout5 = this.b;
        VkImageSimple vkImageSimple2 = (VkImageSimple) (linearLayout5 != null ? linearLayout5 : null).getChildAt(i2);
        vkImageSimple2.setColorFilter(colorMatrixColorFilter);
        vkImageSimple2.setBackgroundColor(-1);
    }

    public final void a() {
        this.a.accept(DuetAction.CANCEL);
    }

    public final LinearLayout b() {
        LinearLayout linearLayout = this.b;
        if (linearLayout != null) {
            return linearLayout;
        }
        return null;
    }

    public final DuetAction c() {
        int i2 = this.c;
        int i3 = i2 != 4 ? i2 + 1 : -1;
        DuetAction.Companion.getClass();
        for (DuetAction duetAction : DuetAction.values()) {
            if (duetAction.h() == i3) {
                return duetAction;
            }
        }
        return DuetAction.CANCEL;
    }
}
