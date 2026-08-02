package com.vkontakte.android.attachments;

import android.util.LruCache;
import androidx.annotation.NonNull;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.api.base.Document;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.dd80;
import xsna.iah0;
import xsna.tfw;

/* loaded from: classes7.dex */
public class GraffitiAttachment extends Attachment implements tfw {
    public int f;
    public final UserId g;
    public final String h;
    public final int i;
    public final int j;
    public final String k;
    public static final LruCache<String, String> l = new LruCache<>(10);
    public static final int m = (int) (iah0.v() * 0.7f);
    public static final Serializer.c<GraffitiAttachment> CREATOR = new a();

    public class a extends Serializer.c<GraffitiAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GraffitiAttachment a(@NonNull Serializer serializer) {
            return new GraffitiAttachment(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GraffitiAttachment[i];
        }
    }

    public GraffitiAttachment() {
        this.g = UserId.d;
    }

    public static void Db(int i, UserId userId, String str) {
        if (!str.startsWith("file://")) {
            str = "file://".concat(str);
        }
        l.put(i + BundleUtil.UNDERLINE_TAG + userId, str);
    }

    @Override // com.vk.dto.common.Attachment
    public final int Ab() {
        return 14;
    }

    @Override // com.vk.dto.common.Attachment
    public final int Bb() {
        return dd80.e;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.f);
        serializer.e0(this.g);
        serializer.j0(this.h);
        serializer.S(this.i);
        serializer.S(this.j);
        serializer.j0(this.k);
    }

    @Override // xsna.tfw
    public final String h9() {
        return this.h;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("doc");
        sb.append(this.g);
        sb.append(BundleUtil.UNDERLINE_TAG);
        sb.append(this.f);
        String str2 = this.k;
        if (str2 != null) {
            str = BundleUtil.UNDERLINE_TAG + str2;
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // com.vk.dto.common.Attachment
    public final int zb() {
        return R.string.attach_graffiti;
    }

    public GraffitiAttachment(Document document) {
        this(document.b, document.h, document.k, document.d, document.e, document.o);
    }

    public GraffitiAttachment(int i, UserId userId, String str, int i2, int i3, String str2) {
        UserId.b bVar = UserId.c;
        this.f = i;
        this.g = userId;
        this.h = str;
        this.i = i2;
        this.j = i3;
        this.k = str2;
    }

    public GraffitiAttachment(Serializer serializer) {
        this.g = UserId.d;
        this.f = serializer.u();
        this.g = (UserId) serializer.A(UserId.class.getClassLoader());
        this.h = serializer.H();
        this.i = serializer.u();
        this.j = serializer.u();
        this.k = serializer.H();
    }

    public GraffitiAttachment(JSONObject jSONObject) throws JSONException {
        this.g = UserId.d;
        this.f = jSONObject.getInt("id");
        this.g = new UserId(jSONObject.getLong("owner_id"));
        this.h = jSONObject.optString("url", jSONObject.optString("photo_586", jSONObject.optString("photo_200")));
        this.i = jSONObject.optInt("width", 586);
        this.j = jSONObject.optInt("height", 293);
        this.k = jSONObject.optString("access_key");
    }
}
