package com.yandex.messaging.domain.poll;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.messaging.core.net.entities.proto.message.ReducedUserInfo;
import defpackage.b64;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.oyr;
import defpackage.vfc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJH\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0016J\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0014J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b)\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b*\u0010\u0014R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010\u001b¨\u0006-"}, d2 = {"Lcom/yandex/messaging/domain/poll/PollAnswer;", "Landroid/os/Parcelable;", "", "answer", "", "answerId", "votedCount", "votedPercent", "", "Lcom/yandex/messaging/core/net/entities/proto/message/ReducedUserInfo;", "votedUsers", "<init>", "(Ljava/lang/String;IIILjava/util/List;)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;IIILjava/util/List;)Lcom/yandex/messaging/domain/poll/PollAnswer;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAnswer", CA20Status.STATUS_USER_I, "getAnswerId", "getVotedCount", "getVotedPercent", "Ljava/util/List;", "getVotedUsers", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PollAnswer implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PollAnswer> CREATOR = new Creator();
    private final String answer;
    private final int answerId;
    private final int votedCount;
    private final int votedPercent;
    private final List<ReducedUserInfo> votedUsers;

    public PollAnswer(String str, int i, int i2, int i3, List<ReducedUserInfo> list) {
        this.answer = str;
        this.answerId = i;
        this.votedCount = i2;
        this.votedPercent = i3;
        this.votedUsers = list;
    }

    public static /* synthetic */ PollAnswer copy$default(PollAnswer pollAnswer, String str, int i, int i2, int i3, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = pollAnswer.answer;
        }
        if ((i4 & 2) != 0) {
            i = pollAnswer.answerId;
        }
        if ((i4 & 4) != 0) {
            i2 = pollAnswer.votedCount;
        }
        if ((i4 & 8) != 0) {
            i3 = pollAnswer.votedPercent;
        }
        if ((i4 & 16) != 0) {
            list = pollAnswer.votedUsers;
        }
        List list2 = list;
        int i5 = i2;
        return pollAnswer.copy(str, i, i5, i3, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAnswer() {
        return this.answer;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAnswerId() {
        return this.answerId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getVotedCount() {
        return this.votedCount;
    }

    /* renamed from: component4, reason: from getter */
    public final int getVotedPercent() {
        return this.votedPercent;
    }

    public final List<ReducedUserInfo> component5() {
        return this.votedUsers;
    }

    public final PollAnswer copy(String answer, int answerId, int votedCount, int votedPercent, List<ReducedUserInfo> votedUsers) {
        return new PollAnswer(answer, answerId, votedCount, votedPercent, votedUsers);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollAnswer)) {
            return false;
        }
        PollAnswer pollAnswer = (PollAnswer) other;
        return jl40.l(this.answer, pollAnswer.answer) && this.answerId == pollAnswer.answerId && this.votedCount == pollAnswer.votedCount && this.votedPercent == pollAnswer.votedPercent && jl40.l(this.votedUsers, pollAnswer.votedUsers);
    }

    public final String getAnswer() {
        return this.answer;
    }

    public final int getAnswerId() {
        return this.answerId;
    }

    public final int getVotedCount() {
        return this.votedCount;
    }

    public final int getVotedPercent() {
        return this.votedPercent;
    }

    public final List<ReducedUserInfo> getVotedUsers() {
        return this.votedUsers;
    }

    public int hashCode() {
        return this.votedUsers.hashCode() + oyr.b(this.votedPercent, oyr.b(this.votedCount, oyr.b(this.answerId, this.answer.hashCode() * 31, 31), 31), 31);
    }

    public String toString() {
        String str = this.answer;
        int i = this.answerId;
        int i2 = this.votedCount;
        int i3 = this.votedPercent;
        List<ReducedUserInfo> list = this.votedUsers;
        StringBuilder u = b64.u(i, "PollAnswer(answer=", str, ", answerId=", ", votedCount=");
        vfc.u(i2, i3, ", votedPercent=", ", votedUsers=", u);
        return ly3.s(u, list, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.answer);
        dest.writeInt(this.answerId);
        dest.writeInt(this.votedCount);
        dest.writeInt(this.votedPercent);
        Iterator t = vfc.t(dest, this.votedUsers);
        while (t.hasNext()) {
            dest.writeParcelable((Parcelable) t.next(), flags);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PollAnswer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PollAnswer createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt4);
            int i = 0;
            while (i != readInt4) {
                i = vfc.e(PollAnswer.class, parcel, arrayList, i, 1);
            }
            return new PollAnswer(readString, readInt, readInt2, readInt3, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PollAnswer[] newArray(int i) {
            return new PollAnswer[i];
        }
    }
}
