package com.vkontakte.android.attachments;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.Photo;
import com.vk.dto.user.UserProfile;
import com.vk.log.L;
import com.vkontakte.android.R;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.a0a;
import xsna.eso0;
import xsna.ixj0;
import xsna.tec0;
import xsna.tfw;
import xsna.x74;
import xsna.xus;

/* loaded from: classes7.dex */
public class PhotoAttachment extends AttachmentWithMedia implements eso0, tfw, tec0, x74 {
    public static final Serializer.c<PhotoAttachment> CREATOR = new a();
    public final int f;
    public final UserId g;
    public final int h;
    public final UserId i;
    public final int j;
    public int k;

    @NonNull
    public final Photo l;
    public final String m;
    public final String n;

    @Nullable
    public String o;
    public int p;
    public int q;
    public int r;
    public int s;
    public float t;

    @Nullable
    public transient Owner u;
    public boolean v;
    public String w;
    public Long x;

    public class a extends Serializer.c<PhotoAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PhotoAttachment a(Serializer serializer) {
            Photo photo = (Photo) serializer.G(Photo.class.getClassLoader());
            boolean m = serializer.m();
            String I = serializer.I();
            Long x = serializer.x();
            if (photo == null) {
                return null;
            }
            PhotoAttachment photoAttachment = new PhotoAttachment(photo);
            photoAttachment.v = m;
            photoAttachment.w = I;
            photoAttachment.x = x;
            return photoAttachment;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PhotoAttachment[i];
        }
    }

    public PhotoAttachment(@NonNull Photo photo) {
        this(photo, null);
    }

    public static PhotoAttachment Fb(@NonNull JSONObject jSONObject) {
        try {
            Photo photo = (Photo) Photo.R.a(jSONObject.optJSONObject("photo"));
            Objects.requireNonNull(photo);
            return new PhotoAttachment(photo);
        } catch (JSONException e) {
            L.g("Can't parse fromCompactJSONObj", e);
            return null;
        }
    }

    @Override // xsna.x74
    public final void A9(boolean z) {
        this.v = z;
    }

    @Override // com.vk.dto.common.Attachment
    public int Ab() {
        return 0;
    }

    @Override // xsna.x74
    public final String B1() {
        return this.w;
    }

    @Override // com.vk.dto.common.Attachment
    public int Bb() {
        return 0;
    }

    @Override // com.vk.dto.common.AttachmentWithMedia
    @NonNull
    public final Image Db() {
        return this.l.y;
    }

    public float E0() {
        return this.t;
    }

    @Override // com.vk.dto.common.AttachmentWithMedia
    @NonNull
    public final String Eb() {
        return "https://" + a0a.d + "/photo" + this.g + BundleUtil.UNDERLINE_TAG + Integer.valueOf(this.f);
    }

    public final Integer Gb() {
        return Integer.valueOf(this.f);
    }

    public final String Hb() {
        return String.format("%d_%d", Long.valueOf(this.g.b), Integer.valueOf(this.f));
    }

    public String Ib() {
        Photo photo = this.l;
        if (photo.y.b.isEmpty()) {
            return null;
        }
        return ixj0.n(photo.y.b);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public void O7(@NonNull Serializer serializer) {
        serializer.i0(this.l);
        serializer.L(this.v ? (byte) 1 : (byte) 0);
        serializer.m0(this.w);
        serializer.b0(this.x);
    }

    @NonNull
    public JSONObject Q3() {
        JSONObject e = xus.e(this);
        try {
            e.put("photo", this.l.Q3());
            return e;
        } catch (JSONException e2) {
            L.i(e2);
            return e;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            PhotoAttachment photoAttachment = (PhotoAttachment) obj;
            if (this.f == photoAttachment.f && Objects.equals(this.g, photoAttachment.g)) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.ptx0
    public final void f1(@Nullable Owner owner) {
        this.u = owner;
    }

    @Override // xsna.btx0
    public final Number getId() {
        return Integer.valueOf(this.f);
    }

    @Override // xsna.tfw
    public final String h9() {
        return Ib();
    }

    public int hashCode() {
        return Long.hashCode(this.g.b) + ((this.f + 31) * 31);
    }

    @Override // xsna.x74
    public final void i5(String str) {
        this.w = str;
    }

    @Override // xsna.x74
    public final boolean o1() {
        return this.v;
    }

    @Override // xsna.ptx0
    public final UserId q() {
        return this.g;
    }

    @Override // xsna.ptx0
    @Nullable
    public final Owner s() {
        if (this.u == null) {
            UserProfile userProfile = this.l.B;
            if (userProfile == null) {
                return null;
            }
            this.u = new Owner(userProfile.c, userProfile.e, userProfile.g, userProfile.h, userProfile.B);
        }
        return this.u;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("photo");
        sb.append(this.g);
        sb.append(BundleUtil.UNDERLINE_TAG);
        sb.append(this.f);
        String str2 = this.n;
        if (str2 != null) {
            str = BundleUtil.UNDERLINE_TAG + str2;
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // com.vk.dto.common.Attachment
    @NonNull
    public int zb() {
        return R.string.attach_photo;
    }

    public PhotoAttachment(@NonNull Photo photo, @Nullable Map<UserId, Owner> map) {
        Owner owner;
        this.l = photo;
        this.f = photo.c;
        this.g = photo.e;
        this.h = photo.d;
        this.i = photo.f;
        this.j = photo.g;
        this.m = photo.u;
        this.t = photo.y.E0();
        this.n = photo.v;
        this.k = photo.C;
        if (map == null || map.size() <= 0 || (owner = map.get(photo.f)) == null) {
            return;
        }
        UserProfile userProfile = new UserProfile();
        userProfile.c = owner.b;
        userProfile.e = owner.c;
        userProfile.g = owner.d;
        userProfile.h = owner.e;
        userProfile.B.Ab(owner.f);
        photo.B = userProfile;
    }
}
