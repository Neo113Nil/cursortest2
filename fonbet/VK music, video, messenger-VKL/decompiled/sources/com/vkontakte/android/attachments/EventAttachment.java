package com.vkontakte.android.attachments;

import androidx.core.app.NotificationCompat;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.newsfeed.Owner;
import com.vk.log.L;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.dd80;
import xsna.epx;
import xsna.fkq0;
import xsna.gmq;
import xsna.ptx0;
import xsna.qoy;
import xsna.s3q0;
import xsna.shy;
import xsna.tec0;
import xsna.xus;

/* compiled from: EventAttachment.kt */
/* loaded from: classes7.dex */
public final class EventAttachment extends Attachment implements ptx0, tec0, gmq {
    public static final Serializer.c<EventAttachment> CREATOR = new a();
    public final Owner f;
    public final int g;
    public final String h;
    public int i;
    public boolean j;
    public final String k;
    public final String l;
    public final List<Owner> m;
    public final int n = 15;
    public final Owner o;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<EventAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final EventAttachment a(Serializer serializer) {
            return new EventAttachment((Owner) serializer.G(Owner.class.getClassLoader()), serializer.u(), serializer.H(), serializer.u(), serializer.m(), serializer.H(), serializer.H(), serializer.j(Owner.CREATOR));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EventAttachment[i];
        }
    }

    public EventAttachment(Owner owner, int i, String str, int i2, boolean z, String str2, String str3, List<Owner> list) {
        this.f = owner;
        this.g = i;
        this.h = str;
        this.i = i2;
        this.j = z;
        this.k = str2;
        this.l = str3;
        this.m = list;
        this.o = owner;
    }

    @Override // com.vk.dto.common.Attachment
    public final int Ab() {
        return this.n;
    }

    @Override // com.vk.dto.common.Attachment
    public final int Bb() {
        return dd80.r;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.f);
        serializer.S(this.g);
        serializer.j0(this.h);
        serializer.S(this.i);
        serializer.L(this.j ? (byte) 1 : (byte) 0);
        serializer.j0(this.k);
        serializer.j0(this.l);
        serializer.o0(this.m);
    }

    @Override // xsna.tec0
    public final JSONObject Q3() {
        JSONObject e = xus.e(this);
        try {
            e.put(NotificationCompat.CATEGORY_EVENT, this.f.e5());
            e.put("time", this.g);
            e.put(RTCStatsConstants.KEY_ADDRESS, this.h);
            e.put("member_status", this.i);
            e.put("is_favorite", this.j);
            e.put("text", this.k);
            e.put("button_text", this.l);
            JSONArray jSONArray = new JSONArray();
            List<Owner> list = this.m;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((Owner) it.next()).e5());
                }
            }
            s3q0 s3q0Var = s3q0.a;
            e.put("friends", jSONArray);
            return e;
        } catch (JSONException e2) {
            L.i(e2);
            return e;
        }
    }

    @Override // xsna.gmq
    public final boolean X() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventAttachment)) {
            return false;
        }
        EventAttachment eventAttachment = (EventAttachment) obj;
        return epx.f(this.f, eventAttachment.f) && this.g == eventAttachment.g && epx.f(this.h, eventAttachment.h) && this.i == eventAttachment.i && this.j == eventAttachment.j && epx.f(this.k, eventAttachment.k) && epx.f(this.l, eventAttachment.l) && epx.f(this.m, eventAttachment.m);
    }

    public final int hashCode() {
        int a2 = shy.a(this.g, this.f.hashCode() * 31, 31);
        String str = this.h;
        int b = qoy.b(shy.a(this.i, (a2 + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.j);
        String str2 = this.k;
        int hashCode = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.l;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<Owner> list = this.m;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // xsna.ptx0
    public final Owner s() {
        throw null;
    }

    @Override // xsna.gmq
    public final void s0(boolean z) {
        this.j = z;
    }

    public final String toString() {
        return NotificationCompat.CATEGORY_EVENT + fkq0.a(this.f.b).b;
    }

    @Override // com.vk.dto.common.Attachment
    public final int zb() {
        return R.string.attach_event;
    }
}
