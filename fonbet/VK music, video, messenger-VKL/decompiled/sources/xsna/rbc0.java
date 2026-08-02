package xsna;

import android.os.Bundle;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import kotlin.LazyThreadSafetyMode;

/* compiled from: PostingArguments.kt */
/* loaded from: classes4.dex */
public final class rbc0 {
    public final Bundle a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;
    public final Object p;
    public final Object q;
    public final Object r;
    public final Object s;

    /* compiled from: PostingArguments.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PostingCreationEntryPoint.values().length];
            try {
                iArr[PostingCreationEntryPoint.FeedPlus.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostingCreationEntryPoint.GroupWallButton.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PostingCreationEntryPoint.ProfilePlusButton.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PostingCreationEntryPoint.ProfileWallButton.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PostingCreationEntryPoint.ChannelWriteBarButton.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PostingCreationEntryPoint.PostThreeDotMenuEditItem.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PostingCreationEntryPoint.PrepareSuggestedPostButton.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PostingCreationEntryPoint.ProfilePostponedPosts.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PostingCreationEntryPoint.ProfilePostponedPostsThreePoints.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[PostingCreationEntryPoint.GroupPostponedPosts.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[PostingCreationEntryPoint.GroupPostponedPostsThreePoints.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[PostingCreationEntryPoint.CommunityCreationOnboardingBlock.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public rbc0(Bundle bundle) {
        this.a = bundle;
        nuv nuvVar = new nuv(this, 25);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, nuvVar);
        this.c = msy.a(lazyThreadSafetyMode, new cr20(this, 23));
        this.d = msy.a(lazyThreadSafetyMode, new l500(this, 28));
        this.e = msy.a(lazyThreadSafetyMode, new os30(this, 15));
        this.f = msy.a(lazyThreadSafetyMode, new r010(this, 21));
        this.g = msy.a(lazyThreadSafetyMode, new qbc0(this, 0));
        this.h = msy.a(lazyThreadSafetyMode, new t210(this, 21));
        this.i = msy.a(lazyThreadSafetyMode, new sy50(this, 13));
        this.j = msy.a(lazyThreadSafetyMode, new bbb0(this, 2));
        this.k = msy.a(lazyThreadSafetyMode, new rkt(this, 22));
        this.l = msy.a(lazyThreadSafetyMode, new u210(this, 17));
        int i = 28;
        this.m = msy.a(lazyThreadSafetyMode, new s1x(this, i));
        this.n = msy.a(lazyThreadSafetyMode, new tzv(this, i));
        this.o = msy.a(lazyThreadSafetyMode, new io60(this, 15));
        this.p = msy.a(lazyThreadSafetyMode, new f880(this, 9));
        this.q = msy.a(lazyThreadSafetyMode, new q010(this, 17));
        this.r = msy.a(lazyThreadSafetyMode, new g880(this, 9));
        this.s = msy.a(lazyThreadSafetyMode, new m960(this, 12));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final PostEditableData a() {
        return (PostEditableData) this.b.getValue();
    }
}
