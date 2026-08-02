package com.vkontakte.android.attachments;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.api.base.Document;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.common.Image;
import com.vk.dto.common.Image$ConvertToImage$Type;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.VideoUrlStorage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.libvideo.autoplay.b;
import com.vk.log.L;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.a0a;
import xsna.bpn0;
import xsna.dd80;
import xsna.go9;
import xsna.h5s;
import xsna.myc0;
import xsna.tec0;
import xsna.tfw;
import xsna.xus;
import xsna.yg5;

/* loaded from: classes7.dex */
public class DocumentAttachment extends AttachmentWithMedia implements tfw, tec0 {
    public static final Serializer.c<DocumentAttachment> CREATOR = new a();
    public final String f;
    public String g;
    public String h;
    public final String i;
    public final String j;
    public int k;
    public int l;
    public int m;
    public final long n;
    public final UserId o;
    public final int p;

    @Nullable
    public final String q;

    @Nullable
    public final VideoFileOld r;

    @Nullable
    public final Image s;

    @Nullable
    public final yg5 t;

    @Nullable
    public transient Owner u;

    public class a extends Serializer.c<DocumentAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DocumentAttachment a(@NonNull Serializer serializer) {
            return new DocumentAttachment(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DocumentAttachment[i];
        }
    }

    public DocumentAttachment(String str, String str2, long j, String str3, UserId userId, int i, String str4, @Nullable String str5, int i2, int i3, @Nullable String str6) {
        this(str, str2, j, str3, userId, i, str4, str5, i2, i3, str6, null);
    }

    @Override // com.vk.dto.common.Attachment
    public final int Ab() {
        return 3;
    }

    @Override // com.vk.dto.common.Attachment
    public final int Bb() {
        return Ib() ? dd80.f : dd80.m;
    }

    @Override // com.vk.dto.common.AttachmentWithMedia
    @NonNull
    public final Image Db() {
        if (Ib()) {
            return Gb();
        }
        throw new IllegalStateException();
    }

    @Override // com.vk.dto.common.AttachmentWithMedia
    @NonNull
    public final String Eb() {
        return "https://" + a0a.d + "/doc" + this.o + BundleUtil.UNDERLINE_TAG + Integer.valueOf(this.k);
    }

    public final Image$ConvertToImage$Type Fb() {
        return "gif".equalsIgnoreCase(this.i) ? Image$ConvertToImage$Type.gif : Image$ConvertToImage$Type.image;
    }

    @Nullable
    public final Image Gb() {
        Image image = this.s;
        if (image != null) {
            return image;
        }
        if (!Ib()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ImageSize(this.h, this.l, this.m));
        return new Image(arrayList);
    }

    @Nullable
    public final yg5 Hb() {
        return this.t;
    }

    public final boolean Ib() {
        return (this.s == null && TextUtils.isEmpty(this.h)) ? false : true;
    }

    public final Document Jb() {
        Document document = new Document();
        document.l = this.f;
        document.k = this.g;
        document.g = this.n;
        document.h = this.o;
        document.b = this.k;
        document.n = this.h;
        document.m = this.i;
        document.s = this.q;
        document.d = this.l;
        document.e = this.m;
        document.o = this.j;
        document.i = this.p;
        document.t = this.s;
        return document;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public void O7(Serializer serializer) {
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.Y(this.n);
        serializer.j0(this.h);
        serializer.e0(this.o);
        serializer.S(this.k);
        serializer.j0(this.i);
        serializer.j0(this.q);
        serializer.S(this.l);
        serializer.S(this.m);
        serializer.j0(this.j);
        serializer.i0(this.s);
        serializer.S(this.p);
    }

    @Override // xsna.tec0
    @NonNull
    public final JSONObject Q3() {
        JSONObject e = xus.e(this);
        try {
            e.put("doc", Jb().e5());
            return e;
        } catch (JSONException e2) {
            L.i(e2);
            return e;
        }
    }

    public final boolean V0() {
        return (TextUtils.isEmpty(this.h) || TextUtils.isEmpty(this.q)) ? false : true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DocumentAttachment documentAttachment = (DocumentAttachment) obj;
            if (this.k == documentAttachment.k && Objects.equals(this.o, documentAttachment.o)) {
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
        return Integer.valueOf(this.k);
    }

    @Override // xsna.tfw
    public final String h9() {
        return this.h;
    }

    public int hashCode() {
        return Long.hashCode(this.o.b) + (this.k * 31);
    }

    @Override // xsna.ptx0
    public final UserId q() {
        return this.o;
    }

    @Override // xsna.ptx0
    @Nullable
    public final Owner s() {
        return this.u;
    }

    public final String toString() {
        String str = this.j;
        String b = str != null ? go9.b(BundleUtil.UNDERLINE_TAG, str) : "";
        StringBuilder sb = new StringBuilder("doc");
        sb.append(this.o);
        sb.append(BundleUtil.UNDERLINE_TAG);
        return h5s.c(this.k, b, sb);
    }

    public final boolean x5() {
        return Fb() == Image$ConvertToImage$Type.gif;
    }

    @Override // com.vk.dto.common.Attachment
    public int zb() {
        return R.string.doc;
    }

    public DocumentAttachment(String str, String str2, long j, String str3, UserId userId, int i, String str4, @Nullable String str5, int i2, int i3, @Nullable String str6, @Nullable Image image) {
        UserId.b bVar = UserId.c;
        this.f = str;
        this.g = str2;
        this.n = j;
        this.h = str3;
        this.o = userId;
        this.k = i;
        this.i = str4;
        this.q = str5;
        this.l = i2;
        this.m = i3;
        this.j = str6;
        this.s = image;
        if (!"gif".equalsIgnoreCase(str4)) {
            this.t = null;
            return;
        }
        VideoFileOld videoFileOld = new VideoFileOld();
        HashMap hashMap = new HashMap();
        VideoUrl videoUrl = VideoUrl.EXTERNAL_URL;
        if (str5 != null) {
            String str7 = myc0.f(str5) ? str5 : null;
            if (str7 != null) {
                VideoUrlStorage.b bVar2 = VideoUrlStorage.c;
                VideoUrlStorage.d.b(hashMap, videoUrl, str7);
            }
        }
        VideoUrl videoUrl2 = VideoUrl.URL_240;
        if (str5 != null) {
            str5 = myc0.f(str5) ? str5 : null;
            if (str5 != null) {
                VideoUrlStorage.b bVar3 = VideoUrlStorage.c;
                VideoUrlStorage.d.b(hashMap, videoUrl2, str5);
            }
        }
        videoFileOld.f = new VideoUrlStorage(hashMap);
        videoFileOld.j0 = true;
        videoFileOld.b = userId;
        videoFileOld.c = this.k;
        videoFileOld.q = (int) (System.currentTimeMillis() / 1000);
        videoFileOld.l = str;
        videoFileOld.m0 = this.l;
        videoFileOld.n0 = this.m;
        videoFileOld.e = Integer.MAX_VALUE;
        videoFileOld.A0 = SystemClock.elapsedRealtime();
        videoFileOld.z = true;
        this.r = videoFileOld;
        bpn0 bpn0Var = b.B;
        b a2 = b.C1208b.a();
        a2.getClass();
        this.t = a2.e(videoFileOld, null);
    }

    public DocumentAttachment(Document document) {
        this(document.l, document.k, document.g, document.n, document.h, document.b, document.m, document.s, document.d, document.e, document.o, document.t);
    }

    public DocumentAttachment(Serializer serializer) {
        this(serializer.H(), serializer.H(), serializer.w(), serializer.H(), (UserId) serializer.A(UserId.class.getClassLoader()), serializer.u(), serializer.H(), serializer.H(), serializer.u(), serializer.u(), serializer.H(), (Image) serializer.G(Image.class.getClassLoader()));
        this.p = serializer.u();
    }
}
