package xsna;

import android.view.View;
import com.vk.community.design.view.skeleton.community.CommunityProfileSkeleton;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileViewState;

/* compiled from: CommunityProfileSkeletonViewDelegate.kt */
/* loaded from: classes5.dex */
public final class yth {
    public final CommunityProfileSkeleton a;
    public final View b;
    public final View c;

    /* compiled from: CommunityProfileSkeletonViewDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommunityProfileViewState.Data.LoadingState.values().length];
            try {
                iArr[CommunityProfileViewState.Data.LoadingState.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommunityProfileViewState.Data.LoadingState.STATIC_COVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommunityProfileViewState.Data.LoadingState.LIVE_COVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CommunityProfileViewState.Data.LoadingState.ACTION_LOADING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public yth(CommunityProfileSkeleton communityProfileSkeleton, View view, View view2) {
        this.a = communityProfileSkeleton;
        this.b = view;
        this.c = view2;
    }
}
