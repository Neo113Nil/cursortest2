package xsna;

import android.widget.ImageView;
import android.widget.TextView;
import com.vk.auth.passport.VkPassportContract$VkSecurityInfo;
import com.vk.auth.passport.VkPassportView;
import com.vkontakte.android.R;

/* compiled from: SecurityInfoDelegate.kt */
/* loaded from: classes15.dex */
public final class a3i0 {
    public final VkPassportView a;
    public final itk b;
    public final TextView c;
    public final ImageView d;
    public final ImageView e;
    public final bpn0 f = new bpn0(new bi80(this, 15));

    /* compiled from: SecurityInfoDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkPassportContract$VkSecurityInfo.values().length];
            try {
                iArr[VkPassportContract$VkSecurityInfo.CRITICAL_WARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkPassportContract$VkSecurityInfo.NORMAL_WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkPassportContract$VkSecurityInfo.NO_WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a3i0(VkPassportView vkPassportView, itk itkVar) {
        this.a = vkPassportView;
        this.b = itkVar;
        this.c = (TextView) vkPassportView.findViewById(R.id.vk_passport_action_subtext);
        this.d = (ImageView) vkPassportView.findViewById(R.id.vk_passport_start_icon);
        this.e = (ImageView) vkPassportView.findViewById(R.id.vk_passport_action_icon);
    }
}
