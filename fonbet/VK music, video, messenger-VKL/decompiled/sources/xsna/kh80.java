package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.vk.core.view.links.LinkedTextView;
import com.vk.music.bottomsheets.domain.model.AudioOnboardingScenarioType;
import com.vkontakte.android.R;
import xsna.fr40;

/* compiled from: OnboardingRenderExtension.kt */
/* loaded from: classes3.dex */
public final class kh80 implements gm50 {
    public final Context b;
    public final fr40 c;
    public final fr40.b d;
    public final String e;
    public final View f;
    public final ImageView g;
    public final TextView h;
    public final LinkedTextView i;
    public final View j;
    public final Button k;

    /* compiled from: OnboardingRenderExtension.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AudioOnboardingScenarioType.values().length];
            try {
                iArr[AudioOnboardingScenarioType.CA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioOnboardingScenarioType.CA3.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public kh80(Context context, fr40 fr40Var, fr40.b bVar, String str) {
        this.b = context;
        this.c = fr40Var;
        this.d = bVar;
        this.e = str;
        View inflate = LayoutInflater.from(context).inflate(R.layout.modal_bottom_sheet_onboarding, (ViewGroup) null, false);
        this.f = inflate;
        this.g = (ImageView) inflate.findViewById(R.id.image_single);
        this.h = (TextView) inflate.findViewById(R.id.text_title);
        this.i = (LinkedTextView) inflate.findViewById(R.id.text_description);
        CardView cardView = (CardView) inflate.findViewById(R.id.onboarding_card_root);
        this.j = inflate.findViewById(R.id.image_btn_hide);
        this.k = (Button) inflate.findViewById(R.id.button_action);
        cardView.setBackground(gu9.c(R.attr.vk_ui_background_contrast_themed, context));
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.c;
    }
}
