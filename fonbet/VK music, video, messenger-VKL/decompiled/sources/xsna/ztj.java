package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.vk.core.tool.onboarding.VkOnboarding$HighlighterMarkerType;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.bonus.StickersBonusResult;
import com.vk.stickers.roulette.StickersRouletteFragment;
import com.vk.stickers.roulette.roulett_view.RouletteView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class ztj implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ztj(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Object, xsna.sio0] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                j1z j1zVar = (j1z) this.c;
                mio0 mio0Var = (mio0) this.d;
                tho0 tho0Var = (tho0) this.e;
                rnw rnwVar = (rnw) this.f;
                if (j1zVar.b()) {
                    cwm cwmVar = j1zVar.d;
                    bzw bzwVar = j1zVar.v;
                    c2u c2uVar = j1zVar.w;
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    lq5 lq5Var = new lq5(cwmVar, bzwVar, ref$ObjectRef, 2);
                    oua0 oua0Var = mio0Var.a;
                    oua0Var.f(tho0Var, rnwVar, lq5Var, c2uVar);
                    ?? sio0Var = new sio0(mio0Var, oua0Var);
                    mio0Var.b.set(sio0Var);
                    ref$ObjectRef.element = sio0Var;
                    j1zVar.e = sio0Var;
                }
                return new juj(0);
            case 1:
                com.vk.im.ui.components.msg_list.a aVar = (com.vk.im.ui.components.msg_list.a) this.c;
                ClipVideoFile clipVideoFile = (ClipVideoFile) this.d;
                UserId userId = (UserId) this.e;
                e5 e5Var = (e5) this.f;
                com.vk.im.ui.components.msg_list.a.b1(aVar, clipVideoFile, userId, true);
                e5Var.invoke(clipVideoFile);
                return s3q0.a;
            case 2:
                return Integer.valueOf(fb50.L((fb50) this.c, (String) this.d, (ArrayList) this.e, (String) this.f));
            case 3:
                String str = (String) this.c;
                wh50 wh50Var = (wh50) this.d;
                wh50 wh50Var2 = (wh50) this.e;
                wh50 wh50Var3 = (wh50) this.f;
                Context context = (Context) obj;
                TextView textView = new TextView(context);
                textView.setText(str);
                VkOnboardingHighlighter vkOnboardingHighlighter = new VkOnboardingHighlighter(context, null, 6);
                vkOnboardingHighlighter.addView(textView, new ViewGroup.LayoutParams(-1, -1));
                vkOnboardingHighlighter.setHighlighterType((VkOnboarding$HighlighterMarkerType) wh50Var.getValue());
                vkOnboardingHighlighter.setHighlighterColor((VkOnboarding$TintColor) wh50Var2.getValue());
                vkOnboardingHighlighter.setHighlightedTextColor(-16776961);
                wh50Var3.setValue(vkOnboardingHighlighter);
                return vkOnboardingHighlighter;
            default:
                rcl0 rcl0Var = (rcl0) this.c;
                StickerStockItem stickerStockItem = (StickerStockItem) this.d;
                String str2 = (String) this.e;
                StickersBonusResult stickersBonusResult = (StickersBonusResult) this.f;
                int intValue = ((Integer) obj).intValue();
                StickersRouletteFragment stickersRouletteFragment = rcl0Var.b;
                vvr0.c();
                RouletteView rouletteView = stickersRouletteFragment.W;
                if (rouletteView != null) {
                    RecyclerView.e0 findViewHolderForAdapterPosition = rouletteView.g.findViewHolderForAdapterPosition(intValue);
                    b790 b790Var = findViewHolderForAdapterPosition instanceof b790 ? (b790) findViewHolderForAdapterPosition : null;
                    if (b790Var != null) {
                        b790Var.V5(true);
                    }
                }
                stickersRouletteFragment.jo(dhr0.t.c(R.attr.vk_ui_accent_violet));
                LottieAnimationView lottieAnimationView = stickersRouletteFragment.X;
                if (lottieAnimationView != null) {
                    lottieAnimationView.setVisibility(0);
                }
                LottieAnimationView lottieAnimationView2 = stickersRouletteFragment.X;
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.m0();
                }
                RouletteView rouletteView2 = stickersRouletteFragment.W;
                if (rouletteView2 != null && !rouletteView2.f) {
                    jng0 jng0Var = rouletteView2.e;
                    if (!jng0Var.b.get()) {
                        jng0Var.f.postDelayed(new rc4(jng0Var, 15), 50L);
                    }
                }
                RouletteView rouletteView3 = stickersRouletteFragment.W;
                if (rouletteView3 != null) {
                    rouletteView3.c(intValue);
                }
                stickersRouletteFragment.ho(2000L, new z73(stickersRouletteFragment, stickerStockItem, str2, stickersBonusResult, 1));
                return s3q0.a;
        }
    }
}
