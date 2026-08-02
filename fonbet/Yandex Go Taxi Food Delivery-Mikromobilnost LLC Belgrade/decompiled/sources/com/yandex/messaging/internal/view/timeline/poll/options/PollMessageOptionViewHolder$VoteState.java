package com.yandex.messaging.internal.view.timeline.poll.options;

import defpackage.jxd0;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/yandex/messaging/internal/view/timeline/poll/options/PollMessageOptionViewHolder$VoteState", "", "Lcom/yandex/messaging/internal/view/timeline/poll/options/PollMessageOptionViewHolder$VoteState;", "Companion", "jxd0", "NotAnswered", "Voting", "IsAnswered", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final class PollMessageOptionViewHolder$VoteState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PollMessageOptionViewHolder$VoteState[] $VALUES;
    public static final jxd0 Companion;
    public static final PollMessageOptionViewHolder$VoteState IsAnswered;
    public static final PollMessageOptionViewHolder$VoteState NotAnswered;
    public static final PollMessageOptionViewHolder$VoteState Voting;

    static {
        PollMessageOptionViewHolder$VoteState pollMessageOptionViewHolder$VoteState = new PollMessageOptionViewHolder$VoteState("NotAnswered", 0);
        NotAnswered = pollMessageOptionViewHolder$VoteState;
        PollMessageOptionViewHolder$VoteState pollMessageOptionViewHolder$VoteState2 = new PollMessageOptionViewHolder$VoteState("Voting", 1);
        Voting = pollMessageOptionViewHolder$VoteState2;
        PollMessageOptionViewHolder$VoteState pollMessageOptionViewHolder$VoteState3 = new PollMessageOptionViewHolder$VoteState("IsAnswered", 2);
        IsAnswered = pollMessageOptionViewHolder$VoteState3;
        PollMessageOptionViewHolder$VoteState[] pollMessageOptionViewHolder$VoteStateArr = {pollMessageOptionViewHolder$VoteState, pollMessageOptionViewHolder$VoteState2, pollMessageOptionViewHolder$VoteState3};
        $VALUES = pollMessageOptionViewHolder$VoteStateArr;
        $ENTRIES = kotlin.enums.a.a(pollMessageOptionViewHolder$VoteStateArr);
        Companion = new jxd0();
    }

    public static PollMessageOptionViewHolder$VoteState valueOf(String str) {
        return (PollMessageOptionViewHolder$VoteState) Enum.valueOf(PollMessageOptionViewHolder$VoteState.class, str);
    }

    public static PollMessageOptionViewHolder$VoteState[] values() {
        return (PollMessageOptionViewHolder$VoteState[]) $VALUES.clone();
    }
}
