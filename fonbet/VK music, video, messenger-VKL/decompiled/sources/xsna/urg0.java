package xsna;

import com.vk.api.generated.wall.dto.WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto;
import com.vk.newsfeed.posting.impl.domain.rules.RuleAttachment;
import java.util.Iterator;

/* compiled from: RulesMapping.kt */
/* loaded from: classes4.dex */
public final class urg0 {

    /* compiled from: RulesMapping.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto.ModeDto.values().length];
            try {
                iArr[WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto.ModeDto.GRID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto.ModeDto.CAROUSEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final RuleAttachment a(String str) {
        Object obj;
        Iterator<E> it = RuleAttachment.i().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((RuleAttachment) obj).j(), str)) {
                break;
            }
        }
        return (RuleAttachment) obj;
    }
}
