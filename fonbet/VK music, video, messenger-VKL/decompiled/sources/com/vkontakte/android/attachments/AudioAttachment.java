package com.vkontakte.android.attachments;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.music.MusicTrack;
import com.vk.log.L;
import com.vkontakte.android.R;
import com.vkontakte.android.data.PostInteract;
import java.util.ArrayList;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.dd80;
import xsna.tec0;
import xsna.xus;

/* loaded from: classes7.dex */
public class AudioAttachment extends Attachment implements tec0 {
    public static final Serializer.c<AudioAttachment> CREATOR = new a();
    public final MusicTrack f;
    public transient ArrayList<MusicTrack> g;
    public transient String h = "";

    @Nullable
    public transient PostInteract i;

    public class a extends Serializer.c<AudioAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AudioAttachment a(@NonNull Serializer serializer) {
            return new AudioAttachment(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AudioAttachment[i];
        }
    }

    public AudioAttachment(MusicTrack musicTrack) {
        this.f = musicTrack;
    }

    @Override // com.vk.dto.common.Attachment
    public final int Ab() {
        return 2;
    }

    @Override // com.vk.dto.common.Attachment
    public final int Bb() {
        return dd80.l;
    }

    public final void Db(String str, @Nullable PostInteract postInteract) {
        this.h = str;
        this.i = postInteract;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(@NonNull Serializer serializer) {
        serializer.i0(this.f);
    }

    @Override // xsna.tec0
    public final JSONObject Q3() {
        JSONObject e = xus.e(this);
        try {
            e.put("track", this.f.e5());
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f, ((AudioAttachment) obj).f);
    }

    public final int hashCode() {
        MusicTrack musicTrack = this.f;
        if (musicTrack != null) {
            return musicTrack.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "audio" + this.f.Ib();
    }

    @Override // com.vk.dto.common.Attachment
    public final int zb() {
        return R.string.audio;
    }

    public AudioAttachment(Serializer serializer) {
        this.f = (MusicTrack) serializer.G(MusicTrack.class.getClassLoader());
    }
}
