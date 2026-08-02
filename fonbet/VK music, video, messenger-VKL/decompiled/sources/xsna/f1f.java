package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.vk.clips.reports.impl.data.ClipsReportCategory;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ClipsReportCategoryHeaderViewHolder.kt */
/* loaded from: classes16.dex */
public final class f1f extends vfz<e1f> {
    public final VkText l;

    /* compiled from: ClipsReportCategoryHeaderViewHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsReportCategory.values().length];
            try {
                iArr[ClipsReportCategory.SPAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsReportCategory.RESTRICTED_PRODUCT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipsReportCategory.FRAUD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ClipsReportCategory.VIOLENCE_AND_HOSTILITY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ClipsReportCategory.ADULT_CONTENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ClipsReportCategory.PROFILE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public f1f(ViewGroup viewGroup) {
        super(R.layout.report_category_header_item, viewGroup);
        this.l = (VkText) this.itemView.findViewById(R.id.report_category_title);
    }

    @Override // xsna.vfz
    public final void W5(e1f e1fVar) {
        int i;
        Context context = this.itemView.getContext();
        switch (a.$EnumSwitchMapping$0[e1fVar.b.ordinal()]) {
            case 1:
                i = R.string.report_category_spam;
                break;
            case 2:
                i = R.string.report_category_restricted_product;
                break;
            case 3:
                i = R.string.report_category_fraud;
                break;
            case 4:
                i = R.string.report_category_violence_and_hostility;
                break;
            case 5:
                i = R.string.report_category_adult_content;
                break;
            case 6:
                i = R.string.report_category_fake_profile;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.l.setText(context.getString(i));
    }
}
