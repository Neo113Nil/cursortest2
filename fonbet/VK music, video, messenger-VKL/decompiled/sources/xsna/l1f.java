package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.vk.clips.reports.impl.ClipsReportFragment;
import com.vk.clips.reports.impl.data.ClipsReportReason;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ClipsReportReasonViewHolder.kt */
/* loaded from: classes16.dex */
public final class l1f extends vfz<j1f> {
    public final g1f l;
    public final VkText m;
    public final View n;

    /* compiled from: ClipsReportReasonViewHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsReportReason.values().length];
            try {
                iArr[ClipsReportReason.SPAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsReportReason.WEAPON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipsReportReason.DRUGS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ClipsReportReason.PROSTITUTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ClipsReportReason.OTHER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ClipsReportReason.MISLEADING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ClipsReportReason.FRAUD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ClipsReportReason.VIOLENCE_AGAINST_PEOPLE_AND_ANIMALS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ClipsReportReason.INSULTS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ClipsReportReason.INCLINATION_TO_SUICIDE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ClipsReportReason.HOSTILE_REMARKS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ClipsReportReason.EXTREMISM.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ClipsReportReason.CALLS_FOR_BULLYING.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ClipsReportReason.PORNO.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ClipsReportReason.CHILD_PORNO.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ClipsReportReason.PROFILE_CLONE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ClipsReportReason.PROFILE_MINE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public l1f(ViewGroup viewGroup, ClipsReportFragment.c cVar) {
        super(R.layout.report_reason_item, viewGroup);
        this.l = cVar;
        this.m = (VkText) this.itemView.findViewById(R.id.report_reason_title);
        this.n = this.itemView.findViewById(R.id.report_reason_check);
    }

    @Override // xsna.vfz
    public final void W5(j1f j1fVar) {
        int i;
        j1f j1fVar2 = j1fVar;
        Context context = this.itemView.getContext();
        switch (a.$EnumSwitchMapping$0[j1fVar2.c.ordinal()]) {
            case 1:
                i = R.string.report_reason_spam;
                break;
            case 2:
                i = R.string.report_reason_weapon;
                break;
            case 3:
                i = R.string.report_reason_drugs;
                break;
            case 4:
                i = R.string.report_reason_prostitution;
                break;
            case 5:
                i = R.string.report_reason_other;
                break;
            case 6:
                i = R.string.report_reason_misleading;
                break;
            case 7:
                i = R.string.report_reason_fraud;
                break;
            case 8:
                i = R.string.report_reason_violence_against_people_and_animals;
                break;
            case 9:
                i = R.string.report_reason_insults;
                break;
            case 10:
                i = R.string.report_reason_inclination_to_suicide;
                break;
            case 11:
                i = R.string.report_reason_hostile_remarks;
                break;
            case 12:
                i = R.string.report_reason_extremism;
                break;
            case 13:
                i = R.string.report_reason_calls_for_bullying;
                break;
            case 14:
                i = R.string.report_reason_porno;
                break;
            case 15:
                i = R.string.report_reason_child_porno;
                break;
            case 16:
                i = R.string.report_reason_profile_clone;
                break;
            case 17:
                i = R.string.report_reason_profile_my_old;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.m.setText(context.getString(i));
        bwt0.p0(this.n, j1fVar2.d);
        this.itemView.setOnClickListener(new k1f(0, this, j1fVar2));
    }
}
