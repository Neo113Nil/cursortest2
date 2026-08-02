package xsna;

import com.vk.core.view.components.button.VkButton;
import com.vk.dto.polls.Poll;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PollAttachment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import xsna.osb0;

/* compiled from: PollV3Reducer.kt */
/* loaded from: classes4.dex */
public final class ssb0 extends dm50<atb0, osb0, usb0> {
    public static boolean i(Poll poll, boolean z) {
        if (poll == null) {
            return false;
        }
        if (!poll.Ib() || (!(poll.Bb() && z) && poll.Bb())) {
            return (poll.Ib() || poll.Bb()) ? false : true;
        }
        return true;
    }

    public static usb0 j(usb0 usb0Var, Poll poll) {
        Integer valueOf = Integer.valueOf(R.string.poll_v3_show_results);
        Triple triple = !poll.Bb() ? new Triple(valueOf, VkButton.Appearance.Neutral, VkButton.Mode.Secondary) : poll.Ib() ? new Triple(Integer.valueOf(R.string.poll_vote), VkButton.Appearance.Accent, VkButton.Mode.Primary) : new Triple(valueOf, VkButton.Appearance.Neutral, VkButton.Mode.Secondary);
        return usb0.a(usb0Var, null, poll, null, null, null, false, false, false, i(poll, !poll.x.isEmpty()), ((Number) triple.d()).intValue(), (VkButton.Mode) triple.h(), (VkButton.Appearance) triple.g(), null, Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE);
    }

    @Override // xsna.dm50
    public final usb0 c(usb0 usb0Var, osb0 osb0Var) {
        LinkedHashSet linkedHashSet;
        List list;
        LinkedHashSet linkedHashSet2;
        LinkedHashSet linkedHashSet3;
        usb0 usb0Var2 = usb0Var;
        osb0 osb0Var2 = osb0Var;
        PollAttachment pollAttachment = usb0Var2.b;
        Poll poll = usb0Var2.c;
        if (osb0Var2 instanceof osb0.b) {
            osb0.b bVar = (osb0.b) osb0Var2;
            usb0 j = j(usb0Var2, bVar.b.f);
            PollAttachment pollAttachment2 = bVar.b;
            String str = bVar.c;
            if (str == null) {
                str = usb0Var2.d;
            }
            String str2 = str;
            String str3 = bVar.d;
            String str4 = bVar.e;
            if (str4 == null) {
                str4 = usb0Var2.f;
            }
            return usb0.a(j, pollAttachment2, null, str2, str3, str4, false, false, false, false, 0, null, null, null, 8162);
        }
        if (osb0Var2 instanceof osb0.c) {
            if (poll != null && (linkedHashSet3 = poll.x) != null) {
                osb0.c cVar = (osb0.c) osb0Var2;
                if (!linkedHashSet3.add(Long.valueOf(cVar.b))) {
                    linkedHashSet3.remove(Long.valueOf(cVar.b));
                }
            }
            return usb0.a(usb0Var2, null, null, null, null, null, false, false, false, i(poll, (poll == null || (linkedHashSet2 = poll.x) == null || linkedHashSet2.isEmpty()) ? false : true), 0, null, null, null, 3615);
        }
        if (osb0Var2 instanceof osb0.g) {
            Poll poll2 = ((osb0.g) osb0Var2).b;
            LinkedHashSet linkedHashSet4 = poll2.x;
            linkedHashSet4.clear();
            linkedHashSet4.addAll(poll2.e);
            if (pollAttachment != null) {
                pollAttachment.f = poll2;
            }
            return usb0.a(j(usb0Var2, poll2), null, null, null, null, null, false, true, false, false, 0, null, null, null, 7999);
        }
        if (osb0Var2 instanceof osb0.f) {
            Poll poll3 = ((osb0.f) osb0Var2).b;
            LinkedHashSet linkedHashSet5 = poll3.x;
            linkedHashSet5.clear();
            if (poll3.Ib()) {
                linkedHashSet5.addAll((poll == null || (list = poll.e) == null) ? EmptyList.b : list);
            }
            if (pollAttachment != null) {
                pollAttachment.f = poll3;
            }
            return usb0.a(j(usb0Var2, poll3), null, null, null, null, null, false, false, true, false, 0, null, null, null, 7999);
        }
        if (osb0Var2 instanceof osb0.e) {
            osb0.e eVar = (osb0.e) osb0Var2;
            usb0 j2 = j(usb0Var2, eVar.b.f);
            PollAttachment pollAttachment3 = eVar.b;
            return usb0.a(j2, pollAttachment3, pollAttachment3.f, null, null, null, false, false, false, false, 0, null, null, null, 7996);
        }
        if (osb0Var2 instanceof osb0.d) {
            return usb0.a(usb0Var2, null, null, null, null, null, false, false, false, false, 0, null, null, 0, 3871);
        }
        if (!(osb0Var2 instanceof osb0.a)) {
            throw new NoWhenBranchMatchedException();
        }
        osb0.a aVar = (osb0.a) osb0Var2;
        Poll poll4 = aVar.c;
        if (poll4 != null && pollAttachment != null) {
            pollAttachment.f = poll4;
        }
        return usb0.a(usb0Var2, null, poll4 == null ? poll : poll4, null, null, null, poll4 == null, false, false, i(poll4, (poll == null || (linkedHashSet = poll.x) == null || linkedHashSet.isEmpty()) ? false : true), 0, null, null, aVar.b, 3613);
    }

    @Override // xsna.dm50
    public final atb0 d() {
        return new atb0(e(new v4v(24)), e(new tuq(24)));
    }

    @Override // xsna.dm50
    public final void h(usb0 usb0Var, atb0 atb0Var) {
        usb0 usb0Var2 = usb0Var;
        atb0 atb0Var2 = atb0Var;
        if (usb0Var2.g) {
            f(atb0Var2.b, usb0Var2);
        } else {
            f(atb0Var2.a, usb0Var2);
        }
    }
}
