package com.vkontakte.android.attachments;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.polls.Poll;
import com.vk.log.L;
import com.vkontakte.android.R;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.dd80;
import xsna.ptx0;
import xsna.tec0;
import xsna.xus;

/* loaded from: classes7.dex */
public class PollAttachment extends Attachment implements tec0, ptx0 {
    public static final Serializer.c<PollAttachment> CREATOR = new a();

    @Nullable
    public Poll f;

    public class a extends Serializer.c<PollAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PollAttachment a(@NonNull Serializer serializer) {
            PollAttachment pollAttachment = new PollAttachment();
            pollAttachment.f = (Poll) serializer.G(Poll.class.getClassLoader());
            return pollAttachment;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PollAttachment[i];
        }
    }

    public PollAttachment(@Nullable Poll poll) {
        this.f = poll;
    }

    @Override // com.vk.dto.common.Attachment
    public final int Ab() {
        return 8;
    }

    @Override // com.vk.dto.common.Attachment
    public final int Bb() {
        return dd80.h;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.f);
    }

    @Override // xsna.tec0
    @NonNull
    public final JSONObject Q3() {
        JSONObject e = xus.e(this);
        try {
            e.put("poll", this.f.e5());
            return e;
        } catch (JSONException e2) {
            L.i(e2);
            return e;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Poll poll = this.f;
            int i = poll.b;
            Poll poll2 = ((PollAttachment) obj).f;
            if (i == poll2.b && Objects.equals(poll.c, poll2.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    @Override // xsna.ptx0
    public final UserId q() {
        throw null;
    }

    public final String toString() {
        return "poll" + this.f.c + BundleUtil.UNDERLINE_TAG + this.f.b;
    }

    @Override // com.vk.dto.common.Attachment
    public final int zb() {
        return R.string.attach_poll;
    }

    public PollAttachment(JSONObject jSONObject) {
        Serializer.c<Poll> cVar = Poll.CREATOR;
        this.f = Poll.a.a(jSONObject, null);
    }

    public PollAttachment(JSONObject jSONObject, Map<UserId, Owner> map) {
        HashMap hashMap;
        if (map != null) {
            hashMap = new HashMap(map.size());
            for (Map.Entry<UserId, Owner> entry : map.entrySet()) {
                Owner value = entry.getValue();
                hashMap.put(entry.getKey(), new Owner(value.b, value.c, value.e));
            }
        } else {
            hashMap = null;
        }
        Serializer.c<Poll> cVar = Poll.CREATOR;
        this.f = Poll.a.a(jSONObject, hashMap);
    }
}
