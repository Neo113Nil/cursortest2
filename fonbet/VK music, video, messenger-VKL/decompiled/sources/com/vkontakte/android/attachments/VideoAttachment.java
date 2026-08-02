package com.vkontakte.android.attachments;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.VideoUrlStorage;
import com.vk.dto.common.c;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.models.autoplay.ad_pixels.AutoPlayAdPixelsTrackerType;
import com.vk.log.L;
import com.vk.metrics.eventtracking.Event;
import com.vk.metrics.eventtracking.VkMainTracker;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vkontakte.android.R;
import com.vkontakte.android.data.ParseFrom;
import com.vkontakte.android.data.PostInteract;
import java.util.Objects;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.aj90;
import xsna.bpn0;
import xsna.dy2;
import xsna.el3;
import xsna.eso0;
import xsna.g620;
import xsna.gmq;
import xsna.ixj0;
import xsna.s3q0;
import xsna.sr10;
import xsna.tec0;
import xsna.tfw;
import xsna.u0m;
import xsna.xus;
import xsna.yg5;

/* loaded from: classes7.dex */
public class VideoAttachment extends AttachmentWithMedia implements eso0, tfw, tec0, gmq {
    public static final Serializer.c<VideoAttachment> CREATOR = new a();
    public final boolean f;
    public PostInteract g;
    public ShitAttachment h;
    public yg5 i;
    public boolean j;
    public VideoFile k;
    public String l;
    public String m;

    @Nullable
    public transient Owner n;
    public transient DeprecatedStatisticInterface o;

    public class a extends Serializer.c<VideoAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VideoAttachment a(@NonNull Serializer serializer) {
            return new VideoAttachment(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VideoAttachment[i];
        }
    }

    public VideoAttachment(@NonNull VideoFile videoFile) {
        sr10 sr10Var = dy2.a;
        boolean z = true;
        this.f = sr10Var != null ? sr10Var.h() : true;
        Fb(videoFile);
        this.k = videoFile;
        if (!videoFile.d8() && !videoFile.z0()) {
            z = false;
        }
        this.j = z;
        yg5 yg5Var = null;
        if (z) {
            bpn0 bpn0Var = b.B;
            b a2 = b.C1208b.a();
            VideoFile videoFile2 = this.k;
            a2.getClass();
            yg5Var = a2.e(videoFile2, null);
        }
        this.i = yg5Var;
    }

    public static void Fb(VideoFile videoFile) {
        if (videoFile != null) {
            return;
        }
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        IllegalStateException illegalStateException = new IllegalStateException("VideoFile must not be null\n");
        bVar.getClass();
        VkMainTracker vkMainTracker = com.vk.metrics.eventtracking.b.c;
        if (vkMainTracker != null) {
            vkMainTracker.a(illegalStateException);
        } else {
            com.vk.metrics.eventtracking.b.d.add(new Pair<>(illegalStateException, "VideoFile"));
        }
        throw new IllegalStateException("VideoFile must not be null\n");
    }

    public static VideoAttachment Gb(@NonNull JSONObject jSONObject) {
        return new VideoAttachment(c.b(jSONObject.optJSONObject("video")));
    }

    @Override // com.vk.dto.common.Attachment
    public final int Ab() {
        return 1;
    }

    @Override // com.vk.dto.common.Attachment
    public int Bb() {
        return 1;
    }

    public final boolean C2() {
        return g620.f().c(this.k);
    }

    @Override // com.vk.dto.common.AttachmentWithMedia
    @NonNull
    public final Image Db() {
        return this.k.getImage();
    }

    @Override // com.vk.dto.common.AttachmentWithMedia
    @NonNull
    public final String Eb() {
        return "";
    }

    public final ShitAttachment Hb() {
        return this.h;
    }

    @Nullable
    public final Image Ib() {
        if (this.k.getImage().b.isEmpty() && this.k.e1().b.isEmpty()) {
            return null;
        }
        return (this.b && this.j && this.f && !this.k.e1().b.isEmpty()) ? this.k.e1() : this.k.getImage();
    }

    @NonNull
    public final VideoFile Jb() {
        return this.k;
    }

    public final void Kb(boolean z) {
        yg5 yg5Var = this.i;
        if (yg5Var != null) {
            yg5Var.n0(this.l, this.m, null, z);
            try {
                ((u0m) this.i).j(this.o);
                s3q0 s3q0Var = s3q0.a;
            } catch (ClassCastException e) {
                com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                el3 el3Var = Event.b;
                Event.a aVar = new Event.a();
                aVar.g("deprecated_statistic_cast_exception");
                aVar.i("FirebaseTracker");
                bVar.k(aVar.e());
                bVar.a(e);
            }
        }
    }

    public final void Lb(String str, @Nullable PostInteract postInteract, @Nullable String str2) {
        this.l = str;
        this.m = str2;
        if (this.g != null || postInteract == null) {
            return;
        }
        this.k.n8(!TextUtils.isEmpty(postInteract.g));
        if (this.k.p0()) {
            return;
        }
        this.g = postInteract;
    }

    public final void Mb(ShitAttachment shitAttachment) {
        this.h = shitAttachment;
        bpn0 bpn0Var = b.B;
        b a2 = b.C1208b.a();
        VideoFile videoFile = this.k;
        a2.getClass();
        this.i = a2.e(videoFile, null);
    }

    public final void Nb(DeprecatedStatisticInterface deprecatedStatisticInterface) {
        this.o = deprecatedStatisticInterface;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public void O7(@NonNull Serializer serializer) {
        serializer.i0(this.k);
        serializer.j0(this.l);
        serializer.i0(this.g);
    }

    public final void Ob(VideoFile videoFile) {
        yg5 yg5Var;
        Fb(videoFile);
        this.k = videoFile;
        if (videoFile.T3()) {
            bpn0 bpn0Var = b.B;
            b a2 = b.C1208b.a();
            a2.getClass();
            yg5Var = a2.e(videoFile, null);
        } else {
            yg5Var = null;
        }
        this.i = yg5Var;
        if (yg5Var != null) {
            yg5Var.n0(this.l, this.m, null, false);
            try {
                ((u0m) this.i).j(this.o);
                s3q0 s3q0Var = s3q0.a;
            } catch (ClassCastException e) {
                com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                el3 el3Var = Event.b;
                Event.a aVar = new Event.a();
                aVar.g("deprecated_statistic_cast_exception");
                aVar.i("FirebaseTracker");
                bVar.k(aVar.e());
                bVar.a(e);
            }
        }
    }

    @NonNull
    public JSONObject Q3() {
        JSONObject e = xus.e(this);
        try {
            e.put("video", this.k.e5());
            return e;
        } catch (JSONException e2) {
            L.i(e2);
            return e;
        }
    }

    public final boolean Q5() {
        return this.j;
    }

    @Override // xsna.gmq
    public final boolean X() {
        return this.k.X();
    }

    public boolean equals(Object obj) {
        if (obj instanceof VideoAttachment) {
            VideoAttachment videoAttachment = (VideoAttachment) obj;
            VideoFile videoFile = this.k;
            if (videoFile != null && videoAttachment.k != null && videoFile.r1().equals(videoAttachment.k.r1())) {
                VideoUrlStorage w9 = this.k.w9();
                VideoUrl videoUrl = VideoUrl.EXTERNAL_URL;
                String Ab = w9.Ab(videoUrl);
                String Ab2 = videoAttachment.k.w9().Ab(videoUrl);
                boolean z = Ab == null && Ab2 == null;
                boolean z2 = Ab != null && Ab.equals(Ab2);
                if (z || z2) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // xsna.ptx0
    public final void f1(@Nullable Owner owner) {
        this.n = owner;
    }

    public int getHeight() {
        return 3600;
    }

    @Override // xsna.btx0
    @NonNull
    public final Number getId() {
        return Integer.valueOf(this.k.o0());
    }

    public int getWidth() {
        return 6400;
    }

    @Override // xsna.tfw
    public final String h9() {
        ImageSize imageSize;
        Image Ib = Ib();
        if (Ib == null || (imageSize = (ImageSize) ixj0.m(Ib.b)) == null) {
            return null;
        }
        return imageSize.d.d;
    }

    public final int hashCode() {
        VideoFile videoFile = this.k;
        if (videoFile != null) {
            return Objects.hash(videoFile.w9().Ab(VideoUrl.EXTERNAL_URL), this.k.r1());
        }
        return 0;
    }

    @Override // xsna.ptx0
    public final UserId q() {
        return this.k.I0();
    }

    @Override // xsna.ptx0
    @Nullable
    public final Owner s() {
        if (this.n == null) {
            if (this.k == null) {
                return null;
            }
            this.n = new Owner(this.k.I0(), this.k.P(), null, this.k.M0(), this.k.Y());
        }
        return this.n;
    }

    @Override // xsna.gmq
    public final void s0(boolean z) {
        this.k.s0(z);
    }

    public final String toString() {
        return this.k.toString();
    }

    @Override // com.vk.dto.common.Attachment
    @NonNull
    public final int zb() {
        return R.string.video;
    }

    public VideoAttachment(@NonNull VideoFile videoFile, @Nullable ParseFrom parseFrom) {
        AutoPlayAdPixelsTrackerType autoPlayAdPixelsTrackerType;
        yg5 yg5Var;
        sr10 sr10Var = dy2.a;
        this.f = sr10Var != null ? sr10Var.h() : true;
        Fb(videoFile);
        this.k = videoFile;
        this.j = videoFile.d8() || videoFile.z0();
        int i = parseFrom == null ? -1 : aj90.$EnumSwitchMapping$0[parseFrom.ordinal()];
        if (i == 1) {
            autoPlayAdPixelsTrackerType = AutoPlayAdPixelsTrackerType.NEWSFEED;
        } else if (i != 2) {
            autoPlayAdPixelsTrackerType = AutoPlayAdPixelsTrackerType.NONE;
        } else {
            autoPlayAdPixelsTrackerType = AutoPlayAdPixelsTrackerType.CLIPS;
        }
        if (this.j) {
            bpn0 bpn0Var = b.B;
            yg5Var = b.C1208b.a().e(this.k, autoPlayAdPixelsTrackerType);
        } else {
            yg5Var = null;
        }
        this.i = yg5Var;
    }

    public VideoAttachment(@NonNull Serializer serializer) {
        sr10 sr10Var = dy2.a;
        boolean z = true;
        this.f = sr10Var != null ? sr10Var.h() : true;
        this.k = (VideoFile) serializer.G(VideoFile.class.getClassLoader());
        this.l = serializer.H();
        this.g = (PostInteract) serializer.G(PostInteract.class.getClassLoader());
        VideoFile videoFile = this.k;
        if (videoFile == null || (!videoFile.d8() && !videoFile.z0())) {
            z = false;
        }
        this.j = z;
        yg5 yg5Var = null;
        if (z) {
            bpn0 bpn0Var = b.B;
            b a2 = b.C1208b.a();
            VideoFile videoFile2 = this.k;
            a2.getClass();
            yg5Var = a2.e(videoFile2, null);
        }
        this.i = yg5Var;
    }
}
