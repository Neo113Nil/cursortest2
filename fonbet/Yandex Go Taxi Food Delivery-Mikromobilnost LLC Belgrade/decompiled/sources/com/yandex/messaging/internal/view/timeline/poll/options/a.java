package com.yandex.messaging.internal.view.timeline.poll.options;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PollMessageOptionViewHolder$VoteState.values().length];
        try {
            iArr[PollMessageOptionViewHolder$VoteState.IsAnswered.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PollMessageOptionViewHolder$VoteState.Voting.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PollMessageOptionViewHolder$VoteState.NotAnswered.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
