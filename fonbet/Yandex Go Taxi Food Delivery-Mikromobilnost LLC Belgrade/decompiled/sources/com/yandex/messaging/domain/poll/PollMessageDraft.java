package com.yandex.messaging.domain.poll;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ixd0;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.smw0;
import defpackage.unr0;
import defpackage.xvz;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u0000 52\u00020\u0001:\u00016BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJR\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0017J\u0010\u0010\"\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\"\u0010\u0015J\u001a\u0010%\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0017\"\u0004\b)\u0010*R(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0019\"\u0004\b-\u0010.R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010/\u001a\u0004\b\u0007\u0010\u001b\"\u0004\b0\u00101R\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010/\u001a\u0004\b\b\u0010\u001b\"\u0004\b2\u00101R\"\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010/\u001a\u0004\b\t\u0010\u001b\"\u0004\b3\u00101R\"\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010/\u001a\u0004\b\n\u0010\u001b\"\u0004\b4\u00101¨\u00067"}, d2 = {"Lcom/yandex/messaging/domain/poll/PollMessageDraft;", "Landroid/os/Parcelable;", "", "title", "", "answers", "", "isAnonymous", "isMultiselect", "isStarred", "isSilent", "<init>", "(Ljava/lang/String;Ljava/util/List;ZZZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Z", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/util/List;ZZZZ)Lcom/yandex/messaging/domain/poll/PollMessageDraft;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "setTitle", "(Ljava/lang/String;)V", "Ljava/util/List;", "getAnswers", "setAnswers", "(Ljava/util/List;)V", "Z", "setAnonymous", "(Z)V", "setMultiselect", "setStarred", "setSilent", "Companion", "ixd0", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PollMessageDraft implements Parcelable {
    public static final int $stable = 8;
    public static final int MAX_ANSWER_LENGTH = 140;
    private List<String> answers;
    private boolean isAnonymous;
    private boolean isMultiselect;
    private boolean isSilent;
    private boolean isStarred;
    private String title;
    public static final ixd0 Companion = new ixd0();
    public static final Parcelable.Creator<PollMessageDraft> CREATOR = new Creator();

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ PollMessageDraft(java.lang.String r2, java.util.List r3, boolean r4, boolean r5, boolean r6, boolean r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r9 = r8 & 2
            if (r9 == 0) goto Lc
            kotlin.collections.EmptyList r3 = kotlin.collections.EmptyList.a
        Lc:
            r9 = r8 & 4
            r0 = 0
            if (r9 == 0) goto L12
            r4 = r0
        L12:
            r9 = r8 & 8
            if (r9 == 0) goto L17
            r5 = r0
        L17:
            r9 = r8 & 16
            if (r9 == 0) goto L1c
            r6 = r0
        L1c:
            r8 = r8 & 32
            if (r8 == 0) goto L28
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L2f
        L28:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L2f:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.messaging.domain.poll.PollMessageDraft.<init>(java.lang.String, java.util.List, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ PollMessageDraft copy$default(PollMessageDraft pollMessageDraft, String str, List list, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pollMessageDraft.title;
        }
        if ((i & 2) != 0) {
            list = pollMessageDraft.answers;
        }
        if ((i & 4) != 0) {
            z = pollMessageDraft.isAnonymous;
        }
        if ((i & 8) != 0) {
            z2 = pollMessageDraft.isMultiselect;
        }
        if ((i & 16) != 0) {
            z3 = pollMessageDraft.isStarred;
        }
        if ((i & 32) != 0) {
            z4 = pollMessageDraft.isSilent;
        }
        boolean z5 = z3;
        boolean z6 = z4;
        return pollMessageDraft.copy(str, list, z, z2, z5, z6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<String> component2() {
        return this.answers;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsAnonymous() {
        return this.isAnonymous;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsMultiselect() {
        return this.isMultiselect;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsStarred() {
        return this.isStarred;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsSilent() {
        return this.isSilent;
    }

    public final PollMessageDraft copy(String title, List<String> answers, boolean isAnonymous, boolean isMultiselect, boolean isStarred, boolean isSilent) {
        return new PollMessageDraft(title, answers, isAnonymous, isMultiselect, isStarred, isSilent);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollMessageDraft)) {
            return false;
        }
        PollMessageDraft pollMessageDraft = (PollMessageDraft) other;
        return jl40.l(this.title, pollMessageDraft.title) && jl40.l(this.answers, pollMessageDraft.answers) && this.isAnonymous == pollMessageDraft.isAnonymous && this.isMultiselect == pollMessageDraft.isMultiselect && this.isStarred == pollMessageDraft.isStarred && this.isSilent == pollMessageDraft.isSilent;
    }

    public final List<String> getAnswers() {
        return this.answers;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSilent) + unr0.e(unr0.e(unr0.e(unr0.c(this.title.hashCode() * 31, 31, this.answers), 31, this.isAnonymous), 31, this.isMultiselect), 31, this.isStarred);
    }

    public final boolean isAnonymous() {
        return this.isAnonymous;
    }

    public final boolean isMultiselect() {
        return this.isMultiselect;
    }

    public final boolean isSilent() {
        return this.isSilent;
    }

    public final boolean isStarred() {
        return this.isStarred;
    }

    public final void setAnonymous(boolean z) {
        this.isAnonymous = z;
    }

    public final void setAnswers(List<String> list) {
        this.answers = list;
    }

    public final void setMultiselect(boolean z) {
        this.isMultiselect = z;
    }

    public final void setSilent(boolean z) {
        this.isSilent = z;
    }

    public final void setStarred(boolean z) {
        this.isStarred = z;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        String str = this.title;
        List<String> list = this.answers;
        boolean z = this.isAnonymous;
        boolean z2 = this.isMultiselect;
        boolean z3 = this.isStarred;
        boolean z4 = this.isSilent;
        StringBuilder r = xvz.r("PollMessageDraft(title=", str, ", answers=", list, ", isAnonymous=");
        nnm.v(", isMultiselect=", ", isStarred=", r, z, z2);
        return smw0.k(", isSilent=", Extension.C_BRAKE, r, z3, z4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeStringList(this.answers);
        dest.writeInt(this.isAnonymous ? 1 : 0);
        dest.writeInt(this.isMultiselect ? 1 : 0);
        dest.writeInt(this.isStarred ? 1 : 0);
        dest.writeInt(this.isSilent ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PollMessageDraft> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PollMessageDraft createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            String readString = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            boolean z4 = false;
            boolean z5 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z5 = z;
            }
            if (parcel.readInt() != 0) {
                z3 = z2;
            } else {
                z3 = z2;
                z2 = z;
            }
            if (parcel.readInt() == 0) {
                z3 = z;
            }
            return new PollMessageDraft(readString, createStringArrayList, z4, z5, z2, z3);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PollMessageDraft[] newArray(int i) {
            return new PollMessageDraft[i];
        }
    }

    public PollMessageDraft(String str, List<String> list, boolean z, boolean z2, boolean z3, boolean z4) {
        this.title = str;
        this.answers = list;
        this.isAnonymous = z;
        this.isMultiselect = z2;
        this.isStarred = z3;
        this.isSilent = z4;
    }

    public PollMessageDraft() {
        this(null, null, false, false, false, false, 63, null);
    }
}
