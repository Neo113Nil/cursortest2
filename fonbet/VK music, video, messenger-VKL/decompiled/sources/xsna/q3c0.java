package xsna;

import com.vk.feed.design.view.newsfeed.header.VkFeedPostHeaderView;
import com.vk.newsfeed.common.presentation.model.items.header.IconSize;

/* compiled from: PostHeaderBindDelegateV2.kt */
/* loaded from: classes4.dex */
public final class q3c0 {
    public static final int f = cn70.b(36);
    public final VkFeedPostHeaderView a;
    public final r3c0 b;
    public final rwm0 c;
    public final h170 d;
    public final StringBuilder e = new StringBuilder();

    /* compiled from: PostHeaderBindDelegateV2.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IconSize.values().length];
            try {
                iArr[IconSize.DP_12.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IconSize.DP_16.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public q3c0(VkFeedPostHeaderView vkFeedPostHeaderView, r3c0 r3c0Var, rwm0 rwm0Var, h170 h170Var) {
        this.a = vkFeedPostHeaderView;
        this.b = r3c0Var;
        this.c = rwm0Var;
        this.d = h170Var;
    }
}
