package xsna;

import android.content.Context;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.actionlinks.ActionLinkSnippet;
import com.vk.dto.common.Good;
import com.vk.ecomm.moderation.api.restrictions.ModerationCheckAdultResult;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ChatActionLinkSnippetModerationDelegate.kt */
/* loaded from: classes7.dex */
public final class gmb implements w8i {
    public final Object b;
    public final Object c;
    public final Object d;

    /* compiled from: ChatActionLinkSnippetModerationDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ModerationCheckAdultResult.values().length];
            try {
                iArr[ModerationCheckAdultResult.ONLY_FOR_ADULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ModerationCheckAdultResult.CONFIRM_ADULT_REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ModerationCheckAdultResult.ADULT_NOT_REQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public gmb() {
        xm1 xm1Var = new xm1(this, 14);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, xm1Var);
        this.c = msy.a(lazyThreadSafetyMode, new ka0(this, 18));
        this.d = msy.a(lazyThreadSafetyMode, new vf0(this, 15));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(Context context, ActionLink actionLink) {
        Good good;
        ActionLinkSnippet actionLinkSnippet = actionLink.f;
        if (actionLinkSnippet == null || (good = actionLinkSnippet.j) == null) {
            return;
        }
        int i = a.$EnumSwitchMapping$0[((y330) this.b.getValue()).a(false, good.h0).ordinal()];
        ?? r0 = this.c;
        if (i == 1) {
            ((k530) r0.getValue()).a(bwt0.u(context), true);
        } else if (i == 2) {
            k530.b((k530) r0.getValue(), bwt0.u(context), true, new b3(this, 14), null, 8);
        } else if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
