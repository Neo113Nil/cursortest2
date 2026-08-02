package xsna;

import com.vk.clips.attachments.api.publish.cta.ClipInvolvementActionButton;
import com.vk.clips.upload.vk.ui.impl.ClipUploadScreenFeature$EasyPromote;
import com.vk.clips.upload.vk.ui.impl.ClipUploadScreenFeature$OpenChannelFromClip;
import com.vk.clips.upload.vk.ui.impl.fragment.data.api.UploadUserInfo;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadState;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadPrivacyData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.EasyPromoteUnavalabilityReason;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.ConditionalFeature;
import com.vk.dto.group.Group;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.dto.profile.Donut;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.oap;

/* compiled from: ClipsUploadFeaturesAvailabilityHelper.kt */
/* loaded from: classes17.dex */
public final class kff {
    /* JADX WARN: Multi-variable type inference failed */
    public static ClipInvolvementActionButton a(oap oapVar, Set set) {
        if (oapVar instanceof oap.b) {
            return null;
        }
        if (!(oapVar instanceof oap.a)) {
            throw new NoWhenBranchMatchedException();
        }
        Group group = (Group) ((oap.a) oapVar).a;
        Donut donut = group.Q;
        if ((donut != null && donut.d()) || group.R != null) {
            return null;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Map k = pn00.k(new Pair(ClipInvolvementActionButton.MessageToBusinessCommunity.e, Boolean.valueOf(group.r0)), new Pair(ClipInvolvementActionButton.OnlineBooking.e, Boolean.valueOf(group.q0)), new Pair(ClipInvolvementActionButton.OpenChannel.e, Boolean.valueOf(group.b0 && set.contains(ClipUploadScreenFeature$OpenChannelFromClip.b))));
        final xa2 xa2Var = new xa2(ref$ObjectRef, 2);
        k.forEach(new BiConsumer() { // from class: xsna.jff
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                xa2.this.invoke(obj, obj2);
            }
        });
        return (ClipInvolvementActionButton) ref$ObjectRef.element;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0028, code lost:
    
        if (r3.f0 == 1) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (((com.vk.clips.upload.vk.ui.impl.fragment.data.api.UploadUserInfo) ((xsna.oap.b) r5).a).e == com.vk.clips.upload.vk.ui.impl.fragment.data.api.UploadUserInfo.AgeRestriction.NONE) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ConditionalFeature.State b(oap oapVar, ClipsUploadPrivacyData clipsUploadPrivacyData) {
        boolean z;
        boolean z2 = oapVar instanceof oap.b;
        if (!z2) {
            if (!(oapVar instanceof oap.a)) {
                throw new NoWhenBranchMatchedException();
            }
            Group group = (Group) ((oap.a) oapVar).a;
            if (group.e0 == 1) {
            }
            z = false;
        }
        if (z2) {
            if (!((UploadUserInfo) ((oap.b) oapVar).a).f && clipsUploadPrivacyData.b == PostingVisibilityMode.ALL) {
                r1 = true;
            }
        } else {
            if (!(oapVar instanceof oap.a)) {
                throw new NoWhenBranchMatchedException();
            }
            int i = ((Group) ((oap.a) oapVar).a).m;
            r1 = !(i == 2 || i == 1);
        }
        return !z ? ConditionalFeature.State.HIDDEN : !r1 ? ConditionalFeature.State.DISABLED : ConditionalFeature.State.SHOWN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Pair c(PostingVisibilityMode postingVisibilityMode, Group group, oap oapVar, boolean z, Set set) {
        boolean z2;
        ConditionalFeature.State state;
        if (oapVar instanceof oap.b) {
            z2 = true;
        } else {
            if (!(oapVar instanceof oap.a)) {
                throw new NoWhenBranchMatchedException();
            }
            int i = ((Group) ((oap.a) oapVar).a).m;
            z2 = !(i == 2 || i == 1);
        }
        ClipUploadScreenFeature$EasyPromote clipUploadScreenFeature$EasyPromote = ClipUploadScreenFeature$EasyPromote.b;
        ConditionalFeature.State state2 = !set.contains(clipUploadScreenFeature$EasyPromote) ? ConditionalFeature.State.HIDDEN : !z2 ? ConditionalFeature.State.DISABLED : ConditionalFeature.State.SHOWN;
        ConditionalFeature.State state3 = ConditionalFeature.State.DISABLED;
        if (state2 != state3 && group == null) {
            boolean contains = set.contains(clipUploadScreenFeature$EasyPromote);
            boolean z3 = postingVisibilityMode == PostingVisibilityMode.ALL;
            if (!contains) {
                state = ConditionalFeature.State.HIDDEN;
            } else if (z3) {
                state = ConditionalFeature.State.SHOWN;
            } else {
                state2 = state3;
            }
            state2 = state;
        }
        ConditionalFeature.State state4 = !set.contains(clipUploadScreenFeature$EasyPromote) ? ConditionalFeature.State.HIDDEN : z ? state3 : ConditionalFeature.State.SHOWN;
        ConditionalFeature.State state5 = ConditionalFeature.State.HIDDEN;
        return (state2 == state5 || state4 == state5) ? new Pair(state5, null) : (state2 != state3 || state4 == state3) ? (state2 == state3 || state4 != state3) ? (state2 == state3 && state4 == state3) ? new Pair(state3, EasyPromoteUnavalabilityReason.PRIVACY_AND_PUBLICATION_DATE) : new Pair(ConditionalFeature.State.SHOWN, null) : new Pair(state4, EasyPromoteUnavalabilityReason.PUBLICATION_DATE) : new Pair(state2, EasyPromoteUnavalabilityReason.PRIVACY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean d(oap oapVar, Set set) {
        Donut donut;
        if (oapVar instanceof oap.b) {
            return false;
        }
        if (!(oapVar instanceof oap.a)) {
            throw new NoWhenBranchMatchedException();
        }
        Group group = (Group) ((oap.a) oapVar).a;
        return group.q0 || group.r0 || (group.b0 && set.contains(ClipUploadScreenFeature$OpenChannelFromClip.b)) || (((donut = group.Q) != null && donut.d()) || group.R != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean e(oap oapVar) {
        if (oapVar instanceof oap.b) {
            return false;
        }
        if (!(oapVar instanceof oap.a)) {
            throw new NoWhenBranchMatchedException();
        }
        Group group = (Group) ((oap.a) oapVar).a;
        return group.Z || group.t0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean f(mhd mhdVar, oap oapVar) {
        if (oapVar instanceof oap.b) {
            return true;
        }
        if (!(oapVar instanceof oap.a)) {
            throw new NoWhenBranchMatchedException();
        }
        return mhdVar.l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean g(oap oapVar) {
        if (oapVar instanceof oap.b) {
            return true;
        }
        if (!(oapVar instanceof oap.a)) {
            throw new NoWhenBranchMatchedException();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean h(oap oapVar, ClipsUploadPrivacyData clipsUploadPrivacyData) {
        if (oapVar instanceof oap.b) {
            return clipsUploadPrivacyData.b != PostingVisibilityMode.ONLY_ME;
        }
        if (!(oapVar instanceof oap.a)) {
            throw new NoWhenBranchMatchedException();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r3 != com.vk.dto.posting.PostingVisibilityMode.FRIENDS) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ConditionalFeature.State i(ClipsUploadState.Loaded loaded, Long l, PostingVisibilityMode postingVisibilityMode, oap oapVar) {
        ConditionalFeature.State state = loaded.b.e.q.c;
        ConditionalFeature.State state2 = ConditionalFeature.State.HIDDEN;
        if (state == state2) {
            return state2;
        }
        if (oapVar instanceof oap.b) {
            if (postingVisibilityMode != PostingVisibilityMode.ALL) {
            }
        } else {
            if (!(oapVar instanceof oap.a)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (l == null) {
            return ConditionalFeature.State.SHOWN;
        }
        return ConditionalFeature.State.DISABLED;
    }
}
