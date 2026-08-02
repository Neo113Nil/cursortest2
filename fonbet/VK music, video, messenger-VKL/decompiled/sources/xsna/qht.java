package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import com.vk.superapp.core.api.models.VkGender;
import com.vkontakte.android.R;

/* compiled from: GenderViewManager.kt */
/* loaded from: classes15.dex */
public final class qht {
    public final TextView a;
    public final ViewGroup b;
    public final RadioButton c;
    public final RadioButton d;

    /* compiled from: GenderViewManager.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkGender.values().length];
            try {
                iArr[VkGender.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkGender.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkGender.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public qht(View view) {
        this.a = (TextView) view.findViewById(R.id.choose_gender_title);
        this.b = (ViewGroup) view.findViewById(R.id.choose_gender_radio_container);
        this.c = (RadioButton) view.findViewById(R.id.male_gender_radio);
        this.d = (RadioButton) view.findViewById(R.id.female_gender_radio);
    }
}
