package xsna;

import com.vkontakte.android.attachments.ShitAttachment;

/* compiled from: LeadFormPagesMapper.kt */
/* loaded from: classes4.dex */
public final class syy {

    /* compiled from: LeadFormPagesMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShitAttachment.LeadForm.LeadFormBlock.Type.values().length];
            try {
                iArr[ShitAttachment.LeadForm.LeadFormBlock.Type.MULTIPLE_ANSWERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShitAttachment.LeadForm.LeadFormBlock.Type.ONE_ANSWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShitAttachment.LeadForm.LeadFormBlock.Type.TEXT_ANSWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
