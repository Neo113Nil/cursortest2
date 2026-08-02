package com.vkontakte.android.attachments;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.im.Image;
import com.vk.dto.photo.Photo;
import com.vk.log.L;
import com.vkontakte.android.R;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.gl.tf.Tensorflow;
import xsna.dd80;

/* loaded from: classes7.dex */
public class AlbumAttachment extends PhotoAttachment {
    public static final Serializer.c<AlbumAttachment> CREATOR = new a();
    public final boolean A;
    public final int y;

    @Nullable
    public final String z;

    public class a extends Serializer.c<AlbumAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AlbumAttachment a(@NonNull Serializer serializer) {
            return new AlbumAttachment((Photo) serializer.G(Photo.class.getClassLoader()), serializer.u(), serializer.H(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AlbumAttachment[i];
        }
    }

    public AlbumAttachment(Photo photo, int i, @Nullable String str, boolean z) {
        super(photo);
        this.y = i;
        this.z = str;
        this.A = z;
        ImageSize Fb = this.l.Fb(604, false);
        if (Fb.d.d.endsWith(".gif")) {
            this.r = Tensorflow.FRAME_WIDTH;
            this.s = 249;
            Image image = Fb.d;
            this.t = image.b / image.c;
        }
    }

    public static AlbumAttachment Jb(@NonNull JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("photo");
            int optInt = jSONObject.optInt("size");
            String optString = jSONObject.optString("album_description");
            Photo photo = (Photo) Photo.R.a(optJSONObject);
            Objects.requireNonNull(photo);
            return new AlbumAttachment(photo, optInt, optString, jSONObject.getBoolean("can_include_to_feed"));
        } catch (JSONException e) {
            L.g("Can't parse fromCompactJSONObj", e);
            return null;
        }
    }

    @Override // com.vkontakte.android.attachments.PhotoAttachment, com.vk.dto.common.Attachment
    public final int Ab() {
        return 7;
    }

    @Override // com.vkontakte.android.attachments.PhotoAttachment, com.vk.dto.common.Attachment
    public final int Bb() {
        return dd80.c;
    }

    @Override // com.vkontakte.android.attachments.PhotoAttachment
    public final float E0() {
        return 1.5f;
    }

    @Override // com.vkontakte.android.attachments.PhotoAttachment, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(@NonNull Serializer serializer) {
        serializer.i0(this.l);
        serializer.S(this.y);
        serializer.j0(this.z);
        serializer.L(this.A ? (byte) 1 : (byte) 0);
    }

    @Override // com.vkontakte.android.attachments.PhotoAttachment, xsna.tec0
    @NonNull
    public final JSONObject Q3() {
        JSONObject Q3 = super.Q3();
        try {
            Q3.put("size", this.y);
            Q3.put("can_include_to_feed", this.A);
            return Q3;
        } catch (JSONException e) {
            L.i(e);
            return Q3;
        }
    }

    @Override // com.vkontakte.android.attachments.PhotoAttachment
    public final String toString() {
        return "album" + this.g + BundleUtil.UNDERLINE_TAG + this.h;
    }

    @Override // com.vkontakte.android.attachments.PhotoAttachment, com.vk.dto.common.Attachment
    public final int zb() {
        return R.string.attach_album;
    }
}
